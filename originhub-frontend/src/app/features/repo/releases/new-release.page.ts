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
import { ReleaseService } from '../../../core/release/services/release.service';
import { TagService } from '../../../core/tag/services/tag.service';
import { ToastService } from '../../../core/toast/toast.service';
import type { TagInfo } from '../../../domain/tag/models/tag-info.model';

@Component({
  selector: 'app-new-release',
  standalone: true,
  imports: [ReactiveFormsModule, RouterLink, LucideAngularModule],
  templateUrl: './new-release.page.html',
  styleUrl: './new-release.page.css',
})
export class NewReleasePage {
  private readonly route = inject(ActivatedRoute);
  private readonly router = inject(Router);
  private readonly fb = inject(FormBuilder);
  private readonly releaseService = inject(ReleaseService);
  private readonly tagService = inject(TagService);
  private readonly toast = inject(ToastService);

  readonly loading = signal(false);
  readonly error = signal<string | null>(null);
  readonly tags = signal<TagInfo[]>([]);

  readonly owner = computed(() => this.route.snapshot.parent?.paramMap.get('owner') ?? '');
  readonly repoName = computed(() => this.route.snapshot.parent?.paramMap.get('repo') ?? '');

  readonly form = this.fb.nonNullable.group({
    tagName: ['', Validators.required],
    title: ['', [Validators.required, Validators.maxLength(255)]],
    description: [''],
    isPrerelease: [false],
    isDraft: [false],
  });

  constructor() {
    this.loadTags();
  }

  async loadTags(): Promise<void> {
    const owner = this.owner();
    const repo = this.repoName();
    if (!owner || !repo) return;
    try {
      const data = await this.tagService.getAll(owner, repo, 0, 100);
      this.tags.set(data.items);
    } catch {
      this.tags.set([]);
    }
  }

  async onSubmit(): Promise<void> {
    if (this.form.invalid) return;
    const owner = this.owner();
    const repo = this.repoName();
    if (!owner || !repo) return;
    this.loading.set(true);
    this.error.set(null);
    try {
      const { tagName, title, description, isPrerelease, isDraft } = this.form.getRawValue();
      await this.releaseService.createRelease(owner, repo, {
        tagName,
        title,
        description: description || undefined,
        isPrerelease,
        isDraft,
      });
      this.toast.success('Release created successfully');
      await this.router.navigate(['/', owner, repo, 'releases']);
    } catch (err) {
      const msg = err instanceof Error ? err.message : 'Failed to create release';
      this.error.set(msg);
      this.toast.error(msg);
    } finally {
      this.loading.set(false);
    }
  }
}
