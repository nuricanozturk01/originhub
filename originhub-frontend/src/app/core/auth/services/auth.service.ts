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

import { Injectable, inject } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';
import { firstValueFrom } from 'rxjs';
import { environment } from '../../../../environments/environment';
import { TokenService } from './token.service';
import type { LoginForm } from '../../../domain/auth/models/login-form.model';
import type { RegisterForm } from '../../../domain/auth/models/register-form.model';
import type { TokenResponse } from '../../../domain/auth/ports/auth.port';

@Injectable({ providedIn: 'root' })
export class AuthService {
  private readonly http = inject(HttpClient);
  private readonly router = inject(Router);
  private readonly tokenService = inject(TokenService);

  private readonly api = `${environment.apiUrl}`;

  async login(form: LoginForm): Promise<TokenResponse> {
    const res = await firstValueFrom(this.http.post<TokenResponse>(`${this.api}/api/auth/login`, form));
    this.tokenService.saveTokens(res);
    return res;
  }

  async register(form: RegisterForm): Promise<TokenResponse> {
    const res = await firstValueFrom(this.http.post<TokenResponse>(`${this.api}/api/auth/register`, form));
    this.tokenService.saveTokens(res);
    return res;
  }

  async logout(): Promise<void> {
    this.tokenService.clearTokens();
    this.router.navigate(['/login']);
  }

  loginOauth(token: string, refresh_token: string, username: string) {
    const tokens = {
      token: token,
      refreshToken: refresh_token,
      expiresIn: 0,
      username: username,
    } as TokenResponse;
    this.tokenService.saveTokens(tokens);
  }

  async refreshToken(): Promise<TokenResponse> {
    const refresh = this.tokenService.getRefreshToken();
    if (!refresh) throw new Error('No refresh token');
    const res = await firstValueFrom(
      this.http.post<TokenResponse>(`${this.api}/api/auth/refresh-token`, { refreshToken: refresh }),
    );
    this.tokenService.saveTokens(res);
    return res;
  }
}
