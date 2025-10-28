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

package com.coinbase.prime.allocations;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response object for creating an allocation for a given portfolio.
 *
 * Contains allocation creation result, including success status and allocation identifiers.
 */
public class CreateAllocationResponse {
    /** Indicates whether the allocation creation was successful */
    private boolean success;

    /** The unique identifier for the created allocation */
    @JsonProperty("allocation_id")
    private String allocationId;

    /** The reason for allocation creation failure, if applicable */
    @JsonProperty("failure_reason")
    private String failureReason;

    public CreateAllocationResponse() {
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getAllocationId() {
        return allocationId;
    }

    public void setAllocationId(String allocationId) {
        this.allocationId = allocationId;
    }

    public String getFailureReason() {
        return failureReason;
    }

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

}
