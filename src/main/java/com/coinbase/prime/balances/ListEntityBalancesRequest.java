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

import com.coinbase.prime.common.PrimeListRequest;
import com.coinbase.prime.model.enums.PortfolioBalanceType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.coinbase.core.errors.CoinbaseClientException;
import static com.coinbase.core.utils.Utils.isNullOrEmpty;

public class ListEntityBalancesRequest extends PrimeListRequest {
    @JsonProperty("entity_id")
    @JsonIgnore
    private String entityId;

    @JsonProperty("symbols")
    private String symbols;

    @JsonProperty("aggregation_type")
    private PortfolioBalanceType aggregationType;

    public ListEntityBalancesRequest() {
    }

    public ListEntityBalancesRequest(Builder builder) {
        super(builder.cursor, null, builder.limit);
        this.entityId = builder.entityId;
        this.symbols = builder.symbols;
        this.aggregationType = builder.aggregationType;
    }

    public String getEntityId() {
        return entityId;
    }

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    public String getSymbols() {
        return symbols;
    }

    public void setSymbols(String symbols) {
        this.symbols = symbols;
    }

    public PortfolioBalanceType getAggregationType() {
        return aggregationType;
    }

    public void setAggregationType(PortfolioBalanceType aggregationType) {
        this.aggregationType = aggregationType;
    }

    public static class Builder {
        private String entityId;
        private String symbols;
        private String cursor;
        private Integer limit;
        private PortfolioBalanceType aggregationType;

        public Builder() {
        }

        public Builder entityId(String entityId) {
            this.entityId = entityId;
            return this;
        }

        public Builder symbols(String symbols) {
            this.symbols = symbols;
            return this;
        }

        public Builder cursor(String cursor) {
            this.cursor = cursor;
            return this;
        }

        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        public Builder aggregationType(PortfolioBalanceType aggregationType) {
            this.aggregationType = aggregationType;
            return this;
        }

        public ListEntityBalancesRequest build() {
            this.validate();
            return new ListEntityBalancesRequest(this);
        }

        private void validate() throws CoinbaseClientException {
            if (isNullOrEmpty(this.entityId)) {
                throw new CoinbaseClientException("EntityId is required");
            }
        }
    }
}
