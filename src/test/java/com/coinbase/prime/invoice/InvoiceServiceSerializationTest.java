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

package com.coinbase.prime.invoice;

import com.coinbase.core.errors.CoinbaseClientException;
import com.coinbase.prime.model.enums.InvoiceState;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class InvoiceServiceSerializationTest {

    private ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {
        objectMapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }

    @Test
    public void testListInvoicesRequestSerialization() throws CoinbaseClientException, JsonProcessingException {
        ListInvoicesRequest request = new ListInvoicesRequest.Builder("entity-123")
                .states(new InvoiceState[]{InvoiceState.INVOICE_STATE_BILLED, InvoiceState.INVOICE_STATE_PAID})
                .billingMonth(1)
                .billingYear(2025)
                .build();

        String json = objectMapper.writeValueAsString(request);
        assertNotNull(json);
        assertTrue(json.contains("\"states\""));
        assertTrue(json.contains("\"billing_month\":1"));
        assertTrue(json.contains("\"billing_year\":2025"));
        assertFalse(json.contains("entity_id"));
    }

    @Test
    public void testListInvoicesRequestBuilderValidation() {
        assertThrows(CoinbaseClientException.class, () ->
                new ListInvoicesRequest.Builder(null).build());
    }

    @Test
    public void testListInvoicesResponseDeserialization() throws JsonProcessingException {
        String json = "{"
                + "\"invoices\":["
                + "{\"id\":\"inv-1\",\"state\":\"INVOICE_STATE_BILLED\",\"billing_month\":1,\"billing_year\":2025},"
                + "{\"id\":\"inv-2\",\"state\":\"INVOICE_STATE_PAID\",\"billing_month\":12,\"billing_year\":2024}"
                + "]"
                + "}";

        ListInvoicesResponse response = objectMapper.readValue(json, ListInvoicesResponse.class);
        assertNotNull(response);
        assertNotNull(response.getInvoices());
        assertEquals(2, response.getInvoices().length);
        assertEquals("inv-1", response.getInvoices()[0].getId());
    }
}
