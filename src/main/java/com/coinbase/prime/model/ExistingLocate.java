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

public class ExistingLocate {
    private String locateId;

    private String entityId;

    private String portfolioId;

    /**
     * The currency symbol
     */
    private String symbol;

    private String requestedAmount;

    private String interestRate;

    private String status;

    private String approvedAmount;

    private String conversionDate;

    private String createdAt;

    private String locateDate;

    public ExistingLocate() {
    }

    public ExistingLocate(Builder builder) {
        this.locateId = builder.locateId;
        this.entityId = builder.entityId;
        this.portfolioId = builder.portfolioId;
        this.symbol = builder.symbol;
        this.requestedAmount = builder.requestedAmount;
        this.interestRate = builder.interestRate;
        this.status = builder.status;
        this.approvedAmount = builder.approvedAmount;
        this.conversionDate = builder.conversionDate;
        this.createdAt = builder.createdAt;
        this.locateDate = builder.locateDate;
    }

    public String getLocateId() {
        return locateId;
    }

    public String getEntityId() {
        return entityId;
    }

    public String getPortfolioId() {
        return portfolioId;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getRequestedAmount() {
        return requestedAmount;
    }

    public String getInterestRate() {
        return interestRate;
    }

    public String getStatus() {
        return status;
    }

    public String getApprovedAmount() {
        return approvedAmount;
    }

    public String getConversionDate() {
        return conversionDate;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getLocateDate() {
        return locateDate;
    }

    public void setLocateId(String locateId) {
        this.locateId = locateId;
    }

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    public void setPortfolioId(String portfolioId) {
        this.portfolioId = portfolioId;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public void setRequestedAmount(String requestedAmount) {
        this.requestedAmount = requestedAmount;
    }

    public void setInterestRate(String interestRate) {
        this.interestRate = interestRate;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setApprovedAmount(String approvedAmount) {
        this.approvedAmount = approvedAmount;
    }

    public void setConversionDate(String conversionDate) {
        this.conversionDate = conversionDate;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public void setLocateDate(String locateDate) {
        this.locateDate = locateDate;
    }

    public static class Builder {
        private String locateId;

        private String entityId;

        private String portfolioId;

        private String symbol;

        private String requestedAmount;

        private String interestRate;

        private String status;

        private String approvedAmount;

        private String conversionDate;

        private String createdAt;

        private String locateDate;

        public Builder locateId(String locateId) {
            this.locateId = locateId;
            return this;
        }

        public Builder entityId(String entityId) {
            this.entityId = entityId;
            return this;
        }

        public Builder portfolioId(String portfolioId) {
            this.portfolioId = portfolioId;
            return this;
        }

        public Builder symbol(String symbol) {
            this.symbol = symbol;
            return this;
        }

        public Builder requestedAmount(String requestedAmount) {
            this.requestedAmount = requestedAmount;
            return this;
        }

        public Builder interestRate(String interestRate) {
            this.interestRate = interestRate;
            return this;
        }

        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public Builder approvedAmount(String approvedAmount) {
            this.approvedAmount = approvedAmount;
            return this;
        }

        public Builder conversionDate(String conversionDate) {
            this.conversionDate = conversionDate;
            return this;
        }

        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Builder locateDate(String locateDate) {
            this.locateDate = locateDate;
            return this;
        }

        public ExistingLocate build() {
            return new ExistingLocate(this);
        }
    }
}
