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
package com.nuricanozturk.originhub.release.services;

import com.nuricanozturk.originhub.release.dtos.ReleaseForm;
import com.nuricanozturk.originhub.release.dtos.ReleaseInfo;
import com.nuricanozturk.originhub.release.dtos.ReleaseUpdateForm;
import com.nuricanozturk.originhub.release.entities.Release;
import com.nuricanozturk.originhub.release.mappers.ReleaseMapper;
import com.nuricanozturk.originhub.release.repositories.ReleaseRepository;
import com.nuricanozturk.originhub.shared.commit.dtos.AuthorInfo;
import com.nuricanozturk.originhub.shared.errorhandling.exceptions.ItemAlreadyExistsException;
import com.nuricanozturk.originhub.shared.errorhandling.exceptions.ItemNotFoundException;
import com.nuricanozturk.originhub.shared.repo.entities.Repo;
import com.nuricanozturk.originhub.shared.repo.repositories.RepoRepository;
import com.nuricanozturk.originhub.shared.tenant.entities.Tenant;
import com.nuricanozturk.originhub.shared.tenant.repositories.TenantRepository;
import java.time.Instant;
import java.util.List;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.jspecify.annotations.NonNull;
import org.jspecify.annotations.Nullable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Transactional(readOnly = true)
@Service
@RequiredArgsConstructor
public class ReleaseService {

  private final @NonNull ReleaseRepository releaseRepository;
  private final @NonNull RepoRepository repoRepository;
  private final @NonNull TenantRepository tenantRepository;
  private final @NonNull ReleaseMapper releaseMapper;

  public @NonNull List<ReleaseInfo> getAll(
      final @NonNull String owner, final @NonNull String repoName) {

    final var repo = this.findRepo(owner, repoName);
    final var releases =
        this.releaseRepository.findAllByRepoIdOrderByCreatedAtDesc(repo.getId());
    return releases.stream()
        .map(r -> this.releaseMapper.toInfo(r, this.toAuthorInfo(r.getAuthor())))
        .toList();
  }

  public @NonNull ReleaseInfo get(
      final @NonNull String owner,
      final @NonNull String repoName,
      final @NonNull UUID releaseId) {

    final var repo = this.findRepo(owner, repoName);
    final var release = this.findRelease(repo.getId(), releaseId);
    return this.releaseMapper.toInfo(release, this.toAuthorInfo(release.getAuthor()));
  }

  @Transactional
  public @NonNull ReleaseInfo create(
      final @NonNull String owner,
      final @NonNull String repoName,
      final @NonNull UUID authorId,
      final @NonNull ReleaseForm form) {

    final var repo = this.findRepo(owner, repoName);

    if (this.releaseRepository.existsByRepoIdAndTagName(repo.getId(), form.getTagName())) {
      throw new ItemAlreadyExistsException("releaseAlreadyExists: " + form.getTagName());
    }

    final var author = this.findTenant(authorId);
    final var release = this.releaseMapper.buildRelease(form, repo, author);
    final var saved = this.releaseRepository.save(release);
    return this.releaseMapper.toInfo(saved, this.toAuthorInfo(author));
  }

  @Transactional
  public @NonNull ReleaseInfo update(
      final @NonNull String owner,
      final @NonNull String repoName,
      final @NonNull UUID releaseId,
      final @NonNull ReleaseUpdateForm form) {

    final var repo = this.findRepo(owner, repoName);
    final var release = this.findRelease(repo.getId(), releaseId);

    this.updateReleaseFields(release, form);
    this.updateDraftStatus(release, form.getIsDraft());

    final var saved = this.releaseRepository.save(release);
    return this.releaseMapper.toInfo(saved, this.toAuthorInfo(saved.getAuthor()));
  }

  @Transactional
  public void delete(
      final @NonNull String owner,
      final @NonNull String repoName,
      final @NonNull UUID releaseId) {

    final var repo = this.findRepo(owner, repoName);
    final var release = this.findRelease(repo.getId(), releaseId);
    this.releaseRepository.delete(release);
  }

  private void updateReleaseFields(
      final @NonNull Release release, final @NonNull ReleaseUpdateForm form) {

    if (form.getTitle() != null) {
      release.setTitle(form.getTitle());
    }
    if (form.getDescription() != null) {
      release.setDescription(form.getDescription());
    }
    if (form.getIsPrerelease() != null) {
      release.setPrerelease(form.getIsPrerelease());
    }
  }

  private void updateDraftStatus(
      final @NonNull Release release, final @Nullable Boolean isDraft) {

    if (isDraft == null) {
      return;
    }
    release.setDraft(isDraft);
    if (!isDraft && release.getPublishedAt() == null) {
      release.setPublishedAt(Instant.now());
    }
  }

  private @NonNull Repo findRepo(
      final @NonNull String owner, final @NonNull String repoName) {

    return this.repoRepository
        .findByOwnerUsernameAndName(owner, repoName)
        .orElseThrow(() -> new ItemNotFoundException("repoNotFound"));
  }

  private @NonNull Tenant findTenant(final @NonNull UUID id) {

    return this.tenantRepository
        .findById(id)
        .orElseThrow(() -> new ItemNotFoundException("tenantNotFound"));
  }

  private @NonNull Release findRelease(
      final @NonNull UUID repoId, final @NonNull UUID releaseId) {

    return this.releaseRepository
        .findByRepoIdAndId(repoId, releaseId)
        .orElseThrow(() -> new ItemNotFoundException("releaseNotFound"));
  }

  private @NonNull AuthorInfo toAuthorInfo(final @NonNull Tenant tenant) {

    return new AuthorInfo(
        tenant.getDisplayName(),
        tenant.getEmail(),
        tenant.getUsername(),
        tenant.getAvatarUrl());
  }
}
