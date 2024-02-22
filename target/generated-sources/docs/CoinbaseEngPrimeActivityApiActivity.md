
# CoinbaseEngPrimeActivityApiActivity

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Activity ID. | 
**referenceId** | **String** | ID of the model the Activity was generated for. | 
**category** | [**CoinbaseEngPrimeActivityApiActivityCategory**](CoinbaseEngPrimeActivityApiActivityCategory.md) | Activity Category. | 
**type** | [**CoinbaseEngPrimeActivityApiActivityType**](CoinbaseEngPrimeActivityApiActivityType.md) | Activity Type. | 
**secondaryType** | [**CoinbaseEngPrimeActivityApiActivitySecondaryType**](CoinbaseEngPrimeActivityApiActivitySecondaryType.md) | Type used specifically for trades indicating buy or sell. |  [optional]
**status** | [**CoinbaseEngPrimeActivityApiActivityStatus**](CoinbaseEngPrimeActivityApiActivityStatus.md) | Activity Status. | 
**createdByUserId** | **String** | @deprecated ID of the user who created the Activity. | 
**title** | **String** | Title of the Activity. | 
**description** | **String** | Description of the Activity. | 
**currencySymbols** | **List&lt;String&gt;** | Currency symbols related to the Activity. | 
**internal** | **Boolean** | Whether the Activity is an internal activity. |  [optional]
**createdAt** | **String** | Timestamp for when the Activity was created. | 
**userActions** | [**List&lt;CoinbaseEngPrimeActivityApiUserAction&gt;**](CoinbaseEngPrimeActivityApiUserAction.md) | Actions related to the Activity. | 
**orderExecutionMetadata** | [**CoinbaseEngPrimeActivityApiOrderExecutionMetadata**](CoinbaseEngPrimeActivityApiOrderExecutionMetadata.md) | Trade related metadata. |  [optional]
**consensusMetadata** | [**CoinbaseEngPrimeActivityApiConsensusMetadata**](CoinbaseEngPrimeActivityApiConsensusMetadata.md) | Consensus related metadata. |  [optional]
**transactionMetadata** | [**CoinbaseEngPrimeActivityApiTransactionMetadata**](CoinbaseEngPrimeActivityApiTransactionMetadata.md) | Transaction activity related metadata. |  [optional]
**accountMetadata** | [**CoinbaseEngPrimeActivityApiAccountMetadata**](CoinbaseEngPrimeActivityApiAccountMetadata.md) | Account activity related metadata. |  [optional]
**allocationMetadata** | [**CoinbaseEngPrimeActivityApiAllocationMetadata**](CoinbaseEngPrimeActivityApiAllocationMetadata.md) | Allocation activity related metadata. |  [optional]
**userChangeMetadata** | [**CoinbaseEngPrimeActivityApiUserChangeMetadata**](CoinbaseEngPrimeActivityApiUserChangeMetadata.md) | User change activity related metadata. |  [optional]
**organizationId** | **String** | Organization ID of the Activity. |  [optional]
**portfolioId** | **String** | Portfolio ID of the Activity. |  [optional]
**referenceType** | **String** | The model class for the Activity | 
**statusUpdatedAt** | **String** | Timestamp for when the ActivityStatus has changed. | 
**createdByUserInfo** | [**CoinbaseEngPrimeActivityApiUserInformation**](CoinbaseEngPrimeActivityApiUserInformation.md) | Info for the user who created the activity |  [optional]
**timelines** | [**List&lt;CoinbaseEngPrimeActivityApiTimeline&gt;**](CoinbaseEngPrimeActivityApiTimeline.md) | Timelines related to the Activity. |  [optional]
**hierarchyType** | [**CoinbaseEngPrimeActivityApiHierarchyType**](CoinbaseEngPrimeActivityApiHierarchyType.md) | Hierarchy type for an Activity. |  [optional]



