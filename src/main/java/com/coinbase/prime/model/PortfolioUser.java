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

import com.coinbase.prime.model.enums.UserRole;

public class PortfolioUser {
    private String id;

    private String name;

    private String email;

    private String portfolioId;

    private String entityId;

    private UserRole role;

    public PortfolioUser() {
    }

    public PortfolioUser(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.email = builder.email;
        this.portfolioId = builder.portfolioId;
        this.entityId = builder.entityId;
        this.role = builder.role;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPortfolioId() {
        return portfolioId;
    }

    public String getEntityId() {
        return entityId;
    }

    public UserRole getRole() {
        return role;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPortfolioId(String portfolioId) {
        this.portfolioId = portfolioId;
    }

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }

    public static class Builder {
        private String id;

        private String name;

        private String email;

        private String portfolioId;

        private String entityId;

        private UserRole role;

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder portfolioId(String portfolioId) {
            this.portfolioId = portfolioId;
            return this;
        }

        public Builder entityId(String entityId) {
            this.entityId = entityId;
            return this;
        }

        public Builder role(UserRole role) {
            this.role = role;
            return this;
        }

        public PortfolioUser build() {
            return new PortfolioUser(this);
        }
    }
}
