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

import com.coinbase.prime.model.EntityBalance;
import com.coinbase.prime.model.Pagination;

public class ListEntityBalancesResponse {
    private EntityBalance[] balances;

    private Pagination pagination;

    public ListEntityBalancesResponse() {
    }

    public ListEntityBalancesResponse(EntityBalance[] balances, Pagination pagination) {
        this.balances = balances;
        this.pagination = pagination;
    }

    public ListEntityBalancesResponse(Builder builder) {
        this.balances = builder.balances;
        this.pagination = builder.pagination;
    }

    public EntityBalance[] getBalances() {
        return balances;
    }

    public void setBalances(EntityBalance[] balances) {
        this.balances = balances;
    }

    public Pagination getPagination() {
        return pagination;
    }

    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }

    public static class Builder {
        private EntityBalance[] balances;
        private Pagination pagination;

        public Builder() {
        }

        public Builder balances(EntityBalance[] balances) {
            this.balances = balances;
            return this;
        }

        public Builder pagination(Pagination pagination) {
            this.pagination = pagination;
            return this;
        }

        public ListEntityBalancesResponse build() {
            return new ListEntityBalancesResponse(this);
        }
    }
}
