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

package com.coinbase.prime.advancedtransfers;

import com.coinbase.core.errors.CoinbaseClientException;
import com.coinbase.prime.common.Pagination;
import com.coinbase.prime.common.PrimeListRequest;
import com.coinbase.prime.model.enums.AdvancedTransferState;
import com.coinbase.prime.model.enums.AdvancedTransferType;
import com.coinbase.prime.model.enums.SortDirection;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import static com.coinbase.core.utils.Utils.isNullOrEmpty;

public class ListAdvancedTransfersRequest extends PrimeListRequest {
    @JsonProperty(required = true, value = "portfolio_id")
    @JsonIgnore
    private String portfolioId;

    @JsonProperty("state")
    private AdvancedTransferState state;

    @JsonProperty("type")
    private AdvancedTransferType type;

    @JsonProperty("start_time")
    private String startTime;

    @JsonProperty("end_time")
    private String endTime;

    @JsonProperty("reference_id")
    private String referenceId;

    public ListAdvancedTransfersRequest() {
    }

    public ListAdvancedTransfersRequest(Builder builder) {
        super(builder.cursor, builder.sortDirection, builder.limit);
        this.portfolioId = builder.portfolioId;
        this.state = builder.state;
        this.type = builder.type;
        this.startTime = builder.startTime;
        this.endTime = builder.endTime;
        this.referenceId = builder.referenceId;
    }

    public String getPortfolioId() {
        return portfolioId;
    }

    public void setPortfolioId(String portfolioId) {
        this.portfolioId = portfolioId;
    }

    public AdvancedTransferState getState() {
        return state;
    }

    public void setState(AdvancedTransferState state) {
        this.state = state;
    }

    public AdvancedTransferType getType() {
        return type;
    }

    public void setType(AdvancedTransferType type) {
        this.type = type;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getReferenceId() {
        return referenceId;
    }

    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }

    public static class Builder {
        private String portfolioId;
        private AdvancedTransferState state;
        private AdvancedTransferType type;
        private String startTime;
        private String endTime;
        private String referenceId;
        private String cursor;
        private SortDirection sortDirection;
        private Integer limit;

        public Builder() {
        }

        public Builder portfolioId(String portfolioId) {
            this.portfolioId = portfolioId;
            return this;
        }

        public Builder state(AdvancedTransferState state) {
            this.state = state;
            return this;
        }

        public Builder type(AdvancedTransferType type) {
            this.type = type;
            return this;
        }

        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        public Builder referenceId(String referenceId) {
            this.referenceId = referenceId;
            return this;
        }

        public Builder pagination(Pagination pagination) {
            this.cursor = pagination.getNextCursor();
            this.sortDirection = pagination.getSortDirection();
            return this;
        }

        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        public ListAdvancedTransfersRequest build() throws CoinbaseClientException {
            this.validate();
            return new ListAdvancedTransfersRequest(this);
        }

        private void validate() throws CoinbaseClientException {
            if (isNullOrEmpty(this.portfolioId)) {
                throw new CoinbaseClientException("PortfolioId is required");
            }
        }
    }
}
