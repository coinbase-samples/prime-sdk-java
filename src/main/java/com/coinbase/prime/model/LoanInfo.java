package com.coinbase.prime.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;

public class LoanInfo {
    /**
     * The unique ID of the portfolio
     */
    private String portfolioId;

    /**
     * The currency symbol
     */
    private String symbol;

    /**
     * Balance amount
     */
    private String amount;

    /**
     * Notional balance amount
     */
    private String notionalAmount;

    /**
     * Settlement due date
     */
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
    public String getDueDate() {
        return dueDate;
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

