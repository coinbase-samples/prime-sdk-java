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

package com.coinbase.prime.addressbook;

import com.coinbase.core.errors.CoinbaseClientException;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import static com.coinbase.core.utils.Utils.isNullOrEmpty;

/**
 * Create Address Book Entry
 */
public class CreateAddressBookEntryRequest {
    @JsonProperty(required = true, value = "portfolio_id")
    @JsonIgnore
    private String portfolioId;

    @JsonProperty("address")
    private String address;

    @JsonProperty("currency_symbol")
    private String currencySymbol;

    @JsonProperty("name")
    private String name;

    @JsonProperty("account_identifier")
    private String accountIdentifier;

    @JsonProperty("chain_ids")
    private String[] chainIds;

    public CreateAddressBookEntryRequest() {
    }

    public CreateAddressBookEntryRequest(Builder builder) {
        this.portfolioId = builder.portfolioId;
        this.address = builder.address;
        this.currencySymbol = builder.currencySymbol;
        this.name = builder.name;
        this.accountIdentifier = builder.accountIdentifier;
        this.chainIds = builder.chainIds;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountIdentifier() {
        return accountIdentifier;
    }

    public void setAccountIdentifier(String accountIdentifier) {
        this.accountIdentifier = accountIdentifier;
    }

    public String[] getChainIds() {
        return chainIds;
    }

    public void setChainIds(String[] chainIds) {
        this.chainIds = chainIds;
    }

    public static class Builder {
        private String portfolioId;
        private String address;
        private String currencySymbol;
        private String name;
        private String accountIdentifier;
        private String[] chainIds;

        public Builder() {
        }

        public Builder portfolioId(String portfolioId) {
            this.portfolioId = portfolioId;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Builder currencySymbol(String currencySymbol) {
            this.currencySymbol = currencySymbol;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder accountIdentifier(String accountIdentifier) {
            this.accountIdentifier = accountIdentifier;
            return this;
        }

        public Builder chainIds(String[] chainIds) {
            this.chainIds = chainIds;
            return this;
        }

        public CreateAddressBookEntryRequest build() throws CoinbaseClientException {
            validate();
            return new CreateAddressBookEntryRequest(this);
        }

        private void validate() throws CoinbaseClientException {
            if (isNullOrEmpty(this.portfolioId)) {
                throw new CoinbaseClientException("PortfolioId is required");
            }
        }
    }
}
