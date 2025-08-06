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

import com.coinbase.prime.model.AddressBookEntry;
import com.coinbase.prime.model.Pagination;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Response containing list of trusted addresses
 */
public class ListTrustedAddressesResponse {
    @JsonProperty("trusted_addresses")
    private List<AddressBookEntry> trustedAddresses;
    @JsonProperty("pagination")
    private Pagination pagination;
    
    public ListTrustedAddressesResponse() {
    }
    
    public ListTrustedAddressesResponse(List<AddressBookEntry> trustedAddresses, Pagination pagination) {
        this.trustedAddresses = trustedAddresses;
        this.pagination = pagination;
    }
    
    public List<AddressBookEntry> getTrustedAddresses() {
        return trustedAddresses;
    }
    
    public void setTrustedAddresses(List<AddressBookEntry> trustedAddresses) {
        this.trustedAddresses = trustedAddresses;
    }
    
    public Pagination getPagination() {
        return pagination;
    }
    
    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }
}