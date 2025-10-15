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

public class XmRiskNettingInfo {
    @JsonProperty("total_initial_margin")
    private String totalInitialMargin;

    @JsonProperty("initial_margin_after_netting")
    private String initialMarginAfterNetting;

    @JsonProperty("initial_margin_reduction")
    private String initialMarginReduction;

    @JsonProperty("total_maintenance_margin")
    private String totalMaintenanceMargin;

    @JsonProperty("maintenance_margin_after_netting")
    private String maintenanceMarginAfterNetting;

    @JsonProperty("maintenance_margin_reduction")
    private String maintenanceMarginReduction;

    public XmRiskNettingInfo() {
    }

    public String getTotalInitialMargin() {
        return totalInitialMargin;
    }

    public void setTotalInitialMargin(String totalInitialMargin) {
        this.totalInitialMargin = totalInitialMargin;
    }

    public String getInitialMarginAfterNetting() {
        return initialMarginAfterNetting;
    }

    public void setInitialMarginAfterNetting(String initialMarginAfterNetting) {
        this.initialMarginAfterNetting = initialMarginAfterNetting;
    }

    public String getInitialMarginReduction() {
        return initialMarginReduction;
    }

    public void setInitialMarginReduction(String initialMarginReduction) {
        this.initialMarginReduction = initialMarginReduction;
    }

    public String getTotalMaintenanceMargin() {
        return totalMaintenanceMargin;
    }

    public void setTotalMaintenanceMargin(String totalMaintenanceMargin) {
        this.totalMaintenanceMargin = totalMaintenanceMargin;
    }

    public String getMaintenanceMarginAfterNetting() {
        return maintenanceMarginAfterNetting;
    }

    public void setMaintenanceMarginAfterNetting(String maintenanceMarginAfterNetting) {
        this.maintenanceMarginAfterNetting = maintenanceMarginAfterNetting;
    }

    public String getMaintenanceMarginReduction() {
        return maintenanceMarginReduction;
    }

    public void setMaintenanceMarginReduction(String maintenanceMarginReduction) {
        this.maintenanceMarginReduction = maintenanceMarginReduction;
    }
}
