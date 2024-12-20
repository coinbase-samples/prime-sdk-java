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

import com.coinbase.prime.model.common.Pagination;

public class ListOnchainWalletBalancesResponse {
    private Web3WalletBalance[] balances;
    private Pagination pagination;

    public ListOnchainWalletBalancesResponse() {
    }

    public ListOnchainWalletBalancesResponse(Builder builder) {
        this.balances = builder.balances;
        this.pagination = builder.pagination;
    }

    public Web3WalletBalance[] getBalances() {
        return balances;
    }

    public void setBalances(Web3WalletBalance[] balances) {
        this.balances = balances;
    }

    public Pagination getPagination() {
        return pagination;
    }

    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }

    public static class Builder {
        private Web3WalletBalance[] balances;
        private Pagination pagination;

        public Builder() {
        }

        public Builder balances(Web3WalletBalance[] balances) {
            this.balances = balances;
            return this;
        }

        public Builder pagination(Pagination pagination) {
            this.pagination = pagination;
            return this;
        }

        public ListOnchainWalletBalancesResponse build() {
            return new ListOnchainWalletBalancesResponse(this);
        }
    }
}
