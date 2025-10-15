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

package com.coinbase.prime.futures;

import com.coinbase.prime.model.FcmRiskLimits;
import com.fasterxml.jackson.annotation.JsonProperty;

public class GetFcmRiskLimitsResponse {
    @JsonProperty("risk_limits")
    private FcmRiskLimits riskLimits;

    public GetFcmRiskLimitsResponse() {
    }

    public GetFcmRiskLimitsResponse(Builder builder) {
        this.riskLimits = builder.riskLimits;
    }

    public FcmRiskLimits getRiskLimits() {
        return riskLimits;
    }

    public void setRiskLimits(FcmRiskLimits riskLimits) {
        this.riskLimits = riskLimits;
    }

    public static class Builder {
        private FcmRiskLimits riskLimits;

        public Builder() {
        }

        public Builder riskLimits(FcmRiskLimits riskLimits) {
            this.riskLimits = riskLimits;
            return this;
        }

        public GetFcmRiskLimitsResponse build() {
            return new GetFcmRiskLimitsResponse(this);
        }
    }
}
