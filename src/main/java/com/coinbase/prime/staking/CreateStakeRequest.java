package com.coinbase.prime.staking;

import com.coinbase.prime.model.StakingInputs;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateStakeRequest {
    @JsonIgnore
    @JsonProperty(required = true, value = "portfolio_id")
    private String portfolioId;

    @JsonIgnore
    @JsonProperty(required = true, value = "wallet_id")
    private String walletId;

    @JsonProperty("idempotency_key")
    private String idempotencyKey;

    private StakingInputs inputs;

    public CreateStakeRequest() {
    }

    public CreateStakeRequest(Builder builder) {
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

    public StakingInputs getInputs() {
        return inputs;
    }

    public void setInputs(StakingInputs inputs) {
        this.inputs = inputs;
    }

    public static class Builder {
        private String portfolioId;
        private String walletId;
        private String idempotencyKey;
        private StakingInputs inputs;

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

        public Builder inputs(StakingInputs inputs) {
            this.inputs = inputs;
            return this;
        }

        public CreateStakeRequest build() {
            return new CreateStakeRequest(this);
        }
    }
}
