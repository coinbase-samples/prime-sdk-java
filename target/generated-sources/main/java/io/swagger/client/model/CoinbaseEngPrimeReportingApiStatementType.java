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
 * Gets or Sets coinbase.eng.prime.reporting.api.StatementType
 */
@JsonAdapter(CoinbaseEngPrimeReportingApiStatementType.Adapter.class)
public enum CoinbaseEngPrimeReportingApiStatementType {
  
  UNKNOWN("STATEMENT_TYPE_UNKNOWN"),
  
  CUSTODY_EOM("STATEMENT_TYPE_CUSTODY_EOM"),
  
  PRIME_ENTITY_LEVEL("STATEMENT_TYPE_PRIME_ENTITY_LEVEL");

  private String value;

  CoinbaseEngPrimeReportingApiStatementType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CoinbaseEngPrimeReportingApiStatementType fromValue(String text) {
    for (CoinbaseEngPrimeReportingApiStatementType b : CoinbaseEngPrimeReportingApiStatementType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<CoinbaseEngPrimeReportingApiStatementType> {
    @Override
    public void write(final JsonWriter jsonWriter, final CoinbaseEngPrimeReportingApiStatementType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CoinbaseEngPrimeReportingApiStatementType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CoinbaseEngPrimeReportingApiStatementType.fromValue(String.valueOf(value));
    }
  }
}

