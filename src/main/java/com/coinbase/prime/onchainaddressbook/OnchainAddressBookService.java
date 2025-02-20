package com.coinbase.prime.onchainaddressbook;

import com.coinbase.core.errors.CoinbaseClientException;
import com.coinbase.prime.errors.CoinbasePrimeException;
import com.coinbase.prime.model.onchainaddressbook.*;

public interface OnchainAddressBookService {
    CreateOnchainAddressBookEntryResponse createOnchainAddressBookEntry(CreateOnchainAddressBookEntryRequest request) throws CoinbaseClientException, CoinbasePrimeException;
    UpdateOnchainAddressBookEntryResponse updateOnchainAddressBookEntry(UpdateOnchainAddressBookEntryRequest request) throws CoinbaseClientException, CoinbasePrimeException;
    DeleteOnchainAddressGroupResponse deleteOnchainAddressGroup(DeleteOnchainAddressGroupRequest request) throws CoinbaseClientException, CoinbasePrimeException;
    ListOnchainAddressGroupsResponse listOnchainAddressGroups(ListOnchainAddressGroupsRequest request) throws CoinbaseClientException, CoinbasePrimeException;
}
