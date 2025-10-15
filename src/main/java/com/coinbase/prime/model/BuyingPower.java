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

public class BuyingPower {
    private String portfolioId;

    private String baseCurrency;

    private String quoteCurrency;

    private String baseBuyingPower;

    private String quoteBuyingPower;

    public BuyingPower() {
    }

    public BuyingPower(Builder builder) {
        this.portfolioId = builder.portfolioId;
        this.baseCurrency = builder.baseCurrency;
        this.quoteCurrency = builder.quoteCurrency;
        this.baseBuyingPower = builder.baseBuyingPower;
        this.quoteBuyingPower = builder.quoteBuyingPower;
    }

    public String getPortfolioId() {
        return portfolioId;
    }

    public String getBaseCurrency() {
        return baseCurrency;
    }

    public String getQuoteCurrency() {
        return quoteCurrency;
    }

    public String getBaseBuyingPower() {
        return baseBuyingPower;
    }

    public String getQuoteBuyingPower() {
        return quoteBuyingPower;
    }

    public void setPortfolioId(String portfolioId) {
        this.portfolioId = portfolioId;
    }

    public void setBaseCurrency(String baseCurrency) {
        this.baseCurrency = baseCurrency;
    }

    public void setQuoteCurrency(String quoteCurrency) {
        this.quoteCurrency = quoteCurrency;
    }

    public void setBaseBuyingPower(String baseBuyingPower) {
        this.baseBuyingPower = baseBuyingPower;
    }

    public void setQuoteBuyingPower(String quoteBuyingPower) {
        this.quoteBuyingPower = quoteBuyingPower;
    }

    public static class Builder {
        private String portfolioId;

        private String baseCurrency;

        private String quoteCurrency;

        private String baseBuyingPower;

        private String quoteBuyingPower;

        public Builder portfolioId(String portfolioId) {
            this.portfolioId = portfolioId;
            return this;
        }

        public Builder baseCurrency(String baseCurrency) {
            this.baseCurrency = baseCurrency;
            return this;
        }

        public Builder quoteCurrency(String quoteCurrency) {
            this.quoteCurrency = quoteCurrency;
            return this;
        }

        public Builder baseBuyingPower(String baseBuyingPower) {
            this.baseBuyingPower = baseBuyingPower;
            return this;
        }

        public Builder quoteBuyingPower(String quoteBuyingPower) {
            this.quoteBuyingPower = quoteBuyingPower;
            return this;
        }

        public BuyingPower build() {
            return new BuyingPower(this);
        }
    }
}
