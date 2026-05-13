/*
 * Copyright 2026-present Coinbase Global, Inc.
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

package com.coinbase.prime.financing;

import com.coinbase.prime.model.CrossMarginPrimeMarginSummary;
import com.coinbase.prime.model.enums.PrimeXMControlStatus;
import com.coinbase.prime.model.enums.PrimeXMMarginLevel;
import com.fasterxml.jackson.annotation.JsonProperty;

public class GetCrossMarginPrimeOverviewResponse {
    @JsonProperty("control_status")
    private PrimeXMControlStatus controlStatus;

    @JsonProperty("margin_level")
    private PrimeXMMarginLevel marginLevel;

    @JsonProperty("evaluated_at")
    private String evaluatedAt;

    @JsonProperty("margin_summary")
    private CrossMarginPrimeMarginSummary marginSummary;

    public GetCrossMarginPrimeOverviewResponse() {
    }

    public PrimeXMControlStatus getControlStatus() {
        return controlStatus;
    }

    public void setControlStatus(PrimeXMControlStatus controlStatus) {
        this.controlStatus = controlStatus;
    }

    public PrimeXMMarginLevel getMarginLevel() {
        return marginLevel;
    }

    public void setMarginLevel(PrimeXMMarginLevel marginLevel) {
        this.marginLevel = marginLevel;
    }

    public String getEvaluatedAt() {
        return evaluatedAt;
    }

    public void setEvaluatedAt(String evaluatedAt) {
        this.evaluatedAt = evaluatedAt;
    }

    public CrossMarginPrimeMarginSummary getMarginSummary() {
        return marginSummary;
    }

    public void setMarginSummary(CrossMarginPrimeMarginSummary marginSummary) {
        this.marginSummary = marginSummary;
    }
}
