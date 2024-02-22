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
 * CoinbasePaymentsCommonPaymentMethodsBlockchainTransaction
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-02-22T12:46:00.828-08:00")
public class CoinbasePaymentsCommonPaymentMethodsBlockchainTransaction {
  @SerializedName("hsh")
  private String hsh = null;

  @SerializedName("height")
  private Integer height = null;

  public CoinbasePaymentsCommonPaymentMethodsBlockchainTransaction hsh(String hsh) {
    this.hsh = hsh;
    return this;
  }

   /**
   * Get hsh
   * @return hsh
  **/
  @ApiModelProperty(value = "")
  public String getHsh() {
    return hsh;
  }

  public void setHsh(String hsh) {
    this.hsh = hsh;
  }

  public CoinbasePaymentsCommonPaymentMethodsBlockchainTransaction height(Integer height) {
    this.height = height;
    return this;
  }

   /**
   * Get height
   * @return height
  **/
  @ApiModelProperty(value = "")
  public Integer getHeight() {
    return height;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoinbasePaymentsCommonPaymentMethodsBlockchainTransaction coinbasePaymentsCommonPaymentMethodsBlockchainTransaction = (CoinbasePaymentsCommonPaymentMethodsBlockchainTransaction) o;
    return Objects.equals(this.hsh, coinbasePaymentsCommonPaymentMethodsBlockchainTransaction.hsh) &&
        Objects.equals(this.height, coinbasePaymentsCommonPaymentMethodsBlockchainTransaction.height);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hsh, height);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoinbasePaymentsCommonPaymentMethodsBlockchainTransaction {\n");
    
    sb.append("    hsh: ").append(toIndentedString(hsh)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
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

