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

package com.coinbase.prime.balances;

import com.coinbase.core.errors.CoinbaseClientException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BalancesServiceSerializationTest {

    private ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {
        objectMapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }

    // ==================== ListEntityBalances Tests ====================

    @Test
    public void testListEntityBalancesRequestSerialization() throws JsonProcessingException {
        ListEntityBalancesRequest request = new ListEntityBalancesRequest.Builder()
                .entityId("entity-123")
                .symbols("BTC,ETH")
                .build();

        String json = objectMapper.writeValueAsString(request);
        assertNotNull(json);
        assertTrue(json.contains("\"symbols\":\"BTC,ETH\""));
        assertFalse(json.contains("\"entity_id\""));
    }

    @Test
    public void testListEntityBalancesRequestBuilderValidation() {
        assertThrows(CoinbaseClientException.class, () ->
                new ListEntityBalancesRequest.Builder().build());
    }

    @Test
    public void testListEntityBalancesResponseDeserialization() throws JsonProcessingException {
        String json = "{"
                + "\"balances\":["
                + "{\"symbol\":\"BTC\",\"amount\":\"1.5\",\"holds\":\"0.0\"},"
                + "{\"symbol\":\"ETH\",\"amount\":\"10.0\",\"holds\":\"0.5\"}"
                + "],"
                + "\"pagination\":{\"next_cursor\":\"cursor-xyz\",\"has_next\":false}"
                + "}";

        ListEntityBalancesResponse response = objectMapper.readValue(json, ListEntityBalancesResponse.class);
        assertNotNull(response);
        assertNotNull(response.getBalances());
        assertEquals(2, response.getBalances().length);
    }

    // ==================== ListPortfolioBalances Tests ====================

    @Test
    public void testListPortfolioBalancesRequestSerialization() throws CoinbaseClientException, JsonProcessingException {
        ListPortfolioBalancesRequest request = new ListPortfolioBalancesRequest.Builder()
                .portfolioId("portfolio-123")
                .symbols(new String[]{"BTC", "ETH"})
                .build();

        String json = objectMapper.writeValueAsString(request);
        assertNotNull(json);
        assertTrue(json.contains("\"symbols\""));
        assertFalse(json.contains("\"portfolio_id\""));
    }

    @Test
    public void testListPortfolioBalancesResponseDeserialization() throws JsonProcessingException {
        String json = "{"
                + "\"balances\":["
                + "{\"symbol\":\"BTC\",\"amount\":\"2.0\",\"holds\":\"0.1\"}"
                + "],"
                + "\"type\":\"TRADING_BALANCES\","
                + "\"trading_balances\":{\"total\":\"100000.00\",\"holds\":\"5000.00\"},"
                + "\"vault_balances\":{\"total\":\"50000.00\",\"holds\":\"0.00\"}"
                + "}";

        ListPortfolioBalancesResponse response = objectMapper.readValue(json, ListPortfolioBalancesResponse.class);
        assertNotNull(response);
        assertNotNull(response.getBalances());
        assertEquals(1, response.getBalances().length);
        assertNotNull(response.getTradingBalances());
        assertNotNull(response.getVaultBalances());
    }

    // ==================== GetWalletBalance Tests ====================

    @Test
    public void testGetWalletBalanceRequestConstruction() throws CoinbaseClientException {
        GetWalletBalanceRequest request = new GetWalletBalanceRequest.Builder()
                .portfolioId("portfolio-123")
                .walletId("wallet-456")
                .build();
        assertNotNull(request);
        assertEquals("portfolio-123", request.getPortfolioId());
        assertEquals("wallet-456", request.getWalletId());
    }

    @Test
    public void testGetWalletBalanceRequestBuilderValidation() {
        assertThrows(CoinbaseClientException.class, () ->
                new GetWalletBalanceRequest.Builder()
                        .walletId("wallet-456")
                        .build());
        assertThrows(CoinbaseClientException.class, () ->
                new GetWalletBalanceRequest.Builder()
                        .portfolioId("portfolio-123")
                        .build());
    }

    @Test
    public void testGetWalletBalanceResponseDeserialization() throws JsonProcessingException {
        String json = "{"
                + "\"balance\":{"
                + "\"symbol\":\"BTC\","
                + "\"amount\":\"0.5\","
                + "\"holds\":\"0.0\""
                + "}"
                + "}";

        GetWalletBalanceResponse response = objectMapper.readValue(json, GetWalletBalanceResponse.class);
        assertNotNull(response);
        assertNotNull(response.getBalance());
        assertEquals("BTC", response.getBalance().getSymbol());
    }

    // ==================== ListOnchainWalletBalances Tests ====================

    @Test
    public void testListOnchainWalletBalancesRequestConstruction() throws CoinbaseClientException {
        ListOnchainWalletBalancesRequest request = new ListOnchainWalletBalancesRequest.Builder()
                .portfolioId("portfolio-123")
                .walletId("wallet-456")
                .build();
        assertNotNull(request);
        assertEquals("portfolio-123", request.getPortfolioId());
        assertEquals("wallet-456", request.getWalletId());
    }

    @Test
    public void testListOnchainWalletBalancesResponseDeserialization() throws JsonProcessingException {
        String json = "{"
                + "\"balances\":["
                + "{\"asset\":{\"name\":\"USDC\",\"symbol\":\"USDC\"},\"amount\":\"500.00\"},"
                + "{\"asset\":{\"name\":\"Ether\",\"symbol\":\"ETH\"},\"amount\":\"2.5\"}"
                + "],"
                + "\"pagination\":{\"has_next\":false}"
                + "}";

        ListOnchainWalletBalancesResponse response = objectMapper.readValue(json, ListOnchainWalletBalancesResponse.class);
        assertNotNull(response);
        assertNotNull(response.getBalances());
        assertEquals(2, response.getBalances().length);
    }
}
