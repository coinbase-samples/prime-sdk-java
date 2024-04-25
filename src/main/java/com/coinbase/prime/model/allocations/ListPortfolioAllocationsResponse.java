package com.coinbase.prime.model.allocations;

import com.coinbase.prime.model.common.Pagination;

public class ListPortfolioAllocationsResponse {
    private Allocation[] allocations;
    private Pagination pagination;

    private ListPortfolioAllocationsRequest request;

    public ListPortfolioAllocationsResponse() {
    }

    public ListPortfolioAllocationsResponse(Builder builder) {
        this.allocations = builder.allocations;
        this.pagination = builder.pagination;
        this.request = builder.request;
    }

    public Allocation[] getAllocations() {
        return allocations;
    }

    public void setAllocations(Allocation[] allocations) {
        this.allocations = allocations;
    }

    public Pagination getPagination() {
        return pagination;
    }

    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }

    public ListPortfolioAllocationsRequest getRequest() {
        return request;
    }

    public void setRequest(ListPortfolioAllocationsRequest request) {
        this.request = request;
    }

    public static class Builder {
        private Allocation[] allocations;
        private Pagination pagination;

        private ListPortfolioAllocationsRequest request;

        public Builder() {
        }

        public Builder allocations(Allocation[] allocations) {
            this.allocations = allocations;
            return this;
        }

        public Builder pagination(Pagination pagination) {
            this.pagination = pagination;
            return this;
        }

        public Builder request(ListPortfolioAllocationsRequest request) {
            this.request = request;
            return this;
        }

        public ListPortfolioAllocationsResponse build() {
            return new ListPortfolioAllocationsResponse(this);
        }
    }
}
