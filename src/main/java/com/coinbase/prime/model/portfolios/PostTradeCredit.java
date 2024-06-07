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

package com.coinbase.prime.model.portfolios;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PostTradeCredit {
    private String portfolioId;
    private String currency;
    private String limit;
    private String utilized;
    private String available;
    private boolean frozen;
    @JsonProperty("amounts_due")
    private PostTradeCreditAmountDue[] amountsDue;

    public PostTradeCredit() {}
    public PostTradeCredit(Builder builder) {
        this.portfolioId = builder.portfolioId;
        this.currency = builder.currency;
        this.limit = builder.limit;
        this.utilized = builder.utilized;
        this.available = builder.available;
        this.frozen = builder.frozen;
        this.amountsDue = builder.amountsDue;
    }

    public String getPortfolioId() {
        return portfolioId;
    }

    public void setPortfolioId(String portfolioId) {
        this.portfolioId = portfolioId;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    public String getUtilized() {
        return utilized;
    }

    public void setUtilized(String utilized) {
        this.utilized = utilized;
    }

    public String getAvailable() {
        return available;
    }

    public void setAvailable(String available) {
        this.available = available;
    }

    public boolean isFrozen() {
        return frozen;
    }

    public void setFrozen(boolean frozen) {
        this.frozen = frozen;
    }

    public PostTradeCreditAmountDue[] getAmountsDue() {
        return amountsDue;
    }

    public void setAmountsDue(PostTradeCreditAmountDue[] amountsDue) {
        this.amountsDue = amountsDue;
    }

    public static class Builder {
        private String portfolioId;
        private String currency;
        private String limit;
        private String utilized;
        private String available;
        private boolean frozen;
        private PostTradeCreditAmountDue[] amountsDue;

        public Builder() {}

        public Builder portfolioId(String portfolioId) {
            this.portfolioId = portfolioId;
            return this;
        }

        public Builder currency(String currency) {
            this.currency = currency;
            return this;
        }

        public Builder limit(String limit) {
            this.limit = limit;
            return this;
        }

        public Builder utilized(String utilized) {
            this.utilized = utilized;
            return this;
        }

        public Builder available(String available) {
            this.available = available;
            return this;
        }

        public Builder frozen(boolean frozen) {
            this.frozen = frozen;
            return this;
        }

        public Builder amountsDue(PostTradeCreditAmountDue[] amountsDue) {
            this.amountsDue = amountsDue;
            return this;
        }

        public PostTradeCredit build() {
            return new PostTradeCredit(this);
        }
    }
}
