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

public class MatchMetadata {
    @JsonProperty("reference_id")
    private String referenceId;
    @JsonProperty("settlement_date")
    private String settlementDate;

    public MatchMetadata() {
    }

    public MatchMetadata(String referenceId, String settlementDate) {
        this.referenceId = referenceId;
        this.settlementDate = settlementDate;
    }

    public MatchMetadata(Builder builder) {
        this.referenceId = builder.referenceId;
        this.settlementDate = builder.settlementDate;
    }

    public String getReferenceId() {
        return referenceId;
    }

    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }

    public String getSettlementDate() {
        return settlementDate;
    }

    public void setSettlementDate(String settlementDate) {
        this.settlementDate = settlementDate;
    }

    public static class Builder {
        private String referenceId;
        private String settlementDate;

        public Builder() {
        }

        public Builder referenceId(String referenceId) {
            this.referenceId = referenceId;
            return this;
        }

        public Builder settlementDate(String settlementDate) {
            this.settlementDate = settlementDate;
            return this;
        }

        public MatchMetadata build() {
            return new MatchMetadata(this);
        }
    }
}
