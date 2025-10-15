# Changelog

## [1.4.0] - 2025-10-15

### Added

#### OpenAPI Specification
- Updated `apiSpec/prime-public-spec.yaml` to latest version
- Reached 100% OpenAPI specification coverage (79/79 operations)

#### Code Generation Tooling
- `apiSpec/scripts/parse_openapi.py` - OpenAPI spec parser
- `apiSpec/scripts/generate_service.py` - Service code generator
- `apiSpec/scripts/cleanup_unused.sh` - Unused class cleanup utility
- `tools/model-generator/` - OpenAPI Generator integration for model generation

#### New Endpoints
- **Activities**
  - `getActivity` - Get single activity by ID (renamed from `getActivityByActivityId`)
  - `getPortfolioActivity` - Get portfolio-specific activity
- **Assets**
  - `listEntityAssets` - List assets for an entity
- **Futures**
  - `getFcmMarginCallDetails` - Get FCM margin call details
  - `getFcmRiskLimits` - Get FCM risk limits
  - `getPositions` - Get entity positions (renamed from `getEntityPositions`)
- **Financing**
  - `getCrossMarginOverview` - Get cross margin overview
- **Orders**
  - `editOrder` - Edit an existing order
  - `listOrderEditHistory` - List order edit history
- **Payment Methods**
  - `getEntityPaymentMethodDetails` - Get detailed payment method information (renamed from `getEntityPaymentMethod`)
- **Portfolios**
  - `getPortfolio` - Get portfolio by ID with new request structure
  - `getPortfolioCounterpartyId` - Get portfolio counterparty ID
  - `listPortfolios` - List portfolios with proper request object
- **Products**
  - `listCandles` - List price candles for products
- **Staking**
  - `portfolioStakingInitiate` - Initiate staking for portfolio (renamed from `createStake`)
  - `portfolioStakingUnstake` - Unstake from portfolio (renamed from `createUnstake`)
  - `claimRewards` - Claim staking rewards
  - `listTransactionValidators` - List validators for transactions
- **Transactions**
  - `createWalletTransfer` - Create wallet transfer
  - `createWalletWithdrawal` - Create wallet withdrawal
  - `getTransaction` - Get transaction by ID
- **Users**
  - `listEntityUsers` - List users for an entity
- **Wallets**
  - `createWalletDepositAddress` - Create deposit address for wallet
  - `listWalletAddresses` - List addresses for a wallet

#### New Models
- **Activities**: `ActivityCreationResponse`, `ActivityMetadataAccount`, `ActivityMetadataConsensus`, `ActivityMetadataOrders`, `ActivityMetadataTransactions`
- **Address Book**: `AddressBookConfiguration`, `AddressBookMetadata`, `AddressBookSummary`, `AddressEntry`, `TrustedAddressConfiguration`
- **Allocations**: `AllocationRule`, `AllocationStrategy`, `CreateAllocationResponseBody`, `CreateNetAllocationResponseBody`, `DestinationAlloc`
- **Commission**: `CommissionCalculation`, `CommissionRate`
- **Futures**: `FcmBalance`, `FcmFuturesSweep`, `FcmFuturesSweepRequestAmount`, `FcmMarginCall`, `FcmMarginCallDetail`, `FcmPosition`, `FcmRiskLimit`, `FcmRiskLimits`
- **Financing**: `ConversionDetail`, `CrossMarginOverview`, `ExistingLocate`, `MarginConversion`, `TradeFinanceFee`, `XMLoan`, `XMMarginCall`, `XMPosition`, `XMRiskNettingInfo`, `XMSummary`
- **Orders**: `Fill`, `LimitOrderEdit`, `OrderEdit`, `QuoteResponse`, `RfqProductDetails`
- **Payment Methods**: `PaymentMethodDestination`, `PaymentMethodDetails`, `PaymentMethodSummary`
- **Portfolios**: `Counterparty`, `CounterpartyDestination`, `PortfolioStakingMetadata`, `PortfolioUser`
- **Products**: `Candle`
- **Staking**: `CreateStakeInputs`, `CreateUnstakeInputs`, `RewardsSummary`, `StakingBalance`, `StakingInitiateResponse`, `StakingPosition`, `StakingReward`, `StakingSummary`, `StakingUnstakeResponse`, `StakingYield`, `UnbondingEntry`, `ValidatorInfo`, `WalletClaimRewardsInputs`, `WalletStakeInputs`, `WalletUnstakeInputs`
- **Transactions**: `OnchainTransactionDetails`, `OnchainTransactionMetadata`, `CreateOnchainTransactionEvmParams`, `CreateOnchainTransactionRequestEvmParams`, `TransactionMetadata`, `TransactionValidator`
- **Wallets**: `AggregatedFiatBalance`, `DefiBalance`, `OnchainBalance`, `WalletBalance`, `WalletCryptoDepositInstructions`, `WalletFiatDepositInstructions`
- **Common**: `PaginationCursor`, `RequestAmount`, `RpcConfig`, `VolumeDiscount`

#### New Enums
- `Action`, `ActivityLevel`, `ActivityType`, `AddressBookCategory`, `AddressBookState`, `AddressValidationStatus`, `AllocationSizeType`
- `CandlesGranularity`, `CommissionCategory`, `CommissionType`
- `FcmFuturesSweepStatus`, `FcmMarginCallState`, `FcmMarginCallType`, `FcmPositionSide`, `FeeModel`
- `HierarchyType`, `NetworkFamily`, `PortfolioBalanceType`, `PositionSide`, `PositionStatus`, `PositionType`, `ProductPermissions`
- `SortDirection`, `StakingRewardType`, `StakingStatus`
- `TimeInForceType`, `TrustedAddressLevel`, `UnbondingStatus`, `UserRole`, `ValidatorStatus`, `Visibility`
- `WalletDepositInstructionType`, `WalletVisibility`
- `XMCallStatus`, `XMCallType`, `XMControlStatus`, `XMEntityCallStatus`, `XMMarginLevel`, `XMParty`

#### Tests
- `CoinbasePrimeCredentialsTest` - Credentials validation tests
- `VersionHeaderIntegrationTest` - SDK version header tests
- `ConstantsTest` - Constants validation tests

### Changed

#### Naming Conventions
- `Web3WalletAsset` → `OnchainAsset`
- `Web3WalletBalance` → `OnchainWalletBalance`
- Replaced "Web3" terminology with "Onchain" throughout codebase
- Method renames:
  - `getActivityByActivityId` → `getActivity`
  - `getActivityByActivityIdResponse` → `getActivityResponse`
  - `listActivities` → `listPortfolioActivities`
  - `getPortfolioAddressBook` → `listPortfolioAddressBook`
  - `createAddressBookEntry` → `createPortfolioAddressBookEntry`
  - `getEntityPositions` → `getPositions`
  - `getEntityPaymentMethod` → `getEntityPaymentMethodDetails`
  - `getPortfolioById` → `getPortfolio`
  - `getWalletById` → `getWallet`
  - `createStake` → `portfolioStakingInitiate`
  - `createUnstake` → `portfolioStakingUnstake`

#### Models and Serialization
- Updated request/response models with Jackson annotations
- Added `PaginationCursor` for paginated responses
- Updated model field names to match OpenAPI specification
- Removed `GetOrderPreviewResponse` 
- Removed redundant response wrapper classes

#### Package Structure
- Created `onchainaddressbook` package for onchain address book operations
- Updated `PrimeServiceFactory` to include new services

### Fixed
- Query parameter handling in list operations
- Response deserialization for nested objects
- Copyright headers

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
