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
import { FormBuilder, ReactiveFormsModule, Validators } from '@angular/forms';
import { LucideAngularModule } from 'lucide-angular';
import { RelativeTimePipe } from '../../../shared/pipes/relative-time.pipe';
import { TagService } from '../../../core/tag/services/tag.service';
import { RepoContextService } from '../../../core/repo/services/repo-context.service';
import { ConfirmModalService } from '../../../core/confirm-modal/confirm-modal.service';
import { ToastService } from '../../../core/toast/toast.service';
import type { TagInfo } from '../../../domain/tag/models/tag-info.model';

@Component({
  selector: 'app-tags',
  standalone: true,
  imports: [ReactiveFormsModule, RouterLink, LucideAngularModule, RelativeTimePipe],
  templateUrl: './tags.page.html',
  styleUrl: './tags.page.css',
})
export class TagsPage {
  private readonly route = inject(ActivatedRoute);
  private readonly router = inject(Router);
  private readonly fb = inject(FormBuilder);
  private readonly tagService = inject(TagService);
  private readonly repoContext = inject(RepoContextService);
  private readonly confirmModal = inject(ConfirmModalService);
  private readonly toast = inject(ToastService);

  readonly tags = signal<TagInfo[]>([]);
  readonly loading = signal(true);
  readonly error = signal<string | null>(null);
  readonly createModalOpen = signal(false);
  readonly actionLoading = signal(false);
  readonly totalPages = signal(0);
  readonly hasNext = signal(false);
  readonly hasPrevious = signal(false);

  readonly owner = computed(() => this.route.snapshot.parent?.paramMap.get('owner') ?? '');
  readonly repoName = computed(() => this.route.snapshot.parent?.paramMap.get('repo') ?? '');
  readonly canEdit = this.repoContext.canEdit;
  readonly currentPage = computed(() => {
    const p = this.route.snapshot.queryParamMap.get('page');
    return p ? parseInt(p, 10) : 0;
  });

  readonly createForm = this.fb.nonNullable.group({
    name: ['', [Validators.required, Validators.pattern(/^[a-zA-Z0-9._\-/]+$/)]],
    sha: ['', [Validators.required, Validators.minLength(1)]],
    message: [''],
  });

  constructor() {
    this.route.queryParamMap.subscribe(() => this.loadTags());
  }

  async loadTags(): Promise<void> {
    const owner = this.owner();
    const repo = this.repoName();
    if (!owner || !repo) return;
    this.loading.set(true);
    this.error.set(null);
    try {
      const data = await this.tagService.getAll(owner, repo, this.currentPage(), 20);
      this.tags.set(data.items);
      this.totalPages.set(data.totalPages);
      this.hasNext.set(data.hasNext);
      this.hasPrevious.set(data.hasPrevious);
    } catch {
      this.error.set('Failed to load tags');
      this.tags.set([]);
    } finally {
      this.loading.set(false);
    }
  }

  goToPage(p: number): void {
    this.router.navigate([], { queryParams: { page: p }, relativeTo: this.route });
  }

  openCreateModal(): void {
    this.createModalOpen.set(true);
  }

  closeCreateModal(): void {
    this.createModalOpen.set(false);
    this.createForm.reset();
  }

  async onCreateSubmit(): Promise<void> {
    if (this.createForm.invalid) return;
    const owner = this.owner();
    const repo = this.repoName();
    if (!owner || !repo) return;
    this.actionLoading.set(true);
    this.error.set(null);
    try {
      const { name, sha, message } = this.createForm.getRawValue();
      await this.tagService.createTag(owner, repo, { name, sha, message: message || undefined });
      this.toast.success('Tag created successfully');
      this.closeCreateModal();
      await this.loadTags();
    } catch (err) {
      const msg = err instanceof Error ? err.message : 'Failed to create tag';
      this.error.set(msg);
      this.toast.error(msg);
    } finally {
      this.actionLoading.set(false);
    }
  }

  async deleteTag(tag: TagInfo): Promise<void> {
    const ok = await this.confirmModal.confirm(`Delete tag "${tag.name}"?`, undefined, { variant: 'danger' });
    if (!ok) return;
    const owner = this.owner();
    const repo = this.repoName();
    if (!owner || !repo) return;
    this.actionLoading.set(true);
    this.error.set(null);
    try {
      await this.tagService.deleteTag(owner, repo, tag.name);
      this.toast.success('Tag deleted');
      await this.loadTags();
    } catch (err) {
      const msg = err instanceof Error ? err.message : 'Failed to delete tag';
      this.error.set(msg);
      this.toast.error(msg);
    } finally {
      this.actionLoading.set(false);
    }
  }
}
