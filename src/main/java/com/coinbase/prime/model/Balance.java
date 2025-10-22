package com.coinbase.prime.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;

public class Balance {
    /**
     * The display symbol for the asset
     */
    private String symbol;

    /**
     * The total amount in whole units with full precision. Includes the &#x60;holds&#x60; amount.
     */
    private String amount;

    /**
     * Amount that is currently held in obligation to an open order&#39;s position or a pending withdrawal
     */
    private String holds;

    /**
     * Amount that is currently locked due to bonding/staking, potentially subject to an unbonding period, in whole units
     */
    private String bondedAmount;

    /**
     * Amount that must remain in the wallet due to the protocol, in whole units
     */
    private String reservedAmount;

    /**
     * Amount that is in the process of unbonding, in whole units
     */
    private String unbondingAmount;

    /**
     * Unrealized amount subject to a vesting schedule, in whole units
     */
    private String unvestedAmount;

    /**
     * Pending bonding/staking rewards that have not yet been realized, in whole units
     */
    private String pendingRewardsAmount;

    /**
     * Previously realized bonding/staking rewards, in whole units
     */
    private String pastRewardsAmount;

    /**
     * Amount available for bonding/staking, in whole units
     */
    private String bondableAmount;

    /**
     * Amount available to withdraw, in whole units
     */
    private String withdrawableAmount;

    /**
     * The total amount in fiat unit
     */
    private String fiatAmount;

    /**
     * Amount available for unbonding/unstaking, in whole units
     */
    private String unbondableAmount;

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
        this.fiatAmount = builder.fiatAmount;
        this.unbondableAmount = builder.unbondableAmount;
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
    public String getFiatAmount() {
        return fiatAmount;
    }

    public void setFiatAmount(String fiatAmount) {
        this.fiatAmount = fiatAmount;
    }
    public String getUnbondableAmount() {
        return unbondableAmount;
    }

    public void setUnbondableAmount(String unbondableAmount) {
        this.unbondableAmount = unbondableAmount;
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

        private String fiatAmount;

        private String unbondableAmount;

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

        public Builder fiatAmount(String fiatAmount) {
            this.fiatAmount = fiatAmount;
            return this;
        }

        public Builder unbondableAmount(String unbondableAmount) {
            this.unbondableAmount = unbondableAmount;
            return this;
        }

        public Balance build() {
            return new Balance(this);
        }
    }
}

