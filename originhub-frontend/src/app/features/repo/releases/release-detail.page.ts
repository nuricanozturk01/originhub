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

import { Component, inject, signal, computed } from '@angular/core';
import { RouterLink, ActivatedRoute } from '@angular/router';
import { LucideAngularModule } from 'lucide-angular';
import { RelativeTimePipe } from '../../../shared/pipes/relative-time.pipe';
import { ReleaseService } from '../../../core/release/services/release.service';
import { RepoContextService } from '../../../core/repo/services/repo-context.service';
import type { ReleaseInfo } from '../../../domain/release/models/release-info.model';

@Component({
  selector: 'app-release-detail',
  standalone: true,
  imports: [RouterLink, LucideAngularModule, RelativeTimePipe],
  templateUrl: './release-detail.page.html',
  styleUrl: './release-detail.page.css',
})
export class ReleaseDetailPage {
  private readonly route = inject(ActivatedRoute);
  private readonly releaseService = inject(ReleaseService);
  readonly repoContext = inject(RepoContextService);

  readonly release = signal<ReleaseInfo | null>(null);
  readonly loading = signal(true);
  readonly error = signal<string | null>(null);

  readonly owner = computed(() => this.route.snapshot.parent?.paramMap.get('owner') ?? '');
  readonly repoName = computed(() => this.route.snapshot.parent?.paramMap.get('repo') ?? '');
  readonly releaseId = computed(() => this.route.snapshot.paramMap.get('releaseId') ?? '');
  readonly canEdit = this.repoContext.canEdit;

  constructor() {
    this.loadRelease();
  }

  async loadRelease(): Promise<void> {
    const owner = this.owner();
    const repo = this.repoName();
    const releaseId = this.releaseId();
    if (!owner || !repo || !releaseId) return;
    this.loading.set(true);
    this.error.set(null);
    try {
      const data = await this.releaseService.get(owner, repo, releaseId);
      this.release.set(data);
    } catch {
      this.error.set('Failed to load release');
      this.release.set(null);
    } finally {
      this.loading.set(false);
    }
  }
}
