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
package com.nuricanozturk.originhub.tag.services;

import com.nuricanozturk.originhub.shared.commit.dtos.AuthorInfo;
import com.nuricanozturk.originhub.shared.commit.dtos.PagedResult;
import com.nuricanozturk.originhub.shared.errorhandling.exceptions.ItemNotFoundException;
import com.nuricanozturk.originhub.shared.repo.entities.Repo;
import com.nuricanozturk.originhub.shared.repo.repositories.RepoRepository;
import com.nuricanozturk.originhub.shared.tenant.entities.Tenant;
import com.nuricanozturk.originhub.shared.tenant.repositories.TenantRepository;
import com.nuricanozturk.originhub.tag.dtos.TagInfo;
import com.nuricanozturk.originhub.tag.entities.Tag;
import com.nuricanozturk.originhub.tag.repositories.TagRepository;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.jspecify.annotations.NonNull;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional(readOnly = true)
@Service
@RequiredArgsConstructor
class TagTxService {

  private static final int DEFAULT_SHORT_SHA_LENGTH = 7;

  private final @NonNull TagRepository tagRepository;
  private final @NonNull RepoRepository repoRepository;
  private final @NonNull TenantRepository tenantRepository;

  @NonNull Repo findRepoByOwnerAndRepoName(
      final @NonNull String owner, final @NonNull String repoName) {

    return this.repoRepository
        .findByOwnerUsernameAndName(owner, repoName)
        .orElseThrow(() -> new ItemNotFoundException("repoNotFound"));
  }

  @NonNull Tenant findTenantById(final @NonNull UUID id) {

    return this.tenantRepository
        .findById(id)
        .orElseThrow(() -> new ItemNotFoundException("tenantNotFound"));
  }

  @NonNull Tag findTagByRepoIdAndName(
      final @NonNull UUID repoId, final @NonNull String tagName) {

    return this.tagRepository
        .findByRepoIdAndName(repoId, tagName)
        .orElseThrow(() -> new ItemNotFoundException("tagNotFound: " + tagName));
  }

  boolean existsByRepoIdAndName(final @NonNull UUID repoId, final @NonNull String tagName) {

    return this.tagRepository.existsByRepoIdAndName(repoId, tagName);
  }

  @NonNull PagedResult<TagInfo> getAll(
      final @NonNull String owner,
      final @NonNull String repoName,
      final int page,
      final int size) {

    final var repo = this.findRepoByOwnerAndRepoName(owner, repoName);
    final var pageable =
        PageRequest.of(page, size, Sort.by(Sort.Direction.DESC, "createdAt"));
    final var tagPage = this.tagRepository.findAllByRepoId(repo.getId(), pageable);
    final var items = tagPage.getContent().stream().map(this::toTagInfo).toList();
    return new PagedResult<>(
        items,
        page,
        size,
        tagPage.getTotalElements(),
        tagPage.getTotalPages(),
        tagPage.hasNext(),
        tagPage.hasPrevious());
  }

  @Transactional
  @NonNull Tag saveTag(final @NonNull Tag tag) {

    return this.tagRepository.save(tag);
  }

  @Transactional
  void deleteTag(final @NonNull Tag tag) {

    this.tagRepository.delete(tag);
  }

  @NonNull TagInfo toTagInfo(final @NonNull Tag tag) {

    final var tagger = tag.getTagger();
    final var authorInfo =
        new AuthorInfo(
            tagger.getDisplayName(),
            tagger.getEmail(),
            tagger.getUsername(),
            tagger.getAvatarUrl());
    return TagInfo.builder()
        .id(tag.getId())
        .name(tag.getName())
        .sha(tag.getSha())
        .shortSha(tag.getSha().substring(0, DEFAULT_SHORT_SHA_LENGTH))
        .message(tag.getMessage())
        .tagger(authorInfo)
        .createdAt(tag.getCreatedAt())
        .build();
  }
}
