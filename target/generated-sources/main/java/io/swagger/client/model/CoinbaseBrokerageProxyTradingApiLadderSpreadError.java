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
 * Gets or Sets coinbase.brokerage.proxy.trading.api.LadderSpreadError
 */
@JsonAdapter(CoinbaseBrokerageProxyTradingApiLadderSpreadError.Adapter.class)
public enum CoinbaseBrokerageProxyTradingApiLadderSpreadError {
  
  COMPUTED("CANNOT_BE_COMPUTED");

  private String value;

  CoinbaseBrokerageProxyTradingApiLadderSpreadError(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CoinbaseBrokerageProxyTradingApiLadderSpreadError fromValue(String text) {
    for (CoinbaseBrokerageProxyTradingApiLadderSpreadError b : CoinbaseBrokerageProxyTradingApiLadderSpreadError.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<CoinbaseBrokerageProxyTradingApiLadderSpreadError> {
    @Override
    public void write(final JsonWriter jsonWriter, final CoinbaseBrokerageProxyTradingApiLadderSpreadError enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CoinbaseBrokerageProxyTradingApiLadderSpreadError read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CoinbaseBrokerageProxyTradingApiLadderSpreadError.fromValue(String.valueOf(value));
    }
  }
}

