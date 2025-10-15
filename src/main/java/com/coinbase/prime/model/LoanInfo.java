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

public class LoanInfo {
    private String portfolioId;

    private String symbol;

    private String amount;

    private String notionalAmount;

    private String dueDate;

    public LoanInfo() {
    }

    public LoanInfo(Builder builder) {
        this.portfolioId = builder.portfolioId;
        this.symbol = builder.symbol;
        this.amount = builder.amount;
        this.notionalAmount = builder.notionalAmount;
        this.dueDate = builder.dueDate;
    }

    public String getPortfolioId() {
        return portfolioId;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getAmount() {
        return amount;
    }

    public String getNotionalAmount() {
        return notionalAmount;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setPortfolioId(String portfolioId) {
        this.portfolioId = portfolioId;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public void setNotionalAmount(String notionalAmount) {
        this.notionalAmount = notionalAmount;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public static class Builder {
        private String portfolioId;

        private String symbol;

        private String amount;

        private String notionalAmount;

        private String dueDate;

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

        public Builder dueDate(String dueDate) {
            this.dueDate = dueDate;
            return this;
        }

        public LoanInfo build() {
            return new LoanInfo(this);
        }
    }
}
