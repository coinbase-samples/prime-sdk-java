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

import com.coinbase.core.errors.CoinbaseClientException;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import static com.coinbase.core.utils.Utils.*;
import java.util.UUID;

public class CreateWalletTransferRequest {
    @JsonProperty(required = true, value = "portfolio_id")
    @JsonIgnore
    private String portfolioId;
    @JsonProperty(required = true, value = "wallet_id")
    @JsonIgnore
    private String walletId;
    private String amount;
    @JsonProperty("currency_symbol")
    private String currencySymbol;
    private String destination;
    @JsonProperty("idempotency_key")
    private String idempotencyKey;

    public CreateWalletTransferRequest() {
    }

    public CreateWalletTransferRequest(Builder builder) {
        this.portfolioId = builder.portfolioId;
        this.walletId = builder.walletId;
        this.amount = builder.amount;
        this.currencySymbol = builder.currencySymbol;
        this.destination = builder.destination;
        this.idempotencyKey = builder.idempotencyKey;
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

    public String getCurrencySymbol() {
        return currencySymbol;
    }

    public void setCurrencySymbol(String currencySymbol) {
        this.currencySymbol = currencySymbol;
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

    public static class Builder {
        private final String portfolioId;
        private final String walletId;
        private String amount;
        private String currencySymbol;
        private String destination;
        private String idempotencyKey;

        public Builder(String portfolioId, String walletId) {
            this.portfolioId = portfolioId;
            this.walletId = walletId;
        }

        public Builder amount(String amount) {
            this.amount = amount;
            return this;
        }

        public Builder currencySymbol(String currencySymbol) {
            this.currencySymbol = currencySymbol;
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

        public CreateWalletTransferRequest build() throws CoinbaseClientException {
            this.validate();
            if (isNullOrEmpty(this.idempotencyKey)) {
                this.idempotencyKey(UUID.randomUUID().toString());
            }
            return new CreateWalletTransferRequest(this);
        }

        private void validate() throws CoinbaseClientException {
            if (isNullOrEmpty(this.portfolioId)) {
                throw new CoinbaseClientException("PortfolioId is required");
            }
            if (isNullOrEmpty(this.walletId)) {
                throw new CoinbaseClientException("WalletId is required");
            }
            if (isNullOrEmpty(this.amount)) {
                throw new CoinbaseClientException("Amount is required");
            }
            if (isNullOrEmpty(this.currencySymbol)) {
                throw new CoinbaseClientException("Currency symbol is required");
            }
            if (isNullOrEmpty(this.destination)) {
                throw new CoinbaseClientException("Destination is required");
            }
        }
    }
}
