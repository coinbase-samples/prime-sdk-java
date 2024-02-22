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
 * Gets or Sets coinbase.custody.api.InvestmentVehicleEntity
 */
@JsonAdapter(CoinbaseCustodyApiInvestmentVehicleEntity.Adapter.class)
public enum CoinbaseCustodyApiInvestmentVehicleEntity {
  
  UNKNOWN("INVESTMENT_VEHICLE_ENTITY_UNKNOWN"),
  
  US("INVESTMENT_VEHICLE_ENTITY_US"),
  
  IRELAND("INVESTMENT_VEHICLE_ENTITY_IRELAND"),
  
  GERMANY("INVESTMENT_VEHICLE_ENTITY_GERMANY"),
  
  CB_INC("INVESTMENT_VEHICLE_ENTITY_CB_INC");

  private String value;

  CoinbaseCustodyApiInvestmentVehicleEntity(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CoinbaseCustodyApiInvestmentVehicleEntity fromValue(String text) {
    for (CoinbaseCustodyApiInvestmentVehicleEntity b : CoinbaseCustodyApiInvestmentVehicleEntity.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<CoinbaseCustodyApiInvestmentVehicleEntity> {
    @Override
    public void write(final JsonWriter jsonWriter, final CoinbaseCustodyApiInvestmentVehicleEntity enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CoinbaseCustodyApiInvestmentVehicleEntity read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CoinbaseCustodyApiInvestmentVehicleEntity.fromValue(String.valueOf(value));
    }
  }
}

