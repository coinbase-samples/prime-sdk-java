package com.coinbase.prime.model.invoice;

public class ListInvoicesResponse {
    private Invoice[] invoices;
    private ListInvoicesRequest request;

    public ListInvoicesResponse() {
    }

    public ListInvoicesResponse(Builder builder) {
        this.invoices = builder.invoices;
        this.request = builder.request;
    }

    public Invoice[] getInvoices() {
        return invoices;
    }

    public void setInvoices(Invoice[] invoices) {
        this.invoices = invoices;
    }

    public ListInvoicesRequest getRequest() {
        return request;
    }

    public void setRequest(ListInvoicesRequest request) {
        this.request = request;
    }

    public static class Builder {
        private Invoice[] invoices;
        private ListInvoicesRequest request;

        public Builder invoices(Invoice[] invoices) {
            this.invoices = invoices;
            return this;
        }

        public Builder request(ListInvoicesRequest request) {
            this.request = request;
            return this;
        }

        public ListInvoicesResponse build() {
            return new ListInvoicesResponse(this);
        }
    }
}
