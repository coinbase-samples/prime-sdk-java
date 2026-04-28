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

package com.coinbase.prime.futures;

import com.coinbase.core.errors.CoinbaseClientException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FuturesServiceSerializationTest {

    private ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {
        objectMapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }

    // ==================== SetAutoSweep Tests ====================

    @Test
    public void testSetAutoSweepRequestSerialization() throws CoinbaseClientException, JsonProcessingException {
        SetAutoSweepRequest request = new SetAutoSweepRequest.Builder()
                .entityId("entity-123")
                .autoSweep(true)
                .build();

        String json = objectMapper.writeValueAsString(request);
        assertNotNull(json);
        assertTrue(json.contains("\"auto_sweep\":true"));
        assertFalse(json.contains("entity_id"));
    }

    @Test
    public void testSetAutoSweepResponseDeserialization() throws JsonProcessingException {
        String json = "{\"success\":true}";
        SetAutoSweepResponse response = objectMapper.readValue(json, SetAutoSweepResponse.class);
        assertNotNull(response);
        assertTrue(response.getSuccess());
    }

    // ==================== GetEntityFcmBalance Tests ====================

    @Test
    public void testGetEntityFcmBalanceRequestConstruction() throws CoinbaseClientException {
        GetEntityFcmBalanceRequest request = new GetEntityFcmBalanceRequest.Builder()
                .entityId("entity-123")
                .build();
        assertNotNull(request);
        assertEquals("entity-123", request.getEntityId());
    }

    @Test
    public void testGetEntityFcmBalanceResponseDeserialization() throws JsonProcessingException {
        String json = "{"
                + "\"portfolio_id\":\"portfolio-123\","
                + "\"cfm_usd_balance\":\"100000.00\","
                + "\"unrealized_pnl\":\"500.00\","
                + "\"daily_realized_pnl\":\"250.00\","
                + "\"excess_liquidity\":\"50000.00\","
                + "\"futures_buying_power\":\"75000.00\","
                + "\"initial_margin\":\"10000.00\","
                + "\"maintenance_margin\":\"8000.00\","
                + "\"clearing_account_id\":\"clr-abc\","
                + "\"cfm_unsettled_accrued_funding_pnl\":\"10.00\""
                + "}";

        GetEntityFcmBalanceResponse response = objectMapper.readValue(json, GetEntityFcmBalanceResponse.class);
        assertNotNull(response);
        assertEquals("portfolio-123", response.getPortfolioId());
        assertEquals("100000.00", response.getCfmUsdBalance());
        assertEquals("500.00", response.getUnrealizedPnl());
        assertEquals("250.00", response.getDailyRealizedPnl());
        assertEquals("clr-abc", response.getClearingAccountId());
    }

    // ==================== GetPositions Tests ====================

    @Test
    public void testGetPositionsRequestConstruction() throws CoinbaseClientException {
        GetPositionsRequest request = new GetPositionsRequest.Builder()
                .entityId("entity-123")
                .productId("BTC-PERP")
                .build();
        assertNotNull(request);
        assertEquals("entity-123", request.getEntityId());
        assertEquals("BTC-PERP", request.getProductId());
    }

    @Test
    public void testGetPositionsResponseDeserialization() throws JsonProcessingException {
        String json = "{"
                + "\"positions\":["
                + "{\"product_id\":\"BTC-PERP\",\"entry_price\":\"50000.00\",\"quantity\":\"0.1\"},"
                + "{\"product_id\":\"ETH-PERP\",\"entry_price\":\"3000.00\",\"quantity\":\"1.0\"}"
                + "],"
                + "\"clearing_account_id\":\"clr-xyz\""
                + "}";

        GetPositionsResponse response = objectMapper.readValue(json, GetPositionsResponse.class);
        assertNotNull(response);
        assertNotNull(response.getPositions());
        assertEquals(2, response.getPositions().length);
        assertEquals("clr-xyz", response.getClearingAccountId());
    }

    // ==================== ListEntityFuturesSweeps Tests ====================

    @Test
    public void testListEntityFuturesSweepsRequestConstruction() throws CoinbaseClientException {
        ListEntityFuturesSweepsRequest request = new ListEntityFuturesSweepsRequest.Builder()
                .entityId("entity-123")
                .build();
        assertNotNull(request);
        assertEquals("entity-123", request.getEntityId());
    }

    @Test
    public void testListEntityFuturesSweepsResponseDeserialization() throws JsonProcessingException {
        String json = "{"
                + "\"sweeps\":["
                + "{\"id\":\"sweep-1\",\"amount\":\"1000.00\",\"currency\":\"USD\"},"
                + "{\"id\":\"sweep-2\",\"amount\":\"2000.00\",\"currency\":\"USD\"}"
                + "],"
                + "\"auto_sweep\":true"
                + "}";

        ListEntityFuturesSweepsResponse response = objectMapper.readValue(json, ListEntityFuturesSweepsResponse.class);
        assertNotNull(response);
        assertNotNull(response.getSweeps());
        assertEquals(2, response.getSweeps().length);
        assertTrue(response.getAutoSweep());
    }

    // ==================== CancelEntityFuturesSweep Tests ====================

    @Test
    public void testCancelEntityFuturesSweepRequestConstruction() throws CoinbaseClientException {
        CancelEntityFuturesSweepRequest request = new CancelEntityFuturesSweepRequest.Builder()
                .entityId("entity-123")
                .build();
        assertNotNull(request);
        assertEquals("entity-123", request.getEntityId());
    }

    @Test
    public void testCancelEntityFuturesSweepResponseDeserialization() throws JsonProcessingException {
        String json = "{\"success\":true,\"request_id\":\"req-abc123\"}";
        CancelEntityFuturesSweepResponse response = objectMapper.readValue(json, CancelEntityFuturesSweepResponse.class);
        assertNotNull(response);
        assertTrue(response.getSuccess());
        assertEquals("req-abc123", response.getRequestId());
    }

    // ==================== ScheduleEntityFuturesSweep Tests ====================

    @Test
    public void testScheduleEntityFuturesSweepRequestSerialization() throws CoinbaseClientException, JsonProcessingException {
        ScheduleEntityFuturesSweepRequest request = new ScheduleEntityFuturesSweepRequest();
        request.setEntityId("entity-123");
        request.setAmount("5000.00");
        request.setCurrency("USD");

        String json = objectMapper.writeValueAsString(request);
        assertNotNull(json);
        assertTrue(json.contains("\"amount\":\"5000.00\""));
        assertTrue(json.contains("\"currency\":\"USD\""));
        assertFalse(json.contains("entity_id"));
    }

    @Test
    public void testScheduleEntityFuturesSweepResponseDeserialization() throws JsonProcessingException {
        String json = "{\"success\":true,\"request_id\":\"req-xyz789\"}";
        ScheduleEntityFuturesSweepResponse response = objectMapper.readValue(json, ScheduleEntityFuturesSweepResponse.class);
        assertNotNull(response);
        assertTrue(response.getSuccess());
        assertEquals("req-xyz789", response.getRequestId());
    }

    // ==================== GetFcmMarginCallDetails Tests ====================

    @Test
    public void testGetFcmMarginCallDetailsRequestConstruction() throws CoinbaseClientException {
        GetFcmMarginCallDetailsRequest request = new GetFcmMarginCallDetailsRequest.Builder()
                .entityId("entity-123")
                .build();
        assertNotNull(request);
        assertEquals("entity-123", request.getEntityId());
    }

    @Test
    public void testGetFcmMarginCallDetailsResponseDeserialization() throws JsonProcessingException {
        String json = "{"
                + "\"margin_call_details\":{"
                + "\"state\":\"FCM_MARGIN_CALL_STATE_OK\","
                + "\"portfolio_id\":\"portfolio-123\""
                + "}"
                + "}";

        GetFcmMarginCallDetailsResponse response = objectMapper.readValue(json, GetFcmMarginCallDetailsResponse.class);
        assertNotNull(response);
    }

    // ==================== GetFcmRiskLimits Tests ====================

    @Test
    public void testGetFcmRiskLimitsRequestConstruction() throws CoinbaseClientException {
        GetFcmRiskLimitsRequest request = new GetFcmRiskLimitsRequest.Builder()
                .entityId("entity-123")
                .build();
        assertNotNull(request);
        assertEquals("entity-123", request.getEntityId());
    }

    @Test
    public void testGetFcmRiskLimitsResponseDeserialization() throws JsonProcessingException {
        String json = "{"
                + "\"cfm_risk_limit\":\"100000.00\","
                + "\"cfm_risk_limit_utilization\":\"0.50\","
                + "\"cfm_total_margin\":\"50000.00\","
                + "\"cfm_delta_ote\":\"1000.00\","
                + "\"cfm_unsettled_realized_pnl\":\"500.00\","
                + "\"cfm_unsettled_accrued_funding_pnl\":\"25.00\""
                + "}";

        GetFcmRiskLimitsResponse response = objectMapper.readValue(json, GetFcmRiskLimitsResponse.class);
        assertNotNull(response);
        assertEquals("100000.00", response.getCfmRiskLimit());
        assertEquals("0.50", response.getCfmRiskLimitUtilization());
        assertEquals("50000.00", response.getCfmTotalMargin());
        assertEquals("1000.00", response.getCfmDeltaOte());
        assertEquals("500.00", response.getCfmUnsettledRealizedPnl());
        assertEquals("25.00", response.getCfmUnsettledAccruedFundingPnl());
    }

    // ==================== GetFcmSettings Tests ====================

    @Test
    public void testGetFcmSettingsRequestConstruction() {
        GetFcmSettingsRequest request = new GetFcmSettingsRequest.Builder()
                .entityId("entity-123")
                .build();
        assertNotNull(request);
        assertEquals("entity-123", request.getEntityId());
    }

    @Test
    public void testGetFcmSettingsResponseDeserialization() throws JsonProcessingException {
        String json = "{\"target_derivatives_excess\":\"10000.00\"}";
        GetFcmSettingsResponse response = objectMapper.readValue(json, GetFcmSettingsResponse.class);
        assertNotNull(response);
        assertEquals("10000.00", response.getTargetDerivativesExcess());
    }

    // ==================== SetFcmSettings Tests ====================

    @Test
    public void testSetFcmSettingsRequestSerialization() throws JsonProcessingException {
        SetFcmSettingsRequest request = new SetFcmSettingsRequest.Builder()
                .entityId("entity-123")
                .targetDerivativesExcess("15000.00")
                .build();

        String json = objectMapper.writeValueAsString(request);
        assertNotNull(json);
        assertTrue(json.contains("\"target_derivatives_excess\":\"15000.00\""));
        assertFalse(json.contains("entity_id"));
    }

    @Test
    public void testSetFcmSettingsResponseDeserialization() throws JsonProcessingException {
        String json = "{\"success\":true}";
        SetFcmSettingsResponse response = objectMapper.readValue(json, SetFcmSettingsResponse.class);
        assertNotNull(response);
        assertTrue(response.getSuccess());
    }

    // ==================== GetFcmEquity Tests ====================

    @Test
    public void testGetFcmEquityRequestConstruction() {
        GetFcmEquityRequest request = new GetFcmEquityRequest.Builder()
                .entityId("entity-123")
                .build();
        assertNotNull(request);
        assertEquals("entity-123", request.getEntityId());
    }

    @Test
    public void testGetFcmEquityResponseDeserialization() throws JsonProcessingException {
        String json = "{"
                + "\"available_to_sweep\":\"5000.00\","
                + "\"current_excess_deficit\":\"2000.00\","
                + "\"eod_account_equity\":\"105000.00\","
                + "\"eod_unrealized_pnl\":\"500.00\""
                + "}";

        GetFcmEquityResponse response = objectMapper.readValue(json, GetFcmEquityResponse.class);
        assertNotNull(response);
        assertEquals("5000.00", response.getAvailableToSweep());
        assertEquals("2000.00", response.getCurrentExcessDeficit());
        assertEquals("105000.00", response.getEodAccountEquity());
        assertEquals("500.00", response.getEodUnrealizedPnl());
    }
}
