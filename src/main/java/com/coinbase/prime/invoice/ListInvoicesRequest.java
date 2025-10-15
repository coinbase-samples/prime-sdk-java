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

package com.coinbase.prime.invoice;

import com.coinbase.core.errors.CoinbaseClientException;
import com.coinbase.prime.common.PrimeListRequest;
import com.coinbase.prime.model.enums.InvoiceState;
import com.coinbase.prime.model.enums.SortDirection;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import static com.coinbase.core.utils.Utils.*;

public class ListInvoicesRequest extends PrimeListRequest {
    @JsonProperty(required = true, value = "entity_id")
    @JsonIgnore
    private String entityId;
    private InvoiceState[] states;
    @JsonProperty("billing_month")
    private Integer billingMonth;
    @JsonProperty("billing_year")
    private Integer billingYear;

    public ListInvoicesRequest() {
    }

    public ListInvoicesRequest(Builder builder) {
        super(builder.cursor, builder.sortDirection, builder.limit);
        this.entityId = builder.entityId;
        this.states = builder.states;
        this.billingMonth = builder.billingMonth;
        this.billingYear = builder.billingYear;
    }

    public String getEntityId() {
        return entityId;
    }

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    public InvoiceState[] getStates() {
        return states;
    }

    public void setStates(InvoiceState[] states) {
        this.states = states;
    }

    public Integer getBillingMonth() {
        return billingMonth;
    }

    public void setBillingMonth(Integer billingMonth) {
        this.billingMonth = billingMonth;
    }

    public Integer getBillingYear() {
        return billingYear;
    }

    public void setBillingYear(Integer billingYear) {
        this.billingYear = billingYear;
    }

    @Override
    public String getCursor() {
        return super.getCursor();
    }

    @Override
    public void setCursor(String cursor) {
        super.setCursor(cursor);
    }

    @Override
    public Integer getLimit() {
        return super.getLimit();
    }

    @Override
    public void setLimit(Integer limit) {
        super.setLimit(limit);
    }

    public static class Builder {
        private final String entityId;
        private InvoiceState[] states;
        private Integer billingMonth;
        private Integer billingYear;
        private String cursor;
        private Integer limit;
        private SortDirection sortDirection;

        public Builder(String entityId) {
            this.entityId = entityId;
        }

        public Builder states(InvoiceState[] states) {
            this.states = states;
            return this;
        }

        public Builder billingMonth(Integer billingMonth) {
            this.billingMonth = billingMonth;
            return this;
        }

        public Builder billingYear(Integer billingYear) {
            this.billingYear = billingYear;
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

        public Builder sortDirection(SortDirection sortDirection) {
            this.sortDirection = sortDirection;
            return this;
        }

        public ListInvoicesRequest build() throws CoinbaseClientException {
            this.validate();
            return new ListInvoicesRequest(this);
        }

        private void validate() throws CoinbaseClientException {
            if (isNullOrEmpty(this.entityId)) {
                throw new CoinbaseClientException("EntityId is required");
            }
        }
    }
}
