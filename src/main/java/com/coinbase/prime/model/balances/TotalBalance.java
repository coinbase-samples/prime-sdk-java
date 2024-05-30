package com.coinbase.prime.model.balances;

public class TotalBalance {
    private String total;
    private String holds;

    public TotalBalance() {
    }

    public TotalBalance(Builder builder) {
        this.total = builder.total;
        this.holds = builder.holds;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getHolds() {
        return holds;
    }

    public void setHolds(String holds) {
        this.holds = holds;
    }

    public static class Builder {
        private String total;
        private String holds;

        public Builder() {
        }

        public Builder total(String total) {
            this.total = total;
            return this;
        }

        public Builder holds(String holds) {
            this.holds = holds;
            return this;
        }

        public TotalBalance build() {
            return new TotalBalance(this);
        }
    }
}
