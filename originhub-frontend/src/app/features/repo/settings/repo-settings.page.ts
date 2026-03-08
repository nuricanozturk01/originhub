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

import { Component, inject, signal, computed, effect } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { FormsModule } from '@angular/forms';
import { LucideAngularModule } from 'lucide-angular';
import { RepoService } from '../../../core/repo/services/repo.service';
import { RepoContextService } from '../../../core/repo/services/repo-context.service';
import { ConfirmModalService } from '../../../core/confirm-modal/confirm-modal.service';
import { ToastService } from '../../../core/toast/toast.service';

@Component({
  selector: 'app-repo-settings',
  standalone: true,
  imports: [LucideAngularModule, FormsModule],
  templateUrl: './repo-settings.page.html',
  styleUrl: './repo-settings.page.css',
})
export class RepoSettingsPage {
  private readonly route = inject(ActivatedRoute);
  private readonly router = inject(Router);
  private readonly repoService = inject(RepoService);
  private readonly repoContext = inject(RepoContextService);
  private readonly confirmModal = inject(ConfirmModalService);
  private readonly toast = inject(ToastService);

  readonly activeTab = signal<'general' | 'danger'>('general');

  readonly generalName = signal('');
  readonly generalDescription = signal('');
  readonly savingGeneral = signal(false);
  readonly generalError = signal<string | null>(null);

  readonly owner = computed(() => this.route.snapshot.parent?.paramMap.get('owner') ?? '');
  readonly repoName = computed(() => this.route.snapshot.parent?.paramMap.get('repo') ?? '');

  readonly repo = this.repoContext.repo;

  constructor() {
    effect(() => {
      const r = this.repo();
      if (r && this.activeTab() === 'general') this.syncGeneralFromRepo();
    });
  }

  private syncGeneralFromRepo(): void {
    const r = this.repo();
    if (r) {
      this.generalName.set(r.name);
      this.generalDescription.set(r.description ?? '');
    }
  }

  setTab(t: 'general' | 'danger'): void {
    this.activeTab.set(t);
    if (t === 'general') this.syncGeneralFromRepo();
  }

  async saveGeneral(): Promise<void> {
    const owner = this.owner();
    const repo = this.repoName();
    if (!owner || !repo) return;
    const name = this.generalName().trim();
    const description = this.generalDescription().trim() || undefined;
    const ok = await this.confirmModal.confirm('Update repository settings?', 'Name and description will be saved.', {
      confirmLabel: 'Save',
      variant: 'primary',
    });
    if (!ok) return;
    this.savingGeneral.set(true);
    this.generalError.set(null);
    try {
      const r = this.repo();
      const updated = await this.repoService.update(owner, repo, {
        name,
        description,
        defaultBranch: r?.defaultBranch ?? 'main',
      });
      this.repoContext.repo.set(updated);
      this.generalName.set(updated.name);
      this.generalDescription.set(updated.description ?? '');
      if (updated.name !== repo) {
        await this.router.navigate(['/', owner, updated.name, 'settings']);
      }
      this.toast.success('Repository settings updated');
    } catch (err) {
      const msg = err instanceof Error ? err.message : 'Failed to update repository';
      this.generalError.set(msg);
      this.toast.error(msg);
    } finally {
      this.savingGeneral.set(false);
    }
  }

  async deleteRepo(): Promise<void> {
    const repo = this.repoName();
    const ok = await this.confirmModal.confirm(`Are you sure you want to delete "${repo}"?`, 'This cannot be undone.', {
      confirmLabel: 'Delete',
      variant: 'danger',
    });
    if (!ok) return;
    const owner = this.owner();
    if (!owner || !repo) return;
    try {
      await this.repoService.delete(owner, repo);
      this.toast.success('Repository deleted');
      window.location.href = '/';
    } catch (err) {
      this.toast.error(err instanceof Error ? err.message : 'Failed to delete repository');
    }
  }
}
