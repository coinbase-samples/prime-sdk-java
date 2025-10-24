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

package com.coinbase.prime.orders;

import com.coinbase.core.errors.CoinbaseClientException;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import static com.coinbase.core.utils.Utils.isNullOrEmpty;

/**
 * This feature is in beta. Please reach out to your Coinbase Prime account manager for more information.
 */
public class EditOrderRequest {
    /** The ID of the portfolio that owns the order */
    @JsonProperty(required = true, value = "portfolio_id")
    @JsonIgnore
    private String portfolioId;
    
    /** The ID of the order being edited */
    @JsonProperty(required = true, value = "order_id")
    @JsonIgnore
    private String orderId;
    
    /** Deprecated: The product ID of the order being edited */
    @JsonProperty("product_id")
    private String productId;
    
    /** The client order ID of the order being edited */
    @JsonProperty("orig_client_order_id")
    private String origClientOrderId;
    
    /** The updated version of the client order ID */
    @JsonProperty("client_order_id")
    private String clientOrderId;
    
    /** Order size in base asset units (either base_quantity or quote_value is required) */
    @JsonProperty("base_quantity")
    private String baseQuantity;
    
    /** Order size in quote asset units, i.e. the amount the user wants to spend (when buying) or receive (when selling); the quantity in base units will be determined based on the market */
    @JsonProperty("quote_value")
    private String quoteValue;
    
    /** Order limit price (buy orders are placed at or below this price; sell orders are placed at or above this price) */
    @JsonProperty("limit_price")
    private String limitPrice;
    
    /** The expiry time of the order */
    @JsonProperty("expiry_time")
    private String expiryTime;

    public EditOrderRequest() {
    }

    public EditOrderRequest(Builder builder) {
        this.portfolioId = builder.portfolioId;
        this.orderId = builder.orderId;
        this.productId = builder.productId;
        this.origClientOrderId = builder.origClientOrderId;
        this.clientOrderId = builder.clientOrderId;
        this.baseQuantity = builder.baseQuantity;
        this.quoteValue = builder.quoteValue;
        this.limitPrice = builder.limitPrice;
        this.expiryTime = builder.expiryTime;
    }

    public String getPortfolioId() {
        return portfolioId;
    }

    public void setPortfolioId(String portfolioId) {
        this.portfolioId = portfolioId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getOrigClientOrderId() {
        return origClientOrderId;
    }

    public void setOrigClientOrderId(String origClientOrderId) {
        this.origClientOrderId = origClientOrderId;
    }

    public String getClientOrderId() {
        return clientOrderId;
    }

    public void setClientOrderId(String clientOrderId) {
        this.clientOrderId = clientOrderId;
    }

    public String getBaseQuantity() {
        return baseQuantity;
    }

    public void setBaseQuantity(String baseQuantity) {
        this.baseQuantity = baseQuantity;
    }

    public String getQuoteValue() {
        return quoteValue;
    }

    public void setQuoteValue(String quoteValue) {
        this.quoteValue = quoteValue;
    }

    public String getLimitPrice() {
        return limitPrice;
    }

    public void setLimitPrice(String limitPrice) {
        this.limitPrice = limitPrice;
    }

    public String getExpiryTime() {
        return expiryTime;
    }

    public void setExpiryTime(String expiryTime) {
        this.expiryTime = expiryTime;
    }

    public static class Builder {
        private String portfolioId;
        private String orderId;
        private String productId;
        private String origClientOrderId;
        private String clientOrderId;
        private String baseQuantity;
        private String quoteValue;
        private String limitPrice;
        private String expiryTime;

        public Builder() {
        }

        public Builder portfolioId(String portfolioId) {
            this.portfolioId = portfolioId;
            return this;
        }

        public Builder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        public Builder productId(String productId) {
            this.productId = productId;
            return this;
        }

        public Builder origClientOrderId(String origClientOrderId) {
            this.origClientOrderId = origClientOrderId;
            return this;
        }

        public Builder clientOrderId(String clientOrderId) {
            this.clientOrderId = clientOrderId;
            return this;
        }

        public Builder baseQuantity(String baseQuantity) {
            this.baseQuantity = baseQuantity;
            return this;
        }

        public Builder quoteValue(String quoteValue) {
            this.quoteValue = quoteValue;
            return this;
        }

        public Builder limitPrice(String limitPrice) {
            this.limitPrice = limitPrice;
            return this;
        }

        public Builder expiryTime(String expiryTime) {
            this.expiryTime = expiryTime;
            return this;
        }

        public EditOrderRequest build() throws CoinbaseClientException {
            this.validate();
            return new EditOrderRequest(this);
        }

        private void validate() throws CoinbaseClientException {
            if (isNullOrEmpty(this.portfolioId)) {
                throw new CoinbaseClientException("PortfolioId is required");
            }
            if (isNullOrEmpty(this.orderId)) {
                throw new CoinbaseClientException("OrderId is required");
            }
            if (isNullOrEmpty(this.origClientOrderId)) {
                throw new CoinbaseClientException("OrigClientOrderId is required");
            }
            if (isNullOrEmpty(this.clientOrderId)) {
                throw new CoinbaseClientException("ClientOrderId is required");
            }
        }
    }
}
