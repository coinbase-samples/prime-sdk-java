package com.coinbase.prime.model.onchainaddressbook;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ListOnchainAddressGroupsRequest {
    @JsonProperty(required = true, value = "portfolio_id")
    private String portfolioId;

    public ListOnchainAddressGroupsRequest() {
    }

    public ListOnchainAddressGroupsRequest(Builder builder) {
        this.portfolioId = builder.portfolioId;
    }

    public String getPortfolioId() {
        return portfolioId;
    }

    public void setPortfolioId(String portfolioId) {
        this.portfolioId = portfolioId;
    }

    public static class Builder {
        private String portfolioId;

        public Builder() {
        }

        public Builder portfolioId(String portfolioId) {
            this.portfolioId = portfolioId;
            return this;
        }

        public ListOnchainAddressGroupsRequest build() {
            return new ListOnchainAddressGroupsRequest(this);
        }
    }
}
