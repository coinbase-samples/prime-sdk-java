package com.coinbase.prime.model.portfolios;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class PostTradeCreditAmountDue {
    private String currency;
    private String amount;
    @JsonProperty("due_date")
    private Date dueDate;

    public PostTradeCreditAmountDue() {}

    public PostTradeCreditAmountDue(Builder builder) {
        this.currency = builder.currency;
        this.amount = builder.amount;
        this.dueDate = builder.dueDate;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public static class Builder {
        private String currency;
        private String amount;
        private Date dueDate;

        public Builder() {}

        public Builder currency(String currency) {
            this.currency = currency;
            return this;
        }

        public Builder amount(String amount) {
            this.amount = amount;
            return this;
        }

        public Builder dueDate(Date dueDate) {
            this.dueDate = dueDate;
            return this;
        }

        public PostTradeCreditAmountDue build() {
            return new PostTradeCreditAmountDue(this);
        }
    }
}
