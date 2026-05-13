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

package com.coinbase.prime.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CrossMarginPrimeMarginSummary {
    @JsonProperty("margin_requirement")
    private String marginRequirement;

    @JsonProperty("account_equity")
    private String accountEquity;

    @JsonProperty("margin_excess_shortfall")
    private String marginExcessShortfall;

    @JsonProperty("consumed_credit")
    private String consumedCredit;

    @JsonProperty("xm_credit_limit")
    private String xmCreditLimit;

    @JsonProperty("xm_margin_limit")
    private String xmMarginLimit;

    @JsonProperty("consumed_margin_limit")
    private String consumedMarginLimit;

    @JsonProperty("spot_equity")
    private String spotEquity;

    @JsonProperty("futures_equity")
    private String futuresEquity;

    @JsonProperty("gross_market_value")
    private String grossMarketValue;

    @JsonProperty("net_market_value")
    private String netMarketValue;

    @JsonProperty("net_exposure")
    private String netExposure;

    @JsonProperty("gross_leverage")
    private String grossLeverage;

    @JsonProperty("equity_ratio")
    private String equityRatio;

    @JsonProperty("deficit_ratio")
    private String deficitRatio;

    @JsonProperty("fcm_excess_available_to_return")
    private String fcmExcessAvailableToReturn;

    public CrossMarginPrimeMarginSummary() {
    }

    public String getMarginRequirement() { return marginRequirement; }
    public void setMarginRequirement(String marginRequirement) { this.marginRequirement = marginRequirement; }

    public String getAccountEquity() { return accountEquity; }
    public void setAccountEquity(String accountEquity) { this.accountEquity = accountEquity; }

    public String getMarginExcessShortfall() { return marginExcessShortfall; }
    public void setMarginExcessShortfall(String marginExcessShortfall) { this.marginExcessShortfall = marginExcessShortfall; }

    public String getConsumedCredit() { return consumedCredit; }
    public void setConsumedCredit(String consumedCredit) { this.consumedCredit = consumedCredit; }

    public String getXmCreditLimit() { return xmCreditLimit; }
    public void setXmCreditLimit(String xmCreditLimit) { this.xmCreditLimit = xmCreditLimit; }

    public String getXmMarginLimit() { return xmMarginLimit; }
    public void setXmMarginLimit(String xmMarginLimit) { this.xmMarginLimit = xmMarginLimit; }

    public String getConsumedMarginLimit() { return consumedMarginLimit; }
    public void setConsumedMarginLimit(String consumedMarginLimit) { this.consumedMarginLimit = consumedMarginLimit; }

    public String getSpotEquity() { return spotEquity; }
    public void setSpotEquity(String spotEquity) { this.spotEquity = spotEquity; }

    public String getFuturesEquity() { return futuresEquity; }
    public void setFuturesEquity(String futuresEquity) { this.futuresEquity = futuresEquity; }

    public String getGrossMarketValue() { return grossMarketValue; }
    public void setGrossMarketValue(String grossMarketValue) { this.grossMarketValue = grossMarketValue; }

    public String getNetMarketValue() { return netMarketValue; }
    public void setNetMarketValue(String netMarketValue) { this.netMarketValue = netMarketValue; }

    public String getNetExposure() { return netExposure; }
    public void setNetExposure(String netExposure) { this.netExposure = netExposure; }

    public String getGrossLeverage() { return grossLeverage; }
    public void setGrossLeverage(String grossLeverage) { this.grossLeverage = grossLeverage; }

    public String getEquityRatio() { return equityRatio; }
    public void setEquityRatio(String equityRatio) { this.equityRatio = equityRatio; }

    public String getDeficitRatio() { return deficitRatio; }
    public void setDeficitRatio(String deficitRatio) { this.deficitRatio = deficitRatio; }

    public String getFcmExcessAvailableToReturn() { return fcmExcessAvailableToReturn; }
    public void setFcmExcessAvailableToReturn(String fcmExcessAvailableToReturn) { this.fcmExcessAvailableToReturn = fcmExcessAvailableToReturn; }
}
