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

import com.coinbase.core.errors.CoinbaseClientException;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import static com.coinbase.core.utils.Utils.isNullOrEmpty;

public class CreateConversionRequest {
    @JsonProperty(required = true, value = "portfolio_id")
    @JsonIgnore
    private String portfolioId;
    @JsonProperty(required = true, value = "wallet_id")
    @JsonIgnore
    private String walletId;
    private String amount;
    private String destination;
    @JsonProperty("idempotency_key")
    private String idempotencyKey;
    @JsonProperty("source_symbol")
    private String sourceSymbol;
    @JsonProperty("destination_symbol")
    private String destinationSymbol;

    public CreateConversionRequest() {
    }

    public CreateConversionRequest(Builder builder) {
        this.portfolioId = builder.portfolioId;
        this.walletId = builder.walletId;
        this.amount = builder.amount;
        this.destination = builder.destination;
        this.idempotencyKey = builder.idempotencyKey;
        this.sourceSymbol = builder.sourceSymbol;
        this.destinationSymbol = builder.destinationSymbol;
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

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getIdempotencyKey() {
        return idempotencyKey;
    }

    public void setIdempotencyKey(String idempotencyKey) {
        this.idempotencyKey = idempotencyKey;
    }

    public String getSourceSymbol() {
        return sourceSymbol;
    }

    public void setSourceSymbol(String sourceSymbol) {
        this.sourceSymbol = sourceSymbol;
    }

    public String getDestinationSymbol() {
        return destinationSymbol;
    }

    public void setDestinationSymbol(String destinationSymbol) {
        this.destinationSymbol = destinationSymbol;
    }

    public static class Builder {
        private String portfolioId;
        private String walletId;
        private String amount;
        private String destination;
        private String idempotencyKey;
        private String sourceSymbol;
        private String destinationSymbol;

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

        public Builder amount(String amount) {
            this.amount = amount;
            return this;
        }

        public Builder destination(String destination) {
            this.destination = destination;
            return this;
        }

        public Builder idempotencyKey(String idempotencyKey) {
            this.idempotencyKey = idempotencyKey;
            return this;
        }

        public Builder sourceSymbol(String sourceSymbol) {
            this.sourceSymbol = sourceSymbol;
            return this;
        }

        public Builder destinationSymbol(String destinationSymbol) {
            this.destinationSymbol = destinationSymbol;
            return this;
        }

        public CreateConversionRequest build() throws CoinbaseClientException {
            this.validate();
            return new CreateConversionRequest(this);
        }

        private void validate() throws CoinbaseClientException {
            if (isNullOrEmpty(this.portfolioId)) {
                throw new CoinbaseClientException("PortfolioId cannot be null");
            }

            if (isNullOrEmpty(this.walletId)) {
                throw new CoinbaseClientException("WalletId cannot be null");
            }
        }
    }
}
