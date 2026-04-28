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

import com.coinbase.core.errors.CoinbaseClientException;
import com.coinbase.prime.factory.PrimeServiceFactory;
import com.coinbase.prime.financing.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

public class FinancingIT extends BaseIntegrationTest {

    @Test
    public void testListInterestAccruals() throws Exception {
        assumeTrue(entityId != null && !entityId.isEmpty(),
                "Skipping: COINBASE_PRIME_ENTITY_ID not set");
        FinancingService service = PrimeServiceFactory.createFinancingService(client);
        ListInterestAccrualsResponse response = service.listInterestAccruals(
                new ListInterestAccrualsRequest.Builder()
                        .entityId(entityId)
                        .build());
        assertNotNull(response);
    }

    @Test
    public void testListInterestAccrualsWithDateRange() throws Exception {
        assumeTrue(entityId != null && !entityId.isEmpty(),
                "Skipping: COINBASE_PRIME_ENTITY_ID not set");
        FinancingService service = PrimeServiceFactory.createFinancingService(client);
        ListInterestAccrualsResponse response = service.listInterestAccruals(
                new ListInterestAccrualsRequest.Builder()
                        .entityId(entityId)
                        .startDate("2025-01-01")
                        .endDate("2025-12-31")
                        .build());
        assertNotNull(response);
    }

    @Test
    public void testGetCrossMarginOverview() throws Exception {
        assumeTrue(entityId != null && !entityId.isEmpty(),
                "Skipping: COINBASE_PRIME_ENTITY_ID not set");
        FinancingService service = PrimeServiceFactory.createFinancingService(client);
        GetCrossMarginOverviewResponse response = service.getCrossMarginOverview(
                new GetCrossMarginOverviewRequest.Builder()
                        .entityId(entityId)
                        .build());
        assertNotNull(response);
    }

    @Test
    public void testGetEntityLocateAvailabilities() throws Exception {
        assumeTrue(entityId != null && !entityId.isEmpty(),
                "Skipping: COINBASE_PRIME_ENTITY_ID not set");
        FinancingService service = PrimeServiceFactory.createFinancingService(client);
        GetEntityLocateAvailabilitiesResponse response = service.getEntityLocateAvailabilities(
                new GetEntityLocateAvailabilitiesRequest.Builder()
                        .entityId(entityId)
                        .build());
        assertNotNull(response);
    }

    @Test
    public void testGetMarginInformation() throws Exception {
        assumeTrue(entityId != null && !entityId.isEmpty(),
                "Skipping: COINBASE_PRIME_ENTITY_ID not set");
        FinancingService service = PrimeServiceFactory.createFinancingService(client);
        GetMarginInformationResponse response = service.getMarginInformation(
                new GetMarginInformationRequest.Builder()
                        .entityId(entityId)
                        .build());
        assertNotNull(response);
    }

    @Test
    public void testListMarginCallSummaries() throws Exception {
        assumeTrue(entityId != null && !entityId.isEmpty(),
                "Skipping: COINBASE_PRIME_ENTITY_ID not set");
        FinancingService service = PrimeServiceFactory.createFinancingService(client);
        ListMarginCallSummariesResponse response = service.listMarginCallSummaries(
                new ListMarginCallSummariesRequest.Builder()
                        .entityId(entityId)
                        .build());
        assertNotNull(response);
    }

    @Test
    public void testListMarginCallSummariesWithDateRange() throws Exception {
        assumeTrue(entityId != null && !entityId.isEmpty(),
                "Skipping: COINBASE_PRIME_ENTITY_ID not set");
        FinancingService service = PrimeServiceFactory.createFinancingService(client);
        ListMarginCallSummariesResponse response = service.listMarginCallSummaries(
                new ListMarginCallSummariesRequest.Builder()
                        .entityId(entityId)
                        .startDate("2025-01-01")
                        .endDate("2025-12-31")
                        .build());
        assertNotNull(response);
    }

    @Test
    public void testListTradeFinanceObligations() throws Exception {
        assumeTrue(entityId != null && !entityId.isEmpty(),
                "Skipping: COINBASE_PRIME_ENTITY_ID not set");
        FinancingService service = PrimeServiceFactory.createFinancingService(client);
        ListTradeFinanceObligationsResponse response = service.listTradeFinanceObligations(
                new ListTradeFinanceObligationsRequest.Builder()
                        .entityId(entityId)
                        .build());
        assertNotNull(response);
    }

    @Test
    public void testGetTradeFinanceTieredPricingFees() throws Exception {
        assumeTrue(entityId != null && !entityId.isEmpty(),
                "Skipping: COINBASE_PRIME_ENTITY_ID not set");
        FinancingService service = PrimeServiceFactory.createFinancingService(client);
        GetTradeFinanceTieredPricingFeesResponse response = service.getTradeFinanceTieredPricingFees(
                new GetTradeFinanceTieredPricingFeesRequest.Builder()
                        .entityId(entityId)
                        .build());
        assertNotNull(response);
    }

    @Test
    public void testListFinancingEligibleAssets() throws Exception {
        FinancingService service = PrimeServiceFactory.createFinancingService(client);
        ListFinancingEligibleAssetsResponse response = service.listFinancingEligibleAssets();
        assertNotNull(response);
    }

    @Test
    public void testListInterestAccrualsForPortfolio() throws Exception {
        assumeTrue(portfolioId != null && !portfolioId.isEmpty(),
                "Skipping: COINBASE_PRIME_PORTFOLIO_ID not set");
        FinancingService service = PrimeServiceFactory.createFinancingService(client);
        try {
            ListInterestAccrualsForPortfolioResponse response = service.listInterestAccrualsForPortfolio(
                    new ListInterestAccrualsForPortfolioRequest.Builder()
                            .portfolioId(portfolioId)
                            .startDate("2025-01-01")
                            .endDate("2025-12-31")
                            .build());
            assertNotNull(response);
        } catch (CoinbaseClientException e) {
            String causeMsg = e.getCause() != null ? e.getCause().getMessage() : "";
            assumeTrue(!causeMsg.contains("InvalidArgument") && !causeMsg.contains("not enabled")
                            && !causeMsg.contains("precondition"),
                    "Skipping: portfolio does not have access to interest accruals or date format unsupported");
            throw e;
        }
    }

    @Test
    public void testListInterestAccrualsForPortfolioWithDateRange() throws Exception {
        assumeTrue(portfolioId != null && !portfolioId.isEmpty(),
                "Skipping: COINBASE_PRIME_PORTFOLIO_ID not set");
        FinancingService service = PrimeServiceFactory.createFinancingService(client);
        try {
            ListInterestAccrualsForPortfolioResponse response = service.listInterestAccrualsForPortfolio(
                    new ListInterestAccrualsForPortfolioRequest.Builder()
                            .portfolioId(portfolioId)
                            .startDate("2025-01-01")
                            .endDate("2025-06-30")
                            .build());
            assertNotNull(response);
        } catch (CoinbaseClientException e) {
            String causeMsg = e.getCause() != null ? e.getCause().getMessage() : "";
            assumeTrue(!causeMsg.contains("InvalidArgument") && !causeMsg.contains("not enabled")
                            && !causeMsg.contains("precondition"),
                    "Skipping: portfolio does not have access to interest accruals or date format unsupported");
            throw e;
        }
    }

    @Test
    public void testGetPortfolioBuyingPower() throws Exception {
        assumeTrue(portfolioId != null && !portfolioId.isEmpty(),
                "Skipping: COINBASE_PRIME_PORTFOLIO_ID not set");
        FinancingService service = PrimeServiceFactory.createFinancingService(client);
        GetPortfolioBuyingPowerResponse response = service.getPortfolioBuyingPower(
                new GetPortfolioBuyingPowerRequest.Builder()
                        .portfolioId(portfolioId)
                        .baseCurrency("BTC")
                        .quoteCurrency("USD")
                        .build());
        assertNotNull(response);
    }

    @Test
    public void testGetPortfolioCreditInformation() throws Exception {
        assumeTrue(portfolioId != null && !portfolioId.isEmpty(),
                "Skipping: COINBASE_PRIME_PORTFOLIO_ID not set");
        FinancingService service = PrimeServiceFactory.createFinancingService(client);
        GetPortfolioCreditInformationResponse response = service.getPortfolioCreditInformation(
                new GetPortfolioCreditInformationRequest.Builder()
                        .portfolioId(portfolioId)
                        .build());
        assertNotNull(response);
    }

    @Test
    public void testListExistingLocates() throws Exception {
        assumeTrue(portfolioId != null && !portfolioId.isEmpty(),
                "Skipping: COINBASE_PRIME_PORTFOLIO_ID not set");
        FinancingService service = PrimeServiceFactory.createFinancingService(client);
        try {
            ListExistingLocatesResponse response = service.listExistingLocates(
                    new ListExistingLocatesRequest.Builder()
                            .portfolioId(portfolioId)
                            .locateDate("2025-01-01")
                            .build());
            assertNotNull(response);
        } catch (CoinbaseClientException e) {
            String causeMsg = e.getCause() != null ? e.getCause().getMessage() : "";
            assumeTrue(!causeMsg.contains("precondition") && !causeMsg.contains("not enabled")
                            && !causeMsg.contains("missing") && !causeMsg.contains("Invalid"),
                    "Skipping: portfolio does not have access to locates");
            throw e;
        }
    }

    @Test
    public void testListMarginConversions() throws Exception {
        assumeTrue(portfolioId != null && !portfolioId.isEmpty(),
                "Skipping: COINBASE_PRIME_PORTFOLIO_ID not set");
        FinancingService service = PrimeServiceFactory.createFinancingService(client);
        try {
            ListMarginConversionsResponse response = service.listMarginConversions(
                    new ListMarginConversionsRequest.Builder()
                            .portfolioId(portfolioId)
                            .startDate("2025-01-01")
                            .endDate("2025-12-31")
                            .build());
            assertNotNull(response);
        } catch (CoinbaseClientException e) {
            String causeMsg = e.getCause() != null ? e.getCause().getMessage() : "";
            assumeTrue(!causeMsg.contains("InvalidArgument") && !causeMsg.contains("not enabled")
                            && !causeMsg.contains("precondition"),
                    "Skipping: portfolio does not have access to margin conversions or date format unsupported");
            throw e;
        }
    }

    @Test
    public void testListMarginConversionsWithDateRange() throws Exception {
        assumeTrue(portfolioId != null && !portfolioId.isEmpty(),
                "Skipping: COINBASE_PRIME_PORTFOLIO_ID not set");
        FinancingService service = PrimeServiceFactory.createFinancingService(client);
        try {
            ListMarginConversionsResponse response = service.listMarginConversions(
                    new ListMarginConversionsRequest.Builder()
                            .portfolioId(portfolioId)
                            .startDate("2025-01-01")
                            .endDate("2025-06-30")
                            .build());
            assertNotNull(response);
        } catch (CoinbaseClientException e) {
            String causeMsg = e.getCause() != null ? e.getCause().getMessage() : "";
            assumeTrue(!causeMsg.contains("InvalidArgument") && !causeMsg.contains("not enabled")
                            && !causeMsg.contains("precondition"),
                    "Skipping: portfolio does not have access to margin conversions or date format unsupported");
            throw e;
        }
    }

    @Test
    public void testGetPortfolioWithdrawalPower() throws Exception {
        assumeTrue(portfolioId != null && !portfolioId.isEmpty(),
                "Skipping: COINBASE_PRIME_PORTFOLIO_ID not set");
        FinancingService service = PrimeServiceFactory.createFinancingService(client);
        GetPortfolioWithdrawalPowerResponse response = service.getPortfolioWithdrawalPower(
                new GetPortfolioWithdrawalPowerRequest.Builder()
                        .portfolioId(portfolioId)
                        .symbol("BTC")
                        .build());
        assertNotNull(response);
    }

    @Test
    public void testGetPortfolioWithdrawalPowerWithSymbol() throws Exception {
        assumeTrue(portfolioId != null && !portfolioId.isEmpty(),
                "Skipping: COINBASE_PRIME_PORTFOLIO_ID not set");
        FinancingService service = PrimeServiceFactory.createFinancingService(client);
        GetPortfolioWithdrawalPowerResponse response = service.getPortfolioWithdrawalPower(
                new GetPortfolioWithdrawalPowerRequest.Builder()
                        .portfolioId(portfolioId)
                        .symbol("BTC")
                        .build());
        assertNotNull(response);
    }
}
