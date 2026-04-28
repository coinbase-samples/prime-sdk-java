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
import com.coinbase.prime.futures.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

public class FuturesIT extends BaseIntegrationTest {

    @Test
    public void testGetEntityFcmBalance() throws Exception {
        assumeTrue(entityId != null && !entityId.isEmpty(),
                "Skipping: COINBASE_PRIME_ENTITY_ID not set");
        FuturesService service = PrimeServiceFactory.createFuturesService(client);
        GetEntityFcmBalanceResponse response = service.getEntityFcmBalance(
                new GetEntityFcmBalanceRequest.Builder()
                        .entityId(entityId)
                        .build());
        assertNotNull(response);
    }

    @Test
    public void testGetFcmMarginCallDetails() throws Exception {
        assumeTrue(entityId != null && !entityId.isEmpty(),
                "Skipping: COINBASE_PRIME_ENTITY_ID not set");
        FuturesService service = PrimeServiceFactory.createFuturesService(client);
        GetFcmMarginCallDetailsResponse response = service.getFcmMarginCallDetails(
                new GetFcmMarginCallDetailsRequest.Builder()
                        .entityId(entityId)
                        .build());
        assertNotNull(response);
    }

    @Test
    public void testGetPositions() throws Exception {
        assumeTrue(entityId != null && !entityId.isEmpty(),
                "Skipping: COINBASE_PRIME_ENTITY_ID not set");
        FuturesService service = PrimeServiceFactory.createFuturesService(client);
        GetPositionsResponse response = service.getPositions(
                new GetPositionsRequest.Builder()
                        .entityId(entityId)
                        .build());
        assertNotNull(response);
    }

    @Test
    public void testGetPositionsWithProductId() throws Exception {
        assumeTrue(entityId != null && !entityId.isEmpty(),
                "Skipping: COINBASE_PRIME_ENTITY_ID not set");
        FuturesService service = PrimeServiceFactory.createFuturesService(client);
        GetPositionsResponse response = service.getPositions(
                new GetPositionsRequest.Builder()
                        .entityId(entityId)
                        .productId("BTC-28MAR25-CDE")
                        .build());
        assertNotNull(response);
    }

    @Test
    public void testGetFcmRiskLimits() throws Exception {
        assumeTrue(entityId != null && !entityId.isEmpty(),
                "Skipping: COINBASE_PRIME_ENTITY_ID not set");
        FuturesService service = PrimeServiceFactory.createFuturesService(client);
        GetFcmRiskLimitsResponse response = service.getFcmRiskLimits(
                new GetFcmRiskLimitsRequest.Builder()
                        .entityId(entityId)
                        .build());
        assertNotNull(response);
    }

    @Test
    public void testGetFcmSettings() throws Exception {
        assumeTrue(entityId != null && !entityId.isEmpty(),
                "Skipping: COINBASE_PRIME_ENTITY_ID not set");
        FuturesService service = PrimeServiceFactory.createFuturesService(client);
        GetFcmSettingsResponse response = service.getFcmSettings(
                new GetFcmSettingsRequest.Builder()
                        .entityId(entityId)
                        .build());
        assertNotNull(response);
    }

    @Test
    public void testListEntityFuturesSweeps() throws Exception {
        assumeTrue(entityId != null && !entityId.isEmpty(),
                "Skipping: COINBASE_PRIME_ENTITY_ID not set");
        FuturesService service = PrimeServiceFactory.createFuturesService(client);
        ListEntityFuturesSweepsResponse response = service.listEntityFuturesSweeps(
                new ListEntityFuturesSweepsRequest.Builder()
                        .entityId(entityId)
                        .build());
        assertNotNull(response);
    }

    @Test
    public void testGetFcmEquity() throws Exception {
        assumeTrue(entityId != null && !entityId.isEmpty(),
                "Skipping: COINBASE_PRIME_ENTITY_ID not set");
        FuturesService service = PrimeServiceFactory.createFuturesService(client);
        GetFcmEquityResponse response = service.getFcmEquity(
                new GetFcmEquityRequest.Builder()
                        .entityId(entityId)
                        .build());
        assertNotNull(response);
    }
}
