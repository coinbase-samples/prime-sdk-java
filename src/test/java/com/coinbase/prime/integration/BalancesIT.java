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

import com.coinbase.prime.balances.*;
import com.coinbase.prime.factory.PrimeServiceFactory;
import com.coinbase.prime.model.enums.WalletType;
import com.coinbase.prime.wallets.ListWalletsRequest;
import com.coinbase.prime.wallets.ListWalletsResponse;
import com.coinbase.prime.wallets.WalletsService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

public class BalancesIT extends BaseIntegrationTest {

    @Test
    public void testListEntityBalances() throws Exception {
        assumeTrue(entityId != null && !entityId.isEmpty(),
                "Skipping: COINBASE_PRIME_ENTITY_ID not set");
        BalancesService service = PrimeServiceFactory.createBalancesService(client);
        ListEntityBalancesResponse response = service.listEntityBalances(
                new ListEntityBalancesRequest.Builder()
                        .entityId(entityId)
                        .build());
        assertNotNull(response);
    }

    @Test
    public void testListEntityBalancesWithSymbols() throws Exception {
        assumeTrue(entityId != null && !entityId.isEmpty(),
                "Skipping: COINBASE_PRIME_ENTITY_ID not set");
        BalancesService service = PrimeServiceFactory.createBalancesService(client);
        ListEntityBalancesResponse response = service.listEntityBalances(
                new ListEntityBalancesRequest.Builder()
                        .entityId(entityId)
                        .symbols(new String[]{"BTC", "ETH", "USDC"})
                        .build());
        assertNotNull(response);
    }

    @Test
    public void testListPortfolioBalances() throws Exception {
        assumeTrue(portfolioId != null && !portfolioId.isEmpty(),
                "Skipping: COINBASE_PRIME_PORTFOLIO_ID not set");
        BalancesService service = PrimeServiceFactory.createBalancesService(client);
        ListPortfolioBalancesResponse response = service.listPortfolioBalances(
                new ListPortfolioBalancesRequest.Builder()
                        .portfolioId(portfolioId)
                        .build());
        assertNotNull(response);
    }

    @Test
    public void testListPortfolioBalancesWithSymbols() throws Exception {
        assumeTrue(portfolioId != null && !portfolioId.isEmpty(),
                "Skipping: COINBASE_PRIME_PORTFOLIO_ID not set");
        BalancesService service = PrimeServiceFactory.createBalancesService(client);
        ListPortfolioBalancesResponse response = service.listPortfolioBalances(
                new ListPortfolioBalancesRequest.Builder()
                        .portfolioId(portfolioId)
                        .symbols(new String[]{"BTC", "ETH"})
                        .build());
        assertNotNull(response);
    }

    @Test
    public void testListOnchainWalletBalances() throws Exception {
        assumeTrue(portfolioId != null && !portfolioId.isEmpty(),
                "Skipping: COINBASE_PRIME_PORTFOLIO_ID not set");

        WalletsService walletsService = PrimeServiceFactory.createWalletsService(client);
        ListWalletsResponse wallets = walletsService.listWallets(
                new ListWalletsRequest.Builder()
                        .portfolioId(portfolioId)
                        .type(WalletType.ONCHAIN)
                        .build());
        assumeTrue(wallets != null && wallets.getWallets() != null && wallets.getWallets().length > 0,
                "Skipping: no ONCHAIN wallets found for portfolio");

        String walletId = wallets.getWallets()[0].getId();

        BalancesService service = PrimeServiceFactory.createBalancesService(client);
        ListOnchainWalletBalancesResponse response = service.listOnchainWalletBalances(
                new ListOnchainWalletBalancesRequest.Builder()
                        .portfolioId(portfolioId)
                        .walletId(walletId)
                        .build());
        assertNotNull(response);
    }
}
