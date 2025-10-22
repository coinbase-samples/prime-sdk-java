// Copyright 2025-present Coinbase Global, Inc.
//
//  Licensed under the Apache License, Version 2.0 (the "License");
//  you may not use this file except in compliance with the License.
//  You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
//  Unless required by applicable law or agreed to in writing, software
//  distributed under the License is distributed on an "AS IS" BASIS,
//  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//  See the License for the specific language governing permissions and
//  limitations under the License.
package com.coinbase.prime.model;

import java.time.OffsetDateTime;

public class Candle {
    /**
     * Timestamp for the start of the candle period
     */
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

    public String getOpen() {
        return open;
    }

    public String getHigh() {
        return high;
    }

    public String getLow() {
        return low;
    }

    public String getClose() {
        return close;
    }

    public String getVolume() {
        return volume;
    }

    public void setTimestamp(OffsetDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public void setOpen(String open) {
        this.open = open;
    }

    public void setHigh(String high) {
        this.high = high;
    }

    public void setLow(String low) {
        this.low = low;
    }

    public void setClose(String close) {
        this.close = close;
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
