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

import com.coinbase.core.service.CoinbaseServiceImpl;
import com.coinbase.prime.client.CoinbasePrimeClient;
import com.coinbase.prime.errors.CoinbasePrimeException;
import com.coinbase.prime.model.portfolios.*;

public class PortfoliosServiceImpl extends CoinbaseServiceImpl implements PortfoliosService {
    public PortfoliosServiceImpl(CoinbasePrimeClient client) {
        super(client);
    }

    @Override
    public ListPortfoliosResponse listPortfolios() throws CoinbasePrimeException {
        return doGet(new ListPortfoliosRequest(), ListPortfoliosResponse.class);
    }

    @Override
    public GetPortfolioByIdResponse getPortfolioById(GetPortfolioByIdRequest request) throws CoinbasePrimeException {
        GetPortfolioByIdResponse resp = doGet(request, GetPortfolioByIdResponse.class);
        resp.setRequest(request);
        return resp;
    }

    @Override
    public GetPortfolioCreditInformationResponse getPortfolioCreditInformation(GetPortfolioCreditInformationRequest request) throws CoinbasePrimeException {
        GetPortfolioCreditInformationResponse resp = doGet(request, GetPortfolioCreditInformationResponse.class);
        resp.setRequest(request);
        return resp;
    }
}
