/**
 * Copyright 2024-present Coinbase Global, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.coinbase.prime.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * NFT Item model representing individual NFT item information.
 */
public class NftItem {
    
    /**
     * NFT item name
     */
    @JsonProperty("name")
    private String name;

    public NftItem() {}

    private NftItem(Builder builder) {
        this.name = builder.name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "NftItem{" +
                "name='" + name + '\'' +
                '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String name;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public NftItem build() {
            return new NftItem(this);
        }
    }
}