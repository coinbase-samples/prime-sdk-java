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

package com.coinbase.prime.transactions;

import com.coinbase.prime.model.CreateOnchainTransactionRequestEvmParams;
import com.coinbase.prime.model.RpcConfig;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateOnchainTransactionRequest {
    @JsonProperty(required = true, value = "portfolio_id")
    @JsonIgnore
    private String portfolioId;

    @JsonProperty(required = true, value = "wallet_id")
    @JsonIgnore
    private String walletId;

    @JsonProperty("raw_unsigned_txn")
    private String rawUnsignedTxn;

    private RpcConfig rpc;

    @JsonProperty("evm_params")
    private CreateOnchainTransactionRequestEvmParams evmParams;

    public CreateOnchainTransactionRequest() {
    }

    public CreateOnchainTransactionRequest(Builder builder) {
        this.portfolioId = builder.portfolioId;
        this.walletId = builder.walletId;
        this.rawUnsignedTxn = builder.rawUnsignedTxn;
        this.rpc = builder.rpc;
        this.evmParams = builder.evmParams;
    }

    public String getPortfolioId() {
        return portfolioId;
    }

    public void setPortfolioId(String portfolioId) {
        this.portfolioId = portfolioId;
    }

    public String getWalletId() {
        return walletId;
    }

    public void setWalletId(String walletId) {
        this.walletId = walletId;
    }

    public String getRawUnsignedTxn() {
        return rawUnsignedTxn;
    }

    public void setRawUnsignedTxn(String rawUnsignedTxn) {
        this.rawUnsignedTxn = rawUnsignedTxn;
    }

    public RpcConfig getRpc() {
        return rpc;
    }

    public void setRpc(RpcConfig rpc) {
        this.rpc = rpc;
    }

    public CreateOnchainTransactionRequestEvmParams getEvmParams() {
        return evmParams;
    }

    public void setEvmParams(CreateOnchainTransactionRequestEvmParams evmParams) {
        this.evmParams = evmParams;
    }

    public static class Builder {
        private String portfolioId;
        private String walletId;
        private String rawUnsignedTxn;
        private RpcConfig rpc;
        private CreateOnchainTransactionRequestEvmParams evmParams;

        public Builder() {
        }

        public Builder portfolioId(String portfolioId) {
            this.portfolioId = portfolioId;
            return this;
        }

        public Builder walletId(String walletId) {
            this.walletId = walletId;
            return this;
        }

        public Builder rawUnsignedTxn(String rawUnsignedTxn) {
            this.rawUnsignedTxn = rawUnsignedTxn;
            return this;
        }

        public Builder rpc(RpcConfig rpc) {
            this.rpc = rpc;
            return this;
        }

        public Builder evmParams(CreateOnchainTransactionRequestEvmParams evmParams) {
            this.evmParams = evmParams;
            return this;
        }

        public CreateOnchainTransactionRequest build() {
            return new CreateOnchainTransactionRequest(this);
        }
    }
}
