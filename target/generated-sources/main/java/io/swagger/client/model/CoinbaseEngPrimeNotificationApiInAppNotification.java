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
import io.swagger.client.model.CoinbaseEngPrimeNotificationApiConvertedInAppTemplate;
import io.swagger.client.model.CoinbaseEngPrimeNotificationApiInAppResponseMetadata;
import java.io.IOException;

/**
 * CoinbaseEngPrimeNotificationApiInAppNotification
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-02-22T12:46:00.828-08:00")
public class CoinbaseEngPrimeNotificationApiInAppNotification {
  @SerializedName("converted_in_app_template")
  private CoinbaseEngPrimeNotificationApiConvertedInAppTemplate convertedInAppTemplate = null;

  @SerializedName("in_app_metadata")
  private CoinbaseEngPrimeNotificationApiInAppResponseMetadata inAppMetadata = null;

  public CoinbaseEngPrimeNotificationApiInAppNotification convertedInAppTemplate(CoinbaseEngPrimeNotificationApiConvertedInAppTemplate convertedInAppTemplate) {
    this.convertedInAppTemplate = convertedInAppTemplate;
    return this;
  }

   /**
   * Get convertedInAppTemplate
   * @return convertedInAppTemplate
  **/
  @ApiModelProperty(value = "")
  public CoinbaseEngPrimeNotificationApiConvertedInAppTemplate getConvertedInAppTemplate() {
    return convertedInAppTemplate;
  }

  public void setConvertedInAppTemplate(CoinbaseEngPrimeNotificationApiConvertedInAppTemplate convertedInAppTemplate) {
    this.convertedInAppTemplate = convertedInAppTemplate;
  }

  public CoinbaseEngPrimeNotificationApiInAppNotification inAppMetadata(CoinbaseEngPrimeNotificationApiInAppResponseMetadata inAppMetadata) {
    this.inAppMetadata = inAppMetadata;
    return this;
  }

   /**
   * Get inAppMetadata
   * @return inAppMetadata
  **/
  @ApiModelProperty(value = "")
  public CoinbaseEngPrimeNotificationApiInAppResponseMetadata getInAppMetadata() {
    return inAppMetadata;
  }

  public void setInAppMetadata(CoinbaseEngPrimeNotificationApiInAppResponseMetadata inAppMetadata) {
    this.inAppMetadata = inAppMetadata;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoinbaseEngPrimeNotificationApiInAppNotification coinbaseEngPrimeNotificationApiInAppNotification = (CoinbaseEngPrimeNotificationApiInAppNotification) o;
    return Objects.equals(this.convertedInAppTemplate, coinbaseEngPrimeNotificationApiInAppNotification.convertedInAppTemplate) &&
        Objects.equals(this.inAppMetadata, coinbaseEngPrimeNotificationApiInAppNotification.inAppMetadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(convertedInAppTemplate, inAppMetadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoinbaseEngPrimeNotificationApiInAppNotification {\n");
    
    sb.append("    convertedInAppTemplate: ").append(toIndentedString(convertedInAppTemplate)).append("\n");
    sb.append("    inAppMetadata: ").append(toIndentedString(inAppMetadata)).append("\n");
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

