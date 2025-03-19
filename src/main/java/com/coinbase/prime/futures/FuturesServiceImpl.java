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

package com.coinbase.prime.futures;

import com.coinbase.core.common.HttpMethod;
import com.coinbase.core.service.CoinbaseServiceImpl;
import com.coinbase.prime.client.CoinbasePrimeClient;
import com.coinbase.prime.errors.CoinbasePrimeException;
import com.coinbase.prime.model.futures.*;
import com.fasterxml.jackson.core.type.TypeReference;

import java.util.List;

public class FuturesServiceImpl extends CoinbaseServiceImpl implements FuturesService {
    public FuturesServiceImpl(CoinbasePrimeClient client) {
        super(client);
    }

    @Override
    public SetAutoSweepResponse setAutoSweep(SetAutoSweepRequest request) throws CoinbasePrimeException {
        return this.request(
                HttpMethod.POST,
                String.format("/entities/%s/futures/auto_sweep", request.getEntityId()),
                request,
                List.of(200),
                new TypeReference<SetAutoSweepResponse>() {});
    }

    @Override
    public GetEntityFcmBalanceResponse getEntityFcmBalance(GetEntityFcmBalanceRequest request) throws CoinbasePrimeException {
        return this.request(
                HttpMethod.GET,
                String.format("/entities/%s/futures/balance_summary", request.getEntityId()),
                null,
                List.of(200),
                new TypeReference<GetEntityFcmBalanceResponse>() {});
    }

    @Override
    public GetEntityPositionsResponse getEntityPositions(GetEntityPositionsRequest request) throws CoinbasePrimeException {
        return this.request(
                HttpMethod.GET,
                String.format("/entities/%s/futures/positions", request.getEntityId()),
                null,
                List.of(200),
                new TypeReference<GetEntityPositionsResponse>() {});
    }

    @Override
    public ListEntityFuturesSweepsResponse listEntityFuturesSweeps(ListEntityFuturesSweepsRequest request) throws CoinbasePrimeException {
        return this.request(
                HttpMethod.GET,
                String.format("/entities/%s/futures/sweeps", request.getEntityId()),
                null,
                List.of(200),
                new TypeReference<ListEntityFuturesSweepsResponse>() {});
    }

    @Override
    public CancelEntityFuturesSweepResponse cancelEntityFuturesSweep(CancelEntityFuturesSweepRequest request) throws CoinbasePrimeException {
        return this.request(
                HttpMethod.DELETE,
                String.format("/entities/%s/futures/sweeps", request.getEntityId()),
                null,
                List.of(200),
                new TypeReference<CancelEntityFuturesSweepResponse>() {});
    }

    @Override
    public ScheduleEntityFuturesSweepResponse scheduleEntityFuturesSweep(ScheduleEntityFuturesSweepRequest request) throws CoinbasePrimeException {
        return this.request(
                HttpMethod.POST,
                String.format("/entities/%s/futures/sweeps", request.getEntityId()),
                request,
                List.of(200),
                new TypeReference<ScheduleEntityFuturesSweepResponse>() {});
    }
}
