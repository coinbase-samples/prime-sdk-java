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

package com.coinbase.prime.model.transactions;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EVMParams {
    @JsonProperty("disable_dynamic_gas")
    private boolean disableDynamicGas;

    @JsonProperty("replaced_transaction_id")
    private String replacedTransactionId;

    @JsonProperty("chain_id")
    private String chainId;

    public EVMParams() {
    }

    public EVMParams(Builder builder) {
        this.disableDynamicGas = builder.disableDynamicGas;
        this.replacedTransactionId = builder.replacedTransactionId;
        this.chainId = builder.chainId;
    }

    public boolean isDisableDynamicGas() {
        return disableDynamicGas;
    }

    public void setDisableDynamicGas(boolean disableDynamicGas) {
        this.disableDynamicGas = disableDynamicGas;
    }

    public String getReplacedTransactionId() {
        return replacedTransactionId;
    }

    public void setReplacedTransactionId(String replacedTransactionId) {
        this.replacedTransactionId = replacedTransactionId;
    }

    public String getChainId() {
        return chainId;
    }

    public void setChainId(String chainId) {
        this.chainId = chainId;
    }

    public static class Builder {
        private boolean disableDynamicGas;
        private String replacedTransactionId;
        private String chainId;

        public Builder() {
        }

        public Builder disableDynamicGas(boolean disableDynamicGas) {
            this.disableDynamicGas = disableDynamicGas;
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

        public EVMParams build() {
            return new EVMParams(this);
        }
    }
}
