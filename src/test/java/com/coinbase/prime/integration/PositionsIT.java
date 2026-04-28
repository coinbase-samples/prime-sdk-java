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

import com.coinbase.prime.factory.PrimeServiceFactory;
import com.coinbase.prime.positions.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

public class PositionsIT extends BaseIntegrationTest {

    @Test
    public void testListPositions() throws Exception {
        assumeTrue(entityId != null && !entityId.isEmpty(),
                "Skipping: COINBASE_PRIME_ENTITY_ID not set");
        PositionsService service = PrimeServiceFactory.createPositionsService(client);
        ListPositionsResponse response = service.listPositions(
                new ListPositionsRequest.Builder()
                        .entityId(entityId)
                        .build());
        assertNotNull(response);
    }

    @Test
    public void testListPositionsWithPagination() throws Exception {
        assumeTrue(entityId != null && !entityId.isEmpty(),
                "Skipping: COINBASE_PRIME_ENTITY_ID not set");
        PositionsService service = PrimeServiceFactory.createPositionsService(client);
        ListPositionsResponse response = service.listPositions(
                new ListPositionsRequest.Builder()
                        .entityId(entityId)
                        .limit(5)
                        .build());
        assertNotNull(response);
    }

    @Test
    public void testListAggregatePositions() throws Exception {
        assumeTrue(entityId != null && !entityId.isEmpty(),
                "Skipping: COINBASE_PRIME_ENTITY_ID not set");
        PositionsService service = PrimeServiceFactory.createPositionsService(client);
        ListAggregatePositionsResponse response = service.listAggregatePositions(
                new ListAggregatePositionsRequest.Builder()
                        .entityId(entityId)
                        .build());
        assertNotNull(response);
    }

    @Test
    public void testListAggregatePositionsWithPagination() throws Exception {
        assumeTrue(entityId != null && !entityId.isEmpty(),
                "Skipping: COINBASE_PRIME_ENTITY_ID not set");
        PositionsService service = PrimeServiceFactory.createPositionsService(client);
        ListAggregatePositionsResponse response = service.listAggregatePositions(
                new ListAggregatePositionsRequest.Builder()
                        .entityId(entityId)
                        .limit(5)
                        .build());
        assertNotNull(response);
    }
}
