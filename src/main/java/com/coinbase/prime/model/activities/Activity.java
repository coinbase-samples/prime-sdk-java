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

package com.coinbase.prime.model.activities;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Activity {
    private String id;
    @JsonProperty("reference_id")
    private String referenceId;
    private ActivityCategory category;
    private ActivityType type;
    @JsonProperty("secondary_type")
    private ActivitySecondaryType secondaryType;
    private ActivityStatus status;
    @JsonProperty("created_by")
    private String createdBy;
    private String title;
    private String description;
    @JsonProperty("user_actions")
    private UserAction[] userActions;
    @JsonProperty("transactions_metadata")
    private TransactionsMetadata transactionsMetadata;
    @JsonProperty("account_metadata")
    private AccountMetadata accountMetadata;
    @JsonProperty("orders_metadata")
    private OrdersMetadata ordersMetadata;
    private String[] symbols;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("updated_at")
    private String updatedAt;

    public Activity() {
    }

    public Activity(Builder builder) {
        this.id = builder.id;
        this.referenceId = builder.referenceId;
        this.category = builder.category;
        this.type = builder.type;
        this.secondaryType = builder.secondaryType;
        this.status = builder.status;
        this.createdBy = builder.createdBy;
        this.title = builder.title;
        this.description = builder.description;
        this.userActions = builder.userActions;
        this.transactionsMetadata = builder.transactionsMetadata;
        this.accountMetadata = builder.accountMetadata;
        this.ordersMetadata = builder.ordersMetadata;
        this.symbols = builder.symbols;
        this.createdAt = builder.createdAt;
        this.updatedAt = builder.updatedAt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getReferenceId() {
        return referenceId;
    }

    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }

    public ActivityCategory getCategory() {
        return category;
    }

    public void setCategory(ActivityCategory category) {
        this.category = category;
    }

    public ActivityType getType() {
        return type;
    }

    public void setType(ActivityType type) {
        this.type = type;
    }

    public ActivitySecondaryType getSecondaryType() {
        return secondaryType;
    }

    public void setSecondaryType(ActivitySecondaryType secondaryType) {
        this.secondaryType = secondaryType;
    }

    public ActivityStatus getStatus() {
        return status;
    }

    public void setStatus(ActivityStatus status) {
        this.status = status;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UserAction[] getUserActions() {
        return userActions;
    }

    public void setUserActions(UserAction[] userActions) {
        this.userActions = userActions;
    }

    public TransactionsMetadata getTransactionsMetadata() {
        return transactionsMetadata;
    }

    public void setTransactionsMetadata(TransactionsMetadata transactionsMetadata) {
        this.transactionsMetadata = transactionsMetadata;
    }

    public AccountMetadata getAccountMetadata() {
        return accountMetadata;
    }

    public void setAccountMetadata(AccountMetadata accountMetadata) {
        this.accountMetadata = accountMetadata;
    }

    public OrdersMetadata getOrdersMetadata() {
        return ordersMetadata;
    }

    public void setOrdersMetadata(OrdersMetadata ordersMetadata) {
        this.ordersMetadata = ordersMetadata;
    }

    public String[] getSymbols() {
        return symbols;
    }

    public void setSymbols(String[] symbols) {
        this.symbols = symbols;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public static class Builder {
        private String id;
        private String referenceId;
        private ActivityCategory category;
        private ActivityType type;
        private ActivitySecondaryType secondaryType;
        private ActivityStatus status;
        private String createdBy;
        private String title;
        private String description;
        private UserAction[] userActions;
        private TransactionsMetadata transactionsMetadata;
        private AccountMetadata accountMetadata;
        private OrdersMetadata ordersMetadata;
        private String[] symbols;
        private String createdAt;
        private String updatedAt;

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder referenceId(String referenceId) {
            this.referenceId = referenceId;
            return this;
        }

        public Builder category(ActivityCategory category) {
            this.category = category;
            return this;
        }

        public Builder type(ActivityType type) {
            this.type = type;
            return this;
        }

        public Builder secondaryType(ActivitySecondaryType secondaryType) {
            this.secondaryType = secondaryType;
            return this;
        }

        public Builder status(ActivityStatus status) {
            this.status = status;
            return this;
        }

        public Builder createdBy(String createdBy) {
            this.createdBy = createdBy;
            return this;
        }

        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public Builder userActions(UserAction[] userActions) {
            this.userActions = userActions;
            return this;
        }

        public Builder transactionsMetadata(TransactionsMetadata transactionsMetadata) {
            this.transactionsMetadata = transactionsMetadata;
            return this;
        }

        public Builder accountMetadata(AccountMetadata accountMetadata) {
            this.accountMetadata = accountMetadata;
            return this;
        }

        public Builder ordersMetadata(OrdersMetadata ordersMetadata) {
            this.ordersMetadata = ordersMetadata;
            return this;
        }

        public Builder symbols(String[] symbols) {
            this.symbols = symbols;
            return this;
        }

        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Builder updatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public Activity build() {
            return new Activity(this);
        }
    }
}
