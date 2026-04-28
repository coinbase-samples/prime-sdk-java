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

package com.coinbase.prime.portfolios;

import com.coinbase.core.errors.CoinbaseClientException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PortfoliosServiceSerializationTest {

    private ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {
        objectMapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }

    // ==================== ListPortfolios Tests ====================

    @Test
    public void testListPortfoliosRequestConstruction() {
        ListPortfoliosRequest request = new ListPortfoliosRequest.Builder().build();
        assertNotNull(request);
    }

    @Test
    public void testListPortfoliosResponseDeserialization() throws JsonProcessingException {
        String json = "{"
                + "\"portfolios\":["
                + "{\"id\":\"port-1\",\"name\":\"Trading Portfolio\",\"entity_id\":\"entity-abc\"},"
                + "{\"id\":\"port-2\",\"name\":\"Vault Portfolio\",\"entity_id\":\"entity-abc\"}"
                + "]"
                + "}";

        ListPortfoliosResponse response = objectMapper.readValue(json, ListPortfoliosResponse.class);
        assertNotNull(response);
        assertNotNull(response.getPortfolios());
        assertEquals(2, response.getPortfolios().length);
        assertEquals("port-1", response.getPortfolios()[0].getId());
    }

    // ==================== GetPortfolio Tests ====================

    @Test
    public void testGetPortfolioRequestConstruction() throws CoinbaseClientException {
        GetPortfolioRequest request = new GetPortfolioRequest.Builder("portfolio-123").build();
        assertNotNull(request);
        assertEquals("portfolio-123", request.getPortfolioId());
    }

    @Test
    public void testGetPortfolioRequestBuilderValidation() {
        assertThrows(CoinbaseClientException.class, () ->
                new GetPortfolioRequest.Builder(null).build());
    }

    @Test
    public void testGetPortfolioResponseDeserialization() throws JsonProcessingException {
        String json = "{"
                + "\"portfolio\":{"
                + "\"id\":\"portfolio-123\","
                + "\"name\":\"My Portfolio\","
                + "\"entity_id\":\"entity-xyz\""
                + "}"
                + "}";

        GetPortfolioResponse response = objectMapper.readValue(json, GetPortfolioResponse.class);
        assertNotNull(response);
        assertNotNull(response.getPortfolio());
        assertEquals("portfolio-123", response.getPortfolio().getId());
        assertEquals("My Portfolio", response.getPortfolio().getName());
    }

    // ==================== GetPortfolioCounterpartyId Tests ====================

    @Test
    public void testGetPortfolioCounterpartyIdRequestConstruction() throws CoinbaseClientException {
        GetPortfolioCounterpartyIdRequest request = new GetPortfolioCounterpartyIdRequest.Builder("portfolio-123").build();
        assertNotNull(request);
        assertEquals("portfolio-123", request.getPortfolioId());
    }

    @Test
    public void testGetPortfolioCounterpartyIdResponseDeserialization() throws JsonProcessingException {
        String json = "{"
                + "\"counterparty\":{"
                + "\"counterparty_id\":\"cpty-abc123\","
                + "\"name\":\"Counterparty Name\""
                + "}"
                + "}";

        GetPortfolioCounterpartyIdResponse response = objectMapper.readValue(json, GetPortfolioCounterpartyIdResponse.class);
        assertNotNull(response);
        assertNotNull(response.getCounterparty());
        assertEquals("cpty-abc123", response.getCounterparty().getCounterpartyId());
    }
}
