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

import com.coinbase.prime.addressbook.AddressBookService;
import com.coinbase.prime.addressbook.ListAddressBookRequest;
import com.coinbase.prime.addressbook.ListAddressBookResponse;
import com.coinbase.prime.factory.PrimeServiceFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

public class AddressBookIT extends BaseIntegrationTest {

    @Test
    public void testListAddressBook() throws Exception {
        assumeTrue(portfolioId != null && !portfolioId.isEmpty(),
                "Skipping: COINBASE_PRIME_PORTFOLIO_ID not set");
        AddressBookService service = PrimeServiceFactory.createAddressBookService(client);
        ListAddressBookResponse response = service.listAddressBook(
                new ListAddressBookRequest.Builder()
                        .portfolioId(portfolioId)
                        .build());
        assertNotNull(response);
    }

    @Test
    public void testListAddressBookWithSearch() throws Exception {
        assumeTrue(portfolioId != null && !portfolioId.isEmpty(),
                "Skipping: COINBASE_PRIME_PORTFOLIO_ID not set");
        AddressBookService service = PrimeServiceFactory.createAddressBookService(client);
        ListAddressBookResponse response = service.listAddressBook(
                new ListAddressBookRequest.Builder()
                        .portfolioId(portfolioId)
                        .currencySymbol("BTC")
                        .search("")
                        .limit(5)
                        .build());
        assertNotNull(response);
    }
}
