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

package com.coinbase.prime.staking;

import com.coinbase.core.errors.CoinbaseClientException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StakingServiceSerializationTest {

    private ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {
        objectMapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }

    // ==================== ClaimRewards Tests ====================

    @Test
    public void testClaimRewardsRequestSerialization() throws CoinbaseClientException, JsonProcessingException {
        ClaimRewardsRequest request = new ClaimRewardsRequest.Builder()
                .portfolioId("portfolio-123")
                .walletId("wallet-456")
                .idempotencyKey("idem-key-abc")
                .build();

        String json = objectMapper.writeValueAsString(request);
        assertNotNull(json);
        assertTrue(json.contains("\"idempotency_key\":\"idem-key-abc\""));
        assertFalse(json.contains("portfolio_id"));
        assertFalse(json.contains("wallet_id"));
    }

    @Test
    public void testClaimRewardsRequestBuilderValidation() {
        assertThrows(CoinbaseClientException.class, () ->
                new ClaimRewardsRequest.Builder()
                        .walletId("wallet-456")
                        .idempotencyKey("idem-key")
                        .build());
    }

    @Test
    public void testClaimRewardsResponseDeserialization() throws JsonProcessingException {
        String json = "{"
                + "\"wallet_id\":\"wallet-456\","
                + "\"transaction_id\":\"txn-abc123\","
                + "\"activity_id\":\"act-xyz789\""
                + "}";

        ClaimRewardsResponse response = objectMapper.readValue(json, ClaimRewardsResponse.class);
        assertNotNull(response);
        assertEquals("wallet-456", response.getWalletId());
        assertEquals("txn-abc123", response.getTransactionId());
        assertEquals("act-xyz789", response.getActivityId());
    }

    // ==================== CreateStake Tests ====================

    @Test
    public void testCreateStakeRequestSerialization() throws JsonProcessingException {
        CreateStakeRequest request = new CreateStakeRequest.Builder()
                .portfolioId("portfolio-123")
                .walletId("wallet-456")
                .idempotencyKey("idem-key-def")
                .build();

        String json = objectMapper.writeValueAsString(request);
        assertNotNull(json);
        assertTrue(json.contains("\"idempotency_key\":\"idem-key-def\""));
        assertFalse(json.contains("portfolio_id"));
        assertFalse(json.contains("wallet_id"));
    }

    @Test
    public void testCreateStakeResponseDeserialization() throws JsonProcessingException {
        String json = "{"
                + "\"wallet_id\":\"wallet-456\","
                + "\"transaction_id\":\"txn-stake-1\","
                + "\"activity_id\":\"act-stake-1\""
                + "}";

        CreateStakeResponse response = objectMapper.readValue(json, CreateStakeResponse.class);
        assertNotNull(response);
        assertEquals("wallet-456", response.getWalletId());
        assertEquals("txn-stake-1", response.getTransactionId());
        assertEquals("act-stake-1", response.getActivityId());
    }

    // ==================== CreateUnstake Tests ====================

    @Test
    public void testCreateUnstakeResponseDeserialization() throws JsonProcessingException {
        String json = "{"
                + "\"wallet_id\":\"wallet-456\","
                + "\"transaction_id\":\"txn-unstake-1\","
                + "\"activity_id\":\"act-unstake-1\""
                + "}";

        CreateUnstakeResponse response = objectMapper.readValue(json, CreateUnstakeResponse.class);
        assertNotNull(response);
        assertEquals("wallet-456", response.getWalletId());
        assertEquals("txn-unstake-1", response.getTransactionId());
        assertEquals("act-unstake-1", response.getActivityId());
    }

    // ==================== PortfolioStakingInitiate Tests ====================

    @Test
    public void testPortfolioStakingInitiateRequestSerialization() throws JsonProcessingException {
        PortfolioStakingInitiateRequest request = new PortfolioStakingInitiateRequest.Builder()
                .portfolioId("portfolio-123")
                .idempotencyKey("idem-init-1")
                .currencySymbol("ETH")
                .amount("10.0")
                .build();

        String json = objectMapper.writeValueAsString(request);
        assertNotNull(json);
        assertTrue(json.contains("\"idempotency_key\":\"idem-init-1\""));
        assertTrue(json.contains("\"currency_symbol\":\"ETH\""));
        assertTrue(json.contains("\"amount\":\"10.0\""));
        assertFalse(json.contains("portfolio_id"));
    }

    @Test
    public void testPortfolioStakingInitiateResponseDeserialization() throws JsonProcessingException {
        String json = "{"
                + "\"activity_id\":\"act-init-1\","
                + "\"transaction_id\":\"txn-init-1\""
                + "}";

        PortfolioStakingInitiateResponse response = objectMapper.readValue(json, PortfolioStakingInitiateResponse.class);
        assertNotNull(response);
        assertEquals("act-init-1", response.getActivityId());
        assertEquals("txn-init-1", response.getTransactionId());
    }

    // ==================== PortfolioStakingUnstake Tests ====================

    @Test
    public void testPortfolioStakingUnstakeRequestSerialization() throws JsonProcessingException {
        PortfolioStakingUnstakeRequest request = new PortfolioStakingUnstakeRequest.Builder()
                .portfolioId("portfolio-123")
                .idempotencyKey("idem-unstake-1")
                .currencySymbol("ETH")
                .amount("5.0")
                .build();

        String json = objectMapper.writeValueAsString(request);
        assertNotNull(json);
        assertTrue(json.contains("\"idempotency_key\":\"idem-unstake-1\""));
        assertTrue(json.contains("\"currency_symbol\":\"ETH\""));
        assertTrue(json.contains("\"amount\":\"5.0\""));
        assertFalse(json.contains("portfolio_id"));
    }

    @Test
    public void testPortfolioStakingUnstakeResponseDeserialization() throws JsonProcessingException {
        String json = "{"
                + "\"activity_id\":\"act-unstake-1\","
                + "\"transaction_id\":\"txn-unstake-1\""
                + "}";

        PortfolioStakingUnstakeResponse response = objectMapper.readValue(json, PortfolioStakingUnstakeResponse.class);
        assertNotNull(response);
        assertEquals("act-unstake-1", response.getActivityId());
        assertEquals("txn-unstake-1", response.getTransactionId());
    }

    // ==================== PreviewUnstake Tests ====================

    @Test
    public void testPreviewUnstakeRequestSerialization() throws JsonProcessingException {
        PreviewUnstakeRequest request = new PreviewUnstakeRequest.Builder()
                .portfolioId("portfolio-123")
                .walletId("wallet-456")
                .amount("5.0")
                .build();

        String json = objectMapper.writeValueAsString(request);
        assertNotNull(json);
        assertTrue(json.contains("\"amount\":\"5.0\""));
        assertFalse(json.contains("portfolio_id"));
        assertFalse(json.contains("wallet_id"));
    }

    @Test
    public void testPreviewUnstakeResponseDeserialization() throws JsonProcessingException {
        String json = "{\"estimated_amount\":\"4.9\"}";
        PreviewUnstakeResponse response = objectMapper.readValue(json, PreviewUnstakeResponse.class);
        assertNotNull(response);
        assertEquals("4.9", response.getEstimatedAmount());
    }

    // ==================== GetStakingStatus Tests ====================

    @Test
    public void testGetStakingStatusRequestConstruction() {
        GetStakingStatusRequest request = new GetStakingStatusRequest.Builder()
                .portfolioId("portfolio-123")
                .walletId("wallet-456")
                .build();
        assertNotNull(request);
        assertEquals("portfolio-123", request.getPortfolioId());
        assertEquals("wallet-456", request.getWalletId());
    }

    @Test
    public void testGetStakingStatusResponseDeserialization() throws JsonProcessingException {
        String json = "{"
                + "\"portfolio_id\":\"portfolio-123\","
                + "\"wallet_id\":\"wallet-456\","
                + "\"wallet_address\":\"0xabc123\","
                + "\"current_timestamp\":\"2025-01-01T00:00:00Z\","
                + "\"validators\":["
                + "{\"public_key\":\"0xpubkey1\",\"status\":\"active\"}"
                + "]"
                + "}";

        GetStakingStatusResponse response = objectMapper.readValue(json, GetStakingStatusResponse.class);
        assertNotNull(response);
        assertEquals("portfolio-123", response.getPortfolioId());
        assertEquals("wallet-456", response.getWalletId());
        assertEquals("0xabc123", response.getWalletAddress());
        assertNotNull(response.getValidators());
        assertEquals(1, response.getValidators().size());
    }

    // ==================== GetUnstakingStatus Tests ====================

    @Test
    public void testGetUnstakingStatusRequestConstruction() {
        GetUnstakingStatusRequest request = new GetUnstakingStatusRequest.Builder()
                .portfolioId("portfolio-123")
                .walletId("wallet-456")
                .build();
        assertNotNull(request);
        assertEquals("portfolio-123", request.getPortfolioId());
        assertEquals("wallet-456", request.getWalletId());
    }

    @Test
    public void testGetUnstakingStatusResponseDeserialization() throws JsonProcessingException {
        String json = "{"
                + "\"portfolio_id\":\"portfolio-123\","
                + "\"wallet_id\":\"wallet-456\","
                + "\"wallet_address\":\"0xabc123\","
                + "\"current_timestamp\":\"2025-01-01T00:00:00Z\","
                + "\"validators\":["
                + "{\"public_key\":\"0xpubkey1\",\"exit_epoch\":\"100\"}"
                + "]"
                + "}";

        GetUnstakingStatusResponse response = objectMapper.readValue(json, GetUnstakingStatusResponse.class);
        assertNotNull(response);
        assertEquals("portfolio-123", response.getPortfolioId());
        assertEquals("wallet-456", response.getWalletId());
        assertNotNull(response.getValidators());
        assertEquals(1, response.getValidators().size());
    }

    // ==================== ListTransactionValidators Tests ====================

    @Test
    public void testListTransactionValidatorsRequestSerialization() throws JsonProcessingException {
        ListTransactionValidatorsRequest request = new ListTransactionValidatorsRequest.Builder()
                .portfolioId("portfolio-123")
                .transactionIds(java.util.Arrays.asList("txn-1", "txn-2"))
                .build();

        String json = objectMapper.writeValueAsString(request);
        assertNotNull(json);
        assertTrue(json.contains("\"transaction_ids\""));
        assertFalse(json.contains("portfolio_id"));
    }

    @Test
    public void testListTransactionValidatorsResponseDeserialization() throws JsonProcessingException {
        String json = "{"
                + "\"transaction_validators\":["
                + "{\"transaction_id\":\"txn-1\",\"validators\":[{\"public_key\":\"0xpub1\"}]},"
                + "{\"transaction_id\":\"txn-2\",\"validators\":[{\"public_key\":\"0xpub2\"}]}"
                + "],"
                + "\"pagination\":{\"has_next\":false}"
                + "}";

        ListTransactionValidatorsResponse response = objectMapper.readValue(json, ListTransactionValidatorsResponse.class);
        assertNotNull(response);
        assertNotNull(response.getTransactionValidators());
        assertEquals(2, response.getTransactionValidators().size());
    }
}
