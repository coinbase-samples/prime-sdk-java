package com.coinbase.prime.model.activities;

public enum ActivityCategory {
    OTHER("OTHER_ACTIVITY_CATEGORY"),
    ORDER("ACTIVITY_CATEGORY_ORDER"),
    TRANSACTION("ACTIVITY_CATEGORY_TRANSACTION"),
    ACCOUNT("ACTIVITY_CATEGORY_ACCOUNT"),
    ADMIN("ACTIVITY_CATEGORY_ADMIN"),
    ALLOCATION("ACTIVITY_CATEGORY_ALLOCATION");

    private final String value;

    ActivityCategory(String value) {
        this.value = value;
    }

    public String toString() {
        return this.value;
    }
}
