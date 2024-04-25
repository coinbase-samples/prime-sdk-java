package com.coinbase.prime.model.allocations;

public class GetAllocationByIdResponse {
    private Allocation allocation;

    private GetAllocationByIdRequest request;

    public GetAllocationByIdResponse() {
    }

    public GetAllocationByIdResponse(Builder builder) {
        this.allocation = builder.allocation;
        this.request = builder.request;
    }

    public Allocation getAllocation() {
        return allocation;
    }

    public void setAllocation(Allocation allocation) {
        this.allocation = allocation;
    }

    public GetAllocationByIdRequest getRequest() {
        return request;
    }

    public void setRequest(GetAllocationByIdRequest request) {
        this.request = request;
    }

    public static class Builder {
        private Allocation allocation;
        private GetAllocationByIdRequest request;

        public Builder() {
        }

        public Builder allocation(Allocation allocation) {
            this.allocation = allocation;
            return this;
        }

        public Builder request(GetAllocationByIdRequest request) {
            this.request = request;
            return this;
        }

        public GetAllocationByIdResponse build() {
            return new GetAllocationByIdResponse(this);
        }
    }
}
