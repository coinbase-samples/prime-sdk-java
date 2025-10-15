// Copyright 2024-present Coinbase Global, Inc.
//
//  Licensed under the Apache License, Version 2.0 (the "License");
//  you may not use this file except in compliance with the License.
//  You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
//  Unless required by applicable law or agreed to in writing, software
//  distributed under the License is distributed on an "AS IS" BASIS,
//  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//  See the License for the specific language governing permissions and
//  limitations under the License.
package com.coinbase.prime.model;

public class CreateAllocationResponseBody {
    private Boolean success;

    private String allocationId;

    private String failureReason;

    public CreateAllocationResponseBody() {
    }

    public CreateAllocationResponseBody(Builder builder) {
        this.success = builder.success;
        this.allocationId = builder.allocationId;
        this.failureReason = builder.failureReason;
    }

    public Boolean isSuccess() {
        return success;
    }

    public String getAllocationId() {
        return allocationId;
    }

    public String getFailureReason() {
        return failureReason;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public void setAllocationId(String allocationId) {
        this.allocationId = allocationId;
    }

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    public static class Builder {
        private Boolean success;

        private String allocationId;

        private String failureReason;

        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public Builder allocationId(String allocationId) {
            this.allocationId = allocationId;
            return this;
        }

        public Builder failureReason(String failureReason) {
            this.failureReason = failureReason;
            return this;
        }

        public CreateAllocationResponseBody build() {
            return new CreateAllocationResponseBody(this);
        }
    }
}
