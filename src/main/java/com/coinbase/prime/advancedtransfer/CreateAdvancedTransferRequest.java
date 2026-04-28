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

package com.coinbase.prime.advancedtransfer;

import com.coinbase.core.errors.CoinbaseClientException;
import com.coinbase.prime.model.AdvancedTransfer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import static com.coinbase.core.utils.Utils.isNullOrEmpty;

/**
 * Create Advanced Transfer
 */
public class CreateAdvancedTransferRequest {
    @JsonProperty(required = true, value = "portfolio_id")
    @JsonIgnore
    private String portfolioId;

    @JsonProperty("advanced_transfer")
    private AdvancedTransfer advancedTransfer;

    public CreateAdvancedTransferRequest() {
    }

    public CreateAdvancedTransferRequest(Builder builder) {
        this.portfolioId = builder.portfolioId;
        this.advancedTransfer = builder.advancedTransfer;
    }

    public String getPortfolioId() {
        return portfolioId;
    }

    public void setPortfolioId(String portfolioId) {
        this.portfolioId = portfolioId;
    }

    public AdvancedTransfer getAdvancedTransfer() {
        return advancedTransfer;
    }

    public void setAdvancedTransfer(AdvancedTransfer advancedTransfer) {
        this.advancedTransfer = advancedTransfer;
    }

    public static class Builder {
        private String portfolioId;
        private AdvancedTransfer advancedTransfer;

        public Builder() {
        }

        public Builder portfolioId(String portfolioId) {
            this.portfolioId = portfolioId;
            return this;
        }

        public Builder advancedTransfer(AdvancedTransfer advancedTransfer) {
            this.advancedTransfer = advancedTransfer;
            return this;
        }

        public CreateAdvancedTransferRequest build() throws CoinbaseClientException {
            validate();
            return new CreateAdvancedTransferRequest(this);
        }

        private void validate() throws CoinbaseClientException {
            if (isNullOrEmpty(this.portfolioId)) {
                throw new CoinbaseClientException("PortfolioId is required");
            }
        }
    }
}
