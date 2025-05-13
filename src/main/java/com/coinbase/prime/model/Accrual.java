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

import com.coinbase.prime.model.enums.Benchmark;
import com.coinbase.prime.model.enums.LoanType;
import com.coinbase.prime.model.enums.RateType;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Accrual {
    @JsonProperty("accrual_id")
    private String accrualId;

    private String date;

    @JsonProperty("portfolio_id")
    private String portfolioId;

    private String symbol;

    @JsonProperty("loan_type")
    private LoanType loanType;

    @JsonProperty("interest_rate")
    private String interestRate;

    @JsonProperty("nominal_accrual")
    private String nominalAccrual;

    @JsonProperty("notional_accrual")
    private String notionalAccrual;

    @JsonProperty("conversion_rate")
    private String conversionRate;

    @JsonProperty("loan_amount")
    private String loanAmount;

    private Benchmark benchmark;

    @JsonProperty("benchmark_rate")
    private String benchmarkRate;

    private String spread;

    @JsonProperty("rate_type")
    private RateType rateType;

    @JsonProperty("loan_amount_notional")
    private String loanAmountNotional;

    @JsonProperty("nominal_open_borrow_sod")
    private String nominalOpenBorrowSod;

    @JsonProperty("notional_open_borrow_sod")
    private String notionalOpenBorrowSod;

    public Accrual() {}

    public Accrual(Builder builder) {
        this.accrualId = builder.accrualId;
        this.date = builder.date;
        this.portfolioId = builder.portfolioId;
        this.symbol = builder.symbol;
        this.loanType = builder.loanType;
        this.interestRate = builder.interestRate;
        this.nominalAccrual = builder.nominalAccrual;
        this.notionalAccrual = builder.notionalAccrual;
        this.conversionRate = builder.conversionRate;
        this.loanAmount = builder.loanAmount;
        this.benchmark = builder.benchmark;
        this.benchmarkRate = builder.benchmarkRate;
        this.spread = builder.spread;
        this.rateType = builder.rateType;
        this.loanAmountNotional = builder.loanAmountNotional;
        this.nominalOpenBorrowSod = builder.nominalOpenBorrowSod;
        this.notionalOpenBorrowSod = builder.notionalOpenBorrowSod;
    }

    public String getAccrualId() {
        return accrualId;
    }

    public void setAccrualId(String accrualId) {
        this.accrualId = accrualId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
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

    public LoanType getLoanType() {
        return loanType;
    }

    public void setLoanType(LoanType loanType) {
        this.loanType = loanType;
    }

    public String getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(String interestRate) {
        this.interestRate = interestRate;
    }

    public String getNominalAccrual() {
        return nominalAccrual;
    }

    public void setNominalAccrual(String nominalAccrual) {
        this.nominalAccrual = nominalAccrual;
    }

    public String getNotionalAccrual() {
        return notionalAccrual;
    }

    public void setNotionalAccrual(String notionalAccrual) {
        this.notionalAccrual = notionalAccrual;
    }

    public String getConversionRate() {
        return conversionRate;
    }

    public void setConversionRate(String conversionRate) {
        this.conversionRate = conversionRate;
    }

    public String getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(String loanAmount) {
        this.loanAmount = loanAmount;
    }

    public Benchmark getBenchmark() {
        return benchmark;
    }

    public void setBenchmark(Benchmark benchmark) {
        this.benchmark = benchmark;
    }

    public String getBenchmarkRate() {
        return benchmarkRate;
    }

    public void setBenchmarkRate(String benchmarkRate) {
        this.benchmarkRate = benchmarkRate;
    }

    public String getSpread() {
        return spread;
    }

    public void setSpread(String spread) {
        this.spread = spread;
    }

    public RateType getRateType() {
        return rateType;
    }

    public void setRateType(RateType rateType) {
        this.rateType = rateType;
    }

    public String getLoanAmountNotional() {
        return loanAmountNotional;
    }

    public void setLoanAmountNotional(String loanAmountNotional) {
        this.loanAmountNotional = loanAmountNotional;
    }

    public String getNominalOpenBorrowSod() {
        return nominalOpenBorrowSod;
    }

    public void setNominalOpenBorrowSod(String nominalOpenBorrowSod) {
        this.nominalOpenBorrowSod = nominalOpenBorrowSod;
    }

    public String getNotionalOpenBorrowSod() {
        return notionalOpenBorrowSod;
    }

    public void setNotionalOpenBorrowSod(String notionalOpenBorrowSod) {
        this.notionalOpenBorrowSod = notionalOpenBorrowSod;
    }

    public static class Builder {
        private String accrualId;
        private String date;
        private String portfolioId;
        private String symbol;
        private LoanType loanType;
        private String interestRate;
        private String nominalAccrual;
        private String notionalAccrual;
        private String conversionRate;
        private String loanAmount;
        private Benchmark benchmark;
        private String benchmarkRate;
        private String spread;
        private RateType rateType;
        private String loanAmountNotional;
        private String nominalOpenBorrowSod;
        private String notionalOpenBorrowSod;

        public Builder() {
        }

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

        public Builder loanType(LoanType loanType) {
            this.loanType = loanType;
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

        public Builder benchmark(Benchmark benchmark) {
            this.benchmark = benchmark;
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

        public Builder rateType(RateType rateType) {
            this.rateType = rateType;
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
