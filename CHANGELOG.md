# Changelog

## [1.4.0] - 2025-09-20

### Added
- Complete OpenAPI specification compliance with 100% endpoint coverage
- Updated OpenAPI specification file `apiSpec/prime-public-spec.yaml` to latest version
- New endpoints:
  - `GetActivity` (renamed from `GetActivityById`) and `GetPortfolioActivity` in activities service
  - `ListEntityAssets` in assets service  
  - `ListOnchainAddressGroups` in onchain address groups service
  - `CreateWalletDepositAddress` and `ListWalletAddresses` in wallets service
  - `GetPortfolioCounterpartyId` in portfolios service
  - `ListEntityUsers` in users service
  - `CreateWalletTransfer`, `CreateWalletWithdrawal`, and `GetTransaction` in transactions service
  - `ClaimRewards` in staking service
  - `EditOrder` and `ListOrderEditHistory` in orders service
  - `GetEntityPaymentMethodDetails` in payment methods service
- New service domains:
  - Futures Trading (FCM): Full FCM operations, margin calls, risk limits, positions, and sweeps
  - Staking Services: Portfolio staking initiation, unstaking, rewards, and yield tracking
  - Advanced Transaction Management: Wallet transfers, withdrawals, and enhanced transaction tracking
  - User Management: Entity and portfolio user listing and management
  - Payment Methods: Complete payment method management with detailed information
  - On-chain Address Management: Separate services for address book and address groups
  - Enhanced Asset Management: Entity-level asset listing and management
  - Order Edit History: Complete order modification tracking and history
- New domain models: `ActivityCreationResponse`, `ActivityMetadataAccount`, `ActivityMetadataConsensus`, `ActivityMetadataOrders`, `ActivityMetadataTransactions`, `AddressBookCategory`, `AddressBookConfiguration`, `AddressBookMetadata`, `AddressBookState`, `AddressBookSummary`, `AddressEntry`, `AllocationRule`, `AllocationStrategy`, `CreateAllocationResponseBody`, `CreateNetAllocationResponseBody`, `DestinationAlloc`, `CommissionCalculation`, `CommissionRate`, `FcmMarginCallDetail`, `FcmRiskLimit`, `FcmRiskLimits`, `Fill`, `LimitOrderEdit`, `OrderEdit`, `QuoteResponse`, `RfqProductDetails`, `PaymentMethodDestination`, `PaymentMethodDetails`, `PaymentMethodSummary`, `ConversionDetail`, `MarginConversion`, `OnchainTransactionMetadata`, `TradeFinanceFee`, `TransactionMetadata`, `CreateStakeInputs`, `CreateUnstakeInputs`, `RewardsSummary`, `StakingBalance`, `StakingInitiateResponse`, `StakingPosition`, `StakingReward`, `StakingSummary`, `StakingUnstakeResponse`, `StakingYield`, `UnbondingEntry`, `ValidatorInfo`, `WalletClaimRewardsInputs`, `AggregatedFiatBalance`, `Counterparty`, `CounterpartyDestination`, `DefiBalance`, `OnchainBalance`, `PaginationCursor`, `PortfolioBalanceType`, `PortfolioStakingMetadata`, `PortfolioUser`, `RequestAmount`, `RpcConfig`, `TrustedAddressConfiguration`, `VolumeDiscount`, `WalletBalance`
- New enums: `Action`, `ActivityLevel`, `ActivityType`, `AddressBookCategory`, `AddressBookState`, `AddressValidationStatus`, `AllocationSizeType`, `Benchmark`, `CommissionCategory`, `CommissionType`, `FcmFuturesSweepStatus`, `FcmMarginCallState`, `FcmMarginCallType`, `FcmPositionSide`, `FeeModel`, `HierarchyType`, `NetworkFamily`, `PortfolioBalanceType`, `PositionSide`, `PositionStatus`, `PositionType`, `ProductPermissions`, `RateType`, `SigningStatus`, `SortDirection`, `StakingRewardType`, `StakingStatus`, `TimeInForceType`, `TrustedAddressLevel`, `UnbondingStatus`, `UserRole`, `ValidatorStatus`, `Visibility`, `WalletDepositInstructionType`, `WalletVisibility`
- Standardized request/response patterns with Builder design
- Comprehensive error handling and validation
- Factory-based service instantiation

### Changed
- Naming conventions: Standardized "Onchain" terminology (replacing "Web3" in Java code)
- Service method naming for consistency (e.g., `GetPortfolios` → `ListPortfolios`, `GetActivityById` → `GetActivity`)
- Request/response models with enhanced Builder patterns for all API operations
- Package structure: Organized services by domain with clear separation of concerns
- Package restructuring for on-chain address management (separate `onchainaddressbook` and `onchainaddressgroups`)
- Model property naming aligned with OpenAPI specification

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
