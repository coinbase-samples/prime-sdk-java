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

import com.coinbase.prime.model.enums.MarginAddOnType;
import com.fasterxml.jackson.annotation.JsonProperty;

public class MarginAddOn {
    private String amount;

    @JsonProperty("add_on_type")
    private MarginAddOnType addOnType;

    public MarginAddOn() {}

    public MarginAddOn(Builder builder) {
        this.amount = builder.amount;
        this.addOnType = builder.addOnType;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public MarginAddOnType getAddOnType() {
        return addOnType;
    }

    public void setAddOnType(MarginAddOnType addOnType) {
        this.addOnType = addOnType;
    }

    public static class Builder {
        private String amount;
        private MarginAddOnType addOnType;

        public Builder() {}

        public Builder withAmount(String amount) {
            this.amount = amount;
            return this;
        }

        public Builder withAddOnType(MarginAddOnType addOnType) {
            this.addOnType = addOnType;
            return this;
        }

        public MarginAddOn build() {
            return new MarginAddOn(this);
        }
    }
}
