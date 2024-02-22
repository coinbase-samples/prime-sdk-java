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
 * Gets or Sets coinbase.custody.api.DocumentSignatureState
 */
@JsonAdapter(CoinbaseCustodyApiDocumentSignatureState.Adapter.class)
public enum CoinbaseCustodyApiDocumentSignatureState {
  
  UNKNOWN("DOCUMENT_SIGNATURE_STATE_UNKNOWN"),
  
  CREATED("DOCUMENT_SIGNATURE_STATE_CREATED"),
  
  APPROVED("DOCUMENT_SIGNATURE_STATE_APPROVED"),
  
  EXPIRED("DOCUMENT_SIGNATURE_STATE_EXPIRED");

  private String value;

  CoinbaseCustodyApiDocumentSignatureState(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CoinbaseCustodyApiDocumentSignatureState fromValue(String text) {
    for (CoinbaseCustodyApiDocumentSignatureState b : CoinbaseCustodyApiDocumentSignatureState.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<CoinbaseCustodyApiDocumentSignatureState> {
    @Override
    public void write(final JsonWriter jsonWriter, final CoinbaseCustodyApiDocumentSignatureState enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CoinbaseCustodyApiDocumentSignatureState read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CoinbaseCustodyApiDocumentSignatureState.fromValue(String.valueOf(value));
    }
  }
}

