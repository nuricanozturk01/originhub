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
import { RouterLink, ActivatedRoute, Router } from '@angular/router';
import { FormsModule } from '@angular/forms';
import { LucideAngularModule } from 'lucide-angular';
import { BranchService } from '../../../core/branch/services/branch.service';
import { PullRequestService } from '../../../core/pull-request/services/pull-request.service';
import { RepoContextService } from '../../../core/repo/services/repo-context.service';
import { ToastService } from '../../../core/toast/toast.service';
import type { BranchInfo } from '../../../domain/repository/models/branch-info.model';

@Component({
  selector: 'app-new-pull-request',
  standalone: true,
  imports: [RouterLink, LucideAngularModule, FormsModule],
  templateUrl: './new-pull-request.page.html',
  styleUrl: './new-pull-request.page.css',
})
export class NewPullRequestPage {
  private readonly route = inject(ActivatedRoute);
  private readonly router = inject(Router);
  private readonly branchService = inject(BranchService);
  private readonly prService = inject(PullRequestService);
  private readonly repoContext = inject(RepoContextService);
  private readonly toast = inject(ToastService);

  readonly branches = signal<BranchInfo[]>([]);
  readonly loading = signal(true);
  readonly submitting = signal(false);

  readonly title = signal('');
  readonly description = signal('');
  readonly targetBranch = signal('');
  readonly sourceBranch = signal('');
  readonly isDraft = signal(false);

  readonly defaultBranch = this.repoContext.defaultBranch;
  readonly owner = computed(() => this.route.snapshot.parent?.paramMap.get('owner') ?? '');
  readonly repoName = computed(() => this.route.snapshot.parent?.paramMap.get('repo') ?? '');

  constructor() {
    this.loadBranches();
  }

  private async loadBranches(): Promise<void> {
    const owner = this.owner();
    const repo = this.repoName();
    if (!owner || !repo) return;
    this.loading.set(true);
    try {
      const data = await this.branchService.getAll(owner, repo);
      this.branches.set(data);
      const def = data.find((b) => b.isDefault);
      this.targetBranch.set(def?.name ?? this.defaultBranch());
      this.sourceBranch.set(
        data.length > 1 ? (data.find((b) => !b.isDefault)?.name ?? data[0].name) : (data[0]?.name ?? 'main'),
      );
    } catch {
      this.branches.set([]);
    } finally {
      this.loading.set(false);
    }
  }

  async onSubmit(): Promise<void> {
    const owner = this.owner();
    const repo = this.repoName();
    const title = this.title().trim();
    if (!owner || !repo || !title) return;
    this.submitting.set(true);
    try {
      const pr = await this.prService.createPullRequest(owner, repo, {
        title,
        description: this.description().trim() || undefined,
        sourceBranch: this.sourceBranch(),
        targetBranch: this.targetBranch(),
        isDraft: this.isDraft(),
      });
      this.toast.success('Pull request created');
      await this.router.navigate(['/', owner, repo, 'pulls', pr.number]);
    } catch (err) {
      this.toast.error(err instanceof Error ? err.message : 'Failed to create pull request');
    } finally {
      this.submitting.set(false);
    }
  }
}
