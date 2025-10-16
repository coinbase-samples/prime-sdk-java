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

import com.coinbase.prime.model.enums.CommissionType;

public class Commission {
    private CommissionType type;

    private String rate;

    private String tradingVolume;

    public Commission() {
    }

    public Commission(Builder builder) {
        this.type = builder.type;
        this.rate = builder.rate;
        this.tradingVolume = builder.tradingVolume;
    }

    public CommissionType getType() {
        return type;
    }

    public String getRate() {
        return rate;
    }

    public String getTradingVolume() {
        return tradingVolume;
    }

    public void setType(CommissionType type) {
        this.type = type;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public void setTradingVolume(String tradingVolume) {
        this.tradingVolume = tradingVolume;
    }

    public static class Builder {
        private CommissionType type;

        private String rate;

        private String tradingVolume;

        public Builder type(CommissionType type) {
            this.type = type;
            return this;
        }

        public Builder rate(String rate) {
            this.rate = rate;
            return this;
        }

        public Builder tradingVolume(String tradingVolume) {
            this.tradingVolume = tradingVolume;
            return this;
        }

        public Commission build() {
            return new Commission(this);
        }
    }
}
