// Copyright 2025-present Coinbase Global, Inc.
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

public class XMMarginCall {
    private String marginCallId;

    /**
     * Margin call currency
     */
    private String currency;

    private String initialNotionalAmount;

    private String outstandingNotionalAmount;

    private XMSummary calledWithMarginSummary;

    private OffsetDateTime dueAt;

    private OffsetDateTime createdAt;

    private OffsetDateTime updatedAt;

    public XMMarginCall() {
    }

    public XMMarginCall(Builder builder) {
        this.marginCallId = builder.marginCallId;
        this.currency = builder.currency;
        this.initialNotionalAmount = builder.initialNotionalAmount;
        this.outstandingNotionalAmount = builder.outstandingNotionalAmount;
        this.calledWithMarginSummary = builder.calledWithMarginSummary;
        this.dueAt = builder.dueAt;
        this.createdAt = builder.createdAt;
        this.updatedAt = builder.updatedAt;
    }

    public String getMarginCallId() {
        return marginCallId;
    }

    public String getCurrency() {
        return currency;
    }

    public String getInitialNotionalAmount() {
        return initialNotionalAmount;
    }

    public String getOutstandingNotionalAmount() {
        return outstandingNotionalAmount;
    }

    public XMSummary getCalledWithMarginSummary() {
        return calledWithMarginSummary;
    }

    public OffsetDateTime getDueAt() {
        return dueAt;
    }

    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setMarginCallId(String marginCallId) {
        this.marginCallId = marginCallId;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void setInitialNotionalAmount(String initialNotionalAmount) {
        this.initialNotionalAmount = initialNotionalAmount;
    }

    public void setOutstandingNotionalAmount(String outstandingNotionalAmount) {
        this.outstandingNotionalAmount = outstandingNotionalAmount;
    }

    public void setCalledWithMarginSummary(XMSummary calledWithMarginSummary) {
        this.calledWithMarginSummary = calledWithMarginSummary;
    }

    public void setDueAt(OffsetDateTime dueAt) {
        this.dueAt = dueAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public static class Builder {
        private String marginCallId;

        private String currency;

        private String initialNotionalAmount;

        private String outstandingNotionalAmount;

        private XMSummary calledWithMarginSummary;

        private OffsetDateTime dueAt;

        private OffsetDateTime createdAt;

        private OffsetDateTime updatedAt;

        public Builder marginCallId(String marginCallId) {
            this.marginCallId = marginCallId;
            return this;
        }

        public Builder currency(String currency) {
            this.currency = currency;
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

        public Builder calledWithMarginSummary(XMSummary calledWithMarginSummary) {
            this.calledWithMarginSummary = calledWithMarginSummary;
            return this;
        }

        public Builder dueAt(OffsetDateTime dueAt) {
            this.dueAt = dueAt;
            return this;
        }

        public Builder createdAt(OffsetDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Builder updatedAt(OffsetDateTime updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public XMMarginCall build() {
            return new XMMarginCall(this);
        }
    }
}
