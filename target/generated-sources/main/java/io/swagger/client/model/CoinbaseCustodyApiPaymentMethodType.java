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
 * Gets or Sets coinbase.custody.api.PaymentMethodType
 */
@JsonAdapter(CoinbaseCustodyApiPaymentMethodType.Adapter.class)
public enum CoinbaseCustodyApiPaymentMethodType {
  
  TYPE_UNKNOWN("PAYMENT_METHOD_TYPE_UNKNOWN"),
  
  FEDWIRE("PAYMENT_METHOD_FEDWIRE"),
  
  SWIFT("PAYMENT_METHOD_SWIFT"),
  
  SEN("PAYMENT_METHOD_SEN"),
  
  SEPA("PAYMENT_METHOD_SEPA"),
  
  CBIT("PAYMENT_METHOD_CBIT");

  private String value;

  CoinbaseCustodyApiPaymentMethodType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CoinbaseCustodyApiPaymentMethodType fromValue(String text) {
    for (CoinbaseCustodyApiPaymentMethodType b : CoinbaseCustodyApiPaymentMethodType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<CoinbaseCustodyApiPaymentMethodType> {
    @Override
    public void write(final JsonWriter jsonWriter, final CoinbaseCustodyApiPaymentMethodType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CoinbaseCustodyApiPaymentMethodType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CoinbaseCustodyApiPaymentMethodType.fromValue(String.valueOf(value));
    }
  }
}

