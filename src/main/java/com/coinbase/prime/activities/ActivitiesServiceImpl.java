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

package com.coinbase.prime.activities;

import com.coinbase.core.common.HttpMethod;
import com.coinbase.core.service.CoinbaseServiceImpl;
import com.coinbase.prime.client.CoinbasePrimeClient;
import com.coinbase.prime.errors.CoinbasePrimeException;
import com.fasterxml.jackson.core.type.TypeReference;

import java.util.List;

public class ActivitiesServiceImpl extends CoinbaseServiceImpl implements ActivitiesService {
    public ActivitiesServiceImpl(CoinbasePrimeClient client) {
        super(client);
    }

    @Override
    public ListActivitiesResponse listActivities(ListActivitiesRequest request) throws CoinbasePrimeException {
        return this.request(
                HttpMethod.GET,
                String.format("/portfolios/%s/activities", request.getPortfolioId()),
                request,
                List.of(200),
                new TypeReference<ListActivitiesResponse>() {});
    }

    @Override
    public GetActivityByActivityIdResponse getActivityByActivityId(GetActivityByActivityIdRequest request) throws CoinbasePrimeException {
        return this.request(
                HttpMethod.GET,
                String.format("/portfolios/%s/activities/%s", request.getPortfolioId(), request.getActivityId()),
                null,
                List.of(200),
                new TypeReference<GetActivityByActivityIdResponse>() {});
    }

    @Override
    public GetEntityActivityByActivityIdResponse getEntityActivityByActivityId(GetEntityActivityByActivityIdRequest request) throws CoinbasePrimeException {
        return this.request(
                HttpMethod.GET,
                String.format("/activities/%s", request.getActivityId()),
                null,
                List.of(200),
                new TypeReference<GetEntityActivityByActivityIdResponse>() {});
    }

    @Override
    public ListEntityActivitiesResponse listEntityActivities(ListEntityActivitiesRequest request) throws CoinbasePrimeException {
        return this.request(
                HttpMethod.GET,
                String.format("/entities/%s/activities", request.getEntityId()),
                request,
                List.of(200),
                new TypeReference<ListEntityActivitiesResponse>() {});
    }
}
