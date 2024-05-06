package com.coinbase.prime.model.paymentmethods;

public enum PaymentMethodType {
    WIRE("METHOD_WIRE"),
    SEN("METHOD_SEN"),
    SWIFT("METHOD_SWIFT");

    private final String value;

    private PaymentMethodType(String value) {
        this.value = value;
    }

    public String toString() {
        return value;
    }
}
