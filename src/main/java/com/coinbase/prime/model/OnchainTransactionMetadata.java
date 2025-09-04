/*
 * Copyright 2025-present Coinbase Global, Inc.
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

import java.util.List;

public class OnchainTransactionMetadata {
    @JsonProperty("label")
    private String label;

    @JsonProperty("confirmed_asset_changes")
    private List<AssetChange> confirmedAssetChanges;

    public OnchainTransactionMetadata() {
    }

    public OnchainTransactionMetadata(String label, List<AssetChange> confirmedAssetChanges) {
        this.label = label;
        this.confirmedAssetChanges = confirmedAssetChanges;
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

        public Builder() {
        }

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