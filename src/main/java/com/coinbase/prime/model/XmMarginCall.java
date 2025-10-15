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

public class XmMarginCall {
    @JsonProperty("margin_call_id")
    private String marginCallId;

    @JsonProperty("currency")
    private String currency;

    @JsonProperty("initial_notional_amount")
    private String initialNotionalAmount;

    @JsonProperty("margin_call_type")
    private String marginCallType;

    @JsonProperty("margin_call_status")
    private String marginCallStatus;

    @JsonProperty("created_at")
    private String createdAt;

    @JsonProperty("resolved_at")
    private String resolvedAt;

    public XmMarginCall() {
    }

    public String getMarginCallId() {
        return marginCallId;
    }

    public void setMarginCallId(String marginCallId) {
        this.marginCallId = marginCallId;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getInitialNotionalAmount() {
        return initialNotionalAmount;
    }

    public void setInitialNotionalAmount(String initialNotionalAmount) {
        this.initialNotionalAmount = initialNotionalAmount;
    }

    public String getMarginCallType() {
        return marginCallType;
    }

    public void setMarginCallType(String marginCallType) {
        this.marginCallType = marginCallType;
    }

    public String getMarginCallStatus() {
        return marginCallStatus;
    }

    public void setMarginCallStatus(String marginCallStatus) {
        this.marginCallStatus = marginCallStatus;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getResolvedAt() {
        return resolvedAt;
    }

    public void setResolvedAt(String resolvedAt) {
        this.resolvedAt = resolvedAt;
    }
}
