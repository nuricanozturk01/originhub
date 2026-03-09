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
import { AvatarComponent } from '../../shared/components/avatar/avatar.component';
import { RelativeTimePipe } from '../../shared/pipes/relative-time.pipe';
import { RepoService } from '../../core/repo/services/repo.service';
import { UserService } from '../../core/user/services/user.service';
import type { User } from '../../domain/auth/models/user.model';
import type { RepoInfo } from '../../domain/repository/models/repo-info.model';

@Component({
  selector: 'app-user-profile',
  standalone: true,
  imports: [RouterLink, LucideAngularModule, RelativeTimePipe, AvatarComponent],
  templateUrl: './user-profile.page.html',
  styleUrl: './user-profile.page.css',
})
export class UserProfilePage {
  private readonly route = inject(ActivatedRoute);
  private readonly repoService = inject(RepoService);
  private readonly userService = inject(UserService);

  readonly user = signal<User | null>(null);
  readonly repos = signal<RepoInfo[]>([]);
  readonly loading = signal(true);

  readonly username = computed(() => this.route.snapshot.paramMap.get('username') ?? '');

  constructor() {
    this.route.params.subscribe(() => this.loadData());
  }

  private async loadData(): Promise<void> {
    const username = this.username();
    if (!username) return;
    this.loading.set(true);
    try {
      const [profile, reposData] = await Promise.all([
        this.userService.getPublicProfile(username),
        this.repoService.listUserRepos(username),
      ]);
      this.repos.set(reposData);
      this.user.set({
        id: '',
        username: profile.username,
        email: '',
        displayName: profile.displayName,
        avatarUrl: profile.avatarUrl,
        isAdmin: false,
        createdAt: '',
        updatedAt: '',
      });
    } catch {
      this.user.set(null);
      this.repos.set([]);
    } finally {
      this.loading.set(false);
    }
  }
}
