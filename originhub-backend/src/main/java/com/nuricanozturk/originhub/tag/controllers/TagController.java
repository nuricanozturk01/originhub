/*
 * Copyright 2026 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.nuricanozturk.originhub.tag.controllers;

import com.nuricanozturk.originhub.shared.auth.services.JwtUtils;
import com.nuricanozturk.originhub.shared.commit.dtos.PagedResult;
import com.nuricanozturk.originhub.tag.dtos.TagForm;
import com.nuricanozturk.originhub.tag.dtos.TagInfo;
import com.nuricanozturk.originhub.tag.services.TagNonTxService;
import jakarta.validation.Valid;
import java.io.IOException;
import lombok.RequiredArgsConstructor;
import org.jspecify.annotations.NonNull;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/repos/{owner}/{repo}/tags")
@RequiredArgsConstructor
public class TagController {

  private final @NonNull TagNonTxService tagService;
  private final @NonNull JwtUtils tokenService;

  @GetMapping
  public @NonNull ResponseEntity<PagedResult<TagInfo>> getAll(
      @PathVariable final @NonNull String owner,
      @PathVariable final @NonNull String repo,
      @RequestParam(defaultValue = "0") final int page,
      @RequestParam(defaultValue = "20") final int size) {

    final var tags = this.tagService.getAll(owner, repo, page, size);

    return ResponseEntity.ok(tags);
  }

  @PostMapping
  public @NonNull ResponseEntity<TagInfo> create(
      @PathVariable final @NonNull String owner,
      @PathVariable final @NonNull String repo,
      @RequestHeader(HttpHeaders.AUTHORIZATION) final @NonNull String authHeader,
      @Valid @RequestBody final @NonNull TagForm form)
      throws IOException {

    final var taggerId = this.tokenService.extractUserId(authHeader);

    final var created = this.tagService.create(owner, repo, taggerId, form);

    return ResponseEntity.status(HttpStatus.CREATED).body(created);
  }

  @DeleteMapping("/{tagName}")
  public @NonNull ResponseEntity<Void> delete(
      @PathVariable final @NonNull String owner,
      @PathVariable final @NonNull String repo,
      @PathVariable final @NonNull String tagName)
      throws IOException {

    this.tagService.delete(owner, repo, tagName);

    return ResponseEntity.noContent().build();
  }
}
