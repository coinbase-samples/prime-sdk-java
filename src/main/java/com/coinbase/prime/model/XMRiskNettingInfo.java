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

public class XMRiskNettingInfo {
    private String nodalMarginRequirement;

    private String portfolioMarginRequirement;

    private String integratedPortfolioMarginRequirement;

    private String ineligibleFuturesMarginRequirement;

    private String positionMarginRequirement;

    private String portfolioMarginAddon;

    private String integratedPositionMarginRequirement;

    private String integratedPortfolioMarginAddon;

    private String nettedFuturesNotional;

    private String totalGmvBasis;

    private String ipmCashBalance;

    private MarginAddOn integratedScenarioAddon;

    public XMRiskNettingInfo() {
    }

    public XMRiskNettingInfo(Builder builder) {
        this.nodalMarginRequirement = builder.nodalMarginRequirement;
        this.portfolioMarginRequirement = builder.portfolioMarginRequirement;
        this.integratedPortfolioMarginRequirement = builder.integratedPortfolioMarginRequirement;
        this.ineligibleFuturesMarginRequirement = builder.ineligibleFuturesMarginRequirement;
        this.positionMarginRequirement = builder.positionMarginRequirement;
        this.portfolioMarginAddon = builder.portfolioMarginAddon;
        this.integratedPositionMarginRequirement = builder.integratedPositionMarginRequirement;
        this.integratedPortfolioMarginAddon = builder.integratedPortfolioMarginAddon;
        this.nettedFuturesNotional = builder.nettedFuturesNotional;
        this.totalGmvBasis = builder.totalGmvBasis;
        this.ipmCashBalance = builder.ipmCashBalance;
        this.integratedScenarioAddon = builder.integratedScenarioAddon;
    }

    public String getNodalMarginRequirement() {
        return nodalMarginRequirement;
    }

    public String getPortfolioMarginRequirement() {
        return portfolioMarginRequirement;
    }

    public String getIntegratedPortfolioMarginRequirement() {
        return integratedPortfolioMarginRequirement;
    }

    public String getIneligibleFuturesMarginRequirement() {
        return ineligibleFuturesMarginRequirement;
    }

    public String getPositionMarginRequirement() {
        return positionMarginRequirement;
    }

    public String getPortfolioMarginAddon() {
        return portfolioMarginAddon;
    }

    public String getIntegratedPositionMarginRequirement() {
        return integratedPositionMarginRequirement;
    }

    public String getIntegratedPortfolioMarginAddon() {
        return integratedPortfolioMarginAddon;
    }

    public String getNettedFuturesNotional() {
        return nettedFuturesNotional;
    }

    public String getTotalGmvBasis() {
        return totalGmvBasis;
    }

    public String getIpmCashBalance() {
        return ipmCashBalance;
    }

    public MarginAddOn getIntegratedScenarioAddon() {
        return integratedScenarioAddon;
    }

    public void setNodalMarginRequirement(String nodalMarginRequirement) {
        this.nodalMarginRequirement = nodalMarginRequirement;
    }

    public void setPortfolioMarginRequirement(String portfolioMarginRequirement) {
        this.portfolioMarginRequirement = portfolioMarginRequirement;
    }

    public void setIntegratedPortfolioMarginRequirement(
            String integratedPortfolioMarginRequirement) {
        this.integratedPortfolioMarginRequirement = integratedPortfolioMarginRequirement;
    }

    public void setIneligibleFuturesMarginRequirement(String ineligibleFuturesMarginRequirement) {
        this.ineligibleFuturesMarginRequirement = ineligibleFuturesMarginRequirement;
    }

    public void setPositionMarginRequirement(String positionMarginRequirement) {
        this.positionMarginRequirement = positionMarginRequirement;
    }

    public void setPortfolioMarginAddon(String portfolioMarginAddon) {
        this.portfolioMarginAddon = portfolioMarginAddon;
    }

    public void setIntegratedPositionMarginRequirement(String integratedPositionMarginRequirement) {
        this.integratedPositionMarginRequirement = integratedPositionMarginRequirement;
    }

    public void setIntegratedPortfolioMarginAddon(String integratedPortfolioMarginAddon) {
        this.integratedPortfolioMarginAddon = integratedPortfolioMarginAddon;
    }

    public void setNettedFuturesNotional(String nettedFuturesNotional) {
        this.nettedFuturesNotional = nettedFuturesNotional;
    }

    public void setTotalGmvBasis(String totalGmvBasis) {
        this.totalGmvBasis = totalGmvBasis;
    }

    public void setIpmCashBalance(String ipmCashBalance) {
        this.ipmCashBalance = ipmCashBalance;
    }

    public void setIntegratedScenarioAddon(MarginAddOn integratedScenarioAddon) {
        this.integratedScenarioAddon = integratedScenarioAddon;
    }

    public static class Builder {
        private String nodalMarginRequirement;

        private String portfolioMarginRequirement;

        private String integratedPortfolioMarginRequirement;

        private String ineligibleFuturesMarginRequirement;

        private String positionMarginRequirement;

        private String portfolioMarginAddon;

        private String integratedPositionMarginRequirement;

        private String integratedPortfolioMarginAddon;

        private String nettedFuturesNotional;

        private String totalGmvBasis;

        private String ipmCashBalance;

        private MarginAddOn integratedScenarioAddon;

        public Builder nodalMarginRequirement(String nodalMarginRequirement) {
            this.nodalMarginRequirement = nodalMarginRequirement;
            return this;
        }

        public Builder portfolioMarginRequirement(String portfolioMarginRequirement) {
            this.portfolioMarginRequirement = portfolioMarginRequirement;
            return this;
        }

        public Builder integratedPortfolioMarginRequirement(
                String integratedPortfolioMarginRequirement) {
            this.integratedPortfolioMarginRequirement = integratedPortfolioMarginRequirement;
            return this;
        }

        public Builder ineligibleFuturesMarginRequirement(
                String ineligibleFuturesMarginRequirement) {
            this.ineligibleFuturesMarginRequirement = ineligibleFuturesMarginRequirement;
            return this;
        }

        public Builder positionMarginRequirement(String positionMarginRequirement) {
            this.positionMarginRequirement = positionMarginRequirement;
            return this;
        }

        public Builder portfolioMarginAddon(String portfolioMarginAddon) {
            this.portfolioMarginAddon = portfolioMarginAddon;
            return this;
        }

        public Builder integratedPositionMarginRequirement(
                String integratedPositionMarginRequirement) {
            this.integratedPositionMarginRequirement = integratedPositionMarginRequirement;
            return this;
        }

        public Builder integratedPortfolioMarginAddon(String integratedPortfolioMarginAddon) {
            this.integratedPortfolioMarginAddon = integratedPortfolioMarginAddon;
            return this;
        }

        public Builder nettedFuturesNotional(String nettedFuturesNotional) {
            this.nettedFuturesNotional = nettedFuturesNotional;
            return this;
        }

        public Builder totalGmvBasis(String totalGmvBasis) {
            this.totalGmvBasis = totalGmvBasis;
            return this;
        }

        public Builder ipmCashBalance(String ipmCashBalance) {
            this.ipmCashBalance = ipmCashBalance;
            return this;
        }

        public Builder integratedScenarioAddon(MarginAddOn integratedScenarioAddon) {
            this.integratedScenarioAddon = integratedScenarioAddon;
            return this;
        }

        public XMRiskNettingInfo build() {
            return new XMRiskNettingInfo(this);
        }
    }
}
