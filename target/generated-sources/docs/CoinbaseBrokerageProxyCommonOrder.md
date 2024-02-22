
# CoinbaseBrokerageProxyCommonOrder

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**orderId** | **String** | The unique id for this order | 
**clientOrderId** | **String** |  |  [optional]
**portfolioId** | **String** | The id of the portfolio that this order was created in&#39; | 
**productId** | **String** | The product this order was created for e.g. &#39;BTC-USD&#39; | 
**userId** | **String** |  |  [optional]
**side** | [**CoinbaseBrokerageProxyCommonOrderSide**](CoinbaseBrokerageProxyCommonOrderSide.md) | The side of the market that the order is on e.g. &#39;BUY&#39;, &#39;SELL&#39; | 
**orderConfiguration** | [**CoinbaseBrokerageProxyCommonOrderConfiguration**](CoinbaseBrokerageProxyCommonOrderConfiguration.md) |  |  [optional]
**status** | [**CoinbaseBrokerageProxyCommonOrderExecutionStatus**](CoinbaseBrokerageProxyCommonOrderExecutionStatus.md) | The current state of the order | 
**timeInForce** | [**CoinbaseBrokerageProxyCommonTimeInForceType**](CoinbaseBrokerageProxyCommonTimeInForceType.md) |  |  [optional]
**createdTime** | [**OffsetDateTime**](OffsetDateTime.md) | Timestamp for when the order was created | 
**completionPercentage** | **String** | Completion percentage of order, as a stringified float. Value will be an empty string if percentage cannot be calculated. |  [optional]
**filledSize** | **String** | Total filled size, in base currency |  [optional]
**filledValue** | **String** | Total filled value, in quote currency |  [optional]
**averageFilledPrice** | **String** |  |  [optional]
**numberOfFills** | **String** |  |  [optional]
**sizeInQuote** | **Boolean** |  |  [optional]
**pendingCancel** | **Boolean** |  |  [optional]
**totalFees** | **String** |  |  [optional]
**sizeInclusiveOfFees** | **Boolean** |  |  [optional]
**quoteQuantityRemaining** | **String** |  |  [optional]
**baseQuantityRemaining** | **String** |  |  [optional]
**outstandingHoldAmount** | **String** |  |  [optional]
**metadata** | [**CoinbaseBrokerageProxyCommonOrderMetadata**](CoinbaseBrokerageProxyCommonOrderMetadata.md) |  |  [optional]
**totalValueAfterFees** | **String** | derived field: filled_value + total_fees for buy orders and filled_value - total_fees for sell orders. |  [optional]
**displaySize** | **String** |  |  [optional]
**triggerStatus** | [**CoinbaseBrokerageProxyCommonStopTriggerStatus**](CoinbaseBrokerageProxyCommonStopTriggerStatus.md) |  |  [optional]
**allInCommissionDetailsClientCommission** | **String** |  |  [optional]
**costPlusCommissionDetailsClientCommission** | **String** |  |  [optional]
**costPlusCommissionDetailsVenueCommission** | **String** |  |  [optional]
**commissionModel** | [**CoinbaseBrokerageProxyCommonCommissionModel**](CoinbaseBrokerageProxyCommonCommissionModel.md) |  |  [optional]
**allInCommissionDetailsCesCommission** | **String** |  |  [optional]
**costPlusCommissionDetailsCesCommission** | **String** |  |  [optional]
**productType** | [**CoreProductType**](CoreProductType.md) | Product type of this order&#39;s product |  [optional]
**productDetails** | [**CoinbaseBrokerageProxyCommonProductDetails**](CoinbaseBrokerageProxyCommonProductDetails.md) |  |  [optional]
**soleVenueId** | **String** | sole_venue_id of this order&#39;s product. (Empty for products that are not necessarily tied to a single venue.) |  [optional]
**orderPlacementSource** | [**CoreOrderPlacementSource**](CoreOrderPlacementSource.md) | Placement source of this order |  [optional]
**lastFillTime** | [**OffsetDateTime**](OffsetDateTime.md) | Time of the most recent fill for this order |  [optional]
**intxPortfolioId** | **String** |  |  [optional]
**rejectReason** | [**CoinbaseBrokerageProxyCommonRejectReason**](CoinbaseBrokerageProxyCommonRejectReason.md) |  |  [optional]
**cancelReason** | [**CoinbaseBrokerageProxyCommonCancelReason**](CoinbaseBrokerageProxyCommonCancelReason.md) |  |  [optional]
**isDustEligible** | **Boolean** |  |  [optional]
**editHistory** | [**List&lt;CoinbaseBrokerageProxyCommonEdit&gt;**](CoinbaseBrokerageProxyCommonEdit.md) | An array of the latest 5 edits per order |  [optional]
**marginScope** | [**CoinbaseBrokerageProxyCommonMarginScope**](CoinbaseBrokerageProxyCommonMarginScope.md) |  |  [optional]
**leverage** | **String** |  |  [optional]



