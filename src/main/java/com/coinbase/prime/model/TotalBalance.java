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

public class TotalBalance {
    private String total;
    private String holds;

    public TotalBalance() {
    }

    public TotalBalance(Builder builder) {
        this.total = builder.total;
        this.holds = builder.holds;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getHolds() {
        return holds;
    }

    public void setHolds(String holds) {
        this.holds = holds;
    }

    public static class Builder {
        private String total;
        private String holds;

        public Builder() {
        }

        public Builder total(String total) {
            this.total = total;
            return this;
        }

        public Builder holds(String holds) {
            this.holds = holds;
            return this;
        }

        public TotalBalance build() {
            return new TotalBalance(this);
        }
    }
}
