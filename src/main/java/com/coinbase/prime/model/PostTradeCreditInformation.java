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

public class PostTradeCreditInformation {
    private String portfolioId;

    /**
     * The currency symbol credit is denoted in
     */
    private String currency;

    /**
     * The maximum credit limit
     */
    private String limit;

    /**
     * The amount of credit used
     */
    private String utilized;

    /**
     * The amount of credit available
     */
    private String available;

    /**
     * Whether or not a portfolio is frozen due to balance outstanding or other reason
     */
    private Boolean frozen;

    private String frozenReason;

    /**
     * Whether the portfolio has credit enabled
     */
    private Boolean enabled;

    private String adjustedCreditUtilized;

    private String adjustedPortfolioEquity;

    public PostTradeCreditInformation() {
    }

    public PostTradeCreditInformation(Builder builder) {
        this.portfolioId = builder.portfolioId;
        this.currency = builder.currency;
        this.limit = builder.limit;
        this.utilized = builder.utilized;
        this.available = builder.available;
        this.frozen = builder.frozen;
        this.frozenReason = builder.frozenReason;
        this.enabled = builder.enabled;
        this.adjustedCreditUtilized = builder.adjustedCreditUtilized;
        this.adjustedPortfolioEquity = builder.adjustedPortfolioEquity;
    }

    public String getPortfolioId() {
        return portfolioId;
    }

    public String getCurrency() {
        return currency;
    }

    public String getLimit() {
        return limit;
    }

    public String getUtilized() {
        return utilized;
    }

    public String getAvailable() {
        return available;
    }

    public Boolean isFrozen() {
        return frozen;
    }

    public String getFrozenReason() {
        return frozenReason;
    }

    public Boolean isEnabled() {
        return enabled;
    }

    public String getAdjustedCreditUtilized() {
        return adjustedCreditUtilized;
    }

    public String getAdjustedPortfolioEquity() {
        return adjustedPortfolioEquity;
    }

    public void setPortfolioId(String portfolioId) {
        this.portfolioId = portfolioId;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    public void setUtilized(String utilized) {
        this.utilized = utilized;
    }

    public void setAvailable(String available) {
        this.available = available;
    }

    public void setFrozen(Boolean frozen) {
        this.frozen = frozen;
    }

    public void setFrozenReason(String frozenReason) {
        this.frozenReason = frozenReason;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public void setAdjustedCreditUtilized(String adjustedCreditUtilized) {
        this.adjustedCreditUtilized = adjustedCreditUtilized;
    }

    public void setAdjustedPortfolioEquity(String adjustedPortfolioEquity) {
        this.adjustedPortfolioEquity = adjustedPortfolioEquity;
    }

    public static class Builder {
        private String portfolioId;

        private String currency;

        private String limit;

        private String utilized;

        private String available;

        private Boolean frozen;

        private String frozenReason;

        private Boolean enabled;

        private String adjustedCreditUtilized;

        private String adjustedPortfolioEquity;

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

        public Builder frozen(Boolean frozen) {
            this.frozen = frozen;
            return this;
        }

        public Builder frozenReason(String frozenReason) {
            this.frozenReason = frozenReason;
            return this;
        }

        public Builder enabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder adjustedCreditUtilized(String adjustedCreditUtilized) {
            this.adjustedCreditUtilized = adjustedCreditUtilized;
            return this;
        }

        public Builder adjustedPortfolioEquity(String adjustedPortfolioEquity) {
            this.adjustedPortfolioEquity = adjustedPortfolioEquity;
            return this;
        }

        public PostTradeCreditInformation build() {
            return new PostTradeCreditInformation(this);
        }
    }
}
