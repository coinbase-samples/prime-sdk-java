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

import com.coinbase.core.common.HttpMethod;
import com.coinbase.core.service.CoinbaseServiceImpl;
import com.coinbase.prime.client.CoinbasePrimeClient;
import com.coinbase.prime.errors.CoinbasePrimeException;
import com.coinbase.prime.model.transactions.*;
import com.fasterxml.jackson.core.type.TypeReference;

import java.util.List;

public class TransactionsServiceImpl extends CoinbaseServiceImpl implements TransactionsService {
    public TransactionsServiceImpl(CoinbasePrimeClient client) {
        super(client);
    }

    @Override
    public GetTransactionByTransactionIdResponse getTransactionByTransactionId(GetTransactionByTransactionIdRequest request) throws CoinbasePrimeException {
        return this.request(
                HttpMethod.GET,
                String.format("/portfolios/%s/transactions/%s", request.getPortfolioId(), request.getTransactionId()),
                null,
                List.of(200),
                new TypeReference<GetTransactionByTransactionIdResponse>() {});
    }

    @Override
    public CreateConversionResponse createConversion(CreateConversionRequest request) throws CoinbasePrimeException {
        return this.request(
                HttpMethod.POST,
                String.format("/portfolios/%s/wallets/%s/conversion", request.getPortfolioId(), request.getWalletId()),
                request,
                List.of(200),
                new TypeReference<CreateConversionResponse>() {});
    }

    @Override
    public ListPortfolioTransactionsResponse listPortfolioTransactions(ListPortfolioTransactionsRequest request) throws CoinbasePrimeException {
        return this.request(
                HttpMethod.GET,
                String.format("/portfolios/%s/transactions", request.getPortfolioId()),
                request,
                List.of(200),
                new TypeReference<ListPortfolioTransactionsResponse>() {});
    }

    @Override
    public ListWalletTransactionsResponse listWalletTransactions(ListWalletTransactionsRequest request) throws CoinbasePrimeException {
        return this.request(
                HttpMethod.GET,
                String.format("/portfolios/%s/wallets/%s/transactions", request.getPortfolioId(), request.getWalletId()),
                request,
                List.of(200),
                new TypeReference<ListWalletTransactionsResponse>() {});
    }

    @Override
    public CreateTransferResponse createTransfer(CreateTransferRequest request) throws CoinbasePrimeException {
        return this.request(
                HttpMethod.POST,
                String.format("/portfolios/%s/wallets/%s/transfers", request.getPortfolioId(), request.getWalletId()),
                request,
                List.of(200),
                new TypeReference<CreateTransferResponse>() {});
    }

    @Override
    public CreateWithdrawalResponse createWithdrawal(CreateWithdrawalRequest request) throws CoinbasePrimeException {
        return this.request(
                HttpMethod.POST,
                String.format("/portfolios/%s/wallets/%s/withdrawals", request.getPortfolioId(), request.getWalletId()),
                request,
                List.of(200),
                new TypeReference<CreateWithdrawalResponse>() {});
    }

    @Override
    public CreateOnchainTransactionResponse createOnchainTransaction(CreateOnchainTransactionRequest request) throws CoinbasePrimeException {
        return this.request(
                HttpMethod.POST,
                String.format("/portfolios/%s/wallets/%s/onchain_transaction", request.getPortfolioId(), request.getWalletId()),
                request,
                List.of(200),
                new TypeReference<CreateOnchainTransactionResponse>() {});
    }
}
