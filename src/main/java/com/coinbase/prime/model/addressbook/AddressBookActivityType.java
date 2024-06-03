package com.coinbase.prime.model.addressbook;

/**
 * String value enum for the type of activity in the address book.
 * Possible values: [ACTIVITY_TYPE_GOVERNANCE_VOTE, ACTIVITY_TYPE_INVITATION, ACTIVITY_TYPE_WALLET_CHANGE, ACTIVITY_TYPE_API_KEY_CHANGE, ACTIVITY_TYPE_SETTINGS_CHANGE, ACTIVITY_TYPE_BILLING_PREFERENCE_CHANGE, ACTIVITY_TYPE_PAYMENT_METHOD_CHANGE, ACTIVITY_TYPE_WITHDRAWAL, ACTIVITY_TYPE_DEPOSIT, ACTIVITY_TYPE_CREATE_WALLET, ACTIVITY_TYPE_REMOVE_WALLET, ACTIVITY_TYPE_UPDATE_WALLET, ACTIVITY_TYPE_CAST_VOTE, ACTIVITY_TYPE_ENABLE_VOTING, ACTIVITY_TYPE_STAKE, ACTIVITY_TYPE_UNSTAKE, ACTIVITY_TYPE_CHANGE_VALIDATOR, ACTIVITY_TYPE_RESTAKE, ACTIVITY_TYPE_ADDRESS_BOOK, ACTIVITY_TYPE_TEAM_MEMBERS, ACTIVITY_TYPE_BILLING, ACTIVITY_TYPE_SECURITY, ACTIVITY_TYPE_API, ACTIVITY_TYPE_SETTINGS, ACTIVITY_TYPE_SMART_CONTRACT, ACTIVITY_TYPE_USER_CHANGE_REQUEST_NO_PAS, ACTIVITY_TYPE_WEB3_TRANSACTION, ACTIVITY_TYPE_WEB3_MESSAGE]
 */
public enum AddressBookActivityType {
    GOVERNANCE_VOTE("ACTIVITY_TYPE_GOVERNANCE_VOTE"),
    INVITATION("ACTIVITY_TYPE_INVITATION"),
    WALLET_CHANGE("ACTIVITY_TYPE_WALLET_CHANGE"),
    API_KEY_CHANGE("ACTIVITY_TYPE_API_KEY_CHANGE"),
    SETTINGS_CHANGE("ACTIVITY_TYPE_SETTINGS_CHANGE"),
    BILLING_PREFERENCE_CHANGE("ACTIVITY_TYPE_BILLING_PREFERENCE_CHANGE"),
    PAYMENT_METHOD_CHANGE("ACTIVITY_TYPE_PAYMENT_METHOD_CHANGE"),
    WITHDRAWAL("ACTIVITY_TYPE_WITHDRAWAL"),
    DEPOSIT("ACTIVITY_TYPE_DEPOSIT"),
    CREATE_WALLET("ACTIVITY_TYPE_CREATE_WALLET"),
    REMOVE_WALLET("ACTIVITY_TYPE_REMOVE_WALLET"),
    UPDATE_WALLET("ACTIVITY_TYPE_UPDATE_WALLET"),
    CAST_VOTE("ACTIVITY_TYPE_CAST_VOTE"),
    ENABLE_VOTING("ACTIVITY_TYPE_ENABLE_VOTING"),
    STAKE("ACTIVITY_TYPE_STAKE"),
    UNSTAKE("ACTIVITY_TYPE_UNSTAKE"),
    CHANGE_VALIDATOR("ACTIVITY_TYPE_CHANGE_VALIDATOR"),
    RESTAKE("ACTIVITY_TYPE_RESTAKE"),
    ADDRESS_BOOK("ACTIVITY_TYPE_ADDRESS_BOOK"),
    TEAM_MEMBERS("ACTIVITY_TYPE_TEAM_MEMBERS"),
    BILLING("ACTIVITY_TYPE_BILLING"),
    SECURITY("ACTIVITY_TYPE_SECURITY"),
    API("ACTIVITY_TYPE_API"),
    SETTINGS("ACTIVITY_TYPE_SETTINGS"),
    SMART_CONTRACT("ACTIVITY_TYPE_SMART_CONTRACT"),
    USER_CHANGE_REQUEST_NO_PAS("ACTIVITY_TYPE_USER_CHANGE_REQUEST_NO_PAS"),
    WEB3_TRANSACTION("ACTIVITY_TYPE_WEB3_TRANSACTION"),
    WEB3_MESSAGE("ACTIVITY_TYPE_WEB3_MESSAGE");

    private final String value;

    AddressBookActivityType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}