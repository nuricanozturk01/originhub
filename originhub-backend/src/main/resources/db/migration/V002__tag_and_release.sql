CREATE TABLE IF NOT EXISTS tags
(
  id         UUID PRIMARY KEY DEFAULT gen_random_uuid(),
  repo_id    UUID         NOT NULL REFERENCES repositories (id) ON DELETE CASCADE,
  name       VARCHAR(100) NOT NULL,
  sha        VARCHAR(40)  NOT NULL,
  message    TEXT,
  tagger_id  UUID         NOT NULL REFERENCES tenant (id),
  created_at TIMESTAMP WITHOUT TIME ZONE,

  UNIQUE (repo_id, name)
);

CREATE TABLE IF NOT EXISTS releases
(
  id            UUID PRIMARY KEY DEFAULT gen_random_uuid(),
  repo_id       UUID         NOT NULL REFERENCES repositories (id) ON DELETE CASCADE,
  tag_name      VARCHAR(100) NOT NULL,
  title         VARCHAR(255) NOT NULL,
  description   TEXT,
  is_prerelease BOOLEAN          DEFAULT FALSE,
  is_draft      BOOLEAN          DEFAULT FALSE,
  author_id     UUID         NOT NULL REFERENCES tenant (id),
  created_at    TIMESTAMP WITHOUT TIME ZONE,
  updated_at    TIMESTAMP WITHOUT TIME ZONE,
  published_at  TIMESTAMP WITHOUT TIME ZONE,

  UNIQUE (repo_id, tag_name)
);
