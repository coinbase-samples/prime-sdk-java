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
 * Gets or Sets coinbase.custody.api.AddressState
 */
@JsonAdapter(CoinbaseCustodyApiAddressState.Adapter.class)
public enum CoinbaseCustodyApiAddressState {
  
  ADDRESS_STATE_UNKNOWN("ADDRESS_STATE_UNKNOWN"),
  
  COLD("COLD"),
  
  WARM("WARM"),
  
  RESTORE_IN_PROGRESS("RESTORE_IN_PROGRESS"),
  
  RESTORED("RESTORED"),
  
  FOREIGN("FOREIGN"),
  
  INVALIDATED("INVALIDATED"),
  
  SKIPPED("SKIPPED"),
  
  REVOKED("REVOKED"),
  
  CREATE_IN_PROGRESS("CREATE_IN_PROGRESS");

  private String value;

  CoinbaseCustodyApiAddressState(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CoinbaseCustodyApiAddressState fromValue(String text) {
    for (CoinbaseCustodyApiAddressState b : CoinbaseCustodyApiAddressState.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<CoinbaseCustodyApiAddressState> {
    @Override
    public void write(final JsonWriter jsonWriter, final CoinbaseCustodyApiAddressState enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CoinbaseCustodyApiAddressState read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CoinbaseCustodyApiAddressState.fromValue(String.valueOf(value));
    }
  }
}

