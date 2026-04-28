# Prime Java SDK generator

Generates the majority of the Prime Java SDK from the published OpenAPI spec, aligned with `prime-sdk-dotnet` (shared JSON config in `config/`).

## What it generates

1. **Models & enums** — OpenAPI Generator (`OpenApiGenerator`) → `PostProcessor` → `com.coinbase.prime.model` / `model.enums`
2. **Client surface** — `SdkGeneratorMain` / `ClientSurfacePhase`: per-operation `*Request`, `*Response`, `*Service`, `*ServiceImpl` under `com.coinbase.prime.<tagFolder>/`
3. **Factory** — `com.coinbase.prime.factory.PrimeServiceFactory`

Hand-written samples live under `com.coinbase.examples`; the generator does not create or update them.

## Configuration

| File | Purpose |
|------|---------|
| `config/generator-config.json` | `specUrl`, renames, acronym mappings, `tagToFolderOverrides`, `serviceMethodOrderOverrides`, `statusCodeOverrides` (HTTP names: `OK`, `CREATED`, …) |
| `config/operations-overrides.json` | Per-`operationId` overrides: `sdkMethod`, `service`, `omitRequest`, `forcePaginated`, `paramTypeOverrides` (Java types) |
| [`../.openapi-generator-ignore`](.openapi-generator-ignore) | OpenAPI Generator ignore patterns for the **model** pass (under `model/`) |

## Usage

```bash
cd tools/model-generator
mvn -q -Pgenerate
# optional:
mvn -q compile exec:java@generate-models -Dgenerator.args=--dry-run
mvn -q compile exec:java@generate-models -Dgenerator.args=--diff
```

Or from the **repository root**:

```bash
mvn -Pgenerate
mvn -Pgenerate -Dgenerator.args=--diff
```

The root profile runs `mvn` in this module with `-Pgenerate` and forwards `generator.args`.

**Wrapper:** `./tools/model-generator/generate.sh` (builds then runs the generator entrypoint).

## Entry points

- **`com.coinbase.tools.sdkgenerator.SdkGeneratorMain`** — default `main` for the shaded JAR and `exec-maven-plugin`
- **`com.coinbase.tools.modelgenerator.Main`** — delegates to `SdkGeneratorMain` (legacy)

## Phases (conceptual)

1. Download spec to `../generated/openapi.yaml`
2. Parse YAML to `JsonNode` (`SpecParser`); build operation bindings (`OperationBindingGenerator` + `operations-overrides.json`)
3. Run model/enum generation unless `--dry-run` / `--diff`
4. Emit request/response/service and write files (`ClientSurfacePhase`)
5. Regenerate `PrimeServiceFactory` (`FactoryPhase`)

## Tests

```bash
mvn test
```

## Dependencies

- OpenAPI Generator 7.x (models)
- Jackson (YAML + JSON for config and spec)
- JUnit 5 (tests)
