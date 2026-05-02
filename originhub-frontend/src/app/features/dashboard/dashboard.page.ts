///
/// Copyright 2026 the original author or authors.
///
/// Licensed under the Apache License, Version 2.0 (the "License");
/// you may not use this file except in compliance with the License.
///

import { Component, inject, NgZone, signal, computed } from '@angular/core';
import { RouterLink } from '@angular/router';
import { LucideAngularModule } from 'lucide-angular';
import { RelativeTimePipe } from '../../shared/pipes/relative-time.pipe';
import { TokenService } from '../../core/auth/services/token.service';
import { UserService } from '../../core/user/services/user.service';
import { RepoService } from '../../core/repo/services/repo.service';
import type { RepoInfo } from '../../domain/repository/models/repo-info.model';
import {
  collectTopicsLower,
  compareReposBySort,
  matchesRepoSearch,
  matchesTopicFilter,
  type RepoListSort,
} from '../../shared/utils/repo-list.utils';

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
  private readonly ngZone = inject(NgZone);
  private readonly tokenService = inject(TokenService);
  private readonly userService = inject(UserService);
  private readonly repoService = inject(RepoService);

  readonly repos = signal<DashboardRepo[]>([]);
  readonly loading = signal(true);
  readonly repoQuery = signal('');
  readonly sortBy = signal<RepoListSort>('updated');
  readonly selectedTopics = signal<string[]>([]);

  readonly stats = computed(() => {
    const list = this.repos();
    return {
      total: list.length,
      owned: list.filter((i) => !i.isCollaborator).length,
      collaborator: list.filter((i) => i.isCollaborator).length,
    };
  });

  readonly allTopics = computed(() => collectTopicsLower(this.repos().map((i) => i.repo)));

  readonly filteredRepos = computed(() => {
    const q = this.repoQuery().trim();
    const topics = this.selectedTopics();
    const sort = this.sortBy();
    const qLower = q.toLowerCase();
    let items = this.repos().filter(({ repo }) => matchesRepoSearch(repo, qLower) && matchesTopicFilter(repo, topics));
    items = [...items].sort((a, b) => compareReposBySort(a.repo, b.repo, sort));
    return items;
  });

  readonly hasActiveFilters = computed(() => this.repoQuery().trim().length > 0 || this.selectedTopics().length > 0);

  constructor() {
    this.loadRepos();
  }

  setSort(mode: RepoListSort): void {
    this.sortBy.set(mode);
  }

  onSearchInput(event: Event): void {
    this.repoQuery.set((event.target as HTMLInputElement).value);
  }

  toggleTopic(topicLower: string): void {
    const k = topicLower.toLowerCase();
    const cur = this.selectedTopics();
    if (cur.includes(k)) {
      this.selectedTopics.set(cur.filter((x) => x !== k));
    } else {
      this.selectedTopics.set([...cur, k]);
    }
  }

  isTopicActive(topicLower: string): boolean {
    return this.selectedTopics().includes(topicLower.toLowerCase());
  }

  clearFilters(): void {
    this.repoQuery.set('');
    this.selectedTopics.set([]);
  }

  clearTopicFilters(): void {
    this.selectedTopics.set([]);
  }

  private async loadRepos(): Promise<void> {
    if (!this.tokenService.getAccessToken()) {
      this.patchReposAndLoading([], false);
      return;
    }

    let username = this.tokenService.getUsername();
    if (!username) {
      try {
        const me = await this.userService.getMe();
        username = me.username;
        this.tokenService.persistUsernameIfMissing(username);
      } catch {
        this.patchReposAndLoading([], false);
        return;
      }
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
      this.patchReposAndLoading(merged, false);
    } catch {
      this.patchReposAndLoading([], false);
    }
  }

  private patchReposAndLoading(nextRepos: DashboardRepo[], loading: boolean): void {
    this.ngZone.run(() => {
      this.repos.set(nextRepos);
      this.loading.set(loading);
    });
  }
}
