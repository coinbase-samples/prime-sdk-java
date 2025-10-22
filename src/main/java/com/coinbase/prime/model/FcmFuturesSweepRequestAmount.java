package com.coinbase.prime.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;

public class FcmFuturesSweepRequestAmount {
    /**
     * Currency
     */
    private String currency;

    /**
     * Amount
     */
    private String amount;

    public FcmFuturesSweepRequestAmount() {
    }

    public FcmFuturesSweepRequestAmount(Builder builder) {
        this.currency = builder.currency;
        this.amount = builder.amount;
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
    public static class Builder {
        private String currency;

        private String amount;

        public Builder currency(String currency) {
            this.currency = currency;
            return this;
        }

        public Builder amount(String amount) {
            this.amount = amount;
            return this;
        }

        public FcmFuturesSweepRequestAmount build() {
            return new FcmFuturesSweepRequestAmount(this);
        }
    }
}

