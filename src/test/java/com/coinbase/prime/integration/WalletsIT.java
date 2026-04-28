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
import com.coinbase.prime.model.enums.WalletDepositInstructionType;
import com.coinbase.prime.model.enums.WalletType;
import com.coinbase.prime.wallets.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

public class WalletsIT extends BaseIntegrationTest {

    private String resolveWalletId() throws Exception {
        WalletsService service = PrimeServiceFactory.createWalletsService(client);
        ListWalletsResponse wallets = service.listWallets(
                new ListWalletsRequest.Builder().portfolioId(portfolioId).build());
        if (wallets == null || wallets.getWallets() == null || wallets.getWallets().length == 0) {
            return null;
        }
        return wallets.getWallets()[0].getId();
    }

    @Test
    public void testListWallets() throws Exception {
        assumeTrue(portfolioId != null && !portfolioId.isEmpty(),
                "Skipping: COINBASE_PRIME_PORTFOLIO_ID not set");
        WalletsService service = PrimeServiceFactory.createWalletsService(client);
        ListWalletsResponse response = service.listWallets(
                new ListWalletsRequest.Builder()
                        .portfolioId(portfolioId)
                        .build());
        assertNotNull(response);
    }

    @Test
    public void testListWalletsWithOptionals() throws Exception {
        assumeTrue(portfolioId != null && !portfolioId.isEmpty(),
                "Skipping: COINBASE_PRIME_PORTFOLIO_ID not set");
        WalletsService service = PrimeServiceFactory.createWalletsService(client);
        ListWalletsResponse response = service.listWallets(
                new ListWalletsRequest.Builder()
                        .portfolioId(portfolioId)
                        .type(WalletType.TRADING)
                        .symbols(new String[]{"BTC", "ETH", "USDC"})
                        .limit(5)
                        .build());
        assertNotNull(response);
    }

    @Test
    public void testGetWallet() throws Exception {
        assumeTrue(portfolioId != null && !portfolioId.isEmpty(),
                "Skipping: COINBASE_PRIME_PORTFOLIO_ID not set");
        String walletId = resolveWalletId();
        assumeTrue(walletId != null, "Skipping: no wallets found for portfolio");

        WalletsService service = PrimeServiceFactory.createWalletsService(client);
        GetWalletResponse response = service.getWallet(
                new GetWalletRequest.Builder()
                        .portfolioId(portfolioId)
                        .walletId(walletId)
                        .build());
        assertNotNull(response);
    }

    @Test
    public void testListWalletAddresses() throws Exception {
        assumeTrue(portfolioId != null && !portfolioId.isEmpty(),
                "Skipping: COINBASE_PRIME_PORTFOLIO_ID not set");
        String walletId = resolveWalletId();
        assumeTrue(walletId != null, "Skipping: no wallets found for portfolio");

        WalletsService service = PrimeServiceFactory.createWalletsService(client);
        ListWalletAddressesResponse response = service.listWalletAddresses(
                new ListWalletAddressesRequest.Builder()
                        .portfolioId(portfolioId)
                        .walletId(walletId)
                        .build());
        assertNotNull(response);
    }

    @Test
    public void testListWalletAddressesWithPagination() throws Exception {
        assumeTrue(portfolioId != null && !portfolioId.isEmpty(),
                "Skipping: COINBASE_PRIME_PORTFOLIO_ID not set");
        String walletId = resolveWalletId();
        assumeTrue(walletId != null, "Skipping: no wallets found for portfolio");

        WalletsService service = PrimeServiceFactory.createWalletsService(client);
        ListWalletAddressesResponse response = service.listWalletAddresses(
                new ListWalletAddressesRequest.Builder()
                        .portfolioId(portfolioId)
                        .walletId(walletId)
                        .limit(5)
                        .build());
        assertNotNull(response);
    }

    @Test
    public void testGetWalletDepositInstructions() throws Exception {
        assumeTrue(portfolioId != null && !portfolioId.isEmpty(),
                "Skipping: COINBASE_PRIME_PORTFOLIO_ID not set");
        String walletId = resolveWalletId();
        assumeTrue(walletId != null, "Skipping: no wallets found for portfolio");

        WalletsService service = PrimeServiceFactory.createWalletsService(client);
        GetWalletDepositInstructionsResponse response = service.getWalletDepositInstructions(
                new GetWalletDepositInstructionsRequest.Builder()
                        .portfolioId(portfolioId)
                        .walletId(walletId)
                        .depositType(WalletDepositInstructionType.CRYPTO)
                        .build());
        assertNotNull(response);
    }
}
