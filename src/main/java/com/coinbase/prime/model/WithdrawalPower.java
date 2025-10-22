package com.coinbase.prime.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;

public class WithdrawalPower {
    /**
     * The currency symbol
     */
    private String symbol;

    /**
     * Withdrawal power
     */
    private String amount;

    public WithdrawalPower() {
    }

    public WithdrawalPower(Builder builder) {
        this.symbol = builder.symbol;
        this.amount = builder.amount;
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
    public static class Builder {
        private String symbol;

        private String amount;

        public Builder symbol(String symbol) {
            this.symbol = symbol;
            return this;
        }

        public Builder amount(String amount) {
            this.amount = amount;
            return this;
        }

        public WithdrawalPower build() {
            return new WithdrawalPower(this);
        }
    }
}

