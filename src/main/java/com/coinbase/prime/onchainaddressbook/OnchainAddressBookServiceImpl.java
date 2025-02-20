package com.coinbase.prime.onchainaddressbook;

import com.coinbase.core.common.HttpMethod;
import com.coinbase.core.service.CoinbaseServiceImpl;
import com.coinbase.prime.client.CoinbasePrimeClient;
import com.coinbase.prime.model.onchainaddressbook.*;
import com.fasterxml.jackson.core.type.TypeReference;

import java.util.List;

public class OnchainAddressBookServiceImpl extends CoinbaseServiceImpl implements OnchainAddressBookService {
    public OnchainAddressBookServiceImpl(CoinbasePrimeClient client) {
        super(client);
    }

    public CreateOnchainAddressBookEntryResponse createOnchainAddressBookEntry(CreateOnchainAddressBookEntryRequest request) {
        return this.request(
                HttpMethod.POST,
                String.format("/portfolios/%s/onchain_address_group", request.getPortfolioId()),
                request,
                List.of(200),
                new TypeReference<CreateOnchainAddressBookEntryResponse>() {});
    }

    public UpdateOnchainAddressBookEntryResponse updateOnchainAddressBookEntry(UpdateOnchainAddressBookEntryRequest request) {
        return this.request(
                HttpMethod.PUT,
                String.format("/portfolios/%s/onchain_address_group/%s", request.getPortfolioId(), request.getAddressGroupId()),
                request,
                List.of(200),
                new TypeReference<UpdateOnchainAddressBookEntryResponse>() {});
    }

    public DeleteOnchainAddressGroupResponse deleteOnchainAddressGroup(DeleteOnchainAddressGroupRequest request) {
        return this.request(
                HttpMethod.DELETE,
                String.format("/portfolios/%s/onchain_address_group/%s", request.getPortfolioId(), request.getAddressGroupId()),
                request,
                List.of(200),
                new TypeReference<DeleteOnchainAddressGroupResponse>() {});
    }

    public ListOnchainAddressGroupsResponse listOnchainAddressGroups(ListOnchainAddressGroupsRequest request) {
        return this.request(
                HttpMethod.GET,
                String.format("/portfolios/%s/onchain_address_groups", request.getPortfolioId()),
                request,
                List.of(200),
                new TypeReference<ListOnchainAddressGroupsResponse>() {});
    }
}
