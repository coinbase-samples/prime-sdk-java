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

package com.coinbase.prime.commission;

import com.coinbase.core.errors.CoinbaseClientException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CommissionServiceSerializationTest {

    private ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {
        objectMapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }

    @Test
    public void testGetPortfolioCommissionRequestSerialization() throws CoinbaseClientException, JsonProcessingException {
        GetPortfolioCommissionRequest request = new GetPortfolioCommissionRequest.Builder()
                .portfolioId("portfolio-123")
                .productId("BTC-USD")
                .build();

        String json = objectMapper.writeValueAsString(request);
        assertNotNull(json);
        assertTrue(json.contains("\"product_id\":\"BTC-USD\""));
        assertFalse(json.contains("portfolio_id"));
    }

    @Test
    public void testGetPortfolioCommissionRequestBuilderValidation() {
        assertThrows(CoinbaseClientException.class, () ->
                new GetPortfolioCommissionRequest.Builder().build());
    }

    @Test
    public void testGetPortfolioCommissionResponseDeserialization() throws JsonProcessingException {
        String json = "{"
                + "\"commission\":{"
                + "\"type\":\"COMMISSION_TYPE_TAKER\","
                + "\"rate\":\"0.0005\""
                + "}"
                + "}";

        GetPortfolioCommissionResponse response = objectMapper.readValue(json, GetPortfolioCommissionResponse.class);
        assertNotNull(response);
        assertNotNull(response.getCommission());
        assertEquals("0.0005", response.getCommission().getRate());
    }
}
