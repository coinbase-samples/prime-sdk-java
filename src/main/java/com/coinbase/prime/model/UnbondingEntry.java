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
import com.coinbase.prime.model.enums.UnbondingStatus;
import java.time.Instant;

public class UnbondingEntry {
    @JsonProperty("amount")
    private String amount;
    
    @JsonProperty("completion_time")
    private Instant completionTime;
    
    @JsonProperty("status")
    private UnbondingStatus status;
    
    @JsonProperty("creation_height")
    private String creationHeight;
    
    @JsonProperty("initial_balance")
    private String initialBalance;

    public UnbondingEntry() {
    }

    public UnbondingEntry(Builder builder) {
        this.amount = builder.amount;
        this.completionTime = builder.completionTime;
        this.status = builder.status;
        this.creationHeight = builder.creationHeight;
        this.initialBalance = builder.initialBalance;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public Instant getCompletionTime() {
        return completionTime;
    }

    public void setCompletionTime(Instant completionTime) {
        this.completionTime = completionTime;
    }

    public UnbondingStatus getStatus() {
        return status;
    }

    public void setStatus(UnbondingStatus status) {
        this.status = status;
    }

    public String getCreationHeight() {
        return creationHeight;
    }

    public void setCreationHeight(String creationHeight) {
        this.creationHeight = creationHeight;
    }

    public String getInitialBalance() {
        return initialBalance;
    }

    public void setInitialBalance(String initialBalance) {
        this.initialBalance = initialBalance;
    }

    public static class Builder {
        private String amount;
        private Instant completionTime;
        private UnbondingStatus status;
        private String creationHeight;
        private String initialBalance;

        public Builder() {
        }

        public Builder amount(String amount) {
            this.amount = amount;
            return this;
        }

        public Builder completionTime(Instant completionTime) {
            this.completionTime = completionTime;
            return this;
        }

        public Builder status(UnbondingStatus status) {
            this.status = status;
            return this;
        }

        public Builder creationHeight(String creationHeight) {
            this.creationHeight = creationHeight;
            return this;
        }

        public Builder initialBalance(String initialBalance) {
            this.initialBalance = initialBalance;
            return this;
        }

        public UnbondingEntry build() {
            return new UnbondingEntry(this);
        }
    }
}