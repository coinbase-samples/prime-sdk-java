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

public class Sweep {
    @JsonProperty("id")
    private String id;

    @JsonProperty("request_amount")
    private RequestedAmount requestedAmount;

    @JsonProperty("should_sweep_all")
    private Boolean shouldSweepAll;

    @JsonProperty("status")
    private String status;

    @JsonProperty("scheduled_time")
    private String scheduledTime;

    public Sweep() {
    }

    public Sweep(Builder builder) {
        this.id = builder.id;
        this.requestedAmount = builder.requestedAmount;
        this.shouldSweepAll = builder.shouldSweepAll;
        this.status = builder.status;
        this.scheduledTime = builder.scheduledTime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public RequestedAmount getRequestedAmount() {
        return requestedAmount;
    }

    public void setRequestedAmount(RequestedAmount requestedAmount) {
        this.requestedAmount = requestedAmount;
    }

    public Boolean getShouldSweepAll() {
        return shouldSweepAll;
    }

    public void setShouldSweepAll(Boolean shouldSweepAll) {
        this.shouldSweepAll = shouldSweepAll;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getScheduledTime() {
        return scheduledTime;
    }

    public void setScheduledTime(String scheduledTime) {
        this.scheduledTime = scheduledTime;
    }

    public static class Builder {
        private String id;
        private RequestedAmount requestedAmount;
        private Boolean shouldSweepAll;
        private String status;
        private String scheduledTime;

        public Builder() {
        }

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder requestedAmount(RequestedAmount requestedAmount) {
            this.requestedAmount = requestedAmount;
            return this;
        }

        public Builder shouldSweepAll(Boolean shouldSweepAll) {
            this.shouldSweepAll = shouldSweepAll;
            return this;
        }

        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public Builder scheduledTime(String scheduledTime) {
            this.scheduledTime = scheduledTime;
            return this;
        }

        public Sweep build() {
            return new Sweep(this);
        }
    }
}
