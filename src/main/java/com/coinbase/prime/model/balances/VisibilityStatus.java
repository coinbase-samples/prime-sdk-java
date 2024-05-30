package com.coinbase.prime.model.balances;

/**
 * Possible values: [UNKNOWN_VISIBILITY_STATUS, VISIBLE, HIDDEN, SPAM]
 */
public enum VisibilityStatus {
    UNKNOWN("UNKNOWN_VISIBILITY_STATUS"),
    VISIBLE("VISIBLE"),
    HIDDEN("HIDDEN"),
    SPAM("SPAM");

    private final String value;

    VisibilityStatus(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
