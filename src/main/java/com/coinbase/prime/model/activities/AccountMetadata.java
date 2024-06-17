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

package com.coinbase.prime.model.activities;

public class AccountMetadata {
    private Consensus consensus;

    public AccountMetadata() {
    }

    public AccountMetadata(Builder builder) {
        this.consensus = builder.consensus;
    }

    public Consensus getConsensus() {
        return consensus;
    }

    public void setConsensus(Consensus consensus) {
        this.consensus = consensus;
    }

    public static class Builder {
        private Consensus consensus;

        public Builder consensus(Consensus consensus) {
            this.consensus = consensus;
            return this;
        }

        public AccountMetadata build() {
            return new AccountMetadata(this);
        }
    }
}
