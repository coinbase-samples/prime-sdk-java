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
import io.swagger.client.model.CoinbaseTwsCryptoDestination;
import java.io.IOException;

/**
 * CoinbaseTwsCryptoWithdrawalAction
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-02-22T12:46:00.828-08:00")
public class CoinbaseTwsCryptoWithdrawalAction {
  @SerializedName("asset")
  private String asset = null;

  @SerializedName("amount")
  private String amount = null;

  @SerializedName("destination")
  private CoinbaseTwsCryptoDestination destination = null;

  public CoinbaseTwsCryptoWithdrawalAction asset(String asset) {
    this.asset = asset;
    return this;
  }

   /**
   * The symbol of the currency to transfer with
   * @return asset
  **/
  @ApiModelProperty(value = "The symbol of the currency to transfer with")
  public String getAsset() {
    return asset;
  }

  public void setAsset(String asset) {
    this.asset = asset;
  }

  public CoinbaseTwsCryptoWithdrawalAction amount(String amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Crypto transfer amount in whole unit
   * @return amount
  **/
  @ApiModelProperty(value = "Crypto transfer amount in whole unit")
  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  public CoinbaseTwsCryptoWithdrawalAction destination(CoinbaseTwsCryptoDestination destination) {
    this.destination = destination;
    return this;
  }

   /**
   * Crypto transaction destination
   * @return destination
  **/
  @ApiModelProperty(value = "Crypto transaction destination")
  public CoinbaseTwsCryptoDestination getDestination() {
    return destination;
  }

  public void setDestination(CoinbaseTwsCryptoDestination destination) {
    this.destination = destination;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoinbaseTwsCryptoWithdrawalAction coinbaseTwsCryptoWithdrawalAction = (CoinbaseTwsCryptoWithdrawalAction) o;
    return Objects.equals(this.asset, coinbaseTwsCryptoWithdrawalAction.asset) &&
        Objects.equals(this.amount, coinbaseTwsCryptoWithdrawalAction.amount) &&
        Objects.equals(this.destination, coinbaseTwsCryptoWithdrawalAction.destination);
  }

  @Override
  public int hashCode() {
    return Objects.hash(asset, amount, destination);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoinbaseTwsCryptoWithdrawalAction {\n");
    
    sb.append("    asset: ").append(toIndentedString(asset)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
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

