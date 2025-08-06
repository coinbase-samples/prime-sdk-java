package com.coinbase.prime.onchainaddressgroups;

import com.coinbase.core.common.HttpMethod;
import com.coinbase.core.service.CoinbaseServiceImpl;
import com.coinbase.prime.client.CoinbasePrimeClient;
import com.coinbase.prime.errors.CoinbasePrimeException;
import com.fasterxml.jackson.core.type.TypeReference;

import java.util.List;

/**
 * Implementation of OnchainAddressGroupsService.
 */
public class OnchainAddressGroupsServiceImpl extends CoinbaseServiceImpl implements OnchainAddressGroupsService {

    public OnchainAddressGroupsServiceImpl(CoinbasePrimeClient client) {
        super(client);
    }

    @Override
    public ListOnchainAddressGroupsResponse listOnchainAddressGroups(ListOnchainAddressGroupsRequest request) 
            throws CoinbasePrimeException {
        return this.request(
                HttpMethod.GET,
                request.getPath(),
                request,
                List.of(200),
                new TypeReference<ListOnchainAddressGroupsResponse>() {});
    }

    @Override
    public CreateOnchainAddressGroupResponse createOnchainAddressGroup(CreateOnchainAddressGroupRequest request) 
            throws CoinbasePrimeException {
        return this.request(
                HttpMethod.POST,
                request.getPath(),
                request,
                List.of(200),
                new TypeReference<CreateOnchainAddressGroupResponse>() {});
    }

    @Override
    public UpdateOnchainAddressGroupResponse updateOnchainAddressGroup(UpdateOnchainAddressGroupRequest request) 
            throws CoinbasePrimeException {
        return this.request(
                HttpMethod.PUT,
                request.getPath(),
                request,
                List.of(200),
                new TypeReference<UpdateOnchainAddressGroupResponse>() {});
    }

    @Override
    public DeleteOnchainAddressGroupResponse deleteOnchainAddressGroup(DeleteOnchainAddressGroupRequest request) 
            throws CoinbasePrimeException {
        return this.request(
                HttpMethod.DELETE,
                request.getPath(),
                request,
                List.of(200),
                new TypeReference<DeleteOnchainAddressGroupResponse>() {});
    }
}