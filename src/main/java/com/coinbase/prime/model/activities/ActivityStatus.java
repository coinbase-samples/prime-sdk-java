package com.coinbase.prime.model.activities;

public enum ActivityStatus {
    OTHER("OTHER_ACITIVITY_STATUS"),
    CANCELLED("ACTIVITY_STATUS_CANCELLED"),
    PROCESSING("ACTIVITY_STATUS_PROCESSING"),
    COMPLETED("ACTIVITY_STATUS_COMPLETED"),
    EXPIRED("ACTIVITY_STATUS_EXPIRED"),
    REJECTED("ACTIVITY_STATUS_REJECTED"),
    FAILED("ACTIVITY_STATUS_FAILED");

    private final String value;

    ActivityStatus(String value) {
        this.value = value;
    }

    public String toString() {
        return this.value;
    }
}
