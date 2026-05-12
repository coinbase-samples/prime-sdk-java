# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## AI Documentation

The `ai-docs/` directory contains detailed analysis and coverage reports maintained by AI agents:
- **MODEL_GENERATION_ANALYSIS.md**: Investigation of model generation tool behavior and missing models
- **ACCURATE_COVERAGE_SUMMARY.md**: Human-readable API coverage summary (~98% functional coverage)
- **API_COVERAGE_REPORT.md**: Technical coverage analysis with detailed breakdowns
- **README.md**: Guide to using these documents

Refer to these documents when working on endpoint implementation or troubleshooting spec drift and coverage.

## Build Commands

This is a Maven-based Java project (Java 11+). Common development commands:

- **Build**: `mvn clean install`
- **Compile only**: `mvn compile`
- **Run tests**: `mvn test`
- **Run integration tests**: `mvn verify` (uses maven-failsafe-plugin)
- **Generate Javadoc**: `mvn javadoc:javadoc`
- **Clean build artifacts**: `mvn clean`
- **Package with sources**: `mvn package` (automatically includes source JAR)
- **Sign artifacts**: `mvn verify` (includes GPG signing for releases)

## Architecture Overview

This is the **Coinbase Prime Java SDK** - a sample library for interacting with Coinbase Prime REST APIs. Key architectural patterns:

### Service Layer Pattern
- **PrimeServiceFactory**: Factory class that creates service instances for different API domains (update when adding services so it stays in sync with the OpenAPI spec)
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
- `com.coinbase.prime.common`: Shared base classes (e.g., `PrimeListRequest`)
- `com.coinbase.prime.errors`: Exception hierarchy and error handling
- `com.coinbase.prime.utils`: Utility classes and constants
- `com.coinbase.prime.*`: 20+ service packages covering all API domains
- `com.coinbase.examples`: Working usage examples

### Service Packages (API Domains)
All follow consistent `[Domain]Service` interface + `[Domain]ServiceImpl` pattern:
- `activities`: Portfolio and entity activity tracking
- `addressbook`: Address book management  
- `allocations`: Trade allocation and netting
- `assets`: Asset information and listings
- `balances`: Portfolio, wallet, and entity balances
- `commission`: Commission information
- `financing`: Margin, credit, locates, interest operations
- `futures`: FCM operations, futures trading, sweeps
- `invoice`: Invoice management
- `onchainaddressbook` & `onchainaddressgroups`: On-chain address management
- `orders`: Order creation, fills, quotes, edit history
- `paymentmethods`: Entity payment methods
- `portfolios`: Portfolio information and listing
- `positions`: Position tracking (entity and aggregate)
- `products`: Trading products
- `staking`: Staking and unstaking operations
- `transactions`: Transfers, withdrawals, conversions
- `users`: User management
- `wallets`: Wallet creation and deposit addresses

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
- `Main.java` - Complete portfolio retrieval example showing credential setup and service usage
- `CreateOrder.java` - Market order creation and status polling
- **Warning**: `CreateOrder.java` places a real market order for a small amount of ADA

### Environment Setup
- **Credentials**: Set `COINBASE_PRIME_CREDENTIALS` environment variable with JSON containing `accessKey`, `passphrase`, and `signingKey`
- **Portfolio ID**: Set `COINBASE_PRIME_PORTFOLIO_ID` for examples that require a specific portfolio

## OpenAPI Specification & SDK maintenance

### OpenAPI Specification
- **Primary spec**: `apiSpec/prime-public-spec.yaml` - The authoritative source for all endpoint definitions (committed in-repo; refresh with `make fetch-spec`).
- **Format**: OpenAPI 3.0.1 specification
- **Server**: https://api.prime.coinbase.com/
- **Backup spec**: `openapi/prime-public-api-spec.json`

### Spec-driven maintenance
- Domain models in `com.coinbase.prime.model`, enums in `com.coinbase.prime.model.enums`, per-operation `*Request`/`*Response`, `*Service`/`*ServiceImpl`, and `PrimeServiceFactory` are **hand-maintained** to match the OpenAPI specification and the patterns in this document.
- Use the `update-sdk-spec` skill in the `ai-prompts` repository for a repeatable spec-update workflow (diff analysis, branching, examples, changelog).

### Development Workflow
When the OpenAPI spec adds or changes operations:

1. **Reference the live spec** (or `apiSpec/prime-public-spec.yaml` when fetched) as the source of truth
2. **Update Java**: add or change models, enums, request/response types, services, and factory wiring
3. **Build**: `mvn clean install` and fix compile/test failures

**Hand-maintained roots** (extend only where the spec requires): `com.coinbase.prime.common` (e.g. `PrimeListRequest`, `Pagination`), credentials/client/utils, and **curated** examples under `com.coinbase.examples`

### Endpoint Discovery
To identify available endpoints:
- Parse `apiSpec/prime-public-spec.yaml` directly
- Group endpoints by their OpenAPI `tags` field
- Each tag corresponds to a Java package (e.g., `orders`, `portfolios`, `wallets`)
- Extract operation IDs, paths, and schemas for implementation

### Java Naming Conventions from OpenAPI

**Core Principle**: Follow OpenAPI operation IDs exactly, with exceptions for batch operations.

**Terminology Mapping**: When processing OpenAPI specifications, replace "Web3" with "Onchain" in Java code generation:
- **Java class names**: `Web3Address` → `OnchainAddress`
- **Java method names**: `createWeb3Transaction` → `createOnchainTransaction`
- **Java property names**: `web3Status` → `onchainStatus`
- **PRESERVE unchanged**: Enum values, endpoint URIs, and JSON property mappings (use original OpenAPI values)

#### Naming Rules
1. **Single Item Operations**: Use OpenAPI operation ID directly
   - `PrimeRESTAPI_GetActivity` → `GetActivity`
   - `PrimeRESTAPI_GetOrder` → `GetOrder`
   - `PrimeRESTAPI_GetTransaction` → `GetTransaction`

2. **Collection Operations**: Replace `Get` with `List` for GET requests that return collections/arrays
   - `PrimeRESTAPI_GetPortfolios` → `ListPortfolios`
   - `PrimeRESTAPI_GetActivities` → `ListActivities`
   - `PrimeRESTAPI_GetOrders` → `ListOrders`
   - Any GET endpoint returning an array/collection → `List` prefix (e.g., `GetAddresses` → `ListAddresses`)

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

### AI Agent Development Workflow
For adding new endpoints or updating existing ones using AI agents:

1. **Analyze OpenAPI Specification**: AI agent reads `apiSpec/prime-public-spec.yaml` directly
2. **Process by Tags**: Group endpoints by OpenAPI tags (e.g., Activities, Wallets, Orders)
3. **Add or update service methods**: Follow SDK naming conventions (List vs Get)
4. **Add or update models**: Align request/response and component schemas with the spec
5. **Apply patterns**: Use established SDK patterns for consistency
6. **Validate**: Ensure `mvn compile` passes after updates

### Full Coverage Requirement
**IMPORTANT**: Spec updates should aim for **100% coverage** of the OpenAPI specification. This includes:

- **All endpoints**: Every operation defined in the OpenAPI spec must be implemented
- **All models**: Every schema in `components.schemas` must have corresponding Java classes
- **All enums**: Every enum type must be properly implemented in `com.coinbase.prime.model.enums`
- **All request/response types**: Complete coverage of all API input/output models
- **All service domains**: Every OpenAPI tag must have a corresponding service

The SDK should achieve complete feature parity with the OpenAPI specification. When a spec update is made, ALL missing models, endpoints, and changes should be addressed — no prioritization or partial implementation.

### Coverage Validation
When updating code:
1. **Endpoint Coverage**: Verify all `operationId` entries from OpenAPI spec are implemented
2. **Model Coverage**: Verify all `components.schemas` entries have corresponding Java classes
3. **Service Coverage**: Verify all OpenAPI tags have corresponding service classes
4. **Missing Features**: Identify and implement any missing Web3, NFT, staking, or advanced trading features

### Rapid update process
1. Identify ALL missing objects from OpenAPI analysis (not build errors)
2. Plan parallelized batches by domain (FCM, Staking, Orders, etc.)
3. Use template files for structure (package, imports, Builder pattern)
4. Apply changes domain by domain
5. Run `mvn compile` ONCE after substantive edits complete
6. Fix any compilation errors rapidly in batch

## Development Patterns

When adding new functionality, follow the established patterns:
1. Create service interface in appropriate package
2. Implement service with `ServiceImpl` class
3. Add factory method to `PrimeServiceFactory`
4. Use Builder pattern for request/response classes
5. Place domain models in `src/main/java/com/coinbase/prime/model/` package
6. Place enums in `src/main/java/com/coinbase/prime/model/enums/` package

### Java implementation guidelines

#### Service methods
Each OpenAPI operation should have:
1. **Method**: `{OperationName}({RequestType} request) throws CoinbasePrimeException`
2. **Builder pattern**: Request classes use Builder pattern for construction

#### Request/response types
- **Request models**: Path parameters and query parameters → `{OperationName}Request` (in service package)
- **Response models**: Response schema → `{OperationName}Response` (in service package)
- **Nested models**: Component schemas → individual model classes in `src/main/java/com/coinbase/prime/model/`
- **Enums**: All enum types → `src/main/java/com/coinbase/prime/model/enums/`

#### HTTP Method Mapping
- `GET` → Service method returning response object
- `POST` → Service method accepting request body + response object  
- `PUT/PATCH` → Service method accepting request body + response object
- `DELETE` → Service method with optional request/response

#### Naming Conventions
- **Classes**: PascalCase (e.g., `CreateAllocationRequest`)
- **Properties**: camelCase with Jackson annotation mapping (e.g., `@JsonProperty("portfolio_id") private String portfolioId`)
- **Enums**: Use standard OpenAPI names (e.g., `FCM_MARGIN_CALL_STATE_CLOSED`) - Jackson handles serialization
- **Methods**: camelCase matching operation name

#### File Organization
- **Services**: `src/main/java/com/coinbase/prime/{domain}/{Domain}Service.java` and `{Domain}ServiceImpl.java`
- **Domain Models**: `src/main/java/com/coinbase/prime/model/{ModelName}.java`
- **Enums**: `src/main/java/com/coinbase/prime/model/enums/{EnumName}.java`
- **Requests/Responses**: Co-located with service in domain package (`src/main/java/com/coinbase/prime/{domain}/`)

## Changelog Management

### Format Requirements
- Use only **Added**, **Changed**, and **Fixed** sections
- Consolidate unreleased versions into single entries
- Be specific: list actual endpoint names, model names, and enum names
- Avoid subjective language or marketing terms

### Version Consolidation
- Combine unreleased versions (e.g., 1.4.0 + 1.5.0 → 1.4.0)
- Use most recent planned release date
- Maintain all changes from consolidated versions

### Maven Distribution
- **Maven Central**: Available at coordinates `com.coinbase.prime:coinbase-prime-sdk-java`
- **Repository**: Uses Sonatype OSSRH for staging and releases
- **Versioning**: Current version 1.4.0 (check pom.xml for latest)
- **Signing**: Artifacts are GPG-signed for security

### Project Metadata
- **License**: Apache License 2.0
- **Repository**: https://github.com/coinbase-samples/prime-sdk-java
- **Organization**: Coinbase Solutions Architects team