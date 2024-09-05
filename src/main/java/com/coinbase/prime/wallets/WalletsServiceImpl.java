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

import com.coinbase.core.service.CoinbaseServiceImpl;
import com.coinbase.prime.client.CoinbasePrimeClient;
import com.coinbase.prime.errors.CoinbasePrimeException;
import com.coinbase.prime.model.wallets.*;

public class WalletsServiceImpl extends CoinbaseServiceImpl implements WalletsService {
    public WalletsServiceImpl(CoinbasePrimeClient client) {
        super(client);
    }

    @Override
    public ListWalletsResponse listWallets(ListWalletsRequest request) throws CoinbasePrimeException {
        ListWalletsResponse resp = doGet(request, ListWalletsResponse.class);
        resp.setRequest(request);
        return resp;
    }

    @Override
    public CreateWalletResponse createWallet(CreateWalletRequest request) throws CoinbasePrimeException {
        CreateWalletResponse resp = doPost(request, CreateWalletResponse.class);
        resp.setRequest(request);
        return resp;
    }

    @Override
    public GetWalletByIdResponse getWalletById(GetWalletByIdRequest request) throws CoinbasePrimeException {
        GetWalletByIdResponse resp = doGet(request, GetWalletByIdResponse.class);
        resp.setRequest(request);
        return resp;
    }

    @Override
    public GetWalletDepositInstructionsResponse getWalletDepositInstructions(GetWalletDepositInstructionsRequest request) throws CoinbasePrimeException {
        GetWalletDepositInstructionsResponse resp = doGet(request, GetWalletDepositInstructionsResponse.class);
        resp.setRequest(request);
        return resp;
    }
}
