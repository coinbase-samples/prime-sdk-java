// Copyright 2025-present Coinbase Global, Inc.
//
//  Licensed under the Apache License, Version 2.0 (the "License");
//  you may not use this file except in compliance with the License.
//  You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
//  Unless required by applicable law or agreed to in writing, software
//  distributed under the License is distributed on an "AS IS" BASIS,
//  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//  See the License for the specific language governing permissions and
//  limitations under the License.
package com.coinbase.prime.model;

import com.coinbase.prime.model.enums.VisibilityStatus;

public class OnchainBalance {
    private OnchainAsset asset;

    /**
     * The total amount in whole units with full precision.
     */
    private String amount;

    private VisibilityStatus visibilityStatus;

    public OnchainBalance() {
    }

    public OnchainBalance(Builder builder) {
        this.asset = builder.asset;
        this.amount = builder.amount;
        this.visibilityStatus = builder.visibilityStatus;
    }

    public OnchainAsset getAsset() {
        return asset;
    }

    public String getAmount() {
        return amount;
    }

    public VisibilityStatus getVisibilityStatus() {
        return visibilityStatus;
    }

    public void setAsset(OnchainAsset asset) {
        this.asset = asset;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public void setVisibilityStatus(VisibilityStatus visibilityStatus) {
        this.visibilityStatus = visibilityStatus;
    }

    public static class Builder {
        private OnchainAsset asset;

        private String amount;

        private VisibilityStatus visibilityStatus;

        public Builder asset(OnchainAsset asset) {
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

        public OnchainBalance build() {
            return new OnchainBalance(this);
        }
    }
}
