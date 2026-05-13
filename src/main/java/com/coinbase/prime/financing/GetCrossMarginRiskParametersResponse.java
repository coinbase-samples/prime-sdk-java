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

import com.coinbase.prime.model.CrossMarginRiskParameters;
import com.coinbase.prime.model.TierPairRateEntry;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class GetCrossMarginRiskParametersResponse {
    @JsonProperty("risk_parameters")
    private List<CrossMarginRiskParameters> riskParameters;

    @JsonProperty("offset_credit_matrix_long_short")
    private List<TierPairRateEntry> offsetCreditMatrixLongShort;

    @JsonProperty("offset_credit_matrix_long_long")
    private List<TierPairRateEntry> offsetCreditMatrixLongLong;

    @JsonProperty("offset_credit_matrix_short_short")
    private List<TierPairRateEntry> offsetCreditMatrixShortShort;

    @JsonProperty("margin_period_of_risk")
    private Double marginPeriodOfRisk;

    public GetCrossMarginRiskParametersResponse() {
    }

    public List<CrossMarginRiskParameters> getRiskParameters() {
        return riskParameters;
    }

    public void setRiskParameters(List<CrossMarginRiskParameters> riskParameters) {
        this.riskParameters = riskParameters;
    }

    public List<TierPairRateEntry> getOffsetCreditMatrixLongShort() {
        return offsetCreditMatrixLongShort;
    }

    public void setOffsetCreditMatrixLongShort(List<TierPairRateEntry> offsetCreditMatrixLongShort) {
        this.offsetCreditMatrixLongShort = offsetCreditMatrixLongShort;
    }

    public List<TierPairRateEntry> getOffsetCreditMatrixLongLong() {
        return offsetCreditMatrixLongLong;
    }

    public void setOffsetCreditMatrixLongLong(List<TierPairRateEntry> offsetCreditMatrixLongLong) {
        this.offsetCreditMatrixLongLong = offsetCreditMatrixLongLong;
    }

    public List<TierPairRateEntry> getOffsetCreditMatrixShortShort() {
        return offsetCreditMatrixShortShort;
    }

    public void setOffsetCreditMatrixShortShort(List<TierPairRateEntry> offsetCreditMatrixShortShort) {
        this.offsetCreditMatrixShortShort = offsetCreditMatrixShortShort;
    }

    public Double getMarginPeriodOfRisk() {
        return marginPeriodOfRisk;
    }

    public void setMarginPeriodOfRisk(Double marginPeriodOfRisk) {
        this.marginPeriodOfRisk = marginPeriodOfRisk;
    }
}
