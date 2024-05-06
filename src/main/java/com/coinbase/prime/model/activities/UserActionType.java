package com.coinbase.prime.model.activities;

public enum UserActionType {
    OTHER("OTHER_ACTION"),
    APPROVE("ACTION_APPROVE"),
    REJECT("ACTION_REJECT"),
    INITIATE("ACTION_INITIATE"),
    CANCEL("ACTION_CANCEL");

    private final String value;

    UserActionType(String value) {
        this.value = value;
    }

    public String toString() {
        return this.value;
    }
}
