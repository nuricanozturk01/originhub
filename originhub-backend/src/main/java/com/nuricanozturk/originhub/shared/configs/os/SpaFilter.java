/*
 * Copyright 2026 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.nuricanozturk.originhub.shared.configs.os;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;
import org.jspecify.annotations.NonNull;
import org.springframework.context.annotation.Profile;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

@Component
@Profile("os")
public class SpaFilter implements Filter {

  private static final List<String> STATIC_EXTENSIONS =
      List.of(".js", ".css", ".ico", ".png", ".svg", ".woff", ".woff2", ".ttf", ".map");

  private String indexHtml;

  @Override
  public void init(final @NonNull FilterConfig filterConfig) throws ServletException {

    try {
      this.indexHtml =
          new ClassPathResource("static/index.html").getContentAsString(StandardCharsets.UTF_8);
    } catch (final IOException e) {
      throw new ServletException("index.html not found", e);
    }
  }

  @Override
  public void doFilter(
      final @NonNull ServletRequest req,
      final @NonNull ServletResponse res,
      final @NonNull FilterChain chain)
      throws IOException, ServletException {

    final var request = (HttpServletRequest) req;
    final var path = request.getRequestURI();

    if (this.isSpaRoute(path)) {
      final var response = (HttpServletResponse) res;
      response.setContentType("text/html;charset=UTF-8");
      response.setStatus(HttpServletResponse.SC_OK);
      response.getWriter().write(this.indexHtml);
      return;
    }

    chain.doFilter(req, res);
  }

  private boolean isSpaRoute(final @NonNull String path) {
    return !this.isApiPath(path) && !this.isGitPath(path) && !this.isStaticAsset(path);
  }

  private boolean isApiPath(final @NonNull String path) {
    return path.startsWith("/api/");
  }

  private boolean isGitPath(final @NonNull String path) {
    return path.startsWith("/git/");
  }

  private boolean isStaticAsset(final @NonNull String path) {
    return this.hasStaticPrefix(path) || this.hasStaticExtension(path);
  }

  private boolean hasStaticPrefix(final @NonNull String path) {
    return path.startsWith("/assets/") || path.startsWith("/favicon");
  }

  private boolean hasStaticExtension(final @NonNull String path) {
    return STATIC_EXTENSIONS.stream().anyMatch(path::endsWith);
  }
}
