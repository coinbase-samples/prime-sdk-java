package com.coinbase.prime.model.portfolio;

public class GetPortfolioCreditInformationResponse {
    private PostTradeCredit postTradeCredit;
    private GetPortfolioCreditInformationRequest request;

    public GetPortfolioCreditInformationResponse() {
    }

    public GetPortfolioCreditInformationResponse(Builder builder) {
        this.postTradeCredit = builder.postTradeCredit;
        this.request = builder.request;
    }

    public PostTradeCredit getPostTradeCredit() {
        return postTradeCredit;
    }

    public void setPortfolioCreditInformation(PostTradeCredit postTradeCredit) {
        this.postTradeCredit = postTradeCredit;
    }

    public GetPortfolioCreditInformationRequest getRequest() {
        return request;
    }

    public void setRequest(GetPortfolioCreditInformationRequest request) {
        this.request = request;
    }

    public static class Builder {
        private PostTradeCredit postTradeCredit;
        private GetPortfolioCreditInformationRequest request;

        public Builder() {
        }

        public Builder postTradeCredit(PostTradeCredit postTradeCredit) {
            this.postTradeCredit = postTradeCredit;
            return this;
        }

        public Builder request(GetPortfolioCreditInformationRequest request) {
            this.request = request;
            return this;
        }

        public GetPortfolioCreditInformationResponse build() {
            return new GetPortfolioCreditInformationResponse(this);
        }
    }
}
