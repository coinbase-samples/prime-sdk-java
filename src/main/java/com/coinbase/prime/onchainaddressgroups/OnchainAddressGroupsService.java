package com.coinbase.prime.onchainaddressgroups;

import com.coinbase.prime.errors.CoinbasePrimeException;

/**
 * Service for managing onchain address groups.
 */
public interface OnchainAddressGroupsService {
    /**
     * Lists all onchain address groups for a given portfolio ID.
     *
     * @param request the request containing portfolio ID and pagination parameters
     * @return the response containing the list of address groups
     * @throws CoinbasePrimeException if the request fails
     */
    ListOnchainAddressGroupsResponse listOnchainAddressGroups(ListOnchainAddressGroupsRequest request) 
            throws CoinbasePrimeException;
}