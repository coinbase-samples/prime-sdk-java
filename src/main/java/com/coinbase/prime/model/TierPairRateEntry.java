/*
 * Copyright 2026-present Coinbase Global, Inc.
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

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TierPairRateEntry {
    @JsonProperty("tier_a")
    private String tierA;

    @JsonProperty("tier_b")
    private String tierB;

    @JsonProperty("rate")
    private String rate;

    public String getTierA() { return tierA; }
    public void setTierA(String tierA) { this.tierA = tierA; }

    public String getTierB() { return tierB; }
    public void setTierB(String tierB) { this.tierB = tierB; }

    public String getRate() { return rate; }
    public void setRate(String rate) { this.rate = rate; }
}
