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

public class TransactionMetadata {
    @JsonProperty("match_metadata")
    private MatchMetadata matchMetadata;

    public TransactionMetadata() {
    }

    public TransactionMetadata(MatchMetadata matchMetadata) {
        this.matchMetadata = matchMetadata;
    }

    public TransactionMetadata(Builder builder) {
        this.matchMetadata = builder.matchMetadata;
    }

    public MatchMetadata getMatchMetadata() {
        return matchMetadata;
    }

    public void setMatchMetadata(MatchMetadata matchMetadata) {
        this.matchMetadata = matchMetadata;
    }

    public static class Builder {
        private MatchMetadata matchMetadata;

        public Builder() {
        }

        public Builder matchMetadata(MatchMetadata matchMetadata) {
            this.matchMetadata = matchMetadata;
            return this;
        }

        public TransactionMetadata build() {
            return new TransactionMetadata(this);
        }
    }
}
