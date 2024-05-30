package com.coinbase.prime.model.balances;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Balance {
    private String symbol;
    private String amount;
    private String holds;
    @JsonProperty("bonded_amount")
    private String bondedAmount;
    @JsonProperty("reserved_amount")
    private String reservedAmount;
    @JsonProperty("unbonding_amount")
    private String unbondingAmount;
    @JsonProperty("unvested_amount")
    private String unvestedAmount;
    @JsonProperty("pending_rewards_amount")
    private String pendingRewardsAmount;
    @JsonProperty("past_rewards_amount")
    private String pastRewardsAmount;
    @JsonProperty("bondable_amount")
    private String bondableAmount;
    @JsonProperty("withdrawable_amount")
    private String withdrawableAmount;

    public Balance() {
    }

    public Balance(Builder builder) {
        this.symbol = builder.symbol;
        this.amount = builder.amount;
        this.holds = builder.holds;
        this.bondedAmount = builder.bondedAmount;
        this.reservedAmount = builder.reservedAmount;
        this.unbondingAmount = builder.unbondingAmount;
        this.unvestedAmount = builder.unvestedAmount;
        this.pendingRewardsAmount = builder.pendingRewardsAmount;
        this.pastRewardsAmount = builder.pastRewardsAmount;
        this.bondableAmount = builder.bondableAmount;
        this.withdrawableAmount = builder.withdrawableAmount;
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

    public String getHolds() {
        return holds;
    }

    public void setHolds(String holds) {
        this.holds = holds;
    }

    public String getBondedAmount() {
        return bondedAmount;
    }

    public void setBondedAmount(String bondedAmount) {
        this.bondedAmount = bondedAmount;
    }

    public String getReservedAmount() {
        return reservedAmount;
    }

    public void setReservedAmount(String reservedAmount) {
        this.reservedAmount = reservedAmount;
    }

    public String getUnbondingAmount() {
        return unbondingAmount;
    }

    public void setUnbondingAmount(String unbondingAmount) {
        this.unbondingAmount = unbondingAmount;
    }

    public String getUnvestedAmount() {
        return unvestedAmount;
    }

    public void setUnvestedAmount(String unvestedAmount) {
        this.unvestedAmount = unvestedAmount;
    }

    public String getPendingRewardsAmount() {
        return pendingRewardsAmount;
    }

    public void setPendingRewardsAmount(String pendingRewardsAmount) {
        this.pendingRewardsAmount = pendingRewardsAmount;
    }

    public String getPastRewardsAmount() {
        return pastRewardsAmount;
    }

    public void setPastRewardsAmount(String pastRewardsAmount) {
        this.pastRewardsAmount = pastRewardsAmount;
    }

    public String getBondableAmount() {
        return bondableAmount;
    }

    public void setBondableAmount(String bondableAmount) {
        this.bondableAmount = bondableAmount;
    }

    public String getWithdrawableAmount() {
        return withdrawableAmount;
    }

    public void setWithdrawableAmount(String withdrawableAmount) {
        this.withdrawableAmount = withdrawableAmount;
    }

    public static class Builder {
        private String symbol;
        private String amount;
        private String holds;
        private String bondedAmount;
        private String reservedAmount;
        private String unbondingAmount;
        private String unvestedAmount;
        private String pendingRewardsAmount;
        private String pastRewardsAmount;
        private String bondableAmount;
        private String withdrawableAmount;

        public Builder symbol(String symbol) {
            this.symbol = symbol;
            return this;
        }

        public Builder amount(String amount) {
            this.amount = amount;
            return this;
        }

        public Builder holds(String holds) {
            this.holds = holds;
            return this;
        }

        public Builder bondedAmount(String bondedAmount) {
            this.bondedAmount = bondedAmount;
            return this;
        }

        public Builder reservedAmount(String reservedAmount) {
            this.reservedAmount = reservedAmount;
            return this;
        }

        public Builder unbondingAmount(String unbondingAmount) {
            this.unbondingAmount = unbondingAmount;
            return this;
        }

        public Builder unvestedAmount(String unvestedAmount) {
            this.unvestedAmount = unvestedAmount;
            return this;
        }

        public Builder pendingRewardsAmount(String pendingRewardsAmount) {
            this.pendingRewardsAmount = pendingRewardsAmount;
            return this;
        }

        public Builder pastRewardsAmount(String pastRewardsAmount) {
            this.pastRewardsAmount = pastRewardsAmount;
            return this;
        }

        public Builder bondableAmount(String bondableAmount) {
            this.bondableAmount = bondableAmount;
            return this;
        }

        public Builder withdrawableAmount(String withdrawableAmount) {
            this.withdrawableAmount = withdrawableAmount;
            return this;
        }

        public Balance build() {
            return new Balance(this);
        }
    }
}
