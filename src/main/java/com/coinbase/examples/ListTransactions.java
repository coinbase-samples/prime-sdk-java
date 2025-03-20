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

package com.coinbase.examples;

import com.coinbase.prime.client.CoinbasePrimeClient;
import com.coinbase.prime.credentials.CoinbasePrimeCredentials;
import com.coinbase.prime.factory.PrimeServiceFactory;
import com.coinbase.prime.model.enums.TransactionType;
import com.coinbase.prime.model.transactions.ListPortfolioTransactionsRequest;
import com.coinbase.prime.model.transactions.ListPortfolioTransactionsResponse;
import com.coinbase.prime.transactions.TransactionsService;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ListTransactions {
    public static void main(String[] args) {
        try {
            CoinbasePrimeCredentials credentials = new CoinbasePrimeCredentials(System.getenv("COINBASE_PRIME_CREDENTIALS"));
            CoinbasePrimeClient client = new CoinbasePrimeClient(credentials);

            String portfolioId = System.getenv("COINBASE_PRIME_PORTFOLIO_ID");

            TransactionsService transactionsService = PrimeServiceFactory.createTransactionsService(client);
            ListPortfolioTransactionsResponse response = transactionsService.listPortfolioTransactions(
                    new ListPortfolioTransactionsRequest.Builder()
                            .portfolioId(portfolioId)
                            .symbols(new String[]{"ADA"})
                            .types(new TransactionType[]{TransactionType.CLAIM_REWARDS})
                            .build());

            System.out.println(new ObjectMapper().writeValueAsString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
