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
import com.nuricanozturk.originhub.shared.errorhandling.exceptions.ErrorOccurredException;
import com.nuricanozturk.originhub.shared.errorhandling.exceptions.ItemAlreadyExistsException;
import com.nuricanozturk.originhub.shared.errorhandling.exceptions.ItemNotFoundException;
import com.nuricanozturk.originhub.shared.git.provider.GitProvider;
import com.nuricanozturk.originhub.shared.repo.entities.Repo;
import com.nuricanozturk.originhub.shared.repo.repositories.RepoRepository;
import com.nuricanozturk.originhub.shared.tenant.entities.Tenant;
import com.nuricanozturk.originhub.shared.tenant.repositories.TenantRepository;
import com.nuricanozturk.originhub.tag.dtos.TagForm;
import com.nuricanozturk.originhub.tag.dtos.TagInfo;
import com.nuricanozturk.originhub.tag.entities.Tag;
import com.nuricanozturk.originhub.tag.repositories.TagRepository;
import java.io.IOException;
import java.util.List;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.eclipse.jgit.lib.Constants;
import org.eclipse.jgit.lib.PersonIdent;
import org.eclipse.jgit.lib.RefUpdate;
import org.eclipse.jgit.lib.TagBuilder;
import org.eclipse.jgit.revwalk.RevWalk;
import org.jspecify.annotations.NonNull;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Transactional(readOnly = true)
@Service
@RequiredArgsConstructor
public class TagService {

  private static final int DEFAULT_SHORT_SHA_LENGTH = 7;

  private final @NonNull TagRepository tagRepository;
  private final @NonNull RepoRepository repoRepository;
  private final @NonNull TenantRepository tenantRepository;
  private final @NonNull GitProvider gitProvider;

  public @NonNull List<TagInfo> getAll(
      final @NonNull String owner, final @NonNull String repoName) {

    final var repo = this.findRepo(owner, repoName);
    final var tags = this.tagRepository.findAllByRepoIdOrderByCreatedAtDesc(repo.getId());
    return tags.stream().map(this::toTagInfo).toList();
  }

  @Transactional
  public @NonNull TagInfo create(
      final @NonNull String owner,
      final @NonNull String repoName,
      final @NonNull UUID taggerId,
      final @NonNull TagForm form)
      throws IOException {

    final var repo = this.findRepo(owner, repoName);

    if (this.tagRepository.existsByRepoIdAndName(repo.getId(), form.getName())) {
      throw new ItemAlreadyExistsException("tagAlreadyExists: " + form.getName());
    }

    final var tagger = this.findTenant(taggerId);

    this.insertGitTag(owner, repoName, tagger, form);

    final var tag = new Tag();
    tag.setRepo(repo);
    tag.setName(form.getName());
    tag.setSha(form.getSha());
    tag.setMessage(form.getMessage());
    tag.setTagger(tagger);

    return this.toTagInfo(this.tagRepository.save(tag));
  }

  @Transactional
  public void delete(
      final @NonNull String owner,
      final @NonNull String repoName,
      final @NonNull String tagName)
      throws IOException {

    final var repo = this.findRepo(owner, repoName);
    final var tag =
        this.tagRepository
            .findByRepoIdAndName(repo.getId(), tagName)
            .orElseThrow(() -> new ItemNotFoundException("tagNotFound: " + tagName));

    this.deleteGitTag(owner, repoName, tagName);

    this.tagRepository.delete(tag);
  }

  private void insertGitTag(
      final @NonNull String owner,
      final @NonNull String repoName,
      final @NonNull Tenant tagger,
      final @NonNull TagForm form)
      throws IOException {

    try (final var gitRepo = this.gitProvider.open(owner, repoName)) {
      final var objectId = gitRepo.resolve(form.getSha());
      if (objectId == null) {
        throw new ItemNotFoundException("commitNotFound: " + form.getSha());
      }
      try (final var revWalk = new RevWalk(gitRepo)) {
        final var commit = revWalk.parseCommit(objectId);
        final var displayName =
            tagger.getDisplayName() != null ? tagger.getDisplayName() : tagger.getUsername();
        final var personIdent = new PersonIdent(displayName, tagger.getEmail());
        final var tagBuilder = new TagBuilder();
        tagBuilder.setTag(form.getName());
        tagBuilder.setObjectId(commit);
        tagBuilder.setTagger(personIdent);
        tagBuilder.setMessage(form.getMessage() != null ? form.getMessage() : "");
        try (final var inserter = gitRepo.newObjectInserter()) {
          final var tagId = inserter.insert(tagBuilder);
          inserter.flush();
          final var refUpdate = gitRepo.updateRef(Constants.R_TAGS + form.getName());
          refUpdate.setNewObjectId(tagId);
          final var result = refUpdate.update();
          if (result != RefUpdate.Result.NEW) {
            throw new ErrorOccurredException("Failed to create tag: " + result);
          }
        }
      }
    }
  }

  private void deleteGitTag(
      final @NonNull String owner,
      final @NonNull String repoName,
      final @NonNull String tagName)
      throws IOException {

    try (final var gitRepo = this.gitProvider.open(owner, repoName)) {
      final var refUpdate = gitRepo.updateRef(Constants.R_TAGS + tagName);
      refUpdate.setForceUpdate(true);
      final var result = refUpdate.delete();
      if (result != RefUpdate.Result.FORCED) {
        throw new ErrorOccurredException("Failed to delete tag: " + result);
      }
    }
  }

  private @NonNull TagInfo toTagInfo(final @NonNull Tag tag) {
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
}
