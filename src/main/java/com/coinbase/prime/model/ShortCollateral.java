package com.coinbase.prime.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ShortCollateral {
    @JsonProperty("old_balance")
    private String oldBalance;

    @JsonProperty("new_balance")
    private String newBalance;

    @JsonProperty("loan_interest_rate")
    private String loanInterestRate;

    @JsonProperty("collateral_interest_rate")
    private String collateralInterestRate;

    public ShortCollateral() {}

    public ShortCollateral(Builder builder) {
        this.oldBalance = builder.oldBalance;
        this.newBalance = builder.newBalance;
        this.loanInterestRate = builder.loanInterestRate;
        this.collateralInterestRate = builder.collateralInterestRate;
    }

    public String getOldBalance() {
        return oldBalance;
    }

    public void setOldBalance(String oldBalance) {
        this.oldBalance = oldBalance;
    }

    public String getNewBalance() {
        return newBalance;
    }

    public void setNewBalance(String newBalance) {
        this.newBalance = newBalance;
    }

    public String getLoanInterestRate() {
        return loanInterestRate;
    }

    public void setLoanInterestRate(String loanInterestRate) {
        this.loanInterestRate = loanInterestRate;
    }

    public String getCollateralInterestRate() {
        return collateralInterestRate;
    }

    public void setCollateralInterestRate(String collateralInterestRate) {
        this.collateralInterestRate = collateralInterestRate;
    }

    public static class Builder {
        private String oldBalance;
        private String newBalance;
        private String loanInterestRate;
        private String collateralInterestRate;

        public Builder() {}

        public Builder oldBalance(String oldBalance) {
            this.oldBalance = oldBalance;
            return this;
        }

        public Builder newBalance(String newBalance) {
            this.newBalance = newBalance;
            return this;
        }

        public Builder loanInterestRate(String loanInterestRate) {
            this.loanInterestRate = loanInterestRate;
            return this;
        }

        public Builder collateralInterestRate(String collateralInterestRate) {
            this.collateralInterestRate = collateralInterestRate;
            return this;
        }

        public ShortCollateral build() {
            return new ShortCollateral(this);
        }
    }
}
