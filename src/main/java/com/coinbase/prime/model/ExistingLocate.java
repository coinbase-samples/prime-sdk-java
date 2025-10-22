package com.coinbase.prime.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;

public class ExistingLocate {
    /**
     * The locate ID
     */
    private String locateId;

    /**
     * The unique ID of the entity
     */
    private String entityId;

    /**
     * The unique ID of the portfolio
     */
    private String portfolioId;

    /**
     * The currency symbol
     */
    private String symbol;

    /**
     * The requested locate amount
     */
    private String requestedAmount;

    /**
     * The interest rate of PM loan
     */
    private String interestRate;

    /**
     * The locate status
     */
    private String status;

    /**
     * The approved locate amount
     */
    private String approvedAmount;

    /**
     * Deprecated: Use locate_date instead
     */
    private String conversionDate;

    /**
     * The date when the locate was submitted in RFC3339 format
     */
    private String createdAt;

    /**
     * The locate date from the CreateNewLocatesRequest in RFC3339 format
     */
    private String locateDate;

    public ExistingLocate() {
    }

    public ExistingLocate(Builder builder) {
        this.locateId = builder.locateId;
        this.entityId = builder.entityId;
        this.portfolioId = builder.portfolioId;
        this.symbol = builder.symbol;
        this.requestedAmount = builder.requestedAmount;
        this.interestRate = builder.interestRate;
        this.status = builder.status;
        this.approvedAmount = builder.approvedAmount;
        this.conversionDate = builder.conversionDate;
        this.createdAt = builder.createdAt;
        this.locateDate = builder.locateDate;
    }
    public String getLocateId() {
        return locateId;
    }

    public void setLocateId(String locateId) {
        this.locateId = locateId;
    }
    public String getEntityId() {
        return entityId;
    }

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }
    public String getPortfolioId() {
        return portfolioId;
    }

    public void setPortfolioId(String portfolioId) {
        this.portfolioId = portfolioId;
    }
    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }
    public String getRequestedAmount() {
        return requestedAmount;
    }

    public void setRequestedAmount(String requestedAmount) {
        this.requestedAmount = requestedAmount;
    }
    public String getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(String interestRate) {
        this.interestRate = interestRate;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public String getApprovedAmount() {
        return approvedAmount;
    }

    public void setApprovedAmount(String approvedAmount) {
        this.approvedAmount = approvedAmount;
    }
    public String getConversionDate() {
        return conversionDate;
    }

    public void setConversionDate(String conversionDate) {
        this.conversionDate = conversionDate;
    }
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }
    public String getLocateDate() {
        return locateDate;
    }

    public void setLocateDate(String locateDate) {
        this.locateDate = locateDate;
    }
    public static class Builder {
        private String locateId;

        private String entityId;

        private String portfolioId;

        private String symbol;

        private String requestedAmount;

        private String interestRate;

        private String status;

        private String approvedAmount;

        private String conversionDate;

        private String createdAt;

        private String locateDate;

        public Builder locateId(String locateId) {
            this.locateId = locateId;
            return this;
        }

        public Builder entityId(String entityId) {
            this.entityId = entityId;
            return this;
        }

        public Builder portfolioId(String portfolioId) {
            this.portfolioId = portfolioId;
            return this;
        }

        public Builder symbol(String symbol) {
            this.symbol = symbol;
            return this;
        }

        public Builder requestedAmount(String requestedAmount) {
            this.requestedAmount = requestedAmount;
            return this;
        }

        public Builder interestRate(String interestRate) {
            this.interestRate = interestRate;
            return this;
        }

        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public Builder approvedAmount(String approvedAmount) {
            this.approvedAmount = approvedAmount;
            return this;
        }

        public Builder conversionDate(String conversionDate) {
            this.conversionDate = conversionDate;
            return this;
        }

        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Builder locateDate(String locateDate) {
            this.locateDate = locateDate;
            return this;
        }

        public ExistingLocate build() {
            return new ExistingLocate(this);
        }
    }
}

