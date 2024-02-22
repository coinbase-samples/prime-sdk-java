/*
 * Coinbase Prime REST API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets coinbase.brokerage.proxy.common.CancelReason
 */
@JsonAdapter(CoinbaseBrokerageProxyCommonCancelReason.Adapter.class)
public enum CoinbaseBrokerageProxyCommonCancelReason {
  
  UNSPECIFIED("CANCEL_REASON_UNSPECIFIED"),
  
  FILLED_SIZE_INCLUSIVE_OF_FEES("CANCEL_REASON_FILLED_SIZE_INCLUSIVE_OF_FEES"),
  
  GTD_ORDER_EXPIRED("CANCEL_REASON_GTD_ORDER_EXPIRED"),
  
  USER_CANCEL_REQUESTED("CANCEL_REASON_USER_CANCEL_REQUESTED"),
  
  ALGO_DISCRETION("CANCEL_REASON_ALGO_DISCRETION"),
  
  PARENT_CANCELLATION("CANCEL_REASON_PARENT_CANCELLATION"),
  
  BELOW_MIN_ORDER_SIZE("CANCEL_REASON_BELOW_MIN_ORDER_SIZE"),
  
  ALGO_BY_DEFINITION("CANCEL_REASON_ALGO_BY_DEFINITION"),
  
  VENUE_DISABLED("CANCEL_REASON_VENUE_DISABLED"),
  
  VENUE_PRODUCT_DISABLED("CANCEL_REASON_VENUE_PRODUCT_DISABLED"),
  
  PASSIVE_REBALANCE_REMOVAL("CANCEL_REASON_PASSIVE_REBALANCE_REMOVAL"),
  
  PASSIVE_REBALANCE_PRICE_ADJUST("CANCEL_REASON_PASSIVE_REBALANCE_PRICE_ADJUST"),
  
  NO_TRADEABILITY("CANCEL_REASON_NO_TRADEABILITY"),
  
  PARENT_SWEEP_DUST("CANCEL_REASON_PARENT_SWEEP_DUST"),
  
  NO_LIQUIDITY_CANCEL("CANCEL_REASON_NO_LIQUIDITY_CANCEL"),
  
  VENUE_FUNDS_INSUFFICIENT("CANCEL_REASON_VENUE_FUNDS_INSUFFICIENT"),
  
  MISSING_DUST_NOTIONAL_RATE("CANCEL_REASON_MISSING_DUST_NOTIONAL_RATE"),
  
  EXCEEDED_DUST_NOTIONAL_MAX("CANCEL_REASON_EXCEEDED_DUST_NOTIONAL_MAX"),
  
  DUSTBUSTER_UNAVAILABLE("CANCEL_REASON_DUSTBUSTER_UNAVAILABLE"),
  
  MAXIMUM_MARKET_WHEELS("CANCEL_REASON_MAXIMUM_MARKET_WHEELS"),
  
  MAXIMUM_MARKET_DURATION("CANCEL_REASON_MAXIMUM_MARKET_DURATION"),
  
  DUSTBUSTER_REJECTED("CANCEL_REASON_DUSTBUSTER_REJECTED"),
  
  DISPLAY_SIZE_BELOW_MIN("CANCEL_REASON_DISPLAY_SIZE_BELOW_MIN"),
  
  MAXIMUM_ATTEMPTS("CANCEL_REASON_MAXIMUM_ATTEMPTS"),
  
  POST_ONLY_PRICE_MARKETABLE("CANCEL_REASON_POST_ONLY_PRICE_MARKETABLE"),
  
  INTERNAL_ERROR("CANCEL_REASON_INTERNAL_ERROR"),
  
  INVALID_FIELD_ON_CHILD("CANCEL_REASON_INVALID_FIELD_ON_CHILD"),
  
  ORDER_LIFETIME_EXCEEDED("CANCEL_REASON_ORDER_LIFETIME_EXCEEDED"),
  
  INSUFFICIENT_HOLD_REMAINING("CANCEL_REASON_INSUFFICIENT_HOLD_REMAINING"),
  
  VENUE_DISCONNECT_CANCEL("CANCEL_REASON_VENUE_DISCONNECT_CANCEL"),
  
  STP_CANCEL("CANCEL_REASON_STP_CANCEL"),
  
  VENUE_ADMIN_CANCEL("CANCEL_REASON_VENUE_ADMIN_CANCEL"),
  
  VENUE_COMPLETED("CANCEL_REASON_VENUE_COMPLETED"),
  
  CANCEL_REQUESTED("CANCEL_REASON_CANCEL_REQUESTED"),
  
  PRICE_PROTECTION_POINT("CANCEL_REASON_PRICE_PROTECTION_POINT"),
  
  MISSING_SPOT_PRODUCT("CANCEL_REASON_MISSING_SPOT_PRODUCT"),
  
  VENUE_PRODUCT_NOT_FOUND("CANCEL_REASON_VENUE_PRODUCT_NOT_FOUND"),
  
  VENUE_PRODUCT_NO_LONGER_TRADABLE("CANCEL_REASON_VENUE_PRODUCT_NO_LONGER_TRADABLE"),
  
  INVALID_EFFECTIVE_PRICE("CANCEL_REASON_INVALID_EFFECTIVE_PRICE"),
  
  KILLSWITCH_ENABLED("CANCEL_REASON_KILLSWITCH_ENABLED"),
  
  PENDING_ORDER_TIMEOUT("CANCEL_REASON_PENDING_ORDER_TIMEOUT"),
  
  FOK_ORDER_KILLED("CANCEL_REASON_FOK_ORDER_KILLED"),
  
  POST_ONLY_ORDER("CANCEL_REASON_POST_ONLY_ORDER"),
  
  ORDER_EXPIRED("CANCEL_REASON_ORDER_EXPIRED"),
  
  PENDING_CANCEL_ORDER_TIMEOUT("CANCEL_REASON_PENDING_CANCEL_ORDER_TIMEOUT"),
  
  INSUFFICIENT_FUNDS("CANCEL_REASON_INSUFFICIENT_FUNDS");

  private String value;

  CoinbaseBrokerageProxyCommonCancelReason(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CoinbaseBrokerageProxyCommonCancelReason fromValue(String text) {
    for (CoinbaseBrokerageProxyCommonCancelReason b : CoinbaseBrokerageProxyCommonCancelReason.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<CoinbaseBrokerageProxyCommonCancelReason> {
    @Override
    public void write(final JsonWriter jsonWriter, final CoinbaseBrokerageProxyCommonCancelReason enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CoinbaseBrokerageProxyCommonCancelReason read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CoinbaseBrokerageProxyCommonCancelReason.fromValue(String.valueOf(value));
    }
  }
}

