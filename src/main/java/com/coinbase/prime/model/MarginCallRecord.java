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

import com.fasterxml.jackson.annotation.JsonProperty;

public class MarginCallRecord {
    @JsonProperty("margin_call_id")
    private String marginCallId;

    @JsonProperty("initial_notional_amount")
    private String initialNotionalAmount;

    @JsonProperty("outstanding_notional_amount")
    private String outstandingNotionalAmount;

    @JsonProperty("created_at")
    private String createdAt;

    @JsonProperty("due_at")
    private String dueAt;

    public MarginCallRecord() {
    }

    public MarginCallRecord(Builder builder) {
        this.marginCallId = builder.marginCallId;
        this.initialNotionalAmount = builder.initialNotionalAmount;
        this.outstandingNotionalAmount = builder.outstandingNotionalAmount;
        this.createdAt = builder.createdAt;
        this.dueAt = builder.dueAt;
    }

    public String getMarginCallId() {
        return marginCallId;
    }

    public void setMarginCallId(String marginCallId) {
        this.marginCallId = marginCallId;
    }

    public String getInitialNotionalAmount() {
        return initialNotionalAmount;
    }

    public void setInitialNotionalAmount(String initialNotionalAmount) {
        this.initialNotionalAmount = initialNotionalAmount;
    }

    public String getOutstandingNotionalAmount() {
        return outstandingNotionalAmount;
    }

    public void setOutstandingNotionalAmount(String outstandingNotionalAmount) {
        this.outstandingNotionalAmount = outstandingNotionalAmount;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getDueAt() {
        return dueAt;
    }

    public void setDueAt(String dueAt) {
        this.dueAt = dueAt;
    }

    public static class Builder {
        private String marginCallId;
        private String initialNotionalAmount;
        private String outstandingNotionalAmount;
        private String createdAt;
        private String dueAt;

        public Builder() {
        }

        public Builder marginCallId(String marginCallId) {
            this.marginCallId = marginCallId;
            return this;
        }

        public Builder initialNotionalAmount(String initialNotionalAmount) {
            this.initialNotionalAmount = initialNotionalAmount;
            return this;
        }

        public Builder outstandingNotionalAmount(String outstandingNotionalAmount) {
            this.outstandingNotionalAmount = outstandingNotionalAmount;
            return this;
        }

        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Builder dueAt(String dueAt) {
            this.dueAt = dueAt;
            return this;
        }

        public MarginCallRecord build() {
            return new MarginCallRecord(this);
        }
    }
}
