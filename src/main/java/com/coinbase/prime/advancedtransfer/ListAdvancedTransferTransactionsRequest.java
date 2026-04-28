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
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import static com.coinbase.core.utils.Utils.isNullOrEmpty;

/**
 * List transactions associated with an Advanced Transfer
 */
public class ListAdvancedTransferTransactionsRequest {
    @JsonProperty(required = true, value = "portfolio_id")
    @JsonIgnore
    private String portfolioId;

    @JsonProperty(required = true, value = "advanced_transfer_id")
    @JsonIgnore
    private String advancedTransferId;

    public ListAdvancedTransferTransactionsRequest() {
    }

    public ListAdvancedTransferTransactionsRequest(Builder builder) {
        this.portfolioId = builder.portfolioId;
        this.advancedTransferId = builder.advancedTransferId;
    }

    public String getPortfolioId() {
        return portfolioId;
    }

    public void setPortfolioId(String portfolioId) {
        this.portfolioId = portfolioId;
    }

    public String getAdvancedTransferId() {
        return advancedTransferId;
    }

    public void setAdvancedTransferId(String advancedTransferId) {
        this.advancedTransferId = advancedTransferId;
    }

    public static class Builder {
        private String portfolioId;
        private String advancedTransferId;

        public Builder() {
        }

        public Builder portfolioId(String portfolioId) {
            this.portfolioId = portfolioId;
            return this;
        }

        public Builder advancedTransferId(String advancedTransferId) {
            this.advancedTransferId = advancedTransferId;
            return this;
        }

        public ListAdvancedTransferTransactionsRequest build() throws CoinbaseClientException {
            validate();
            return new ListAdvancedTransferTransactionsRequest(this);
        }

        private void validate() throws CoinbaseClientException {
            if (isNullOrEmpty(this.portfolioId)) {
                throw new CoinbaseClientException("PortfolioId is required");
            }
            if (isNullOrEmpty(this.advancedTransferId)) {
                throw new CoinbaseClientException("AdvancedTransferId is required");
            }
        }
    }
}
