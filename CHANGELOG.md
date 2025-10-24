# Changelog

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
