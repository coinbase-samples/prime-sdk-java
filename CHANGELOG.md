# Changelog

## [1.3.0] - 2025-MAY-09

### Added

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
