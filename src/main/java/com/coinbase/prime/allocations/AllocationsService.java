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

import com.coinbase.core.errors.CoinbaseClientException;
import com.coinbase.prime.errors.CoinbasePrimeException;
import com.coinbase.prime.model.allocations.*;

public interface AllocationsService {
    // Allocations
    CreateAllocationResponse createAllocation(CreateAllocationRequest request) throws CoinbaseClientException, CoinbasePrimeException;
    CreateNetAllocationResponse createNetAllocation(CreateNetAllocationRequest request) throws CoinbaseClientException, CoinbasePrimeException;
    GetPortfolioAllocationsResponse getPortfolioAllocations(GetPortfolioAllocationsRequest request) throws CoinbaseClientException, CoinbasePrimeException;
    GetAllocationResponse getAllocation(GetAllocationRequest request) throws CoinbaseClientException, CoinbasePrimeException;
    GetAllocationsByClientNettingIdResponse getNetAllocationsByNettingId(GetAllocationsByClientNettingIdRequest request) throws CoinbaseClientException, CoinbasePrimeException;
}