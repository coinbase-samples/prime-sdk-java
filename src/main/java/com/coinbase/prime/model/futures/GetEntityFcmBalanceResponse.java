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

package com.coinbase.prime.model.futures;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetEntityFcmBalanceResponse {
    @JsonProperty("portfolio_id")
    private String portfolioId;

    @JsonProperty("cfm_usd_balance")
    private String cfmUsdBalance;

    @JsonProperty("unrealized_pnl")
    private String unrealizedPnl;

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

    public GetEntityFcmBalanceResponse() {
    }

    public GetEntityFcmBalanceResponse(Builder builder) {
        this.portfolioId = builder.portfolioId;
        this.cfmUsdBalance = builder.cfmUsdBalance;
        this.unrealizedPnl = builder.unrealizedPnl;
        this.excessLiquidity = builder.excessLiquidity;
        this.futuresBuyingPower = builder.futuresBuyingPower;
        this.initialMargin = builder.initialMargin;
        this.maintenanceMargin = builder.maintenanceMargin;
        this.clearingAccountId = builder.clearingAccountId;
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

    public static class Builder {
        private String portfolioId;
        private String cfmUsdBalance;
        private String unrealizedPnl;
        private String excessLiquidity;
        private String futuresBuyingPower;
        private String initialMargin;
        private String maintenanceMargin;
        private String clearingAccountId;

        public Builder() {
        }

        public Builder portfolioId(String portfolioId) {
            this.portfolioId = portfolioId;
            return this;
        }

        public Builder cfmUsdBalance(String cfmUsdBalance) {
            this.cfmUsdBalance = cfmUsdBalance;
            return this;
        }

        public Builder unrealizedPnl(String unrealizedPnl) {
            this.unrealizedPnl = unrealizedPnl;
            return this;
        }

        public Builder excessLiquidity(String excessLiquidity) {
            this.excessLiquidity = excessLiquidity;
            return this;
        }

        public Builder futuresBuyingPower(String futuresBuyingPower) {
            this.futuresBuyingPower = futuresBuyingPower;
            return this;
        }

        public Builder initialMargin(String initialMargin) {
            this.initialMargin = initialMargin;
            return this;
        }

        public Builder maintenanceMargin(String maintenanceMargin) {
            this.maintenanceMargin = maintenanceMargin;
            return this;
        }

        public Builder clearingAccountId(String clearingAccountId) {
            this.clearingAccountId = clearingAccountId;
            return this;
        }

        public GetEntityFcmBalanceResponse build() {
            return new GetEntityFcmBalanceResponse(this);
        }
    }
}
