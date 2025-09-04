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

package com.coinbase.prime.positions;

import com.coinbase.core.common.HttpMethod;
import com.coinbase.core.service.CoinbaseServiceImpl;
import com.coinbase.prime.client.CoinbasePrimeClient;
import com.fasterxml.jackson.core.type.TypeReference;

import java.util.List;

public class PositionsServiceImpl extends CoinbaseServiceImpl implements PositionsService {
    public PositionsServiceImpl(CoinbasePrimeClient client) {
        super(client);
    }

    @Override
    public ListAggregateEntityPositionsResponse listAggregateEntityPositions(ListAggregateEntityPositionsRequest request) {
        return this.request(
                HttpMethod.GET,
                String.format("/entities/%s/aggregate_positions", request.getEntityId()),
                request,
                List.of(200),
                new TypeReference<ListAggregateEntityPositionsResponse>() {});
    }

    @Override
    public ListEntityPositionsResponse listEntityPositions(ListEntityPositionsRequest request) {
        return this.request(
                HttpMethod.GET,
                String.format("/entities/%s/positions", request.getEntityId()),
                request,
                List.of(200),
                new TypeReference<ListEntityPositionsResponse>() {});
    }
}
