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

    /**
     * Creates an entry to the portfolio's onchain address groups.
     *
     * @param request the request containing portfolio ID and address group data
     * @return the response containing activity creation details
     * @throws CoinbasePrimeException if the request fails
     */
    CreateOnchainAddressGroupResponse createOnchainAddressGroup(CreateOnchainAddressGroupRequest request) 
            throws CoinbasePrimeException;

    /**
     * Updates an entry to the portfolio's onchain address groups.
     *
     * @param request the request containing portfolio ID and updated address group data
     * @return the response containing activity creation details
     * @throws CoinbasePrimeException if the request fails
     */
    UpdateOnchainAddressGroupResponse updateOnchainAddressGroup(UpdateOnchainAddressGroupRequest request) 
            throws CoinbasePrimeException;

    /**
     * Deletes an entry in the portfolio's onchain address groups.
     *
     * @param request the request containing portfolio ID and address group ID to delete
     * @return the response containing activity creation details
     * @throws CoinbasePrimeException if the request fails
     */
    DeleteOnchainAddressGroupResponse deleteOnchainAddressGroup(DeleteOnchainAddressGroupRequest request) 
            throws CoinbasePrimeException;
}