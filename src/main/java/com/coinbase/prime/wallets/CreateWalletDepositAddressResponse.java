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

package com.coinbase.prime.wallets;

import com.coinbase.prime.model.NetworkDetails;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateWalletDepositAddressResponse {
    @JsonProperty("address")
    private String address;

    @JsonProperty("account_identifier")
    private String accountIdentifier;

    @JsonProperty("network")
    private NetworkDetails network;

    public CreateWalletDepositAddressResponse() {
    }

    public CreateWalletDepositAddressResponse(Builder builder) {
        this.address = builder.address;
        this.accountIdentifier = builder.accountIdentifier;
        this.network = builder.network;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAccountIdentifier() {
        return accountIdentifier;
    }

    public void setAccountIdentifier(String accountIdentifier) {
        this.accountIdentifier = accountIdentifier;
    }

    public NetworkDetails getNetwork() {
        return network;
    }

    public void setNetwork(NetworkDetails network) {
        this.network = network;
    }

    public static class Builder {
        private String address;
        private String accountIdentifier;
        private NetworkDetails network;

        public Builder() {
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Builder accountIdentifier(String accountIdentifier) {
            this.accountIdentifier = accountIdentifier;
            return this;
        }

        public Builder network(NetworkDetails network) {
            this.network = network;
            return this;
        }

        public CreateWalletDepositAddressResponse build() {
            return new CreateWalletDepositAddressResponse(this);
        }
    }
}
