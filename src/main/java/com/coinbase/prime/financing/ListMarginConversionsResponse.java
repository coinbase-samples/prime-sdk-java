package com.coinbase.prime.financing;

import com.coinbase.prime.model.Conversion;

public class ListMarginConversionsResponse {
    private Conversion[] conversions;

    public ListMarginConversionsResponse() {
    }

    public ListMarginConversionsResponse(Builder builder) {
        this.conversions = builder.conversions;
    }

    public Conversion[] getConversions() {
        return conversions;
    }

    public void setConversions(Conversion[] conversions) {
        this.conversions = conversions;
    }

    public static class Builder {
        private Conversion[] conversions;

        public Builder() {
        }

        public Builder conversions(Conversion[] conversions) {
            this.conversions = conversions;
            return this;
        }

        public ListMarginConversionsResponse build() {
            return new ListMarginConversionsResponse(this);
        }
    }
}
