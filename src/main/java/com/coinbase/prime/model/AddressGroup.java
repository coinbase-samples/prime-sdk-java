// Copyright 2025-present Coinbase Global, Inc.
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

import java.time.OffsetDateTime;

public class AddressGroup {
    private String id;

    private String name;

    private OffsetDateTime addedAt;

    public AddressGroup() {
    }

    public AddressGroup(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.addedAt = builder.addedAt;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public OffsetDateTime getAddedAt() {
        return addedAt;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddedAt(OffsetDateTime addedAt) {
        this.addedAt = addedAt;
    }

    public static class Builder {
        private String id;

        private String name;

        private OffsetDateTime addedAt;

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder addedAt(OffsetDateTime addedAt) {
            this.addedAt = addedAt;
            return this;
        }

        public AddressGroup build() {
            return new AddressGroup(this);
        }
    }
}
