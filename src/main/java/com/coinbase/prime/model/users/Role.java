package com.coinbase.prime.model.users;

public enum Role {
    AUDITOR("AUDITOR"),
    SIGNATORY("SIGNATORY"),
    ADMIN("ADMIN"),
    INITIATOR("INITIATOR"),
    REVIEWER("REVIEWER"),
    TRADER("TRADER"),
    FULL_TRADER("FULL_TRADER"),
    TEAM_MANAGER("TEAM_MANAGER"),
    APPROVER("APPROVER");

    private final String value;

    Role(String value) {
        this.value = value;
    }

    public String toString() {
        return value;
    }
}
