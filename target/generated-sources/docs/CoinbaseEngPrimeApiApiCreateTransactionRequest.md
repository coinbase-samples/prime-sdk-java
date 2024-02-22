
# CoinbaseEngPrimeApiApiCreateTransactionRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**idem** | **String** | An idempotent key for the client to pass in |  [optional]
**transactionType** | [**CoinbaseCustodyApiTransactionType**](CoinbaseCustodyApiTransactionType.md) | The type of transaction you want to initiate |  [optional]
**currencySymbol** | **String** | The symbol of the currency you want to transfer |  [optional]
**source** | [**CoinbasePaymentsCommonPaymentMethodsPaymentMethod**](CoinbasePaymentsCommonPaymentMethodsPaymentMethod.md) | Where the funds are coming from |  [optional]
**target** | [**CoinbasePaymentsCommonPaymentMethodsPaymentMethod**](CoinbasePaymentsCommonPaymentMethodsPaymentMethod.md) | Where the funds are going to  |  [optional]
**amount** | **String** | How much you want to move |  [optional]
**portfolioId** | **String** | The portfolio you want to transact with |  [optional]
**options** | **Map&lt;String, String&gt;** | Txn options |  [optional]
**tokenIds** | **List&lt;String&gt;** |  |  [optional]



