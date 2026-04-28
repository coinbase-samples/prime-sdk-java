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
import com.coinbase.core.errors.CoinbaseClientException;
import com.coinbase.prime.errors.CoinbasePrimeException;
import com.coinbase.prime.model.enums.WalletType;
import com.coinbase.prime.staking.GetStakingStatusRequest;
import com.coinbase.prime.staking.GetStakingStatusResponse;
import com.coinbase.prime.staking.GetUnstakingStatusRequest;
import com.coinbase.prime.staking.GetUnstakingStatusResponse;
import com.coinbase.prime.staking.StakingService;
import com.coinbase.prime.wallets.ListWalletsRequest;
import com.coinbase.prime.wallets.ListWalletsResponse;
import com.coinbase.prime.wallets.WalletsService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

public class StakingIT extends BaseIntegrationTest {

    /**
     * Finds a VAULT-type wallet (most likely to support staking).
     */
    private String resolveStakingWalletId() throws Exception {
        WalletsService walletsService = PrimeServiceFactory.createWalletsService(client);
        ListWalletsResponse wallets = walletsService.listWallets(
                new ListWalletsRequest.Builder()
                        .portfolioId(portfolioId)
                        .type(WalletType.VAULT)
                        .build());
        if (wallets == null || wallets.getWallets() == null || wallets.getWallets().length == 0) {
            return null;
        }
        return wallets.getWallets()[0].getId();
    }

    @Test
    public void testGetStakingStatus() throws Exception {
        assumeTrue(portfolioId != null && !portfolioId.isEmpty(),
                "Skipping: COINBASE_PRIME_PORTFOLIO_ID not set");
        String walletId = resolveStakingWalletId();
        assumeTrue(walletId != null, "Skipping: no VAULT wallets found for portfolio");

        StakingService service = PrimeServiceFactory.createStakingService(client);
        try {
            GetStakingStatusResponse response = service.getStakingStatus(
                    new GetStakingStatusRequest.Builder()
                            .portfolioId(portfolioId)
                            .walletId(walletId)
                            .build());
            assertNotNull(response);
        } catch (CoinbaseClientException e) {
            String causeMsg = e.getCause() != null ? e.getCause().getMessage() : "";
            assumeTrue(!causeMsg.contains("not supported for staking"),
                    "Skipping: wallet currency does not support staking status via Prime API");
            throw e;
        }
    }

    @Test
    public void testGetUnstakingStatus() throws Exception {
        assumeTrue(portfolioId != null && !portfolioId.isEmpty(),
                "Skipping: COINBASE_PRIME_PORTFOLIO_ID not set");
        String walletId = resolveStakingWalletId();
        assumeTrue(walletId != null, "Skipping: no VAULT wallets found for portfolio");

        StakingService service = PrimeServiceFactory.createStakingService(client);
        try {
            GetUnstakingStatusResponse response = service.getUnstakingStatus(
                    new GetUnstakingStatusRequest.Builder()
                            .portfolioId(portfolioId)
                            .walletId(walletId)
                            .build());
            assertNotNull(response);
        } catch (CoinbaseClientException e) {
            String causeMsg = e.getCause() != null ? e.getCause().getMessage() : "";
            assumeTrue(!causeMsg.contains("not supported for unstaking") && !causeMsg.contains("not supported for staking"),
                    "Skipping: wallet currency does not support unstaking status via Prime API");
            throw e;
        }
    }
}
