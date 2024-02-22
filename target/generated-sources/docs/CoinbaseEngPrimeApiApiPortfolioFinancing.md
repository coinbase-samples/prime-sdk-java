
# CoinbaseEngPrimeApiApiPortfolioFinancing

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**postTradeCredit** | [**CoinbaseEngPrimeApiApiPostTradeCredit**](CoinbaseEngPrimeApiApiPostTradeCredit.md) |  | 
**creditUtilized** | **String** | How much credit is currently being used | 
**creditAvailable** | **String** | How much credit is still available to be used | 
**creditCurrency** | **String** | The currency that the credit is expressed in |  [optional]
**isFrozen** | **Boolean** | A boolean indicating whether or not the portfolios credit priviliges are frozen or not |  [optional]
**frozenMessage** | **String** | An optional message explaining why the portfolios credit priviliges are frozen |  [optional]
**creditUtilizedPerCurrency** | **Map&lt;String, String&gt;** | How much credit is currently being used per currency |  [optional]
**totalDue** | **String** | Total amount due |  [optional]
**openOrders** | **String** | Number of open orders |  [optional]
**adjustedCreditUtilized** | **String** | How much credit is currently being used with CUF adjusted |  [optional]
**adjustedCreditAvailable** | **String** | How much credit is still available to be used with CUF adjusted |  [optional]
**adjustedPortfolioEquity** | **String** | How much equity does it have with CUF adjusted |  [optional]
**isEntityPmEnabled** | **Boolean** | A boolean indicating whether or not entity is enabled for portfolio margin |  [optional]
**isPortfolioPmEnabled** | **Boolean** | A boolean indicating whether or not portfolio is enabled for portfolio margin |  [optional]



