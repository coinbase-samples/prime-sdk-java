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

package com.coinbase.prime.staking;

import com.coinbase.prime.model.ValidatorUnstakingInfo;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class GetUnstakingStatusResponse {
    @JsonProperty("portfolio_id")
    private String portfolioId;

    @JsonProperty("wallet_id")
    private String walletId;

    @JsonProperty("wallet_address")
    private String walletAddress;

    @JsonProperty("current_timestamp")
    private String currentTimestamp;

    @JsonProperty("validators")
    private List<ValidatorUnstakingInfo> validators;

    public GetUnstakingStatusResponse() {
    }

    public String getPortfolioId() {
        return portfolioId;
    }

    public void setPortfolioId(String portfolioId) {
        this.portfolioId = portfolioId;
    }

    public String getWalletId() {
        return walletId;
    }

    public void setWalletId(String walletId) {
        this.walletId = walletId;
    }

    public String getWalletAddress() {
        return walletAddress;
    }

    public void setWalletAddress(String walletAddress) {
        this.walletAddress = walletAddress;
    }

    public String getCurrentTimestamp() {
        return currentTimestamp;
    }

    public void setCurrentTimestamp(String currentTimestamp) {
        this.currentTimestamp = currentTimestamp;
    }

    public List<ValidatorUnstakingInfo> getValidators() {
        return validators;
    }

    public void setValidators(List<ValidatorUnstakingInfo> validators) {
        this.validators = validators;
    }
}
