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
package com.nuricanozturk.originhub.release.controllers;

import com.nuricanozturk.originhub.release.dtos.ReleaseForm;
import com.nuricanozturk.originhub.release.dtos.ReleaseInfo;
import com.nuricanozturk.originhub.release.dtos.ReleaseUpdateForm;
import com.nuricanozturk.originhub.release.services.ReleaseService;
import com.nuricanozturk.originhub.shared.auth.services.JwtUtils;
import com.nuricanozturk.originhub.shared.commit.dtos.PagedResult;
import jakarta.validation.Valid;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.jspecify.annotations.NonNull;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/repos/{owner}/{repo}/releases")
@RequiredArgsConstructor
public class ReleaseController {

  private final @NonNull ReleaseService releaseService;
  private final @NonNull JwtUtils tokenService;

  @GetMapping
  public @NonNull ResponseEntity<PagedResult<ReleaseInfo>> getAll(
      @PathVariable final @NonNull String owner,
      @PathVariable final @NonNull String repo,
      @RequestParam(defaultValue = "0") final int page,
      @RequestParam(defaultValue = "20") final int size) {

    final var releases = this.releaseService.getAll(owner, repo, page, size);

    return ResponseEntity.ok(releases);
  }

  @GetMapping("/{releaseId}")
  public @NonNull ResponseEntity<ReleaseInfo> get(
      @PathVariable final @NonNull String owner,
      @PathVariable final @NonNull String repo,
      @PathVariable final @NonNull UUID releaseId) {

    final var release = this.releaseService.get(owner, repo, releaseId);

    return ResponseEntity.ok(release);
  }

  @PostMapping
  public @NonNull ResponseEntity<ReleaseInfo> create(
      @PathVariable final @NonNull String owner,
      @PathVariable final @NonNull String repo,
      @RequestHeader(HttpHeaders.AUTHORIZATION) final @NonNull String authHeader,
      @Valid @RequestBody final @NonNull ReleaseForm form) {

    final var authorId = this.tokenService.extractUserId(authHeader);

    final var created = this.releaseService.create(owner, repo, authorId, form);

    return ResponseEntity.status(HttpStatus.CREATED).body(created);
  }

  @PatchMapping("/{releaseId}")
  public @NonNull ResponseEntity<ReleaseInfo> update(
      @PathVariable final @NonNull String owner,
      @PathVariable final @NonNull String repo,
      @PathVariable final @NonNull UUID releaseId,
      @Valid @RequestBody final @NonNull ReleaseUpdateForm form) {

    final var updated = this.releaseService.update(owner, repo, releaseId, form);

    return ResponseEntity.ok(updated);
  }

  @DeleteMapping("/{releaseId}")
  public @NonNull ResponseEntity<Void> delete(
      @PathVariable final @NonNull String owner,
      @PathVariable final @NonNull String repo,
      @PathVariable final @NonNull UUID releaseId) {

    this.releaseService.delete(owner, repo, releaseId);

    return ResponseEntity.noContent().build();
  }
}
