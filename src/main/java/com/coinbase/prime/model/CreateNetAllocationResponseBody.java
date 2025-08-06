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

package com.coinbase.prime.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response body for create net allocation operations
 */
public class CreateNetAllocationResponseBody {
    private Boolean success;
    @JsonProperty("netting_id")
    private String nettingId;
    @JsonProperty("buy_allocation_id")
    private String buyAllocationId;
    @JsonProperty("sell_allocation_id")
    private String sellAllocationId;
    @JsonProperty("failure_reason")
    private String failureReason;

    public CreateNetAllocationResponseBody() {}

    public CreateNetAllocationResponseBody(Builder builder) {
        this.success = builder.success;
        this.nettingId = builder.nettingId;
        this.buyAllocationId = builder.buyAllocationId;
        this.sellAllocationId = builder.sellAllocationId;
        this.failureReason = builder.failureReason;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getNettingId() {
        return nettingId;
    }

    public void setNettingId(String nettingId) {
        this.nettingId = nettingId;
    }

    public String getBuyAllocationId() {
        return buyAllocationId;
    }

    public void setBuyAllocationId(String buyAllocationId) {
        this.buyAllocationId = buyAllocationId;
    }

    public String getSellAllocationId() {
        return sellAllocationId;
    }

    public void setSellAllocationId(String sellAllocationId) {
        this.sellAllocationId = sellAllocationId;
    }

    public String getFailureReason() {
        return failureReason;
    }

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    public static class Builder {
        private Boolean success;
        private String nettingId;
        private String buyAllocationId;
        private String sellAllocationId;
        private String failureReason;

        public Builder() {}

        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public Builder nettingId(String nettingId) {
            this.nettingId = nettingId;
            return this;
        }

        public Builder buyAllocationId(String buyAllocationId) {
            this.buyAllocationId = buyAllocationId;
            return this;
        }

        public Builder sellAllocationId(String sellAllocationId) {
            this.sellAllocationId = sellAllocationId;
            return this;
        }

        public Builder failureReason(String failureReason) {
            this.failureReason = failureReason;
            return this;
        }

        public CreateNetAllocationResponseBody build() {
            return new CreateNetAllocationResponseBody(this);
        }
    }
}