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

public class Accrual {
    private String accrualId;

    private String date;

    private String portfolioId;

    private String symbol;

    private String interestRate;

    private String nominalAccrual;

    private String notionalAccrual;

    private String conversionRate;

    private String loanAmount;

    private String benchmarkRate;

    private String spread;

    private String loanAmountNotional;

    private String nominalOpenBorrowSod;

    private String notionalOpenBorrowSod;

    public Accrual() {
    }

    public Accrual(Builder builder) {
        this.accrualId = builder.accrualId;
        this.date = builder.date;
        this.portfolioId = builder.portfolioId;
        this.symbol = builder.symbol;
        this.interestRate = builder.interestRate;
        this.nominalAccrual = builder.nominalAccrual;
        this.notionalAccrual = builder.notionalAccrual;
        this.conversionRate = builder.conversionRate;
        this.loanAmount = builder.loanAmount;
        this.benchmarkRate = builder.benchmarkRate;
        this.spread = builder.spread;
        this.loanAmountNotional = builder.loanAmountNotional;
        this.nominalOpenBorrowSod = builder.nominalOpenBorrowSod;
        this.notionalOpenBorrowSod = builder.notionalOpenBorrowSod;
    }

    public String getAccrualId() {
        return accrualId;
    }

    public String getDate() {
        return date;
    }

    public String getPortfolioId() {
        return portfolioId;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getInterestRate() {
        return interestRate;
    }

    public String getNominalAccrual() {
        return nominalAccrual;
    }

    public String getNotionalAccrual() {
        return notionalAccrual;
    }

    public String getConversionRate() {
        return conversionRate;
    }

    public String getLoanAmount() {
        return loanAmount;
    }

    public String getBenchmarkRate() {
        return benchmarkRate;
    }

    public String getSpread() {
        return spread;
    }

    public String getLoanAmountNotional() {
        return loanAmountNotional;
    }

    public String getNominalOpenBorrowSod() {
        return nominalOpenBorrowSod;
    }

    public String getNotionalOpenBorrowSod() {
        return notionalOpenBorrowSod;
    }

    public void setAccrualId(String accrualId) {
        this.accrualId = accrualId;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setPortfolioId(String portfolioId) {
        this.portfolioId = portfolioId;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public void setInterestRate(String interestRate) {
        this.interestRate = interestRate;
    }

    public void setNominalAccrual(String nominalAccrual) {
        this.nominalAccrual = nominalAccrual;
    }

    public void setNotionalAccrual(String notionalAccrual) {
        this.notionalAccrual = notionalAccrual;
    }

    public void setConversionRate(String conversionRate) {
        this.conversionRate = conversionRate;
    }

    public void setLoanAmount(String loanAmount) {
        this.loanAmount = loanAmount;
    }

    public void setBenchmarkRate(String benchmarkRate) {
        this.benchmarkRate = benchmarkRate;
    }

    public void setSpread(String spread) {
        this.spread = spread;
    }

    public void setLoanAmountNotional(String loanAmountNotional) {
        this.loanAmountNotional = loanAmountNotional;
    }

    public void setNominalOpenBorrowSod(String nominalOpenBorrowSod) {
        this.nominalOpenBorrowSod = nominalOpenBorrowSod;
    }

    public void setNotionalOpenBorrowSod(String notionalOpenBorrowSod) {
        this.notionalOpenBorrowSod = notionalOpenBorrowSod;
    }

    public static class Builder {
        private String accrualId;

        private String date;

        private String portfolioId;

        private String symbol;

        private String interestRate;

        private String nominalAccrual;

        private String notionalAccrual;

        private String conversionRate;

        private String loanAmount;

        private String benchmarkRate;

        private String spread;

        private String loanAmountNotional;

        private String nominalOpenBorrowSod;

        private String notionalOpenBorrowSod;

        public Builder accrualId(String accrualId) {
            this.accrualId = accrualId;
            return this;
        }

        public Builder date(String date) {
            this.date = date;
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

        public Builder interestRate(String interestRate) {
            this.interestRate = interestRate;
            return this;
        }

        public Builder nominalAccrual(String nominalAccrual) {
            this.nominalAccrual = nominalAccrual;
            return this;
        }

        public Builder notionalAccrual(String notionalAccrual) {
            this.notionalAccrual = notionalAccrual;
            return this;
        }

        public Builder conversionRate(String conversionRate) {
            this.conversionRate = conversionRate;
            return this;
        }

        public Builder loanAmount(String loanAmount) {
            this.loanAmount = loanAmount;
            return this;
        }

        public Builder benchmarkRate(String benchmarkRate) {
            this.benchmarkRate = benchmarkRate;
            return this;
        }

        public Builder spread(String spread) {
            this.spread = spread;
            return this;
        }

        public Builder loanAmountNotional(String loanAmountNotional) {
            this.loanAmountNotional = loanAmountNotional;
            return this;
        }

        public Builder nominalOpenBorrowSod(String nominalOpenBorrowSod) {
            this.nominalOpenBorrowSod = nominalOpenBorrowSod;
            return this;
        }

        public Builder notionalOpenBorrowSod(String notionalOpenBorrowSod) {
            this.notionalOpenBorrowSod = notionalOpenBorrowSod;
            return this;
        }

        public Accrual build() {
            return new Accrual(this);
        }
    }
}
