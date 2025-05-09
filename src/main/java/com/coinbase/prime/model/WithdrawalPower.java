package com.coinbase.prime.model;

public class WithdrawalPower {
    private String symbol;

    private String amount;

    public WithdrawalPower() {
    }

    public WithdrawalPower(WithdrawalPower.Builder builder) {
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

        public Builder() {
        }

        public WithdrawalPower.Builder withSymbol(String symbol) {
            this.symbol = symbol;
            return this;
        }

        public WithdrawalPower.Builder withAmount(String amount) {
            this.amount = amount;
            return this;
        }

        public WithdrawalPower build() {
            return new WithdrawalPower(this);
        }
    }
}
