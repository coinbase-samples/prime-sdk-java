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

package com.coinbase.prime.allocations;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response object for creating a net allocation for a given portfolio.
 * 
 * Contains result information for net allocation creation, including success status and allocation identifiers.
 */
public class CreateNetAllocationResponse {
    /** Indicates whether the net allocation creation was successful */
    private boolean success;
    
    /** The netting identifier for the net allocation */
    @JsonProperty("netting_id")
    private String nettingId;
    
    /** The allocation identifier for the buy side of the net allocation */
    @JsonProperty("buy_allocation_id")
    private String buyAllocationId;
    
    /** The allocation identifier for the sell side of the net allocation */
    @JsonProperty("sell_allocation_id")
    private String sellAllocationId;
    
    /** The reason for net allocation creation failure, if applicable */
    @JsonProperty("failure_reason")
    private String failureReason;

    /** The original request that generated this response */
    private CreateNetAllocationRequest request;

    public CreateNetAllocationResponse() {
    }

    public CreateNetAllocationResponse(Builder builder) {
        this.success = builder.success;
        this.nettingId = builder.nettingId;
        this.buyAllocationId = builder.buyAllocationId;
        this.sellAllocationId = builder.sellAllocationId;
        this.failureReason = builder.failureReason;
        this.request = builder.request;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
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

    public CreateNetAllocationRequest getRequest() {
        return request;
    }

    public void setRequest(CreateNetAllocationRequest request) {
        this.request = request;
    }

    public static class Builder {
        /** Success status */
        private boolean success;
        
        /** Netting identifier */
        private String nettingId;
        
        /** Buy allocation identifier */
        private String buyAllocationId;
        
        /** Sell allocation identifier */
        private String sellAllocationId;
        
        /** Failure reason */
        private String failureReason;

        /** Original request */
        private CreateNetAllocationRequest request;

        public Builder() {
        }

        public Builder success(boolean success) {
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

        public Builder request(CreateNetAllocationRequest request) {
            this.request = request;
            return this;
        }

        public CreateNetAllocationResponse build() {
            return new CreateNetAllocationResponse(this);
        }
    }
}
