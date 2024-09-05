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

package com.coinbase.prime.model.allocations;

public class GetAllocationResponse {
    private Allocation allocation;

    public GetAllocationResponse() {
    }

    public GetAllocationResponse(Builder builder) {
        this.allocation = builder.allocation;
    }

    public Allocation getAllocation() {
        return allocation;
    }

    public void setAllocation(Allocation allocation) {
        this.allocation = allocation;
    }

    public static class Builder {
        private Allocation allocation;

        public Builder() {
        }

        public Builder allocation(Allocation allocation) {
            this.allocation = allocation;
            return this;
        }

        public GetAllocationResponse build() {
            return new GetAllocationResponse(this);
        }
    }
}
