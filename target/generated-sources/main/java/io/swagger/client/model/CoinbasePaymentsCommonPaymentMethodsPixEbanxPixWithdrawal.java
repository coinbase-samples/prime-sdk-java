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
 * CoinbasePaymentsCommonPaymentMethodsPixEbanxPixWithdrawal
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-02-22T12:46:00.828-08:00")
public class CoinbasePaymentsCommonPaymentMethodsPixEbanxPixWithdrawal {
  @SerializedName("account_number")
  private String accountNumber = null;

  @SerializedName("account_type")
  private String accountType = null;

  @SerializedName("bank_code")
  private String bankCode = null;

  @SerializedName("branch_number")
  private String branchNumber = null;

  @SerializedName("pix_key")
  private String pixKey = null;

  public CoinbasePaymentsCommonPaymentMethodsPixEbanxPixWithdrawal accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

   /**
   * Get accountNumber
   * @return accountNumber
  **/
  @ApiModelProperty(value = "")
  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public CoinbasePaymentsCommonPaymentMethodsPixEbanxPixWithdrawal accountType(String accountType) {
    this.accountType = accountType;
    return this;
  }

   /**
   * Get accountType
   * @return accountType
  **/
  @ApiModelProperty(value = "")
  public String getAccountType() {
    return accountType;
  }

  public void setAccountType(String accountType) {
    this.accountType = accountType;
  }

  public CoinbasePaymentsCommonPaymentMethodsPixEbanxPixWithdrawal bankCode(String bankCode) {
    this.bankCode = bankCode;
    return this;
  }

   /**
   * Get bankCode
   * @return bankCode
  **/
  @ApiModelProperty(value = "")
  public String getBankCode() {
    return bankCode;
  }

  public void setBankCode(String bankCode) {
    this.bankCode = bankCode;
  }

  public CoinbasePaymentsCommonPaymentMethodsPixEbanxPixWithdrawal branchNumber(String branchNumber) {
    this.branchNumber = branchNumber;
    return this;
  }

   /**
   * Get branchNumber
   * @return branchNumber
  **/
  @ApiModelProperty(value = "")
  public String getBranchNumber() {
    return branchNumber;
  }

  public void setBranchNumber(String branchNumber) {
    this.branchNumber = branchNumber;
  }

  public CoinbasePaymentsCommonPaymentMethodsPixEbanxPixWithdrawal pixKey(String pixKey) {
    this.pixKey = pixKey;
    return this;
  }

   /**
   * Get pixKey
   * @return pixKey
  **/
  @ApiModelProperty(value = "")
  public String getPixKey() {
    return pixKey;
  }

  public void setPixKey(String pixKey) {
    this.pixKey = pixKey;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoinbasePaymentsCommonPaymentMethodsPixEbanxPixWithdrawal coinbasePaymentsCommonPaymentMethodsPixEbanxPixWithdrawal = (CoinbasePaymentsCommonPaymentMethodsPixEbanxPixWithdrawal) o;
    return Objects.equals(this.accountNumber, coinbasePaymentsCommonPaymentMethodsPixEbanxPixWithdrawal.accountNumber) &&
        Objects.equals(this.accountType, coinbasePaymentsCommonPaymentMethodsPixEbanxPixWithdrawal.accountType) &&
        Objects.equals(this.bankCode, coinbasePaymentsCommonPaymentMethodsPixEbanxPixWithdrawal.bankCode) &&
        Objects.equals(this.branchNumber, coinbasePaymentsCommonPaymentMethodsPixEbanxPixWithdrawal.branchNumber) &&
        Objects.equals(this.pixKey, coinbasePaymentsCommonPaymentMethodsPixEbanxPixWithdrawal.pixKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountNumber, accountType, bankCode, branchNumber, pixKey);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoinbasePaymentsCommonPaymentMethodsPixEbanxPixWithdrawal {\n");
    
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    bankCode: ").append(toIndentedString(bankCode)).append("\n");
    sb.append("    branchNumber: ").append(toIndentedString(branchNumber)).append("\n");
    sb.append("    pixKey: ").append(toIndentedString(pixKey)).append("\n");
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

