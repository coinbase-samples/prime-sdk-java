package com.coinbase.prime.model.paymentmethods;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ListEntityPaymentMethodsResponse {
    @JsonProperty("payment_methods")
    private EntityPaymentMethod[] paymentMethods;
    private ListEntityPaymentMethodsRequest request;

    public ListEntityPaymentMethodsResponse() {
    }

    public ListEntityPaymentMethodsResponse(Builder builder) {
        this.paymentMethods = builder.paymentMethods;
        this.request = builder.request;
    }

    public EntityPaymentMethod[] getPaymentMethods() {
        return paymentMethods;
    }

    public void setPaymentMethods(EntityPaymentMethod[] paymentMethods) {
        this.paymentMethods = paymentMethods;
    }

    public ListEntityPaymentMethodsRequest getRequest() {
        return request;
    }

    public void setRequest(ListEntityPaymentMethodsRequest request) {
        this.request = request;
    }

    public static class Builder {
        private EntityPaymentMethod[] paymentMethods;
        private ListEntityPaymentMethodsRequest request;

        public Builder() {
        }

        public Builder paymentMethods(EntityPaymentMethod[] paymentMethods) {
            this.paymentMethods = paymentMethods;
            return this;
        }

        public Builder request(ListEntityPaymentMethodsRequest request) {
            this.request = request;
            return this;
        }

        public ListEntityPaymentMethodsResponse build() {
            return new ListEntityPaymentMethodsResponse(this);
        }
    }
}
