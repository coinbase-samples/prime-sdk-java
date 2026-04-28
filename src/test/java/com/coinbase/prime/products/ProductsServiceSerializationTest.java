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

package com.coinbase.prime.products;

import com.coinbase.core.errors.CoinbaseClientException;
import com.coinbase.prime.model.enums.CandlesGranularity;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProductsServiceSerializationTest {

    private ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {
        objectMapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }

    // ==================== ListCandles Tests ====================

    @Test
    public void testListCandlesRequestSerialization() throws JsonProcessingException {
        ListCandlesRequest request = new ListCandlesRequest.Builder()
                .portfolioId("portfolio-123")
                .productId("BTC-USD")
                .startTime("2025-01-01T00:00:00Z")
                .endTime("2025-01-02T00:00:00Z")
                .granularity(CandlesGranularity.ONE_DAY)
                .build();

        String json = objectMapper.writeValueAsString(request);
        assertNotNull(json);
        assertTrue(json.contains("\"product_id\":\"BTC-USD\""));
        assertTrue(json.contains("\"start_time\":\"2025-01-01T00:00:00Z\""));
        assertTrue(json.contains("\"end_time\":\"2025-01-02T00:00:00Z\""));
        assertTrue(json.contains("\"granularity\":\"ONE_DAY\""));
        assertFalse(json.contains("\"portfolio_id\""));
    }

    @Test
    public void testListCandlesRequestBuilderValidation() {
        assertThrows(CoinbaseClientException.class, () ->
                new ListCandlesRequest.Builder()
                        .productId("BTC-USD")
                        .startTime("2025-01-01T00:00:00Z")
                        .endTime("2025-01-02T00:00:00Z")
                        .granularity(CandlesGranularity.ONE_DAY)
                        .build());

        assertThrows(CoinbaseClientException.class, () ->
                new ListCandlesRequest.Builder()
                        .portfolioId("portfolio-123")
                        .startTime("2025-01-01T00:00:00Z")
                        .endTime("2025-01-02T00:00:00Z")
                        .granularity(CandlesGranularity.ONE_DAY)
                        .build());
    }

    @Test
    public void testListCandlesResponseDeserialization() throws JsonProcessingException {
        String json = "{"
                + "\"candles\":["
                + "{\"start\":\"1704067200\",\"high\":\"50000.00\",\"low\":\"48000.00\",\"open\":\"49000.00\",\"close\":\"49500.00\",\"volume\":\"1000.0\"},"
                + "{\"start\":\"1704153600\",\"high\":\"51000.00\",\"low\":\"49000.00\",\"open\":\"49500.00\",\"close\":\"50500.00\",\"volume\":\"1200.0\"}"
                + "]"
                + "}";

        ListCandlesResponse response = objectMapper.readValue(json, ListCandlesResponse.class);
        assertNotNull(response);
        assertNotNull(response.getCandles());
        assertEquals(2, response.getCandles().size());
    }

    // ==================== ListPortfolioProducts Tests ====================

    @Test
    public void testListPortfolioProductsRequestConstruction() throws CoinbaseClientException {
        ListPortfolioProductsRequest request = new ListPortfolioProductsRequest.Builder()
                .portfolioId("portfolio-123")
                .build();
        assertNotNull(request);
        assertEquals("portfolio-123", request.getPortfolioId());
    }

    @Test
    public void testListPortfolioProductsRequestBuilderValidation() {
        assertThrows(CoinbaseClientException.class, () ->
                new ListPortfolioProductsRequest.Builder().build());
    }

    @Test
    public void testListPortfolioProductsResponseDeserialization() throws JsonProcessingException {
        String json = "{"
                + "\"products\":["
                + "{\"id\":\"BTC-USD\",\"base_currency\":\"BTC\",\"quote_currency\":\"USD\"},"
                + "{\"id\":\"ETH-USD\",\"base_currency\":\"ETH\",\"quote_currency\":\"USD\"}"
                + "],"
                + "\"pagination\":{\"has_next\":false}"
                + "}";

        ListPortfolioProductsResponse response = objectMapper.readValue(json, ListPortfolioProductsResponse.class);
        assertNotNull(response);
        assertNotNull(response.getProducts());
        assertEquals(2, response.getProducts().length);
        assertEquals("BTC-USD", response.getProducts()[0].getId());
    }
}
