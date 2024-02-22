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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.CoinbaseCustodyApiSettings;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * CoinbaseEngPrimeApiApiGetEntitySettingsResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-02-22T12:46:00.828-08:00")
public class CoinbaseEngPrimeApiApiGetEntitySettingsResponse {
  @SerializedName("settings")
  private List<CoinbaseCustodyApiSettings> settings = null;

  public CoinbaseEngPrimeApiApiGetEntitySettingsResponse settings(List<CoinbaseCustodyApiSettings> settings) {
    this.settings = settings;
    return this;
  }

  public CoinbaseEngPrimeApiApiGetEntitySettingsResponse addSettingsItem(CoinbaseCustodyApiSettings settingsItem) {
    if (this.settings == null) {
      this.settings = new ArrayList<CoinbaseCustodyApiSettings>();
    }
    this.settings.add(settingsItem);
    return this;
  }

   /**
   * Get settings
   * @return settings
  **/
  @ApiModelProperty(value = "")
  public List<CoinbaseCustodyApiSettings> getSettings() {
    return settings;
  }

  public void setSettings(List<CoinbaseCustodyApiSettings> settings) {
    this.settings = settings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoinbaseEngPrimeApiApiGetEntitySettingsResponse coinbaseEngPrimeApiApiGetEntitySettingsResponse = (CoinbaseEngPrimeApiApiGetEntitySettingsResponse) o;
    return Objects.equals(this.settings, coinbaseEngPrimeApiApiGetEntitySettingsResponse.settings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(settings);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoinbaseEngPrimeApiApiGetEntitySettingsResponse {\n");
    
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

