
# CoinbaseBrokerageProxyTradingApiDepth

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**date** | [**OffsetDateTime**](OffsetDateTime.md) |  | 
**last** | **String** | The last (current) price - if not present, the average of the lowest bid and the highest ask (i.e., (lowest bid + highest ask) / 2) | 
**bidL2** | [**List&lt;CoinbaseBrokerageProxyTradingApiL2Level&gt;**](CoinbaseBrokerageProxyTradingApiL2Level.md) | Array of bid [price, size] pairs, sorted in price desc order | 
**askL2** | [**List&lt;CoinbaseBrokerageProxyTradingApiL2Level&gt;**](CoinbaseBrokerageProxyTradingApiL2Level.md) | Array of ask [price, size] pairs, sorted in price asc order | 
**midMarket** | **String** | Calculated as (lowest ask price + highest bid price) / 2 | 
**spreadBps** | **String** | Calculated in bps as ((lowest ask price - highest bid price) / lowest ask price) * 10000 | 
**spreadAbsolute** | **String** | Difference between best ask and best bid prices. Calculated as lowest ask price - highest bid price | 



