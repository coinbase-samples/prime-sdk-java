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

package com.coinbase.prime.staking;

import com.coinbase.prime.model.Pagination;
import com.coinbase.prime.model.TransactionValidator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ListTransactionValidatorsResponse {
    @JsonProperty("transaction_validators")
    private List<TransactionValidator> transactionValidators;

    @JsonProperty("pagination")
    private Pagination pagination;

    public ListTransactionValidatorsResponse() {
    }

    public ListTransactionValidatorsResponse(Builder builder) {
        this.transactionValidators = builder.transactionValidators;
        this.pagination = builder.pagination;
    }

    public List<TransactionValidator> getTransactionValidators() {
        return transactionValidators;
    }

    public void setTransactionValidators(List<TransactionValidator> transactionValidators) {
        this.transactionValidators = transactionValidators;
    }

    public Pagination getPagination() {
        return pagination;
    }

    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }

    public static class Builder {
        private List<TransactionValidator> transactionValidators;
        private Pagination pagination;

        public Builder() {
        }

        public Builder transactionValidators(List<TransactionValidator> transactionValidators) {
            this.transactionValidators = transactionValidators;
            return this;
        }

        public Builder pagination(Pagination pagination) {
            this.pagination = pagination;
            return this;
        }

        public ListTransactionValidatorsResponse build() {
            return new ListTransactionValidatorsResponse(this);
        }
    }
}
