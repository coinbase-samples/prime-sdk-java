package com.coinbase.prime.model.transactions;

import com.coinbase.prime.model.common.Pagination;

public class ListWalletTransactionsResponse {
    private Transaction[] transactions;
    private Pagination pagination;
    private ListWalletTransactionsRequest request;

    public ListWalletTransactionsResponse() {
    }

    public ListWalletTransactionsResponse(Builder builder) {
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

    public ListWalletTransactionsRequest getRequest() {
        return request;
    }

    public void setRequest(ListWalletTransactionsRequest request) {
        this.request = request;
    }

    public static class Builder {
        private Transaction[] transactions;
        private Pagination pagination;
        private ListWalletTransactionsRequest request;

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

        public Builder request(ListWalletTransactionsRequest request) {
            this.request = request;
            return this;
        }

        public ListWalletTransactionsResponse build() {
            return new ListWalletTransactionsResponse(this);
        }
    }
}
