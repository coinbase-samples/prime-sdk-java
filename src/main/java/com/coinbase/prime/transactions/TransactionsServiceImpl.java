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

package com.coinbase.prime.transactions;

import com.coinbase.core.service.CoinbaseServiceImpl;
import com.coinbase.prime.client.CoinbasePrimeClient;
import com.coinbase.prime.errors.CoinbasePrimeException;
import com.coinbase.prime.model.transactions.*;

public class TransactionsServiceImpl extends CoinbaseServiceImpl implements TransactionsService {
    public TransactionsServiceImpl(CoinbasePrimeClient client) {
        super(client);
    }

    @Override
    public GetTransactionByTransactionIdResponse getTransactionByTransactionId(GetTransactionByTransactionIdRequest request) throws CoinbasePrimeException {
        GetTransactionByTransactionIdResponse resp = doGet(request, GetTransactionByTransactionIdResponse.class);
        resp.setRequest(request);
        return resp;
    }

    @Override
    public CreateConversionResponse createConversion(CreateConversionRequest request) throws CoinbasePrimeException {
        CreateConversionResponse resp = doPost(request, CreateConversionResponse.class);
        resp.setRequest(request);
        return resp;
    }

    @Override
    public ListPortfolioTransactionsResponse listPortfolioTransactions(ListPortfolioTransactionsRequest request) throws CoinbasePrimeException {
        ListPortfolioTransactionsResponse resp = doGet(request, ListPortfolioTransactionsResponse.class);
        resp.setRequest(request);
        return resp;
    }

    @Override
    public ListWalletTransactionsResponse listWalletTransactions(ListWalletTransactionsRequest request) throws CoinbasePrimeException {
        ListWalletTransactionsResponse resp = doGet(request, ListWalletTransactionsResponse.class);
        resp.setRequest(request);
        return resp;
    }

    @Override
    public CreateTransferResponse createTransfer(CreateTransferRequest request) throws CoinbasePrimeException {
        CreateTransferResponse resp = doPost(request, CreateTransferResponse.class);
        resp.setRequest(request);
        return resp;
    }

    @Override
    public CreateWithdrawalResponse createWithdrawal(CreateWithdrawalRequest request) throws CoinbasePrimeException {
        CreateWithdrawalResponse resp = doPost(request, CreateWithdrawalResponse.class);
        resp.setRequest(request);
        return resp;
    }
}
