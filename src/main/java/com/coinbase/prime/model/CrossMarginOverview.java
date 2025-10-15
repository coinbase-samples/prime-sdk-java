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

public class CrossMarginOverview {
    private XMSummary marginSummary;

    public CrossMarginOverview() {
    }

    public CrossMarginOverview(Builder builder) {
        this.marginSummary = builder.marginSummary;
    }

    public XMSummary getMarginSummary() {
        return marginSummary;
    }

    public void setMarginSummary(XMSummary marginSummary) {
        this.marginSummary = marginSummary;
    }

    public static class Builder {
        private XMSummary marginSummary;

        public Builder marginSummary(XMSummary marginSummary) {
            this.marginSummary = marginSummary;
            return this;
        }

        public CrossMarginOverview build() {
            return new CrossMarginOverview(this);
        }
    }
}
