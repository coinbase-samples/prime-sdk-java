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
import io.swagger.client.model.CoinbaseCustodyApiCurrency;
import io.swagger.client.model.CoinbaseCustodyApiWallet;
import io.swagger.client.model.CoinbaseEngPrimeApiApiBillingPreferenceState;
import java.io.IOException;

/**
 * CoinbaseEngPrimeApiApiAutoBillingPreference
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-02-22T12:46:00.828-08:00")
public class CoinbaseEngPrimeApiApiAutoBillingPreference {
  @SerializedName("vehicle_id")
  private String vehicleId = null;

  @SerializedName("state")
  private CoinbaseEngPrimeApiApiBillingPreferenceState state = null;

  @SerializedName("wallet")
  private CoinbaseCustodyApiWallet wallet = null;

  @SerializedName("currency")
  private CoinbaseCustodyApiCurrency currency = null;

  public CoinbaseEngPrimeApiApiAutoBillingPreference vehicleId(String vehicleId) {
    this.vehicleId = vehicleId;
    return this;
  }

   /**
   * Get vehicleId
   * @return vehicleId
  **/
  @ApiModelProperty(required = true, value = "")
  public String getVehicleId() {
    return vehicleId;
  }

  public void setVehicleId(String vehicleId) {
    this.vehicleId = vehicleId;
  }

  public CoinbaseEngPrimeApiApiAutoBillingPreference state(CoinbaseEngPrimeApiApiBillingPreferenceState state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @ApiModelProperty(required = true, value = "")
  public CoinbaseEngPrimeApiApiBillingPreferenceState getState() {
    return state;
  }

  public void setState(CoinbaseEngPrimeApiApiBillingPreferenceState state) {
    this.state = state;
  }

  public CoinbaseEngPrimeApiApiAutoBillingPreference wallet(CoinbaseCustodyApiWallet wallet) {
    this.wallet = wallet;
    return this;
  }

   /**
   * Get wallet
   * @return wallet
  **/
  @ApiModelProperty(value = "")
  public CoinbaseCustodyApiWallet getWallet() {
    return wallet;
  }

  public void setWallet(CoinbaseCustodyApiWallet wallet) {
    this.wallet = wallet;
  }

  public CoinbaseEngPrimeApiApiAutoBillingPreference currency(CoinbaseCustodyApiCurrency currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @ApiModelProperty(value = "")
  public CoinbaseCustodyApiCurrency getCurrency() {
    return currency;
  }

  public void setCurrency(CoinbaseCustodyApiCurrency currency) {
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
    CoinbaseEngPrimeApiApiAutoBillingPreference coinbaseEngPrimeApiApiAutoBillingPreference = (CoinbaseEngPrimeApiApiAutoBillingPreference) o;
    return Objects.equals(this.vehicleId, coinbaseEngPrimeApiApiAutoBillingPreference.vehicleId) &&
        Objects.equals(this.state, coinbaseEngPrimeApiApiAutoBillingPreference.state) &&
        Objects.equals(this.wallet, coinbaseEngPrimeApiApiAutoBillingPreference.wallet) &&
        Objects.equals(this.currency, coinbaseEngPrimeApiApiAutoBillingPreference.currency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vehicleId, state, wallet, currency);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoinbaseEngPrimeApiApiAutoBillingPreference {\n");
    
    sb.append("    vehicleId: ").append(toIndentedString(vehicleId)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    wallet: ").append(toIndentedString(wallet)).append("\n");
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

