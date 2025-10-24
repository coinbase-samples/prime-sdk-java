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

package com.coinbase.prime.activities;

import com.coinbase.core.errors.CoinbaseClientException;
import com.coinbase.prime.model.enums.ActivityCategory;
import com.coinbase.prime.model.enums.ActivityLevel;
import com.coinbase.prime.model.enums.ActivityStatus;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ListEntityActivitiesRequestTest {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Test
    public void testBuilderWithEnums() throws CoinbaseClientException {
        // Test that the builder accepts enum types
        ListEntityActivitiesRequest request = new ListEntityActivitiesRequest.Builder("entity-123")
                .activityLevel(ActivityLevel.ACTIVITY_LEVEL_ALL)
                .categories(new ActivityCategory[]{
                        ActivityCategory.ACTIVITY_CATEGORY_ORDER,
                        ActivityCategory.ACTIVITY_CATEGORY_TRANSACTION
                })
                .statuses(new ActivityStatus[]{
                        ActivityStatus.ACTIVITY_STATUS_COMPLETED,
                        ActivityStatus.ACTIVITY_STATUS_PROCESSING
                })
                .symbols(new String[]{"BTC", "ETH"})
                .startTime("2025-01-01T00:00:00Z")
                .endTime("2025-01-31T23:59:59Z")
                .build();

        // Verify the values are set correctly
        assertEquals("entity-123", request.getEntityId());
        assertEquals(ActivityLevel.ACTIVITY_LEVEL_ALL, request.getActivityLevel());
        assertArrayEquals(new ActivityCategory[]{
                ActivityCategory.ACTIVITY_CATEGORY_ORDER,
                ActivityCategory.ACTIVITY_CATEGORY_TRANSACTION
        }, request.getCategories());
        assertArrayEquals(new ActivityStatus[]{
                ActivityStatus.ACTIVITY_STATUS_COMPLETED,
                ActivityStatus.ACTIVITY_STATUS_PROCESSING
        }, request.getStatuses());
        assertArrayEquals(new String[]{"BTC", "ETH"}, request.getSymbols());
        assertEquals("2025-01-01T00:00:00Z", request.getStartTime());
        assertEquals("2025-01-31T23:59:59Z", request.getEndTime());
    }

    @Test
    public void testSettersWithEnums() {
        ListEntityActivitiesRequest request = new ListEntityActivitiesRequest("entity-456");

        // Test that setters accept enum types
        request.setActivityLevel(ActivityLevel.ACTIVITY_LEVEL_PORTFOLIO);
        request.setCategories(new ActivityCategory[]{ActivityCategory.ACTIVITY_CATEGORY_ACCOUNT});
        request.setStatuses(new ActivityStatus[]{ActivityStatus.ACTIVITY_STATUS_FAILED});

        // Verify the values
        assertEquals(ActivityLevel.ACTIVITY_LEVEL_PORTFOLIO, request.getActivityLevel());
        assertArrayEquals(new ActivityCategory[]{ActivityCategory.ACTIVITY_CATEGORY_ACCOUNT}, request.getCategories());
        assertArrayEquals(new ActivityStatus[]{ActivityStatus.ACTIVITY_STATUS_FAILED}, request.getStatuses());
    }

    @Test
    public void testJsonSerialization() throws Exception {
        // Test that enums serialize correctly to JSON
        ListEntityActivitiesRequest request = new ListEntityActivitiesRequest.Builder("entity-789")
                .activityLevel(ActivityLevel.ACTIVITY_LEVEL_ENTITY)
                .categories(new ActivityCategory[]{ActivityCategory.ACTIVITY_CATEGORY_LENDING})
                .statuses(new ActivityStatus[]{ActivityStatus.ACTIVITY_STATUS_CANCELLED})
                .build();

        String json = objectMapper.writeValueAsString(request);

        // Verify the JSON contains the enum constant names
        assertTrue(json.contains("ACTIVITY_LEVEL_ENTITY"));
        assertTrue(json.contains("ACTIVITY_CATEGORY_LENDING"));
        assertTrue(json.contains("ACTIVITY_STATUS_CANCELLED"));
    }

    @Test
    public void testBuilderRequiresEntityId() {
        // Test that validation works
        assertThrows(CoinbaseClientException.class, () -> {
            new ListEntityActivitiesRequest.Builder(null).build();
        });

        assertThrows(CoinbaseClientException.class, () -> {
            new ListEntityActivitiesRequest.Builder("").build();
        });
    }
}

