/*
 * Copyright 2024-present Coinbase Global, Inc.
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

public class EstimatedNetworkFees {
    @JsonProperty("lower_bound")
    private String lowerBound;
    @JsonProperty("upper_bound")
    private String upperBound;

    public EstimatedNetworkFees() {
    }

    public EstimatedNetworkFees(String lowerBound, String upperBound) {
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
    }

    public EstimatedNetworkFees(Builder builder) {
        this.lowerBound = builder.lowerBound;
        this.upperBound = builder.upperBound;
    }

    public String getLowerBound() {
        return lowerBound;
    }

    public void setLowerBound(String lowerBound) {
        this.lowerBound = lowerBound;
    }

    public String getUpperBound() {
        return upperBound;
    }

    public void setUpperBound(String upperBound) {
        this.upperBound = upperBound;
    }

    public static class Builder {
        private String lowerBound;
        private String upperBound;

        public Builder() {
        }

        public Builder lowerBound(String lowerBound) {
            this.lowerBound = lowerBound;
            return this;
        }

        public Builder upperBound(String upperBound) {
            this.upperBound = upperBound;
            return this;
        }

        public EstimatedNetworkFees build() {
            return new EstimatedNetworkFees(this);
        }
    }
}
