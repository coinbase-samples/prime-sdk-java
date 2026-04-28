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

package com.coinbase.prime.financing;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FinancingServiceSerializationTest {

    private ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {
        objectMapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }

    // ==================== CreateNewLocates Tests ====================

    @Test
    public void testCreateNewLocatesRequestSerialization() throws JsonProcessingException {
        CreateNewLocatesRequest request = new CreateNewLocatesRequest.Builder()
                .portfolioId("portfolio-123")
                .symbol("BTC")
                .amount("1.0")
                .locateDate("2025-01-15")
                .build();

        String json = objectMapper.writeValueAsString(request);
        assertNotNull(json);
        assertTrue(json.contains("\"symbol\":\"BTC\""));
        assertTrue(json.contains("\"amount\":\"1.0\""));
        assertTrue(json.contains("\"locate_date\":\"2025-01-15\""));
        assertFalse(json.contains("portfolio_id"));
    }

    @Test
    public void testCreateNewLocatesResponseDeserialization() throws JsonProcessingException {
        String json = "{\"locate_id\":\"locate-abc123\"}";
        CreateNewLocatesResponse response = objectMapper.readValue(json, CreateNewLocatesResponse.class);
        assertNotNull(response);
        assertEquals("locate-abc123", response.getLocateId());
    }

    // ==================== GetCrossMarginOverview Tests ====================

    @Test
    public void testGetCrossMarginOverviewRequestConstruction() {
        GetCrossMarginOverviewRequest request = new GetCrossMarginOverviewRequest.Builder()
                .entityId("entity-123")
                .build();
        assertNotNull(request);
        assertEquals("entity-123", request.getEntityId());
    }

    @Test
    public void testGetCrossMarginOverviewResponseDeserialization() throws JsonProcessingException {
        String json = "{"
                + "\"overview\":{"
                + "\"equity\":\"50000.00\","
                + "\"margin_used\":\"10000.00\""
                + "}"
                + "}";

        GetCrossMarginOverviewResponse response = objectMapper.readValue(json, GetCrossMarginOverviewResponse.class);
        assertNotNull(response);
        assertNotNull(response.getOverview());
    }

    // ==================== GetEntityLocateAvailabilities Tests ====================

    @Test
    public void testGetEntityLocateAvailabilitiesRequestSerialization() throws JsonProcessingException {
        GetEntityLocateAvailabilitiesRequest request = new GetEntityLocateAvailabilitiesRequest.Builder()
                .entityId("entity-123")
                .conversionDate("2025-01-15")
                .locateDate("2025-01-15")
                .build();

        String json = objectMapper.writeValueAsString(request);
        assertNotNull(json);
        assertTrue(json.contains("\"conversion_date\":\"2025-01-15\""));
        assertTrue(json.contains("\"locate_date\":\"2025-01-15\""));
    }

    @Test
    public void testGetEntityLocateAvailabilitiesResponseDeserialization() throws JsonProcessingException {
        String json = "{"
                + "\"locates\":["
                + "{\"symbol\":\"BTC\",\"available\":\"5.0\"},"
                + "{\"symbol\":\"ETH\",\"available\":\"50.0\"}"
                + "]"
                + "}";

        GetEntityLocateAvailabilitiesResponse response = objectMapper.readValue(json, GetEntityLocateAvailabilitiesResponse.class);
        assertNotNull(response);
        assertNotNull(response.getLocates());
        assertEquals(2, response.getLocates().length);
    }

    // ==================== GetMarginInformation Tests ====================

    @Test
    public void testGetMarginInformationRequestConstruction() {
        GetMarginInformationRequest request = new GetMarginInformationRequest.Builder()
                .entityId("entity-456")
                .build();
        assertNotNull(request);
        assertEquals("entity-456", request.getEntityId());
    }

    @Test
    public void testGetMarginInformationResponseDeserialization() throws JsonProcessingException {
        String json = "{"
                + "\"margin_information\":{"
                + "\"leverage\":\"3.0\","
                + "\"margin_call_state\":\"FCM_MARGIN_CALL_STATE_OK\""
                + "}"
                + "}";

        GetMarginInformationResponse response = objectMapper.readValue(json, GetMarginInformationResponse.class);
        assertNotNull(response);
        assertNotNull(response.getMarginInformation());
    }

    // ==================== GetPortfolioBuyingPower Tests ====================

    @Test
    public void testGetPortfolioBuyingPowerRequestSerialization() throws JsonProcessingException {
        GetPortfolioBuyingPowerRequest request = new GetPortfolioBuyingPowerRequest.Builder()
                .portfolioId("portfolio-123")
                .baseCurrency("BTC")
                .quoteCurrency("USD")
                .build();

        String json = objectMapper.writeValueAsString(request);
        assertNotNull(json);
        assertTrue(json.contains("\"base_currency\":\"BTC\""));
        assertTrue(json.contains("\"quote_currency\":\"USD\""));
        assertFalse(json.contains("\"portfolio_id\""));
    }

    @Test
    public void testGetPortfolioBuyingPowerResponseDeserialization() throws JsonProcessingException {
        String json = "{"
                + "\"buying_power\":{"
                + "\"symbol\":\"BTC\","
                + "\"quantity\":\"0.5\","
                + "\"local_currency\":\"USD\","
                + "\"local_currency_quantity\":\"25000.00\""
                + "}"
                + "}";

        GetPortfolioBuyingPowerResponse response = objectMapper.readValue(json, GetPortfolioBuyingPowerResponse.class);
        assertNotNull(response);
        assertNotNull(response.getBuyingPower());
    }

    // ==================== GetPortfolioCreditInformation Tests ====================

    @Test
    public void testGetPortfolioCreditInformationRequestConstruction() {
        GetPortfolioCreditInformationRequest request = new GetPortfolioCreditInformationRequest.Builder()
                .portfolioId("portfolio-123")
                .build();
        assertNotNull(request);
        assertEquals("portfolio-123", request.getPortfolioId());
    }

    @Test
    public void testGetPortfolioCreditInformationResponseDeserialization() throws JsonProcessingException {
        String json = "{"
                + "\"postTradeCredit\":{"
                + "\"portfolio_id\":\"portfolio-123\","
                + "\"currency\":\"USD\","
                + "\"limit\":\"1000000.00\","
                + "\"utilized\":\"50000.00\""
                + "}"
                + "}";

        GetPortfolioCreditInformationResponse response = objectMapper.readValue(json, GetPortfolioCreditInformationResponse.class);
        assertNotNull(response);
    }

    // ==================== GetPortfolioWithdrawalPower Tests ====================

    @Test
    public void testGetPortfolioWithdrawalPowerRequestSerialization() throws JsonProcessingException {
        GetPortfolioWithdrawalPowerRequest request = new GetPortfolioWithdrawalPowerRequest.Builder()
                .portfolioId("portfolio-123")
                .symbol("BTC")
                .build();

        String json = objectMapper.writeValueAsString(request);
        assertNotNull(json);
        assertTrue(json.contains("\"symbol\":\"BTC\""));
    }

    @Test
    public void testGetPortfolioWithdrawalPowerResponseDeserialization() throws JsonProcessingException {
        String json = "{"
                + "\"withdrawal_power\":{"
                + "\"symbol\":\"BTC\","
                + "\"quantity\":\"0.25\""
                + "}"
                + "}";

        GetPortfolioWithdrawalPowerResponse response = objectMapper.readValue(json, GetPortfolioWithdrawalPowerResponse.class);
        assertNotNull(response);
        assertNotNull(response.getWithdrawalPower());
    }

    // ==================== GetTradeFinanceTieredPricingFees Tests ====================

    @Test
    public void testGetTradeFinanceTieredPricingFeesRequestSerialization() throws JsonProcessingException {
        GetTradeFinanceTieredPricingFeesRequest request = new GetTradeFinanceTieredPricingFeesRequest.Builder()
                .entityId("entity-123")
                .effectiveAt("2025-01-01T00:00:00Z")
                .build();

        String json = objectMapper.writeValueAsString(request);
        assertNotNull(json);
        assertTrue(json.contains("\"effective_at\":\"2025-01-01T00:00:00Z\""));
    }

    @Test
    public void testGetTradeFinanceTieredPricingFeesResponseDeserialization() throws JsonProcessingException {
        String json = "{"
                + "\"fees\":["
                + "{\"tier\":\"1\",\"rate\":\"0.01\"},"
                + "{\"tier\":\"2\",\"rate\":\"0.008\"}"
                + "]"
                + "}";

        GetTradeFinanceTieredPricingFeesResponse response = objectMapper.readValue(json, GetTradeFinanceTieredPricingFeesResponse.class);
        assertNotNull(response);
        assertNotNull(response.getFees());
        assertEquals(2, response.getFees().length);
    }

    // ==================== ListExistingLocates Tests ====================

    @Test
    public void testListExistingLocatesRequestSerialization() throws JsonProcessingException {
        ListExistingLocatesRequest request = new ListExistingLocatesRequest.Builder()
                .portfolioId("portfolio-123")
                .locateIds(new String[]{"locate-1", "locate-2"})
                .locateDate("2025-01-15")
                .build();

        String json = objectMapper.writeValueAsString(request);
        assertNotNull(json);
        assertTrue(json.contains("\"locate_ids\""));
        assertTrue(json.contains("\"locate_date\":\"2025-01-15\""));
    }

    @Test
    public void testListExistingLocatesResponseDeserialization() throws JsonProcessingException {
        String json = "{"
                + "\"locates\":["
                + "{\"symbol\":\"BTC\",\"amount\":\"1.0\",\"locate_date\":\"2025-01-15\"},"
                + "{\"symbol\":\"ETH\",\"amount\":\"10.0\",\"locate_date\":\"2025-01-15\"}"
                + "]"
                + "}";

        ListExistingLocatesResponse response = objectMapper.readValue(json, ListExistingLocatesResponse.class);
        assertNotNull(response);
        assertNotNull(response.getLocates());
        assertEquals(2, response.getLocates().length);
    }

    // ==================== ListFinancingEligibleAssets Tests ====================

    @Test
    public void testListFinancingEligibleAssetsRequestConstruction() {
        ListFinancingEligibleAssetsRequest request = new ListFinancingEligibleAssetsRequest.Builder().build();
        assertNotNull(request);
    }

    @Test
    public void testListFinancingEligibleAssetsResponseDeserialization() throws JsonProcessingException {
        String json = "{"
                + "\"assets\":["
                + "{\"symbol\":\"BTC\",\"name\":\"Bitcoin\"},"
                + "{\"symbol\":\"ETH\",\"name\":\"Ethereum\"}"
                + "]"
                + "}";

        ListFinancingEligibleAssetsResponse response = objectMapper.readValue(json, ListFinancingEligibleAssetsResponse.class);
        assertNotNull(response);
        assertNotNull(response.getAssets());
        assertEquals(2, response.getAssets().size());
    }

    // ==================== ListInterestAccruals Tests ====================

    @Test
    public void testListInterestAccrualsRequestSerialization() throws JsonProcessingException {
        ListInterestAccrualsRequest request = new ListInterestAccrualsRequest.Builder()
                .entityId("entity-123")
                .portfolioId("portfolio-456")
                .startDate("2025-01-01")
                .endDate("2025-01-31")
                .build();

        String json = objectMapper.writeValueAsString(request);
        assertNotNull(json);
        assertTrue(json.contains("\"portfolio_id\":\"portfolio-456\""));
        assertTrue(json.contains("\"start_date\":\"2025-01-01\""));
        assertTrue(json.contains("\"end_date\":\"2025-01-31\""));
    }

    @Test
    public void testListInterestAccrualsResponseDeserialization() throws JsonProcessingException {
        String json = "{"
                + "\"total_notional_accrual\":\"150.00\","
                + "\"accruals\":["
                + "{\"symbol\":\"BTC\",\"amount\":\"100.00\"},"
                + "{\"symbol\":\"ETH\",\"amount\":\"50.00\"}"
                + "]"
                + "}";

        ListInterestAccrualsResponse response = objectMapper.readValue(json, ListInterestAccrualsResponse.class);
        assertNotNull(response);
        assertEquals("150.00", response.getTotalNotionalAccrual());
        assertNotNull(response.getAccruals());
        assertEquals(2, response.getAccruals().length);
    }

    // ==================== ListInterestAccrualsForPortfolio Tests ====================

    @Test
    public void testListInterestAccrualsForPortfolioResponseDeserialization() throws JsonProcessingException {
        String json = "{"
                + "\"total_notional_accrual\":\"75.50\","
                + "\"accruals\":["
                + "{\"symbol\":\"BTC\",\"amount\":\"75.50\"}"
                + "]"
                + "}";

        ListInterestAccrualsForPortfolioResponse response = objectMapper.readValue(json, ListInterestAccrualsForPortfolioResponse.class);
        assertNotNull(response);
        assertEquals("75.50", response.getTotalNotionalAccrual());
        assertNotNull(response.getAccruals());
        assertEquals(1, response.getAccruals().length);
    }

    // ==================== ListMarginCallSummaries Tests ====================

    @Test
    public void testListMarginCallSummariesRequestSerialization() throws JsonProcessingException {
        ListMarginCallSummariesRequest request = new ListMarginCallSummariesRequest.Builder()
                .entityId("entity-123")
                .startDate("2025-01-01")
                .endDate("2025-01-31")
                .build();

        String json = objectMapper.writeValueAsString(request);
        assertNotNull(json);
        assertTrue(json.contains("\"start_date\":\"2025-01-01\""));
        assertTrue(json.contains("\"end_date\":\"2025-01-31\""));
    }

    @Test
    public void testListMarginCallSummariesResponseDeserialization() throws JsonProcessingException {
        String json = "{"
                + "\"margin_summaries\":["
                + "{\"date\":\"2025-01-10\",\"state\":\"FCM_MARGIN_CALL_STATE_OK\"},"
                + "{\"date\":\"2025-01-11\",\"state\":\"FCM_MARGIN_CALL_STATE_CLOSED\"}"
                + "]"
                + "}";

        ListMarginCallSummariesResponse response = objectMapper.readValue(json, ListMarginCallSummariesResponse.class);
        assertNotNull(response);
        assertNotNull(response.getMarginSummaries());
        assertEquals(2, response.getMarginSummaries().length);
    }

    // ==================== ListMarginConversions Tests ====================

    @Test
    public void testListMarginConversionsRequestSerialization() throws JsonProcessingException {
        ListMarginConversionsRequest request = new ListMarginConversionsRequest.Builder()
                .portfolioId("portfolio-123")
                .startDate("2025-01-01")
                .endDate("2025-01-31")
                .build();

        String json = objectMapper.writeValueAsString(request);
        assertNotNull(json);
        assertTrue(json.contains("\"start_date\":\"2025-01-01\""));
        assertTrue(json.contains("\"end_date\":\"2025-01-31\""));
    }

    @Test
    public void testListMarginConversionsResponseDeserialization() throws JsonProcessingException {
        String json = "{"
                + "\"conversions\":["
                + "{\"id\":\"conv-1\",\"symbol\":\"BTC\",\"amount\":\"0.5\"},"
                + "{\"id\":\"conv-2\",\"symbol\":\"ETH\",\"amount\":\"5.0\"}"
                + "]"
                + "}";

        ListMarginConversionsResponse response = objectMapper.readValue(json, ListMarginConversionsResponse.class);
        assertNotNull(response);
        assertNotNull(response.getConversions());
        assertEquals(2, response.getConversions().length);
    }

    // ==================== ListTfObligations Tests ====================

    @Test
    public void testListTfObligationsRequestConstruction() {
        ListTfObligationsRequest request = new ListTfObligationsRequest.Builder()
                .entityId("entity-123")
                .build();
        assertNotNull(request);
        assertEquals("entity-123", request.getEntityId());
    }

    @Test
    public void testListTfObligationsResponseDeserialization() throws JsonProcessingException {
        String json = "{"
                + "\"obligations\":["
                + "{\"id\":\"obl-1\",\"symbol\":\"BTC\",\"amount\":\"1.0\"},"
                + "{\"id\":\"obl-2\",\"symbol\":\"ETH\",\"amount\":\"10.0\"}"
                + "]"
                + "}";

        ListTfObligationsResponse response = objectMapper.readValue(json, ListTfObligationsResponse.class);
        assertNotNull(response);
        assertNotNull(response.getObligations());
        assertEquals(2, response.getObligations().size());
    }
}
