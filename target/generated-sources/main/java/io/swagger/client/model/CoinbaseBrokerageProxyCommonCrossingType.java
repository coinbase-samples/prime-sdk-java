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
 * Gets or Sets coinbase.brokerage.proxy.common.CrossingType
 */
@JsonAdapter(CoinbaseBrokerageProxyCommonCrossingType.Adapter.class)
public enum CoinbaseBrokerageProxyCommonCrossingType {
  
  UNKNOWN_CROSSING_TYPE("UNKNOWN_CROSSING_TYPE"),
  
  PRIME_TO_PRIME("PRIME_TO_PRIME"),
  
  PRIME_TO_EXCHANGE("PRIME_TO_EXCHANGE");

  private String value;

  CoinbaseBrokerageProxyCommonCrossingType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CoinbaseBrokerageProxyCommonCrossingType fromValue(String text) {
    for (CoinbaseBrokerageProxyCommonCrossingType b : CoinbaseBrokerageProxyCommonCrossingType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<CoinbaseBrokerageProxyCommonCrossingType> {
    @Override
    public void write(final JsonWriter jsonWriter, final CoinbaseBrokerageProxyCommonCrossingType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CoinbaseBrokerageProxyCommonCrossingType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CoinbaseBrokerageProxyCommonCrossingType.fromValue(String.valueOf(value));
    }
  }
}

