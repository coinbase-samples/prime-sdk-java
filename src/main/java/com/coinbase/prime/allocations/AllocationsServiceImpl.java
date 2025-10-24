/*
 * Copyright 2024-present Coinbase Global, Inc.
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

package com.coinbase.prime.allocations;

import com.coinbase.core.common.HttpMethod;
import com.coinbase.core.service.CoinbaseServiceImpl;
import com.coinbase.prime.client.CoinbasePrimeClient;
import com.coinbase.prime.errors.CoinbasePrimeException;
import com.fasterxml.jackson.core.type.TypeReference;

import java.util.List;

public class AllocationsServiceImpl extends CoinbaseServiceImpl implements AllocationsService {

    public AllocationsServiceImpl(CoinbasePrimeClient client) {
        super(client);
    }

    @Override
    public CreateAllocationResponse createAllocation(CreateAllocationRequest request) throws CoinbasePrimeException {
        return this.request(
                HttpMethod.POST,
                "/allocations",
                request,
                List.of(200),
                new TypeReference<CreateAllocationResponse>() {});
    }

    @Override
    public CreateNetAllocationResponse createNetAllocation(CreateNetAllocationRequest request) throws CoinbasePrimeException {
        return this.request(
                HttpMethod.POST,
                "/allocations/net",
                request,
                List.of(200),
                new TypeReference<CreateNetAllocationResponse>() {});
    }

    @Override
    public ListPortfolioAllocationsResponse getPortfolioAllocations(ListPortfolioAllocationsRequest request) throws CoinbasePrimeException {
        return this.request(
                HttpMethod.GET,
                String.format("/portfolios/%s/allocations", request.getPortfolioId()),
                request,
                List.of(200),
                new TypeReference<ListPortfolioAllocationsResponse>() {});
    }

    @Override
    public GetAllocationResponse getAllocation(GetAllocationRequest request) throws CoinbasePrimeException {
        return this.request(
                HttpMethod.GET,
                String.format("/portfolios/%s/allocations/%s", request.getPortfolioId(), request.getAllocationId()),
                null,
                List.of(200),
                new TypeReference<GetAllocationResponse>() {});
    }

    @Override
    public GetAllocationsByClientNettingIdResponse getAllocationsByClientNettingId(GetAllocationsByClientNettingIdRequest request) throws CoinbasePrimeException {
        return this.request(
                HttpMethod.GET,
                String.format("/portfolios/%s/allocations/net/%s", request.getPortfolioId(), request.getNettingId()),
                null,
                List.of(200),
                new TypeReference<GetAllocationsByClientNettingIdResponse>() {});
    }
}
