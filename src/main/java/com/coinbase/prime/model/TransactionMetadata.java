// Copyright 2024-present Coinbase Global, Inc.
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

public class TransactionMetadata {
    private MatchMetadata matchMetadata;

    private OnchainTransactionMetadata onchainTransactionMetadata;

    public TransactionMetadata() {
    }

    public TransactionMetadata(Builder builder) {
        this.matchMetadata = builder.matchMetadata;
        this.onchainTransactionMetadata = builder.onchainTransactionMetadata;
    }

    public MatchMetadata getMatchMetadata() {
        return matchMetadata;
    }

    public OnchainTransactionMetadata getOnchainTransactionMetadata() {
        return onchainTransactionMetadata;
    }

    public void setMatchMetadata(MatchMetadata matchMetadata) {
        this.matchMetadata = matchMetadata;
    }

    public void setOnchainTransactionMetadata(
            OnchainTransactionMetadata onchainTransactionMetadata) {
        this.onchainTransactionMetadata = onchainTransactionMetadata;
    }

    public static class Builder {
        private MatchMetadata matchMetadata;

        private OnchainTransactionMetadata onchainTransactionMetadata;

        public Builder matchMetadata(MatchMetadata matchMetadata) {
            this.matchMetadata = matchMetadata;
            return this;
        }

        public Builder onchainTransactionMetadata(
                OnchainTransactionMetadata onchainTransactionMetadata) {
            this.onchainTransactionMetadata = onchainTransactionMetadata;
            return this;
        }

        public TransactionMetadata build() {
            return new TransactionMetadata(this);
        }
    }
}
