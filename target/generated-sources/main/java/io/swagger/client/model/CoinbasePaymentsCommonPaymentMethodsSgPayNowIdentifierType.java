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
 * Gets or Sets coinbase.payments.common.payment_methods.SgPayNow.IdentifierType
 */
@JsonAdapter(CoinbasePaymentsCommonPaymentMethodsSgPayNowIdentifierType.Adapter.class)
public enum CoinbasePaymentsCommonPaymentMethodsSgPayNowIdentifierType {
  
  UNSPECIFIED("TYPE_UNSPECIFIED"),
  
  NRIC("TYPE_NRIC"),
  
  PHONE("TYPE_PHONE");

  private String value;

  CoinbasePaymentsCommonPaymentMethodsSgPayNowIdentifierType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CoinbasePaymentsCommonPaymentMethodsSgPayNowIdentifierType fromValue(String text) {
    for (CoinbasePaymentsCommonPaymentMethodsSgPayNowIdentifierType b : CoinbasePaymentsCommonPaymentMethodsSgPayNowIdentifierType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<CoinbasePaymentsCommonPaymentMethodsSgPayNowIdentifierType> {
    @Override
    public void write(final JsonWriter jsonWriter, final CoinbasePaymentsCommonPaymentMethodsSgPayNowIdentifierType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CoinbasePaymentsCommonPaymentMethodsSgPayNowIdentifierType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CoinbasePaymentsCommonPaymentMethodsSgPayNowIdentifierType.fromValue(String.valueOf(value));
    }
  }
}

