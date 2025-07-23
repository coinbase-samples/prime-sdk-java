# SDK Development Tools

This directory contains tools and utilities for developing and maintaining the Coinbase Prime Java SDK.

## Code Generation Tools

The `code-generation/` directory contains a comprehensive analysis tool for the OpenAPI specification and Java SDK implementation:

- **`prime_sdk_analyzer.py`**: Consolidated analysis tool with multiple modes
  - Gap analysis: Compare OpenAPI spec with Java implementation
  - Naming analysis: Check naming conventions and suggest standardizations  
  - Coverage reporting: Detailed implementation status
  - Endpoint extraction: Parse and catalog OpenAPI endpoints

## Workflow for Contributors

1. **Start with the OpenAPI Spec**: Review `apiSpec/prime-public-spec.yaml` for any changes
2. **Analyze Endpoints**: Use the analyzer to understand the API surface and identify gaps
3. **Compare Implementation**: Review existing Java services against the OpenAPI specification
4. **Follow Java Patterns**: Use existing service implementations as templates for new endpoints

## Usage

```bash
# Basic gap analysis (default)
python tools/code-generation/prime_sdk_analyzer.py

# All analyses combined
python tools/code-generation/prime_sdk_analyzer.py --mode all

# Specific analysis modes
python tools/code-generation/prime_sdk_analyzer.py --mode naming
python tools/code-generation/prime_sdk_analyzer.py --mode coverage
python tools/code-generation/prime_sdk_analyzer.py --mode endpoints

# JSON output for automation
python tools/code-generation/prime_sdk_analyzer.py --mode all --output json
```

## Update Process

When the OpenAPI specification changes:

1. Update `apiSpec/prime-public-spec.yaml`
2. Run endpoint analysis tools to identify changes
3. Review tool output for new endpoints or modifications
4. Implement missing endpoints following existing Java patterns
5. Update service factories and example code as needed

These tools help developers and AI agents understand the API surface, identify implementation gaps, and maintain specification compliance for the Java SDK.