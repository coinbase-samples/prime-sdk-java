package com.coinbase.prime.financing;

import com.coinbase.prime.model.TieredPricingFee;

public class GetTradeFinanceTieredPricingFeesResponse {
    private TieredPricingFee[] fees;

    public GetTradeFinanceTieredPricingFeesResponse() {
    }

    public GetTradeFinanceTieredPricingFeesResponse(Builder builder) {
        this.fees = builder.fees;
    }

    public TieredPricingFee[] getFees() {
        return fees;
    }

    public void setFees(TieredPricingFee[] fees) {
        this.fees = fees;
    }

    public static class Builder {
        private TieredPricingFee[] fees;

        public Builder() {
        }

        public Builder fees(TieredPricingFee[] fees) {
            this.fees = fees;
            return this;
        }

        public GetTradeFinanceTieredPricingFeesResponse build() {
            return new GetTradeFinanceTieredPricingFeesResponse(this);
        }
    }
}
