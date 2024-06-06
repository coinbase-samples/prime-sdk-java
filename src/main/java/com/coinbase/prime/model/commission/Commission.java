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

package com.coinbase.prime.model.commission;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Commission {
    private String type;
    private String rate;
    @JsonProperty("trading_volume")
    private String tradingVolume;

    public Commission() {
    }

    public Commission(Builder builder) {
        this.type = builder.type;
        this.rate = builder.rate;
        this.tradingVolume = builder.tradingVolume;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getTradingVolume() {
        return tradingVolume;
    }

    public void setTradingVolume(String tradingVolume) {
        this.tradingVolume = tradingVolume;
    }

    public static class Builder {
        private String type;
        private String rate;
        private String tradingVolume;

        public Builder() {
        }

        public Builder type(String type) {
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
