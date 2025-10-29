# Changelog

## [1.4.1] - 2025-10-28

### Added

#### Orders Service - Advanced Order Type Support
- **CreateOrderRequest**: Added support for advanced order types
  - `settlCurrency` - Settlement currency for futures contracts
  - `postOnly` - Post-only flag for maker-only LIMIT orders
  - `pegOffsetType` - Peg offset type for PEG orders
  - `offset` - Offset value for PEG orders (0 = peg to best bid/offer)
  - `wigLevel` - WIG (Would if Good) level for pegged orders
- **GetOrderPreviewRequest**: Added same advanced order fields as CreateOrderRequest plus:
  - `displayQuoteSize` - Maximum order size visible on venue books (quote currency) for iceberg orders
  - `displayBaseSize` - Maximum order size visible on venue books (base currency) for iceberg orders
- **GetOrderPreviewResponse**: Added `isRaiseExact` field for raise exact order flag
- **EditOrderRequest**: Added iceberg and stop order support
  - `displayQuoteSize` - Display size for iceberg orders
  - `displayBaseSize` - Display size for iceberg orders
  - `stopPrice` - Stop price at which order activates

#### Futures Service
- **GetFcmRiskLimitsResponse**: Added comprehensive FCM margin and PnL fields
  - `cfmTotalMargin` - Total margin required for both positions and open orders
  - `cfmDeltaOte` - Open Trade Equity accrued during current trading session
  - `cfmUnsettledRealizedPnl` - Unsettled realized PNL for positions closed intraday
  - `cfmUnsettledAccruedFundingPnl` - Unsettled accrued funding PNL from last settlement

#### Transactions Service
- **CreateConversionResponse**: Added `transactionId` field - UUID of the conversion transaction

#### Wallets Service
- **CreateWalletResponse**: Added `networkFamily` field for wallet network family
- **GetWalletDepositInstructionsResponse**: Added proper JSON property annotations
  - `@JsonProperty("crypto_instructions")` for crypto deposit instructions
  - `@JsonProperty("fiat_instructions")` for fiat deposit instructions

### Changed

#### Breaking Changes
- **GetCrossMarginOverviewResponse** (Financing Service): Renamed field and methods for OpenAPI alignment
  - Field: `crossMarginOverview` → `overview`
  - JSON property: `"cross_margin_overview"` → `"overview"`
  - Getter: `getCrossMarginOverview()` → `getOverview()`
  - Setter: `setCrossMarginOverview()` → `setOverview()`

### Fixed
- Aligned all Request/Response classes with OpenAPI specification v0.1
- Fixed missing optional fields across 11 classes in 5 services
- Added 26 fields total to match OpenAPI spec completely
- Fixed JSON property mappings for proper snake_case to camelCase conversion
- Fixed acronym casing in model classes (XM* → Xm*, FCM* → Fcm*) to match Java naming conventions
- Fixed field naming consistency across Request/Response classes
- Corrected method signatures and naming:
  - `getAllocationsByClientNettingId` → `listAllocationsByNettingId`
  - Updated corresponding request/response classes: `GetAllocationsByClientNettingIdRequest` → `ListAllocationsByNettingIdRequest`
- Fixed activity type enum: `PrimeActivityType` → `CustodyActivityType`
- Removed `nettingId` field from `CreateAllocationRequest` to align with API specification

## [1.4.0] - 2025-10-15

### Added

#### OpenAPI Specification
- Updated `apiSpec/prime-public-spec.yaml` to latest version
- Reached 100% OpenAPI specification coverage (79/79 operations)
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
  - `getPaymentMethodDetails` - Get detailed payment method information (renamed from `getEntityPaymentMethod`)
- **Portfolios**
  - `getPortfolio` - Get portfolio by ID with new request structure
  - `getPortfolioCounterpartyId` - Get portfolio counterparty ID
  - `listPortfolios` - List portfolios with proper request object
- **Products**
  - `listCandles` - List price candles for products
- **Staking**
  - `portfolioStakingInitiate` - Initiate staking for portfolio
  - `portfolioStakingUnstake` - Unstake from portfolio
  - `createStake` - Create stake
  - `createUnstake` - Create unstake
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
- **Activities**: `ActivityMetadataAccount`, `ActivityMetadataConsensus`, `ActivityMetadataOrders`, `ActivityMetadataTransactions`
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
- Replaced "Web3" terminology with "Onchain" throughout codebase
- Method renames:
  - `getActivityByActivityId` → `getActivity`
  - `listActivities` → `listPortfolioActivities`
  - `getPortfolioAddressBook` → `listAddressBook`
  - `getEntityPositions` → `getPositions`
  - `getEntityPaymentMethod` → `getPaymentMethodDetails`
  - `listEntityPaymentMethods` → `listPaymentMethods`
  - `getPortfolioById` → `getPortfolio`
  - `getTransactionByTransactionId` → `getTransaction`
  - `createTransfer` → `createWalletTransfer`
  - `createWithdrawal` → `createWalletWithdrawal`
  - `listUsers` → `listEntityUsers`
  - `getWalletById` → `getWallet`

#### Request/Response Class Renames
- `GetActivityByActivityIdRequest` → `GetActivityRequest`
- `GetActivityByActivityIdResponse` → `GetPortfolioActivityResponse`
- `GetEntityActivityByActivityIdResponse` → `GetActivityResponse`
- `ListActivitiesRequest` → `ListPortfolioActivitiesRequest`
- `ListActivitiesResponse` → `ListPortfolioActivitiesResponse`
- `GetPortfolioAddressBookRequest` → `ListAddressBookRequest`
- `GetPortfolioAddressBookResponse` → `ListAddressBookResponse`
- `GetPortfolioAllocationsRequest` → `ListPortfolioAllocationsRequest`
- `GetEntityPaymentMethodRequest` → `GetPaymentMethodDetailsRequest`
- `GetEntityPaymentMethodResponse` → `GetPaymentMethodDetailsResponse`
- `ListEntityPaymentMethodsRequest` → `ListPaymentMethodsRequest`
- `GetPortfolioByIdRequest` → `GetPortfolioRequest`
- `GetPortfolioByIdResponse` → `GetPortfolioResponse`
- `GetEntityPositionsRequest` → `GetPositionsRequest`
- `GetEntityPositionsResponse` → `GetPositionsResponse`
- `GetTransactionByTransactionIdRequest` → `GetTransactionRequest`
- `GetTransactionByTransactionIdResponse` → `GetTransactionResponse`
- `CreateTransferRequest` → `CreateWalletTransferRequest`
- `CreateTransferResponse` → `CreateWalletTransferResponse`
- `CreateWithdrawalRequest` → `CreateWalletWithdrawalRequest`
- `CreateWithdrawalResponse` → `CreateWalletWithdrawalResponse`
- `ListUsersRequest` → `ListEntityUsersRequest`
- `ListUsersResponse` → `ListEntityUsersResponse`
- `GetWalletByIdRequest` → `GetWalletRequest`
- `GetWalletByIdResponse` → `GetWalletResponse`

#### Model Class Renames
- `AllocationDestination` → `DestinationAlloc`
- `ConversionDetails` → `ConversionDetail`
- `EntityPaymentMethod` → `PaymentMethodSummary`
- `Web3WalletAsset` → `OnchainAsset`

#### Models and Serialization
- Updated request/response models with Jackson annotations
- Added `PaginationCursor` for paginated responses
- Updated model field names to match OpenAPI specification
- Moved `Pagination` from `com.coinbase.prime.model` to `com.coinbase.prime.common`
- Removed redundant response wrapper classes

#### Package Structure
- Created `onchainaddressbook` package for onchain address book operations
- Created `common` package for shared models like `Pagination`
- Updated `PrimeServiceFactory` to include new services

#### Removed Classes
- Models: `AccountMetadata`, `Consensus`, `EvmParams`, `OnchainAddress`, `OnchainDetails`, `OrderFill` (replaced by `Fill`), `PaymentMethod`, `RequestedAmount` (replaced by `RequestAmount`), `Rpc`, `Sweep`, `TotalBalance`, `TransactionsMetadata`, `GetOrderPreviewResponse`, `OrdersMetadata`, `StakingInputs`, `FiatDepositInstructions`
- Enums: `Role` (replaced by `UserRole`), `SizeType` (replaced by `AllocationSizeType`), `TimeInForce` (replaced by `TimeInForceType`), `UserActionType`, `BalanceType` (replaced by `PortfolioBalanceType`), `DepositType` (replaced by `WalletDepositInstructionType`)

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
