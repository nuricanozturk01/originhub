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
import type { ReleaseInfo } from '../../../domain/release/models/release-info.model';
import type { ReleaseForm, ReleaseUpdateForm } from '../../../domain/release/models/release-form.model';

@Injectable({ providedIn: 'root' })
export class ReleaseService {
  private readonly http = inject(HttpClient);

  private base(owner: string, repo: string): string {
    return `${environment.apiUrl}/api/repos/${owner}/${repo}/releases`;
  }

  getAll(owner: string, repo: string): Promise<ReleaseInfo[]> {
    return firstValueFrom(this.http.get<ReleaseInfo[]>(this.base(owner, repo)));
  }

  get(owner: string, repo: string, releaseId: string): Promise<ReleaseInfo> {
    return firstValueFrom(this.http.get<ReleaseInfo>(`${this.base(owner, repo)}/${releaseId}`));
  }

  createRelease(owner: string, repo: string, form: ReleaseForm): Promise<ReleaseInfo> {
    return firstValueFrom(this.http.post<ReleaseInfo>(this.base(owner, repo), form));
  }

  updateRelease(owner: string, repo: string, releaseId: string, form: ReleaseUpdateForm): Promise<ReleaseInfo> {
    return firstValueFrom(this.http.patch<ReleaseInfo>(`${this.base(owner, repo)}/${releaseId}`, form));
  }

  deleteRelease(owner: string, repo: string, releaseId: string): Promise<void> {
    return firstValueFrom(this.http.delete<void>(`${this.base(owner, repo)}/${releaseId}`));
  }
}
