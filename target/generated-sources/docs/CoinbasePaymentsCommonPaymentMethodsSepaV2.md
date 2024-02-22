
# CoinbasePaymentsCommonPaymentMethodsSepaV2

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**account** | [**CoinbasePaymentsCommonPaymentMethodsSepaAccountDetail**](CoinbasePaymentsCommonPaymentMethodsSepaAccountDetail.md) | The SEPA account details. |  [optional]
**customerFirstName** | **String** |  |  [optional]
**customerLastName** | **String** |  |  [optional]
**email** | **String** |  |  [optional]
**phoneNumber** | **String** |  |  [optional]
**customerCountry** | **String** | Customer&#39;s country in ISO-3166-1 ALPHA-2. |  [optional]
**address** | [**CoinbasePaymentsCommonAddress**](CoinbasePaymentsCommonAddress.md) | Deprecated. Address was required for Banking Circle payout but later found unused.  It will now be unpopulated. Keeping this field in case LHV or other banks require it in the future. |  [optional]
**supportsOpenBanking** | **Boolean** | Meant to be used for routing in PGS. |  [optional]



