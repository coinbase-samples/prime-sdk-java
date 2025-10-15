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

public class FCMMarginCall {
    private String initialAmount;

    private String remainingAmount;

    private OffsetDateTime businessDate;

    private OffsetDateTime cureDeadline;

    public FCMMarginCall() {
    }

    public FCMMarginCall(Builder builder) {
        this.initialAmount = builder.initialAmount;
        this.remainingAmount = builder.remainingAmount;
        this.businessDate = builder.businessDate;
        this.cureDeadline = builder.cureDeadline;
    }

    public String getInitialAmount() {
        return initialAmount;
    }

    public String getRemainingAmount() {
        return remainingAmount;
    }

    public OffsetDateTime getBusinessDate() {
        return businessDate;
    }

    public OffsetDateTime getCureDeadline() {
        return cureDeadline;
    }

    public void setInitialAmount(String initialAmount) {
        this.initialAmount = initialAmount;
    }

    public void setRemainingAmount(String remainingAmount) {
        this.remainingAmount = remainingAmount;
    }

    public void setBusinessDate(OffsetDateTime businessDate) {
        this.businessDate = businessDate;
    }

    public void setCureDeadline(OffsetDateTime cureDeadline) {
        this.cureDeadline = cureDeadline;
    }

    public static class Builder {
        private String initialAmount;

        private String remainingAmount;

        private OffsetDateTime businessDate;

        private OffsetDateTime cureDeadline;

        public Builder initialAmount(String initialAmount) {
            this.initialAmount = initialAmount;
            return this;
        }

        public Builder remainingAmount(String remainingAmount) {
            this.remainingAmount = remainingAmount;
            return this;
        }

        public Builder businessDate(OffsetDateTime businessDate) {
            this.businessDate = businessDate;
            return this;
        }

        public Builder cureDeadline(OffsetDateTime cureDeadline) {
            this.cureDeadline = cureDeadline;
            return this;
        }

        public FCMMarginCall build() {
            return new FCMMarginCall(this);
        }
    }
}
