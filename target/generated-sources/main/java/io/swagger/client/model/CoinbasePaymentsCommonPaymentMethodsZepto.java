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
import io.swagger.client.model.CoinbasePaymentsCommonPaymentMethodsZeptoAccount;
import java.io.IOException;

/**
 * Zepto identifies for the payment method ZEPTO.
 */
@ApiModel(description = "Zepto identifies for the payment method ZEPTO.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-02-22T12:46:00.828-08:00")
public class CoinbasePaymentsCommonPaymentMethodsZepto {
  @SerializedName("account")
  private CoinbasePaymentsCommonPaymentMethodsZeptoAccount account = null;

  public CoinbasePaymentsCommonPaymentMethodsZepto account(CoinbasePaymentsCommonPaymentMethodsZeptoAccount account) {
    this.account = account;
    return this;
  }

   /**
   * Get account
   * @return account
  **/
  @ApiModelProperty(value = "")
  public CoinbasePaymentsCommonPaymentMethodsZeptoAccount getAccount() {
    return account;
  }

  public void setAccount(CoinbasePaymentsCommonPaymentMethodsZeptoAccount account) {
    this.account = account;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoinbasePaymentsCommonPaymentMethodsZepto coinbasePaymentsCommonPaymentMethodsZepto = (CoinbasePaymentsCommonPaymentMethodsZepto) o;
    return Objects.equals(this.account, coinbasePaymentsCommonPaymentMethodsZepto.account);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoinbasePaymentsCommonPaymentMethodsZepto {\n");
    
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
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

