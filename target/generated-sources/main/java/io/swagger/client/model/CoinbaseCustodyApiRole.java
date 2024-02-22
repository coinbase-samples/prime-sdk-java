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
 * Gets or Sets coinbase.custody.api.Role
 */
@JsonAdapter(CoinbaseCustodyApiRole.Adapter.class)
public enum CoinbaseCustodyApiRole {
  
  UNKNOWN("ROLE_UNKNOWN"),
  
  AUTHORIZED_SIGNATORY("ROLE_AUTHORIZED_SIGNATORY"),
  
  INITIATOR("ROLE_INITIATOR"),
  
  APPROVER("ROLE_APPROVER"),
  
  AUDITOR("ROLE_AUDITOR"),
  
  ADMINISTRATOR("ROLE_ADMINISTRATOR"),
  
  TRADER("ROLE_TRADER"),
  
  INTERNAL_TRADER("ROLE_INTERNAL_TRADER"),
  
  TEAM_MANAGER("ROLE_TEAM_MANAGER"),
  
  FULL_TRADER("ROLE_FULL_TRADER"),
  
  INTERNAL_AUDITOR("ROLE_INTERNAL_AUDITOR");

  private String value;

  CoinbaseCustodyApiRole(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CoinbaseCustodyApiRole fromValue(String text) {
    for (CoinbaseCustodyApiRole b : CoinbaseCustodyApiRole.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<CoinbaseCustodyApiRole> {
    @Override
    public void write(final JsonWriter jsonWriter, final CoinbaseCustodyApiRole enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CoinbaseCustodyApiRole read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CoinbaseCustodyApiRole.fromValue(String.valueOf(value));
    }
  }
}

