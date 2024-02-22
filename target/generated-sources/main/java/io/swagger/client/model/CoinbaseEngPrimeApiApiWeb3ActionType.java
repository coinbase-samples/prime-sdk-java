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
 * Gets or Sets coinbase.eng.prime.api.api.Web3ActionType
 */
@JsonAdapter(CoinbaseEngPrimeApiApiWeb3ActionType.Adapter.class)
public enum CoinbaseEngPrimeApiApiWeb3ActionType {
  
  UNSPECIFIED("WEB3_ACTION_TYPE_UNSPECIFIED"),
  
  BACKUP("WEB3_ACTION_TYPE_BACKUP"),
  
  RECOVERY("WEB3_ACTION_TYPE_RECOVERY"),
  
  ONBOARDING("WEB3_ACTION_TYPE_ONBOARDING"),
  
  SIGNER_ADDITION("WEB3_ACTION_TYPE_SIGNER_ADDITION"),
  
  UPLOAD_SECURITY_KEY("WEB3_ACTION_TYPE_UPLOAD_SECURITY_KEY"),
  
  KEY_EXPORT("WEB3_ACTION_TYPE_KEY_EXPORT"),
  
  ARCHIVE_SECURITY_KEY("WEB3_ACTION_TYPE_ARCHIVE_SECURITY_KEY");

  private String value;

  CoinbaseEngPrimeApiApiWeb3ActionType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CoinbaseEngPrimeApiApiWeb3ActionType fromValue(String text) {
    for (CoinbaseEngPrimeApiApiWeb3ActionType b : CoinbaseEngPrimeApiApiWeb3ActionType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<CoinbaseEngPrimeApiApiWeb3ActionType> {
    @Override
    public void write(final JsonWriter jsonWriter, final CoinbaseEngPrimeApiApiWeb3ActionType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CoinbaseEngPrimeApiApiWeb3ActionType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CoinbaseEngPrimeApiApiWeb3ActionType.fromValue(String.valueOf(value));
    }
  }
}

