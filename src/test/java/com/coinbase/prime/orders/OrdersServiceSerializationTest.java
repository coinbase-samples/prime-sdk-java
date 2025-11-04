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

package com.coinbase.prime.orders;

import com.coinbase.core.errors.CoinbaseClientException;
import com.coinbase.prime.model.*;
import com.coinbase.prime.model.enums.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Comprehensive unit tests for Orders service serialization/deserialization
 * Tests ensure core version upgrade maintains compatibility
 */
public class OrdersServiceSerializationTest {

    private ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {
        objectMapper = new ObjectMapper();
    }

    // ==================== CreateOrder Tests ====================

    @Test
    public void testCreateOrderRequestSerialization() throws CoinbaseClientException, JsonProcessingException {
        CreateOrderRequest request = new CreateOrderRequest.Builder()
                .portfolioId("test-portfolio-id")
                .productId("BTC-USD")
                .side(OrderSide.BUY)
                .type(OrderType.MARKET)
                .baseQuantity("0.001")
                .timeInForce(TimeInForceType.GOOD_UNTIL_DATE_TIME)
                .clientOrderId("client-order-123")
                .build();

        String json = objectMapper.writeValueAsString(request);

        assertNotNull(json);
        assertTrue(json.contains("\"product_id\":\"BTC-USD\""));
        assertTrue(json.contains("\"side\":\"BUY\""));
        assertTrue(json.contains("\"type\":\"MARKET\""));
        assertTrue(json.contains("\"base_quantity\":\"0.001\""));
        assertTrue(json.contains("\"time_in_force\":\"GOOD_UNTIL_DATE_TIME\""));
        assertFalse(json.contains("portfolio_id")); // Should be ignored
    }

    @Test
    public void testCreateOrderResponseDeserialization() throws JsonProcessingException {
        String json = "{\"order_id\":\"order-12345\"}";

        CreateOrderResponse response = objectMapper.readValue(json, CreateOrderResponse.class);

        assertNotNull(response);
        assertEquals("order-12345", response.getOrderId());
    }

    // ==================== GetOrderPreview Tests ====================

    @Test
    public void testGetOrderPreviewRequestSerialization() throws CoinbaseClientException, JsonProcessingException {
        GetOrderPreviewRequest request = new GetOrderPreviewRequest.Builder()
                .portfolioId("test-portfolio-id")
                .productId("ETH-USD")
                .side(OrderSide.SELL)
                .type(OrderType.LIMIT)
                .baseQuantity("1.5")
                .limitPrice("3000.00")
                .timeInForce(TimeInForceType.GOOD_UNTIL_CANCELLED)
                .build();

        String json = objectMapper.writeValueAsString(request);

        assertNotNull(json);
        assertTrue(json.contains("\"product_id\":\"ETH-USD\""));
        assertTrue(json.contains("\"side\":\"SELL\""));
        assertTrue(json.contains("\"type\":\"LIMIT\""));
        assertTrue(json.contains("\"base_quantity\":\"1.5\""));
        assertTrue(json.contains("\"limit_price\":\"3000.00\""));
    }

    @Test
    public void testGetOrderPreviewResponseDeserialization() throws JsonProcessingException {
        String json = "{"
                + "\"portfolio_id\":\"portfolio-123\","
                + "\"product_id\":\"BTC-USD\","
                + "\"side\":\"BUY\","
                + "\"type\":\"MARKET\","
                + "\"base_quantity\":\"0.5\","
                + "\"quote_value\":\"25000.00\","
                + "\"commission\":\"25.00\","
                + "\"slippage\":\"10.00\","
                + "\"best_bid\":\"49900.00\","
                + "\"best_ask\":\"50000.00\","
                + "\"average_filled_price\":\"49950.00\","
                + "\"order_total\":\"25035.00\""
                + "}";

        GetOrderPreviewResponse response = objectMapper.readValue(json, GetOrderPreviewResponse.class);

        assertNotNull(response);
        assertEquals("portfolio-123", response.getPortfolioId());
        assertEquals("BTC-USD", response.getProductId());
        assertEquals(OrderSide.BUY, response.getSide());
        assertEquals(OrderType.MARKET, response.getType());
        assertEquals("0.5", response.getBaseQuantity());
        assertEquals("25000.00", response.getQuoteValue());
        assertEquals("25.00", response.getCommission());
        assertEquals("10.00", response.getSlippage());
        assertEquals("49900.00", response.getBestBid());
        assertEquals("50000.00", response.getBestAsk());
        assertEquals("49950.00", response.getAverageFilledPrice());
        assertEquals("25035.00", response.getOrderTotal());
    }

    // ==================== ListOpenOrders Tests ====================

    @Test
    public void testListOpenOrdersRequestSerialization() throws CoinbaseClientException, JsonProcessingException {
        ListOpenOrdersRequest request = new ListOpenOrdersRequest.Builder()
                .portfolioId("test-portfolio-id")
                .productIds(new String[]{"BTC-USD"})
                .orderSide(OrderSide.BUY)
                .limit(50)
                .build();

        String json = objectMapper.writeValueAsString(request);

        assertNotNull(json);
        assertTrue(json.contains("\"product_ids\""));
        assertTrue(json.contains("\"order_side\":\"BUY\""));
    }

    @Test
    public void testListOpenOrdersResponseDeserialization() throws JsonProcessingException {
        String json = "{"
                + "\"orders\":["
                + "{\"id\":\"order-1\",\"product_id\":\"BTC-USD\",\"side\":\"BUY\",\"type\":\"LIMIT\"},"
                + "{\"id\":\"order-2\",\"product_id\":\"ETH-USD\",\"side\":\"SELL\",\"type\":\"MARKET\"}"
                + "],"
                + "\"pagination\":{\"next_cursor\":\"next-123\",\"has_next\":true}"
                + "}";

        ListOpenOrdersResponse response = objectMapper.readValue(json, ListOpenOrdersResponse.class);

        assertNotNull(response);
        assertNotNull(response.getOrders());
        assertEquals(2, response.getOrders().length);
        assertEquals("order-1", response.getOrders()[0].getId());
        assertEquals("order-2", response.getOrders()[1].getId());
    }

    // ==================== ListPortfolioOrders Tests ====================

    @Test
    public void testListPortfolioOrdersRequestSerialization() throws CoinbaseClientException, JsonProcessingException {
        ListPortfolioOrdersRequest request = new ListPortfolioOrdersRequest.Builder()
                .portfolioId("test-portfolio-id")
                .productIds(new String[]{"BTC-USD", "ETH-USD"})
                .orderStatuses(new OrderStatus[]{OrderStatus.OPEN, OrderStatus.FILLED})
                .limit(100)
                .build();

        String json = objectMapper.writeValueAsString(request);

        assertNotNull(json);
        assertTrue(json.contains("\"product_ids\""));
        assertTrue(json.contains("\"order_statuses\""));
    }

    @Test
    public void testListPortfolioOrdersResponseDeserialization() throws JsonProcessingException {
        String json = "{"
                + "\"orders\":["
                + "{\"id\":\"order-1\",\"product_id\":\"BTC-USD\",\"side\":\"BUY\"},"
                + "{\"id\":\"order-2\",\"product_id\":\"ETH-USD\",\"side\":\"SELL\"}"
                + "],"
                + "\"pagination\":{\"next_cursor\":\"cursor-456\",\"has_next\":false}"
                + "}";

        ListPortfolioOrdersResponse response = objectMapper.readValue(json, ListPortfolioOrdersResponse.class);

        assertNotNull(response);
        assertNotNull(response.getOrders());
        assertEquals(2, response.getOrders().length);
    }

    // ==================== GetOrderByOrderId Tests ====================

    @Test
    public void testGetOrderByOrderIdRequestCreation() throws CoinbaseClientException {
        GetOrderByOrderIdRequest request = new GetOrderByOrderIdRequest.Builder()
                .portfolioId("portfolio-123")
                .orderId("order-456")
                .build();

        assertNotNull(request);
        assertEquals("portfolio-123", request.getPortfolioId());
        assertEquals("order-456", request.getOrderId());
    }

    @Test
    public void testGetOrderByOrderIdResponseDeserialization() throws JsonProcessingException {
        String json = "{"
                + "\"order\":{"
                + "\"id\":\"order-123\","
                + "\"product_id\":\"BTC-USD\","
                + "\"side\":\"BUY\","
                + "\"type\":\"LIMIT\","
                + "\"base_quantity\":\"0.5\","
                + "\"quote_value\":\"25000.00\","
                + "\"limit_price\":\"50000.00\","
                + "\"status\":\"OPEN\""
                + "}"
                + "}";

        GetOrderByOrderIdResponse response = objectMapper.readValue(json, GetOrderByOrderIdResponse.class);

        assertNotNull(response);
        assertNotNull(response.getOrder());
        assertEquals("order-123", response.getOrder().getId());
        assertEquals("BTC-USD", response.getOrder().getProductId());
        assertEquals(OrderSide.BUY, response.getOrder().getSide());
    }

    // ==================== CancelOrder Tests ====================

    @Test
    public void testCancelOrderRequestCreation() throws CoinbaseClientException {
        CancelOrderRequest request = new CancelOrderRequest.Builder()
                .portfolioId("portfolio-123")
                .orderId("order-789")
                .build();

        assertNotNull(request);
        assertEquals("portfolio-123", request.getPortfolioId());
        assertEquals("order-789", request.getOrderId());
    }

    @Test
    public void testCancelOrderResponseDeserialization() throws JsonProcessingException {
        String json = "{\"order_id\":\"order-789\"}";

        CancelOrderResponse response = objectMapper.readValue(json, CancelOrderResponse.class);

        assertNotNull(response);
        assertEquals("order-789", response.getId());
    }

    // ==================== ListOrderFills Tests ====================

    @Test
    public void testListOrderFillsRequestSerialization() throws CoinbaseClientException, JsonProcessingException {
        ListOrderFillsRequest request = new ListOrderFillsRequest.Builder()
                .portfolioId("portfolio-123")
                .orderId("order-456")
                .limit(25)
                .build();

        String json = objectMapper.writeValueAsString(request);

        assertNotNull(json);
        // portfolioId and orderId should be ignored as they're path params
    }

    @Test
    public void testListOrderFillsResponseDeserialization() throws JsonProcessingException {
        String json = "{"
                + "\"fills\":["
                + "{\"id\":\"fill-1\",\"order_id\":\"order-123\",\"product_id\":\"BTC-USD\",\"side\":\"BUY\",\"filled_quantity\":\"0.25\",\"price\":\"50000.00\"},"
                + "{\"id\":\"fill-2\",\"order_id\":\"order-123\",\"product_id\":\"BTC-USD\",\"side\":\"BUY\",\"filled_quantity\":\"0.25\",\"price\":\"49950.00\"}"
                + "],"
                + "\"pagination\":{\"next_cursor\":\"fill-cursor\",\"has_next\":false}"
                + "}";

        ListOrderFillsResponse response = objectMapper.readValue(json, ListOrderFillsResponse.class);

        assertNotNull(response);
        assertNotNull(response.getFills());
        assertEquals(2, response.getFills().length);
        assertEquals("fill-1", response.getFills()[0].getId());
        assertEquals("fill-2", response.getFills()[1].getId());
    }

    // ==================== ListPortfolioFills Tests ====================

    @Test
    public void testListPortfolioFillsRequestSerialization() throws CoinbaseClientException, JsonProcessingException {
        ListPortfolioFillsRequest request = new ListPortfolioFillsRequest.Builder()
                .portfolioId("portfolio-123")
                .startDate("2024-01-01")
                .endDate("2024-12-31")
                .limit(100)
                .build();

        String json = objectMapper.writeValueAsString(request);

        assertNotNull(json);
        // portfolioId, startDate, endDate are ignored per @JsonIgnore
    }

    @Test
    public void testListPortfolioFillsResponseDeserialization() throws JsonProcessingException {
        String json = "{"
                + "\"fills\":["
                + "{\"id\":\"fill-1\",\"product_id\":\"BTC-USD\",\"filled_quantity\":\"0.5\"},"
                + "{\"id\":\"fill-2\",\"product_id\":\"ETH-USD\",\"filled_quantity\":\"2.0\"}"
                + "],"
                + "\"pagination\":{\"has_next\":true}"
                + "}";

        ListPortfolioFillsResponse response = objectMapper.readValue(json, ListPortfolioFillsResponse.class);

        assertNotNull(response);
        assertNotNull(response.getFills());
        assertEquals(2, response.getFills().length);
    }

    // ==================== CreateQuote Tests ====================

    @Test
    public void testCreateQuoteRequestSerialization() throws CoinbaseClientException, JsonProcessingException {
        CreateQuoteRequest request = new CreateQuoteRequest.Builder()
                .portfolioId("portfolio-123")
                .productId("BTC-USD")
                .side(OrderSide.BUY)
                .clientQuoteId("client-quote-123")
                .baseQuantity("1.0")
                .limitPrice("50000.00")
                .build();

        String json = objectMapper.writeValueAsString(request);

        assertNotNull(json);
        assertTrue(json.contains("\"product_id\":\"BTC-USD\""));
        assertTrue(json.contains("\"side\":\"BUY\""));
        assertTrue(json.contains("\"base_quantity\":\"1.0\""));
    }

    @Test
    public void testCreateQuoteResponseDeserialization() throws JsonProcessingException {
        String json = "{"
                + "\"quote_id\":\"quote-123\","
                + "\"expiration_time\":\"2024-12-31T23:59:59Z\","
                + "\"best_price\":\"50000.00\","
                + "\"order_total\":\"50050.00\","
                + "\"price_inclusive_of_fees\":\"50100.00\""
                + "}";

        CreateQuoteResponse response = objectMapper.readValue(json, CreateQuoteResponse.class);

        assertNotNull(response);
        assertEquals("quote-123", response.getQuoteId());
        assertEquals("50000.00", response.getBestPrice());
        assertEquals("50050.00", response.getOrderTotal());
    }

    // ==================== AcceptQuote Tests ====================

    @Test
    public void testAcceptQuoteRequestSerialization() throws CoinbaseClientException, JsonProcessingException {
        AcceptQuoteRequest request = new AcceptQuoteRequest.Builder()
                .portfolioId("portfolio-123")
                .productId("BTC-USD")
                .side(OrderSide.BUY)
                .clientOrderId("client-order-789")
                .quoteId("quote-456")
                .build();

        String json = objectMapper.writeValueAsString(request);

        assertNotNull(json);
        assertTrue(json.contains("\"quote_id\":\"quote-456\""));
    }

    @Test
    public void testAcceptQuoteResponseDeserialization() throws JsonProcessingException {
        String json = "{"
                + "\"order_id\":\"order-from-quote\""
                + "}";

        AcceptQuoteResponse response = objectMapper.readValue(json, AcceptQuoteResponse.class);

        assertNotNull(response);
        assertEquals("order-from-quote", response.getOrderId());
    }

    // ==================== EditOrder Tests ====================

    @Test
    public void testEditOrderRequestSerialization() throws CoinbaseClientException, JsonProcessingException {
        EditOrderRequest request = new EditOrderRequest.Builder()
                .portfolioId("portfolio-123")
                .orderId("order-789")
                .origClientOrderId("orig-client-order-123")
                .clientOrderId("client-order-456")
                .baseQuantity("1.5")
                .limitPrice("51000.00")
                .build();

        String json = objectMapper.writeValueAsString(request);

        assertNotNull(json);
        assertTrue(json.contains("\"base_quantity\":\"1.5\""));
        assertTrue(json.contains("\"limit_price\":\"51000.00\""));
    }

    @Test
    public void testEditOrderResponseDeserialization() throws JsonProcessingException {
        String json = "{"
                + "\"order_id\":\"order-789\""
                + "}";

        EditOrderResponse response = objectMapper.readValue(json, EditOrderResponse.class);

        assertNotNull(response);
        assertEquals("order-789", response.getOrderId());
    }

    // ==================== ListOrderEditHistory Tests ====================

    @Test
    public void testListOrderEditHistoryRequestCreation() throws CoinbaseClientException {
        ListOrderEditHistoryRequest request = new ListOrderEditHistoryRequest.Builder()
                .portfolioId("portfolio-123")
                .orderId("order-456")
                .build();

        assertNotNull(request);
        assertEquals("portfolio-123", request.getPortfolioId());
        assertEquals("order-456", request.getOrderId());
    }

    @Test
    public void testListOrderEditHistoryResponseDeserialization() throws JsonProcessingException {
        String json = "{"
                + "\"order_id\":\"order-456\","
                + "\"edit_history\":["
                + "{\"base_quantity\":\"1.0\",\"price\":\"50000.00\"},"
                + "{\"base_quantity\":\"1.5\",\"price\":\"51000.00\"}"
                + "]"
                + "}";

        ListOrderEditHistoryResponse response = objectMapper.readValue(json, ListOrderEditHistoryResponse.class);

        assertNotNull(response);
        assertEquals("order-456", response.getOrderId());
        assertNotNull(response.getEditHistory());
        assertEquals(2, response.getEditHistory().size());
    }

    // ==================== Builder Validation Tests ====================

    @Test
    public void testCreateOrderRequestBuilderValidation() {
        CreateOrderRequest.Builder builder = new CreateOrderRequest.Builder()
                .productId("BTC-USD")
                .side(OrderSide.BUY)
                .type(OrderType.MARKET);

        assertThrows(CoinbaseClientException.class, builder::build);
    }

    @Test
    public void testGetOrderPreviewRequestBuilderValidation() {
        GetOrderPreviewRequest.Builder builder = new GetOrderPreviewRequest.Builder()
                .productId("ETH-USD")
                .side(OrderSide.SELL);

        assertThrows(CoinbaseClientException.class, builder::build);
    }
}
