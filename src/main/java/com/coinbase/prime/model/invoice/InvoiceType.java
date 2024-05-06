package com.coinbase.prime.model.invoice;

public enum InvoiceType {
    UNSPECIFIED("INVOICE_TYPE_UNSPECIFIED"),
    AUC_FEE("INVOICE_TYPE_AUC_FEE"),
    MINIMUM_FEE("INVOICE_TYPE_MINIMUM_FEE"),
    WITHDRAWAL_FEE("INVOICE_TYPE_WITHDRAWAL_FEE"),
    NEW_WALLET_FEE("INVOICE_TYPE_NEW_WALLET_FEE"),
    STAKING_FEE("INVOICE_TYPE_STAKING_FEE");

    private final String value;

    InvoiceType(String value) {
        this.value = value;
    }

    public String toString() {
        return value;
    }
}
