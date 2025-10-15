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

public class Activity {
    private String id;

    private String referenceId;

    private String createdBy;

    private String title;

    private String description;

    private ActivityMetadataTransactions transactionsMetadata;

    private ActivityMetadataAccount accountMetadata;

    private Object ordersMetadata;

    private String createdAt;

    private String updatedAt;

    public Activity() {
    }

    public Activity(Builder builder) {
        this.id = builder.id;
        this.referenceId = builder.referenceId;
        this.createdBy = builder.createdBy;
        this.title = builder.title;
        this.description = builder.description;
        this.transactionsMetadata = builder.transactionsMetadata;
        this.accountMetadata = builder.accountMetadata;
        this.ordersMetadata = builder.ordersMetadata;
        this.createdAt = builder.createdAt;
        this.updatedAt = builder.updatedAt;
    }

    public String getId() {
        return id;
    }

    public String getReferenceId() {
        return referenceId;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public ActivityMetadataTransactions getTransactionsMetadata() {
        return transactionsMetadata;
    }

    public ActivityMetadataAccount getAccountMetadata() {
        return accountMetadata;
    }

    public Object getOrdersMetadata() {
        return ordersMetadata;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTransactionsMetadata(ActivityMetadataTransactions transactionsMetadata) {
        this.transactionsMetadata = transactionsMetadata;
    }

    public void setAccountMetadata(ActivityMetadataAccount accountMetadata) {
        this.accountMetadata = accountMetadata;
    }

    public void setOrdersMetadata(Object ordersMetadata) {
        this.ordersMetadata = ordersMetadata;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public static class Builder {
        private String id;

        private String referenceId;

        private String createdBy;

        private String title;

        private String description;

        private ActivityMetadataTransactions transactionsMetadata;

        private ActivityMetadataAccount accountMetadata;

        private Object ordersMetadata;

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

        public Builder transactionsMetadata(ActivityMetadataTransactions transactionsMetadata) {
            this.transactionsMetadata = transactionsMetadata;
            return this;
        }

        public Builder accountMetadata(ActivityMetadataAccount accountMetadata) {
            this.accountMetadata = accountMetadata;
            return this;
        }

        public Builder ordersMetadata(Object ordersMetadata) {
            this.ordersMetadata = ordersMetadata;
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
