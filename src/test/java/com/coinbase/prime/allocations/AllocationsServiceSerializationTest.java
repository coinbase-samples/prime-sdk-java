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

package com.coinbase.prime.allocations;

import com.coinbase.core.errors.CoinbaseClientException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AllocationsServiceSerializationTest {

    private ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {
        objectMapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }

    // ==================== CreateAllocation Tests ====================

    @Test
    public void testCreateAllocationRequestSerialization() throws JsonProcessingException {
        CreateAllocationRequest request = new CreateAllocationRequest.Builder()
                .allocationId("alloc-123")
                .sourcePortfolioId("portfolio-source")
                .productId("BTC-USD")
                .orderIds(new String[]{"order-1", "order-2"})
                .build();

        String json = objectMapper.writeValueAsString(request);
        assertNotNull(json);
        assertTrue(json.contains("\"allocation_id\":\"alloc-123\""));
        assertTrue(json.contains("\"source_portfolio_id\":\"portfolio-source\""));
        assertTrue(json.contains("\"product_id\":\"BTC-USD\""));
        assertTrue(json.contains("\"order_ids\""));
    }

    @Test
    public void testCreateAllocationResponseDeserialization() throws JsonProcessingException {
        String json = "{"
                + "\"success\":true,"
                + "\"allocation_id\":\"alloc-123\""
                + "}";

        CreateAllocationResponse response = objectMapper.readValue(json, CreateAllocationResponse.class);
        assertNotNull(response);
        assertTrue(response.isSuccess());
        assertEquals("alloc-123", response.getAllocationId());
    }

    @Test
    public void testCreateAllocationResponseFailureDeserialization() throws JsonProcessingException {
        String json = "{"
                + "\"success\":false,"
                + "\"failure_reason\":\"Insufficient orders\""
                + "}";

        CreateAllocationResponse response = objectMapper.readValue(json, CreateAllocationResponse.class);
        assertNotNull(response);
        assertFalse(response.isSuccess());
        assertEquals("Insufficient orders", response.getFailureReason());
    }

    // ==================== CreateNetAllocation Tests ====================

    @Test
    public void testCreateNetAllocationRequestSerialization() throws JsonProcessingException {
        CreateNetAllocationRequest request = new CreateNetAllocationRequest.Builder()
                .sourcePortfolioId("portfolio-source")
                .productId("ETH-USD")
                .nettingId("netting-456")
                .build();

        String json = objectMapper.writeValueAsString(request);
        assertNotNull(json);
        assertTrue(json.contains("\"source_portfolio_id\":\"portfolio-source\""));
        assertTrue(json.contains("\"product_id\":\"ETH-USD\""));
        assertTrue(json.contains("\"netting_id\":\"netting-456\""));
    }

    @Test
    public void testCreateNetAllocationResponseDeserialization() throws JsonProcessingException {
        String json = "{"
                + "\"success\":true,"
                + "\"netting_id\":\"netting-456\","
                + "\"buy_allocation_id\":\"buy-alloc-1\","
                + "\"sell_allocation_id\":\"sell-alloc-2\""
                + "}";

        CreateNetAllocationResponse response = objectMapper.readValue(json, CreateNetAllocationResponse.class);
        assertNotNull(response);
        assertTrue(response.isSuccess());
        assertEquals("netting-456", response.getNettingId());
        assertEquals("buy-alloc-1", response.getBuyAllocationId());
        assertEquals("sell-alloc-2", response.getSellAllocationId());
    }

    // ==================== GetAllocation Tests ====================

    @Test
    public void testGetAllocationRequestConstruction() throws CoinbaseClientException {
        GetAllocationRequest request = new GetAllocationRequest.Builder("portfolio-123", "alloc-456")
                .build();
        assertNotNull(request);
        assertEquals("portfolio-123", request.getPortfolioId());
        assertEquals("alloc-456", request.getAllocationId());
    }

    @Test
    public void testGetAllocationResponseDeserialization() throws JsonProcessingException {
        String json = "{"
                + "\"allocation\":{"
                + "\"allocation_id\":\"alloc-456\","
                + "\"product_id\":\"BTC-USD\""
                + "}"
                + "}";

        GetAllocationResponse response = objectMapper.readValue(json, GetAllocationResponse.class);
        assertNotNull(response);
        assertNotNull(response.getAllocation());
    }

    // ==================== ListAllocationsByNettingId Tests ====================

    @Test
    public void testListAllocationsByNettingIdRequestConstruction() throws CoinbaseClientException {
        ListAllocationsByNettingIdRequest request = new ListAllocationsByNettingIdRequest.Builder("portfolio-123", "netting-789")
                .build();
        assertNotNull(request);
        assertEquals("portfolio-123", request.getPortfolioId());
        assertEquals("netting-789", request.getNettingId());
    }

    @Test
    public void testListAllocationsByNettingIdResponseDeserialization() throws JsonProcessingException {
        String json = "{"
                + "\"allocations\":["
                + "{\"allocation_id\":\"alloc-1\",\"product_id\":\"BTC-USD\"},"
                + "{\"allocation_id\":\"alloc-2\",\"product_id\":\"BTC-USD\"}"
                + "]"
                + "}";

        ListAllocationsByNettingIdResponse response = objectMapper.readValue(json, ListAllocationsByNettingIdResponse.class);
        assertNotNull(response);
        assertNotNull(response.getAllocations());
        assertEquals(2, response.getAllocations().length);
    }

    // ==================== ListPortfolioAllocations Tests ====================

    @Test
    public void testListPortfolioAllocationsRequestConstruction() throws CoinbaseClientException {
        ListPortfolioAllocationsRequest request = new ListPortfolioAllocationsRequest.Builder("portfolio-123")
                .productIds(new String[]{"BTC-USD", "ETH-USD"})
                .build();
        assertNotNull(request);
        assertEquals("portfolio-123", request.getPortfolioId());
    }

    @Test
    public void testListPortfolioAllocationsResponseDeserialization() throws JsonProcessingException {
        String json = "{"
                + "\"allocations\":["
                + "{\"allocation_id\":\"alloc-1\",\"product_id\":\"BTC-USD\"},"
                + "{\"allocation_id\":\"alloc-2\",\"product_id\":\"ETH-USD\"}"
                + "],"
                + "\"pagination\":{\"next_cursor\":\"page-2\",\"has_next\":true}"
                + "}";

        ListPortfolioAllocationsResponse response = objectMapper.readValue(json, ListPortfolioAllocationsResponse.class);
        assertNotNull(response);
        assertNotNull(response.getAllocations());
        assertEquals(2, response.getAllocations().length);
        assertNotNull(response.getPagination());
    }
}
