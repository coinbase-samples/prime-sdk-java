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

import com.coinbase.core.service.CoinbaseServiceImpl;
import com.coinbase.prime.client.CoinbasePrimeClient;
import com.coinbase.prime.errors.CoinbasePrimeException;
import com.coinbase.prime.model.activities.GetActivityByActivityIdRequest;
import com.coinbase.prime.model.activities.GetActivityByActivityIdResponse;
import com.coinbase.prime.model.activities.ListActivitiesRequest;
import com.coinbase.prime.model.activities.ListActivitiesResponse;

public class ActivitiesServiceImpl extends CoinbaseServiceImpl implements ActivitiesService {
    public ActivitiesServiceImpl(CoinbasePrimeClient client) {
        super(client);
    }

    @Override
    public ListActivitiesResponse listActivities(ListActivitiesRequest request) throws CoinbasePrimeException {
        ListActivitiesResponse resp = doGet(request, ListActivitiesResponse.class);
        resp.setRequest(request);
        return resp;
    }

    @Override
    public GetActivityByActivityIdResponse getActivityByActivityId(GetActivityByActivityIdRequest request) throws CoinbasePrimeException {
        GetActivityByActivityIdResponse resp = doGet(request, GetActivityByActivityIdResponse.class);
        resp.setRequest(request);
        return resp;
    }
}
