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

public class DestinationAlloc {
    private String legId;

    private String portfolioId;

    private String allocationBase;

    private String allocationQuote;

    private String feesAllocatedLeg;

    public DestinationAlloc() {
    }

    public DestinationAlloc(Builder builder) {
        this.legId = builder.legId;
        this.portfolioId = builder.portfolioId;
        this.allocationBase = builder.allocationBase;
        this.allocationQuote = builder.allocationQuote;
        this.feesAllocatedLeg = builder.feesAllocatedLeg;
    }

    public String getLegId() {
        return legId;
    }

    public String getPortfolioId() {
        return portfolioId;
    }

    public String getAllocationBase() {
        return allocationBase;
    }

    public String getAllocationQuote() {
        return allocationQuote;
    }

    public String getFeesAllocatedLeg() {
        return feesAllocatedLeg;
    }

    public void setLegId(String legId) {
        this.legId = legId;
    }

    public void setPortfolioId(String portfolioId) {
        this.portfolioId = portfolioId;
    }

    public void setAllocationBase(String allocationBase) {
        this.allocationBase = allocationBase;
    }

    public void setAllocationQuote(String allocationQuote) {
        this.allocationQuote = allocationQuote;
    }

    public void setFeesAllocatedLeg(String feesAllocatedLeg) {
        this.feesAllocatedLeg = feesAllocatedLeg;
    }

    public static class Builder {
        private String legId;

        private String portfolioId;

        private String allocationBase;

        private String allocationQuote;

        private String feesAllocatedLeg;

        public Builder legId(String legId) {
            this.legId = legId;
            return this;
        }

        public Builder portfolioId(String portfolioId) {
            this.portfolioId = portfolioId;
            return this;
        }

        public Builder allocationBase(String allocationBase) {
            this.allocationBase = allocationBase;
            return this;
        }

        public Builder allocationQuote(String allocationQuote) {
            this.allocationQuote = allocationQuote;
            return this;
        }

        public Builder feesAllocatedLeg(String feesAllocatedLeg) {
            this.feesAllocatedLeg = feesAllocatedLeg;
            return this;
        }

        public DestinationAlloc build() {
            return new DestinationAlloc(this);
        }
    }
}
