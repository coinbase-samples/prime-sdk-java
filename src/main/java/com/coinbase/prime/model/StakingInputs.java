package com.coinbase.prime.model;

public class StakingInputs {
    private String amount;

    public StakingInputs() {
    }

    public StakingInputs(Builder builder) {
        this.amount = builder.amount;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public static class Builder {
        private String amount;

        public Builder() {
        }

        public Builder amount(String amount) {
            this.amount = amount;
            return this;
        }

        public StakingInputs build() {
            return new StakingInputs(this);
        }
    }
}
