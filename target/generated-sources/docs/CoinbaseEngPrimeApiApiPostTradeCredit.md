
# CoinbaseEngPrimeApiApiPostTradeCredit

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**enabled** | **Boolean** | A boolean indicating whether or not credit is enabled for this portfolio |  [optional]
**limit** | **String** | The global credit limit for the portfolio |  [optional]
**settlementsDueNext** | [**List&lt;CoinbaseEngPrimeApiApiSettlementDue&gt;**](CoinbaseEngPrimeApiApiSettlementDue.md) | How much credit that is currently in use that must be repaid for next due date (will be depreciated after the new field be tested) |  [optional]
**totalNotionalSettlementDueNext** | **String** | How much credit that is currently in usd that must be repaid for next due date |  [optional]
**settlementDueDate** | [**OffsetDateTime**](OffsetDateTime.md) | Timestamp of when the earliest active settlement is due |  [optional]
**gracePeriodDueDate** | [**OffsetDateTime**](OffsetDateTime.md) | Timestamp of when the grace period ends. Typically 1 hour after the settlement due date |  [optional]
**settlementDueDateNext** | [**OffsetDateTime**](OffsetDateTime.md) | Timestamp of when the settlement is due next |  [optional]
**settlementStatus** | [**CoinbaseEngPrimeApiApiSettlementStatus**](CoinbaseEngPrimeApiApiSettlementStatus.md) | Status of earliest non zero settlement |  [optional]
**timeRemaining** | **Integer** | Time remaining until closest settlement or grace period due date |  [optional]
**settlementsDue** | [**List&lt;CoinbaseEngPrimeApiApiSettlementDue&gt;**](CoinbaseEngPrimeApiApiSettlementDue.md) | How much credit that is currently in use that must be repaid for next due date |  [optional]
**settlementPastDue** | **String** | How much credit that is currently in use that must be repaid for past due date |  [optional]
**settlementCurrentDue** | **String** | How much credit that is currently in use that must be repaid for current due date |  [optional]
**settlementUpcomingDue** | **String** | How much credit that is currently in use that must be repaid for upcoming due date |  [optional]



