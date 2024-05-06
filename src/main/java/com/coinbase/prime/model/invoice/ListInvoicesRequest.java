package com.coinbase.prime.model.invoice;

import com.coinbase.prime.utils.Utils;
import com.fasterxml.jackson.annotation.JsonProperty;

import static com.coinbase.prime.utils.Utils.appendQueryParams;

public class ListInvoicesRequest {
    @JsonProperty("entity_id")
    private String entityId;
    private InvoiceState[] states;
    @JsonProperty("billing_month")
    private Integer billingMonth;
    @JsonProperty("billing_year")
    private Integer billingYear;
    private Integer cursor;
    private Integer limit;

    public ListInvoicesRequest() {
    }

    public ListInvoicesRequest(Builder builder) {
        this.entityId = builder.entityId;
        this.states = builder.states;
        this.billingMonth = builder.billingMonth;
        this.billingYear = builder.billingYear;
        this.cursor = builder.cursor;
        this.limit = builder.limit;
    }


    public String getQueryString() {
        String queryParams = "";
        if (this.getStates() != null) {
            for (InvoiceState state : this.getStates()) {
                queryParams = appendQueryParams(queryParams, "states", state.toString());
            }
        }
        if (this.getBillingMonth() != null) {
            queryParams = appendQueryParams(queryParams, "billing_month", this.getBillingMonth().toString());
        }
        if (this.getBillingYear() != null) {
            queryParams = appendQueryParams(queryParams, "billing_year", this.getBillingYear().toString());
        }
        if (this.getCursor() != null) {
            queryParams = appendQueryParams(queryParams, "cursor", this.getCursor().toString());
        }
        if (this.getLimit() != null) {
            queryParams = appendQueryParams(queryParams, "limit", this.getLimit().toString());
        }
        return queryParams;
    }

    public String getEntityId() {
        return entityId;
    }

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    public InvoiceState[] getStates() {
        return states;
    }

    public void setStates(InvoiceState[] states) {
        this.states = states;
    }

    public Integer getBillingMonth() {
        return billingMonth;
    }

    public void setBillingMonth(Integer billingMonth) {
        this.billingMonth = billingMonth;
    }

    public Integer getBillingYear() {
        return billingYear;
    }

    public void setBillingYear(Integer billingYear) {
        this.billingYear = billingYear;
    }

    public Integer getCursor() {
        return cursor;
    }

    public void setCursor(Integer cursor) {
        this.cursor = cursor;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public static class Builder {
        private String entityId;
        private InvoiceState[] states;
        private Integer billingMonth;
        private Integer billingYear;
        private Integer cursor;
        private Integer limit;

        public Builder() {
        }

        public Builder entityId(String entityId) {
            this.entityId = entityId;
            return this;
        }

        public Builder states(InvoiceState[] states) {
            this.states = states;
            return this;
        }

        public Builder billingMonth(Integer billingMonth) {
            this.billingMonth = billingMonth;
            return this;
        }

        public Builder billingYear(Integer billingYear) {
            this.billingYear = billingYear;
            return this;
        }

        public Builder cursor(Integer cursor) {
            this.cursor = cursor;
            return this;
        }

        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        public ListInvoicesRequest build() {
            return new ListInvoicesRequest(this);
        }
    }
}
