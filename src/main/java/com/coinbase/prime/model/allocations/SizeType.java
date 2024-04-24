package com.coinbase.prime.model.allocations;

public enum SizeType {
    BASE("BASE"),
    QUOTE("QUOTE"),
    PERCENT("PERCENT");

    private final String value;

    SizeType(final String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }
}
