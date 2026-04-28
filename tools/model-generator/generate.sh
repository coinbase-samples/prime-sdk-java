#!/usr/bin/env bash
set -euo pipefail
ROOT="$(cd "$(dirname "$0")/../.." && pwd)"
cd "$ROOT/tools/model-generator"
mvn -q -DskipTests package
mvn -q -DskipTests exec:java@generate-models
