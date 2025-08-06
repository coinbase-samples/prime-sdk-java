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

package com.coinbase.prime.wallets;

import com.coinbase.core.common.HttpMethod;
import com.coinbase.core.service.CoinbaseServiceImpl;
import com.coinbase.prime.client.CoinbasePrimeClient;
import com.coinbase.prime.errors.CoinbasePrimeException;
import com.fasterxml.jackson.core.type.TypeReference;

import java.util.List;

public class WalletsServiceImpl extends CoinbaseServiceImpl implements WalletsService {
    public WalletsServiceImpl(CoinbasePrimeClient client) {
        super(client);
    }

    @Override
    public ListWalletsResponse listWallets(ListWalletsRequest request) throws CoinbasePrimeException {
        return this.request(
                HttpMethod.GET,
                String.format("/portfolios/%s/wallets", request.getPortfolioId()),
                request,
                List.of(200),
                new TypeReference<ListWalletsResponse>() {});
    }

    @Override
    public CreateWalletResponse createWallet(CreateWalletRequest request) throws CoinbasePrimeException {
        return this.request(
                HttpMethod.POST,
                String.format("/portfolios/%s/wallets", request.getPortfolioId()),
                request,
                List.of(200),
                new TypeReference<CreateWalletResponse>() {});
    }

    @Override
    public GetWalletResponse getWallet(GetWalletRequest request) throws CoinbasePrimeException {
        return this.request(
                HttpMethod.GET,
                String.format("/portfolios/%s/wallets/%s", request.getPortfolioId(), request.getWalletId()),
                null,
                List.of(200),
                new TypeReference<GetWalletResponse>() {});
    }

    @Override
    public GetWalletDepositInstructionsResponse getWalletDepositInstructions(GetWalletDepositInstructionsRequest request) throws CoinbasePrimeException {
        return this.request(
                HttpMethod.GET,
                String.format("/portfolios/%s/wallets/%s/deposit_instructions", request.getPortfolioId(), request.getWalletId()),
                null,
                List.of(200),
                new TypeReference<GetWalletDepositInstructionsResponse>() {});
    }

    @Override
    public ListWalletAddressesResponse listWalletAddresses(ListWalletAddressesRequest request) throws CoinbasePrimeException {
        return this.request(
                HttpMethod.GET,
                String.format("/portfolios/%s/wallets/%s/addresses", request.getPortfolioId(), request.getWalletId()),
                request,
                List.of(200),
                new TypeReference<ListWalletAddressesResponse>() {});
    }

    @Override
    public CreateWalletDepositAddressResponse createWalletDepositAddress(CreateWalletDepositAddressRequest request) throws CoinbasePrimeException {
        return this.request(
                HttpMethod.POST,
                String.format("/portfolios/%s/wallets/%s/addresses", request.getPortfolioId(), request.getWalletId()),
                request,
                List.of(200),
                new TypeReference<CreateWalletDepositAddressResponse>() {});
    }
}
