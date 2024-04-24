package com.coinbase.prime.model.allocations;

public enum AllocationStatus {
    UNSPECIFIED("ALLOCATION_STATUS_UNSPECIFIED"),
    PENDING("ALLOCATION_STATUS_PENDING"),
    ACCEPTED("ALLOCATION_STATUS_ACCEPTED"),
    REJECTED("ALLOCATION_STATUS_REJECTED"),
    ALLOCATED("ALLOCATION_STATUS_ALLOCATED");

    private final String value;

    AllocationStatus(String value) {
        this.value = value;
    }

    public String toString() {
        return value;
    }
}
