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

import com.coinbase.prime.advancedtransfer.*;
import com.coinbase.prime.factory.PrimeServiceFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

public class AdvancedTransferIT extends BaseIntegrationTest {

    @Test
    public void testListAdvancedTransfers() throws Exception {
        assumeTrue(portfolioId != null && !portfolioId.isEmpty(),
                "Skipping: COINBASE_PRIME_PORTFOLIO_ID not set");
        AdvancedTransferService service = PrimeServiceFactory.createAdvancedTransferService(client);
        ListAdvancedTransfersResponse response = service.listAdvancedTransfers(
                new ListAdvancedTransfersRequest.Builder()
                        .portfolioId(portfolioId)
                        .build());
        assertNotNull(response);
    }

    @Test
    public void testListAdvancedTransfersWithOptionals() throws Exception {
        assumeTrue(portfolioId != null && !portfolioId.isEmpty(),
                "Skipping: COINBASE_PRIME_PORTFOLIO_ID not set");
        AdvancedTransferService service = PrimeServiceFactory.createAdvancedTransferService(client);
        ListAdvancedTransfersResponse response = service.listAdvancedTransfers(
                new ListAdvancedTransfersRequest.Builder()
                        .portfolioId(portfolioId)
                        .startTime("2025-01-01T00:00:00Z")
                        .endTime("2025-12-31T23:59:59Z")
                        .limit(5)
                        .build());
        assertNotNull(response);
    }

    @Test
    public void testGetPortfolioCounterpartyId() throws Exception {
        assumeTrue(portfolioId != null && !portfolioId.isEmpty(),
                "Skipping: COINBASE_PRIME_PORTFOLIO_ID not set");
        AdvancedTransferService service = PrimeServiceFactory.createAdvancedTransferService(client);
        GetPortfolioCounterpartyIdResponse response = service.getPortfolioCounterpartyId(
                new GetPortfolioCounterpartyIdRequest.Builder()
                        .portfolioId(portfolioId)
                        .build());
        assertNotNull(response);
    }

    @Test
    public void testListAdvancedTransferTransactions() throws Exception {
        assumeTrue(portfolioId != null && !portfolioId.isEmpty(),
                "Skipping: COINBASE_PRIME_PORTFOLIO_ID not set");

        AdvancedTransferService service = PrimeServiceFactory.createAdvancedTransferService(client);
        ListAdvancedTransfersResponse transfers = service.listAdvancedTransfers(
                new ListAdvancedTransfersRequest.Builder()
                        .portfolioId(portfolioId)
                        .limit(1)
                        .build());

        assumeTrue(transfers != null && transfers.getAdvancedTransfers() != null
                        && transfers.getAdvancedTransfers().length > 0,
                "Skipping: no advanced transfers found for portfolio");

        String advancedTransferId = transfers.getAdvancedTransfers()[0].getId();

        ListAdvancedTransferTransactionsResponse response = service.listAdvancedTransferTransactions(
                new ListAdvancedTransferTransactionsRequest.Builder()
                        .portfolioId(portfolioId)
                        .advancedTransferId(advancedTransferId)
                        .build());
        assertNotNull(response);
    }
}
