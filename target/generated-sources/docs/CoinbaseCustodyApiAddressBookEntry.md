
# CoinbaseCustodyApiAddressBookEntry

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | UUID identifying this address book entry | 
**currencySymbol** | **String** | Currency symbol |  [optional]
**name** | **String** | Name for this address book entry | 
**address** | **String** | Cryptocurrency address |  [optional]
**accountIdentifier** | **String** | Memo or destination tag for currencies which support them |  [optional]
**accountIdentifierName** | **String** | Name of the account identifier. For instance Destination Tag |  [optional]
**state** | **String** | State of this address book entry | 
**explorerLink** | **String** | Link to a blockchain explorer |  [optional]
**lastUsedAt** | [**OffsetDateTime**](OffsetDateTime.md) | When this entry was last used for a transaction |  [optional]
**addedAt** | [**OffsetDateTime**](OffsetDateTime.md) | When this entry was added to the address book |  [optional]
**addedBy** | [**CoinbaseCustodyApiDisplayUser**](CoinbaseCustodyApiDisplayUser.md) | User who created this address book entry | 
**type** | [**CoinbaseCustodyApiAddressBookType**](CoinbaseCustodyApiAddressBookType.md) | Type of address book entry |  [optional]
**counterpartyId** | **String** | counterparty id |  [optional]



