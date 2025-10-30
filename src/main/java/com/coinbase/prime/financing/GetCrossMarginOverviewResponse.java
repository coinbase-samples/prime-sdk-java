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

/**
 * Response object for retrieving cross margin overview for an entity.
 */
public class GetCrossMarginOverviewResponse {
    @JsonProperty("overview")
    private CrossMarginOverview overview;

    public GetCrossMarginOverviewResponse() {
    }

    public CrossMarginOverview getOverview() {
        return overview;
    }

    public void setOverview(CrossMarginOverview overview) {
        this.overview = overview;
    }
}

