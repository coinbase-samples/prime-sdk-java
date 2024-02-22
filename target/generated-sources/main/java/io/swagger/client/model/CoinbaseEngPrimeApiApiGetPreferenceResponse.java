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
import io.swagger.client.model.CoinbaseRewardsOrchestrationPreference;
import java.io.IOException;

/**
 * CoinbaseEngPrimeApiApiGetPreferenceResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-02-22T12:46:00.828-08:00")
public class CoinbaseEngPrimeApiApiGetPreferenceResponse {
  @SerializedName("preference")
  private CoinbaseRewardsOrchestrationPreference preference = null;

  public CoinbaseEngPrimeApiApiGetPreferenceResponse preference(CoinbaseRewardsOrchestrationPreference preference) {
    this.preference = preference;
    return this;
  }

   /**
   * Get preference
   * @return preference
  **/
  @ApiModelProperty(required = true, value = "")
  public CoinbaseRewardsOrchestrationPreference getPreference() {
    return preference;
  }

  public void setPreference(CoinbaseRewardsOrchestrationPreference preference) {
    this.preference = preference;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoinbaseEngPrimeApiApiGetPreferenceResponse coinbaseEngPrimeApiApiGetPreferenceResponse = (CoinbaseEngPrimeApiApiGetPreferenceResponse) o;
    return Objects.equals(this.preference, coinbaseEngPrimeApiApiGetPreferenceResponse.preference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(preference);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoinbaseEngPrimeApiApiGetPreferenceResponse {\n");
    
    sb.append("    preference: ").append(toIndentedString(preference)).append("\n");
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

