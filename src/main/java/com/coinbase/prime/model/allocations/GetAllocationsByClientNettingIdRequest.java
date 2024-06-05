package com.coinbase.prime.model.allocations;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetAllocationsByClientNettingIdRequest {
    @JsonProperty("portfolio_id")
    private String portfolioId;
    @JsonProperty("netting_id")
    private String nettingId;

    public GetAllocationsByClientNettingIdRequest() {
    }

    public GetAllocationsByClientNettingIdRequest(Builder builder) {
        this.portfolioId = builder.portfolioId;
        this.nettingId = builder.nettingId;
    }

    public String getPortfolioId() {
        return portfolioId;
    }

    public void setPortfolioId(String portfolioId) {
        this.portfolioId = portfolioId;
    }

    public String getNettingId() {
        return nettingId;
    }

    public void setNettingId(String nettingId) {
        this.nettingId = nettingId;
    }

    public static class Builder {
        private String portfolioId;
        private String nettingId;

        public Builder() {
        }

        public Builder portfolioId(String portfolioId) {
            this.portfolioId = portfolioId;
            return this;
        }

        public Builder nettingId(String nettingId) {
            this.nettingId = nettingId;
            return this;
        }

        public GetAllocationsByClientNettingIdRequest build() {
            return new GetAllocationsByClientNettingIdRequest(this);
        }
    }
}
