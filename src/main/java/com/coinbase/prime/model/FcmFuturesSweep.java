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

import java.time.OffsetDateTime;

public class FcmFuturesSweep {
    private String id;

    private FcmFuturesSweepRequestAmount requestedAmount;

    private Boolean shouldSweepAll;

    private OffsetDateTime scheduledTime;

    public FcmFuturesSweep() {
    }

    public FcmFuturesSweep(Builder builder) {
        this.id = builder.id;
        this.requestedAmount = builder.requestedAmount;
        this.shouldSweepAll = builder.shouldSweepAll;
        this.scheduledTime = builder.scheduledTime;
    }

    public String getId() {
        return id;
    }

    public FcmFuturesSweepRequestAmount getRequestedAmount() {
        return requestedAmount;
    }

    public Boolean isShouldSweepAll() {
        return shouldSweepAll;
    }

    public OffsetDateTime getScheduledTime() {
        return scheduledTime;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setRequestedAmount(FcmFuturesSweepRequestAmount requestedAmount) {
        this.requestedAmount = requestedAmount;
    }

    public void setShouldSweepAll(Boolean shouldSweepAll) {
        this.shouldSweepAll = shouldSweepAll;
    }

    public void setScheduledTime(OffsetDateTime scheduledTime) {
        this.scheduledTime = scheduledTime;
    }

    public static class Builder {
        private String id;

        private FcmFuturesSweepRequestAmount requestedAmount;

        private Boolean shouldSweepAll;

        private OffsetDateTime scheduledTime;

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder requestedAmount(FcmFuturesSweepRequestAmount requestedAmount) {
            this.requestedAmount = requestedAmount;
            return this;
        }

        public Builder shouldSweepAll(Boolean shouldSweepAll) {
            this.shouldSweepAll = shouldSweepAll;
            return this;
        }

        public Builder scheduledTime(OffsetDateTime scheduledTime) {
            this.scheduledTime = scheduledTime;
            return this;
        }

        public FcmFuturesSweep build() {
            return new FcmFuturesSweep(this);
        }
    }
}
