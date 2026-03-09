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

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.nuricanozturk.originhub.release.dtos.ReleaseForm;
import com.nuricanozturk.originhub.release.dtos.ReleaseInfo;
import com.nuricanozturk.originhub.release.entities.Release;
import com.nuricanozturk.originhub.release.mappers.ReleaseMapper;
import com.nuricanozturk.originhub.release.repositories.ReleaseRepository;
import com.nuricanozturk.originhub.shared.commit.dtos.AuthorInfo;
import com.nuricanozturk.originhub.shared.errorhandling.exceptions.ItemNotFoundException;
import com.nuricanozturk.originhub.shared.repo.entities.Repo;
import com.nuricanozturk.originhub.shared.repo.repositories.RepoRepository;
import com.nuricanozturk.originhub.shared.tenant.entities.Tenant;
import com.nuricanozturk.originhub.shared.tenant.repositories.TenantRepository;
import java.time.Instant;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
@DisplayName("ReleaseService unit tests")
class ReleaseServiceTest {

  @Mock private ReleaseRepository releaseRepository;
  @Mock private RepoRepository repoRepository;
  @Mock private TenantRepository tenantRepository;
  @Mock private ReleaseMapper releaseMapper;

  @InjectMocks private ReleaseService releaseService;

  @Test
  @DisplayName("getAll returns list of ReleaseInfo")
  void getAll_returnsReleaseInfoList() {
    Repo repo = createRepo();
    Tenant author = createTenant();
    Release release = createRelease(repo, author);
    ReleaseInfo releaseInfo = createReleaseInfo(release);

    when(repoRepository.findByOwnerUsernameAndName("alice", "my-repo"))
        .thenReturn(Optional.of(repo));
    when(releaseRepository.findAllByRepoIdOrderByCreatedAtDesc(repo.getId()))
        .thenReturn(List.of(release));
    when(releaseMapper.toInfo(any(), any())).thenReturn(releaseInfo);

    var result = releaseService.getAll("alice", "my-repo");

    assertThat(result).hasSize(1);
    assertThat(result.get(0).tagName()).isEqualTo("v1.0.0");
    assertThat(result.get(0).title()).isEqualTo("Release v1.0.0");
  }

  @Test
  @DisplayName("get throws ItemNotFoundException when release not found")
  void get_throwsItemNotFoundException_whenNotFound() {
    Repo repo = createRepo();
    UUID releaseId = UUID.randomUUID();

    when(repoRepository.findByOwnerUsernameAndName("alice", "my-repo"))
        .thenReturn(Optional.of(repo));
    when(releaseRepository.findByRepoIdAndId(repo.getId(), releaseId))
        .thenReturn(Optional.empty());

    assertThatThrownBy(() -> releaseService.get("alice", "my-repo", releaseId))
        .isInstanceOf(ItemNotFoundException.class)
        .hasMessageContaining("releaseNotFound");
  }

  @Test
  @DisplayName("create saves release and returns ReleaseInfo when valid")
  void create_savesRelease_whenValid() {
    Repo repo = createRepo();
    Tenant author = createTenant();
    UUID authorId = author.getId();
    ReleaseForm form = new ReleaseForm("v1.0.0", "Release v1.0.0", null, false, false);
    Release release = createRelease(repo, author);
    ReleaseInfo releaseInfo = createReleaseInfo(release);

    when(repoRepository.findByOwnerUsernameAndName("alice", "my-repo"))
        .thenReturn(Optional.of(repo));
    when(releaseRepository.existsByRepoIdAndTagName(repo.getId(), "v1.0.0")).thenReturn(false);
    when(tenantRepository.findById(authorId)).thenReturn(Optional.of(author));
    when(releaseMapper.buildRelease(any(), any(), any())).thenReturn(release);
    when(releaseRepository.save(release)).thenReturn(release);
    when(releaseMapper.toInfo(any(), any())).thenReturn(releaseInfo);

    var result = releaseService.create("alice", "my-repo", authorId, form);

    assertThat(result).isNotNull();
    assertThat(result.tagName()).isEqualTo("v1.0.0");
    verify(releaseRepository).save(release);
  }

  @Test
  @DisplayName("delete deletes release when found")
  void delete_deletesRelease_whenFound() {
    Repo repo = createRepo();
    Tenant author = createTenant();
    Release release = createRelease(repo, author);
    UUID releaseId = release.getId();

    when(repoRepository.findByOwnerUsernameAndName("alice", "my-repo"))
        .thenReturn(Optional.of(repo));
    when(releaseRepository.findByRepoIdAndId(repo.getId(), releaseId))
        .thenReturn(Optional.of(release));

    releaseService.delete("alice", "my-repo", releaseId);

    verify(releaseRepository).delete(release);
  }

  @Test
  @DisplayName("delete throws ItemNotFoundException when release not found")
  void delete_throwsItemNotFoundException_whenNotFound() {
    Repo repo = createRepo();
    UUID releaseId = UUID.randomUUID();

    when(repoRepository.findByOwnerUsernameAndName("alice", "my-repo"))
        .thenReturn(Optional.of(repo));
    when(releaseRepository.findByRepoIdAndId(repo.getId(), releaseId))
        .thenReturn(Optional.empty());

    assertThatThrownBy(() -> releaseService.delete("alice", "my-repo", releaseId))
        .isInstanceOf(ItemNotFoundException.class)
        .hasMessageContaining("releaseNotFound");
  }

  private static Repo createRepo() {
    Tenant owner = new Tenant();
    owner.setId(UUID.randomUUID());
    owner.setUsername("alice");
    Repo repo = new Repo();
    repo.setId(UUID.randomUUID());
    repo.setOwner(owner);
    repo.setName("my-repo");
    repo.setDefaultBranch("main");
    return repo;
  }

  private static Tenant createTenant() {
    Tenant tenant = new Tenant();
    tenant.setId(UUID.randomUUID());
    tenant.setUsername("alice");
    tenant.setEmail("alice@example.com");
    tenant.setDisplayName("Alice");
    return tenant;
  }

  private static Release createRelease(Repo repo, Tenant author) {
    Release release = new Release();
    release.setId(UUID.randomUUID());
    release.setRepo(repo);
    release.setTagName("v1.0.0");
    release.setTitle("Release v1.0.0");
    release.setAuthor(author);
    release.setPrerelease(false);
    release.setDraft(false);
    release.setPublishedAt(Instant.now());
    return release;
  }

  private static ReleaseInfo createReleaseInfo(Release release) {
    AuthorInfo authorInfo =
        new AuthorInfo(
            release.getAuthor().getDisplayName(),
            release.getAuthor().getEmail(),
            release.getAuthor().getUsername(),
            release.getAuthor().getAvatarUrl());
    return ReleaseInfo.builder()
        .id(release.getId())
        .tagName(release.getTagName())
        .title(release.getTitle())
        .isPrerelease(release.isPrerelease())
        .isDraft(release.isDraft())
        .author(authorInfo)
        .createdAt(Instant.now())
        .build();
  }
}
