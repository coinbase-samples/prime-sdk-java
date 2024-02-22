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
import io.swagger.client.model.CoinbasePaymentsCommonPaymentMethodsZenginV2Account;
import io.swagger.client.model.CoinbasePaymentsCommonPaymentMethodsZenginV2Institution;
import java.io.IOException;

/**
 * For withdrawals: contains all info to initiate payment to a Zengin eligible bank account (non-MUFG). For deposits: contains info to initiate payment to a Coinbase Fiat account.
 */
@ApiModel(description = "For withdrawals: contains all info to initiate payment to a Zengin eligible bank account (non-MUFG). For deposits: contains info to initiate payment to a Coinbase Fiat account.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-02-22T12:46:00.828-08:00")
public class CoinbasePaymentsCommonPaymentMethodsZenginV2 {
  @SerializedName("account_holder")
  private CoinbasePaymentsCommonPaymentMethodsZenginV2Account accountHolder = null;

  @SerializedName("institution")
  private CoinbasePaymentsCommonPaymentMethodsZenginV2Institution institution = null;

  public CoinbasePaymentsCommonPaymentMethodsZenginV2 accountHolder(CoinbasePaymentsCommonPaymentMethodsZenginV2Account accountHolder) {
    this.accountHolder = accountHolder;
    return this;
  }

   /**
   * Get accountHolder
   * @return accountHolder
  **/
  @ApiModelProperty(value = "")
  public CoinbasePaymentsCommonPaymentMethodsZenginV2Account getAccountHolder() {
    return accountHolder;
  }

  public void setAccountHolder(CoinbasePaymentsCommonPaymentMethodsZenginV2Account accountHolder) {
    this.accountHolder = accountHolder;
  }

  public CoinbasePaymentsCommonPaymentMethodsZenginV2 institution(CoinbasePaymentsCommonPaymentMethodsZenginV2Institution institution) {
    this.institution = institution;
    return this;
  }

   /**
   * Get institution
   * @return institution
  **/
  @ApiModelProperty(value = "")
  public CoinbasePaymentsCommonPaymentMethodsZenginV2Institution getInstitution() {
    return institution;
  }

  public void setInstitution(CoinbasePaymentsCommonPaymentMethodsZenginV2Institution institution) {
    this.institution = institution;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoinbasePaymentsCommonPaymentMethodsZenginV2 coinbasePaymentsCommonPaymentMethodsZenginV2 = (CoinbasePaymentsCommonPaymentMethodsZenginV2) o;
    return Objects.equals(this.accountHolder, coinbasePaymentsCommonPaymentMethodsZenginV2.accountHolder) &&
        Objects.equals(this.institution, coinbasePaymentsCommonPaymentMethodsZenginV2.institution);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountHolder, institution);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoinbasePaymentsCommonPaymentMethodsZenginV2 {\n");
    
    sb.append("    accountHolder: ").append(toIndentedString(accountHolder)).append("\n");
    sb.append("    institution: ").append(toIndentedString(institution)).append("\n");
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

