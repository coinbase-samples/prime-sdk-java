package com.coinbase.prime.financing;

import com.coinbase.prime.model.BuyingPower;
import com.fasterxml.jackson.annotation.JsonProperty;

public class GetPortfolioBuyingPowerResponse {
    @JsonProperty("buying_power")
    private BuyingPower buyingPower;

    public GetPortfolioBuyingPowerResponse() {
    }

    public GetPortfolioBuyingPowerResponse(Builder builder) {
        this.buyingPower = builder.buyingPower;
    }

    public BuyingPower getBuyingPower() {
        return buyingPower;
    }

    public void setBuyingPower(BuyingPower buyingPower) {
        this.buyingPower = buyingPower;
    }

    public static class Builder {
        private BuyingPower buyingPower;

        public Builder() {
        }

        public Builder buyingPower(BuyingPower buyingPower) {
            this.buyingPower = buyingPower;
            return this;
        }

        public GetPortfolioBuyingPowerResponse build() {
            return new GetPortfolioBuyingPowerResponse(this);
        }
    }
}
