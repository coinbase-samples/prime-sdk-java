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
import java.util.List;

public class AddressEntry {
    private String name;
    private String address;
    @JsonProperty("chain_ids")
    private List<String> chainIds;

    public AddressEntry() {
    }

    public AddressEntry(Builder builder) {
        this.name = builder.name;
        this.address = builder.address;
        this.chainIds = builder.chainIds;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<String> getChainIds() {
        return chainIds;
    }

    public void setChainIds(List<String> chainIds) {
        this.chainIds = chainIds;
    }

    public static class Builder {
        private String name;
        private String address;
        private List<String> chainIds;

        public Builder() {
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Builder chainIds(List<String> chainIds) {
            this.chainIds = chainIds;
            return this;
        }

        public AddressEntry build() {
            return new AddressEntry(this);
        }
    }
}