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
import com.coinbase.prime.model.enums.TimeInForceType;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests enum deserialization behavior, particularly for unknown values
 * Verifies SDK properly handles REST API enum responses
 */
public class EnumDeserializationTest {

    private ObjectMapper strictMapper;
    private ObjectMapper lenientMapper;

    @BeforeEach
    public void setUp() {
        // Strict mapper - fails on unknown enum values (default behavior)
        strictMapper = new ObjectMapper();
        strictMapper.registerModule(new JavaTimeModule());

        // Lenient mapper - allows unknown enum values
        lenientMapper = new ObjectMapper();
        lenientMapper.registerModule(new JavaTimeModule());
        lenientMapper.configure(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL, true);
    }

    @Test
    public void testKnownTimeInForceValues() throws JsonProcessingException {
        String[] validValues = {
            "GOOD_UNTIL_DATE_TIME",
            "GOOD_UNTIL_CANCELLED",
            "IMMEDIATE_OR_CANCEL",
            "FILL_OR_KILL"
        };

        for (String value : validValues) {
            String json = String.format("{\"id\":\"order-123\",\"time_in_force\":\"%s\"}", value);
            Order order = strictMapper.readValue(json, Order.class);
            assertNotNull(order);
            assertNotNull(order.getTimeInForce(), "TimeInForce should not be null for: " + value);
        }
    }

    @Test
    public void testUnknownTimeInForceWithStrictMapper() {
        // For REST API, unknown values should throw exception by default
        String json = "{\"id\":\"order-123\",\"time_in_force\":\"UNKNOWN_TIME_IN_FORCE\"}";

        assertThrows(InvalidFormatException.class, () -> {
            strictMapper.readValue(json, Order.class);
        }, "Strict mapper should throw exception for unknown enum values");
    }

    @Test
    public void testUnknownTimeInForceWithLenientMapper() throws JsonProcessingException {
        // Lenient mapper converts unknown values to null
        String json = "{\"id\":\"order-123\",\"time_in_force\":\"UNKNOWN_TIME_IN_FORCE\"}";

        Order order = lenientMapper.readValue(json, Order.class);

        assertNotNull(order);
        assertNull(order.getTimeInForce(), "Unknown enum value should be null with lenient mapper");
    }

    @Test
    public void testNullTimeInForce() throws JsonProcessingException {
        String json = "{\"id\":\"order-123\",\"time_in_force\":null}";

        Order order = strictMapper.readValue(json, Order.class);

        assertNotNull(order);
        assertNull(order.getTimeInForce());
    }

    @Test
    public void testMissingTimeInForce() throws JsonProcessingException {
        String json = "{\"id\":\"order-123\",\"product_id\":\"BTC-USD\"}";

        Order order = strictMapper.readValue(json, Order.class);

        assertNotNull(order);
        assertNull(order.getTimeInForce());
    }

    @Test
    public void testTimeInForceSerialization() throws JsonProcessingException {
        Order order = new Order();
        order.setId("order-456");
        order.setTimeInForce(TimeInForceType.GOOD_UNTIL_CANCELLED);

        String json = strictMapper.writeValueAsString(order);

        assertNotNull(json);
        assertTrue(json.contains("\"time_in_force\":\"GOOD_UNTIL_CANCELLED\""));
    }

    @Test
    public void testCaseSensitiveTimeInForce() {
        // Enum values are case-sensitive
        String json = "{\"id\":\"order-123\",\"time_in_force\":\"good_until_cancelled\"}";

        assertThrows(InvalidFormatException.class, () -> {
            strictMapper.readValue(json, Order.class);
        }, "Lowercase enum values should fail");
    }
}