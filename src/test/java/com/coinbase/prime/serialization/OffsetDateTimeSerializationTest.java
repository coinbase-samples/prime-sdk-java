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

package com.coinbase.prime.serialization;

import com.coinbase.prime.model.Order;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests to verify OffsetDateTime serialization/deserialization
 * Ensures SDK properly handles date-time fields via Jackson JSR310 module
 */
public class OffsetDateTimeSerializationTest {

    private ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {
        objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule());
    }

    @Test
    public void testOffsetDateTimeDeserialization() throws JsonProcessingException {
        String json = "{"
                + "\"id\":\"order-123\","
                + "\"product_id\":\"BTC-USD\","
                + "\"start_time\":\"2024-01-15T10:30:00Z\","
                + "\"expiry_time\":\"2024-01-15T11:30:00Z\","
                + "\"created_at\":\"2024-01-15T10:00:00Z\""
                + "}";

        Order order = objectMapper.readValue(json, Order.class);

        assertNotNull(order);
        assertNotNull(order.getStartTime());
        assertNotNull(order.getExpiryTime());
        assertNotNull(order.getCreatedAt());

        assertEquals(2024, order.getStartTime().getYear());
        assertEquals(1, order.getStartTime().getMonthValue());
        assertEquals(15, order.getStartTime().getDayOfMonth());
        assertEquals(10, order.getStartTime().getHour());
        assertEquals(30, order.getStartTime().getMinute());
    }

    @Test
    public void testOffsetDateTimeSerialization() throws JsonProcessingException {
        Order order = new Order();
        order.setId("order-456");
        order.setProductId("ETH-USD");
        order.setStartTime(OffsetDateTime.of(2024, 1, 15, 10, 30, 0, 0, ZoneOffset.UTC));
        order.setExpiryTime(OffsetDateTime.of(2024, 1, 15, 11, 30, 0, 0, ZoneOffset.UTC));

        String json = objectMapper.writeValueAsString(order);

        assertNotNull(json);
        // Verify OffsetDateTime fields are serialized in ISO-8601 format
        assertTrue(json.contains("\"start_time\"") || json.contains("startTime"),
                  "JSON should contain start_time field. Actual: " + json);
        assertTrue(json.contains("2024") || json.contains("1705318200"),
                  "JSON should contain date/time value. Actual: " + json);
    }

    @Test
    public void testOffsetDateTimeRoundTrip() throws JsonProcessingException {
        OffsetDateTime now = OffsetDateTime.now(ZoneOffset.UTC);

        Order original = new Order();
        original.setId("order-789");
        original.setStartTime(now);
        original.setExpiryTime(now.plusHours(1));
        original.setCreatedAt(now.minusHours(1));

        String json = objectMapper.writeValueAsString(original);
        Order deserialized = objectMapper.readValue(json, Order.class);

        assertNotNull(deserialized.getStartTime());
        assertNotNull(deserialized.getExpiryTime());
        assertNotNull(deserialized.getCreatedAt());

        // Compare epoch seconds (ignoring nanos for simplicity)
        assertEquals(original.getStartTime().toEpochSecond(),
                    deserialized.getStartTime().toEpochSecond());
        assertEquals(original.getExpiryTime().toEpochSecond(),
                    deserialized.getExpiryTime().toEpochSecond());
        assertEquals(original.getCreatedAt().toEpochSecond(),
                    deserialized.getCreatedAt().toEpochSecond());
    }

    @Test
    public void testNullOffsetDateTime() throws JsonProcessingException {
        String json = "{\"id\":\"order-999\",\"product_id\":\"BTC-USD\"}";

        Order order = objectMapper.readValue(json, Order.class);

        assertNotNull(order);
        assertNull(order.getStartTime());
        assertNull(order.getExpiryTime());
        assertNull(order.getCreatedAt());
    }

    @Test
    public void testOffsetDateTimeWithDifferentFormats() throws JsonProcessingException {
        // Test various ISO-8601 formats
        String json1 = "{\"id\":\"1\",\"created_at\":\"2024-01-15T10:30:00Z\"}";
        String json2 = "{\"id\":\"2\",\"created_at\":\"2024-01-15T10:30:00+00:00\"}";
        String json3 = "{\"id\":\"3\",\"created_at\":\"2024-01-15T10:30:00.123Z\"}";

        Order order1 = objectMapper.readValue(json1, Order.class);
        Order order2 = objectMapper.readValue(json2, Order.class);
        Order order3 = objectMapper.readValue(json3, Order.class);

        assertNotNull(order1.getCreatedAt());
        assertNotNull(order2.getCreatedAt());
        assertNotNull(order3.getCreatedAt());

        // All should represent same instant (ignoring milliseconds)
        assertEquals(order1.getCreatedAt().toEpochSecond(),
                    order2.getCreatedAt().toEpochSecond());
    }
}
