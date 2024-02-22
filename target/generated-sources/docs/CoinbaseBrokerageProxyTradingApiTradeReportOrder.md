
# CoinbaseBrokerageProxyTradingApiTradeReportOrder

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**order** | [**CoinbaseBrokerageProxyCommonOrder**](CoinbaseBrokerageProxyCommonOrder.md) | Order details | 
**arrivalBestBidPrice** | **String** | Best bid price at order arrival time | 
**arrivalBestAskPrice** | **String** | Best ask price at order arrival time | 
**intervalVwap** | **String** | Volume-weighted average price across all venues for order execution window | 
**intervalUnweightedAvgPrice** | **String** | Average price of the asset across all venues for order execution window | 
**intervalAvgSpread** | **String** | Average difference between best bid and best ask for order execution window | 
**arrivalMidPrice** | **String** | Mid price at order arrival time |  [optional]
**percentIntervalVolume** | **String** | Order fill volume as a percentage of market volume for the product during the execution window |  [optional]
**percentDailyVolume** | **String** | Order fill volume as a percentage of 30 day average daily volume immediately before order creation |  [optional]
**intervalVolatility** | **String** | Market volatility during order execution window |  [optional]



