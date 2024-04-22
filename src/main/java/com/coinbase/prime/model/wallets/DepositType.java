package com.coinbase.prime.model.wallets;

public enum DepositType {
    CRYPTO("CRYPTO"),
    WIRE("WIRE"),
    SEN("SEN"),
    SWIFT("SWIFT"),
    UNKNOWN("UNKNOWN_WALLET_DEPOSIT_TYPE");

    private final String value;

    DepositType(final String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }
}
