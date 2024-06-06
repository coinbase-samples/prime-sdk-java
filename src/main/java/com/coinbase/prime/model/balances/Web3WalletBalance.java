/*
 *
 *  Copyright 2024-present Coinbase Global, Inc.
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
 *
 */

package com.coinbase.prime.model.balances;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Web3WalletBalance {
    private Web3WalletAsset asset;
    private String amount;
    @JsonProperty("visibility_status")
    private VisibilityStatus visibilityStatus;

    public Web3WalletBalance() {
    }

    public Web3WalletBalance(Builder builder) {
        this.asset = builder.asset;
        this.amount = builder.amount;
        this.visibilityStatus = builder.visibilityStatus;
    }

    public Web3WalletAsset getAsset() {
        return asset;
    }

    public void setAsset(Web3WalletAsset asset) {
        this.asset = asset;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public VisibilityStatus getVisibilityStatus() {
        return visibilityStatus;
    }

    public void setVisibilityStatus(VisibilityStatus visibilityStatus) {
        this.visibilityStatus = visibilityStatus;
    }

    public static class Builder {
        private Web3WalletAsset asset;
        private String amount;
        private VisibilityStatus visibilityStatus;

        public Builder() {
        }

        public Builder asset(Web3WalletAsset asset) {
            this.asset = asset;
            return this;
        }

        public Builder amount(String amount) {
            this.amount = amount;
            return this;
        }

        public Builder visibilityStatus(VisibilityStatus visibilityStatus) {
            this.visibilityStatus = visibilityStatus;
            return this;
        }

        public Web3WalletBalance build() {
            return new Web3WalletBalance(this);
        }
    }
}
