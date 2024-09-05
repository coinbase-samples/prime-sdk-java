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

import com.coinbase.core.service.CoinbaseServiceImpl;
import com.coinbase.prime.client.CoinbasePrimeClient;
import com.coinbase.prime.errors.CoinbasePrimeException;
import com.coinbase.prime.model.allocations.*;

public class AllocationsServiceImpl extends CoinbaseServiceImpl implements AllocationsService {

    public AllocationsServiceImpl(CoinbasePrimeClient client) {
        super(client);
    }

    @Override
    public CreateAllocationResponse createAllocation(CreateAllocationRequest request) throws CoinbasePrimeException {
        CreateAllocationResponse resp = doPost(request, CreateAllocationResponse.class);
        resp.setRequest(request);
        return resp;
    }

    @Override
    public CreateNetAllocationResponse createNetAllocation(CreateNetAllocationRequest request) throws CoinbasePrimeException {
        CreateNetAllocationResponse resp = doPost(request, CreateNetAllocationResponse.class);
        resp.setRequest(request);
        return resp;
    }

    @Override
    public GetPortfolioAllocationsResponse getPortfolioAllocations(GetPortfolioAllocationsRequest request) throws CoinbasePrimeException {
        GetPortfolioAllocationsResponse response = doGet(request, GetPortfolioAllocationsResponse.class);
        response.setRequest(request);
        return response;
    }

    @Override
    public GetAllocationResponse getAllocation(GetAllocationRequest request) throws CoinbasePrimeException {
        GetAllocationResponse resp = doGet(request, GetAllocationResponse.class);
        resp.setRequest(request);
        return resp;
    }

    @Override
    public GetAllocationsByClientNettingIdResponse getNetAllocationsByNettingId(GetAllocationsByClientNettingIdRequest request) throws CoinbasePrimeException {
        GetAllocationsByClientNettingIdResponse resp = doGet(request, GetAllocationsByClientNettingIdResponse.class);
        resp.setRequest(request);
        return resp;
    }
}
