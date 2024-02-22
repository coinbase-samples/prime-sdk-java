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
 * Gets or Sets coinbase.eng.prime.api.api.StopPriceDirection
 */
@JsonAdapter(CoinbaseEngPrimeApiApiStopPriceDirection.Adapter.class)
public enum CoinbaseEngPrimeApiApiStopPriceDirection {
  
  UNKNOWN_STOP_DIRECTION("UNKNOWN_STOP_DIRECTION"),
  
  STOP_DIRECTION_STOP_UP("STOP_DIRECTION_STOP_UP"),
  
  STOP_DIRECTION_STOP_DOWN("STOP_DIRECTION_STOP_DOWN");

  private String value;

  CoinbaseEngPrimeApiApiStopPriceDirection(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CoinbaseEngPrimeApiApiStopPriceDirection fromValue(String text) {
    for (CoinbaseEngPrimeApiApiStopPriceDirection b : CoinbaseEngPrimeApiApiStopPriceDirection.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<CoinbaseEngPrimeApiApiStopPriceDirection> {
    @Override
    public void write(final JsonWriter jsonWriter, final CoinbaseEngPrimeApiApiStopPriceDirection enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CoinbaseEngPrimeApiApiStopPriceDirection read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CoinbaseEngPrimeApiApiStopPriceDirection.fromValue(String.valueOf(value));
    }
  }
}

