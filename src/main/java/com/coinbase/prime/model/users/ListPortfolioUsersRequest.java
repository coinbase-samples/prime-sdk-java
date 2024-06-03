package com.coinbase.prime.model.users;

import com.coinbase.prime.model.common.PaginationParams;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ListPortfolioUsersRequest {
    @JsonProperty("portfolio_id")
    private String portfolioId;
    private PaginationParams paginationParams;

    public ListPortfolioUsersRequest() {
    }

    public ListPortfolioUsersRequest(Builder builder) {
        this.portfolioId = builder.portfolioId;
        this.paginationParams = builder.paginationParams;
    }

    public String getPortfolioId() {
        return portfolioId;
    }

    public void setPortfolioId(String portfolioId) {
        this.portfolioId = portfolioId;
    }

    public PaginationParams getPaginationParams() {
        return paginationParams;
    }

    public void setPaginationParams(PaginationParams paginationParams) {
        this.paginationParams = paginationParams;
    }

    public static class Builder {
        private String portfolioId;
        private PaginationParams paginationParams;

        public Builder portfolioId(String portfolioId) {
            this.portfolioId = portfolioId;
            return this;
        }

        public Builder paginationParams(PaginationParams paginationParams) {
            this.paginationParams = paginationParams;
            return this;
        }

        public ListPortfolioUsersRequest build() {
            return new ListPortfolioUsersRequest(this);
        }
    }
}
