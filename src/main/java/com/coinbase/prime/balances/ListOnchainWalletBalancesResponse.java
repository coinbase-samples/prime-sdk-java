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

import com.coinbase.prime.model.DefiBalance;
import com.coinbase.prime.model.OnchainBalance;
import com.coinbase.prime.common.Pagination;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * List Onchain Wallet Balances
 */
public class ListOnchainWalletBalancesResponse {
    @JsonProperty("balances")
    private OnchainBalance[] balances;

    @JsonProperty("pagination")
    private Pagination pagination;

    @JsonProperty("defi_balances")
    private DefiBalance[] defiBalances;

    public ListOnchainWalletBalancesResponse() {
    }

    public OnchainBalance[] getBalances() {
        return balances;
    }

    public void setBalances(OnchainBalance[] balances) {
        this.balances = balances;
    }

    public Pagination getPagination() {
        return pagination;
    }

    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }

    public DefiBalance[] getDefiBalances() {
        return defiBalances;
    }

    public void setDefiBalances(DefiBalance[] defiBalances) {
        this.defiBalances = defiBalances;
    }

}
