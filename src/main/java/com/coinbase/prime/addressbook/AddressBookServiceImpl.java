/*
 * Copyright 2024-present Coinbase Global, Inc.
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

package com.coinbase.prime.addressbook;

import com.coinbase.core.common.HttpMethod;
import com.coinbase.core.service.CoinbaseServiceImpl;
import com.coinbase.prime.client.CoinbasePrimeClient;
import com.coinbase.prime.errors.CoinbasePrimeException;
import com.fasterxml.jackson.core.type.TypeReference;

import java.util.List;

public class AddressBookServiceImpl extends CoinbaseServiceImpl implements AddressBookService {
    public AddressBookServiceImpl(CoinbasePrimeClient client) {
        super(client);
    }

    @Override
    public GetPortfolioAddressBookResponse getAddressBook(GetPortfolioAddressBookRequest request) throws CoinbasePrimeException {
        return this.request(
                HttpMethod.GET,
                String.format("/portfolios/%s/address_book", request.getPortfolioId()),
                request,
                List.of(200),
                new TypeReference<GetPortfolioAddressBookResponse>() {});
    }

    @Override
    public CreateAddressBookEntryResponse createAddressBookEntry(CreateAddressBookEntryRequest request) throws CoinbasePrimeException {
        return this.request(
                HttpMethod.POST,
                String.format("/portfolios/%s/address_book", request.getPortfolioId()),
                request,
                List.of(200),
                new TypeReference<CreateAddressBookEntryResponse>() {});
    }

    @Override
    public GetAddressBookEntryResponse getAddressBookEntry(GetAddressBookEntryRequest request) throws CoinbasePrimeException {
        return this.request(
                HttpMethod.GET,
                String.format("/portfolios/%s/address_book/%s", request.getPortfolioId(), request.getAddressId()),
                request,
                List.of(200),
                new TypeReference<GetAddressBookEntryResponse>() {});
    }

    @Override
    public UpdateAddressBookEntryResponse updateAddressBookEntry(UpdateAddressBookEntryRequest request) throws CoinbasePrimeException {
        return this.request(
                HttpMethod.PUT,
                String.format("/portfolios/%s/address_book/%s", request.getPortfolioId(), request.getAddressId()),
                request,
                List.of(200),
                new TypeReference<UpdateAddressBookEntryResponse>() {});
    }

    @Override
    public DeleteAddressBookEntryResponse deleteAddressBookEntry(DeleteAddressBookEntryRequest request) throws CoinbasePrimeException {
        return this.request(
                HttpMethod.DELETE,
                String.format("/portfolios/%s/address_book/%s", request.getPortfolioId(), request.getAddressId()),
                request,
                List.of(200),
                new TypeReference<DeleteAddressBookEntryResponse>() {});
    }

    @Override
    public ValidateAddressResponse validateAddress(ValidateAddressRequest request) throws CoinbasePrimeException {
        return this.request(
                HttpMethod.POST,
                String.format("/portfolios/%s/address_book/validate", request.getPortfolioId()),
                request,
                List.of(200),
                new TypeReference<ValidateAddressResponse>() {});
    }

    @Override
    public ListTrustedAddressesResponse listTrustedAddresses(ListTrustedAddressesRequest request) throws CoinbasePrimeException {
        return this.request(
                HttpMethod.GET,
                String.format("/portfolios/%s/address_book/trusted", request.getPortfolioId()),
                request,
                List.of(200),
                new TypeReference<ListTrustedAddressesResponse>() {});
    }

    @Override
    public GetAddressBookConfigurationResponse getAddressBookConfiguration(GetAddressBookConfigurationRequest request) throws CoinbasePrimeException {
        return this.request(
                HttpMethod.GET,
                String.format("/portfolios/%s/address_book/configuration", request.getPortfolioId()),
                request,
                List.of(200),
                new TypeReference<GetAddressBookConfigurationResponse>() {});
    }
}
