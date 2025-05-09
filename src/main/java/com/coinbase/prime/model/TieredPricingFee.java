package com.coinbase.prime.model;

public class TieredPricingFee {
    private String symbol;

    private String fee;

    public TieredPricingFee() {}

    public TieredPricingFee(TieredPricingFee.Builder builder) {
        this.symbol = builder.symbol;
        this.fee = builder.fee;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getFee() {
        return fee;
    }

    public void setFee(String fee) {
        this.fee = fee;
    }

    public static class Builder {
        private String symbol;
        private String fee;

        public Builder() {}

        public TieredPricingFee.Builder withSymbol(String symbol) {
            this.symbol = symbol;
            return this;
        }

        public TieredPricingFee.Builder withFee(String fee) {
            this.fee = fee;
            return this;
        }

        public TieredPricingFee build() {
            return new TieredPricingFee(this);
        }
    }
}
