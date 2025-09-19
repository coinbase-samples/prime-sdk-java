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

package com.coinbase.prime.portfolios;

import com.coinbase.core.common.HttpMethod;
import com.coinbase.core.service.CoinbaseServiceImpl;
import com.coinbase.prime.client.CoinbasePrimeClient;
import com.coinbase.prime.errors.CoinbasePrimeException;
import com.coinbase.prime.financing.GetPortfolioCreditInformationRequest;
import com.coinbase.prime.financing.GetPortfolioCreditInformationResponse;
import com.fasterxml.jackson.core.type.TypeReference;

import java.util.List;

public class PortfoliosServiceImpl extends CoinbaseServiceImpl implements PortfoliosService {
    public PortfoliosServiceImpl(CoinbasePrimeClient client) {
        super(client);
    }

    @Override
    public ListPortfoliosResponse listPortfolios(ListPortfoliosRequest request) throws CoinbasePrimeException {
        return this.request(
                HttpMethod.GET,
                "/portfolios",
                request,
                List.of(200),
                new TypeReference<ListPortfoliosResponse>() {});
    }

    @Override
    public GetPortfolioResponse getPortfolio(GetPortfolioRequest request) throws CoinbasePrimeException {
        return this.request(
                HttpMethod.GET,
                String.format("/portfolios/%s", request.getPortfolioId()),
                null,
                List.of(200),
                new TypeReference<GetPortfolioResponse>() {});
    }

    @Override
    public GetPortfolioCounterpartyIdResponse getPortfolioCounterpartyId(GetPortfolioCounterpartyIdRequest request) throws CoinbasePrimeException {
        return this.request(
                HttpMethod.GET,
                String.format("/portfolios/%s/counterparty_id", request.getPortfolioId()),
                null,
                List.of(200),
                new TypeReference<GetPortfolioCounterpartyIdResponse>() {});
    }

}
