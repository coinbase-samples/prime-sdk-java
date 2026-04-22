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

package com.coinbase.prime.futures;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetFcmEquityResponse {
    @JsonProperty("available_to_sweep")
    private String availableToSweep;

    @JsonProperty("current_excess_deficit")
    private String currentExcessDeficit;

    @JsonProperty("eod_account_equity")
    private String eodAccountEquity;

    @JsonProperty("eod_unrealized_pnl")
    private String eodUnrealizedPnl;

    public GetFcmEquityResponse() {
    }

    public String getAvailableToSweep() {
        return availableToSweep;
    }

    public void setAvailableToSweep(String availableToSweep) {
        this.availableToSweep = availableToSweep;
    }

    public String getCurrentExcessDeficit() {
        return currentExcessDeficit;
    }

    public void setCurrentExcessDeficit(String currentExcessDeficit) {
        this.currentExcessDeficit = currentExcessDeficit;
    }

    public String getEodAccountEquity() {
        return eodAccountEquity;
    }

    public void setEodAccountEquity(String eodAccountEquity) {
        this.eodAccountEquity = eodAccountEquity;
    }

    public String getEodUnrealizedPnl() {
        return eodUnrealizedPnl;
    }

    public void setEodUnrealizedPnl(String eodUnrealizedPnl) {
        this.eodUnrealizedPnl = eodUnrealizedPnl;
    }
}
