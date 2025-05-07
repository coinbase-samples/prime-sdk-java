package com.coinbase.prime.financing;

import com.coinbase.prime.model.Accrual;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ListInterestAccrualsResponse {
    @JsonProperty("total_notional_accrual")
    private String totalNotionalAccrual;

    private Accrual[] accruals;

    public ListInterestAccrualsResponse() {
    }

    public ListInterestAccrualsResponse(Builder builder) {
        this.totalNotionalAccrual = builder.totalNotionalAccrual;
        this.accruals = builder.accruals;
    }

    public String getTotalNotionalAccrual() {
        return totalNotionalAccrual;
    }

    public void setTotalNotionalAccrual(String totalNotionalAccrual) {
        this.totalNotionalAccrual = totalNotionalAccrual;
    }

    public Accrual[] getAccruals() {
        return accruals;
    }

    public void setAccruals(Accrual[] accruals) {
        this.accruals = accruals;
    }

    public static class Builder {
        private String totalNotionalAccrual;
        private Accrual[] accruals;

        public Builder() {
        }

        public Builder totalNotionalAccrual(String totalNotionalAccrual) {
            this.totalNotionalAccrual = totalNotionalAccrual;
            return this;
        }

        public Builder accruals(Accrual[] accruals) {
            this.accruals = accruals;
            return this;
        }

        public ListInterestAccrualsResponse build() {
            return new ListInterestAccrualsResponse(this);
        }
    }
}
