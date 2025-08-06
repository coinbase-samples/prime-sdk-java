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
 * Request to validate an address before adding to address book
 */
public class ValidateAddressRequest {
    @JsonProperty(required = true, value = "portfolio_id")
    @JsonIgnore
    private String portfolioId;
    @JsonProperty(required = true, value = "address")
    private String address;
    @JsonProperty(required = true, value = "currency_symbol")
    private String currencySymbol;
    @JsonProperty("account_identifier")
    private String accountIdentifier;
    @JsonProperty("network")
    private String network;
    
    public ValidateAddressRequest() {
    }
    
    public ValidateAddressRequest(Builder builder) {
        this.portfolioId = builder.portfolioId;
        this.address = builder.address;
        this.currencySymbol = builder.currencySymbol;
        this.accountIdentifier = builder.accountIdentifier;
        this.network = builder.network;
    }
    
    public String getPortfolioId() {
        return portfolioId;
    }
    
    public void setPortfolioId(String portfolioId) {
        this.portfolioId = portfolioId;
    }
    
    public String getAddress() {
        return address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    public String getCurrencySymbol() {
        return currencySymbol;
    }
    
    public void setCurrencySymbol(String currencySymbol) {
        this.currencySymbol = currencySymbol;
    }
    
    public String getAccountIdentifier() {
        return accountIdentifier;
    }
    
    public void setAccountIdentifier(String accountIdentifier) {
        this.accountIdentifier = accountIdentifier;
    }
    
    public String getNetwork() {
        return network;
    }
    
    public void setNetwork(String network) {
        this.network = network;
    }
    
    public static class Builder {
        private final String portfolioId;
        private final String address;
        private final String currencySymbol;
        private String accountIdentifier;
        private String network;
        
        public Builder(String portfolioId, String address, String currencySymbol) {
            this.portfolioId = portfolioId;
            this.address = address;
            this.currencySymbol = currencySymbol;
        }
        
        public Builder accountIdentifier(String accountIdentifier) {
            this.accountIdentifier = accountIdentifier;
            return this;
        }
        
        public Builder network(String network) {
            this.network = network;
            return this;
        }
        
        public ValidateAddressRequest build() throws CoinbaseClientException {
            this.validate();
            return new ValidateAddressRequest(this);
        }
        
        private void validate() throws CoinbaseClientException {
            if (this.portfolioId == null || this.portfolioId.isEmpty()) {
                throw new CoinbaseClientException("PortfolioId is required");
            }
            if (this.address == null || this.address.isEmpty()) {
                throw new CoinbaseClientException("Address is required");
            }
            if (this.currencySymbol == null || this.currencySymbol.isEmpty()) {
                throw new CoinbaseClientException("CurrencySymbol is required");
            }
        }
    }
}