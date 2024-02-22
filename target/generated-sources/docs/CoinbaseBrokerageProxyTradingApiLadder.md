
# CoinbaseBrokerageProxyTradingApiLadder

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**priceLevels** | [**List&lt;CoinbaseBrokerageProxyTradingApiLadderPriceLevel&gt;**](CoinbaseBrokerageProxyTradingApiLadderPriceLevel.md) | Array of price levels: [price, ask_size, ask_sum_size, bid_size, bid_sum_size], sorted in price desc order. | 
**priceLevelsMidIndex** | **Integer** | The index of the mid-price level for the price levels. If the mid-price is between two levels, the index will round down to the closest level. If no levels are returned it will return 0. | 



