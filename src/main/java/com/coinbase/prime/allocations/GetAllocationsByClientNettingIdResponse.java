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

import com.coinbase.prime.model.Allocation;

public class GetAllocationsByClientNettingIdResponse {
    private Allocation[] allocations;

    public GetAllocationsByClientNettingIdResponse() {
    }

    public GetAllocationsByClientNettingIdResponse(Builder builder) {
        this.allocations = builder.allocations;
    }

    public Allocation[] getAllocations() {
        return allocations;
    }

    public void setAllocations(Allocation[] allocations) {
        this.allocations = allocations;
    }

    public static class Builder {
        private Allocation[] allocations;

        public Builder() {
        }

        public Builder allocations(Allocation[] allocations) {
            this.allocations = allocations;
            return this;
        }

        public GetAllocationsByClientNettingIdResponse build() {
            return new GetAllocationsByClientNettingIdResponse(this);
        }
    }
}
