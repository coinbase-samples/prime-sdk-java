package com.coinbase.prime.model;

import com.coinbase.prime.model.enums.ActivityCategory;
import com.coinbase.prime.model.ActivityMetadataAccount;
import com.coinbase.prime.model.ActivityMetadataTransactions;
import com.coinbase.prime.model.enums.ActivitySecondaryType;
import com.coinbase.prime.model.enums.ActivityStatus;
import com.coinbase.prime.model.ActivityType;
import com.coinbase.prime.model.enums.HierarchyType;
import com.coinbase.prime.model.UserAction;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Activity {
    /**
     * A unique id for the account activity
     */
    private String id;

    /**
     * A reference for orders and transactions, n/a for other category types
     */
    private String referenceId;

    private ActivityCategory category;

    private ActivityType type;

    private ActivitySecondaryType secondaryType;

    private ActivityStatus status;

    /**
     * Id of user who created the activity
     */
    private String createdBy;

    /**
     * Title of the activity
     */
    private String title;

    /**
     * Description detail of the activity
     */
    private String description;

    /**
     * Actions related to the Activity
     */
    private List<UserAction> userActions;

    private ActivityMetadataTransactions transactionsMetadata;

    private ActivityMetadataAccount accountMetadata;

    private Object ordersMetadata;

    /**
     * List of currencies included in an activity
     */
    private List<String> symbols;

    /**
     * Time activity was created at
     */
    private String createdAt;

    /**
     * Time for latest status update of account activity
     */
    private String updatedAt;

    private HierarchyType hierarchyType;

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
        this.hierarchyType = builder.hierarchyType;
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
    public List<UserAction> getUserActions() {
        return userActions;
    }

    public void setUserActions(List<UserAction> userActions) {
        this.userActions = userActions;
    }
    public ActivityMetadataTransactions getTransactionsMetadata() {
        return transactionsMetadata;
    }

    public void setTransactionsMetadata(ActivityMetadataTransactions transactionsMetadata) {
        this.transactionsMetadata = transactionsMetadata;
    }
    public ActivityMetadataAccount getAccountMetadata() {
        return accountMetadata;
    }

    public void setAccountMetadata(ActivityMetadataAccount accountMetadata) {
        this.accountMetadata = accountMetadata;
    }
    public Object getOrdersMetadata() {
        return ordersMetadata;
    }

    public void setOrdersMetadata(Object ordersMetadata) {
        this.ordersMetadata = ordersMetadata;
    }
    public List<String> getSymbols() {
        return symbols;
    }

    public void setSymbols(List<String> symbols) {
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
    public HierarchyType getHierarchyType() {
        return hierarchyType;
    }

    public void setHierarchyType(HierarchyType hierarchyType) {
        this.hierarchyType = hierarchyType;
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

        private List<UserAction> userActions;

        private ActivityMetadataTransactions transactionsMetadata;

        private ActivityMetadataAccount accountMetadata;

        private Object ordersMetadata;

        private List<String> symbols;

        private String createdAt;

        private String updatedAt;

        private HierarchyType hierarchyType;

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

        public Builder userActions(List<UserAction> userActions) {
            this.userActions = userActions;
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

        public Builder symbols(List<String> symbols) {
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

        public Builder hierarchyType(HierarchyType hierarchyType) {
            this.hierarchyType = hierarchyType;
            return this;
        }

        public Activity build() {
            return new Activity(this);
        }
    }
}

