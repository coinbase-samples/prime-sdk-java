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
import java.io.IOException;

/**
 * CoinbaseCustodyApiFeeEstimate
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-02-22T12:46:00.828-08:00")
public class CoinbaseCustodyApiFeeEstimate {
  @SerializedName("coinbase_obligation")
  private String coinbaseObligation = null;

  @SerializedName("customer_obligation")
  private String customerObligation = null;

  public CoinbaseCustodyApiFeeEstimate coinbaseObligation(String coinbaseObligation) {
    this.coinbaseObligation = coinbaseObligation;
    return this;
  }

   /**
   * Get coinbaseObligation
   * @return coinbaseObligation
  **/
  @ApiModelProperty(value = "")
  public String getCoinbaseObligation() {
    return coinbaseObligation;
  }

  public void setCoinbaseObligation(String coinbaseObligation) {
    this.coinbaseObligation = coinbaseObligation;
  }

  public CoinbaseCustodyApiFeeEstimate customerObligation(String customerObligation) {
    this.customerObligation = customerObligation;
    return this;
  }

   /**
   * Get customerObligation
   * @return customerObligation
  **/
  @ApiModelProperty(value = "")
  public String getCustomerObligation() {
    return customerObligation;
  }

  public void setCustomerObligation(String customerObligation) {
    this.customerObligation = customerObligation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoinbaseCustodyApiFeeEstimate coinbaseCustodyApiFeeEstimate = (CoinbaseCustodyApiFeeEstimate) o;
    return Objects.equals(this.coinbaseObligation, coinbaseCustodyApiFeeEstimate.coinbaseObligation) &&
        Objects.equals(this.customerObligation, coinbaseCustodyApiFeeEstimate.customerObligation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(coinbaseObligation, customerObligation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoinbaseCustodyApiFeeEstimate {\n");
    
    sb.append("    coinbaseObligation: ").append(toIndentedString(coinbaseObligation)).append("\n");
    sb.append("    customerObligation: ").append(toIndentedString(customerObligation)).append("\n");
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

