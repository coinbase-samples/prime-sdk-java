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

import com.coinbase.prime.model.WithdrawalPower;
import com.fasterxml.jackson.annotation.JsonProperty;

public class GetPortfolioWithdrawalPowerResponse {
    @JsonProperty("withdrawal_power")
    private WithdrawalPower withdrawalPower;

    public GetPortfolioWithdrawalPowerResponse() {
    }

    public GetPortfolioWithdrawalPowerResponse(GetPortfolioWithdrawalPowerResponse.Builder builder) {
        this.withdrawalPower = builder.withdrawalPower;
    }

    public WithdrawalPower getWithdrawalPower() {
        return withdrawalPower;
    }

    public void setWithdrawalPower(WithdrawalPower withdrawalPower) {
        this.withdrawalPower = withdrawalPower;
    }

    public static class Builder {
        private WithdrawalPower withdrawalPower;

        public Builder() {
        }

        public GetPortfolioWithdrawalPowerResponse.Builder withWithdrawalPower(WithdrawalPower withdrawalPower) {
            this.withdrawalPower = withdrawalPower;
            return this;
        }

        public GetPortfolioWithdrawalPowerResponse build() {
            return new GetPortfolioWithdrawalPowerResponse(this);
        }
    }
}
