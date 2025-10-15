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

package com.coinbase.prime.financing;

import com.coinbase.prime.model.CrossMarginOverview;
import com.fasterxml.jackson.annotation.JsonProperty;

public class GetCrossMarginOverviewResponse {
    @JsonProperty("cross_margin_overview")
    private CrossMarginOverview crossMarginOverview;

    public GetCrossMarginOverviewResponse() {
    }

    public GetCrossMarginOverviewResponse(Builder builder) {
        this.crossMarginOverview = builder.crossMarginOverview;
    }

    public CrossMarginOverview getCrossMarginOverview() {
        return crossMarginOverview;
    }

    public void setCrossMarginOverview(CrossMarginOverview crossMarginOverview) {
        this.crossMarginOverview = crossMarginOverview;
    }

    public static class Builder {
        private CrossMarginOverview crossMarginOverview;

        public Builder() {
        }

        public Builder crossMarginOverview(CrossMarginOverview crossMarginOverview) {
            this.crossMarginOverview = crossMarginOverview;
            return this;
        }

        public GetCrossMarginOverviewResponse build() {
            return new GetCrossMarginOverviewResponse(this);
        }
    }
}
