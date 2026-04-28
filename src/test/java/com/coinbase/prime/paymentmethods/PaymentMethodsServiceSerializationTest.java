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

package com.coinbase.prime.paymentmethods;

import com.coinbase.core.errors.CoinbaseClientException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PaymentMethodsServiceSerializationTest {

    private ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {
        objectMapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }

    // ==================== ListPaymentMethods Tests ====================

    @Test
    public void testListPaymentMethodsRequestConstruction() throws CoinbaseClientException {
        ListPaymentMethodsRequest request = new ListPaymentMethodsRequest.Builder("entity-123").build();
        assertNotNull(request);
        assertEquals("entity-123", request.getEntityId());
    }

    @Test
    public void testListPaymentMethodsRequestBuilderValidation() {
        assertThrows(CoinbaseClientException.class, () ->
                new ListPaymentMethodsRequest.Builder(null).build());
    }

    @Test
    public void testListPaymentMethodsResponseDeserialization() throws JsonProcessingException {
        String json = "{"
                + "\"payment_methods\":["
                + "{\"id\":\"pm-1\",\"name\":\"Wire Transfer\",\"currency\":\"USD\"},"
                + "{\"id\":\"pm-2\",\"name\":\"ACH Transfer\",\"currency\":\"USD\"}"
                + "]"
                + "}";

        ListPaymentMethodsResponse response = objectMapper.readValue(json, ListPaymentMethodsResponse.class);
        assertNotNull(response);
        assertNotNull(response.getPaymentMethods());
        assertEquals(2, response.getPaymentMethods().length);
        assertEquals("pm-1", response.getPaymentMethods()[0].getId());
    }

    // ==================== GetPaymentMethodDetails Tests ====================

    @Test
    public void testGetPaymentMethodDetailsRequestConstruction() throws CoinbaseClientException {
        GetPaymentMethodDetailsRequest request = new GetPaymentMethodDetailsRequest.Builder()
                .entityId("entity-123")
                .paymentMethodId("pm-456")
                .build();
        assertNotNull(request);
        assertEquals("entity-123", request.getEntityId());
        assertEquals("pm-456", request.getPaymentMethodId());
    }

    @Test
    public void testGetPaymentMethodDetailsRequestBuilderValidation() {
        assertThrows(CoinbaseClientException.class, () ->
                new GetPaymentMethodDetailsRequest.Builder()
                        .paymentMethodId("pm-456")
                        .build());
        assertThrows(CoinbaseClientException.class, () ->
                new GetPaymentMethodDetailsRequest.Builder()
                        .entityId("entity-123")
                        .build());
    }

    @Test
    public void testGetPaymentMethodDetailsResponseDeserialization() throws JsonProcessingException {
        String json = "{"
                + "\"details\":{"
                + "\"id\":\"pm-456\","
                + "\"name\":\"Wire Transfer\","
                + "\"currency\":\"USD\","
                + "\"verified\":true"
                + "}"
                + "}";

        GetPaymentMethodDetailsResponse response = objectMapper.readValue(json, GetPaymentMethodDetailsResponse.class);
        assertNotNull(response);
        assertNotNull(response.getDetails());
        assertEquals("pm-456", response.getDetails().getId());
    }
}
