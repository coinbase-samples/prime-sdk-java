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

public class AssetChange {
    private AssetChangeType type;
    private String symbol;
    private String amount;
    private NftCollection collection;
    private NftItem item;

    public AssetChange() {
    }

    public AssetChange(Builder builder) {
        this.type = builder.type;
        this.symbol = builder.symbol;
        this.amount = builder.amount;
        this.collection = builder.collection;
        this.item = builder.item;
    }

    public AssetChangeType getType() {
        return type;
    }

    public void setType(AssetChangeType type) {
        this.type = type;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public NftCollection getCollection() {
        return collection;
    }

    public void setCollection(NftCollection collection) {
        this.collection = collection;
    }

    public NftItem getItem() {
        return item;
    }

    public void setItem(NftItem item) {
        this.item = item;
    }

    public static class Builder {
        private AssetChangeType type;
        private String symbol;
        private String amount;
        private NftCollection collection;
        private NftItem item;

        public Builder() {
        }

        public Builder type(AssetChangeType type) {
            this.type = type;
            return this;
        }

        public Builder symbol(String symbol) {
            this.symbol = symbol;
            return this;
        }

        public Builder amount(String amount) {
            this.amount = amount;
            return this;
        }

        public Builder collection(NftCollection collection) {
            this.collection = collection;
            return this;
        }

        public Builder item(NftItem item) {
            this.item = item;
            return this;
        }

        public AssetChange build() {
            return new AssetChange(this);
        }
    }
}
