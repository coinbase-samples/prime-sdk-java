
# CoinbaseCustodyApiVideoUpload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Upload uuid |  [optional]
**state** | [**CoinbaseCustodyApiVideoUploadState**](CoinbaseCustodyApiVideoUploadState.md) | Upload status |  [optional]
**transactionId** | **String** |  |  [optional]
**uploadedByUser** | [**CoinbaseCustodyApiDisplayUser**](CoinbaseCustodyApiDisplayUser.md) |  |  [optional]
**uploadedAt** | [**OffsetDateTime**](OffsetDateTime.md) | Time when the upload finished |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**updatedAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**securityCode** | **String** | Used for verifying the authenticity of the video |  [optional]
**signedUploadUrl** | **String** | Returned by CreateVideoUpload |  [optional]



