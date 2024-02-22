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
 * Gets or Sets scanner.OperationType
 */
@JsonAdapter(ScannerOperationType.Adapter.class)
public enum ScannerOperationType {
  
  OPERATION_TYPE_UNKNOWN("OPERATION_TYPE_UNKNOWN"),
  
  BALANCE_TRANSFER("BALANCE_TRANSFER"),
  
  BALANCE_APPROVAL("BALANCE_APPROVAL"),
  
  CONTRACT_OWNERSHIP_TRANSFER("CONTRACT_OWNERSHIP_TRANSFER"),
  
  ITEM_TRANSFER("ITEM_TRANSFER"),
  
  ITEM_APPROVAL("ITEM_APPROVAL"),
  
  ITEM_APPROVAL_ALL("ITEM_APPROVAL_ALL");

  private String value;

  ScannerOperationType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ScannerOperationType fromValue(String text) {
    for (ScannerOperationType b : ScannerOperationType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ScannerOperationType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ScannerOperationType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ScannerOperationType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ScannerOperationType.fromValue(String.valueOf(value));
    }
  }
}

