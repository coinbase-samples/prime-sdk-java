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

package com.coinbase.prime.advancedtransfers;

import com.coinbase.core.errors.CoinbaseClientException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AdvancedTransfersServiceSerializationTest {

    private ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {
        objectMapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }

    // ==================== ListAdvancedTransfers Tests ====================

    @Test
    public void testListAdvancedTransfersRequestSerialization() throws CoinbaseClientException, JsonProcessingException {
        ListAdvancedTransfersRequest request = new ListAdvancedTransfersRequest.Builder()
                .portfolioId("portfolio-123")
                .startTime("2025-01-01T00:00:00Z")
                .endTime("2025-12-31T23:59:59Z")
                .referenceId("ref-abc")
                .build();

        String json = objectMapper.writeValueAsString(request);
        assertNotNull(json);
        assertTrue(json.contains("\"start_time\":\"2025-01-01T00:00:00Z\""));
        assertTrue(json.contains("\"end_time\":\"2025-12-31T23:59:59Z\""));
        assertTrue(json.contains("\"reference_id\":\"ref-abc\""));
        assertFalse(json.contains("portfolio_id"));
    }

    @Test
    public void testListAdvancedTransfersRequestBuilderValidation() {
        assertThrows(CoinbaseClientException.class, () ->
                new ListAdvancedTransfersRequest.Builder().build());
    }

    @Test
    public void testListAdvancedTransfersResponseDeserialization() throws JsonProcessingException {
        String json = "{"
                + "\"advanced_transfers\":["
                + "{\"id\":\"at-1\",\"state\":\"ADVANCED_TRANSFER_STATE_CREATED\"},"
                + "{\"id\":\"at-2\",\"state\":\"ADVANCED_TRANSFER_STATE_DONE\"}"
                + "],"
                + "\"pagination\":{\"has_next\":false}"
                + "}";

        ListAdvancedTransfersResponse response = objectMapper.readValue(json, ListAdvancedTransfersResponse.class);
        assertNotNull(response);
        assertNotNull(response.getAdvancedTransfers());
        assertEquals(2, response.getAdvancedTransfers().length);
    }

    // ==================== CreateAdvancedTransfer Tests ====================

    @Test
    public void testCreateAdvancedTransferRequestSerialization() throws CoinbaseClientException, JsonProcessingException {
        CreateAdvancedTransferRequest request = new CreateAdvancedTransferRequest.Builder()
                .portfolioId("portfolio-123")
                .build();

        String json = objectMapper.writeValueAsString(request);
        assertNotNull(json);
        assertFalse(json.contains("portfolio_id"));
    }

    @Test
    public void testCreateAdvancedTransferRequestBuilderValidation() {
        assertThrows(CoinbaseClientException.class, () ->
                new CreateAdvancedTransferRequest.Builder().build());
    }

    @Test
    public void testCreateAdvancedTransferResponseDeserialization() throws JsonProcessingException {
        String json = "{"
                + "\"advanced_transfer\":{"
                + "\"id\":\"at-new-1\","
                + "\"state\":\"ADVANCED_TRANSFER_STATE_CREATED\","
                + "\"type\":\"ADVANCED_TRANSFER_TYPE_BLIND_MATCH\","
                + "\"amount\":\"1000.00\","
                + "\"currency\":\"USD\""
                + "}"
                + "}";

        CreateAdvancedTransferResponse response = objectMapper.readValue(json, CreateAdvancedTransferResponse.class);
        assertNotNull(response);
        assertNotNull(response.getAdvancedTransfer());
        assertEquals("at-new-1", response.getAdvancedTransfer().getId());
    }

    // ==================== CancelAdvancedTransfer Tests ====================

    @Test
    public void testCancelAdvancedTransferRequestConstruction() throws CoinbaseClientException {
        CancelAdvancedTransferRequest request = new CancelAdvancedTransferRequest.Builder()
                .portfolioId("portfolio-123")
                .advancedTransferId("at-456")
                .build();
        assertNotNull(request);
        assertEquals("portfolio-123", request.getPortfolioId());
        assertEquals("at-456", request.getAdvancedTransferId());
    }

    @Test
    public void testCancelAdvancedTransferRequestBuilderValidation() {
        assertThrows(CoinbaseClientException.class, () ->
                new CancelAdvancedTransferRequest.Builder()
                        .portfolioId("portfolio-123")
                        .build());
        assertThrows(CoinbaseClientException.class, () ->
                new CancelAdvancedTransferRequest.Builder()
                        .advancedTransferId("at-456")
                        .build());
    }

    @Test
    public void testCancelAdvancedTransferResponseDeserialization() throws JsonProcessingException {
        String json = "{\"advanced_transfer_id\":\"at-456\"}";
        CancelAdvancedTransferResponse response = objectMapper.readValue(json, CancelAdvancedTransferResponse.class);
        assertNotNull(response);
        assertEquals("at-456", response.getAdvancedTransferId());
    }
}
