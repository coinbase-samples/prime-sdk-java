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

package com.coinbase.prime.staking;

import com.coinbase.prime.model.StakingMetadata;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class RequestToUnstakeRequest {
    @JsonIgnore
    @JsonProperty(required = true, value = "portfolio_id")
    private String portfolioId;

    @JsonProperty(required = true, value = "idempotency_key")
    private String idempotencyKey;

    @JsonProperty(required = true, value = "currency_symbol")
    private String currencySymbol;

    @JsonProperty(required = true, value = "amount")
    private String amount;

    @JsonProperty("metadata")
    private StakingMetadata metadata;

    public RequestToUnstakeRequest() {
    }

    public RequestToUnstakeRequest(Builder builder) {
        this.portfolioId = builder.portfolioId;
        this.idempotencyKey = builder.idempotencyKey;
        this.currencySymbol = builder.currencySymbol;
        this.amount = builder.amount;
        this.metadata = builder.metadata;
    }

    public String getPortfolioId() {
        return portfolioId;
    }

    public void setPortfolioId(String portfolioId) {
        this.portfolioId = portfolioId;
    }

    public String getIdempotencyKey() {
        return idempotencyKey;
    }

    public void setIdempotencyKey(String idempotencyKey) {
        this.idempotencyKey = idempotencyKey;
    }

    public String getCurrencySymbol() {
        return currencySymbol;
    }

    public void setCurrencySymbol(String currencySymbol) {
        this.currencySymbol = currencySymbol;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public StakingMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(StakingMetadata metadata) {
        this.metadata = metadata;
    }

    public static class Builder {
        private String portfolioId;
        private String idempotencyKey;
        private String currencySymbol;
        private String amount;
        private StakingMetadata metadata;

        public Builder() {
        }

        public Builder portfolioId(String portfolioId) {
            this.portfolioId = portfolioId;
            return this;
        }

        public Builder idempotencyKey(String idempotencyKey) {
            this.idempotencyKey = idempotencyKey;
            return this;
        }

        public Builder currencySymbol(String currencySymbol) {
            this.currencySymbol = currencySymbol;
            return this;
        }

        public Builder amount(String amount) {
            this.amount = amount;
            return this;
        }

        public Builder metadata(StakingMetadata metadata) {
            this.metadata = metadata;
            return this;
        }

        public RequestToUnstakeRequest build() {
            return new RequestToUnstakeRequest(this);
        }
    }
}
