#!/bin/bash

GITHUB_USER="nuricanozturk01"
ORIGINHUB_USER="nuricanozturk"
ORIGINHUB_API="http://localhost:8080"
ORIGINHUB_SSH="ssh://git@localhost:2222"
ORIGINHUB_TOKEN="ACCESS_TOKEN"

export GIT_SSH_COMMAND="ssh -o StrictHostKeyChecking=no -o UserKnownHostsFile=/dev/null"

echo "🔍 GitHub'dan repolar alınıyor..."

repos=$(curl -s "https://api.github.com/users/${GITHUB_USER}/repos?per_page=100" \
  | grep '"clone_url"' \
  | awk -F'"' '{print $4}')

total=$(echo "$repos" | wc -l)
current=0

for clone_url in $repos; do
  current=$((current + 1))
  repo_name=$(basename "$clone_url" .git)

  echo "[$current/$total] → $repo_name"

  curl -s -X POST "${ORIGINHUB_API}/api/repo" \
    -H "Authorization: Bearer ${ORIGINHUB_TOKEN}" \
    -H "Content-Type: application/json" \
    -d "{\"name\": \"${repo_name}\", \"isPrivate\": true}" > /dev/null

  tmp_dir=$(mktemp -d)
  git clone --bare --quiet "$clone_url" "$tmp_dir" 2>/dev/null

  push_output=$(git -C "$tmp_dir" push --mirror \
    "${ORIGINHUB_SSH}/${ORIGINHUB_USER}/${repo_name}.git" 2>&1)

  if [ $? -eq 0 ]; then
    echo "  ✓ aktarıldı"
  else
    echo "  ✗ push başarısız: $push_output"
  fi

  rm -rf "$tmp_dir"
done

echo ""
echo "✅ Tamamlandı — $total repo işlendi"
