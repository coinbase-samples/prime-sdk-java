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

import com.fasterxml.jackson.annotation.JsonProperty;

public class PortfolioBalanceType {
    @JsonProperty("trading_balances")
    private AggregatedFiatBalance tradingBalances;

    @JsonProperty("vault_balances")
    private AggregatedFiatBalance vaultBalances;

    @JsonProperty("prime_custody_balances")
    private AggregatedFiatBalance primeCustodyBalances;

    public PortfolioBalanceType() {
    }

    public PortfolioBalanceType(Builder builder) {
        this.tradingBalances = builder.tradingBalances;
        this.vaultBalances = builder.vaultBalances;
        this.primeCustodyBalances = builder.primeCustodyBalances;
    }

    public AggregatedFiatBalance getTradingBalances() {
        return tradingBalances;
    }

    public void setTradingBalances(AggregatedFiatBalance tradingBalances) {
        this.tradingBalances = tradingBalances;
    }

    public AggregatedFiatBalance getVaultBalances() {
        return vaultBalances;
    }

    public void setVaultBalances(AggregatedFiatBalance vaultBalances) {
        this.vaultBalances = vaultBalances;
    }

    public AggregatedFiatBalance getPrimeCustodyBalances() {
        return primeCustodyBalances;
    }

    public void setPrimeCustodyBalances(AggregatedFiatBalance primeCustodyBalances) {
        this.primeCustodyBalances = primeCustodyBalances;
    }

    public static class Builder {
        private AggregatedFiatBalance tradingBalances;
        private AggregatedFiatBalance vaultBalances;
        private AggregatedFiatBalance primeCustodyBalances;

        public Builder() {
        }

        public Builder tradingBalances(AggregatedFiatBalance tradingBalances) {
            this.tradingBalances = tradingBalances;
            return this;
        }

        public Builder vaultBalances(AggregatedFiatBalance vaultBalances) {
            this.vaultBalances = vaultBalances;
            return this;
        }

        public Builder primeCustodyBalances(AggregatedFiatBalance primeCustodyBalances) {
            this.primeCustodyBalances = primeCustodyBalances;
            return this;
        }

        public PortfolioBalanceType build() {
            return new PortfolioBalanceType(this);
        }
    }
}