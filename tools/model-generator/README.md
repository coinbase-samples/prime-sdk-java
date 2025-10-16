# Model Generator

A code generation tool that produces Java model classes and enums from the Coinbase Prime OpenAPI specification.

## Purpose

Generates domain models (`com.coinbase.prime.model`) and enums (`com.coinbase.prime.model.enums`) from the OpenAPI spec, maintaining consistency between the API specification and SDK implementation. Request/Response classes are excluded as they are service-specific and maintained separately.

## Architecture

The generator implements a three-stage pipeline:

1. **OpenAPI Generator** (`OpenApiGenerator.java`) - Generates raw POJOs from the OpenAPI spec using the OpenAPI Generator library
2. **Post-Processor** (`PostProcessor.java`) - Applies transformations (Web3→Onchain renaming, schema filtering, file routing)
3. **Model Transformer** (`ModelTransformer.java`) - Uses JavaPoet to generate final models with builder pattern, license headers, and proper annotations

## Usage

### Prerequisites

- Java 11+
- Maven 3.6+
- Network access to fetch the OpenAPI spec from `https://api.prime.coinbase.com/v1/openapi.yaml`

### Build

```bash
cd tools/model-generator
mvn clean package
```

### Generate Models

**Incremental mode** (default) - generates only new models, skips existing files:

```bash
mvn -Pgenerate
```

**Update mode** - regenerates all models from spec:

```bash
java -jar target/model-generator-1.0.0.jar --update-all
```

**Full regeneration** - deletes all existing models/enums and regenerates:

```bash
java -jar target/model-generator-1.0.0.jar --full-regenerate
```

## Generated Code

Models include:
- Apache 2.0 license headers
- Jackson annotations (`@JsonProperty`) for JSON serialization
- Builder pattern with fluent API
- Standard getters/setters (boolean fields use `is` prefix)
- No-arg and builder constructors

Enums use `UPPERCASE_WITH_UNDERSCORES` naming convention.

## Configuration

### Input
- OpenAPI spec: Fetched automatically from `https://api.prime.coinbase.com/v1/openapi.yaml` during generation

### Output
- Models: `src/main/java/com/coinbase/prime/model/`
- Enums: `src/main/java/com/coinbase/prime/model/enums/`

### Filtering

The `.openapi-generator-ignore` file excludes:
- `*Request.java` - service-specific requests
- `*Response.java` - service-specific responses
- `Google*.java` - infrastructure types
- `RFQ.java` - inline schemas
- `*AllOf*.java` - composition artifacts

## Technical Details

### Dependencies
- OpenAPI Generator 7.x
- Palantir JavaPoet (code generation)
- Jackson (JSON annotations)
- SnakeYAML (spec parsing)

### Transformations

The post-processor applies:
- **Web3→Onchain**: Renames classes/fields containing "Web3" to "Onchain" while preserving `@JsonProperty` mappings
- **Schema filtering**: Skips schemas matching ignore patterns
- **Package routing**: Places enums in `model/enums/`, models in `model/`
- **Incremental logic**: Compares generated files against existing to skip overwrites

### Command Reference

| Command | Behavior |
|---------|----------|
| `mvn -Pgenerate` | Incremental generation (safe) |
| `java -jar target/model-generator-1.0.0.jar` | Incremental generation (safe) |
| `java -jar target/model-generator-1.0.0.jar --update-all` | Regenerate all models |
| `java -jar target/model-generator-1.0.0.jar --full-regenerate` | Delete and regenerate everything |

## Workflow

1. Run generator in incremental mode (automatically fetches the latest OpenAPI spec)
2. Review generated files
3. Compile and test: `mvn clean install`
4. Commit generated models (spec is gitignored and not committed)
