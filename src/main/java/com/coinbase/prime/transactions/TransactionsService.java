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

import com.coinbase.core.errors.CoinbaseClientException;
import com.coinbase.prime.errors.CoinbasePrimeException;

public interface TransactionsService {
    // Transactions - OpenAPI spec compliance
    ListPortfolioTransactionsResponse listPortfolioTransactions(ListPortfolioTransactionsRequest request) throws CoinbaseClientException, CoinbasePrimeException;
    GetTransactionResponse getTransaction(GetTransactionRequest request) throws CoinbaseClientException, CoinbasePrimeException;
    CreateConversionResponse createConversion(CreateConversionRequest request) throws CoinbaseClientException, CoinbasePrimeException;
    CreateOnchainTransactionResponse createOnchainTransaction(CreateOnchainTransactionRequest request) throws CoinbaseClientException, CoinbasePrimeException;
    ListWalletTransactionsResponse listWalletTransactions(ListWalletTransactionsRequest request) throws CoinbaseClientException, CoinbasePrimeException;
    CreateWalletTransferResponse createWalletTransfer(CreateWalletTransferRequest request) throws CoinbaseClientException, CoinbasePrimeException;
    CreateWalletWithdrawalResponse createWalletWithdrawal(CreateWalletWithdrawalRequest request) throws CoinbaseClientException, CoinbasePrimeException;
}
