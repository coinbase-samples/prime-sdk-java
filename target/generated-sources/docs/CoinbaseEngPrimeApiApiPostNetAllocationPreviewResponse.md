
# CoinbaseEngPrimeApiApiPostNetAllocationPreviewResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sourcePortfolioId** | **String** | The source portfolio id for the net allocation preview | 
**buyOrderIds** | **List&lt;String&gt;** | The buy order ids for the net allocation preview |  [optional]
**baseOrderBuyTotal** | **String** | The base order total the buy orders selected | 
**quoteOrderBuyTotal** | **String** | The quote order total the buy orders selected | 
**orderAvgBuyPrice** | **String** | The average price for the buy orders selected | 
**totalBuyCommission** | **String** | The total commission for the buy orders selected | 
**sellOrderIds** | **List&lt;String&gt;** | The sell order ids for the net allocation preview |  [optional]
**baseOrderSellTotal** | **String** | The base order total the sell orders selected | 
**quoteOrderSellTotal** | **String** | The quote order total the sell orders selected | 
**orderAvgSellPrice** | **String** | The average price for the sell orders selected | 
**totalSellCommission** | **String** | The total commission for the sell orders selected | 
**baseOrderNetTotal** | **String** | The base order net total for the allocation preview | 
**baseSide** | [**CoinbaseEngPrimeApiApiOrderSide**](CoinbaseEngPrimeApiApiOrderSide.md) | The side of base order net total for the allocation preview |  [optional]
**quoteOrderNetTotal** | **String** | The quote order net total for the allocation preview | 
**quoteSide** | [**CoinbaseEngPrimeApiApiOrderSide**](CoinbaseEngPrimeApiApiOrderSide.md) | The side of quote order net total for the allocation preview |  [optional]
**totalNetCommission** | **String** | The total net commission for the allocation preview | 
**netRemainder** | [**CoinbaseEngPrimeApiApiAllocationAmount**](CoinbaseEngPrimeApiApiAllocationAmount.md) | The remainder net amount values for the net allocations | 
**netAllocationLegs** | [**List&lt;CoinbaseEngPrimeApiApiAllocationPreviewLeg&gt;**](CoinbaseEngPrimeApiApiAllocationPreviewLeg.md) | The net amount fields for the net allocation preview | 
**buyRemainder** | [**CoinbaseEngPrimeApiApiAllocationAmount**](CoinbaseEngPrimeApiApiAllocationAmount.md) | The remainder buy amount values for the net allocations | 
**buyAllocationLegs** | [**List&lt;CoinbaseEngPrimeApiApiAllocationPreviewLeg&gt;**](CoinbaseEngPrimeApiApiAllocationPreviewLeg.md) | The buy amount fields for the net allocation preview | 
**sellRemainder** | [**CoinbaseEngPrimeApiApiAllocationAmount**](CoinbaseEngPrimeApiApiAllocationAmount.md) | The remainder sell amount values for the net allocations | 
**sellAllocationLegs** | [**List&lt;CoinbaseEngPrimeApiApiAllocationPreviewLeg&gt;**](CoinbaseEngPrimeApiApiAllocationPreviewLeg.md) | The sell amount fields for the net allocation preview | 
**errors** | [**List&lt;CoinbaseEngPrimeApiApiPreviewAllocationFailureReason&gt;**](CoinbaseEngPrimeApiApiPreviewAllocationFailureReason.md) | The net allocation error values on response |  [optional]



