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
 * CoinbaseTwsWeb3TransactionMetadataWeb3TransactionFees
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-02-22T12:46:00.828-08:00")
public class CoinbaseTwsWeb3TransactionMetadataWeb3TransactionFees {
  @SerializedName("asset_symbol")
  private String assetSymbol = null;

  @SerializedName("asset_quantity_lower_bound")
  private String assetQuantityLowerBound = null;

  @SerializedName("asset_quantity_upper_bound")
  private String assetQuantityUpperBound = null;

  @SerializedName("usd_value_lower_bound")
  private String usdValueLowerBound = null;

  @SerializedName("usd_value_upper_bound")
  private String usdValueUpperBound = null;

  public CoinbaseTwsWeb3TransactionMetadataWeb3TransactionFees assetSymbol(String assetSymbol) {
    this.assetSymbol = assetSymbol;
    return this;
  }

   /**
   * Get assetSymbol
   * @return assetSymbol
  **/
  @ApiModelProperty(value = "")
  public String getAssetSymbol() {
    return assetSymbol;
  }

  public void setAssetSymbol(String assetSymbol) {
    this.assetSymbol = assetSymbol;
  }

  public CoinbaseTwsWeb3TransactionMetadataWeb3TransactionFees assetQuantityLowerBound(String assetQuantityLowerBound) {
    this.assetQuantityLowerBound = assetQuantityLowerBound;
    return this;
  }

   /**
   * Get assetQuantityLowerBound
   * @return assetQuantityLowerBound
  **/
  @ApiModelProperty(value = "")
  public String getAssetQuantityLowerBound() {
    return assetQuantityLowerBound;
  }

  public void setAssetQuantityLowerBound(String assetQuantityLowerBound) {
    this.assetQuantityLowerBound = assetQuantityLowerBound;
  }

  public CoinbaseTwsWeb3TransactionMetadataWeb3TransactionFees assetQuantityUpperBound(String assetQuantityUpperBound) {
    this.assetQuantityUpperBound = assetQuantityUpperBound;
    return this;
  }

   /**
   * Get assetQuantityUpperBound
   * @return assetQuantityUpperBound
  **/
  @ApiModelProperty(value = "")
  public String getAssetQuantityUpperBound() {
    return assetQuantityUpperBound;
  }

  public void setAssetQuantityUpperBound(String assetQuantityUpperBound) {
    this.assetQuantityUpperBound = assetQuantityUpperBound;
  }

  public CoinbaseTwsWeb3TransactionMetadataWeb3TransactionFees usdValueLowerBound(String usdValueLowerBound) {
    this.usdValueLowerBound = usdValueLowerBound;
    return this;
  }

   /**
   * Get usdValueLowerBound
   * @return usdValueLowerBound
  **/
  @ApiModelProperty(value = "")
  public String getUsdValueLowerBound() {
    return usdValueLowerBound;
  }

  public void setUsdValueLowerBound(String usdValueLowerBound) {
    this.usdValueLowerBound = usdValueLowerBound;
  }

  public CoinbaseTwsWeb3TransactionMetadataWeb3TransactionFees usdValueUpperBound(String usdValueUpperBound) {
    this.usdValueUpperBound = usdValueUpperBound;
    return this;
  }

   /**
   * Get usdValueUpperBound
   * @return usdValueUpperBound
  **/
  @ApiModelProperty(value = "")
  public String getUsdValueUpperBound() {
    return usdValueUpperBound;
  }

  public void setUsdValueUpperBound(String usdValueUpperBound) {
    this.usdValueUpperBound = usdValueUpperBound;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoinbaseTwsWeb3TransactionMetadataWeb3TransactionFees coinbaseTwsWeb3TransactionMetadataWeb3TransactionFees = (CoinbaseTwsWeb3TransactionMetadataWeb3TransactionFees) o;
    return Objects.equals(this.assetSymbol, coinbaseTwsWeb3TransactionMetadataWeb3TransactionFees.assetSymbol) &&
        Objects.equals(this.assetQuantityLowerBound, coinbaseTwsWeb3TransactionMetadataWeb3TransactionFees.assetQuantityLowerBound) &&
        Objects.equals(this.assetQuantityUpperBound, coinbaseTwsWeb3TransactionMetadataWeb3TransactionFees.assetQuantityUpperBound) &&
        Objects.equals(this.usdValueLowerBound, coinbaseTwsWeb3TransactionMetadataWeb3TransactionFees.usdValueLowerBound) &&
        Objects.equals(this.usdValueUpperBound, coinbaseTwsWeb3TransactionMetadataWeb3TransactionFees.usdValueUpperBound);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetSymbol, assetQuantityLowerBound, assetQuantityUpperBound, usdValueLowerBound, usdValueUpperBound);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoinbaseTwsWeb3TransactionMetadataWeb3TransactionFees {\n");
    
    sb.append("    assetSymbol: ").append(toIndentedString(assetSymbol)).append("\n");
    sb.append("    assetQuantityLowerBound: ").append(toIndentedString(assetQuantityLowerBound)).append("\n");
    sb.append("    assetQuantityUpperBound: ").append(toIndentedString(assetQuantityUpperBound)).append("\n");
    sb.append("    usdValueLowerBound: ").append(toIndentedString(usdValueLowerBound)).append("\n");
    sb.append("    usdValueUpperBound: ").append(toIndentedString(usdValueUpperBound)).append("\n");
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

