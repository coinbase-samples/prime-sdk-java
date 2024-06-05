package com.coinbase.prime.model.allocations;

public class GetAllocationsByClientNettingIdResponse {
    private Allocation[] allocations;
    private GetAllocationsByClientNettingIdRequest request;

    public GetAllocationsByClientNettingIdResponse() {
    }

    public GetAllocationsByClientNettingIdResponse(Builder builder) {
        this.allocations = builder.allocations;
        this.request = builder.request;
    }

    public Allocation[] getAllocations() {
        return allocations;
    }

    public void setAllocations(Allocation[] allocations) {
        this.allocations = allocations;
    }

    public GetAllocationsByClientNettingIdRequest getRequest() {
        return request;
    }

    public void setRequest(GetAllocationsByClientNettingIdRequest request) {
        this.request = request;
    }

    public static class Builder {
        private Allocation[] allocations;
        private GetAllocationsByClientNettingIdRequest request;

        public Builder() {
        }

        public Builder allocations(Allocation[] allocations) {
            this.allocations = allocations;
            return this;
        }

        public Builder request(GetAllocationsByClientNettingIdRequest request) {
            this.request = request;
            return this;
        }

        public GetAllocationsByClientNettingIdResponse build() {
            return new GetAllocationsByClientNettingIdResponse(this);
        }
    }
}
