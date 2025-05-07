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
import com.fasterxml.jackson.annotation.JsonProperty;

public class ListOnchainAddressGroupsResponse {
    @JsonProperty("address_groups")
    private AddressGroup[] addressGroups;

    public ListOnchainAddressGroupsResponse() {
    }

    public ListOnchainAddressGroupsResponse(Builder builder) {
        this.addressGroups = builder.addressGroups;
    }

    public AddressGroup[] getAddressGroups() {
        return addressGroups;
    }

    public void setAddressGroups(AddressGroup[] addressGroups) {
        this.addressGroups = addressGroups;
    }

    public static class Builder {
        private AddressGroup[] addressGroups;

        public Builder() {
        }

        public Builder addressGroups(AddressGroup[] addressGroups) {
            this.addressGroups = addressGroups;
            return this;
        }

        public ListOnchainAddressGroupsResponse build() {
            return new ListOnchainAddressGroupsResponse(this);
        }
    }
}
