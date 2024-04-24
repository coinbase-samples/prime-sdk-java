package com.coinbase.prime.model.common;

public enum OrderSide {
    BUY("BUY"),
    SELL("SELL");

    private final String value;

    OrderSide(final String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }
}
