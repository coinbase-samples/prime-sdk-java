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
 * CoinbasePaymentsCommonPaymentMethodsDefaultAccount
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-02-22T12:46:00.828-08:00")
public class CoinbasePaymentsCommonPaymentMethodsDefaultAccount {
  @SerializedName("user_uuid")
  private String userUuid = null;

  @SerializedName("currency")
  private String currency = null;

  public CoinbasePaymentsCommonPaymentMethodsDefaultAccount userUuid(String userUuid) {
    this.userUuid = userUuid;
    return this;
  }

   /**
   * Get userUuid
   * @return userUuid
  **/
  @ApiModelProperty(value = "")
  public String getUserUuid() {
    return userUuid;
  }

  public void setUserUuid(String userUuid) {
    this.userUuid = userUuid;
  }

  public CoinbasePaymentsCommonPaymentMethodsDefaultAccount currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @ApiModelProperty(value = "")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoinbasePaymentsCommonPaymentMethodsDefaultAccount coinbasePaymentsCommonPaymentMethodsDefaultAccount = (CoinbasePaymentsCommonPaymentMethodsDefaultAccount) o;
    return Objects.equals(this.userUuid, coinbasePaymentsCommonPaymentMethodsDefaultAccount.userUuid) &&
        Objects.equals(this.currency, coinbasePaymentsCommonPaymentMethodsDefaultAccount.currency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userUuid, currency);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoinbasePaymentsCommonPaymentMethodsDefaultAccount {\n");
    
    sb.append("    userUuid: ").append(toIndentedString(userUuid)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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

