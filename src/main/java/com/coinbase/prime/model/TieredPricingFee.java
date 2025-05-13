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

package com.coinbase.prime.model;

public class TieredPricingFee {
    private String symbol;

    private String fee;

    public TieredPricingFee() {}

    public TieredPricingFee(TieredPricingFee.Builder builder) {
        this.symbol = builder.symbol;
        this.fee = builder.fee;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getFee() {
        return fee;
    }

    public void setFee(String fee) {
        this.fee = fee;
    }

    public static class Builder {
        private String symbol;
        private String fee;

        public Builder() {}

        public TieredPricingFee.Builder withSymbol(String symbol) {
            this.symbol = symbol;
            return this;
        }

        public TieredPricingFee.Builder withFee(String fee) {
            this.fee = fee;
            return this;
        }

        public TieredPricingFee build() {
            return new TieredPricingFee(this);
        }
    }
}
