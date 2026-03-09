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

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import com.nuricanozturk.originhub.shared.errorhandling.exceptions.ItemNotFoundException;
import com.nuricanozturk.originhub.shared.repo.entities.Repo;
import com.nuricanozturk.originhub.shared.repo.repositories.RepoRepository;
import com.nuricanozturk.originhub.shared.tenant.entities.Tenant;
import com.nuricanozturk.originhub.shared.tenant.repositories.TenantRepository;
import com.nuricanozturk.originhub.tag.entities.Tag;
import com.nuricanozturk.originhub.tag.repositories.TagRepository;
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
@DisplayName("TagTxService unit tests")
class TagServiceTest {

  @Mock private TagRepository tagRepository;
  @Mock private RepoRepository repoRepository;
  @Mock private TenantRepository tenantRepository;

  @InjectMocks private TagTxService tagTxService;

  @Test
  @DisplayName("getAll returns paged TagInfo when tags exist")
  void getAll_returnsPagedResult_whenTagsExist() {
    final Repo repo = createRepo();
    final Tenant tagger = createTenant();
    final Tag tag = createTag(repo, tagger);

    when(this.repoRepository.findByOwnerUsernameAndName("alice", "my-repo"))
        .thenReturn(Optional.of(repo));
    when(this.tagRepository.findAllByRepoId(any(UUID.class), any()))
        .thenReturn(new PageImpl<>(List.of(tag), PageRequest.of(0, 20), 1));

    final var result = this.tagTxService.getAll("alice", "my-repo", 0, 20);

    assertThat(result.items()).hasSize(1);
    assertThat(result.items().get(0).name()).isEqualTo("v1.0.0");
    assertThat(result.items().get(0).shortSha()).isEqualTo("abc1234");
    assertThat(result.totalItems()).isEqualTo(1L);
  }

  @Test
  @DisplayName("getAll returns empty paged result when no tags exist")
  void getAll_returnsEmptyPagedResult_whenNoTags() {
    final Repo repo = createRepo();

    when(this.repoRepository.findByOwnerUsernameAndName("alice", "my-repo"))
        .thenReturn(Optional.of(repo));
    when(this.tagRepository.findAllByRepoId(any(UUID.class), any()))
        .thenReturn(new PageImpl<>(List.of(), PageRequest.of(0, 20), 0));

    final var result = this.tagTxService.getAll("alice", "my-repo", 0, 20);

    assertThat(result.items()).isEmpty();
    assertThat(result.totalItems()).isZero();
  }

  @Test
  @DisplayName("findRepoByOwnerAndRepoName throws ItemNotFoundException when repo not found")
  void findRepo_throwsItemNotFoundException_whenNotFound() {
    when(this.repoRepository.findByOwnerUsernameAndName("alice", "missing"))
        .thenReturn(Optional.empty());

    assertThatThrownBy(() -> this.tagTxService.findRepoByOwnerAndRepoName("alice", "missing"))
        .isInstanceOf(ItemNotFoundException.class)
        .hasMessageContaining("repoNotFound");
  }

  @Test
  @DisplayName("findTagByRepoIdAndName throws ItemNotFoundException when tag not found")
  void findTagByRepoIdAndName_throwsItemNotFoundException_whenNotFound() {
    final UUID repoId = UUID.randomUUID();

    when(this.tagRepository.findByRepoIdAndName(repoId, "v1.0.0"))
        .thenReturn(Optional.empty());

    assertThatThrownBy(() -> this.tagTxService.findTagByRepoIdAndName(repoId, "v1.0.0"))
        .isInstanceOf(ItemNotFoundException.class)
        .hasMessageContaining("tagNotFound");
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

  private static Tag createTag(final Repo repo, final Tenant tagger) {
    final Tag tag = new Tag();
    tag.setId(UUID.randomUUID());
    tag.setRepo(repo);
    tag.setName("v1.0.0");
    tag.setSha("abc1234567890abc1234567890abc1234567890ab");
    tag.setMessage("Release v1.0.0");
    tag.setTagger(tagger);
    tag.setCreatedAt(Instant.now());
    return tag;
  }
}
