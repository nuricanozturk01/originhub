///
/// Copyright 2026 the original author or authors.
///
/// Licensed under the Apache License, Version 2.0 (the "License");
/// you may not use this file except in compliance with the License.
/// You may obtain a copy of the License at
///
///      https://www.apache.org/licenses/LICENSE-2.0
///
/// Unless required by applicable law or agreed to in writing, software
/// distributed under the License is distributed on an "AS IS" BASIS,
/// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
/// See the License for the specific language governing permissions and
/// limitations under the License.
///

import { Injectable, inject } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { firstValueFrom } from 'rxjs';
import { environment } from '../../../../environments/environment';
import type { RepoForm } from '../../../domain/repository/models/repo-form.model';
import type { RepoInfo } from '../../../domain/repository/models/repo-info.model';

@Injectable({ providedIn: 'root' })
export class RepoService {
  private readonly http = inject(HttpClient);

  private readonly api = `${environment.apiUrl}/api/repo`;

  create(form: RepoForm): Promise<RepoInfo> {
    const body = this.toCreateBody(form);
    return firstValueFrom(this.http.post<RepoInfo>(this.api, body));
  }

  getRepo(owner: string, repo: string): Promise<RepoInfo> {
    return firstValueFrom(this.http.get<RepoInfo>(`${this.api}/${owner}/${repo}`));
  }

  listUserRepos(owner: string): Promise<RepoInfo[]> {
    return firstValueFrom(this.http.get<RepoInfo[]>(`${this.api}/${owner}`));
  }

  listCollaboratorRepos(): Promise<RepoInfo[]> {
    return firstValueFrom(this.http.get<RepoInfo[]>(`${this.api}/collaborator-repos`));
  }

  update(owner: string, repo: string, form: RepoForm): Promise<RepoInfo> {
    const body = this.toCreateBody(form);
    return firstValueFrom(this.http.patch<RepoInfo>(`${this.api}/${owner}/${repo}`, body));
  }

  delete(owner: string, repo: string): Promise<void> {
    return firstValueFrom(this.http.delete<void>(`${this.api}/${owner}/${repo}`));
  }

  private toCreateBody(form: RepoForm): Record<string, unknown> {
    const body: Record<string, unknown> = {
      name: form.name,
      description: form.description ?? null,
      defaultBranch: form.defaultBranch ?? 'main',
    };
    if (form.topics && form.topics.length > 0) {
      body['topics'] = Array.isArray(form.topics) ? form.topics : [...form.topics];
    }
    return body;
  }
}
