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

package com.coinbase.prime.staking;

import com.coinbase.prime.model.WalletClaimRewardsInputs;
import com.coinbase.core.errors.CoinbaseClientException;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import static com.coinbase.core.utils.Utils.isNullOrEmpty;

/**
 * Creates a request to claim the pending staking rewards from the specified wallet.
 */
public class ClaimRewardsRequest {
    /** The portfolio ID */
    @JsonIgnore
    @JsonProperty(required = true, value = "portfolio_id")
    private String portfolioId;

    /** The wallet ID */
    @JsonIgnore
    @JsonProperty(required = true, value = "wallet_id")
    private String walletId;

    /** The client generated idempotency key for requested execution. Any subsequent requests with the same key will return the original response */
    @JsonProperty("idempotency_key")
    private String idempotencyKey;

    /** Custom inputs for claim rewards operations on a wallet. Requirements and supported fields vary by asset type. */
    @JsonProperty("inputs")
    private WalletClaimRewardsInputs inputs;

    public ClaimRewardsRequest() {
    }

    public ClaimRewardsRequest(Builder builder) {
        this.portfolioId = builder.portfolioId;
        this.walletId = builder.walletId;
        this.idempotencyKey = builder.idempotencyKey;
        this.inputs = builder.inputs;
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

    public String getIdempotencyKey() {
        return idempotencyKey;
    }

    public void setIdempotencyKey(String idempotencyKey) {
        this.idempotencyKey = idempotencyKey;
    }

    public WalletClaimRewardsInputs getInputs() {
        return inputs;
    }

    public void setInputs(WalletClaimRewardsInputs inputs) {
        this.inputs = inputs;
    }

    public static class Builder {
        private String portfolioId;
        private String walletId;
        private String idempotencyKey;
        private WalletClaimRewardsInputs inputs;

        public Builder() {
        }

        public Builder portfolioId(String portfolioId) {
            this.portfolioId = portfolioId;
            return this;
        }

        public Builder walletId(String walletId) {
            this.walletId = walletId;
            return this;
        }

        public Builder idempotencyKey(String idempotencyKey) {
            this.idempotencyKey = idempotencyKey;
            return this;
        }

        public Builder inputs(WalletClaimRewardsInputs inputs) {
            this.inputs = inputs;
            return this;
        }

        public ClaimRewardsRequest build() throws CoinbaseClientException {
            this.validate();
            return new ClaimRewardsRequest(this);
        }

        private void validate() throws CoinbaseClientException {
            if (isNullOrEmpty(this.portfolioId)) {
                throw new CoinbaseClientException("PortfolioId is required");
            }
            if (isNullOrEmpty(this.walletId)) {
                throw new CoinbaseClientException("WalletId is required");
            }
            if (isNullOrEmpty(this.idempotencyKey)) {
                throw new CoinbaseClientException("IdempotencyKey is required");
            }
        }
    }
}
