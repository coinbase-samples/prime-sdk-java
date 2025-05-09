package com.coinbase.prime.financing;

import com.coinbase.prime.model.MarginInformation;
import com.fasterxml.jackson.annotation.JsonProperty;

public class GetMarginInformationResponse {
    @JsonProperty("margin_information")
    private MarginInformation marginInformation;

    public GetMarginInformationResponse() {
    }

    public GetMarginInformationResponse(Builder builder) {
        this.marginInformation = builder.marginInformation;
    }

    public MarginInformation getMarginInformation() {
        return marginInformation;
    }

    public void setMarginInformation(MarginInformation marginInformation) {
        this.marginInformation = marginInformation;
    }

    public static class Builder {
        private MarginInformation marginInformation;

        public Builder() {
        }

        public Builder marginInformation(MarginInformation marginInformation) {
            this.marginInformation = marginInformation;
            return this;
        }

        public GetMarginInformationResponse build() {
            return new GetMarginInformationResponse(this);
        }
    }
}
