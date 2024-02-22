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
 * CoinbasePaymentsCommonPaymentMethodsInteracAccount
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-02-22T12:46:00.828-08:00")
public class CoinbasePaymentsCommonPaymentMethodsInteracAccount {
  @SerializedName("account_name")
  private String accountName = null;

  @SerializedName("institution_number")
  private String institutionNumber = null;

  @SerializedName("transit_number")
  private String transitNumber = null;

  @SerializedName("account_number")
  private String accountNumber = null;

  public CoinbasePaymentsCommonPaymentMethodsInteracAccount accountName(String accountName) {
    this.accountName = accountName;
    return this;
  }

   /**
   * Get accountName
   * @return accountName
  **/
  @ApiModelProperty(value = "")
  public String getAccountName() {
    return accountName;
  }

  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }

  public CoinbasePaymentsCommonPaymentMethodsInteracAccount institutionNumber(String institutionNumber) {
    this.institutionNumber = institutionNumber;
    return this;
  }

   /**
   * Institution Number: a 3-digit code that tells you which bank the account belongs to — unique for every Canadian bank.
   * @return institutionNumber
  **/
  @ApiModelProperty(value = "Institution Number: a 3-digit code that tells you which bank the account belongs to — unique for every Canadian bank.")
  public String getInstitutionNumber() {
    return institutionNumber;
  }

  public void setInstitutionNumber(String institutionNumber) {
    this.institutionNumber = institutionNumber;
  }

  public CoinbasePaymentsCommonPaymentMethodsInteracAccount transitNumber(String transitNumber) {
    this.transitNumber = transitNumber;
    return this;
  }

   /**
   * Transit Number: a 5-digit code that tells which branch of the bank the account was created at — it is unique to each bank branch.
   * @return transitNumber
  **/
  @ApiModelProperty(value = "Transit Number: a 5-digit code that tells which branch of the bank the account was created at — it is unique to each bank branch.")
  public String getTransitNumber() {
    return transitNumber;
  }

  public void setTransitNumber(String transitNumber) {
    this.transitNumber = transitNumber;
  }

  public CoinbasePaymentsCommonPaymentMethodsInteracAccount accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

   /**
   * Account Number: a 7-digit code that identifies the account within the branch and bank entered.
   * @return accountNumber
  **/
  @ApiModelProperty(value = "Account Number: a 7-digit code that identifies the account within the branch and bank entered.")
  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoinbasePaymentsCommonPaymentMethodsInteracAccount coinbasePaymentsCommonPaymentMethodsInteracAccount = (CoinbasePaymentsCommonPaymentMethodsInteracAccount) o;
    return Objects.equals(this.accountName, coinbasePaymentsCommonPaymentMethodsInteracAccount.accountName) &&
        Objects.equals(this.institutionNumber, coinbasePaymentsCommonPaymentMethodsInteracAccount.institutionNumber) &&
        Objects.equals(this.transitNumber, coinbasePaymentsCommonPaymentMethodsInteracAccount.transitNumber) &&
        Objects.equals(this.accountNumber, coinbasePaymentsCommonPaymentMethodsInteracAccount.accountNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountName, institutionNumber, transitNumber, accountNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoinbasePaymentsCommonPaymentMethodsInteracAccount {\n");
    
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    institutionNumber: ").append(toIndentedString(institutionNumber)).append("\n");
    sb.append("    transitNumber: ").append(toIndentedString(transitNumber)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
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

