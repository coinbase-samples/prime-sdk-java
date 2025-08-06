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

import com.coinbase.core.errors.CoinbaseClientException;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Request to delete an address book entry
 */
public class DeleteAddressBookEntryRequest {
    @JsonProperty(required = true, value = "portfolio_id")
    @JsonIgnore
    private String portfolioId;
    @JsonProperty(required = true, value = "address_id")
    @JsonIgnore
    private String addressId;
    
    public DeleteAddressBookEntryRequest() {
    }
    
    public DeleteAddressBookEntryRequest(Builder builder) {
        this.portfolioId = builder.portfolioId;
        this.addressId = builder.addressId;
    }
    
    public String getPortfolioId() {
        return portfolioId;
    }
    
    public void setPortfolioId(String portfolioId) {
        this.portfolioId = portfolioId;
    }
    
    public String getAddressId() {
        return addressId;
    }
    
    public void setAddressId(String addressId) {
        this.addressId = addressId;
    }
    
    public static class Builder {
        private final String portfolioId;
        private final String addressId;
        
        public Builder(String portfolioId, String addressId) {
            this.portfolioId = portfolioId;
            this.addressId = addressId;
        }
        
        public DeleteAddressBookEntryRequest build() throws CoinbaseClientException {
            this.validate();
            return new DeleteAddressBookEntryRequest(this);
        }
        
        private void validate() throws CoinbaseClientException {
            if (this.portfolioId == null || this.portfolioId.isEmpty()) {
                throw new CoinbaseClientException("PortfolioId is required");
            }
            if (this.addressId == null || this.addressId.isEmpty()) {
                throw new CoinbaseClientException("AddressId is required");
            }
        }
    }
}