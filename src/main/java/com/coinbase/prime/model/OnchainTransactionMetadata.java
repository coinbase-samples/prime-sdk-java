package com.coinbase.prime.model;

import com.coinbase.prime.model.AssetChange;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OnchainTransactionMetadata {
    /**
     * The transaction type label of the confirmed transaction post settlement
     */
    private String label;

    /**
     * The confirmed asset changes (onchain)
     */
    private List<AssetChange> confirmedAssetChanges;

    public OnchainTransactionMetadata() {
    }

    public OnchainTransactionMetadata(Builder builder) {
        this.label = builder.label;
        this.confirmedAssetChanges = builder.confirmedAssetChanges;
    }
    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
    public List<AssetChange> getConfirmedAssetChanges() {
        return confirmedAssetChanges;
    }

    public void setConfirmedAssetChanges(List<AssetChange> confirmedAssetChanges) {
        this.confirmedAssetChanges = confirmedAssetChanges;
    }
    public static class Builder {
        private String label;

        private List<AssetChange> confirmedAssetChanges;

        public Builder label(String label) {
            this.label = label;
            return this;
        }

        public Builder confirmedAssetChanges(List<AssetChange> confirmedAssetChanges) {
            this.confirmedAssetChanges = confirmedAssetChanges;
            return this;
        }

        public OnchainTransactionMetadata build() {
            return new OnchainTransactionMetadata(this);
        }
    }
}

