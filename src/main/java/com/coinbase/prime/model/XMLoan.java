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

import java.time.OffsetDateTime;

public class XMLoan {
    private String loanId;

    private String principalCurrency;

    private String principalCurrencyMarketPrice;

    private String initialPrincipalAmount;

    private String outstandingPrincipalAmount;

    private OffsetDateTime createdAt;

    private OffsetDateTime updatedAt;

    public XMLoan() {
    }

    public XMLoan(Builder builder) {
        this.loanId = builder.loanId;
        this.principalCurrency = builder.principalCurrency;
        this.principalCurrencyMarketPrice = builder.principalCurrencyMarketPrice;
        this.initialPrincipalAmount = builder.initialPrincipalAmount;
        this.outstandingPrincipalAmount = builder.outstandingPrincipalAmount;
        this.createdAt = builder.createdAt;
        this.updatedAt = builder.updatedAt;
    }

    public String getLoanId() {
        return loanId;
    }

    public String getPrincipalCurrency() {
        return principalCurrency;
    }

    public String getPrincipalCurrencyMarketPrice() {
        return principalCurrencyMarketPrice;
    }

    public String getInitialPrincipalAmount() {
        return initialPrincipalAmount;
    }

    public String getOutstandingPrincipalAmount() {
        return outstandingPrincipalAmount;
    }

    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setLoanId(String loanId) {
        this.loanId = loanId;
    }

    public void setPrincipalCurrency(String principalCurrency) {
        this.principalCurrency = principalCurrency;
    }

    public void setPrincipalCurrencyMarketPrice(String principalCurrencyMarketPrice) {
        this.principalCurrencyMarketPrice = principalCurrencyMarketPrice;
    }

    public void setInitialPrincipalAmount(String initialPrincipalAmount) {
        this.initialPrincipalAmount = initialPrincipalAmount;
    }

    public void setOutstandingPrincipalAmount(String outstandingPrincipalAmount) {
        this.outstandingPrincipalAmount = outstandingPrincipalAmount;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public static class Builder {
        private String loanId;

        private String principalCurrency;

        private String principalCurrencyMarketPrice;

        private String initialPrincipalAmount;

        private String outstandingPrincipalAmount;

        private OffsetDateTime createdAt;

        private OffsetDateTime updatedAt;

        public Builder loanId(String loanId) {
            this.loanId = loanId;
            return this;
        }

        public Builder principalCurrency(String principalCurrency) {
            this.principalCurrency = principalCurrency;
            return this;
        }

        public Builder principalCurrencyMarketPrice(String principalCurrencyMarketPrice) {
            this.principalCurrencyMarketPrice = principalCurrencyMarketPrice;
            return this;
        }

        public Builder initialPrincipalAmount(String initialPrincipalAmount) {
            this.initialPrincipalAmount = initialPrincipalAmount;
            return this;
        }

        public Builder outstandingPrincipalAmount(String outstandingPrincipalAmount) {
            this.outstandingPrincipalAmount = outstandingPrincipalAmount;
            return this;
        }

        public Builder createdAt(OffsetDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Builder updatedAt(OffsetDateTime updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public XMLoan build() {
            return new XMLoan(this);
        }
    }
}
