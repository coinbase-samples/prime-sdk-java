package com.coinbase.prime.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.Arrays;

public class Candle {
    private OffsetDateTime timestamp;

    /**
     * Opening price for the period
     */
    private String open;

    /**
     * Highest price during the period
     */
    private String high;

    /**
     * Lowest price during the period
     */
    private String low;

    /**
     * Closing price for the period
     */
    private String close;

    /**
     * Volume traded during the period
     */
    private String volume;

    public Candle() {
    }

    public Candle(Builder builder) {
        this.timestamp = builder.timestamp;
        this.open = builder.open;
        this.high = builder.high;
        this.low = builder.low;
        this.close = builder.close;
        this.volume = builder.volume;
    }
    public OffsetDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(OffsetDateTime timestamp) {
        this.timestamp = timestamp;
    }
    public String getOpen() {
        return open;
    }

    public void setOpen(String open) {
        this.open = open;
    }
    public String getHigh() {
        return high;
    }

    public void setHigh(String high) {
        this.high = high;
    }
    public String getLow() {
        return low;
    }

    public void setLow(String low) {
        this.low = low;
    }
    public String getClose() {
        return close;
    }

    public void setClose(String close) {
        this.close = close;
    }
    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }
    public static class Builder {
        private OffsetDateTime timestamp;

        private String open;

        private String high;

        private String low;

        private String close;

        private String volume;

        public Builder timestamp(OffsetDateTime timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public Builder open(String open) {
            this.open = open;
            return this;
        }

        public Builder high(String high) {
            this.high = high;
            return this;
        }

        public Builder low(String low) {
            this.low = low;
            return this;
        }

        public Builder close(String close) {
            this.close = close;
            return this;
        }

        public Builder volume(String volume) {
            this.volume = volume;
            return this;
        }

        public Candle build() {
            return new Candle(this);
        }
    }
}

