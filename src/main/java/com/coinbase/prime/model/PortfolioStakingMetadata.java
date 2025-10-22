package com.coinbase.prime.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;

public class PortfolioStakingMetadata {
    /**
     * An optional custom identifier (up to 255 characters) to attach to the transaction.  This is not a searchable transaction field.
     */
    private String externalId;

    public PortfolioStakingMetadata() {
    }

    public PortfolioStakingMetadata(Builder builder) {
        this.externalId = builder.externalId;
    }
    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }
    public static class Builder {
        private String externalId;

        public Builder externalId(String externalId) {
            this.externalId = externalId;
            return this;
        }

        public PortfolioStakingMetadata build() {
            return new PortfolioStakingMetadata(this);
        }
    }
}

