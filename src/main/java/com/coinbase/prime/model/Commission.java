package com.coinbase.prime.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;

public class Commission {
    /**
     * Fee model (all_in or cost_plus)
     */
    private String type;

    /**
     * Commission rate (in whole percentage. Commission of 15bps is \&quot;0.0015\&quot;)
     */
    private String rate;

    /**
     * Average 30 days over past 3 months (e.g. 90 days divided by 3)
     */
    private String tradingVolume;

    public Commission() {
    }

    public Commission(Builder builder) {
        this.type = builder.type;
        this.rate = builder.rate;
        this.tradingVolume = builder.tradingVolume;
    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }
    public String getTradingVolume() {
        return tradingVolume;
    }

    public void setTradingVolume(String tradingVolume) {
        this.tradingVolume = tradingVolume;
    }
    public static class Builder {
        private String type;

        private String rate;

        private String tradingVolume;

        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public Builder rate(String rate) {
            this.rate = rate;
            return this;
        }

        public Builder tradingVolume(String tradingVolume) {
            this.tradingVolume = tradingVolume;
            return this;
        }

        public Commission build() {
            return new Commission(this);
        }
    }
}

