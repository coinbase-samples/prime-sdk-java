package com.coinbase.prime.model.balances;

public enum BalancesType {
    TRADING_BALANCES("TRADING_BALANCES"),
    VAULT_BALANCES("VAULT_BALANCES"),
    TOTAL_BALANCES("TOTAL_BALANCES");

    private final String value;

    BalancesType(final String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }
}
