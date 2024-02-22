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
import io.swagger.client.model.CoinbasePaymentsCommonDigitalWalletDetails;
import io.swagger.client.model.CoinbasePaymentsCommonPaymentMethodsAddress;
import io.swagger.client.model.CoinbasePaymentsCommonPaymentMethodsGooglePayBraintreeData;
import io.swagger.client.model.CoinbasePaymentsCommonPaymentMethodsGooglePayResult;
import io.swagger.client.model.CoinbasePaymentsCommonPaymentMethodsGooglePayScheme;
import java.io.IOException;

/**
 * CoinbasePaymentsCommonPaymentMethodsGooglePay
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-02-22T12:46:00.828-08:00")
public class CoinbasePaymentsCommonPaymentMethodsGooglePay {
  @SerializedName("braintree")
  private CoinbasePaymentsCommonPaymentMethodsGooglePayBraintreeData braintree = null;

  @SerializedName("google_pay")
  private CoinbasePaymentsCommonDigitalWalletDetails googlePay = null;

  @SerializedName("user_id")
  private String userId = null;

  @SerializedName("postal_code")
  private String postalCode = null;

  @SerializedName("customer_name")
  private String customerName = null;

  @SerializedName("address")
  private CoinbasePaymentsCommonPaymentMethodsAddress address = null;

  @SerializedName("six_digit_bin")
  private String sixDigitBin = null;

  @SerializedName("last_four")
  private String lastFour = null;

  @SerializedName("issuing_country")
  private String issuingCountry = null;

  @SerializedName("issuing_bank")
  private String issuingBank = null;

  @SerializedName("product_id")
  private String productId = null;

  @SerializedName("scheme")
  private CoinbasePaymentsCommonPaymentMethodsGooglePayScheme scheme = null;

  @SerializedName("prepaid")
  private CoinbasePaymentsCommonPaymentMethodsGooglePayResult prepaid = null;

  @SerializedName("debit")
  private CoinbasePaymentsCommonPaymentMethodsGooglePayResult debit = null;

  public CoinbasePaymentsCommonPaymentMethodsGooglePay braintree(CoinbasePaymentsCommonPaymentMethodsGooglePayBraintreeData braintree) {
    this.braintree = braintree;
    return this;
  }

   /**
   * Get braintree
   * @return braintree
  **/
  @ApiModelProperty(value = "")
  public CoinbasePaymentsCommonPaymentMethodsGooglePayBraintreeData getBraintree() {
    return braintree;
  }

  public void setBraintree(CoinbasePaymentsCommonPaymentMethodsGooglePayBraintreeData braintree) {
    this.braintree = braintree;
  }

  public CoinbasePaymentsCommonPaymentMethodsGooglePay googlePay(CoinbasePaymentsCommonDigitalWalletDetails googlePay) {
    this.googlePay = googlePay;
    return this;
  }

   /**
   * Get googlePay
   * @return googlePay
  **/
  @ApiModelProperty(value = "")
  public CoinbasePaymentsCommonDigitalWalletDetails getGooglePay() {
    return googlePay;
  }

  public void setGooglePay(CoinbasePaymentsCommonDigitalWalletDetails googlePay) {
    this.googlePay = googlePay;
  }

  public CoinbasePaymentsCommonPaymentMethodsGooglePay userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @ApiModelProperty(value = "")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public CoinbasePaymentsCommonPaymentMethodsGooglePay postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * Get postalCode
   * @return postalCode
  **/
  @ApiModelProperty(value = "")
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public CoinbasePaymentsCommonPaymentMethodsGooglePay customerName(String customerName) {
    this.customerName = customerName;
    return this;
  }

   /**
   * Get customerName
   * @return customerName
  **/
  @ApiModelProperty(value = "")
  public String getCustomerName() {
    return customerName;
  }

  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }

  public CoinbasePaymentsCommonPaymentMethodsGooglePay address(CoinbasePaymentsCommonPaymentMethodsAddress address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @ApiModelProperty(value = "")
  public CoinbasePaymentsCommonPaymentMethodsAddress getAddress() {
    return address;
  }

  public void setAddress(CoinbasePaymentsCommonPaymentMethodsAddress address) {
    this.address = address;
  }

  public CoinbasePaymentsCommonPaymentMethodsGooglePay sixDigitBin(String sixDigitBin) {
    this.sixDigitBin = sixDigitBin;
    return this;
  }

   /**
   * Get sixDigitBin
   * @return sixDigitBin
  **/
  @ApiModelProperty(value = "")
  public String getSixDigitBin() {
    return sixDigitBin;
  }

  public void setSixDigitBin(String sixDigitBin) {
    this.sixDigitBin = sixDigitBin;
  }

  public CoinbasePaymentsCommonPaymentMethodsGooglePay lastFour(String lastFour) {
    this.lastFour = lastFour;
    return this;
  }

   /**
   * Get lastFour
   * @return lastFour
  **/
  @ApiModelProperty(value = "")
  public String getLastFour() {
    return lastFour;
  }

  public void setLastFour(String lastFour) {
    this.lastFour = lastFour;
  }

  public CoinbasePaymentsCommonPaymentMethodsGooglePay issuingCountry(String issuingCountry) {
    this.issuingCountry = issuingCountry;
    return this;
  }

   /**
   * Get issuingCountry
   * @return issuingCountry
  **/
  @ApiModelProperty(value = "")
  public String getIssuingCountry() {
    return issuingCountry;
  }

  public void setIssuingCountry(String issuingCountry) {
    this.issuingCountry = issuingCountry;
  }

  public CoinbasePaymentsCommonPaymentMethodsGooglePay issuingBank(String issuingBank) {
    this.issuingBank = issuingBank;
    return this;
  }

   /**
   * Get issuingBank
   * @return issuingBank
  **/
  @ApiModelProperty(value = "")
  public String getIssuingBank() {
    return issuingBank;
  }

  public void setIssuingBank(String issuingBank) {
    this.issuingBank = issuingBank;
  }

  public CoinbasePaymentsCommonPaymentMethodsGooglePay productId(String productId) {
    this.productId = productId;
    return this;
  }

   /**
   * Get productId
   * @return productId
  **/
  @ApiModelProperty(value = "")
  public String getProductId() {
    return productId;
  }

  public void setProductId(String productId) {
    this.productId = productId;
  }

  public CoinbasePaymentsCommonPaymentMethodsGooglePay scheme(CoinbasePaymentsCommonPaymentMethodsGooglePayScheme scheme) {
    this.scheme = scheme;
    return this;
  }

   /**
   * Get scheme
   * @return scheme
  **/
  @ApiModelProperty(value = "")
  public CoinbasePaymentsCommonPaymentMethodsGooglePayScheme getScheme() {
    return scheme;
  }

  public void setScheme(CoinbasePaymentsCommonPaymentMethodsGooglePayScheme scheme) {
    this.scheme = scheme;
  }

  public CoinbasePaymentsCommonPaymentMethodsGooglePay prepaid(CoinbasePaymentsCommonPaymentMethodsGooglePayResult prepaid) {
    this.prepaid = prepaid;
    return this;
  }

   /**
   * Get prepaid
   * @return prepaid
  **/
  @ApiModelProperty(value = "")
  public CoinbasePaymentsCommonPaymentMethodsGooglePayResult getPrepaid() {
    return prepaid;
  }

  public void setPrepaid(CoinbasePaymentsCommonPaymentMethodsGooglePayResult prepaid) {
    this.prepaid = prepaid;
  }

  public CoinbasePaymentsCommonPaymentMethodsGooglePay debit(CoinbasePaymentsCommonPaymentMethodsGooglePayResult debit) {
    this.debit = debit;
    return this;
  }

   /**
   * Get debit
   * @return debit
  **/
  @ApiModelProperty(value = "")
  public CoinbasePaymentsCommonPaymentMethodsGooglePayResult getDebit() {
    return debit;
  }

  public void setDebit(CoinbasePaymentsCommonPaymentMethodsGooglePayResult debit) {
    this.debit = debit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoinbasePaymentsCommonPaymentMethodsGooglePay coinbasePaymentsCommonPaymentMethodsGooglePay = (CoinbasePaymentsCommonPaymentMethodsGooglePay) o;
    return Objects.equals(this.braintree, coinbasePaymentsCommonPaymentMethodsGooglePay.braintree) &&
        Objects.equals(this.googlePay, coinbasePaymentsCommonPaymentMethodsGooglePay.googlePay) &&
        Objects.equals(this.userId, coinbasePaymentsCommonPaymentMethodsGooglePay.userId) &&
        Objects.equals(this.postalCode, coinbasePaymentsCommonPaymentMethodsGooglePay.postalCode) &&
        Objects.equals(this.customerName, coinbasePaymentsCommonPaymentMethodsGooglePay.customerName) &&
        Objects.equals(this.address, coinbasePaymentsCommonPaymentMethodsGooglePay.address) &&
        Objects.equals(this.sixDigitBin, coinbasePaymentsCommonPaymentMethodsGooglePay.sixDigitBin) &&
        Objects.equals(this.lastFour, coinbasePaymentsCommonPaymentMethodsGooglePay.lastFour) &&
        Objects.equals(this.issuingCountry, coinbasePaymentsCommonPaymentMethodsGooglePay.issuingCountry) &&
        Objects.equals(this.issuingBank, coinbasePaymentsCommonPaymentMethodsGooglePay.issuingBank) &&
        Objects.equals(this.productId, coinbasePaymentsCommonPaymentMethodsGooglePay.productId) &&
        Objects.equals(this.scheme, coinbasePaymentsCommonPaymentMethodsGooglePay.scheme) &&
        Objects.equals(this.prepaid, coinbasePaymentsCommonPaymentMethodsGooglePay.prepaid) &&
        Objects.equals(this.debit, coinbasePaymentsCommonPaymentMethodsGooglePay.debit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(braintree, googlePay, userId, postalCode, customerName, address, sixDigitBin, lastFour, issuingCountry, issuingBank, productId, scheme, prepaid, debit);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoinbasePaymentsCommonPaymentMethodsGooglePay {\n");
    
    sb.append("    braintree: ").append(toIndentedString(braintree)).append("\n");
    sb.append("    googlePay: ").append(toIndentedString(googlePay)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    customerName: ").append(toIndentedString(customerName)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    sixDigitBin: ").append(toIndentedString(sixDigitBin)).append("\n");
    sb.append("    lastFour: ").append(toIndentedString(lastFour)).append("\n");
    sb.append("    issuingCountry: ").append(toIndentedString(issuingCountry)).append("\n");
    sb.append("    issuingBank: ").append(toIndentedString(issuingBank)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    scheme: ").append(toIndentedString(scheme)).append("\n");
    sb.append("    prepaid: ").append(toIndentedString(prepaid)).append("\n");
    sb.append("    debit: ").append(toIndentedString(debit)).append("\n");
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

