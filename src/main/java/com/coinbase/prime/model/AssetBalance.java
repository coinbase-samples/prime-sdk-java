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

import com.fasterxml.jackson.annotation.JsonProperty;

public class AssetBalance {
    @JsonProperty("portfolio_id")
    private String portfolioId;

    private String symbol;

    private String amount;

    @JsonProperty("notional_amount")
    private String notionalAmount;

    @JsonProperty("conversion_rate")
    private String conversionRate;

    public AssetBalance() {
    }

    public AssetBalance(Builder builder) {
        this.portfolioId = builder.portfolioId;
        this.symbol = builder.symbol;
        this.amount = builder.amount;
        this.notionalAmount = builder.notionalAmount;
        this.conversionRate = builder.conversionRate;
    }

    public String getPortfolioId() {
        return portfolioId;
    }

    public void setPortfolioId(String portfolioId) {
        this.portfolioId = portfolioId;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getNotionalAmount() {
        return notionalAmount;
    }

    public void setNotionalAmount(String notionalAmount) {
        this.notionalAmount = notionalAmount;
    }

    public String getConversionRate() {
        return conversionRate;
    }

    public void setConversionRate(String conversionRate) {
        this.conversionRate = conversionRate;
    }

    public static class Builder {
        private String portfolioId;
        private String symbol;
        private String amount;
        private String notionalAmount;
        private String conversionRate;

        public Builder() {
        }

        public Builder portfolioId(String portfolioId) {
            this.portfolioId = portfolioId;
            return this;
        }

        public Builder symbol(String symbol) {
            this.symbol = symbol;
            return this;
        }

        public Builder amount(String amount) {
            this.amount = amount;
            return this;
        }

        public Builder notionalAmount(String notionalAmount) {
            this.notionalAmount = notionalAmount;
            return this;
        }

        public Builder conversionRate(String conversionRate) {
            this.conversionRate = conversionRate;
            return this;
        }

        public AssetBalance build() {
            return new AssetBalance(this);
        }
    }
}
