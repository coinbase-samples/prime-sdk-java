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
 * Gets or Sets coinbase.eng.prime.api.api.HierarchyType
 */
@JsonAdapter(CoinbaseEngPrimeApiApiHierarchyType.Adapter.class)
public enum CoinbaseEngPrimeApiApiHierarchyType {
  
  UNKNOWN("HIERARCHY_TYPE_UNKNOWN"),
  
  PORTFOLIO("HIERARCHY_TYPE_PORTFOLIO"),
  
  ENTITY("HIERARCHY_TYPE_ENTITY");

  private String value;

  CoinbaseEngPrimeApiApiHierarchyType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CoinbaseEngPrimeApiApiHierarchyType fromValue(String text) {
    for (CoinbaseEngPrimeApiApiHierarchyType b : CoinbaseEngPrimeApiApiHierarchyType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<CoinbaseEngPrimeApiApiHierarchyType> {
    @Override
    public void write(final JsonWriter jsonWriter, final CoinbaseEngPrimeApiApiHierarchyType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CoinbaseEngPrimeApiApiHierarchyType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CoinbaseEngPrimeApiApiHierarchyType.fromValue(String.valueOf(value));
    }
  }
}

