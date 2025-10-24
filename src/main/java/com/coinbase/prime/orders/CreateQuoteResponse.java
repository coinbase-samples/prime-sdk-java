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

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response object for creating a quote request.
 * 
 * A Quote Request is the start of the RFQ process. Coinbase Prime sends a Quote Request to
 * Liquidity Providers (LPs) on behalf of a customer looking to participate in an RFQ trade.
 */
public class CreateQuoteResponse {
  /** Unique identifier for the quote */
  @JsonProperty("quote_id")
  private String quoteId;

  /** Time when the quote expires */
  @JsonProperty("expiration_time")
  private String expirationTime;

  /** Best available price for the quote */
  @JsonProperty("best_price")
  private String bestPrice;

  /** Total quote amount for previewing */
  @JsonProperty("order_total")
  private String orderTotal;

  /** Price inclusive of all fees */
  @JsonProperty("price_inclusive_of_fees")
  private String priceInclusiveOfFees;

  public CreateQuoteResponse() {
  }

  public String getQuoteId() {
    return quoteId;
  }

  public void setQuoteId(String quoteId) {
    this.quoteId = quoteId;
  }

  public String getExpirationTime() {
    return expirationTime;
  }

  public void setExpirationTime(String expirationTime) {
    this.expirationTime = expirationTime;
  }

  public String getBestPrice() {
    return bestPrice;
  }

  public void setBestPrice(String bestPrice) {
    this.bestPrice = bestPrice;
  }

  public String getOrderTotal() {
    return orderTotal;
  }

  public void setOrderTotal(String orderTotal) {
    this.orderTotal = orderTotal;
  }

  public String getPriceInclusiveOfFees() {
    return priceInclusiveOfFees;
  }

  public void setPriceInclusiveOfFees(String priceInclusiveOfFees) {
    this.priceInclusiveOfFees = priceInclusiveOfFees;
  }
}
