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

package com.coinbase.prime.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Summary information for address book
 */
public class AddressBookSummary {
    @JsonProperty("portfolio_id")
    private String portfolioId;
    @JsonProperty("total_addresses")
    private Integer totalAddresses;
    @JsonProperty("verified_addresses")
    private Integer verifiedAddresses;
    @JsonProperty("trusted_addresses")
    private Integer trustedAddresses;
    @JsonProperty("pending_addresses")
    private Integer pendingAddresses;
    @JsonProperty("supported_currencies")
    private Integer supportedCurrencies;
    private AddressBookConfiguration configuration;
    private AddressBookMetadata metadata;
    
    public AddressBookSummary() {
    }
    
    public AddressBookSummary(Builder builder) {
        this.portfolioId = builder.portfolioId;
        this.totalAddresses = builder.totalAddresses;
        this.verifiedAddresses = builder.verifiedAddresses;
        this.trustedAddresses = builder.trustedAddresses;
        this.pendingAddresses = builder.pendingAddresses;
        this.supportedCurrencies = builder.supportedCurrencies;
        this.configuration = builder.configuration;
        this.metadata = builder.metadata;
    }
    
    public String getPortfolioId() {
        return portfolioId;
    }
    
    public void setPortfolioId(String portfolioId) {
        this.portfolioId = portfolioId;
    }
    
    public Integer getTotalAddresses() {
        return totalAddresses;
    }
    
    public void setTotalAddresses(Integer totalAddresses) {
        this.totalAddresses = totalAddresses;
    }
    
    public Integer getVerifiedAddresses() {
        return verifiedAddresses;
    }
    
    public void setVerifiedAddresses(Integer verifiedAddresses) {
        this.verifiedAddresses = verifiedAddresses;
    }
    
    public Integer getTrustedAddresses() {
        return trustedAddresses;
    }
    
    public void setTrustedAddresses(Integer trustedAddresses) {
        this.trustedAddresses = trustedAddresses;
    }
    
    public Integer getPendingAddresses() {
        return pendingAddresses;
    }
    
    public void setPendingAddresses(Integer pendingAddresses) {
        this.pendingAddresses = pendingAddresses;
    }
    
    public Integer getSupportedCurrencies() {
        return supportedCurrencies;
    }
    
    public void setSupportedCurrencies(Integer supportedCurrencies) {
        this.supportedCurrencies = supportedCurrencies;
    }
    
    public AddressBookConfiguration getConfiguration() {
        return configuration;
    }
    
    public void setConfiguration(AddressBookConfiguration configuration) {
        this.configuration = configuration;
    }
    
    public AddressBookMetadata getMetadata() {
        return metadata;
    }
    
    public void setMetadata(AddressBookMetadata metadata) {
        this.metadata = metadata;
    }
    
    public static class Builder {
        private String portfolioId;
        private Integer totalAddresses;
        private Integer verifiedAddresses;
        private Integer trustedAddresses;
        private Integer pendingAddresses;
        private Integer supportedCurrencies;
        private AddressBookConfiguration configuration;
        private AddressBookMetadata metadata;
        
        public Builder portfolioId(String portfolioId) {
            this.portfolioId = portfolioId;
            return this;
        }
        
        public Builder totalAddresses(Integer totalAddresses) {
            this.totalAddresses = totalAddresses;
            return this;
        }
        
        public Builder verifiedAddresses(Integer verifiedAddresses) {
            this.verifiedAddresses = verifiedAddresses;
            return this;
        }
        
        public Builder trustedAddresses(Integer trustedAddresses) {
            this.trustedAddresses = trustedAddresses;
            return this;
        }
        
        public Builder pendingAddresses(Integer pendingAddresses) {
            this.pendingAddresses = pendingAddresses;
            return this;
        }
        
        public Builder supportedCurrencies(Integer supportedCurrencies) {
            this.supportedCurrencies = supportedCurrencies;
            return this;
        }
        
        public Builder configuration(AddressBookConfiguration configuration) {
            this.configuration = configuration;
            return this;
        }
        
        public Builder metadata(AddressBookMetadata metadata) {
            this.metadata = metadata;
            return this;
        }
        
        public AddressBookSummary build() {
            return new AddressBookSummary(this);
        }
    }
}