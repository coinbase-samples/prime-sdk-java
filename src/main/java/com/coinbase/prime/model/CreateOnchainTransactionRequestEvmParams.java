// Copyright 2024-present Coinbase Global, Inc.
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

public class CreateOnchainTransactionRequestEvmParams {
    private Boolean disableDynamicGas;

    private Boolean disableDynamicNonce;

    private String replacedTransactionId;

    private String chainId;

    private String networkName;

    public CreateOnchainTransactionRequestEvmParams() {
    }

    public CreateOnchainTransactionRequestEvmParams(Builder builder) {
        this.disableDynamicGas = builder.disableDynamicGas;
        this.disableDynamicNonce = builder.disableDynamicNonce;
        this.replacedTransactionId = builder.replacedTransactionId;
        this.chainId = builder.chainId;
        this.networkName = builder.networkName;
    }

    public Boolean isDisableDynamicGas() {
        return disableDynamicGas;
    }

    public Boolean isDisableDynamicNonce() {
        return disableDynamicNonce;
    }

    public String getReplacedTransactionId() {
        return replacedTransactionId;
    }

    public String getChainId() {
        return chainId;
    }

    public String getNetworkName() {
        return networkName;
    }

    public void setDisableDynamicGas(Boolean disableDynamicGas) {
        this.disableDynamicGas = disableDynamicGas;
    }

    public void setDisableDynamicNonce(Boolean disableDynamicNonce) {
        this.disableDynamicNonce = disableDynamicNonce;
    }

    public void setReplacedTransactionId(String replacedTransactionId) {
        this.replacedTransactionId = replacedTransactionId;
    }

    public void setChainId(String chainId) {
        this.chainId = chainId;
    }

    public void setNetworkName(String networkName) {
        this.networkName = networkName;
    }

    public static class Builder {
        private Boolean disableDynamicGas;

        private Boolean disableDynamicNonce;

        private String replacedTransactionId;

        private String chainId;

        private String networkName;

        public Builder disableDynamicGas(Boolean disableDynamicGas) {
            this.disableDynamicGas = disableDynamicGas;
            return this;
        }

        public Builder disableDynamicNonce(Boolean disableDynamicNonce) {
            this.disableDynamicNonce = disableDynamicNonce;
            return this;
        }

        public Builder replacedTransactionId(String replacedTransactionId) {
            this.replacedTransactionId = replacedTransactionId;
            return this;
        }

        public Builder chainId(String chainId) {
            this.chainId = chainId;
            return this;
        }

        public Builder networkName(String networkName) {
            this.networkName = networkName;
            return this;
        }

        public CreateOnchainTransactionRequestEvmParams build() {
            return new CreateOnchainTransactionRequestEvmParams(this);
        }
    }
}
