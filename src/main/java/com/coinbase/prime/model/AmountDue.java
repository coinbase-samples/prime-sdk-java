package com.coinbase.prime.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.Arrays;

public class AmountDue {
    /**
     * The currency this loan is due in
     */
    private String currency;

    /**
     * The amount due
     */
    private String amount;

    /**
     * The date this settlement is due, expressed in UTC
     */
    private OffsetDateTime dueDate;

    public AmountDue() {
    }

    public AmountDue(Builder builder) {
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
    public OffsetDateTime getDueDate() {
        return dueDate;
    }

    public void setDueDate(OffsetDateTime dueDate) {
        this.dueDate = dueDate;
    }
    public static class Builder {
        private String currency;

        private String amount;

        private OffsetDateTime dueDate;

        public Builder currency(String currency) {
            this.currency = currency;
            return this;
        }

        public Builder amount(String amount) {
            this.amount = amount;
            return this;
        }

        public Builder dueDate(OffsetDateTime dueDate) {
            this.dueDate = dueDate;
            return this;
        }

        public AmountDue build() {
            return new AmountDue(this);
        }
    }
}

