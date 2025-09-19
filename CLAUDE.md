# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

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

## OpenAPI Specification & Code Generation

### OpenAPI Specification
- **Primary spec**: `apiSpec/prime-public-spec.yaml` - The authoritative source for all endpoint definitions
- **Format**: OpenAPI 3.0.1 specification
- **Server**: https://api.prime.coinbase.com/
- **Backup spec**: `openapi/prime-public-api-spec.json`

### AI Agent Code Generation

#### Speed Optimization for Object Generation
**PRIORITY: Execute quickly, validate afterwards**

**Parallelized Fast Generation Strategy:**
1. **Analyze entire OpenAPI spec** first to identify all missing components
2. **Plan batches by domain** - group related models/services together (e.g., FCM, Staking, Orders)
3. **Execute multiple Task agents in parallel** - generate 5-10 models simultaneously across domains
4. **NO premature validation** - generate ALL files first, validate once at the end
5. **Template-based rapid creation** - copy existing files and modify rather than create from scratch
6. **Single build validation** - run `mvn compile` only after all generation is complete

**Parallelization Implementation:**
```
// Execute multiple Task agents simultaneously in a single message
Task 1: Generate FCM models (3 files)
Task 2: Generate Staking models (5 files) 
Task 3: Generate Invoice models (5 files)
Task 4: Generate Margin models (7 files)
Task 5: Generate Misc models (7 files)
Task 6: Generate Wallet models (3 files)
Task 7: Generate Order models (3 files)
Task 8: Generate Service A
Task 9: Generate Service B
```

**Fast Template-Based Approach:**
1. **Use existing files as templates** - copy/modify instead of creating from scratch
2. **Batch creation** - generate 5-10 files rapidly per task
3. **Focus on compilation first** - get objects created and building, refine schema compliance later
4. **Template pattern**: Copy existing request/response pair → Search/replace service names → Adjust properties

**Template Locations:**
- Request template: `activities/ListActivitiesRequest.java` 
- Response template: `activities/ListActivitiesResponse.java`
- Single object response: `activities/GetActivityResponse.java`
- Service interface: `activities/ActivitiesService.java`
- Service implementation: `activities/ActivitiesServiceImpl.java`

### Development Workflow
When implementing new endpoints, pull endpoint definitions directly from the OpenAPI specification:

1. **Reference OpenAPI spec**: Use `apiSpec/prime-public-spec.yaml` as the source of truth for all endpoint definitions
2. **Extract by tags**: Organize endpoints by their OpenAPI tags to determine package structure
3. **Follow Java patterns**: Use existing service implementations as templates
4. **Generate classes**: Create Request/Response classes using Builder patterns
5. **Update factory**: Add new services to `PrimeServiceFactory`

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
3. **Generate Service Methods**: Create methods following SDK naming conventions (List vs Get)
4. **Generate Models**: Extract and create request/response models from OpenAPI schemas
5. **Apply Patterns**: Use established SDK patterns for consistency
6. **Validate**: Ensure `mvn compile` passes after generation

### Full Coverage Requirement
**IMPORTANT**: Any code generation request intends for **100% coverage** of the OpenAPI specification. This includes:

- **All endpoints**: Every operation defined in the OpenAPI spec must be implemented
- **All models**: Every schema in `components.schemas` must have corresponding Java classes
- **All enums**: Every enum type must be properly implemented in `com.coinbase.prime.model.enums`
- **All request/response types**: Complete coverage of all API input/output models
- **All service domains**: Every OpenAPI tag must have a corresponding service

The SDK should achieve complete feature parity with the OpenAPI specification. When a generation request is made, ALL missing models, endpoints, and changes must be generated - no prioritization or partial implementation.

### Coverage Validation
When generating or updating code:
1. **Endpoint Coverage**: Verify all `operationId` entries from OpenAPI spec are implemented
2. **Model Coverage**: Verify all `components.schemas` entries have corresponding Java classes
3. **Service Coverage**: Verify all OpenAPI tags have corresponding service classes
4. **Missing Features**: Identify and implement any missing Web3, NFT, staking, or advanced trading features

### Rapid Generation Process
1. Identify ALL missing objects from OpenAPI analysis (not build errors)
2. Plan parallelized batches by domain (FCM, Staking, Orders, etc.)
3. Use template files for structure (package, imports, Builder pattern)
4. Launch multiple generation tasks simultaneously 
5. Run `mvn compile` ONCE after all generation completes
6. Fix any compilation errors rapidly in batch

## Development Patterns

When adding new functionality, follow the established patterns:
1. Create service interface in appropriate package
2. Implement service with `ServiceImpl` class
3. Add factory method to `PrimeServiceFactory`
4. Use Builder pattern for request/response classes
5. Place domain models in `src/main/java/com/coinbase/prime/model/` package
6. Place enums in `src/main/java/com/coinbase/prime/model/enums/` package

### Java Generation Guidelines

#### Service Method Generation
Each OpenAPI operation should generate:
1. **Method**: `{OperationName}({RequestType} request) throws CoinbasePrimeException`
2. **Builder pattern**: Request classes use Builder pattern for construction

#### Request/Response Model Generation
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