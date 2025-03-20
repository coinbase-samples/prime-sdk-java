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

package com.coinbase.prime.model.futures;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CancelEntityFuturesSweepResponse {
    private boolean success;

    @JsonProperty("request_id")
    private String requestId;

    public CancelEntityFuturesSweepResponse() {
    }

    public CancelEntityFuturesSweepResponse(Builder builder) {
        this.success = builder.success;
        this.requestId = builder.requestId;
    }

    public boolean getSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public static class Builder {
        private boolean success;
        private String requestId;

        public Builder() {
        }

        public Builder success(boolean success) {
            this.success = success;
            return this;
        }

        public CancelEntityFuturesSweepResponse build() {
            return new CancelEntityFuturesSweepResponse(this);
        }
    }
}
