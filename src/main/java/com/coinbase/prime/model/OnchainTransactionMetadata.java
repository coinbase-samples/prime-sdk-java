/*
 * Copyright 2024-present Coinbase Global, Inc.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.coinbase.prime.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Metadata for on-chain transactions including asset changes.
 */
public class OnchainTransactionMetadata {
    /** The transaction type label of the confirmed transaction post settlement */
    private String label;
    
    /** The confirmed asset changes (onchain) */
    @JsonProperty("confirmed_asset_changes")
    private AssetChange[] confirmedAssetChanges;

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

    public AssetChange[] getConfirmedAssetChanges() {
        return confirmedAssetChanges;
    }

    public void setConfirmedAssetChanges(AssetChange[] confirmedAssetChanges) {
        this.confirmedAssetChanges = confirmedAssetChanges;
    }

    public static class Builder {
        private String label;
        private AssetChange[] confirmedAssetChanges;

        public Builder label(String label) {
            this.label = label;
            return this;
        }

        public Builder confirmedAssetChanges(AssetChange[] confirmedAssetChanges) {
            this.confirmedAssetChanges = confirmedAssetChanges;
            return this;
        }

        public OnchainTransactionMetadata build() {
            return new OnchainTransactionMetadata(this);
        }
    }
}