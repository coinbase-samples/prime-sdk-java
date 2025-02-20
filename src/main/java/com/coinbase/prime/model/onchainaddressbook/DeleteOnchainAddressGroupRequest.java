package com.coinbase.prime.model.onchainaddressbook;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DeleteOnchainAddressGroupRequest {
    @JsonProperty(required = true, value = "portfolio_id")
    private String portfolioId;
    @JsonProperty(required = true, value = "address_group_id")
    private String addressGroupId;

    public DeleteOnchainAddressGroupRequest() {
    }

    public DeleteOnchainAddressGroupRequest(Builder builder) {
        this.portfolioId = builder.portfolioId;
        this.addressGroupId = builder.addressGroupId;
    }

    public String getPortfolioId() {
        return portfolioId;
    }

    public void setPortfolioId(String portfolioId) {
        this.portfolioId = portfolioId;
    }

    public String getAddressGroupId() {
        return addressGroupId;
    }

    public void setAddressGroupId(String addressGroupId) {
        this.addressGroupId = addressGroupId;
    }

    public static class Builder {
        private String portfolioId;
        private String addressGroupId;

        public Builder() {
        }

        public Builder portfolioId(String portfolioId) {
            this.portfolioId = portfolioId;
            return this;
        }

        public Builder addressGroupId(String addressGroupId) {
            this.addressGroupId = addressGroupId;
            return this;
        }

        public DeleteOnchainAddressGroupRequest build() {
            return new DeleteOnchainAddressGroupRequest(this);
        }
    }
}
