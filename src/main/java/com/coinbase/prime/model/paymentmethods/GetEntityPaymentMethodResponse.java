package com.coinbase.prime.model.paymentmethods;

public class GetEntityPaymentMethodResponse {
    private EntityPaymentMethod paymentMethod;
    private GetEntityPaymentMethodRequest request;

    public GetEntityPaymentMethodResponse() {
    }

    public GetEntityPaymentMethodResponse(Builder builder) {
        this.paymentMethod = builder.paymentMethod;
        this.request = builder.request;
    }

    public EntityPaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(EntityPaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public GetEntityPaymentMethodRequest getRequest() {
        return request;
    }

    public void setRequest(GetEntityPaymentMethodRequest request) {
        this.request = request;
    }

    public static class Builder {
        private EntityPaymentMethod paymentMethod;
        private GetEntityPaymentMethodRequest request;

        public Builder() {
        }

        public Builder paymentMethod(EntityPaymentMethod paymentMethod) {
            this.paymentMethod = paymentMethod;
            return this;
        }

        public Builder request(GetEntityPaymentMethodRequest request) {
            this.request = request;
            return this;
        }

        public GetEntityPaymentMethodResponse build() {
            return new GetEntityPaymentMethodResponse(this);
        }
    }
}
