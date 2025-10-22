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

public class Portfolio {
    /**
     * The unique ID of the portfolio
     */
    private String id;

    /**
     * The name of the portfolio
     */
    private String name;

    private String entityId;

    private String organizationId;

    private String entityName;

    public Portfolio() {
    }

    public Portfolio(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.entityId = builder.entityId;
        this.organizationId = builder.organizationId;
        this.entityName = builder.entityName;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEntityId() {
        return entityId;
    }

    public String getOrganizationId() {
        return organizationId;
    }

    public String getEntityName() {
        return entityName;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }

    public static class Builder {
        private String id;

        private String name;

        private String entityId;

        private String organizationId;

        private String entityName;

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder entityId(String entityId) {
            this.entityId = entityId;
            return this;
        }

        public Builder organizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }

        public Builder entityName(String entityName) {
            this.entityName = entityName;
            return this;
        }

        public Portfolio build() {
            return new Portfolio(this);
        }
    }
}
