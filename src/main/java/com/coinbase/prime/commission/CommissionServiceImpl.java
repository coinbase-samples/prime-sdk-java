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

package com.coinbase.prime.commission;

import com.coinbase.core.common.HttpMethod;
import com.coinbase.core.service.CoinbaseServiceImpl;
import com.coinbase.prime.client.CoinbasePrimeClient;
import com.coinbase.prime.errors.CoinbasePrimeException;
import com.coinbase.prime.model.commission.GetPortfolioCommissionRequest;
import com.coinbase.prime.model.commission.GetPortfolioCommissionResponse;
import com.fasterxml.jackson.core.type.TypeReference;

import java.util.List;

public class CommissionServiceImpl extends CoinbaseServiceImpl implements CommissionService {
    public CommissionServiceImpl(CoinbasePrimeClient client) {
        super(client);
    }

    @Override
    public GetPortfolioCommissionResponse getPortfolioCommission(GetPortfolioCommissionRequest request) throws CoinbasePrimeException {
        return this.request(
                HttpMethod.GET,
                String.format("/portfolios/%s/commission", request.getPortfolioId()),
                null,
                List.of(200),
                new TypeReference<GetPortfolioCommissionResponse>() {});
    }
}
