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
import { ConfirmModalService } from '../../../core/confirm-modal/confirm-modal.service';
import { ToastService } from '../../../core/toast/toast.service';
import type { ReleaseInfo } from '../../../domain/release/models/release-info.model';

@Component({
  selector: 'app-releases',
  standalone: true,
  imports: [RouterLink, LucideAngularModule, RelativeTimePipe],
  templateUrl: './releases.page.html',
  styleUrl: './releases.page.css',
})
export class ReleasesPage {
  private readonly route = inject(ActivatedRoute);
  private readonly releaseService = inject(ReleaseService);
  private readonly repoContext = inject(RepoContextService);
  private readonly confirmModal = inject(ConfirmModalService);
  private readonly toast = inject(ToastService);

  readonly releases = signal<ReleaseInfo[]>([]);
  readonly loading = signal(true);
  readonly error = signal<string | null>(null);
  readonly actionLoading = signal(false);

  readonly owner = computed(() => this.route.snapshot.parent?.paramMap.get('owner') ?? '');
  readonly repoName = computed(() => this.route.snapshot.parent?.paramMap.get('repo') ?? '');
  readonly canEdit = this.repoContext.canEdit;

  constructor() {
    this.loadReleases();
  }

  async loadReleases(): Promise<void> {
    const owner = this.owner();
    const repo = this.repoName();
    if (!owner || !repo) return;
    this.loading.set(true);
    this.error.set(null);
    try {
      const data = await this.releaseService.getAll(owner, repo);
      this.releases.set(data);
    } catch {
      this.error.set('Failed to load releases');
      this.releases.set([]);
    } finally {
      this.loading.set(false);
    }
  }

  async deleteRelease(release: ReleaseInfo): Promise<void> {
    const ok = await this.confirmModal.confirm(`Delete release "${release.title}"?`, undefined, { variant: 'danger' });
    if (!ok) return;
    const owner = this.owner();
    const repo = this.repoName();
    if (!owner || !repo) return;
    this.actionLoading.set(true);
    this.error.set(null);
    try {
      await this.releaseService.deleteRelease(owner, repo, release.id);
      this.toast.success('Release deleted');
      await this.loadReleases();
    } catch (err) {
      const msg = err instanceof Error ? err.message : 'Failed to delete release';
      this.error.set(msg);
      this.toast.error(msg);
    } finally {
      this.actionLoading.set(false);
    }
  }
}
