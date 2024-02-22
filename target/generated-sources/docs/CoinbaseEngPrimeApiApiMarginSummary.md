
# CoinbaseEngPrimeApiApiMarginSummary

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**entityId** | **String** |  |  [optional]
**marginEquity** | [**CoinbaseFinancingAmount**](CoinbaseFinancingAmount.md) |  |  [optional]
**marginRequirement** | [**CoinbaseFinancingAmount**](CoinbaseFinancingAmount.md) |  |  [optional]
**excessDeficit** | [**CoinbaseFinancingAmount**](CoinbaseFinancingAmount.md) |  |  [optional]
**tfCreditLimit** | [**CoinbaseFinancingAmount**](CoinbaseFinancingAmount.md) |  |  [optional]
**tfCreditConsumed** | [**CoinbaseFinancingAmount**](CoinbaseFinancingAmount.md) |  |  [optional]
**tfAdjustedCreditConsumed** | [**CoinbaseFinancingAmount**](CoinbaseFinancingAmount.md) |  |  [optional]
**marginCallRecords** | [**List&lt;CoinbaseEngPrimeApiApiMarginCallHistoryRecord&gt;**](CoinbaseEngPrimeApiApiMarginCallHistoryRecord.md) |  |  [optional]
**tfLoans** | [**List&lt;CoinbaseFinancingLoanInfo&gt;**](CoinbaseFinancingLoanInfo.md) |  |  [optional]
**assetBalances** | [**List&lt;CoinbaseFinancingPortfolioAsset&gt;**](CoinbaseFinancingPortfolioAsset.md) |  |  [optional]
**grossMarketValue** | [**CoinbaseFinancingAmount**](CoinbaseFinancingAmount.md) |  |  [optional]
**netMarketValue** | [**CoinbaseFinancingAmount**](CoinbaseFinancingAmount.md) |  |  [optional]
**longMarketValue** | [**CoinbaseFinancingAmount**](CoinbaseFinancingAmount.md) |  |  [optional]
**nonMarginableLongMarketValue** | [**CoinbaseFinancingAmount**](CoinbaseFinancingAmount.md) |  |  [optional]
**shortMarketValue** | [**CoinbaseFinancingAmount**](CoinbaseFinancingAmount.md) |  |  [optional]
**grossLeverage** | **String** |  |  [optional]
**netExposure** | **String** |  |  [optional]
**portfolioStressTriggered** | [**CoinbaseFinancingMarginAddOn**](CoinbaseFinancingMarginAddOn.md) |  |  [optional]
**allMarginAddOns** | [**List&lt;CoinbaseFinancingMarginAddOn&gt;**](CoinbaseFinancingMarginAddOn.md) |  |  [optional]
**pmAssetInfo** | [**List&lt;CoinbaseEngPrimeApiApiPMAssetInfo&gt;**](CoinbaseEngPrimeApiApiPMAssetInfo.md) |  |  [optional]
**tfAssetInfo** | [**List&lt;CoinbaseFinancingTFAssetInfo&gt;**](CoinbaseFinancingTFAssetInfo.md) |  |  [optional]
**shortCollateralBalance** | **String** |  |  [optional]
**cashValue** | **String** |  |  [optional]
**totalSettlementDue** | **String** |  |  [optional]
**totalSettlementPastDue** | **String** |  |  [optional]
**totalSettlementDueNext** | **String** |  |  [optional]
**assetLongShortPositions** | [**List&lt;CoinbaseFinancingAssetLongShortPosition&gt;**](CoinbaseFinancingAssetLongShortPosition.md) |  |  [optional]



