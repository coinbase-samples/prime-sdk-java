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

import com.coinbase.prime.model.enums.FcmMarginCallType;
import com.coinbase.prime.model.enums.FcmMarginCallState;
import com.fasterxml.jackson.annotation.JsonProperty;

public class FcmMarginCallDetail {
    private FcmMarginCallType type;
    private FcmMarginCallState state;

    @JsonProperty("initial_amount")
    private String initialAmount;

    @JsonProperty("remaining_amount")
    private String remainingAmount;

    @JsonProperty("business_date")
    private String businessDate;

    @JsonProperty("cure_deadline")
    private String cureDeadline;

    public FcmMarginCallDetail() {
    }

    public FcmMarginCallDetail(Builder builder) {
        this.type = builder.type;
        this.state = builder.state;
        this.initialAmount = builder.initialAmount;
        this.remainingAmount = builder.remainingAmount;
        this.businessDate = builder.businessDate;
        this.cureDeadline = builder.cureDeadline;
    }

    public FcmMarginCallType getType() {
        return type;
    }

    public void setType(FcmMarginCallType type) {
        this.type = type;
    }

    public FcmMarginCallState getState() {
        return state;
    }

    public void setState(FcmMarginCallState state) {
        this.state = state;
    }

    public String getInitialAmount() {
        return initialAmount;
    }

    public void setInitialAmount(String initialAmount) {
        this.initialAmount = initialAmount;
    }

    public String getRemainingAmount() {
        return remainingAmount;
    }

    public void setRemainingAmount(String remainingAmount) {
        this.remainingAmount = remainingAmount;
    }

    public String getBusinessDate() {
        return businessDate;
    }

    public void setBusinessDate(String businessDate) {
        this.businessDate = businessDate;
    }

    public String getCureDeadline() {
        return cureDeadline;
    }

    public void setCureDeadline(String cureDeadline) {
        this.cureDeadline = cureDeadline;
    }

    public static class Builder {
        private FcmMarginCallType type;
        private FcmMarginCallState state;
        private String initialAmount;
        private String remainingAmount;
        private String businessDate;
        private String cureDeadline;

        public Builder() {
        }

        public Builder type(FcmMarginCallType type) {
            this.type = type;
            return this;
        }

        public Builder state(FcmMarginCallState state) {
            this.state = state;
            return this;
        }

        public Builder initialAmount(String initialAmount) {
            this.initialAmount = initialAmount;
            return this;
        }

        public Builder remainingAmount(String remainingAmount) {
            this.remainingAmount = remainingAmount;
            return this;
        }

        public Builder businessDate(String businessDate) {
            this.businessDate = businessDate;
            return this;
        }

        public Builder cureDeadline(String cureDeadline) {
            this.cureDeadline = cureDeadline;
            return this;
        }

        public FcmMarginCallDetail build() {
            return new FcmMarginCallDetail(this);
        }
    }
}