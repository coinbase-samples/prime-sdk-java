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
import java.util.List;

public class CrossMarginOverview {
    @JsonProperty("control_status")
    private String controlStatus;

    @JsonProperty("call_status")
    private String callStatus;

    @JsonProperty("margin_level")
    private String marginLevel;

    @JsonProperty("margin_summary")
    private XmSummary marginSummary;

    @JsonProperty("active_margin_calls")
    private List<XmMarginCall> activeMarginCalls;

    @JsonProperty("active_loans")
    private List<XmLoan> activeLoans;

    public CrossMarginOverview() {
    }

    public String getControlStatus() {
        return controlStatus;
    }

    public void setControlStatus(String controlStatus) {
        this.controlStatus = controlStatus;
    }

    public String getCallStatus() {
        return callStatus;
    }

    public void setCallStatus(String callStatus) {
        this.callStatus = callStatus;
    }

    public String getMarginLevel() {
        return marginLevel;
    }

    public void setMarginLevel(String marginLevel) {
        this.marginLevel = marginLevel;
    }

    public XmSummary getMarginSummary() {
        return marginSummary;
    }

    public void setMarginSummary(XmSummary marginSummary) {
        this.marginSummary = marginSummary;
    }

    public List<XmMarginCall> getActiveMarginCalls() {
        return activeMarginCalls;
    }

    public void setActiveMarginCalls(List<XmMarginCall> activeMarginCalls) {
        this.activeMarginCalls = activeMarginCalls;
    }

    public List<XmLoan> getActiveLoans() {
        return activeLoans;
    }

    public void setActiveLoans(List<XmLoan> activeLoans) {
        this.activeLoans = activeLoans;
    }
}
