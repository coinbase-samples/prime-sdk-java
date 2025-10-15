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

import com.fasterxml.jackson.annotation.JsonProperty;

public class OrderEditHistoryItem {
    @JsonProperty("price")
    private String price;

    @JsonProperty("base_quantity")
    private String baseQuantity;

    @JsonProperty("quote_value")
    private String quoteValue;

    @JsonProperty("display_base_size")
    private String displayBaseSize;

    @JsonProperty("display_quote_size")
    private String displayQuoteSize;

    @JsonProperty("stop_price")
    private String stopPrice;

    @JsonProperty("expiry_time")
    private String expiryTime;

    @JsonProperty("accept_time")
    private String acceptTime;

    @JsonProperty("client_order_id")
    private String clientOrderId;

    public OrderEditHistoryItem() {
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
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

    public String getDisplayBaseSize() {
        return displayBaseSize;
    }

    public void setDisplayBaseSize(String displayBaseSize) {
        this.displayBaseSize = displayBaseSize;
    }

    public String getDisplayQuoteSize() {
        return displayQuoteSize;
    }

    public void setDisplayQuoteSize(String displayQuoteSize) {
        this.displayQuoteSize = displayQuoteSize;
    }

    public String getStopPrice() {
        return stopPrice;
    }

    public void setStopPrice(String stopPrice) {
        this.stopPrice = stopPrice;
    }

    public String getExpiryTime() {
        return expiryTime;
    }

    public void setExpiryTime(String expiryTime) {
        this.expiryTime = expiryTime;
    }

    public String getAcceptTime() {
        return acceptTime;
    }

    public void setAcceptTime(String acceptTime) {
        this.acceptTime = acceptTime;
    }

    public String getClientOrderId() {
        return clientOrderId;
    }

    public void setClientOrderId(String clientOrderId) {
        this.clientOrderId = clientOrderId;
    }
}
