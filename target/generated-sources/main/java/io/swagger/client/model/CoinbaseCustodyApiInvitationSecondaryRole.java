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
 * Gets or Sets coinbase.custody.api.InvitationSecondaryRole
 */
@JsonAdapter(CoinbaseCustodyApiInvitationSecondaryRole.Adapter.class)
public enum CoinbaseCustodyApiInvitationSecondaryRole {
  
  UNKNOWN("INVITATION_SECONDARY_ROLE_UNKNOWN"),
  
  VIDEO_APPROVER("INVITATION_SECONDARY_ROLE_VIDEO_APPROVER");

  private String value;

  CoinbaseCustodyApiInvitationSecondaryRole(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CoinbaseCustodyApiInvitationSecondaryRole fromValue(String text) {
    for (CoinbaseCustodyApiInvitationSecondaryRole b : CoinbaseCustodyApiInvitationSecondaryRole.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<CoinbaseCustodyApiInvitationSecondaryRole> {
    @Override
    public void write(final JsonWriter jsonWriter, final CoinbaseCustodyApiInvitationSecondaryRole enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CoinbaseCustodyApiInvitationSecondaryRole read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CoinbaseCustodyApiInvitationSecondaryRole.fromValue(String.valueOf(value));
    }
  }
}

