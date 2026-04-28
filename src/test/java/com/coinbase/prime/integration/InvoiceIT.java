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
import com.coinbase.prime.invoice.InvoiceService;
import com.coinbase.prime.invoice.ListInvoicesRequest;
import com.coinbase.prime.invoice.ListInvoicesResponse;
import com.coinbase.prime.model.enums.InvoiceState;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

public class InvoiceIT extends BaseIntegrationTest {

    @Test
    public void testListInvoices() throws Exception {
        assumeTrue(entityId != null && !entityId.isEmpty(),
                "Skipping: COINBASE_PRIME_ENTITY_ID not set");
        InvoiceService service = PrimeServiceFactory.createInvoiceService(client);
        ListInvoicesResponse response = service.listInvoices(
                new ListInvoicesRequest.Builder()
                        .entityId(entityId)
                        .build());
        assertNotNull(response);
    }

    @Test
    public void testListInvoicesWithOptionals() throws Exception {
        assumeTrue(entityId != null && !entityId.isEmpty(),
                "Skipping: COINBASE_PRIME_ENTITY_ID not set");
        InvoiceService service = PrimeServiceFactory.createInvoiceService(client);
        ListInvoicesResponse response = service.listInvoices(
                new ListInvoicesRequest.Builder()
                        .entityId(entityId)
                        .states(new InvoiceState[]{InvoiceState.INVOICE_STATE_BILLED})
                        .billingYear(2025)
                        .billingMonth(1)
                        .limit(5)
                        .build());
        assertNotNull(response);
    }
}
