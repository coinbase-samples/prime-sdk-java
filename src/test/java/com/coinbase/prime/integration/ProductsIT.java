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
import com.coinbase.prime.model.enums.CandlesGranularity;
import com.coinbase.prime.products.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

public class ProductsIT extends BaseIntegrationTest {

    @Test
    public void testListPortfolioProducts() throws Exception {
        assumeTrue(portfolioId != null && !portfolioId.isEmpty(),
                "Skipping: COINBASE_PRIME_PORTFOLIO_ID not set");
        ProductsService service = PrimeServiceFactory.createProductsService(client);
        ListPortfolioProductsResponse response = service.listPortfolioProducts(
                new ListPortfolioProductsRequest.Builder()
                        .portfolioId(portfolioId)
                        .build());
        assertNotNull(response);
    }

    @Test
    public void testListPortfolioProductsWithPagination() throws Exception {
        assumeTrue(portfolioId != null && !portfolioId.isEmpty(),
                "Skipping: COINBASE_PRIME_PORTFOLIO_ID not set");
        ProductsService service = PrimeServiceFactory.createProductsService(client);
        ListPortfolioProductsResponse response = service.listPortfolioProducts(
                new ListPortfolioProductsRequest.Builder()
                        .portfolioId(portfolioId)
                        .limit(10)
                        .build());
        assertNotNull(response);
    }

    @Test
    public void testGetCandles() throws Exception {
        assumeTrue(portfolioId != null && !portfolioId.isEmpty(),
                "Skipping: COINBASE_PRIME_PORTFOLIO_ID not set");
        ProductsService service = PrimeServiceFactory.createProductsService(client);
        GetCandlesResponse response = service.getCandles(
                new GetCandlesRequest.Builder()
                        .portfolioId(portfolioId)
                        .productId("BTC-USD")
                        .startTime("2025-01-01T00:00:00Z")
                        .endTime("2025-01-02T00:00:00Z")
                        .granularity(CandlesGranularity.ONE_HOUR)
                        .build());
        assertNotNull(response);
    }
}
