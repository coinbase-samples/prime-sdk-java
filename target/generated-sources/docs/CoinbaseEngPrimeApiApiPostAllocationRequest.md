
# CoinbaseEngPrimeApiApiPostAllocationRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**portfolioId** | **String** | The ID of the portfolio of the allocation | 
**allocationId** | **String** | The ID of the allocation | 
**sourcePortfolioId** | **String** | The source portfolio id for the allocation |  [optional]
**productId** | **String** | The side for the allocation |  [optional]
**side** | [**CoinbaseEngPrimeApiApiOrderSide**](CoinbaseEngPrimeApiApiOrderSide.md) | The order side for the allocation (BUY / SELL) |  [optional]
**baseSize** | **String** | The total base size for the allocation |  [optional]
**quoteSize** | **String** | The total quote size for the allocation |  [optional]
**commission** | **String** | The total commission for the allocation |  [optional]
**orderIds** | **List&lt;String&gt;** | The list of order ids in the allocation |  [optional]
**allocationLegs** | [**List&lt;CoinbaseEngPrimeApiApiAllocationLeg&gt;**](CoinbaseEngPrimeApiApiAllocationLeg.md) | The list of allocation_legs for the allocation |  [optional]
**clientNettingId** | **String** | The user id of the net allocation |  [optional]



