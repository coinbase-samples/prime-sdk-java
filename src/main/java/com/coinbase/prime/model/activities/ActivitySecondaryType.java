package com.coinbase.prime.model.activities;

public enum ActivitySecondaryType {
    NONE("NO_SECONDARY_TYPE"),
    BUY("ACTIVITY_SECONDARY_TYPE_BUY"),
    SELL("ACTIVITY_SECONDARY_TYPE_SELL"),
    INTERNAL_TRANSFER("ACTIVITY_SECONDARY_TYPE_INTERNAL_TRANSFER"),
    SWEEP_TRANSFER_TYPE("ACTIVITY_SECONDARY_TYPE_SWEEP_TRANSFER_TYPE"),
    WEB3_SIGNER("ACTIVITY_SECONDARY_TYPE_WEB3_SIGNER"),
    WEB3_WALLET("ACTIVITY_SECONDARY_TYPE_WEB3_WALLET");

    private final String value;

    ActivitySecondaryType(String value) {
        this.value = value;
    }

    public String toString() {
        return this.value;
    }
}
