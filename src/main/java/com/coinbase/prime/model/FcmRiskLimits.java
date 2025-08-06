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

public class FcmRiskLimits {
    @JsonProperty("cfm_risk_limit")
    private String cfmRiskLimit;
    @JsonProperty("cfm_risk_limit_utilization")
    private String cfmRiskLimitUtilization;
    @JsonProperty("cfm_total_margin")
    private String cfmTotalMargin;
    @JsonProperty("cfm_delta_ote")
    private String cfmDeltaOte;
    @JsonProperty("cfm_unsettled_accrued_funding_pnl")
    private String cfmUnsettledAccruedFundingPnl;

    public FcmRiskLimits() {
    }

    public FcmRiskLimits(Builder builder) {
        this.cfmRiskLimit = builder.cfmRiskLimit;
        this.cfmRiskLimitUtilization = builder.cfmRiskLimitUtilization;
        this.cfmTotalMargin = builder.cfmTotalMargin;
        this.cfmDeltaOte = builder.cfmDeltaOte;
        this.cfmUnsettledAccruedFundingPnl = builder.cfmUnsettledAccruedFundingPnl;
    }

    public String getCfmRiskLimit() {
        return cfmRiskLimit;
    }

    public void setCfmRiskLimit(String cfmRiskLimit) {
        this.cfmRiskLimit = cfmRiskLimit;
    }

    public String getCfmRiskLimitUtilization() {
        return cfmRiskLimitUtilization;
    }

    public void setCfmRiskLimitUtilization(String cfmRiskLimitUtilization) {
        this.cfmRiskLimitUtilization = cfmRiskLimitUtilization;
    }

    public String getCfmTotalMargin() {
        return cfmTotalMargin;
    }

    public void setCfmTotalMargin(String cfmTotalMargin) {
        this.cfmTotalMargin = cfmTotalMargin;
    }

    public String getCfmDeltaOte() {
        return cfmDeltaOte;
    }

    public void setCfmDeltaOte(String cfmDeltaOte) {
        this.cfmDeltaOte = cfmDeltaOte;
    }

    public String getCfmUnsettledAccruedFundingPnl() {
        return cfmUnsettledAccruedFundingPnl;
    }

    public void setCfmUnsettledAccruedFundingPnl(String cfmUnsettledAccruedFundingPnl) {
        this.cfmUnsettledAccruedFundingPnl = cfmUnsettledAccruedFundingPnl;
    }

    public static class Builder {
        private String cfmRiskLimit;
        private String cfmRiskLimitUtilization;
        private String cfmTotalMargin;
        private String cfmDeltaOte;
        private String cfmUnsettledAccruedFundingPnl;

        public Builder cfmRiskLimit(String cfmRiskLimit) {
            this.cfmRiskLimit = cfmRiskLimit;
            return this;
        }

        public Builder cfmRiskLimitUtilization(String cfmRiskLimitUtilization) {
            this.cfmRiskLimitUtilization = cfmRiskLimitUtilization;
            return this;
        }

        public Builder cfmTotalMargin(String cfmTotalMargin) {
            this.cfmTotalMargin = cfmTotalMargin;
            return this;
        }

        public Builder cfmDeltaOte(String cfmDeltaOte) {
            this.cfmDeltaOte = cfmDeltaOte;
            return this;
        }

        public Builder cfmUnsettledAccruedFundingPnl(String cfmUnsettledAccruedFundingPnl) {
            this.cfmUnsettledAccruedFundingPnl = cfmUnsettledAccruedFundingPnl;
            return this;
        }

        public FcmRiskLimits build() {
            return new FcmRiskLimits(this);
        }
    }
}
