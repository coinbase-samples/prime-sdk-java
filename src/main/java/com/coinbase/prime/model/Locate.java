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

public class Locate {
    private String symbol;
    private String quantity;
    private String rate;

    public Locate() {
    }

    public Locate(String symbol, String quantity, String rate) {
        this.symbol = symbol;
        this.quantity = quantity;
        this.rate = rate;
    }

    public Locate(Builder builder) {
        this.symbol = builder.symbol;
        this.quantity = builder.quantity;
        this.rate = builder.rate;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public static class Builder {
        private String symbol;
        private String quantity;
        private String rate;

        public Builder() {
        }

        public Builder withSymbol(String symbol) {
            this.symbol = symbol;
            return this;
        }

        public Builder withQuantity(String quantity) {
            this.quantity = quantity;
            return this;
        }

        public Builder withRate(String rate) {
            this.rate = rate;
            return this;
        }

        public Locate build() {
            return new Locate(this);
        }
    }
}
