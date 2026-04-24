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

package com.coinbase.prime.balances;

import com.coinbase.prime.model.AggregatedFiatBalance;
import com.coinbase.prime.model.Balance;
import com.coinbase.prime.model.enums.PortfolioBalanceType;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * List Portfolio Balances
 */
public class ListPortfolioBalancesResponse {
    @JsonProperty("balances")
    private Balance[] balances;

    @JsonProperty("type")
    private PortfolioBalanceType type;

    @JsonProperty("trading_balances")
    private AggregatedFiatBalance tradingBalances;

    @JsonProperty("vault_balances")
    private AggregatedFiatBalance vaultBalances;

    @JsonProperty("prime_custody_balances")
    private AggregatedFiatBalance primeCustodyBalances;

    public ListPortfolioBalancesResponse() {
    }

    public Balance[] getBalances() {
        return balances;
    }

    public void setBalances(Balance[] balances) {
        this.balances = balances;
    }

    public PortfolioBalanceType getType() {
        return type;
    }

    public void setType(PortfolioBalanceType type) {
        this.type = type;
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

}
