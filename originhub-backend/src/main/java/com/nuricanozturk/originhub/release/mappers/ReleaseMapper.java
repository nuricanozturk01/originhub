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
package com.nuricanozturk.originhub.release.mappers;

import com.nuricanozturk.originhub.release.dtos.ReleaseForm;
import com.nuricanozturk.originhub.release.dtos.ReleaseInfo;
import com.nuricanozturk.originhub.release.entities.Release;
import com.nuricanozturk.originhub.shared.commit.dtos.AuthorInfo;
import com.nuricanozturk.originhub.shared.repo.entities.Repo;
import com.nuricanozturk.originhub.shared.tenant.entities.Tenant;
import java.time.Instant;
import org.jspecify.annotations.NonNull;
import org.mapstruct.BeanMapping;
import org.mapstruct.Builder;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface ReleaseMapper {

  @BeanMapping(builder = @Builder())
  @Mapping(target = "author", source = "authorInfo")
  @Mapping(target = "isPrerelease", source = "release.prerelease")
  @Mapping(target = "isDraft", source = "release.draft")
  @NonNull ReleaseInfo toInfo(@NonNull Release release, @NonNull AuthorInfo authorInfo);

  default @NonNull Release buildRelease(
      final @NonNull ReleaseForm form,
      final @NonNull Repo repo,
      final @NonNull Tenant author) {

    final var release = new Release();
    release.setRepo(repo);
    release.setTagName(form.getTagName());
    release.setTitle(form.getTitle());
    release.setDescription(form.getDescription());
    release.setPrerelease(form.isPrerelease());
    release.setDraft(form.isDraft());
    release.setAuthor(author);
    if (!form.isDraft()) {
      release.setPublishedAt(Instant.now());
    }
    return release;
  }
}
