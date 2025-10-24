# Model Generator

Generates Java model classes and enums from the OpenAPI specification.

## Purpose

Generates domain models (`com.coinbase.prime.model`) and enums (`com.coinbase.prime.model.enums`) from the OpenAPI spec. Request/Response classes are excluded and maintained separately in service packages.

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

```bash
mvn -Pgenerate
```

Or using the JAR directly:

```bash
java -jar target/model-generator-1.0.0.jar
```

## Generated Code

Models:
- Apache 2.0 license headers
- Jackson `@JsonProperty` annotations
- Builder pattern
- Standard getters/setters (`is` prefix for booleans)
- No-arg and builder constructors

Enums: `UPPERCASE_WITH_UNDERSCORES` naming.

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
- **Full regeneration**: Processes all models from the OpenAPI spec, updating existing files and creating new ones as needed

## Workflow

1. Run generator: `mvn -Pgenerate`
2. Review generated files
3. Compile: `mvn clean install`
4. Commit changes
