/*
 * Copyright 2026-present Coinbase Global, Inc.
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

package com.coinbase.prime.integration;

import com.coinbase.prime.factory.PrimeServiceFactory;
import com.coinbase.prime.model.enums.TransactionType;
import com.coinbase.prime.transactions.*;
import com.coinbase.prime.wallets.ListWalletsRequest;
import com.coinbase.prime.wallets.ListWalletsResponse;
import com.coinbase.prime.wallets.WalletsService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

public class TransactionsIT extends BaseIntegrationTest {

    @Test
    public void testListPortfolioTransactions() throws Exception {
        assumeTrue(portfolioId != null && !portfolioId.isEmpty(),
                "Skipping: COINBASE_PRIME_PORTFOLIO_ID not set");
        TransactionsService service = PrimeServiceFactory.createTransactionsService(client);
        ListPortfolioTransactionsResponse response = service.listPortfolioTransactions(
                new ListPortfolioTransactionsRequest.Builder()
                        .portfolioId(portfolioId)
                        .build());
        assertNotNull(response);
    }

    @Test
    public void testListPortfolioTransactionsWithOptionals() throws Exception {
        assumeTrue(portfolioId != null && !portfolioId.isEmpty(),
                "Skipping: COINBASE_PRIME_PORTFOLIO_ID not set");
        TransactionsService service = PrimeServiceFactory.createTransactionsService(client);
        ListPortfolioTransactionsResponse response = service.listPortfolioTransactions(
                new ListPortfolioTransactionsRequest.Builder()
                        .portfolioId(portfolioId)
                        .symbols(new String[]{"BTC", "ETH"})
                        .types(new TransactionType[]{TransactionType.WITHDRAWAL, TransactionType.DEPOSIT})
                        .startTime("2025-01-01T00:00:00Z")
                        .endTime("2025-12-31T23:59:59Z")
                        .limit(5)
                        .build());
        assertNotNull(response);
    }

    @Test
    public void testListWalletTransactions() throws Exception {
        assumeTrue(portfolioId != null && !portfolioId.isEmpty(),
                "Skipping: COINBASE_PRIME_PORTFOLIO_ID not set");

        WalletsService walletsService = PrimeServiceFactory.createWalletsService(client);
        ListWalletsResponse wallets = walletsService.listWallets(
                new ListWalletsRequest.Builder().portfolioId(portfolioId).build());
        assumeTrue(wallets != null && wallets.getWallets() != null && wallets.getWallets().length > 0,
                "Skipping: no wallets found for portfolio");

        String walletId = wallets.getWallets()[0].getId();

        TransactionsService service = PrimeServiceFactory.createTransactionsService(client);
        ListWalletTransactionsResponse response = service.listWalletTransactions(
                new ListWalletTransactionsRequest.Builder()
                        .portfolioId(portfolioId)
                        .walletId(walletId)
                        .build());
        assertNotNull(response);
    }

    @Test
    public void testListWalletTransactionsWithOptionals() throws Exception {
        assumeTrue(portfolioId != null && !portfolioId.isEmpty(),
                "Skipping: COINBASE_PRIME_PORTFOLIO_ID not set");

        WalletsService walletsService = PrimeServiceFactory.createWalletsService(client);
        ListWalletsResponse wallets = walletsService.listWallets(
                new ListWalletsRequest.Builder().portfolioId(portfolioId).build());
        assumeTrue(wallets != null && wallets.getWallets() != null && wallets.getWallets().length > 0,
                "Skipping: no wallets found for portfolio");

        String walletId = wallets.getWallets()[0].getId();

        TransactionsService service = PrimeServiceFactory.createTransactionsService(client);
        ListWalletTransactionsResponse response = service.listWalletTransactions(
                new ListWalletTransactionsRequest.Builder()
                        .portfolioId(portfolioId)
                        .walletId(walletId)
                        .types(new TransactionType[]{TransactionType.WITHDRAWAL})
                        .startTime("2025-01-01T00:00:00Z")
                        .endTime("2025-12-31T23:59:59Z")
                        .limit(5)
                        .build());
        assertNotNull(response);
    }
}
