/*
 * Copyright 2025-present Coinbase Global, Inc.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

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
