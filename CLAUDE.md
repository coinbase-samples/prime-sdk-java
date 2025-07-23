# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Build Commands

This is a Maven-based Java project. Common development commands:

- **Build**: `mvn clean install`
- **Compile only**: `mvn compile`
- **Run tests**: `mvn test`
- **Run integration tests**: `mvn verify`
- **Generate Javadoc**: `mvn javadoc:javadoc`
- **Clean build artifacts**: `mvn clean`

## Architecture Overview

This is the **Coinbase Prime Java SDK** - a sample library for interacting with Coinbase Prime REST APIs. Key architectural patterns:

### Service Layer Pattern
- **PrimeServiceFactory**: Factory class that creates service instances for different API domains
- **Service interfaces**: Each API domain (Orders, Portfolios, Wallets, etc.) has a corresponding service interface
- **Service implementations**: Concrete implementations ending with `ServiceImpl` that handle HTTP communication

### Core Components
- **CoinbasePrimeClient**: Main HTTP client that extends `CoinbaseNetHttpClient` from `coinbase-core-java` 
- **CoinbasePrimeCredentials**: Handles API authentication using access key, passphrase, and signing key
- **Request/Response pattern**: Each API operation has dedicated request and response classes using Builder patterns

### Package Structure
- `com.coinbase.prime.client`: Core HTTP client
- `com.coinbase.prime.credentials`: Authentication handling  
- `com.coinbase.prime.factory`: Service factory
- `com.coinbase.prime.model`: Domain models and enums
- `com.coinbase.prime.*`: Service packages (orders, portfolios, wallets, etc.)
- `com.coinbase.examples`: Usage examples

### Dependencies
- **Jackson**: JSON serialization/deserialization (version 2.16.1)
- **coinbase-core-java**: Base HTTP client functionality (version 1.0.1)
- Uses standard Java 11+ HTTP client

### Error Handling
- Custom exception hierarchy with `CoinbasePrimeException`
- Error responses parsed into `CoinbasePrimeErrorMessage` objects
- HTTP status codes and error details preserved

### Authentication Flow
- Credentials loaded from JSON environment variable `COINBASE_PRIME_CREDENTIALS`
- HMAC-SHA256 signatures generated for each request
- Headers: CB-ACCESS-KEY, CB-ACCESS-SIGNATURE, CB-ACCESS-TIMESTAMP, CB-ACCESS-PHRASE

### Examples Location
Working examples available in `src/main/java/com/coinbase/examples/` including:
- CreateOrder.java - Market order creation and status polling
- Other API operation examples

## Code Generation and API Analysis

### AI-Metadata Tooling
This repository includes comprehensive analysis tooling for automated analysis and code generation:

**Location**: `tools/code-generation/`
- `prime_sdk_analyzer.py`: Consolidated analysis tool with multiple modes and output formats

**Usage**:
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

### OpenAPI Specification
- **Primary spec**: `apiSpec/prime-public-spec.yaml` (7,353 lines, 77 endpoints, 20 domains)
- **Backup spec**: `openapi/prime-public-api-spec.json`
- **Coverage**: Analysis shows 130% implementation coverage (some packages implement more than spec requires)

### Code Generation Workflow
When implementing new endpoints:
1. **Analyze gaps**: Run `complete_endpoint_analysis.py` to identify missing endpoints
2. **Review OpenAPI spec**: Check `apiSpec/prime-public-spec.yaml` for endpoint details
3. **Follow Java patterns**: Use existing service implementations as templates
4. **Generate classes**: Create Request/Response classes using Builder patterns
5. **Update factory**: Add new services to `PrimeServiceFactory`

### Java Naming Conventions from OpenAPI

**Core Principle**: Follow OpenAPI operation IDs exactly, with exceptions for batch operations.

#### Naming Rules
1. **Single Item Operations**: Use OpenAPI operation ID directly
   - `PrimeRESTAPI_GetActivity` → `GetActivity`
   - `PrimeRESTAPI_GetOrder` → `GetOrder`
   - `PrimeRESTAPI_GetTransaction` → `GetTransaction`

2. **Batch Operations**: Replace `Get` with `List` for operations returning multiple items
   - `PrimeRESTAPI_GetPortfolios` → `ListPortfolios`
   - `PrimeRESTAPI_GetActivities` → `ListActivities`
   - `PrimeRESTAPI_GetOrders` → `ListOrders`

3. **Package Mapping**: Convert OpenAPI tags to Java packages
   - **Tag**: `Address Book` → **Package**: `com.coinbase.prime.addressbook`
   - **Tag**: `Onchain Address Groups` → **Package**: `com.coinbase.prime.onchainaddressgroups`

4. **File Naming**: Standard Java patterns
   - **Request**: `GetActivityRequest.java`, `ListPortfoliosRequest.java`
   - **Response**: `GetActivityResponse.java`, `ListPortfoliosResponse.java`
   - **Service**: `ActivitiesService.java`, `ActivitiesServiceImpl.java`

#### Batch Operation Detection
An operation is considered "batch" if:
- OpenAPI operation ID contains `Get` + plural noun (e.g., `GetPortfolios`)
- OpenAPI summary contains "List" or "Get all"
- HTTP GET request with no ID parameter at the end of the path

#### Examples
```
OpenAPI Operation ID          → Java Class Name
PrimeRESTAPI_GetActivity      → GetActivity (single item)
PrimeRESTAPI_GetPortfolios    → ListPortfolios (batch)
PrimeRESTAPI_CreateOrder      → CreateOrder (unchanged)
PrimeRESTAPI_GetActivities    → ListActivities (batch)
```

When adding new functionality, follow the established patterns:
1. Create service interface in appropriate package
2. Implement service with `ServiceImpl` class
3. Add factory method to `PrimeServiceFactory`
4. Use Builder pattern for request/response classes
5. Place models in `com.coinbase.prime.model` package