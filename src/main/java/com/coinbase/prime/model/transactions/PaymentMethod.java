package com.coinbase.prime.model.transactions;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PaymentMethod {
    @JsonProperty("payment_method_id")
    private String paymentMethodId;

    public PaymentMethod() {
    }

    public PaymentMethod(Builder builder) {
        this.paymentMethodId = builder.paymentMethodId;
    }

    public String getPaymentMethodId() {
        return paymentMethodId;
    }

    public void setPaymentMethodId(String paymentMethodId) {
        this.paymentMethodId = paymentMethodId;
    }

    public static class Builder {
        private String paymentMethodId;

        public Builder() {
        }

        public Builder paymentMethodId(String paymentMethodId) {
            this.paymentMethodId = paymentMethodId;
            return this;
        }

        public PaymentMethod build() {
            return new PaymentMethod(this);
        }
    }
}
