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

import com.nuricanozturk.originhub.shared.commit.dtos.PagedResult;
import com.nuricanozturk.originhub.shared.errorhandling.exceptions.ErrorOccurredException;
import com.nuricanozturk.originhub.shared.errorhandling.exceptions.ItemAlreadyExistsException;
import com.nuricanozturk.originhub.shared.errorhandling.exceptions.ItemNotFoundException;
import com.nuricanozturk.originhub.shared.git.provider.GitProvider;
import com.nuricanozturk.originhub.shared.tenant.entities.Tenant;
import com.nuricanozturk.originhub.tag.dtos.TagForm;
import com.nuricanozturk.originhub.tag.dtos.TagInfo;
import com.nuricanozturk.originhub.tag.entities.Tag;
import java.io.IOException;
import java.util.Objects;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.eclipse.jgit.lib.Constants;
import org.eclipse.jgit.lib.PersonIdent;
import org.eclipse.jgit.lib.RefUpdate;
import org.eclipse.jgit.lib.TagBuilder;
import org.eclipse.jgit.revwalk.RevCommit;
import org.eclipse.jgit.revwalk.RevWalk;
import org.jspecify.annotations.NonNull;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class TagNonTxService {

  private final @NonNull TagTxService tagTxService;
  private final @NonNull GitProvider gitProvider;

  public @NonNull PagedResult<TagInfo> getAll(
      final @NonNull String owner, final @NonNull String repoName, final int page, final int size) {

    return this.tagTxService.getAll(owner, repoName, page, size);
  }

  public @NonNull TagInfo create(
      final @NonNull String owner,
      final @NonNull String repoName,
      final @NonNull UUID taggerId,
      final @NonNull TagForm form)
      throws IOException {

    final var repo = this.tagTxService.findRepoByOwnerAndRepoName(owner, repoName);

    if (this.tagTxService.existsByRepoIdAndName(repo.getId(), form.getName())) {
      throw new ItemAlreadyExistsException("tagAlreadyExists: " + form.getName());
    }

    final var tagger = this.tagTxService.findTenantById(taggerId);

    this.insertGitTag(owner, repoName, tagger, form);

    final var tag = new Tag();
    tag.setRepo(repo);
    tag.setName(form.getName());
    tag.setSha(form.getSha());
    tag.setMessage(form.getMessage());
    tag.setTagger(tagger);

    return this.tagTxService.toTagInfo(this.tagTxService.saveTag(tag));
  }

  public void delete(
      final @NonNull String owner,
      final @NonNull String repoName,
      final @NonNull String tagName)
      throws IOException {

    final var repo = this.tagTxService.findRepoByOwnerAndRepoName(owner, repoName);
    final var tag = this.tagTxService.findTagByRepoIdAndName(repo.getId(), tagName);

    this.deleteGitTag(owner, repoName, tagName);

    this.tagTxService.deleteTag(tag);
  }

  private void insertGitTag(
      final @NonNull String owner,
      final @NonNull String repoName,
      final @NonNull Tenant tagger,
      final @NonNull TagForm form)
      throws IOException {

    try (final var gitRepo = this.gitProvider.open(owner, repoName);
        final var revWalk = new RevWalk(gitRepo);
        final var inserter = gitRepo.newObjectInserter()) {

      final var objectId = gitRepo.resolve(form.getSha());

      if (objectId == null) {
        throw new ItemNotFoundException("commitNotFound: " + form.getSha());
      }

      final var commit = revWalk.parseCommit(objectId);
      final var displayName =
          Objects.requireNonNullElse(tagger.getDisplayName(), tagger.getUsername());
      final var personIdent = new PersonIdent(displayName, tagger.getEmail());
      final var tagBuilder = this.buildTagObject(form, commit, personIdent);

      final var tagId = inserter.insert(tagBuilder);
      inserter.flush();

      final var refUpdate = gitRepo.updateRef(Constants.R_TAGS + form.getName());
      refUpdate.setNewObjectId(tagId);
      this.checkTagCreateResult(refUpdate.update());
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
      this.checkTagDeleteResult(refUpdate.delete());
    }
  }

  private @NonNull TagBuilder buildTagObject(
      final @NonNull TagForm form,
      final @NonNull RevCommit commit,
      final @NonNull PersonIdent personIdent) {

    final var tagBuilder = new TagBuilder();
    tagBuilder.setTag(form.getName());
    tagBuilder.setObjectId(commit);
    tagBuilder.setTagger(personIdent);
    tagBuilder.setMessage(Objects.requireNonNullElse(form.getMessage(), ""));
    return tagBuilder;
  }

  private void checkTagCreateResult(final RefUpdate.Result result) {

    if (result != RefUpdate.Result.NEW) {
      throw new ErrorOccurredException("Failed to create tag: " + result);
    }
  }

  private void checkTagDeleteResult(final RefUpdate.Result result) {

    if (result == RefUpdate.Result.LOCK_FAILURE) {
      throw new ErrorOccurredException("Tag ref is locked, please retry: " + result);
    }
    if (result != RefUpdate.Result.FORCED) {
      throw new ErrorOccurredException("Failed to delete tag: " + result);
    }
  }
}
