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

package com.coinbase.prime.wallets;

import com.coinbase.core.errors.CoinbaseClientException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
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
        objectMapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
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

    // ==================== ListWallets Tests ====================

    @Test
    public void testListWalletsRequestSerialization() throws CoinbaseClientException, JsonProcessingException {
        ListWalletsRequest request = new ListWalletsRequest.Builder()
                .portfolioId("portfolio-123")
                .symbols(new String[]{"BTC", "ETH"})
                .build();

        String json = objectMapper.writeValueAsString(request);
        assertNotNull(json);
        assertTrue(json.contains("\"symbols\""));
        assertFalse(json.contains("portfolio_id"));
    }

    @Test
    public void testListWalletsRequestBuilderValidation() {
        assertThrows(CoinbaseClientException.class, () ->
                new ListWalletsRequest.Builder().build());
    }

    @Test
    public void testListWalletsResponseDeserialization() throws JsonProcessingException {
        String json = "{"
                + "\"wallets\":["
                + "{\"id\":\"wallet-1\",\"name\":\"BTC Trading\",\"symbol\":\"BTC\",\"type\":\"TRADING\"},"
                + "{\"id\":\"wallet-2\",\"name\":\"ETH Vault\",\"symbol\":\"ETH\",\"type\":\"VAULT\"}"
                + "],"
                + "\"pagination\":{\"next_cursor\":\"wallet-cursor\",\"has_next\":true}"
                + "}";

        ListWalletsResponse response = objectMapper.readValue(json, ListWalletsResponse.class);
        assertNotNull(response);
        assertNotNull(response.getWallets());
        assertEquals(2, response.getWallets().length);
        assertEquals("wallet-1", response.getWallets()[0].getId());
        assertNotNull(response.getPagination());
    }

    // ==================== CreateWallet Tests ====================

    @Test
    public void testCreateWalletRequestSerialization() throws CoinbaseClientException, JsonProcessingException {
        CreateWalletRequest request = new CreateWalletRequest.Builder()
                .portfolioId("portfolio-123")
                .name("My BTC Wallet")
                .symbol("BTC")
                .type(com.coinbase.prime.model.enums.WalletType.VAULT)
                .build();

        String json = objectMapper.writeValueAsString(request);
        assertNotNull(json);
        assertTrue(json.contains("\"name\":\"My BTC Wallet\""));
        assertTrue(json.contains("\"symbol\":\"BTC\""));
        assertTrue(json.contains("\"wallet_type\":\"VAULT\""));
        assertFalse(json.contains("portfolio_id"));
    }

    @Test
    public void testCreateWalletRequestBuilderValidation() {
        assertThrows(CoinbaseClientException.class, () ->
                new CreateWalletRequest.Builder()
                        .portfolioId("portfolio-123")
                        .symbol("BTC")
                        .type(com.coinbase.prime.model.enums.WalletType.VAULT)
                        .build());

        assertThrows(CoinbaseClientException.class, () ->
                new CreateWalletRequest.Builder()
                        .portfolioId("portfolio-123")
                        .name("My Wallet")
                        .type(com.coinbase.prime.model.enums.WalletType.VAULT)
                        .build());
    }

    @Test
    public void testCreateWalletResponseDeserialization() throws JsonProcessingException {
        String json = "{"
                + "\"activity_id\":\"act-wallet-1\","
                + "\"name\":\"My BTC Wallet\","
                + "\"symbol\":\"BTC\","
                + "\"wallet_type\":\"VAULT\","
                + "\"network_family\":\"NETWORK_FAMILY_EVM\""
                + "}";

        CreateWalletResponse response = objectMapper.readValue(json, CreateWalletResponse.class);
        assertNotNull(response);
        assertEquals("act-wallet-1", response.getActivityId());
        assertEquals("My BTC Wallet", response.getName());
        assertEquals("BTC", response.getSymbol());
    }

    // ==================== GetWallet Tests ====================

    @Test
    public void testGetWalletRequestConstruction() throws CoinbaseClientException {
        GetWalletRequest request = new GetWalletRequest.Builder("portfolio-123", "wallet-456").build();
        assertNotNull(request);
        assertEquals("portfolio-123", request.getPortfolioId());
        assertEquals("wallet-456", request.getWalletId());
    }

    @Test
    public void testGetWalletResponseDeserialization() throws JsonProcessingException {
        String json = "{"
                + "\"wallet\":{"
                + "\"id\":\"wallet-456\","
                + "\"name\":\"My BTC Wallet\","
                + "\"symbol\":\"BTC\","
                + "\"type\":\"VAULT\""
                + "}"
                + "}";

        GetWalletResponse response = objectMapper.readValue(json, GetWalletResponse.class);
        assertNotNull(response);
        assertNotNull(response.getWallet());
        assertEquals("wallet-456", response.getWallet().getId());
    }

    // ==================== GetWalletDepositInstructions Tests ====================

    @Test
    public void testGetWalletDepositInstructionsRequestConstruction() throws CoinbaseClientException {
        GetWalletDepositInstructionsRequest request = new GetWalletDepositInstructionsRequest.Builder()
                .portfolioId("portfolio-123")
                .walletId("wallet-456")
                .depositType(com.coinbase.prime.model.enums.WalletDepositInstructionType.CRYPTO)
                .build();
        assertNotNull(request);
        assertEquals("portfolio-123", request.getPortfolioId());
        assertEquals("wallet-456", request.getWalletId());
        assertEquals(com.coinbase.prime.model.enums.WalletDepositInstructionType.CRYPTO, request.getDepositType());
    }

    @Test
    public void testGetWalletDepositInstructionsRequestBuilderValidation() {
        assertThrows(CoinbaseClientException.class, () ->
                new GetWalletDepositInstructionsRequest.Builder()
                        .walletId("wallet-456")
                        .depositType(com.coinbase.prime.model.enums.WalletDepositInstructionType.CRYPTO)
                        .build());
    }

    @Test
    public void testGetWalletDepositInstructionsCryptoResponseDeserialization() throws JsonProcessingException {
        String json = "{"
                + "\"crypto_instructions\":{"
                + "\"address\":\"0xabc123\","
                + "\"account_identifier\":\"memo-xyz\","
                + "\"destination_tag\":\"12345\","
                + "\"network\":{\"id\":\"ethereum\",\"type\":\"mainnet\"}"
                + "}"
                + "}";

        GetWalletDepositInstructionsResponse response = objectMapper.readValue(json, GetWalletDepositInstructionsResponse.class);
        assertNotNull(response);
        assertNotNull(response.getCryptoDepositInstructions());
        assertEquals("0xabc123", response.getCryptoDepositInstructions().getAddress());
        assertNull(response.getFiatDepositInstructions());
    }

    @Test
    public void testGetWalletDepositInstructionsFiatResponseDeserialization() throws JsonProcessingException {
        String json = "{"
                + "\"fiat_instructions\":{"
                + "\"account_number\":\"123456789\","
                + "\"routing_number\":\"021000021\","
                + "\"reference\":\"REF-001\""
                + "}"
                + "}";

        GetWalletDepositInstructionsResponse response = objectMapper.readValue(json, GetWalletDepositInstructionsResponse.class);
        assertNotNull(response);
        assertNotNull(response.getFiatDepositInstructions());
        assertNull(response.getCryptoDepositInstructions());
    }
}
