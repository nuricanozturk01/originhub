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
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

@ExtendWith(MockitoExtension.class)
@DisplayName("ReleaseService unit tests")
class ReleaseServiceTest {

  @Mock private ReleaseRepository releaseRepository;
  @Mock private RepoRepository repoRepository;
  @Mock private TenantRepository tenantRepository;
  @Mock private ReleaseMapper releaseMapper;

  @InjectMocks private ReleaseService releaseService;

  @Test
  @DisplayName("getAll returns paged list of ReleaseInfo")
  void getAll_returnsPagedReleaseInfoList() {
    final Repo repo = createRepo();
    final Tenant author = createTenant();
    final Release release = createRelease(repo, author);
    final ReleaseInfo releaseInfo = createReleaseInfo(release);

    when(this.repoRepository.findByOwnerUsernameAndName("alice", "my-repo"))
        .thenReturn(Optional.of(repo));
    when(this.releaseRepository.findAllByRepoIdOrderByCreatedAtDesc(any(UUID.class), any()))
        .thenReturn(new PageImpl<>(List.of(release), PageRequest.of(0, 20), 1));
    when(this.releaseMapper.toInfo(any(), any())).thenReturn(releaseInfo);

    final var result = this.releaseService.getAll("alice", "my-repo", 0, 20);

    assertThat(result.items()).hasSize(1);
    assertThat(result.items().get(0).tagName()).isEqualTo("v1.0.0");
    assertThat(result.totalItems()).isEqualTo(1L);
  }

  @Test
  @DisplayName("get throws ItemNotFoundException when release not found")
  void get_throwsItemNotFoundException_whenNotFound() {
    final Repo repo = createRepo();
    final UUID releaseId = UUID.randomUUID();

    when(this.repoRepository.findByOwnerUsernameAndName("alice", "my-repo"))
        .thenReturn(Optional.of(repo));
    when(this.releaseRepository.findByRepoIdAndId(repo.getId(), releaseId))
        .thenReturn(Optional.empty());

    assertThatThrownBy(() -> this.releaseService.get("alice", "my-repo", releaseId))
        .isInstanceOf(ItemNotFoundException.class)
        .hasMessageContaining("releaseNotFound");
  }

  @Test
  @DisplayName("create saves release and returns ReleaseInfo when valid")
  void create_savesRelease_whenValid() {
    final Repo repo = createRepo();
    final Tenant author = createTenant();
    final UUID authorId = author.getId();
    final ReleaseForm form = new ReleaseForm("v1.0.0", "Release v1.0.0", null, false, false);
    final Release release = createRelease(repo, author);
    final ReleaseInfo releaseInfo = createReleaseInfo(release);

    when(this.repoRepository.findByOwnerUsernameAndName("alice", "my-repo"))
        .thenReturn(Optional.of(repo));
    when(this.releaseRepository.existsByRepoIdAndTagName(repo.getId(), "v1.0.0"))
        .thenReturn(false);
    when(this.tenantRepository.findById(authorId)).thenReturn(Optional.of(author));
    when(this.releaseMapper.buildRelease(any(), any(), any())).thenReturn(release);
    when(this.releaseRepository.save(release)).thenReturn(release);
    when(this.releaseMapper.toInfo(any(), any())).thenReturn(releaseInfo);

    final var result = this.releaseService.create("alice", "my-repo", authorId, form);

    assertThat(result).isNotNull();
    assertThat(result.tagName()).isEqualTo("v1.0.0");
    verify(this.releaseRepository).save(release);
  }

  @Test
  @DisplayName("delete deletes release when found")
  void delete_deletesRelease_whenFound() {
    final Repo repo = createRepo();
    final Tenant author = createTenant();
    final Release release = createRelease(repo, author);
    final UUID releaseId = release.getId();

    when(this.repoRepository.findByOwnerUsernameAndName("alice", "my-repo"))
        .thenReturn(Optional.of(repo));
    when(this.releaseRepository.findByRepoIdAndId(repo.getId(), releaseId))
        .thenReturn(Optional.of(release));

    this.releaseService.delete("alice", "my-repo", releaseId);

    verify(this.releaseRepository).delete(release);
  }

  @Test
  @DisplayName("delete throws ItemNotFoundException when release not found")
  void delete_throwsItemNotFoundException_whenNotFound() {
    final Repo repo = createRepo();
    final UUID releaseId = UUID.randomUUID();

    when(this.repoRepository.findByOwnerUsernameAndName("alice", "my-repo"))
        .thenReturn(Optional.of(repo));
    when(this.releaseRepository.findByRepoIdAndId(repo.getId(), releaseId))
        .thenReturn(Optional.empty());

    assertThatThrownBy(() -> this.releaseService.delete("alice", "my-repo", releaseId))
        .isInstanceOf(ItemNotFoundException.class)
        .hasMessageContaining("releaseNotFound");
  }

  private static Repo createRepo() {
    final Tenant owner = new Tenant();
    owner.setId(UUID.randomUUID());
    owner.setUsername("alice");
    final Repo repo = new Repo();
    repo.setId(UUID.randomUUID());
    repo.setOwner(owner);
    repo.setName("my-repo");
    repo.setDefaultBranch("main");
    return repo;
  }

  private static Tenant createTenant() {
    final Tenant tenant = new Tenant();
    tenant.setId(UUID.randomUUID());
    tenant.setUsername("alice");
    tenant.setEmail("alice@example.com");
    tenant.setDisplayName("Alice");
    return tenant;
  }

  private static Release createRelease(final Repo repo, final Tenant author) {
    final Release release = new Release();
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

  private static ReleaseInfo createReleaseInfo(final Release release) {
    final AuthorInfo authorInfo =
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
