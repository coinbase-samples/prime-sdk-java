package com.coinbase.prime.model.allocations;

import com.coinbase.prime.model.common.Pagination;

public class GetPortfolioAllocationsResponse {
    private Allocation[] allocations;
    private Pagination pagination;

    private GetPortfolioAllocationsRequest request;

    public GetPortfolioAllocationsResponse() {
    }

    public GetPortfolioAllocationsResponse(Builder builder) {
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

    public GetPortfolioAllocationsRequest getRequest() {
        return request;
    }

    public void setRequest(GetPortfolioAllocationsRequest request) {
        this.request = request;
    }

    public static class Builder {
        private Allocation[] allocations;
        private Pagination pagination;

        private GetPortfolioAllocationsRequest request;

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

        public Builder request(GetPortfolioAllocationsRequest request) {
            this.request = request;
            return this;
        }

        public GetPortfolioAllocationsResponse build() {
            return new GetPortfolioAllocationsResponse(this);
        }
    }
}
