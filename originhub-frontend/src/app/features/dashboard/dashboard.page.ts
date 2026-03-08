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

import { Component, inject, signal } from '@angular/core';
import { RouterLink } from '@angular/router';
import { LucideAngularModule } from 'lucide-angular';
import { RelativeTimePipe } from '../../shared/pipes/relative-time.pipe';
import { TokenService } from '../../core/auth/services/token.service';
import { RepoService } from '../../core/repo/services/repo.service';
import type { RepoInfo } from '../../domain/repository/models/repo-info.model';

export interface DashboardRepo {
  repo: RepoInfo;
  isCollaborator: boolean;
}

@Component({
  selector: 'app-dashboard',
  standalone: true,
  imports: [RouterLink, LucideAngularModule, RelativeTimePipe],
  templateUrl: './dashboard.page.html',
  styleUrl: './dashboard.page.css',
})
export class DashboardPage {
  private readonly tokenService = inject(TokenService);
  private readonly repoService = inject(RepoService);

  readonly repos = signal<DashboardRepo[]>([]);
  readonly loading = signal(true);

  constructor() {
    this.loadRepos();
  }

  private async loadRepos(): Promise<void> {
    const username = this.tokenService.getUsername();
    if (!username) {
      this.loading.set(false);
      return;
    }
    try {
      const [owned, collaborator] = await Promise.all([
        this.repoService.listUserRepos(username),
        this.repoService.listCollaboratorRepos().catch(() => []),
      ]);
      const ownedIds = new Set(owned.map((r) => r.id));
      const merged: DashboardRepo[] = [
        ...owned.map((r) => ({ repo: r, isCollaborator: false })),
        ...collaborator.filter((r) => !ownedIds.has(r.id)).map((r) => ({ repo: r, isCollaborator: true })),
      ];
      this.repos.set(merged);
    } catch {
      this.repos.set([]);
    } finally {
      this.loading.set(false);
    }
  }
}
