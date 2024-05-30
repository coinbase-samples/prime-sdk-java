package com.coinbase.prime.model.commission;

public class GetPortfolioCommissionResponse {
    private Commission commission;
    private GetPortfolioCommissionRequest request;

    public GetPortfolioCommissionResponse() {
    }

    public GetPortfolioCommissionResponse(Builder builder) {
        this.commission = builder.commission;
        this.request = builder.request;
    }

    public Commission getCommission() {
        return commission;
    }

    public void setCommission(Commission commission) {
        this.commission = commission;
    }

    public GetPortfolioCommissionRequest getRequest() {
        return request;
    }

    public void setRequest(GetPortfolioCommissionRequest request) {
        this.request = request;
    }

    public static class Builder {
        private Commission commission;
        private GetPortfolioCommissionRequest request;

        public Builder() {
        }

        public Builder commission(Commission commission) {
            this.commission = commission;
            return this;
        }

        public Builder request(GetPortfolioCommissionRequest request) {
            this.request = request;
            return this;
        }

        public GetPortfolioCommissionResponse build() {
            return new GetPortfolioCommissionResponse(this);
        }
    }
}
