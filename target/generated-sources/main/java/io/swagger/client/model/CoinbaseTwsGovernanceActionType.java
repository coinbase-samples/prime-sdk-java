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
 * Gets or Sets coinbase.tws.GovernanceActionType
 */
@JsonAdapter(CoinbaseTwsGovernanceActionType.Adapter.class)
public enum CoinbaseTwsGovernanceActionType {
  
  UNSPECIFIED("GOVERNANCE_ACTION_TYPE_UNSPECIFIED"),
  
  DELEGATION("GOVERNANCE_ACTION_TYPE_DELEGATION");

  private String value;

  CoinbaseTwsGovernanceActionType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CoinbaseTwsGovernanceActionType fromValue(String text) {
    for (CoinbaseTwsGovernanceActionType b : CoinbaseTwsGovernanceActionType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<CoinbaseTwsGovernanceActionType> {
    @Override
    public void write(final JsonWriter jsonWriter, final CoinbaseTwsGovernanceActionType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CoinbaseTwsGovernanceActionType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CoinbaseTwsGovernanceActionType.fromValue(String.valueOf(value));
    }
  }
}

