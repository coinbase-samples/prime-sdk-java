# Cross-SDK Consistency Strategy

This document outlines how to maintain consistency across Coinbase Prime SDKs while respecting language-specific conventions.

## Shared Metadata Approach

### 1. Common Metadata File
**Location**: `tools/code-generation/cross_sdk_metadata.json`

This file contains:
- **Naming conventions** for all supported languages
- **Operation mappings** (OpenAPI → language-specific names)
- **Common patterns** (auth, pagination, error handling)
- **Missing endpoints tracking** across all SDKs

### 2. Naming Convention Consistency

#### Core Principle (Cross-Language)
**Follow OpenAPI operation IDs with language-specific adaptations for batch operations**

#### Batch Operation Rules (Consistent Across Languages)
```json
{
  "detection_rules": [
    "OpenAPI operation ID contains Get + plural noun",
    "OpenAPI summary contains 'List' or 'Get all'", 
    "HTTP GET request with no ID parameter at end of path"
  ],
  "language_mappings": {
    "java": "Replace 'Get' with 'List'",
    "csharp": "Replace 'Get' with 'List'",
    "python": "Replace 'get' with 'list'",
    "javascript": "Replace 'get' with 'list'"
  }
}
```

#### Examples (Cross-Language)
| OpenAPI Operation ID | Java | C# | Python | JavaScript |
|---------------------|------|----|---------|-----------| 
| `PrimeRESTAPI_GetActivity` | `GetActivity` | `GetActivity` | `get_activity` | `getActivity` |
| `PrimeRESTAPI_GetPortfolios` | `ListPortfolios` | `ListPortfolios` | `list_portfolios` | `listPortfolios` |
| `PrimeRESTAPI_CreateOrder` | `CreateOrder` | `CreateOrder` | `create_order` | `createOrder` |

### 3. Package/Namespace Structure

#### Pattern (Consistent Logic)
```
{root_namespace}.{tag_converted_to_language_convention}
```

#### Language Mappings
- **Java**: `com.coinbase.prime.{tag_lowercase_nospaces}`
- **C#**: `CoinbasePrime.{TagPascalCase}`  
- **Python**: `coinbase_prime.{tag_lowercase_underscores}`
- **JavaScript**: `coinbasePrime{TagPascalCase}`

#### Examples
| OpenAPI Tag | Java | C# | Python | JavaScript |
|-------------|------|----|---------|-----------| 
| `Address Book` | `addressbook` | `AddressBook` | `address_book` | `AddressBook` |
| `Onchain Address Groups` | `onchainaddressgroups` | `OnchainAddressGroups` | `onchain_address_groups` | `OnchainAddressGroups` |

### 4. Common Patterns (Language-Agnostic)

#### Authentication
- **Method**: HMAC-SHA256 (all SDKs)
- **Headers**: `CB-ACCESS-KEY`, `CB-ACCESS-SIGNATURE`, `CB-ACCESS-TIMESTAMP`, `CB-ACCESS-PHRASE`
- **Credentials Source**: `COINBASE_PRIME_CREDENTIALS` environment variable
- **Credential Format**: JSON with access_key, passphrase, signing_key

#### Pagination  
- **Request Parameters**: `cursor`, `limit`, `sort_direction` (all SDKs)
- **Response Field**: `pagination` object
- **Default Limit**: 100 (all SDKs)
- **Maximum Limit**: 3000 (all SDKs)

#### Error Handling
- **HTTP Status Preservation**: All SDKs preserve original HTTP status codes
- **Error Message Extraction**: Parse API error responses into structured format
- **Exception Hierarchy**: Language-specific base exception with common error details

### 5. Implementation Guidelines

#### For Java SDK
1. Use the shared metadata file to validate naming conventions
2. Run cross-SDK consistency checks before releases
3. Update metadata file when adding new endpoints
4. Follow Builder pattern for request classes (Java-specific)

#### For .NET SDK  
1. Reference the same shared metadata file
2. Use language-appropriate patterns (interfaces, async/await)
3. Maintain consistency in operation naming with Java SDK
4. Follow C# conventions for file organization

#### For Future SDKs (Python, JavaScript, etc.)
1. Start with the shared metadata file
2. Apply language-specific naming conventions consistently
3. Maintain the same core patterns (auth, pagination, errors)
4. Add language mappings to the shared metadata

### 6. Tooling for Consistency

#### Cross-SDK Validation Script
**Location**: `tools/code-generation/validate_cross_sdk_consistency.py`

This script:
- Compares operation names across SDKs
- Validates package/namespace mappings
- Checks for missing endpoints in any SDK
- Ensures common patterns are implemented consistently

#### Usage
```bash
# Validate Java SDK against metadata
python tools/code-generation/validate_cross_sdk_consistency.py --sdk java

# Compare Java and .NET SDKs
python tools/code-generation/validate_cross_sdk_consistency.py --compare java dotnet

# Update metadata from OpenAPI spec
python tools/code-generation/validate_cross_sdk_consistency.py --update-metadata
```

### 7. Shared Documentation

#### README Consistency
Each SDK should have:
- Same installation instructions format
- Same authentication setup examples  
- Same basic usage patterns
- Consistent API reference structure

#### Example Code Consistency
Common examples across all SDKs:
- Create order example
- List portfolios example
- Get wallet balance example
- Error handling example

### 8. Release Coordination

#### Version Alignment
- Major versions should align across SDKs when possible
- Feature parity tracking in shared metadata
- Coordinated releases for new API endpoints

#### Change Management
1. Update OpenAPI spec first
2. Update shared metadata file
3. Generate/update all SDKs using metadata
4. Validate cross-SDK consistency
5. Release SDKs in coordinated manner

## Benefits

1. **Predictable API**: Developers can predict method names across languages
2. **Easier Maintenance**: Shared metadata reduces duplication
3. **Consistent Documentation**: Common patterns across all SDK docs
4. **Quality Assurance**: Automated validation prevents drift
5. **Faster Development**: New SDKs can bootstrap from existing metadata

## Next Steps

1. ✅ Document naming conventions in Java SDK
2. 🔄 Create shared metadata file 
3. ⏳ Implement cross-SDK validation tooling
4. ⏳ Apply same approach to .NET SDK
5. ⏳ Create shared documentation templates