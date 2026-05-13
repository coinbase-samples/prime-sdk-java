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
public class MarketData {
    @JsonProperty("symbol")
    private String symbol;

    @JsonProperty("vol_5d")
    private String vol5d;

    @JsonProperty("vol_30d")
    private String vol30d;

    @JsonProperty("vol_90d")
    private String vol90d;

    @JsonProperty("adv_30d")
    private String adv30d;

    @JsonProperty("weighted_vol")
    private String weightedVol;

    public String getSymbol() { return symbol; }
    public void setSymbol(String symbol) { this.symbol = symbol; }

    public String getVol5d() { return vol5d; }
    public void setVol5d(String vol5d) { this.vol5d = vol5d; }

    public String getVol30d() { return vol30d; }
    public void setVol30d(String vol30d) { this.vol30d = vol30d; }

    public String getVol90d() { return vol90d; }
    public void setVol90d(String vol90d) { this.vol90d = vol90d; }

    public String getAdv30d() { return adv30d; }
    public void setAdv30d(String adv30d) { this.adv30d = adv30d; }

    public String getWeightedVol() { return weightedVol; }
    public void setWeightedVol(String weightedVol) { this.weightedVol = weightedVol; }
}
