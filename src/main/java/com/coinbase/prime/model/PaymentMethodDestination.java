package com.coinbase.prime.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;

public class PaymentMethodDestination {
    private String paymentMethodId;

    public PaymentMethodDestination() {
    }

    public PaymentMethodDestination(Builder builder) {
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

        public Builder paymentMethodId(String paymentMethodId) {
            this.paymentMethodId = paymentMethodId;
            return this;
        }

        public PaymentMethodDestination build() {
            return new PaymentMethodDestination(this);
        }
    }
}

