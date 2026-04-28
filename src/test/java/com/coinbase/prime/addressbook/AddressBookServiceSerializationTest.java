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

package com.coinbase.prime.addressbook;

import com.coinbase.core.errors.CoinbaseClientException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AddressBookServiceSerializationTest {

    private ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {
        objectMapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }

    // ==================== ListAddressBook Tests ====================

    @Test
    public void testListAddressBookRequestSerialization() throws CoinbaseClientException, JsonProcessingException {
        ListAddressBookRequest request = new ListAddressBookRequest.Builder("portfolio-123")
                .currencySymbol("BTC")
                .search("my-address")
                .build();

        String json = objectMapper.writeValueAsString(request);
        assertNotNull(json);
        assertTrue(json.contains("\"currency_symbol\":\"BTC\""));
        assertTrue(json.contains("\"search\":\"my-address\""));
        assertFalse(json.contains("portfolio_id"));
    }

    @Test
    public void testListAddressBookRequestBuilderValidation() {
        assertThrows(CoinbaseClientException.class, () ->
                new ListAddressBookRequest.Builder(null).build());
    }

    @Test
    public void testListAddressBookResponseDeserialization() throws JsonProcessingException {
        String json = "{"
                + "\"addresses\":["
                + "{\"id\":\"addr-1\",\"address\":\"bc1qxy2kgdygjrsqtzq2n0yrf2\",\"currency_symbol\":\"BTC\"},"
                + "{\"id\":\"addr-2\",\"address\":\"0xabc123\",\"currency_symbol\":\"ETH\"}"
                + "],"
                + "\"pagination\":{\"next_cursor\":\"cursor-abc\",\"has_next\":false}"
                + "}";

        ListAddressBookResponse response = objectMapper.readValue(json, ListAddressBookResponse.class);
        assertNotNull(response);
        assertNotNull(response.getAddresses());
        assertEquals(2, response.getAddresses().length);
        assertEquals("addr-1", response.getAddresses()[0].getId());
    }

    // ==================== CreateAddressBookEntry Tests ====================

    @Test
    public void testCreateAddressBookEntryRequestSerialization() throws CoinbaseClientException, JsonProcessingException {
        CreateAddressBookEntryRequest request = new CreateAddressBookEntryRequest.Builder("portfolio-123")
                .address("bc1qxy2kgdygjrsqtzq2n0yrf2")
                .currencySymbol("BTC")
                .name("My Bitcoin Address")
                .accountIdentifier("memo-123")
                .build();

        String json = objectMapper.writeValueAsString(request);
        assertNotNull(json);
        assertTrue(json.contains("\"address\":\"bc1qxy2kgdygjrsqtzq2n0yrf2\""));
        assertTrue(json.contains("\"currency_symbol\":\"BTC\""));
        assertTrue(json.contains("\"name\":\"My Bitcoin Address\""));
        assertTrue(json.contains("\"account_identifier\":\"memo-123\""));
        assertFalse(json.contains("portfolio_id"));
    }

    @Test
    public void testCreateAddressBookEntryRequestBuilderValidation() {
        assertThrows(CoinbaseClientException.class, () ->
                new CreateAddressBookEntryRequest.Builder("portfolio-123")
                        .address("bc1q")
                        .currencySymbol("BTC")
                        .build());

        assertThrows(CoinbaseClientException.class, () ->
                new CreateAddressBookEntryRequest.Builder("portfolio-123")
                        .currencySymbol("BTC")
                        .name("name")
                        .build());
    }

    @Test
    public void testCreateAddressBookEntryResponseDeserialization() throws JsonProcessingException {
        String json = "{"
                + "\"activity_type\":\"ACTIVITY_TYPE_ADDRESS_BOOK\","
                + "\"num_approvals_remaining\":2,"
                + "\"activity_id\":\"act-abc123\""
                + "}";

        CreateAddressBookEntryResponse response = objectMapper.readValue(json, CreateAddressBookEntryResponse.class);
        assertNotNull(response);
        assertEquals(2, response.getNumApprovalsRemaining());
        assertEquals("act-abc123", response.getActivityId());
    }
}
