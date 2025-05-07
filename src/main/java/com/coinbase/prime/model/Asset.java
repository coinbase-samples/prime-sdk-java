/*
 * Copyright 2024-present Coinbase Global, Inc.
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

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class Asset {
    private String name;
    private String symbol;
    @JsonProperty("decimal_precision")
    private String decimalPrecision;
    @JsonProperty("trading_supported")
    private boolean tradingSupported;
    @JsonProperty("explorer_url")
    private String explorerUrl;
    private List<Network> networks;

    public Asset() {}

    public Asset(Builder builder) {
        this.name = builder.name;
        this.symbol = builder.symbol;
        this.decimalPrecision = builder.decimalPrecision;
        this.tradingSupported = builder.tradingSupported;
        this.explorerUrl = builder.explorerUrl;
        this.networks = builder.networks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getDecimalPrecision() {
        return decimalPrecision;
    }

    public void setDecimalPrecision(String decimalPrecision) {
        this.decimalPrecision = decimalPrecision;
    }

    public boolean isTradingSupported() {
        return tradingSupported;
    }

    public void setTradingSupported(boolean tradingSupported) {
        this.tradingSupported = tradingSupported;
    }

    public String getExplorerUrl() {
        return explorerUrl;
    }

    public void setExplorerUrl(String explorerUrl) {
        this.explorerUrl = explorerUrl;
    }

    public List<Network> getNetworks() {
        return networks;
    }

    public void setNetworks(List<Network> networks) {
        this.networks = networks;
    }

    public static class Builder {
        private String name;
        private String symbol;
        private String decimalPrecision;
        private boolean tradingSupported;
        private String explorerUrl;
        private List<Network> networks;

        public Builder() {}

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder symbol(String symbol) {
            this.symbol = symbol;
            return this;
        }

        public Builder decimalPrecision(String decimalPrecision) {
            this.decimalPrecision = decimalPrecision;
            return this;
        }

        public Builder tradingSupported(boolean tradingSupported) {
            this.tradingSupported = tradingSupported;
            return this;
        }

        public Builder explorerUrl(String explorerUrl) {
            this.explorerUrl = explorerUrl;
            return this;
        }

        public Builder networks(List<Network> networks) {
            this.networks = networks;
            return this;
        }

        public Asset build() {
            return new Asset(this);
        }
    }
}
