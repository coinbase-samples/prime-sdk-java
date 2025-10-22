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

public class EntityBalance {
    /**
     * The display symbol for the asset
     */
    private String symbol;

    private String longAmount;

    private String longNotional;

    private String shortAmount;

    private String shortNotional;

    public EntityBalance() {
    }

    public EntityBalance(Builder builder) {
        this.symbol = builder.symbol;
        this.longAmount = builder.longAmount;
        this.longNotional = builder.longNotional;
        this.shortAmount = builder.shortAmount;
        this.shortNotional = builder.shortNotional;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getLongAmount() {
        return longAmount;
    }

    public String getLongNotional() {
        return longNotional;
    }

    public String getShortAmount() {
        return shortAmount;
    }

    public String getShortNotional() {
        return shortNotional;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public void setLongAmount(String longAmount) {
        this.longAmount = longAmount;
    }

    public void setLongNotional(String longNotional) {
        this.longNotional = longNotional;
    }

    public void setShortAmount(String shortAmount) {
        this.shortAmount = shortAmount;
    }

    public void setShortNotional(String shortNotional) {
        this.shortNotional = shortNotional;
    }

    public static class Builder {
        private String symbol;

        private String longAmount;

        private String longNotional;

        private String shortAmount;

        private String shortNotional;

        public Builder symbol(String symbol) {
            this.symbol = symbol;
            return this;
        }

        public Builder longAmount(String longAmount) {
            this.longAmount = longAmount;
            return this;
        }

        public Builder longNotional(String longNotional) {
            this.longNotional = longNotional;
            return this;
        }

        public Builder shortAmount(String shortAmount) {
            this.shortAmount = shortAmount;
            return this;
        }

        public Builder shortNotional(String shortNotional) {
            this.shortNotional = shortNotional;
            return this;
        }

        public EntityBalance build() {
            return new EntityBalance(this);
        }
    }
}
