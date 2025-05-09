package com.coinbase.prime.staking;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateStakeResponse {
    @JsonProperty("wallet_id")
    private String walletId;

    @JsonProperty("transaction_id")
    private String transactionId;

    @JsonProperty("activity_id")
    private String activityId;

    public CreateStakeResponse() {
    }

    public CreateStakeResponse(Builder builder) {
        this.walletId = builder.walletId;
        this.transactionId = builder.transactionId;
        this.activityId = builder.activityId;
    }

    public String getWalletId() {
        return walletId;
    }

    public void setWalletId(String walletId) {
        this.walletId = walletId;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getActivityId() {
        return activityId;
    }

    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }

    public static class Builder {
        private String walletId;
        private String transactionId;
        private String activityId;

        public Builder() {
        }

        public Builder walletId(String walletId) {
            this.walletId = walletId;
            return this;
        }

        public Builder transactionId(String transactionId) {
            this.transactionId = transactionId;
            return this;
        }

        public Builder activityId(String activityId) {
            this.activityId = activityId;
            return this;
        }

        public CreateStakeResponse build() {
            return new CreateStakeResponse(this);
        }
    }
}
