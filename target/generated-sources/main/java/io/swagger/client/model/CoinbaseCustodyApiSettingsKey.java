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
 * Gets or Sets coinbase.custody.api.SettingsKey
 */
@JsonAdapter(CoinbaseCustodyApiSettingsKey.Adapter.class)
public enum CoinbaseCustodyApiSettingsKey {
  
  UNKNOWN("SETTINGS_KEY_UNKNOWN"),
  
  CONSENSUS_WITHDRAWAL("SETTINGS_KEY_CONSENSUS_WITHDRAWAL"),
  
  MAX_WITHDRAWAL_AMOUNT("SETTINGS_KEY_MAX_WITHDRAWAL_AMOUNT"),
  
  TRUSTED_ADDRESS_PROTECTION("SETTINGS_KEY_TRUSTED_ADDRESS_PROTECTION"),
  
  MULTI_WALLETS("SETTINGS_KEY_MULTI_WALLETS"),
  
  API_KEY_GENERATION("SETTINGS_KEY_API_KEY_GENERATION"),
  
  CONSENSUS_ONE("SETTINGS_KEY_CONSENSUS_ONE"),
  
  SIGN_STAKING_ADDENDUM("SETTINGS_KEY_SIGN_STAKING_ADDENDUM"),
  
  GOVERNANCE_VOTE_CONSENSUS("SETTINGS_KEY_GOVERNANCE_VOTE_CONSENSUS"),
  
  REQUIRED_APPROVAL("SETTINGS_KEY_REQUIRED_APPROVAL"),
  
  VIDEO_CONSENSUS("SETTINGS_KEY_VIDEO_CONSENSUS"),
  
  ORGANIZATION_AUL_STATUS("SETTINGS_KEY_ORGANIZATION_AUL_STATUS");

  private String value;

  CoinbaseCustodyApiSettingsKey(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CoinbaseCustodyApiSettingsKey fromValue(String text) {
    for (CoinbaseCustodyApiSettingsKey b : CoinbaseCustodyApiSettingsKey.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<CoinbaseCustodyApiSettingsKey> {
    @Override
    public void write(final JsonWriter jsonWriter, final CoinbaseCustodyApiSettingsKey enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CoinbaseCustodyApiSettingsKey read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CoinbaseCustodyApiSettingsKey.fromValue(String.valueOf(value));
    }
  }
}

