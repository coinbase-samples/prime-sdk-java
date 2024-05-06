package com.coinbase.prime.model.invoice;

public enum InvoiceState {
    UNSPECIFIED("INVOICE_STATE_UNSPECIFIED"),
    IMPORTED("INVOICE_STATE_IMPORTED"),
    BILLED("INVOICE_STATE_BILLED"),
    PARTIALLY_PAID("INVOICE_STATE_PARTIALLY_PAID"),
    PAID("INVOICE_STATE_PAID");

    private final String value;

    InvoiceState(String value) {
        this.value = value;
    }

    public String toString() {
        return value;
    }
}
