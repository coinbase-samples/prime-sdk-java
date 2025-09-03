/*
 * Copyright 2025-present Coinbase Global, Inc.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.coinbase.prime.model;

import com.coinbase.prime.model.enums.CommissionCategory;
import com.coinbase.prime.model.enums.CommissionType;
import com.coinbase.prime.model.enums.FeeModel;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Model representing a commission calculation for a specific trade or transaction.
 */
public class CommissionCalculation {
    @JsonProperty("order_id")
    private String orderId;
    
    @JsonProperty("fill_id")
    private String fillId;
    
    @JsonProperty("product_id")
    private String productId;
    
    @JsonProperty("commission_type")
    private CommissionType commissionType;
    
    @JsonProperty("commission_category")
    private CommissionCategory commissionCategory;
    
    @JsonProperty("fee_model")
    private FeeModel feeModel;
    
    @JsonProperty("base_amount")
    private String baseAmount;
    
    @JsonProperty("quote_amount")
    private String quoteAmount;
    
    @JsonProperty("commission_rate")
    private String commissionRate;
    
    @JsonProperty("commission_amount")
    private String commissionAmount;
    
    @JsonProperty("exchange_fee")
    private String exchangeFee;
    
    @JsonProperty("total_fee")
    private String totalFee;
    
    @JsonProperty("currency")
    private String currency;
    
    @JsonProperty("calculated_at")
    private String calculatedAt;

    public CommissionCalculation() {
    }

    public CommissionCalculation(Builder builder) {
        this.orderId = builder.orderId;
        this.fillId = builder.fillId;
        this.productId = builder.productId;
        this.commissionType = builder.commissionType;
        this.commissionCategory = builder.commissionCategory;
        this.feeModel = builder.feeModel;
        this.baseAmount = builder.baseAmount;
        this.quoteAmount = builder.quoteAmount;
        this.commissionRate = builder.commissionRate;
        this.commissionAmount = builder.commissionAmount;
        this.exchangeFee = builder.exchangeFee;
        this.totalFee = builder.totalFee;
        this.currency = builder.currency;
        this.calculatedAt = builder.calculatedAt;
    }

    // Getters and setters
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getFillId() {
        return fillId;
    }

    public void setFillId(String fillId) {
        this.fillId = fillId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public CommissionType getCommissionType() {
        return commissionType;
    }

    public void setCommissionType(CommissionType commissionType) {
        this.commissionType = commissionType;
    }

    public CommissionCategory getCommissionCategory() {
        return commissionCategory;
    }

    public void setCommissionCategory(CommissionCategory commissionCategory) {
        this.commissionCategory = commissionCategory;
    }

    public FeeModel getFeeModel() {
        return feeModel;
    }

    public void setFeeModel(FeeModel feeModel) {
        this.feeModel = feeModel;
    }

    public String getBaseAmount() {
        return baseAmount;
    }

    public void setBaseAmount(String baseAmount) {
        this.baseAmount = baseAmount;
    }

    public String getQuoteAmount() {
        return quoteAmount;
    }

    public void setQuoteAmount(String quoteAmount) {
        this.quoteAmount = quoteAmount;
    }

    public String getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(String commissionRate) {
        this.commissionRate = commissionRate;
    }

    public String getCommissionAmount() {
        return commissionAmount;
    }

    public void setCommissionAmount(String commissionAmount) {
        this.commissionAmount = commissionAmount;
    }

    public String getExchangeFee() {
        return exchangeFee;
    }

    public void setExchangeFee(String exchangeFee) {
        this.exchangeFee = exchangeFee;
    }

    public String getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(String totalFee) {
        this.totalFee = totalFee;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCalculatedAt() {
        return calculatedAt;
    }

    public void setCalculatedAt(String calculatedAt) {
        this.calculatedAt = calculatedAt;
    }

    public static class Builder {
        private String orderId;
        private String fillId;
        private String productId;
        private CommissionType commissionType;
        private CommissionCategory commissionCategory;
        private FeeModel feeModel;
        private String baseAmount;
        private String quoteAmount;
        private String commissionRate;
        private String commissionAmount;
        private String exchangeFee;
        private String totalFee;
        private String currency;
        private String calculatedAt;

        public Builder() {
        }

        public Builder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        public Builder fillId(String fillId) {
            this.fillId = fillId;
            return this;
        }

        public Builder productId(String productId) {
            this.productId = productId;
            return this;
        }

        public Builder commissionType(CommissionType commissionType) {
            this.commissionType = commissionType;
            return this;
        }

        public Builder commissionCategory(CommissionCategory commissionCategory) {
            this.commissionCategory = commissionCategory;
            return this;
        }

        public Builder feeModel(FeeModel feeModel) {
            this.feeModel = feeModel;
            return this;
        }

        public Builder baseAmount(String baseAmount) {
            this.baseAmount = baseAmount;
            return this;
        }

        public Builder quoteAmount(String quoteAmount) {
            this.quoteAmount = quoteAmount;
            return this;
        }

        public Builder commissionRate(String commissionRate) {
            this.commissionRate = commissionRate;
            return this;
        }

        public Builder commissionAmount(String commissionAmount) {
            this.commissionAmount = commissionAmount;
            return this;
        }

        public Builder exchangeFee(String exchangeFee) {
            this.exchangeFee = exchangeFee;
            return this;
        }

        public Builder totalFee(String totalFee) {
            this.totalFee = totalFee;
            return this;
        }

        public Builder currency(String currency) {
            this.currency = currency;
            return this;
        }

        public Builder calculatedAt(String calculatedAt) {
            this.calculatedAt = calculatedAt;
            return this;
        }

        public CommissionCalculation build() {
            return new CommissionCalculation(this);
        }
    }
}