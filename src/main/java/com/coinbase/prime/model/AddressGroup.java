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

package com.coinbase.prime.model;

import com.coinbase.prime.model.enums.NetworkType;
import com.fasterxml.jackson.annotation.JsonProperty;

public class AddressGroup {
    private String id;
    private String name;
    @JsonProperty("network_type")
    private NetworkType networkType;
    private OnchainAddress[] addresses;
    @JsonProperty("added_at")
    private String addedAt;

    public AddressGroup() {
    }

    public AddressGroup(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.networkType = builder.networkType;
        this.addresses = builder.addresses;
        this.addedAt = builder.addedAt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public NetworkType getNetworkType() {
        return networkType;
    }

    public void setNetworkType(NetworkType networkType) {
        this.networkType = networkType;
    }

    public OnchainAddress[] getAddresses() {
        return addresses;
    }

    public void setAddresses(OnchainAddress[] addresses) {
        this.addresses = addresses;
    }

    public String getAddedAt() {
        return addedAt;
    }

    public void setAddedAt(String addedAt) {
        this.addedAt = addedAt;
    }

    public static class Builder {
        private String id;
        private String name;
        private NetworkType networkType;
        private OnchainAddress[] addresses;
        private String addedAt;

        public Builder() {
        }

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder networkType(NetworkType networkType) {
            this.networkType = networkType;
            return this;
        }

        public Builder addresses(OnchainAddress[] addresses) {
            this.addresses = addresses;
            return this;
        }

        public Builder addedAt(String addedAt) {
            this.addedAt = addedAt;
            return this;
        }

        public AddressGroup build() {
            return new AddressGroup(this);
        }
    }
}
