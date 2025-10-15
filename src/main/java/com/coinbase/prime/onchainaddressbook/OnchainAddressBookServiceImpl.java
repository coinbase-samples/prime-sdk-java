/*
 * Copyright 2025-present Coinbase Global, Inc.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.coinbase.prime.onchainaddressbook;

import com.coinbase.core.common.HttpMethod;
import com.coinbase.core.service.CoinbaseServiceImpl;
import com.coinbase.prime.client.CoinbasePrimeClient;
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
                String.format("/portfolios/%s/onchain_address_group", request.getPortfolioId()),
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
