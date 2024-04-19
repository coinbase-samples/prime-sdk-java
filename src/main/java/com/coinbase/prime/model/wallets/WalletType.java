package com.coinbase.prime.model.wallets;

public enum WalletType {
    VAULT("VAULT"),
    TRADING("TRADING"),
    WALLET_TYPE_OTHER("WALLET_TYPE_OTHER"),
    WEB3("WEB3");

    private final String value;

    WalletType(final String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }
}
