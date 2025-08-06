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

package com.coinbase.prime.model;

import com.coinbase.prime.model.enums.FcmFuturesSweepStatus;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.Instant;

public class FcmFuturesSweep {
    private String id;
    @JsonProperty("requested_amount")
    private RequestAmount requestedAmount;
    @JsonProperty("should_sweep_all")
    private Boolean shouldSweepAll;
    private FcmFuturesSweepStatus status;
    @JsonProperty("scheduled_time")
    private Instant scheduledTime;

    public FcmFuturesSweep() {
    }

    public FcmFuturesSweep(Builder builder) {
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

    public RequestAmount getRequestedAmount() {
        return requestedAmount;
    }

    public void setRequestedAmount(RequestAmount requestedAmount) {
        this.requestedAmount = requestedAmount;
    }

    public Boolean getShouldSweepAll() {
        return shouldSweepAll;
    }

    public void setShouldSweepAll(Boolean shouldSweepAll) {
        this.shouldSweepAll = shouldSweepAll;
    }

    public FcmFuturesSweepStatus getStatus() {
        return status;
    }

    public void setStatus(FcmFuturesSweepStatus status) {
        this.status = status;
    }

    public Instant getScheduledTime() {
        return scheduledTime;
    }

    public void setScheduledTime(Instant scheduledTime) {
        this.scheduledTime = scheduledTime;
    }

    public static class Builder {
        private String id;
        private RequestAmount requestedAmount;
        private Boolean shouldSweepAll;
        private FcmFuturesSweepStatus status;
        private Instant scheduledTime;

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder requestedAmount(RequestAmount requestedAmount) {
            this.requestedAmount = requestedAmount;
            return this;
        }

        public Builder shouldSweepAll(Boolean shouldSweepAll) {
            this.shouldSweepAll = shouldSweepAll;
            return this;
        }

        public Builder status(FcmFuturesSweepStatus status) {
            this.status = status;
            return this;
        }

        public Builder scheduledTime(Instant scheduledTime) {
            this.scheduledTime = scheduledTime;
            return this;
        }

        public FcmFuturesSweep build() {
            return new FcmFuturesSweep(this);
        }
    }
}
