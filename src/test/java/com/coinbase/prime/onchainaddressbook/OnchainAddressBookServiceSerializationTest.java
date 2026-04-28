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

package com.coinbase.prime.onchainaddressbook;

import com.coinbase.core.errors.CoinbaseClientException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class OnchainAddressBookServiceSerializationTest {

    private ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {
        objectMapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }

    // ==================== CreateOnchainAddressBookEntry Tests ====================

    @Test
    public void testCreateOnchainAddressBookEntryRequestSerialization() throws JsonProcessingException {
        CreateOnchainAddressBookEntryRequest request = new CreateOnchainAddressBookEntryRequest.Builder()
                .portfolioId("portfolio-123")
                .build();

        String json = objectMapper.writeValueAsString(request);
        assertNotNull(json);
        assertFalse(json.contains("portfolio_id"));
    }

    @Test
    public void testCreateOnchainAddressBookEntryResponseDeserialization() throws JsonProcessingException {
        String json = "{"
                + "\"activity_type\":\"ACTIVITY_TYPE_ADDRESS_BOOK\","
                + "\"num_approvals_remaining\":1,"
                + "\"activity_id\":\"act-abc123\""
                + "}";

        CreateOnchainAddressBookEntryResponse response = objectMapper.readValue(json, CreateOnchainAddressBookEntryResponse.class);
        assertNotNull(response);
        assertEquals(1, response.getNumApprovalsRemaining());
        assertEquals("act-abc123", response.getActivityId());
    }

    // ==================== DeleteOnchainAddressGroup Tests ====================

    @Test
    public void testDeleteOnchainAddressGroupRequestConstruction() {
        DeleteOnchainAddressGroupRequest request = new DeleteOnchainAddressGroupRequest.Builder()
                .portfolioId("portfolio-123")
                .addressGroupId("group-456")
                .build();
        assertNotNull(request);
        assertEquals("portfolio-123", request.getPortfolioId());
        assertEquals("group-456", request.getAddressGroupId());
    }

    @Test
    public void testDeleteOnchainAddressGroupResponseDeserialization() throws JsonProcessingException {
        String json = "{"
                + "\"activity_type\":\"ACTIVITY_TYPE_ADDRESS_BOOK\","
                + "\"num_approvals_remaining\":2,"
                + "\"activity_id\":\"act-def456\""
                + "}";

        DeleteOnchainAddressGroupResponse response = objectMapper.readValue(json, DeleteOnchainAddressGroupResponse.class);
        assertNotNull(response);
        assertEquals(2, response.getNumApprovalsRemaining());
        assertEquals("act-def456", response.getActivityId());
    }

    // ==================== ListOnchainAddressGroups Tests ====================

    @Test
    public void testListOnchainAddressGroupsRequestConstruction() throws CoinbaseClientException {
        ListOnchainAddressGroupsRequest request = new ListOnchainAddressGroupsRequest.Builder()
                .portfolioId("portfolio-123")
                .build();
        assertNotNull(request);
        assertEquals("portfolio-123", request.getPortfolioId());
    }

    @Test
    public void testListOnchainAddressGroupsRequestBuilderValidation() {
        assertThrows(CoinbaseClientException.class, () ->
                new ListOnchainAddressGroupsRequest.Builder().build());
    }

    @Test
    public void testListOnchainAddressGroupsResponseDeserialization() throws JsonProcessingException {
        String json = "{"
                + "\"address_groups\":["
                + "{\"id\":\"group-1\",\"name\":\"Hot Wallets\"},"
                + "{\"id\":\"group-2\",\"name\":\"Cold Wallets\"}"
                + "]"
                + "}";

        ListOnchainAddressGroupsResponse response = objectMapper.readValue(json, ListOnchainAddressGroupsResponse.class);
        assertNotNull(response);
        assertNotNull(response.getAddressGroups());
        assertEquals(2, response.getAddressGroups().size());
    }

    // ==================== UpdateOnchainAddressBookEntry Tests ====================

    @Test
    public void testUpdateOnchainAddressBookEntryRequestSerialization() throws JsonProcessingException {
        UpdateOnchainAddressBookEntryRequest request = new UpdateOnchainAddressBookEntryRequest.Builder()
                .portfolioId("portfolio-123")
                .build();

        String json = objectMapper.writeValueAsString(request);
        assertNotNull(json);
        assertFalse(json.contains("portfolio_id"));
    }

    @Test
    public void testUpdateOnchainAddressBookEntryResponseDeserialization() throws JsonProcessingException {
        String json = "{"
                + "\"activity_type\":\"ACTIVITY_TYPE_ADDRESS_BOOK\","
                + "\"num_approvals_remaining\":0,"
                + "\"activity_id\":\"act-ghi789\""
                + "}";

        UpdateOnchainAddressBookEntryResponse response = objectMapper.readValue(json, UpdateOnchainAddressBookEntryResponse.class);
        assertNotNull(response);
        assertEquals(0, response.getNumApprovalsRemaining());
        assertEquals("act-ghi789", response.getActivityId());
    }
}
