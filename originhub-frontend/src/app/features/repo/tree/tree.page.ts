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
import { HttpClient } from '@angular/common/http';
import { LucideAngularModule } from 'lucide-angular';
import { FileSizePipe } from '../../../shared/pipes/file-size.pipe';
import { environment } from '../../../../environments/environment';
import type { TreeResponse, TreeResponseEntry } from '../../../domain/repository/models/tree-response.model';
import type { BreadcrumbItem } from '../shared/repo-breadcrumb.component';
import { RepoBreadcrumbComponent } from '../shared/repo-breadcrumb.component';

@Component({
  selector: 'app-tree',
  standalone: true,
  imports: [RouterLink, LucideAngularModule, FileSizePipe, RepoBreadcrumbComponent],
  templateUrl: './tree.page.html',
  styleUrl: './tree.page.css',
})
export class TreePage {
  private readonly route = inject(ActivatedRoute);
  private readonly router = inject(Router);
  private readonly http = inject(HttpClient);

  readonly tree = signal<TreeResponseEntry[]>([]);
  readonly loading = signal(true);
  readonly branch = signal('');
  readonly path = signal('');

  readonly owner = computed(() => this.route.snapshot.parent?.parent?.paramMap.get('owner') ?? '');
  readonly repoName = computed(() => this.route.snapshot.parent?.parent?.paramMap.get('repo') ?? '');

  readonly breadcrumbItems = computed((): BreadcrumbItem[] => {
    const p = this.path();
    if (!p) return [];
    const parts = p.split('/').filter(Boolean);
    return parts.map((name, i) => {
      const pathSeg = parts.slice(0, i + 1).join('/');
      return { name, path: pathSeg, isLast: i === parts.length - 1 };
    });
  });

  constructor() {
    this.route.params.subscribe(() => this.parseUrlAndLoad());
    this.route.url.subscribe(() => this.parseUrlAndLoad());
  }

  private parseUrlAndLoad(): void {
    const url = this.router.url;
    const match = url.match(/\/tree\/(.+)$/);
    if (!match) {
      this.branch.set('main');
      this.path.set('');
    } else {
      const parts = match[1].split('/').filter(Boolean);
      this.branch.set(parts[0] ?? 'main');
      this.path.set(parts.slice(1).join('/'));
    }
    this.loadTree();
  }

  private loadTree(): void {
    const owner = this.owner();
    const repo = this.repoName();
    const branch = this.branch();
    const path = this.path();
    if (!owner || !repo) return;
    this.loading.set(true);
    const pathSuffix = path ? `/${path}` : '';
    const url = `${environment.apiUrl}/api/repos/${owner}/${repo}/tree/${branch}${pathSuffix}`;
    this.http.get<TreeResponse>(url).subscribe({
      next: (data) => {
        this.tree.set(data.entries ?? []);
        this.loading.set(false);
      },
      error: () => this.loading.set(false),
    });
  }

  entryRoute(entry: TreeResponseEntry): string[] {
    const pathSegments = entry.path ? entry.path.split('/').filter(Boolean) : [];
    if (entry.type === 'TREE') {
      return ['/', this.owner(), this.repoName(), 'tree', this.branch(), ...pathSegments];
    }
    return ['/', this.owner(), this.repoName(), 'blob', this.branch(), ...pathSegments];
  }

  isTree(entry: TreeResponseEntry): boolean {
    return entry.type === 'TREE';
  }
}
