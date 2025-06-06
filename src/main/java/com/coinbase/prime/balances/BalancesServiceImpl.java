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

package com.coinbase.prime.balances;

import com.coinbase.core.common.HttpMethod;
import com.coinbase.core.service.CoinbaseServiceImpl;
import com.coinbase.prime.client.CoinbasePrimeClient;
import com.coinbase.prime.errors.CoinbasePrimeException;
import com.fasterxml.jackson.core.type.TypeReference;

import java.util.List;

public class BalancesServiceImpl extends CoinbaseServiceImpl implements BalancesService {
    public BalancesServiceImpl(CoinbasePrimeClient client) {
        super(client);
    }

    @Override
    public ListEntityBalancesResponse listEntityBalances(ListEntityBalancesRequest request) throws CoinbasePrimeException {
        return this.request(
                HttpMethod.GET,
                String.format("/entities/%s/balances", request.getEntityId()),
                request,
                List.of(200),
                new TypeReference<ListEntityBalancesResponse>() {});
    }

    @Override
    public ListPortfolioBalancesResponse listPortfolioBalances(ListPortfolioBalancesRequest request) throws CoinbasePrimeException {
        return this.request(
                HttpMethod.GET,
                String.format("/portfolios/%s/balances", request.getPortfolioId()),
                request,
                List.of(200),
                new TypeReference<ListPortfolioBalancesResponse>() {});
    }

    @Override
    public GetWalletBalanceResponse getWalletBalance(GetWalletBalanceRequest request) throws CoinbasePrimeException {
        return this.request(
                HttpMethod.GET,
                String.format("/portfolios/%s/wallets/%s/balance", request.getPortfolioId(), request.getWalletId()),
                null,
                List.of(200),
                new TypeReference<GetWalletBalanceResponse>() {});
    }

    @Override
    public ListOnchainWalletBalancesResponse listOnchainWalletBalances(ListOnchainWalletBalancesRequest request) throws CoinbasePrimeException {
        return this.request(
                HttpMethod.GET,
                String.format("/portfolios/%s/wallets/%s/web3_balances", request.getPortfolioId(), request.getWalletId()),
                request,
                List.of(200),
                new TypeReference<ListOnchainWalletBalancesResponse>() {});
    }
}
