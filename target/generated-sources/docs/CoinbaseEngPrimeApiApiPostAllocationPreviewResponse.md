
# CoinbaseEngPrimeApiApiPostAllocationPreviewResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sourcePortfolioId** | **String** | The source portfolio id for the allocation preview | 
**baseOrderTotal** | **String** | The base order total the orders selected | 
**quoteOrderTotal** | **String** | The quote order total the orders selected | 
**orderAvgPrice** | **String** | The average price for the orders selected | 
**totalCommission** | **String** | The total commission for the orders selected | 
**remainder** | [**CoinbaseEngPrimeApiApiAllocationAmount**](CoinbaseEngPrimeApiApiAllocationAmount.md) | The remainder amount values for the allocations | 
**allocationLegs** | [**List&lt;CoinbaseEngPrimeApiApiAllocationPreviewLeg&gt;**](CoinbaseEngPrimeApiApiAllocationPreviewLeg.md) | The amount fields for the allocation preview | 
**errors** | [**List&lt;CoinbaseEngPrimeApiApiPreviewAllocationFailureReason&gt;**](CoinbaseEngPrimeApiApiPreviewAllocationFailureReason.md) | The allocation error values on response |  [optional]



