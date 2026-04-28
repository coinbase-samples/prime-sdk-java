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
import com.coinbase.prime.model.enums.OrderSide;
import com.coinbase.prime.model.enums.OrderStatus;
import com.coinbase.prime.orders.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

public class OrdersIT extends BaseIntegrationTest {

    @Test
    public void testListPortfolioOrders() throws Exception {
        assumeTrue(portfolioId != null && !portfolioId.isEmpty(),
                "Skipping: COINBASE_PRIME_PORTFOLIO_ID not set");
        OrdersService service = PrimeServiceFactory.createOrdersService(client);
        ListPortfolioOrdersResponse response = service.listPortfolioOrders(
                new ListPortfolioOrdersRequest.Builder()
                        .portfolioId(portfolioId)
                        .build());
        assertNotNull(response);
    }

    @Test
    public void testListPortfolioOrdersWithOptionals() throws Exception {
        assumeTrue(portfolioId != null && !portfolioId.isEmpty(),
                "Skipping: COINBASE_PRIME_PORTFOLIO_ID not set");
        OrdersService service = PrimeServiceFactory.createOrdersService(client);
        ListPortfolioOrdersResponse response = service.listPortfolioOrders(
                new ListPortfolioOrdersRequest.Builder()
                        .portfolioId(portfolioId)
                        .orderStatuses(new OrderStatus[]{OrderStatus.FILLED})
                        .productIds(new String[]{"BTC-USD"})
                        .orderSide(OrderSide.BUY)
                        .startDate("2025-01-01T00:00:00Z")
                        .endDate("2025-12-31T23:59:59Z")
                        .limit(5)
                        .build());
        assertNotNull(response);
    }

    @Test
    public void testListOpenOrders() throws Exception {
        assumeTrue(portfolioId != null && !portfolioId.isEmpty(),
                "Skipping: COINBASE_PRIME_PORTFOLIO_ID not set");
        OrdersService service = PrimeServiceFactory.createOrdersService(client);
        ListOpenOrdersResponse response = service.listOpenOrders(
                new ListOpenOrdersRequest.Builder()
                        .portfolioId(portfolioId)
                        .build());
        assertNotNull(response);
    }

    @Test
    public void testListOpenOrdersWithOptionals() throws Exception {
        assumeTrue(portfolioId != null && !portfolioId.isEmpty(),
                "Skipping: COINBASE_PRIME_PORTFOLIO_ID not set");
        OrdersService service = PrimeServiceFactory.createOrdersService(client);
        ListOpenOrdersResponse response = service.listOpenOrders(
                new ListOpenOrdersRequest.Builder()
                        .portfolioId(portfolioId)
                        .productIds(new String[]{"BTC-USD", "ETH-USD"})
                        .orderSide(OrderSide.BUY)
                        .limit(5)
                        .build());
        assertNotNull(response);
    }

    @Test
    public void testListPortfolioFills() throws Exception {
        assumeTrue(portfolioId != null && !portfolioId.isEmpty(),
                "Skipping: COINBASE_PRIME_PORTFOLIO_ID not set");
        OrdersService service = PrimeServiceFactory.createOrdersService(client);
        ListPortfolioFillsResponse response = service.listPortfolioFills(
                new ListPortfolioFillsRequest.Builder()
                        .portfolioId(portfolioId)
                        .startDate("2025-01-01T00:00:00Z")
                        .endDate("2025-12-31T23:59:59Z")
                        .build());
        assertNotNull(response);
    }

    @Test
    public void testListPortfolioFillsWithOptionals() throws Exception {
        assumeTrue(portfolioId != null && !portfolioId.isEmpty(),
                "Skipping: COINBASE_PRIME_PORTFOLIO_ID not set");
        OrdersService service = PrimeServiceFactory.createOrdersService(client);
        ListPortfolioFillsResponse response = service.listPortfolioFills(
                new ListPortfolioFillsRequest.Builder()
                        .portfolioId(portfolioId)
                        .startDate("2025-01-01T00:00:00Z")
                        .endDate("2025-06-30T23:59:59Z")
                        .limit(5)
                        .build());
        assertNotNull(response);
    }
}
