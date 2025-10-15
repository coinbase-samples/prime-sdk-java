# Coinbase Prime Java SDK Model Generator

This tool automatically generates Java model classes from the OpenAPI specification for the Coinbase Prime SDK, maintaining SDK conventions and reducing drift between the spec and implementation.

## Directory Structure

```
tools/model-generator/
├── pom.xml                          # Maven configuration
├── .openapi-generator-ignore        # Patterns for files to skip
├── src/main/java/                   # Model generator source code
│   └── com/coinbase/tools/modelgenerator/
│       ├── Main.java                # Entry point
│       ├── OpenApiGenerator.java    # OpenAPI Generator wrapper
│       ├── PostProcessor.java       # Post-processing pipeline
│       └── ModelTransformer.java    # JavaPoet-based transformer
└── README.md                        # This file
```

## Features

✅ **Automatic Model Generation** - Generates domain models and enums from OpenAPI spec  
✅ **Builder Pattern** - Uses JavaPoet to generate proper Builder inner classes  
✅ **Incremental Mode** - Only generates new models by default, preventing overwrites  
✅ **Schema Filtering** - Skips Request/Response models (service-specific)  
✅ **Web3 → Onchain** - Automatically transforms naming while preserving JSON properties  
✅ **License Headers** - Adds Apache 2.0 license headers to all generated files  
✅ **Enum Transformation** - Converts enum values to UPPERCASE_WITH_UNDERSCORES  

## Prerequisites

- Java 11 or higher
- Maven 3.6 or higher
- OpenAPI specification file at `apiSpec/prime-public-spec.yaml`

## Quick Start

### Generate New Models Only (Safe, Default)

```bash
cd tools/model-generator
mvn -Pgenerate
```

This will:
1. Generate models from the OpenAPI spec
2. Skip existing models (no overwrites)
3. Only create new models not present in the SDK

### Force Regenerate All Models (Dangerous)

```bash
cd tools/model-generator
mvn clean package
java -jar target/model-generator-1.0.0.jar --update-all
```

⚠️ **Warning**: This overwrites ALL existing models. Only use after backing up or in a feature branch.

## Usage Patterns

### Pattern 1: After OpenAPI Spec Update (Recommended)

```bash
# 1. Update the OpenAPI specification
vi apiSpec/prime-public-spec.yaml

# 2. Generate only NEW models
cd tools/model-generator
mvn -Pgenerate

# 3. Review what was generated
git status

# 4. Verify the SDK compiles
cd ../..
mvn clean compile

# 5. Run tests
mvn test

# 6. Commit changes
git add .
git commit -m "feat: add new models from OpenAPI spec update"
```

### Pattern 2: Regenerate Specific Model

```bash
# 1. Delete the model you want to regenerate
rm src/main/java/com/coinbase/prime/model/Asset.java

# 2. Run generator (incremental mode)
cd tools/model-generator
mvn -Pgenerate

# 3. The deleted model will be regenerated
```

### Pattern 3: Fresh Generation (Development)

```bash
# 1. Backup existing models
cp -r src/main/java/com/coinbase/prime/model /tmp/model-backup

# 2. Regenerate everything
cd tools/model-generator
mvn clean package
java -jar target/model-generator-1.0.0.jar --update-all

# 3. Compare with backup
diff -r /tmp/model-backup src/main/java/com/coinbase/prime/model/

# 4. Review and test changes
cd ../..
mvn clean install
```

## Architecture

The model generator follows a three-stage pipeline:

```
OpenAPI Spec → OpenAPI Generator → Post-Processor → Final Models
                 (raw POJOs)        (transformations)   (SDK-ready)
```

### Stage 1: OpenAPI Generator (OpenApiGenerator.java)

Configures and runs OpenAPI Generator to produce raw Java POJOs:
- **Input**: `apiSpec/prime-public-spec.yaml`
- **Output**: Temporary `generated/raw/` directory
- **Filters**: Uses `.openapi-generator-ignore` to skip unwanted schemas
- **Configuration**:
  - Models only (no APIs or supporting files)
  - Jackson annotations for JSON serialization
  - Java 8 time classes (`java.time.Instant`)
  - Enum values in `MACRO_CASE` format

### Stage 2: Post-Processing (PostProcessor.java)

Applies SDK-specific transformations:
- **Schema Loading**: Reads OpenAPI spec for field metadata
- **File Routing**: Separates enums vs models into correct packages
- **Web3 → Onchain**: Transforms class/field names (preserves JSON properties)
- **Incremental Logic**: Skips existing models unless `--update-all`
- **Cleanup**: Removes temporary files after processing

### Stage 3: Model Transformation (ModelTransformer.java)

Uses [Palantir JavaPoet](https://github.com/palantir/javapoet) for robust code generation:
- **License Headers**: Adds Apache 2.0 header to all files
- **Builder Pattern**: Generates inner Builder class with fluent API
- **Getters/Setters**: Proper naming (`isFoo()` for booleans)
- **Constructors**: No-arg + Builder-taking constructors
- **Annotations**: Preserves `@JsonProperty` with snake_case mapping

## Generated Code Example

### Input (OpenAPI Schema)

```yaml
Asset:
  type: object
  properties:
    name:
      type: string
    decimal_precision:
      type: string
    trading_supported:
      type: boolean
```

### Output (Generated Java)

```java
/*
 * Copyright 2024-present Coinbase Global, Inc.
 * ... (license header)
 */

package com.coinbase.prime.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Asset {
    private String name;
    @JsonProperty("decimal_precision")
    private String decimalPrecision;
    @JsonProperty("trading_supported")
    private boolean tradingSupported;

    public Asset() {
    }

    public Asset(Builder builder) {
        this.name = builder.name;
        this.decimalPrecision = builder.decimalPrecision;
        this.tradingSupported = builder.tradingSupported;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDecimalPrecision() {
        return decimalPrecision;
    }

    public void setDecimalPrecision(String decimalPrecision) {
        this.decimalPrecision = decimalPrecision;
    }

    public boolean isTradingSupported() {
        return tradingSupported;
    }

    public void setTradingSupported(boolean tradingSupported) {
        this.tradingSupported = tradingSupported;
    }

    public static class Builder {
        private String name;
        private String decimalPrecision;
        private boolean tradingSupported;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder decimalPrecision(String decimalPrecision) {
            this.decimalPrecision = decimalPrecision;
            return this;
        }

        public Builder tradingSupported(boolean tradingSupported) {
            this.tradingSupported = tradingSupported;
            return this;
        }

        public Asset build() {
            return new Asset(this);
        }
    }
}
```

## What Gets Generated

### ✅ Generated (Domain Models & Enums)

- **Domain Models**: `Activity`, `Asset`, `Balance`, `Order`, `Transaction`, etc.
  - Location: `src/main/java/com/coinbase/prime/model/`
- **Enums**: `OrderSide`, `OrderStatus`, `ActivityType`, etc.
  - Location: `src/main/java/com/coinbase/prime/model/enums/`

### ❌ Not Generated (Service-Specific)

- **Request Classes**: `GetActivityRequest`, `ListPortfoliosRequest`, etc.
  - Reason: Defined in service packages (`activities/`, `portfolios/`)
- **Response Classes**: `GetActivityResponse`, `ListPortfoliosResponse`, etc.
  - Reason: Defined in service packages
- **Service Interfaces**: Services are hand-crafted, not generated

## Troubleshooting

### Issue: "OpenAPI spec not found"

**Symptom**: Error message `OpenAPI spec not found at: apiSpec/prime-public-spec.yaml`

**Solution**:
```bash
# Verify you're in the project root
ls apiSpec/prime-public-spec.yaml

# If missing, you're in the wrong directory
cd /path/to/prime-sdk-java
```

### Issue: Generated models don't compile

**Symptom**: Compilation errors after running generator

**Possible Causes**:
1. **Missing dependencies**: Run `mvn clean install` in project root first
2. **JavaPoet version mismatch**: Check `pom.xml` uses Palantir fork
3. **Malformed OpenAPI spec**: Validate spec with `swagger-cli validate`

**Solution**:
```bash
# Clean and rebuild
cd /path/to/prime-sdk-java
mvn clean install

# If still failing, check OpenAPI spec
npm install -g @apidevtools/swagger-cli
swagger-cli validate apiSpec/prime-public-spec.yaml
```

### Issue: Models not being generated

**Symptom**: Generator runs but no new models appear

**Possible Causes**:
1. **Incremental mode**: Models already exist (expected behavior)
2. **Schema filtering**: Models match ignore patterns
3. **Wrong output directory**: Check logs for actual output location

**Solution**:
```bash
# Check generator logs
cd tools/model-generator
mvn -Pgenerate 2>&1 | tee generator.log

# Look for "Skipped N existing models" - this is normal
# To force regeneration, use --update-all flag

# Force regenerate specific model
rm ../../src/main/java/com/coinbase/prime/model/Asset.java
mvn -Pgenerate
```

### Issue: Web3 models not transformed

**Symptom**: Models still have `Web3` prefix instead of `Onchain`

**Possible Causes**:
1. **Transformation logic not applied**: Check PostProcessor logs
2. **Cached models**: Old models not regenerated

**Solution**:
```bash
# Delete Web3 models and regenerate
rm src/main/java/com/coinbase/prime/model/*Web3*.java
cd tools/model-generator
mvn -Pgenerate
```

### Issue: Boolean getter uses `get` instead of `is`

**Symptom**: `getTradingSupported()` generated instead of `isTradingSupported()`

**Cause**: OpenAPI spec defines field as `string` instead of `boolean`

**Solution**: Update OpenAPI spec:
```yaml
# Wrong
trading_supported:
  type: string

# Correct
trading_supported:
  type: boolean
```

## Best Practices

### DO ✅

- Run generator in **incremental mode** by default
- Review generated files before committing
- Keep OpenAPI spec as single source of truth
- Use feature branches for bulk regeneration
- Test after generation: `mvn clean install`
- Commit OpenAPI spec changes with generated models

### DON'T ❌

- Use `--update-all` without backing up first
- Manually edit generated models (edit spec instead)
- Commit without running tests
- Skip reviewing generated diffs
- Mix manual and generated models

## Command Reference

| Command | Description | Safety |
|---------|-------------|--------|
| `mvn -Pgenerate` | Generate new models only | ✅ Safe |
| `java -jar target/model-generator-1.0.0.jar` | Same as above | ✅ Safe |
| `java -jar target/model-generator-1.0.0.jar --update-all` | Regenerate ALL models | ⚠️ Dangerous |
| `mvn clean package` | Build generator JAR | ✅ Safe |
| `mvn exec:java@generate-models` | Run generator via Maven | ✅ Safe |

## Configuration Files

### .openapi-generator-ignore

Patterns for schemas to skip during generation:

```
*Request.java          # Service-specific requests
*Response.java         # Service-specific responses
Google*.java           # Google infrastructure types
RFQ.java               # Inline schemas
*AllOf*.java           # OpenAPI composition artifacts
```

To add new patterns, edit `tools/model-generator/.openapi-generator-ignore`.

## CI/CD Integration

### GitHub Actions Example

```yaml
name: Generate Models

on:
  pull_request:
    paths:
      - 'apiSpec/prime-public-spec.yaml'

jobs:
  generate:
    runs-on: ubuntu-latest
    steps:
      - uses: actions/checkout@v3
      
      - name: Set up JDK 11
        uses: actions/setup-java@v3
        with:
          java-version: '11'
          
      - name: Generate models
        run: |
          cd tools/model-generator
          mvn -Pgenerate
          
      - name: Check for changes
        run: |
          if [[ -n $(git status --porcelain) ]]; then
            echo "New models generated. Please review and commit."
            git diff
            exit 1
          fi
```

## Related Documentation

- [OpenAPI Specification](../apiSpec/prime-public-spec.yaml)
- [Palantir JavaPoet](https://github.com/palantir/javapoet)
- [OpenAPI Generator](https://openapi-generator.tech/)
- [Prime SDK Documentation](../../README.md)

## Support

For issues or questions:
1. Check this README first
2. Review existing models for patterns
3. Validate OpenAPI spec with `swagger-cli`
4. Check generator logs for specific errors