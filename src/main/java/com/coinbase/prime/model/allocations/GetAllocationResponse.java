package com.coinbase.prime.model.allocations;

public class GetAllocationResponse {
    private Allocation allocation;

    private GetAllocationRequest request;

    public GetAllocationResponse() {
    }

    public GetAllocationResponse(Builder builder) {
        this.allocation = builder.allocation;
        this.request = builder.request;
    }

    public Allocation getAllocation() {
        return allocation;
    }

    public void setAllocation(Allocation allocation) {
        this.allocation = allocation;
    }

    public GetAllocationRequest getRequest() {
        return request;
    }

    public void setRequest(GetAllocationRequest request) {
        this.request = request;
    }

    public static class Builder {
        private Allocation allocation;
        private GetAllocationRequest request;

        public Builder() {
        }

        public Builder allocation(Allocation allocation) {
            this.allocation = allocation;
            return this;
        }

        public Builder request(GetAllocationRequest request) {
            this.request = request;
            return this;
        }

        public GetAllocationResponse build() {
            return new GetAllocationResponse(this);
        }
    }
}
