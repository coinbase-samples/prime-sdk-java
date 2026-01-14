/*
 * Copyright 2025-present Coinbase Global, Inc.
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

package com.coinbase.prime.wallets;

import com.coinbase.core.errors.CoinbaseClientException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for Wallets service serialization/deserialization
 */
public class WalletsServiceSerializationTest {

    private ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {
        objectMapper = new ObjectMapper();
    }

    // ==================== CreateWalletDepositAddress Tests ====================

    @Test
    public void testCreateWalletDepositAddressRequestSerialization() throws CoinbaseClientException, JsonProcessingException {
        CreateWalletDepositAddressRequest request = new CreateWalletDepositAddressRequest.Builder()
                .portfolioId("test-portfolio-id")
                .walletId("test-wallet-id")
                .networkId("ethereum-mainnet")
                .build();

        String json = objectMapper.writeValueAsString(request);

        assertNotNull(json);
        assertTrue(json.contains("\"network_id\":\"ethereum-mainnet\""));
        // portfolioId and walletId should be ignored (path params)
        assertFalse(json.contains("portfolio_id"));
        assertFalse(json.contains("wallet_id"));
    }

    @Test
    public void testCreateWalletDepositAddressResponseDeserialization() throws JsonProcessingException {
        // This is the expected JSON response from the API based on OpenAPI spec
        String json = "{"
                + "\"address\":\"0x1234567890abcdef1234567890abcdef12345678\","
                + "\"account_identifier\":\"memo-123\","
                + "\"network\":{"
                + "\"id\":\"ethereum\","
                + "\"type\":\"mainnet\""
                + "}"
                + "}";

        CreateWalletDepositAddressResponse response = objectMapper.readValue(json, CreateWalletDepositAddressResponse.class);

        assertNotNull(response);
        assertEquals("0x1234567890abcdef1234567890abcdef12345678", response.getAddress());
        assertEquals("memo-123", response.getAccountIdentifier());
        assertNotNull(response.getNetwork());
        assertEquals("ethereum", response.getNetwork().getId());
        assertEquals("mainnet", response.getNetwork().getType());
    }

    @Test
    public void testCreateWalletDepositAddressResponseWithNullAccountIdentifier() throws JsonProcessingException {
        // Some chains don't use account identifiers
        String json = "{"
                + "\"address\":\"bc1qxy2kgdygjrsqtzq2n0yrf2493p83kkfjhx0wlh\","
                + "\"network\":{"
                + "\"id\":\"bitcoin\","
                + "\"type\":\"mainnet\""
                + "}"
                + "}";

        CreateWalletDepositAddressResponse response = objectMapper.readValue(json, CreateWalletDepositAddressResponse.class);

        assertNotNull(response);
        assertEquals("bc1qxy2kgdygjrsqtzq2n0yrf2493p83kkfjhx0wlh", response.getAddress());
        assertNull(response.getAccountIdentifier());
        assertNotNull(response.getNetwork());
        assertEquals("bitcoin", response.getNetwork().getId());
    }

    @Test
    public void testCreateWalletDepositAddressRequestBuilderValidation() {
        // Missing required fields should throw
        assertThrows(CoinbaseClientException.class, () -> {
            new CreateWalletDepositAddressRequest.Builder()
                    .portfolioId("portfolio-123")
                    .walletId("wallet-123")
                    // missing networkId
                    .build();
        });

        assertThrows(CoinbaseClientException.class, () -> {
            new CreateWalletDepositAddressRequest.Builder()
                    .portfolioId("portfolio-123")
                    // missing walletId
                    .networkId("ethereum-mainnet")
                    .build();
        });

        assertThrows(CoinbaseClientException.class, () -> {
            new CreateWalletDepositAddressRequest.Builder()
                    // missing portfolioId
                    .walletId("wallet-123")
                    .networkId("ethereum-mainnet")
                    .build();
        });
    }

    // ==================== ListWalletAddresses Tests ====================

    @Test
    public void testListWalletAddressesResponseDeserialization() throws JsonProcessingException {
        String json = "{"
                + "\"addresses\":["
                + "{\"address\":\"0xabc123\",\"account_identifier\":null,\"network\":{\"id\":\"ethereum\",\"type\":\"mainnet\"}},"
                + "{\"address\":\"0xdef456\",\"network\":{\"id\":\"base\",\"type\":\"mainnet\"}}"
                + "],"
                + "\"pagination\":{\"next_cursor\":\"cursor-123\",\"has_next\":true}"
                + "}";

        ListWalletAddressesResponse response = objectMapper.readValue(json, ListWalletAddressesResponse.class);

        assertNotNull(response);
        assertNotNull(response.getAddresses());
        assertEquals(2, response.getAddresses().size());
        assertEquals("0xabc123", response.getAddresses().get(0).getAddress());
        assertEquals("0xdef456", response.getAddresses().get(1).getAddress());
    }
}
