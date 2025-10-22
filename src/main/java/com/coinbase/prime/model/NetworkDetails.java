// Copyright 2025-present Coinbase Global, Inc.
//
//  Licensed under the Apache License, Version 2.0 (the "License");
//  you may not use this file except in compliance with the License.
//  You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
//  Unless required by applicable law or agreed to in writing, software
//  distributed under the License is distributed on an "AS IS" BASIS,
//  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//  See the License for the specific language governing permissions and
//  limitations under the License.
package com.coinbase.prime.model;

public class NetworkDetails {
    private Network network;

    /**
     * The name of the network
     */
    private String name;

    private String maxDecimals;

    private Boolean _default;

    private Boolean tradingSupported;

    private Boolean vaultSupported;

    private Boolean primeCustodySupported;

    private Boolean destinationTagRequired;

    private String networkLink;

    public NetworkDetails() {
    }

    public NetworkDetails(Builder builder) {
        this.network = builder.network;
        this.name = builder.name;
        this.maxDecimals = builder.maxDecimals;
        this._default = builder._default;
        this.tradingSupported = builder.tradingSupported;
        this.vaultSupported = builder.vaultSupported;
        this.primeCustodySupported = builder.primeCustodySupported;
        this.destinationTagRequired = builder.destinationTagRequired;
        this.networkLink = builder.networkLink;
    }

    public Network getNetwork() {
        return network;
    }

    public String getName() {
        return name;
    }

    public String getMaxDecimals() {
        return maxDecimals;
    }

    public Boolean is_default() {
        return _default;
    }

    public Boolean isTradingSupported() {
        return tradingSupported;
    }

    public Boolean isVaultSupported() {
        return vaultSupported;
    }

    public Boolean isPrimeCustodySupported() {
        return primeCustodySupported;
    }

    public Boolean isDestinationTagRequired() {
        return destinationTagRequired;
    }

    public String getNetworkLink() {
        return networkLink;
    }

    public void setNetwork(Network network) {
        this.network = network;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMaxDecimals(String maxDecimals) {
        this.maxDecimals = maxDecimals;
    }

    public void set_default(Boolean _default) {
        this._default = _default;
    }

    public void setTradingSupported(Boolean tradingSupported) {
        this.tradingSupported = tradingSupported;
    }

    public void setVaultSupported(Boolean vaultSupported) {
        this.vaultSupported = vaultSupported;
    }

    public void setPrimeCustodySupported(Boolean primeCustodySupported) {
        this.primeCustodySupported = primeCustodySupported;
    }

    public void setDestinationTagRequired(Boolean destinationTagRequired) {
        this.destinationTagRequired = destinationTagRequired;
    }

    public void setNetworkLink(String networkLink) {
        this.networkLink = networkLink;
    }

    public static class Builder {
        private Network network;

        private String name;

        private String maxDecimals;

        private Boolean _default;

        private Boolean tradingSupported;

        private Boolean vaultSupported;

        private Boolean primeCustodySupported;

        private Boolean destinationTagRequired;

        private String networkLink;

        public Builder network(Network network) {
            this.network = network;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder maxDecimals(String maxDecimals) {
            this.maxDecimals = maxDecimals;
            return this;
        }

        public Builder _default(Boolean _default) {
            this._default = _default;
            return this;
        }

        public Builder tradingSupported(Boolean tradingSupported) {
            this.tradingSupported = tradingSupported;
            return this;
        }

        public Builder vaultSupported(Boolean vaultSupported) {
            this.vaultSupported = vaultSupported;
            return this;
        }

        public Builder primeCustodySupported(Boolean primeCustodySupported) {
            this.primeCustodySupported = primeCustodySupported;
            return this;
        }

        public Builder destinationTagRequired(Boolean destinationTagRequired) {
            this.destinationTagRequired = destinationTagRequired;
            return this;
        }

        public Builder networkLink(String networkLink) {
            this.networkLink = networkLink;
            return this;
        }

        public NetworkDetails build() {
            return new NetworkDetails(this);
        }
    }
}
