package com.coinbase.prime.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;

public class RFQProductDetails {
    /**
     * Whether the product is tradable via RFQ
     */
    private Boolean tradable;

    /**
     * Deprecated: Value will be an empty string
     */
    private String minNotionalSize;

    /**
     * Deprecated: Value will be an empty string
     */
    private String maxNotionalSize;

    /**
     * Minimum base size for RFQ
     */
    private String minBaseSize;

    /**
     * Maximum base size for RFQ
     */
    private String maxBaseSize;

    /**
     * Minimum quote size for RFQ
     */
    private String minQuoteSize;

    /**
     * Maximum quote size for RFQ
     */
    private String maxQuoteSize;

    public RFQProductDetails() {
    }

    public RFQProductDetails(Builder builder) {
        this.tradable = builder.tradable;
        this.minNotionalSize = builder.minNotionalSize;
        this.maxNotionalSize = builder.maxNotionalSize;
        this.minBaseSize = builder.minBaseSize;
        this.maxBaseSize = builder.maxBaseSize;
        this.minQuoteSize = builder.minQuoteSize;
        this.maxQuoteSize = builder.maxQuoteSize;
    }
    public Boolean getTradable() {
        return tradable;
    }

    public void setTradable(Boolean tradable) {
        this.tradable = tradable;
    }
    public String getMinNotionalSize() {
        return minNotionalSize;
    }

    public void setMinNotionalSize(String minNotionalSize) {
        this.minNotionalSize = minNotionalSize;
    }
    public String getMaxNotionalSize() {
        return maxNotionalSize;
    }

    public void setMaxNotionalSize(String maxNotionalSize) {
        this.maxNotionalSize = maxNotionalSize;
    }
    public String getMinBaseSize() {
        return minBaseSize;
    }

    public void setMinBaseSize(String minBaseSize) {
        this.minBaseSize = minBaseSize;
    }
    public String getMaxBaseSize() {
        return maxBaseSize;
    }

    public void setMaxBaseSize(String maxBaseSize) {
        this.maxBaseSize = maxBaseSize;
    }
    public String getMinQuoteSize() {
        return minQuoteSize;
    }

    public void setMinQuoteSize(String minQuoteSize) {
        this.minQuoteSize = minQuoteSize;
    }
    public String getMaxQuoteSize() {
        return maxQuoteSize;
    }

    public void setMaxQuoteSize(String maxQuoteSize) {
        this.maxQuoteSize = maxQuoteSize;
    }
    public static class Builder {
        private Boolean tradable;

        private String minNotionalSize;

        private String maxNotionalSize;

        private String minBaseSize;

        private String maxBaseSize;

        private String minQuoteSize;

        private String maxQuoteSize;

        public Builder tradable(Boolean tradable) {
            this.tradable = tradable;
            return this;
        }

        public Builder minNotionalSize(String minNotionalSize) {
            this.minNotionalSize = minNotionalSize;
            return this;
        }

        public Builder maxNotionalSize(String maxNotionalSize) {
            this.maxNotionalSize = maxNotionalSize;
            return this;
        }

        public Builder minBaseSize(String minBaseSize) {
            this.minBaseSize = minBaseSize;
            return this;
        }

        public Builder maxBaseSize(String maxBaseSize) {
            this.maxBaseSize = maxBaseSize;
            return this;
        }

        public Builder minQuoteSize(String minQuoteSize) {
            this.minQuoteSize = minQuoteSize;
            return this;
        }

        public Builder maxQuoteSize(String maxQuoteSize) {
            this.maxQuoteSize = maxQuoteSize;
            return this;
        }

        public RFQProductDetails build() {
            return new RFQProductDetails(this);
        }
    }
}

