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

package com.coinbase.examples.onchainaddressbook;

import com.coinbase.prime.client.CoinbasePrimeClient;
import com.coinbase.prime.credentials.CoinbasePrimeCredentials;
import com.coinbase.prime.factory.PrimeServiceFactory;
import com.coinbase.prime.model.AddressEntry;
import com.coinbase.prime.model.AddressGroup;
import com.coinbase.prime.model.enums.NetworkType;
import com.coinbase.prime.onchainaddressbook.CreateOnchainAddressBookEntryRequest;
import com.coinbase.prime.onchainaddressbook.CreateOnchainAddressBookEntryResponse;
import com.coinbase.prime.onchainaddressbook.OnchainAddressBookService;
import com.coinbase.prime.utils.Utils;

import java.util.Arrays;

public class CreateOnchainAddressBookEntry {
    public static void main(String[] args) {
        try {
            CoinbasePrimeCredentials credentials = new CoinbasePrimeCredentials(
                    System.getenv("COINBASE_PRIME_CREDENTIALS"));
            CoinbasePrimeClient client = new CoinbasePrimeClient(credentials);
            String portfolioId = System.getenv("COINBASE_PRIME_PORTFOLIO_ID");

            String groupName = args[0];
            String networkType = args[1];
            String address = args[2];

            System.out.println("Using Portfolio ID: " + portfolioId + ", Group Name: " + groupName + ", Network: "
                    + networkType + ", Address: " + address);

            AddressEntry addressEntry = new AddressEntry.Builder()
                    .address(address)
                    .name(groupName)
                    .build();

            AddressGroup addressGroup = new AddressGroup.Builder()
                    .name(groupName)
                    .networkType(NetworkType.valueOf(networkType))
                    .addresses(Arrays.asList(addressEntry))
                    .build();

            OnchainAddressBookService service = PrimeServiceFactory.createOnchainAddressBookService(client);
            CreateOnchainAddressBookEntryResponse response = service.createOnchainAddressBookEntry(
                    new CreateOnchainAddressBookEntryRequest.Builder()
                            .portfolioId(portfolioId)
                            .addressGroup(addressGroup)
                            .build());

            System.out.println(Utils.getObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
