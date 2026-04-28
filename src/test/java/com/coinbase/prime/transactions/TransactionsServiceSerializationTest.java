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

package com.coinbase.prime.transactions;

import com.coinbase.core.errors.CoinbaseClientException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TransactionsServiceSerializationTest {

    private ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {
        objectMapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }

    // ==================== ListPortfolioTransactions Tests ====================

    @Test
    public void testListPortfolioTransactionsRequestSerialization() throws CoinbaseClientException, JsonProcessingException {
        ListPortfolioTransactionsRequest request = new ListPortfolioTransactionsRequest.Builder()
                .portfolioId("portfolio-123")
                .symbols(new String[]{"BTC", "ETH"})
                .startTime("2025-01-01T00:00:00Z")
                .endTime("2025-12-31T23:59:59Z")
                .build();

        String json = objectMapper.writeValueAsString(request);
        assertNotNull(json);
        assertTrue(json.contains("\"symbols\""));
        assertTrue(json.contains("\"start_time\":\"2025-01-01T00:00:00Z\""));
        assertTrue(json.contains("\"end_time\":\"2025-12-31T23:59:59Z\""));
        assertFalse(json.contains("portfolio_id"));
    }

    @Test
    public void testListPortfolioTransactionsResponseDeserialization() throws JsonProcessingException {
        String json = "{"
                + "\"transactions\":["
                + "{\"id\":\"txn-1\",\"type\":\"DEPOSIT\",\"status\":\"TRANSACTION_DONE\"},"
                + "{\"id\":\"txn-2\",\"type\":\"WITHDRAWAL\",\"status\":\"TRANSACTION_PROCESSING\"}"
                + "],"
                + "\"pagination\":{\"next_cursor\":\"txn-cursor\",\"has_next\":true}"
                + "}";

        ListPortfolioTransactionsResponse response = objectMapper.readValue(json, ListPortfolioTransactionsResponse.class);
        assertNotNull(response);
        assertNotNull(response.getTransactions());
        assertEquals(2, response.getTransactions().length);
        assertNotNull(response.getPagination());
    }

    // ==================== GetTransaction Tests ====================

    @Test
    public void testGetTransactionRequestConstruction() throws CoinbaseClientException {
        GetTransactionRequest request = new GetTransactionRequest.Builder("portfolio-123", "txn-456").build();
        assertNotNull(request);
        assertEquals("portfolio-123", request.getPortfolioId());
        assertEquals("txn-456", request.getTransactionId());
    }

    @Test
    public void testGetTransactionResponseDeserialization() throws JsonProcessingException {
        String json = "{"
                + "\"transaction\":{"
                + "\"id\":\"txn-456\","
                + "\"type\":\"DEPOSIT\","
                + "\"status\":\"TRANSACTION_DONE\","
                + "\"amount\":\"1.5\","
                + "\"symbol\":\"BTC\""
                + "}"
                + "}";

        GetTransactionResponse response = objectMapper.readValue(json, GetTransactionResponse.class);
        assertNotNull(response);
        assertNotNull(response.getTransaction());
        assertEquals("txn-456", response.getTransaction().getId());
    }

    // ==================== CreateConversion Tests ====================

    @Test
    public void testCreateConversionRequestSerialization() throws CoinbaseClientException, JsonProcessingException {
        CreateConversionRequest request = new CreateConversionRequest.Builder()
                .portfolioId("portfolio-123")
                .walletId("wallet-456")
                .amount("100.0")
                .destination("wallet-789")
                .sourceSymbol("USD")
                .destinationSymbol("USDC")
                .build();

        String json = objectMapper.writeValueAsString(request);
        assertNotNull(json);
        assertTrue(json.contains("\"amount\":\"100.0\""));
        assertTrue(json.contains("\"destination\":\"wallet-789\""));
        assertTrue(json.contains("\"source_symbol\":\"USD\""));
        assertTrue(json.contains("\"destination_symbol\":\"USDC\""));
        assertFalse(json.contains("\"portfolio_id\""));
        assertFalse(json.contains("\"wallet_id\""));
    }

    @Test
    public void testCreateConversionResponseDeserialization() throws JsonProcessingException {
        String json = "{"
                + "\"activity_id\":\"act-conv-1\","
                + "\"source_symbol\":\"USD\","
                + "\"destination_symbol\":\"USDC\","
                + "\"amount\":\"100.0\","
                + "\"destination\":\"wallet-789\","
                + "\"source\":\"wallet-456\","
                + "\"transaction_id\":\"txn-conv-1\""
                + "}";

        CreateConversionResponse response = objectMapper.readValue(json, CreateConversionResponse.class);
        assertNotNull(response);
        assertEquals("act-conv-1", response.getActivityId());
        assertEquals("USD", response.getSourceSymbol());
        assertEquals("USDC", response.getDestinationSymbol());
        assertEquals("txn-conv-1", response.getTransactionId());
    }

    // ==================== CreateOnchainTransaction Tests ====================

    @Test
    public void testCreateOnchainTransactionRequestSerialization() throws JsonProcessingException, com.coinbase.core.errors.CoinbaseClientException {
        com.coinbase.prime.model.RpcConfig rpc = new com.coinbase.prime.model.RpcConfig.Builder()
                .url("https://rpc.example.com")
                .build();
        CreateOnchainTransactionRequest request = new CreateOnchainTransactionRequest.Builder()
                .portfolioId("portfolio-123")
                .walletId("wallet-456")
                .rawUnsignedTxn("0xrawunsignedtxn")
                .rpc(rpc)
                .build();

        String json = objectMapper.writeValueAsString(request);
        assertNotNull(json);
        assertTrue(json.contains("\"raw_unsigned_txn\":\"0xrawunsignedtxn\""));
        assertFalse(json.contains("\"portfolio_id\""));
        assertFalse(json.contains("\"wallet_id\""));
    }

    @Test
    public void testCreateOnchainTransactionResponseDeserialization() throws JsonProcessingException {
        String json = "{\"transaction_id\":\"txn-onchain-1\"}";
        CreateOnchainTransactionResponse response = objectMapper.readValue(json, CreateOnchainTransactionResponse.class);
        assertNotNull(response);
        assertEquals("txn-onchain-1", response.getTransactionId());
    }

    // ==================== ListWalletTransactions Tests ====================

    @Test
    public void testListWalletTransactionsResponseDeserialization() throws JsonProcessingException {
        String json = "{"
                + "\"transactions\":["
                + "{\"id\":\"txn-w1\",\"type\":\"DEPOSIT\",\"status\":\"TRANSACTION_DONE\"},"
                + "{\"id\":\"txn-w2\",\"type\":\"WITHDRAWAL\",\"status\":\"TRANSACTION_PROCESSING\"}"
                + "],"
                + "\"pagination\":{\"has_next\":false}"
                + "}";

        ListWalletTransactionsResponse response = objectMapper.readValue(json, ListWalletTransactionsResponse.class);
        assertNotNull(response);
        assertNotNull(response.getTransactions());
        assertEquals(2, response.getTransactions().length);
    }

    // ==================== CreateWalletTransfer Tests ====================

    @Test
    public void testCreateWalletTransferResponseDeserialization() throws JsonProcessingException {
        String json = "{"
                + "\"activity_id\":\"act-transfer-1\","
                + "\"source_symbol\":\"BTC\","
                + "\"destination_symbol\":\"BTC\","
                + "\"amount\":\"0.5\","
                + "\"destination\":\"wallet-dest\","
                + "\"source\":\"wallet-src\","
                + "\"transaction_id\":\"txn-transfer-1\""
                + "}";

        CreateWalletTransferResponse response = objectMapper.readValue(json, CreateWalletTransferResponse.class);
        assertNotNull(response);
        assertEquals("act-transfer-1", response.getActivityId());
        assertEquals("txn-transfer-1", response.getTransactionId());
    }

    // ==================== CreateWalletWithdrawal Tests ====================

    @Test
    public void testCreateWalletWithdrawalResponseDeserialization() throws JsonProcessingException {
        String json = "{"
                + "\"activity_id\":\"act-withdraw-1\","
                + "\"source_symbol\":\"BTC\","
                + "\"destination_symbol\":\"BTC\","
                + "\"amount\":\"0.25\","
                + "\"destination\":\"bc1qexternal\","
                + "\"source\":\"wallet-src\","
                + "\"transaction_id\":\"txn-withdraw-1\""
                + "}";

        CreateWalletWithdrawalResponse response = objectMapper.readValue(json, CreateWalletWithdrawalResponse.class);
        assertNotNull(response);
        assertEquals("act-withdraw-1", response.getActivityId());
        assertEquals("txn-withdraw-1", response.getTransactionId());
    }

    // ==================== ListAdvancedTransferTransactions Tests ====================

    @Test
    public void testListAdvancedTransferTransactionsResponseDeserialization() throws JsonProcessingException {
        String json = "{"
                + "\"transactions\":["
                + "{\"id\":\"txn-at1\",\"type\":\"WITHDRAWAL\",\"status\":\"TRANSACTION_DONE\"}"
                + "],"
                + "\"pagination\":{\"has_next\":false}"
                + "}";

        ListAdvancedTransferTransactionsResponse response = objectMapper.readValue(json, ListAdvancedTransferTransactionsResponse.class);
        assertNotNull(response);
        assertNotNull(response.getTransactions());
        assertEquals(1, response.getTransactions().length);
    }

    // ==================== GetTransactionTravelRuleData Tests ====================

    @Test
    public void testGetTransactionTravelRuleDataResponseDeserialization() throws JsonProcessingException {
        String json = "{"
                + "\"originator_name\":\"John Doe\","
                + "\"originator_account_number\":\"acc-123\","
                + "\"beneficiary_name\":\"Jane Smith\","
                + "\"beneficiary_account_number\":\"acc-456\""
                + "}";

        GetTransactionTravelRuleDataResponse response = objectMapper.readValue(json, GetTransactionTravelRuleDataResponse.class);
        assertNotNull(response);
    }

    // ==================== SubmitDepositTravelRuleData Tests ====================

    @Test
    public void testSubmitDepositTravelRuleDataResponseDeserialization() throws JsonProcessingException {
        String json = "{}";
        SubmitDepositTravelRuleDataResponse response = objectMapper.readValue(json, SubmitDepositTravelRuleDataResponse.class);
        assertNotNull(response);
    }
}
