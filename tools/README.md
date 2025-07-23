# SDK Development Tools

This directory contains tools and utilities for developing and maintaining the Coinbase Prime Java SDK.

## Code Generation Tools

The `code-generation/` directory contains Python scripts that help analyze and generate code from the OpenAPI specification:

- `extract_endpoints_v2.py`: Extracts and catalogs all endpoints from the OpenAPI spec
- `complete_endpoint_analysis.py`: Performs gap analysis between the OpenAPI spec and current Java SDK implementation

## Workflow for Contributors

1. **Start with the OpenAPI Spec**: Review `apiSpec/prime-public-spec.yaml` for any changes
2. **Analyze Endpoints**: Use the tools to understand the API surface and identify gaps
3. **Compare Implementation**: Review existing Java services against the OpenAPI specification
4. **Follow Java Patterns**: Use existing service implementations as templates for new endpoints

## Usage

```bash
# Analyze all endpoints
python tools/code-generation/extract_endpoints_v2.py

# Generate implementation gap analysis
python tools/code-generation/complete_endpoint_analysis.py
```

## Update Process

When the OpenAPI specification changes:

1. Update `apiSpec/prime-public-spec.yaml`
2. Run endpoint analysis tools to identify changes
3. Review tool output for new endpoints or modifications
4. Implement missing endpoints following existing Java patterns
5. Update service factories and example code as needed

These tools help developers and AI agents understand the API surface, identify implementation gaps, and maintain specification compliance for the Java SDK.