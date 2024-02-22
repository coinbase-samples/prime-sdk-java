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
 * CoinbasePaymentsCommonPaymentMethodsSwiftInstitution
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-02-22T12:46:00.828-08:00")
public class CoinbasePaymentsCommonPaymentMethodsSwiftInstitution {
  @SerializedName("bic")
  private String bic = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("bank_address1")
  private String bankAddress1 = null;

  @SerializedName("bank_address2")
  private String bankAddress2 = null;

  @SerializedName("bank_address3")
  private String bankAddress3 = null;

  @SerializedName("bank_country_code")
  private String bankCountryCode = null;

  @SerializedName("domestic_bank_id")
  private String domesticBankId = null;

  @SerializedName("international_bank_id")
  private String internationalBankId = null;

  public CoinbasePaymentsCommonPaymentMethodsSwiftInstitution bic(String bic) {
    this.bic = bic;
    return this;
  }

   /**
   * Get bic
   * @return bic
  **/
  @ApiModelProperty(value = "")
  public String getBic() {
    return bic;
  }

  public void setBic(String bic) {
    this.bic = bic;
  }

  public CoinbasePaymentsCommonPaymentMethodsSwiftInstitution name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CoinbasePaymentsCommonPaymentMethodsSwiftInstitution bankAddress1(String bankAddress1) {
    this.bankAddress1 = bankAddress1;
    return this;
  }

   /**
   * Get bankAddress1
   * @return bankAddress1
  **/
  @ApiModelProperty(value = "")
  public String getBankAddress1() {
    return bankAddress1;
  }

  public void setBankAddress1(String bankAddress1) {
    this.bankAddress1 = bankAddress1;
  }

  public CoinbasePaymentsCommonPaymentMethodsSwiftInstitution bankAddress2(String bankAddress2) {
    this.bankAddress2 = bankAddress2;
    return this;
  }

   /**
   * Get bankAddress2
   * @return bankAddress2
  **/
  @ApiModelProperty(value = "")
  public String getBankAddress2() {
    return bankAddress2;
  }

  public void setBankAddress2(String bankAddress2) {
    this.bankAddress2 = bankAddress2;
  }

  public CoinbasePaymentsCommonPaymentMethodsSwiftInstitution bankAddress3(String bankAddress3) {
    this.bankAddress3 = bankAddress3;
    return this;
  }

   /**
   * Get bankAddress3
   * @return bankAddress3
  **/
  @ApiModelProperty(value = "")
  public String getBankAddress3() {
    return bankAddress3;
  }

  public void setBankAddress3(String bankAddress3) {
    this.bankAddress3 = bankAddress3;
  }

  public CoinbasePaymentsCommonPaymentMethodsSwiftInstitution bankCountryCode(String bankCountryCode) {
    this.bankCountryCode = bankCountryCode;
    return this;
  }

   /**
   * Get bankCountryCode
   * @return bankCountryCode
  **/
  @ApiModelProperty(value = "")
  public String getBankCountryCode() {
    return bankCountryCode;
  }

  public void setBankCountryCode(String bankCountryCode) {
    this.bankCountryCode = bankCountryCode;
  }

  public CoinbasePaymentsCommonPaymentMethodsSwiftInstitution domesticBankId(String domesticBankId) {
    this.domesticBankId = domesticBankId;
    return this;
  }

   /**
   * Get domesticBankId
   * @return domesticBankId
  **/
  @ApiModelProperty(value = "")
  public String getDomesticBankId() {
    return domesticBankId;
  }

  public void setDomesticBankId(String domesticBankId) {
    this.domesticBankId = domesticBankId;
  }

  public CoinbasePaymentsCommonPaymentMethodsSwiftInstitution internationalBankId(String internationalBankId) {
    this.internationalBankId = internationalBankId;
    return this;
  }

   /**
   * Get internationalBankId
   * @return internationalBankId
  **/
  @ApiModelProperty(value = "")
  public String getInternationalBankId() {
    return internationalBankId;
  }

  public void setInternationalBankId(String internationalBankId) {
    this.internationalBankId = internationalBankId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoinbasePaymentsCommonPaymentMethodsSwiftInstitution coinbasePaymentsCommonPaymentMethodsSwiftInstitution = (CoinbasePaymentsCommonPaymentMethodsSwiftInstitution) o;
    return Objects.equals(this.bic, coinbasePaymentsCommonPaymentMethodsSwiftInstitution.bic) &&
        Objects.equals(this.name, coinbasePaymentsCommonPaymentMethodsSwiftInstitution.name) &&
        Objects.equals(this.bankAddress1, coinbasePaymentsCommonPaymentMethodsSwiftInstitution.bankAddress1) &&
        Objects.equals(this.bankAddress2, coinbasePaymentsCommonPaymentMethodsSwiftInstitution.bankAddress2) &&
        Objects.equals(this.bankAddress3, coinbasePaymentsCommonPaymentMethodsSwiftInstitution.bankAddress3) &&
        Objects.equals(this.bankCountryCode, coinbasePaymentsCommonPaymentMethodsSwiftInstitution.bankCountryCode) &&
        Objects.equals(this.domesticBankId, coinbasePaymentsCommonPaymentMethodsSwiftInstitution.domesticBankId) &&
        Objects.equals(this.internationalBankId, coinbasePaymentsCommonPaymentMethodsSwiftInstitution.internationalBankId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bic, name, bankAddress1, bankAddress2, bankAddress3, bankCountryCode, domesticBankId, internationalBankId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoinbasePaymentsCommonPaymentMethodsSwiftInstitution {\n");
    
    sb.append("    bic: ").append(toIndentedString(bic)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    bankAddress1: ").append(toIndentedString(bankAddress1)).append("\n");
    sb.append("    bankAddress2: ").append(toIndentedString(bankAddress2)).append("\n");
    sb.append("    bankAddress3: ").append(toIndentedString(bankAddress3)).append("\n");
    sb.append("    bankCountryCode: ").append(toIndentedString(bankCountryCode)).append("\n");
    sb.append("    domesticBankId: ").append(toIndentedString(domesticBankId)).append("\n");
    sb.append("    internationalBankId: ").append(toIndentedString(internationalBankId)).append("\n");
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

