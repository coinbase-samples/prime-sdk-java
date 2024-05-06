package com.coinbase.prime.model.users;

import com.coinbase.prime.model.common.PaginationParams;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ListPortfolioUsersRequest {
    @JsonProperty("portfolio_id")
    private String portfolioId;
    private PaginationParams pagination;

    public ListPortfolioUsersRequest() {
    }

    public ListPortfolioUsersRequest(Builder builder) {
        this.portfolioId = builder.portfolioId;
        this.pagination = builder.pagination;
    }

    public String getPortfolioId() {
        return portfolioId;
    }

    public void setPortfolioId(String portfolioId) {
        this.portfolioId = portfolioId;
    }

    public PaginationParams getPagination() {
        return pagination;
    }

    public void setPagination(PaginationParams pagination) {
        this.pagination = pagination;
    }

    public static class Builder {
        private String portfolioId;
        private PaginationParams pagination;

        public Builder portfolioId(String portfolioId) {
            this.portfolioId = portfolioId;
            return this;
        }

        public Builder paginationParams(PaginationParams pagination) {
            this.pagination = pagination;
            return this;
        }

        public ListPortfolioUsersRequest build() {
            return new ListPortfolioUsersRequest(this);
        }
    }
}
