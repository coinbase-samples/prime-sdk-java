
# CoinbaseEngPrimeApiApiProduct

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**productId** | **String** | The id for the product pair, written as base-quote | 
**price** | **String** | The quote price for one unit of base asset | 
**volume24h** | **String** | How much base currency has been used for trading current product in the last 24 hours | 
**volumePercentageChange24h** | **String** | Compare previous 24 hour window (48-24 hours ago) with current 24 hour window (24 hours ago-current), expressed in percent | 
**baseIncrement** | **String** | The smallest possible unit of base currency *relative to current product* - if product is ETH-DAI, base increment is .0001, if product is ETH-USD, base increment is .00000001 | 
**quoteIncrement** | **String** | The smallest possible unit of quote currency *relative to current product* - if product is ALGO-USD, quote increment is .001, if product is ETH-USD, quote increment is .01 | 
**baseMinSize** | **String** | The minimum size (base asset) for which an order can be placed | 
**baseMaxSize** | **String** | The maximum size (base asset) for which an order can be placed | 
**quoteMinSize** | **String** | The minimum size (quote asset) for which an order can be placed | 
**quoteMaxSize** | **String** | The maximum size (quote asset) for which an order can be placed | 
**pricePercentageChange24h** | **String** | Compare price of one unit of base asset at beginning &amp; end of 24 hour window: (currentPrice - previousPrice) / currentPrice |  [optional]
**high24h** | **String** | Highest price value in the last 24 hours |  [optional]
**low24h** | **String** | Lowest price value in the last 24 hours |  [optional]
**high52w** | **String** | Highest price value in the last 52 weeks |  [optional]
**low52w** | **String** | Lowest price value in the last 52 weeks |  [optional]
**marketCap** | **String** | Total market valuation of the asset pair in quote |  [optional]
**permissions** | [**List&lt;CoinbaseEngPrimeApiApiProductPermissions&gt;**](CoinbaseEngPrimeApiApiProductPermissions.md) | Permissions given to user for product |  [optional]
**pricePercentageChangeMtd** | **String** | Compare price of one unit of base asset at beginning of the month vs now: (currentPrice - previousPrice) / currentPrice |  [optional]
**pricePercentageChangeYtd** | **String** | Compare price of one unit of base asset at beginning of the year vs now: (currentPrice - previousPrice) / currentPrice |  [optional]
**usdVolume24h** | **String** | How much base currency, converted to USD, has been used for trading current product in the last 24 hours |  [optional]
**priceIncrement** | **String** | The smallest possible unit of price in quote currency *relative to current product* |  [optional]



