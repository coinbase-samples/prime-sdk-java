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
import com.coinbase.prime.paymentmethods.ListPaymentMethodsRequest;
import com.coinbase.prime.paymentmethods.ListPaymentMethodsResponse;
import com.coinbase.prime.paymentmethods.PaymentMethodsService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

public class PaymentMethodsIT extends BaseIntegrationTest {

    @Test
    public void testListPaymentMethods() throws Exception {
        assumeTrue(entityId != null && !entityId.isEmpty(),
                "Skipping: COINBASE_PRIME_ENTITY_ID not set");
        PaymentMethodsService service = PrimeServiceFactory.createPaymentMethodsService(client);
        ListPaymentMethodsResponse response = service.listPaymentMethods(
                new ListPaymentMethodsRequest.Builder()
                        .entityId(entityId)
                        .build());
        assertNotNull(response);
    }
}
