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

package com.coinbase.prime.activities;

import com.coinbase.core.errors.CoinbaseClientException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ActivitiesServiceSerializationTest {

    private ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {
        objectMapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }

    // ==================== GetActivity Tests ====================

    @Test
    public void testGetActivityRequestConstruction() {
        GetActivityRequest request = new GetActivityRequest("activity-123");
        assertNotNull(request);
        assertEquals("activity-123", request.getActivityId());
    }

    @Test
    public void testGetActivityResponseDeserialization() throws JsonProcessingException {
        String json = "{"
                + "\"activity\":{"
                + "\"id\":\"activity-123\","
                + "\"category\":\"ACTIVITY_CATEGORY_ORDER\","
                + "\"status\":\"ACTIVITY_STATUS_COMPLETED\""
                + "}"
                + "}";

        GetActivityResponse response = objectMapper.readValue(json, GetActivityResponse.class);
        assertNotNull(response);
        assertNotNull(response.getActivity());
        assertEquals("activity-123", response.getActivity().getId());
    }

    // ==================== GetPortfolioActivity Tests ====================

    @Test
    public void testGetPortfolioActivityRequestConstruction() throws CoinbaseClientException {
        GetPortfolioActivityRequest request = new GetPortfolioActivityRequest.Builder()
                .portfolioId("portfolio-123")
                .activityId("activity-456")
                .build();
        assertNotNull(request);
        assertEquals("portfolio-123", request.getPortfolioId());
        assertEquals("activity-456", request.getActivityId());
    }

    @Test
    public void testGetPortfolioActivityRequestBuilderValidation() {
        assertThrows(CoinbaseClientException.class, () ->
                new GetPortfolioActivityRequest.Builder()
                        .activityId("activity-456")
                        .build());

        assertThrows(CoinbaseClientException.class, () ->
                new GetPortfolioActivityRequest.Builder()
                        .portfolioId("portfolio-123")
                        .build());
    }

    @Test
    public void testGetPortfolioActivityResponseDeserialization() throws JsonProcessingException {
        String json = "{"
                + "\"activity\":{"
                + "\"id\":\"activity-789\","
                + "\"category\":\"ACTIVITY_CATEGORY_TRANSACTION\","
                + "\"status\":\"ACTIVITY_STATUS_PROCESSING\""
                + "}"
                + "}";

        GetPortfolioActivityResponse response = objectMapper.readValue(json, GetPortfolioActivityResponse.class);
        assertNotNull(response);
        assertNotNull(response.getActivity());
        assertEquals("activity-789", response.getActivity().getId());
    }

    // ==================== ListPortfolioActivities Tests ====================

    @Test
    public void testListPortfolioActivitiesRequestConstruction() throws CoinbaseClientException {
        ListPortfolioActivitiesRequest request = new ListPortfolioActivitiesRequest.Builder("portfolio-123")
                .symbols(new String[]{"BTC", "ETH"})
                .startTime("2025-01-01T00:00:00Z")
                .endTime("2025-12-31T23:59:59Z")
                .build();
        assertNotNull(request);
        assertEquals("portfolio-123", request.getPortfolioId());
    }

    @Test
    public void testListPortfolioActivitiesRequestBuilderValidation() {
        assertThrows(CoinbaseClientException.class, () ->
                new ListPortfolioActivitiesRequest.Builder(null).build());
    }

    @Test
    public void testListPortfolioActivitiesResponseDeserialization() throws JsonProcessingException {
        String json = "{"
                + "\"activities\":["
                + "{\"id\":\"act-1\",\"category\":\"ACTIVITY_CATEGORY_ORDER\"},"
                + "{\"id\":\"act-2\",\"category\":\"ACTIVITY_CATEGORY_TRANSACTION\"}"
                + "],"
                + "\"pagination\":{\"next_cursor\":\"cursor-123\",\"has_next\":true}"
                + "}";

        ListPortfolioActivitiesResponse response = objectMapper.readValue(json, ListPortfolioActivitiesResponse.class);
        assertNotNull(response);
        assertNotNull(response.getActivities());
        assertEquals(2, response.getActivities().length);
        assertEquals("act-1", response.getActivities()[0].getId());
    }
}
