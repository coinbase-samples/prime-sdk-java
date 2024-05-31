package com.coinbase.prime.model.products;

import com.coinbase.prime.model.common.PaginationParams;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ListPortfolioProductsRequest {
    @JsonProperty("portfolio_id")
    private String portfolioId;
    private PaginationParams paginationParams;

    public ListPortfolioProductsRequest() {
    }

    public ListPortfolioProductsRequest(Builder builder) {
        this.portfolioId = builder.portfolioId;
        this.paginationParams = builder.paginationParams;
    }

    public String getQueryString() {
        return paginationParams != null ? paginationParams.generateQueryString("") : "";
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

        public Builder() {
        }

        public Builder portfolioId(String portfolioId) {
            this.portfolioId = portfolioId;
            return this;
        }

        public Builder paginationParams(PaginationParams paginationParams) {
            this.paginationParams = paginationParams;
            return this;
        }

        public ListPortfolioProductsRequest build() {
            return new ListPortfolioProductsRequest(this);
        }
    }
}
