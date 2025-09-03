/*
 * Copyright 2024-present Coinbase Global, Inc.
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
import com.coinbase.prime.model.enums.OrderSide;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import static com.coinbase.core.utils.Utils.isNullOrEmpty;

public class CreateQuoteRequest {
  @JsonProperty(required = true, value = "portfolio_id")
  @JsonIgnore
  private String portfolioId;
  @JsonProperty(required = true, value = "product_id")
  private String productId;
  @JsonProperty(required = true, value = "side")
  private OrderSide side;
  @JsonProperty(required = true, value = "client_quote_id")
  private String clientQuoteId;
  @JsonProperty("base_quantity")
  private String baseQuantity;
  @JsonProperty("quote_value")
  private String quoteValue;
  @JsonProperty(required = true, value = "limit_price")
  private String limitPrice;

  public CreateQuoteRequest() {
  }

  public CreateQuoteRequest(Builder builder) {
    this.portfolioId = builder.portfolioId;
    this.productId = builder.productId;
    this.side = builder.side;
    this.clientQuoteId = builder.clientQuoteId;
    this.baseQuantity = builder.baseQuantity;
    this.quoteValue = builder.quoteValue;
    this.limitPrice = builder.limitPrice;
  }

  public String getPortfolioId() {
    return portfolioId;
  }

  public void setPortfolioId(String portfolioId) {
    this.portfolioId = portfolioId;
  }

  public String getProductId() {
    return productId;
  }

  public void setProductId(String productId) {
    this.productId = productId;
  }

  public OrderSide getSide() {
    return side;
  }

  public void setSide(OrderSide side) {
    this.side = side;
  }

  public String getClientQuoteId() {
    return clientQuoteId;
  }

  public void setClientQuoteId(String clientQuoteId) {
    this.clientQuoteId = clientQuoteId;
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

  public static class Builder {
    private String portfolioId;
    private String productId;
    private OrderSide side;
    private String clientQuoteId;
    private String baseQuantity;
    private String quoteValue;
    private String limitPrice;

    public Builder() {
    }

    public Builder portfolioId(String portfolioId) {
      this.portfolioId = portfolioId;
      return this;
    }

    public Builder productId(String productId) {
      this.productId = productId;
      return this;
    }

    public Builder side(OrderSide side) {
      this.side = side;
      return this;
    }

    public Builder clientQuoteId(String clientQuoteId) {
      this.clientQuoteId = clientQuoteId;
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

    public CreateQuoteRequest build() throws CoinbaseClientException {
      this.validate();
      return new CreateQuoteRequest(this);
    }

    private void validate() throws CoinbaseClientException {
      if (isNullOrEmpty(this.portfolioId)) {
        throw new CoinbaseClientException("PortfolioId is required");
      }
      if (isNullOrEmpty(this.productId)) {
        throw new CoinbaseClientException("ProductId is required");
      }
      if (this.side == null) {
        throw new CoinbaseClientException("Side is required");
      }
      if (isNullOrEmpty(this.clientQuoteId)) {
        throw new CoinbaseClientException("ClientQuoteId is required");
      }
      if (isNullOrEmpty(this.limitPrice)) {
        throw new CoinbaseClientException("LimitPrice is required");
      }
      if (isNullOrEmpty(this.baseQuantity) && isNullOrEmpty(this.quoteValue)) {
        throw new CoinbaseClientException("BaseQuantity or QuoteValue is required");
      }
    }
  }
}
