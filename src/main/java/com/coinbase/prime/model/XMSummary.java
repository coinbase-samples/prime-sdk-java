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

public class XMSummary {
    private String marginRequirement;

    private String accountEquity;

    private String marginExcessShortfall;

    private String consumedCredit;

    private String xmCreditLimit;

    private String xmMarginLimit;

    private String spotEquity;

    private String futuresEquity;

    private XMRiskNettingInfo riskNettingInfo;

    public XMSummary() {
    }

    public XMSummary(Builder builder) {
        this.marginRequirement = builder.marginRequirement;
        this.accountEquity = builder.accountEquity;
        this.marginExcessShortfall = builder.marginExcessShortfall;
        this.consumedCredit = builder.consumedCredit;
        this.xmCreditLimit = builder.xmCreditLimit;
        this.xmMarginLimit = builder.xmMarginLimit;
        this.spotEquity = builder.spotEquity;
        this.futuresEquity = builder.futuresEquity;
        this.riskNettingInfo = builder.riskNettingInfo;
    }

    public String getMarginRequirement() {
        return marginRequirement;
    }

    public String getAccountEquity() {
        return accountEquity;
    }

    public String getMarginExcessShortfall() {
        return marginExcessShortfall;
    }

    public String getConsumedCredit() {
        return consumedCredit;
    }

    public String getXmCreditLimit() {
        return xmCreditLimit;
    }

    public String getXmMarginLimit() {
        return xmMarginLimit;
    }

    public String getSpotEquity() {
        return spotEquity;
    }

    public String getFuturesEquity() {
        return futuresEquity;
    }

    public XMRiskNettingInfo getRiskNettingInfo() {
        return riskNettingInfo;
    }

    public void setMarginRequirement(String marginRequirement) {
        this.marginRequirement = marginRequirement;
    }

    public void setAccountEquity(String accountEquity) {
        this.accountEquity = accountEquity;
    }

    public void setMarginExcessShortfall(String marginExcessShortfall) {
        this.marginExcessShortfall = marginExcessShortfall;
    }

    public void setConsumedCredit(String consumedCredit) {
        this.consumedCredit = consumedCredit;
    }

    public void setXmCreditLimit(String xmCreditLimit) {
        this.xmCreditLimit = xmCreditLimit;
    }

    public void setXmMarginLimit(String xmMarginLimit) {
        this.xmMarginLimit = xmMarginLimit;
    }

    public void setSpotEquity(String spotEquity) {
        this.spotEquity = spotEquity;
    }

    public void setFuturesEquity(String futuresEquity) {
        this.futuresEquity = futuresEquity;
    }

    public void setRiskNettingInfo(XMRiskNettingInfo riskNettingInfo) {
        this.riskNettingInfo = riskNettingInfo;
    }

    public static class Builder {
        private String marginRequirement;

        private String accountEquity;

        private String marginExcessShortfall;

        private String consumedCredit;

        private String xmCreditLimit;

        private String xmMarginLimit;

        private String spotEquity;

        private String futuresEquity;

        private XMRiskNettingInfo riskNettingInfo;

        public Builder marginRequirement(String marginRequirement) {
            this.marginRequirement = marginRequirement;
            return this;
        }

        public Builder accountEquity(String accountEquity) {
            this.accountEquity = accountEquity;
            return this;
        }

        public Builder marginExcessShortfall(String marginExcessShortfall) {
            this.marginExcessShortfall = marginExcessShortfall;
            return this;
        }

        public Builder consumedCredit(String consumedCredit) {
            this.consumedCredit = consumedCredit;
            return this;
        }

        public Builder xmCreditLimit(String xmCreditLimit) {
            this.xmCreditLimit = xmCreditLimit;
            return this;
        }

        public Builder xmMarginLimit(String xmMarginLimit) {
            this.xmMarginLimit = xmMarginLimit;
            return this;
        }

        public Builder spotEquity(String spotEquity) {
            this.spotEquity = spotEquity;
            return this;
        }

        public Builder futuresEquity(String futuresEquity) {
            this.futuresEquity = futuresEquity;
            return this;
        }

        public Builder riskNettingInfo(XMRiskNettingInfo riskNettingInfo) {
            this.riskNettingInfo = riskNettingInfo;
            return this;
        }

        public XMSummary build() {
            return new XMSummary(this);
        }
    }
}
