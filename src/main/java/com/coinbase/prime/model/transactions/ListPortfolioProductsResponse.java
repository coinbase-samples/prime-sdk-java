package com.coinbase.prime.model.transactions;

import com.coinbase.prime.model.common.Pagination;

public class ListPortfolioProductsResponse {
    private Transaction[] transactions;
    private Pagination pagination;
    private ListPortfolioTransactionsRequest request;

    public ListPortfolioProductsResponse() {
    }

    public ListPortfolioProductsResponse(Builder builder) {
        this.transactions = builder.transactions;
        this.pagination = builder.pagination;
        this.request = builder.request;
    }

    public Transaction[] getTransactions() {
        return transactions;
    }

    public void setTransactions(Transaction[] transactions) {
        this.transactions = transactions;
    }

    public Pagination getPagination() {
        return pagination;
    }

    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }

    public ListPortfolioTransactionsRequest getRequest() {
        return request;
    }

    public void setRequest(ListPortfolioTransactionsRequest request) {
        this.request = request;
    }

    public static class Builder {
        private Transaction[] transactions;
        private Pagination pagination;
        private ListPortfolioTransactionsRequest request;

        public Builder() {
        }

        public Builder transactions(Transaction[] transactions) {
            this.transactions = transactions;
            return this;
        }

        public Builder pagination(Pagination pagination) {
            this.pagination = pagination;
            return this;
        }

        public Builder request(ListPortfolioTransactionsRequest request) {
            this.request = request;
            return this;
        }

        public ListPortfolioProductsResponse build() {
            return new ListPortfolioProductsResponse(this);
        }
    }
}
