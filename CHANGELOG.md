# Changelog

## [1.4.0] - 2025-08-06

### Added
- Complete OpenAPI specification compliance with 100% endpoint coverage
- Updated OpenAPI specification file `apiSpec/prime-public-spec.yaml` 
- New service domains and comprehensive endpoint support:
  - **Futures Trading (FCM)**: Full FCM operations, margin calls, risk limits, positions, and sweeps
  - **Staking Services**: Portfolio staking initiation, unstaking, rewards, and yield tracking
  - **Advanced Transaction Management**: Wallet transfers, withdrawals, and enhanced transaction tracking
  - **User Management**: Entity and portfolio user listing and management
  - **Payment Methods**: Complete payment method management with detailed information
  - **On-chain Address Management**: Separate services for address book and address groups
  - **Enhanced Asset Management**: Entity-level asset listing and management
  - **Order Edit History**: Complete order modification tracking and history
  - **Enhanced Activities**: Portfolio-level activity tracking with detailed metadata

### Enhanced
- **Model Coverage**: Added 50+ new domain models including:
  - FCM-specific models: `FcmBalance`, `FcmMarginCall`, `FcmPosition`, `FcmRiskLimits`
  - Staking models: `StakingBalance`, `StakingPosition`, `StakingReward`, `StakingYield`
  - Advanced trading: `OrderEdit`, `LimitOrderEdit`, `Fill`, `QuoteResponse`
  - Payment infrastructure: `PaymentMethodDetails`, `EntityPaymentMethod`
  - On-chain operations: `OnchainWalletBalance`, `BlockchainAddress`

- **Enum Coverage**: Added 30+ new enums for comprehensive type safety:
  - FCM enums: `FcmPositionSide`, `FcmMarginCallState`, `FcmMarginCallType`
  - Staking enums: `StakingStatus`, `StakingRewardType`, `UnbondingStatus`
  - Trading enums: `PositionSide`, `PositionStatus`, `PositionType`
  - Infrastructure enums: `NetworkFamily`, `WalletVisibility`, `ProductPermissions`

- **Service Architecture**: Implemented consistent service patterns across all domains
  - Standardized request/response patterns with Builder design
  - Comprehensive error handling and validation
  - Factory-based service instantiation

### Changed
- **Naming Conventions**: Standardized "Onchain" terminology (replacing "Web3" in Java code)
- **Service Methods**: Improved method naming consistency (List vs Get operations)
- **Request/Response Models**: Enhanced Builder patterns for all API operations
- **Package Structure**: Organized services by domain with clear separation of concerns

### Technical Improvements
- **OpenAPI Alignment**: Achieved 100% coverage of all endpoints in the OpenAPI specification
- **Code Generation**: Implemented AI-assisted code generation workflow for rapid SDK updates
- **Documentation**: Enhanced CLAUDE.md with comprehensive development guidelines
- **Build Process**: Maintained Maven compatibility and release processes

### Breaking Changes
- Service method names updated for consistency (e.g., `GetPortfolios` → `ListPortfolios`)
- Package restructuring for on-chain address management (separate `onchainaddressbook` and `onchainaddressgroups`)
- Model property naming aligned with OpenAPI specification

This release represents a major milestone in SDK completeness, providing full coverage of the Coinbase Prime API surface area with modern Java patterns and comprehensive type safety.

## [1.3.0] - 2025-MAY-15

### Added

- Entity Endpoints
  - ListEntityBalances
  - ListAggregateEntityPositions
  - ListEntityPositions
- Futures Endpoints
  - cancelEntityFuturesSweep
  - getEntityFcmBalance
  - getEntityPositions
  - listEntityFuturesSweeps
  - scheduleEntityFuturesSweeps
  - setAutoSweep
- RFQ Endpoints
  - createQuoteRequest
  - acceptQuote
- Prime Financing Endpoints
  - listExistingLocations
  - listInterestAccruals
  - listPortfolioInterestAccruals
  - listMarginCallSummaries
  - listMarginConversions
  - getEntityLocateAvailabilities
  - getMarginInformation
  - getPortfolioBuyingPower
  - getPortfolioCreditInformation
  - getPortfolioWithdrawalPower
  - getTieredPricingFees
  - createNewLocates
- Prime Staking Endpoints
  - CreateStake
  - CreateUnstake
- Moved all models to one communal package for easier export
- Moved all Request/Response object to service specific package
