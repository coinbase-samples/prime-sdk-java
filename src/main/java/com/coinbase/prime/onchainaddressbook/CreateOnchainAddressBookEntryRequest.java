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

package com.coinbase.prime.onchainaddressbook;

import com.coinbase.prime.model.AddressGroup;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateOnchainAddressBookEntryRequest {
    @JsonProperty(required = true, value = "portfolio_id")
    @JsonIgnore
    private String portfolioId;

    @JsonProperty("address_group")
    private AddressGroup addressGroup;

    public CreateOnchainAddressBookEntryRequest() {
    }

    public CreateOnchainAddressBookEntryRequest(Builder builder) {
        this.portfolioId = builder.portfolioId;
        this.addressGroup = builder.addressGroup;
    }

    public String getPortfolioId() {
        return portfolioId;
    }

    public void setPortfolioId(String portfolioId) {
        this.portfolioId = portfolioId;
    }

    public AddressGroup getAddressGroup() {
        return addressGroup;
    }

    public void setAddressGroup(AddressGroup addressGroup) {
        this.addressGroup = addressGroup;
    }

    public static class Builder {
        private String portfolioId;
        private AddressGroup addressGroup;

        public Builder() {
        }

        public Builder portfolioId(String portfolioId) {
            this.portfolioId = portfolioId;
            return this;
        }

        public Builder addressGroup(AddressGroup addressGroup) {
            this.addressGroup = addressGroup;
            return this;
        }

        public CreateOnchainAddressBookEntryRequest build() {
            return new CreateOnchainAddressBookEntryRequest(this);
        }
    }
}
