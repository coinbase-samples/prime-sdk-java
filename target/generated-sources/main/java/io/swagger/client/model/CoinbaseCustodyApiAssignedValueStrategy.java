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
 * Gets or Sets coinbase.custody.api.AssignedValueStrategy
 */
@JsonAdapter(CoinbaseCustodyApiAssignedValueStrategy.Adapter.class)
public enum CoinbaseCustodyApiAssignedValueStrategy {
  
  UNKNOWN("ASSIGNED_VALUE_STRATEGY_UNKNOWN"),
  
  UNASSIGNED("ASSIGNED_VALUE_STRATEGY_UNASSIGNED"),
  
  LAST_SALE_PRICE("ASSIGNED_VALUE_STRATEGY_LAST_SALE_PRICE");

  private String value;

  CoinbaseCustodyApiAssignedValueStrategy(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CoinbaseCustodyApiAssignedValueStrategy fromValue(String text) {
    for (CoinbaseCustodyApiAssignedValueStrategy b : CoinbaseCustodyApiAssignedValueStrategy.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<CoinbaseCustodyApiAssignedValueStrategy> {
    @Override
    public void write(final JsonWriter jsonWriter, final CoinbaseCustodyApiAssignedValueStrategy enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CoinbaseCustodyApiAssignedValueStrategy read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CoinbaseCustodyApiAssignedValueStrategy.fromValue(String.valueOf(value));
    }
  }
}

