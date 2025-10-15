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

public class MarginInformation {
    private MarginSummary marginSummary;

    public MarginInformation() {
    }

    public MarginInformation(Builder builder) {
        this.marginSummary = builder.marginSummary;
    }

    public MarginSummary getMarginSummary() {
        return marginSummary;
    }

    public void setMarginSummary(MarginSummary marginSummary) {
        this.marginSummary = marginSummary;
    }

    public static class Builder {
        private MarginSummary marginSummary;

        public Builder marginSummary(MarginSummary marginSummary) {
            this.marginSummary = marginSummary;
            return this;
        }

        public MarginInformation build() {
            return new MarginInformation(this);
        }
    }
}
