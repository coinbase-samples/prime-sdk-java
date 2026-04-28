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

package com.coinbase.prime.users;

import com.coinbase.core.errors.CoinbaseClientException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UsersServiceSerializationTest {

    private ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {
        objectMapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }

    // ==================== ListEntityUsers Tests ====================

    @Test
    public void testListEntityUsersRequestConstruction() throws CoinbaseClientException {
        ListEntityUsersRequest request = new ListEntityUsersRequest.Builder("entity-123").build();
        assertNotNull(request);
        assertEquals("entity-123", request.getEntityId());
    }

    @Test
    public void testListEntityUsersRequestBuilderValidation() {
        assertThrows(CoinbaseClientException.class, () ->
                new ListEntityUsersRequest.Builder(null).build());
    }

    @Test
    public void testListEntityUsersResponseDeserialization() throws JsonProcessingException {
        String json = "{"
                + "\"users\":["
                + "{\"id\":\"user-1\",\"name\":\"Alice Smith\",\"role\":\"ADMIN\"},"
                + "{\"id\":\"user-2\",\"name\":\"Bob Jones\",\"role\":\"AUDITOR\"}"
                + "],"
                + "\"pagination\":{\"has_next\":false}"
                + "}";

        ListEntityUsersResponse response = objectMapper.readValue(json, ListEntityUsersResponse.class);
        assertNotNull(response);
        assertNotNull(response.getUsers());
        assertEquals(2, response.getUsers().length);
        assertEquals("user-1", response.getUsers()[0].getId());
    }

    // ==================== ListPortfolioUsers Tests ====================

    @Test
    public void testListPortfolioUsersRequestConstruction() throws CoinbaseClientException {
        ListPortfolioUsersRequest request = new ListPortfolioUsersRequest.Builder()
                .portfolioId("portfolio-123")
                .build();
        assertNotNull(request);
        assertEquals("portfolio-123", request.getPortfolioId());
    }

    @Test
    public void testListPortfolioUsersRequestBuilderValidation() {
        assertThrows(CoinbaseClientException.class, () ->
                new ListPortfolioUsersRequest.Builder().build());
    }

    @Test
    public void testListPortfolioUsersResponseDeserialization() throws JsonProcessingException {
        String json = "{"
                + "\"users\":["
                + "{\"id\":\"user-3\",\"name\":\"Carol White\",\"role\":\"TRADER\"},"
                + "{\"id\":\"user-4\",\"name\":\"Dave Brown\",\"role\":\"AUDITOR\"}"
                + "],"
                + "\"pagination\":{\"next_cursor\":\"user-cursor\",\"has_next\":true}"
                + "}";

        ListPortfolioUsersResponse response = objectMapper.readValue(json, ListPortfolioUsersResponse.class);
        assertNotNull(response);
        assertNotNull(response.getUsers());
        assertEquals(2, response.getUsers().length);
        assertNotNull(response.getPagination());
    }
}
