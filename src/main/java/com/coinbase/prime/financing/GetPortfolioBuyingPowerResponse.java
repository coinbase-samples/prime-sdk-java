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

import com.coinbase.prime.model.BuyingPower;
import com.fasterxml.jackson.annotation.JsonProperty;

public class GetPortfolioBuyingPowerResponse {
    @JsonProperty("buying_power")
    private BuyingPower buyingPower;

    public GetPortfolioBuyingPowerResponse() {
    }

    public GetPortfolioBuyingPowerResponse(Builder builder) {
        this.buyingPower = builder.buyingPower;
    }

    public BuyingPower getBuyingPower() {
        return buyingPower;
    }

    public void setBuyingPower(BuyingPower buyingPower) {
        this.buyingPower = buyingPower;
    }

    public static class Builder {
        private BuyingPower buyingPower;

        public Builder() {
        }

        public Builder buyingPower(BuyingPower buyingPower) {
            this.buyingPower = buyingPower;
            return this;
        }

        public GetPortfolioBuyingPowerResponse build() {
            return new GetPortfolioBuyingPowerResponse(this);
        }
    }
}
