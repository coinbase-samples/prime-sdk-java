/*
 * *
 *  * Copyright 2024-present Coinbase Global, Inc.
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  * you may not use this file except in compliance with the License.
 *  * You may obtain a copy of the License at
 *  *
 *  *  http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  * See the License for the specific language governing permissions and
 *  * limitations under the License.
 *
 */

package com.coinbase.prime.model.transactions;

public class TransferLocation {
    private TransferLocationType type;
    private String value;

    public TransferLocation() {
    }

    public TransferLocation(TransferLocationType type, String value) {
        this.type = type;
        this.value = value;
    }

    public TransferLocation(Builder builder) {
        this.type = builder.type;
        this.value = builder.value;
    }

    public TransferLocationType getType() {
        return type;
    }

    public void setType(TransferLocationType type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public static class Builder {
        private TransferLocationType type;
        private String value;

        public Builder() {
        }

        public Builder type(TransferLocationType type) {
            this.type = type;
            return this;
        }

        public Builder value(String value) {
            this.value = value;
            return this;
        }

        public TransferLocation build() {
            return new TransferLocation(this);
        }
    }
}
