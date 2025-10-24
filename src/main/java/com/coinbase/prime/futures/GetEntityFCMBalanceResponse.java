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

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetEntityFCMBalanceResponse {
    @JsonProperty("portfolio_id")
    private String portfolioId;

    @JsonProperty("cfm_usd_balance")
    private String cfmUsdBalance;

    @JsonProperty("unrealized_pnl")
    private String unrealizedPnl;

    @JsonProperty("daily_realized_pnl")
    private String dailyRealizedPnl;

    @JsonProperty("excess_liquidity")
    private String excessLiquidity;

    @JsonProperty("futures_buying_power")
    private String futuresBuyingPower;

    @JsonProperty("initial_margin")
    private String initialMargin;

    @JsonProperty("maintenance_margin")
    private String maintenanceMargin;

    @JsonProperty("clearing_account_id")
    private String clearingAccountId;

    @JsonProperty("cfm_unsettled_accrued_funding_pnl")
    private String cfmUnsettledAccruedFundingPnl;

    public GetEntityFCMBalanceResponse() {
    }

    public String getPortfolioId() {
        return portfolioId;
    }

    public void setPortfolioId(String portfolioId) {
        this.portfolioId = portfolioId;
    }

    public String getCfmUsdBalance() {
        return cfmUsdBalance;
    }

    public void setCfmUsdBalance(String cfmUsdBalance) {
        this.cfmUsdBalance = cfmUsdBalance;
    }

    public String getUnrealizedPnl() {
        return unrealizedPnl;
    }

    public void setUnrealizedPnl(String unrealizedPnl) {
        this.unrealizedPnl = unrealizedPnl;
    }

    public String getDailyRealizedPnl() {
        return dailyRealizedPnl;
    }

    public void setDailyRealizedPnl(String dailyRealizedPnl) {
        this.dailyRealizedPnl = dailyRealizedPnl;
    }

    public String getExcessLiquidity() {
        return excessLiquidity;
    }

    public void setExcessLiquidity(String excessLiquidity) {
        this.excessLiquidity = excessLiquidity;
    }

    public String getFuturesBuyingPower() {
        return futuresBuyingPower;
    }

    public void setFuturesBuyingPower(String futuresBuyingPower) {
        this.futuresBuyingPower = futuresBuyingPower;
    }

    public String getInitialMargin() {
        return initialMargin;
    }

    public void setInitialMargin(String initialMargin) {
        this.initialMargin = initialMargin;
    }

    public String getMaintenanceMargin() {
        return maintenanceMargin;
    }

    public void setMaintenanceMargin(String maintenanceMargin) {
        this.maintenanceMargin = maintenanceMargin;
    }

    public String getClearingAccountId() {
        return clearingAccountId;
    }

    public void setClearingAccountId(String clearingAccountId) {
        this.clearingAccountId = clearingAccountId;
    }

    public String getCfmUnsettledAccruedFundingPnl() {
        return cfmUnsettledAccruedFundingPnl;
    }

    public void setCfmUnsettledAccruedFundingPnl(String cfmUnsettledAccruedFundingPnl) {
        this.cfmUnsettledAccruedFundingPnl = cfmUnsettledAccruedFundingPnl;
    }
}
