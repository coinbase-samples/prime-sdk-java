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
 * Gets or Sets coinbase.eng.prime.reporting.api.DocumentFormat
 */
@JsonAdapter(CoinbaseEngPrimeReportingApiDocumentFormat.Adapter.class)
public enum CoinbaseEngPrimeReportingApiDocumentFormat {
  
  UNKNOWN("DOCUMENT_FILE_FORMAT_UNKNOWN"),
  
  CSV("DOCUMENT_FILE_FORMAT_CSV"),
  
  PDF("DOCUMENT_FILE_FORMAT_PDF");

  private String value;

  CoinbaseEngPrimeReportingApiDocumentFormat(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CoinbaseEngPrimeReportingApiDocumentFormat fromValue(String text) {
    for (CoinbaseEngPrimeReportingApiDocumentFormat b : CoinbaseEngPrimeReportingApiDocumentFormat.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<CoinbaseEngPrimeReportingApiDocumentFormat> {
    @Override
    public void write(final JsonWriter jsonWriter, final CoinbaseEngPrimeReportingApiDocumentFormat enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CoinbaseEngPrimeReportingApiDocumentFormat read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CoinbaseEngPrimeReportingApiDocumentFormat.fromValue(String.valueOf(value));
    }
  }
}

