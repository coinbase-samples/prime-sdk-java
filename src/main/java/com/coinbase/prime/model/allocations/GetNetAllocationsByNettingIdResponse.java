package com.coinbase.prime.model.allocations;

public class GetNetAllocationsByNettingIdResponse {
    private Allocation[] allocations;
    private GetNetAllocationsByNettingIdRequest request;

    public GetNetAllocationsByNettingIdResponse() {
    }

    public GetNetAllocationsByNettingIdResponse(Builder builder) {
        this.allocations = builder.allocations;
        this.request = builder.request;
    }

    public Allocation[] getAllocations() {
        return allocations;
    }

    public void setAllocations(Allocation[] allocations) {
        this.allocations = allocations;
    }

    public GetNetAllocationsByNettingIdRequest getRequest() {
        return request;
    }

    public void setRequest(GetNetAllocationsByNettingIdRequest request) {
        this.request = request;
    }

    public static class Builder {
        private Allocation[] allocations;
        private GetNetAllocationsByNettingIdRequest request;

        public Builder() {
        }

        public Builder allocations(Allocation[] allocations) {
            this.allocations = allocations;
            return this;
        }

        public Builder request(GetNetAllocationsByNettingIdRequest request) {
            this.request = request;
            return this;
        }

        public GetNetAllocationsByNettingIdResponse build() {
            return new GetNetAllocationsByNettingIdResponse(this);
        }
    }
}
