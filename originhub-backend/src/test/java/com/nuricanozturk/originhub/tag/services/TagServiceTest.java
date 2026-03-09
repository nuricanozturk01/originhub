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
import static org.mockito.Mockito.when;

import com.nuricanozturk.originhub.shared.errorhandling.exceptions.ItemNotFoundException;
import com.nuricanozturk.originhub.shared.git.provider.GitProvider;
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

@ExtendWith(MockitoExtension.class)
@DisplayName("TagService unit tests")
class TagServiceTest {

  @Mock private TagRepository tagRepository;
  @Mock private RepoRepository repoRepository;
  @Mock private TenantRepository tenantRepository;
  @Mock private GitProvider gitProvider;

  @InjectMocks private TagService tagService;

  @Test
  @DisplayName("getAll returns list of TagInfo when tags exist")
  void getAll_returnsTagInfoList_whenTagsExist() {
    Repo repo = createRepo();
    Tenant tagger = createTenant();
    Tag tag = createTag(repo, tagger);

    when(repoRepository.findByOwnerUsernameAndName("alice", "my-repo"))
        .thenReturn(Optional.of(repo));
    when(tagRepository.findAllByRepoIdOrderByCreatedAtDesc(repo.getId()))
        .thenReturn(List.of(tag));

    var result = tagService.getAll("alice", "my-repo");

    assertThat(result).hasSize(1);
    assertThat(result.get(0).name()).isEqualTo("v1.0.0");
    assertThat(result.get(0).sha()).isEqualTo("abc1234567890abc1234567890abc1234567890ab");
    assertThat(result.get(0).shortSha()).isEqualTo("abc1234");
    assertThat(result.get(0).tagger().username()).isEqualTo("alice");
  }

  @Test
  @DisplayName("getAll returns empty list when no tags exist")
  void getAll_returnsEmptyList_whenNoTags() {
    Repo repo = createRepo();

    when(repoRepository.findByOwnerUsernameAndName("alice", "my-repo"))
        .thenReturn(Optional.of(repo));
    when(tagRepository.findAllByRepoIdOrderByCreatedAtDesc(repo.getId()))
        .thenReturn(List.of());

    var result = tagService.getAll("alice", "my-repo");

    assertThat(result).isEmpty();
  }

  @Test
  @DisplayName("delete throws ItemNotFoundException when tag not found")
  void delete_throwsItemNotFoundException_whenTagNotFound() {
    Repo repo = createRepo();

    when(repoRepository.findByOwnerUsernameAndName("alice", "my-repo"))
        .thenReturn(Optional.of(repo));
    when(tagRepository.findByRepoIdAndName(repo.getId(), "v1.0.0"))
        .thenReturn(Optional.empty());

    assertThatThrownBy(() -> tagService.delete("alice", "my-repo", "v1.0.0"))
        .isInstanceOf(ItemNotFoundException.class)
        .hasMessageContaining("tagNotFound");
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

  private static Tag createTag(Repo repo, Tenant tagger) {
    Tag tag = new Tag();
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
