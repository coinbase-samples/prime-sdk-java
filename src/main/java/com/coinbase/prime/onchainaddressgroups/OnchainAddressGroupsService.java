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