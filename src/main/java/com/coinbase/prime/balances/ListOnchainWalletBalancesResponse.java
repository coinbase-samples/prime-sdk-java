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

package com.coinbase.prime.balances;

import com.coinbase.prime.model.Pagination;
import com.coinbase.prime.model.OnchainWalletBalance;

/**
 * Response object for listing on-chain wallet balances by entity.
 */
public class ListOnchainWalletBalancesResponse {
    /** Array of on-chain wallet balance information */
    private OnchainWalletBalance[] balances;
    /** Pagination information for the response */
    private Pagination pagination;

    public ListOnchainWalletBalancesResponse() {
    }

    public ListOnchainWalletBalancesResponse(Builder builder) {
        this.balances = builder.balances;
        this.pagination = builder.pagination;
    }

    public OnchainWalletBalance[] getBalances() {
        return balances;
    }

    public void setBalances(OnchainWalletBalance[] balances) {
        this.balances = balances;
    }

    public Pagination getPagination() {
        return pagination;
    }

    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }

    public static class Builder {
        private OnchainWalletBalance[] balances;
        private Pagination pagination;

        public Builder() {
        }

        public Builder balances(OnchainWalletBalance[] balances) {
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
