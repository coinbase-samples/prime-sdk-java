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

package com.coinbase.prime.model.balances;

import com.coinbase.prime.model.enums.BalancesType;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ListPortfolioBalancesResponse {
    private Balance[] balances;
    private BalancesType type;
    @JsonProperty("trading_balances")
    private TotalBalance tradingBalances;
    @JsonProperty("vault_balances")
    private TotalBalance vaultBalances;

    public ListPortfolioBalancesResponse() {
    }

    public ListPortfolioBalancesResponse(Builder builder) {
        this.balances = builder.balances;
        this.type = builder.type;
        this.tradingBalances = builder.tradingBalances;
        this.vaultBalances = builder.vaultBalances;
    }

    public Balance[] getBalances() {
        return balances;
    }

    public void setBalances(Balance[] balances) {
        this.balances = balances;
    }

    public BalancesType getType() {
        return type;
    }

    public void setType(BalancesType type) {
        this.type = type;
    }

    public TotalBalance getTradingBalances() {
        return tradingBalances;
    }

    public void setTradingBalances(TotalBalance tradingBalances) {
        this.tradingBalances = tradingBalances;
    }

    public TotalBalance getVaultBalances() {
        return vaultBalances;
    }

    public void setVaultBalances(TotalBalance vaultBalances) {
        this.vaultBalances = vaultBalances;
    }

    public static class Builder {
        private Balance[] balances;
        private BalancesType type;
        private TotalBalance tradingBalances;
        private TotalBalance vaultBalances;

        public Builder balances(Balance[] balances) {
            this.balances = balances;
            return this;
        }

        public Builder type(BalancesType type) {
            this.type = type;
            return this;
        }

        public Builder tradingBalances(TotalBalance tradingBalances) {
            this.tradingBalances = tradingBalances;
            return this;
        }

        public Builder vaultBalances(TotalBalance vaultBalances) {
            this.vaultBalances = vaultBalances;
            return this;
        }

        public ListPortfolioBalancesResponse build() {
            return new ListPortfolioBalancesResponse(this);
        }
    }
}
