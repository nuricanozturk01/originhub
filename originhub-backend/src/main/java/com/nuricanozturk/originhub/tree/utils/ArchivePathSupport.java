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
package com.nuricanozturk.originhub.tree.utils;

import org.jspecify.annotations.NonNull;

public final class ArchivePathSupport {

  private ArchivePathSupport() {}

  public static @NonNull String attachmentFileName(
      final @NonNull String owner, final @NonNull String repo, final @NonNull String branch) {

    return sanitizePathToken(owner + "-" + repo + "-" + branch) + ".zip";
  }

  /** Root folder inside the ZIP (GitHub-style single top-level directory). */
  public static @NonNull String archiveTreePrefix(
      final @NonNull String owner, final @NonNull String repo, final @NonNull String branch) {

    return sanitizePathToken(owner + "-" + repo + "-" + branch) + "/";
  }

  static @NonNull String sanitizePathToken(final @NonNull String raw) {
    final var sb = new StringBuilder(raw.length());
    for (int i = 0; i < raw.length(); i++) {
      final char c = raw.charAt(i);
      if (c < 0x20 || c == '/' || c == '\\' || c == ':' || c == '*' || c == '?' || c == '"'
          || c == '<' || c == '>' || c == '|') {
        sb.append('-');
      } else {
        sb.append(c);
      }
    }
    var s = sb.toString();
    while (s.contains("--")) {
      s = s.replace("--", "-");
    }
    s = s.strip();
    return s.isEmpty() ? "archive" : s;
  }
}
