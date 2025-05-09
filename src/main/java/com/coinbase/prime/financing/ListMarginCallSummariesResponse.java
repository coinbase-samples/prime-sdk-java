package com.coinbase.prime.financing;

import com.coinbase.prime.model.MarginSummaryHistorical;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ListMarginCallSummariesResponse {
    @JsonProperty("margin_summaries")
    private MarginSummaryHistorical[] marginSummaries;

    public ListMarginCallSummariesResponse() {
    }

    public ListMarginCallSummariesResponse(Builder builder) {
        this.marginSummaries = builder.marginSummaries;
    }

    public MarginSummaryHistorical[] getMarginSummaries() {
        return marginSummaries;
    }

    public void setMarginSummaries(MarginSummaryHistorical[] marginSummaries) {
        this.marginSummaries = marginSummaries;
    }

    public static class Builder {
        private MarginSummaryHistorical[] marginSummaries;

        public Builder() {
        }

        public Builder marginSummaries(MarginSummaryHistorical[] marginSummaries) {
            this.marginSummaries = marginSummaries;
            return this;
        }

        public ListMarginCallSummariesResponse build() {
            return new ListMarginCallSummariesResponse(this);
        }
    }
}
