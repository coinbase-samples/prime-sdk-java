
# CoinbaseBrokerageProxyTradingApiFutureProductDetails

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**venue** | **String** | The venue this product trades on. Eg: cme, cde |  [optional]
**contractCode** | **String** | The group identifier for this contract. Eg: MBT, MET |  [optional]
**contractExpiry** | [**OffsetDateTime**](OffsetDateTime.md) | The expiration timestamp of this product. Eg: 2022-06-16T00:00:00Z |  [optional]
**contractSize** | **String** | The size of each contract in terms of the contract root unit. Eg: 100 |  [optional]
**contractRootUnit** | **String** | The root unit to describe the underlying instrument. Eg: BTC, ETH |  [optional]
**groupDescription** | **String** | The descriptive name for the product group. Eg: Nano Bitcoin, Micro Ethereum, etc |  [optional]
**contractExpiryTimezone** | **String** | The IANA time zone for the contract&#39;s expiration time. Eg: Europe/London, America/Chicago, etc |  [optional]
**groupShortDescription** | **String** | The short version of the group description. Eg: Nano BTC, Micro ETH, etc |  [optional]
**riskManagedBy** | [**CoreRiskManagementType**](CoreRiskManagementType.md) | The party responsible for risk management of the product. E.g. FCM or VENUE |  [optional]
**contractExpiryType** | [**CoreContractExpiryType**](CoreContractExpiryType.md) | The type of contract expiry for the product. E.g. EXPIRING or PERPETUAL |  [optional]
**fundingInterval** | **String** | The time between funding payments for perpetual futures. E.g. 1 hour. Nil for expiring futures. |  [optional]
**maxLeverage** | **String** | The maximum leverage allowed for the product. E.g. &#39;5&#39; for 5x leverage. empty string for expiring futures. |  [optional]



