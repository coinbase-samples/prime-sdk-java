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

package com.coinbase.prime.integration;

import com.coinbase.prime.activities.*;
import com.coinbase.prime.factory.PrimeServiceFactory;
import com.coinbase.prime.model.enums.ActivityCategory;
import com.coinbase.prime.model.enums.ActivityStatus;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

public class ActivitiesIT extends BaseIntegrationTest {

    @Test
    public void testListPortfolioActivities() throws Exception {
        assumeTrue(portfolioId != null && !portfolioId.isEmpty(),
                "Skipping: COINBASE_PRIME_PORTFOLIO_ID not set");
        ActivitiesService service = PrimeServiceFactory.createActivitiesService(client);
        ListPortfolioActivitiesResponse response = service.listPortfolioActivities(
                new ListPortfolioActivitiesRequest.Builder()
                        .portfolioId(portfolioId)
                        .build());
        assertNotNull(response);
    }

    @Test
    public void testListPortfolioActivitiesWithOptionals() throws Exception {
        assumeTrue(portfolioId != null && !portfolioId.isEmpty(),
                "Skipping: COINBASE_PRIME_PORTFOLIO_ID not set");
        ActivitiesService service = PrimeServiceFactory.createActivitiesService(client);
        ListPortfolioActivitiesResponse response = service.listPortfolioActivities(
                new ListPortfolioActivitiesRequest.Builder()
                        .portfolioId(portfolioId)
                        .symbols(new String[]{"BTC", "ETH"})
                        .startTime("2025-01-01T00:00:00Z")
                        .endTime("2025-12-31T23:59:59Z")
                        .limit(5)
                        .build());
        assertNotNull(response);
    }

    @Test
    public void testListEntityActivities() throws Exception {
        assumeTrue(entityId != null && !entityId.isEmpty(),
                "Skipping: COINBASE_PRIME_ENTITY_ID not set");
        ActivitiesService service = PrimeServiceFactory.createActivitiesService(client);
        ListEntityActivitiesResponse response = service.listEntityActivities(
                new ListEntityActivitiesRequest.Builder()
                        .entityId(entityId)
                        .build());
        assertNotNull(response);
    }

    @Test
    public void testListEntityActivitiesWithOptionals() throws Exception {
        assumeTrue(entityId != null && !entityId.isEmpty(),
                "Skipping: COINBASE_PRIME_ENTITY_ID not set");
        ActivitiesService service = PrimeServiceFactory.createActivitiesService(client);
        ListEntityActivitiesResponse response = service.listEntityActivities(
                new ListEntityActivitiesRequest.Builder()
                        .entityId(entityId)
                        .categories(new ActivityCategory[]{ActivityCategory.ACTIVITY_CATEGORY_ORDER})
                        .statuses(new ActivityStatus[]{ActivityStatus.ACTIVITY_STATUS_COMPLETED})
                        .startTime("2025-01-01T00:00:00Z")
                        .endTime("2025-12-31T23:59:59Z")
                        .limit(5)
                        .build());
        assertNotNull(response);
    }
}
