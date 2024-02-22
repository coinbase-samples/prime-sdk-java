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
 * Gets or Sets coinbase.custody.api.TestTransactionState
 */
@JsonAdapter(CoinbaseCustodyApiTestTransactionState.Adapter.class)
public enum CoinbaseCustodyApiTestTransactionState {
  
  UNKNOWN("TEST_TRANSACTION_STATE_UNKNOWN"),
  
  CREATED("TEST_TRANSACTION_STATE_CREATED"),
  
  CONSTRUCTED("TEST_TRANSACTION_STATE_CONSTRUCTED"),
  
  BROADCASTING("TEST_TRANSACTION_STATE_BROADCASTING"),
  
  DONE("TEST_TRANSACTION_STATE_DONE"),
  
  FAILED("TEST_TRANSACTION_STATE_FAILED");

  private String value;

  CoinbaseCustodyApiTestTransactionState(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CoinbaseCustodyApiTestTransactionState fromValue(String text) {
    for (CoinbaseCustodyApiTestTransactionState b : CoinbaseCustodyApiTestTransactionState.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<CoinbaseCustodyApiTestTransactionState> {
    @Override
    public void write(final JsonWriter jsonWriter, final CoinbaseCustodyApiTestTransactionState enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CoinbaseCustodyApiTestTransactionState read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CoinbaseCustodyApiTestTransactionState.fromValue(String.valueOf(value));
    }
  }
}

