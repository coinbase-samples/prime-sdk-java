
# CoinbaseTwsWeb3TransactionAction

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**rawUnsignedTx** | **String** | Unsigned transaction hex string |  [optional]
**networkMetadata** | [**CoinbaseTwsNetworkMetadata**](CoinbaseTwsNetworkMetadata.md) | Network information for web3 transaction |  [optional]
**dappContext** | [**CoinbaseTwsDappContext**](CoinbaseTwsDappContext.md) | Dapp information for web3 transaction |  [optional]
**metadata** | [**CoinbaseTwsWeb3TransactionMetadata**](CoinbaseTwsWeb3TransactionMetadata.md) | Fields for specifying transaction amounts |  [optional]
**destination** | **String** | Destination address for the transaction |  [optional]
**evmTransactionDetails** | [**CoinbaseTwsEvmTransactionDetails**](CoinbaseTwsEvmTransactionDetails.md) |  |  [optional]
**replacedTransactionId** | **String** | Set when creating a replacement transaction. The id of transaction being replaced. |  [optional]



