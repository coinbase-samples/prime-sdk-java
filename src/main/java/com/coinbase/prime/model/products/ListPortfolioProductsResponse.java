package com.coinbase.prime.model.products;

import com.coinbase.prime.model.common.Pagination;

public class ListPortfolioProductsResponse {
    private Product[] products;
    private ListPortfolioProductsRequest request;
    private Pagination pagination;

    public ListPortfolioProductsResponse() {
    }

    public ListPortfolioProductsResponse(Builder builder) {
        this.products = builder.products;
        this.request = builder.request;
        this.pagination = builder.pagination;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public ListPortfolioProductsRequest getRequest() {
        return request;
    }

    public void setRequest(ListPortfolioProductsRequest request) {
        this.request = request;
    }

    public Pagination getPagination() {
        return pagination;
    }

    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }

    public static class Builder {
        private Product[] products;
        private ListPortfolioProductsRequest request;
        private Pagination pagination;

        public Builder() {
        }

        public Builder products(Product[] products) {
            this.products = products;
            return this;
        }

        public Builder request(ListPortfolioProductsRequest request) {
            this.request = request;
            return this;
        }

        public Builder pagination(Pagination pagination) {
            this.pagination = pagination;
            return this;
        }

        public ListPortfolioProductsResponse build() {
            return new ListPortfolioProductsResponse(this);
        }
    }
}
