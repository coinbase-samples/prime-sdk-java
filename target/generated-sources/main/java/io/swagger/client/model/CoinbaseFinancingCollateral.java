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
import io.swagger.client.model.CoinbaseFinancingAmount;
import io.swagger.client.model.CoinbaseFinancingCollateralType;
import java.io.IOException;

/**
 * CoinbaseFinancingCollateral
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-02-22T12:46:00.828-08:00")
public class CoinbaseFinancingCollateral {
  @SerializedName("id")
  private String id = null;

  @SerializedName("balance")
  private CoinbaseFinancingAmount balance = null;

  @SerializedName("notional_balance")
  private CoinbaseFinancingAmount notionalBalance = null;

  @SerializedName("collateral_type")
  private CoinbaseFinancingCollateralType collateralType = null;

  @SerializedName("percentage")
  private String percentage = null;

  public CoinbaseFinancingCollateral id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CoinbaseFinancingCollateral balance(CoinbaseFinancingAmount balance) {
    this.balance = balance;
    return this;
  }

   /**
   * Get balance
   * @return balance
  **/
  @ApiModelProperty(value = "")
  public CoinbaseFinancingAmount getBalance() {
    return balance;
  }

  public void setBalance(CoinbaseFinancingAmount balance) {
    this.balance = balance;
  }

  public CoinbaseFinancingCollateral notionalBalance(CoinbaseFinancingAmount notionalBalance) {
    this.notionalBalance = notionalBalance;
    return this;
  }

   /**
   * Get notionalBalance
   * @return notionalBalance
  **/
  @ApiModelProperty(value = "")
  public CoinbaseFinancingAmount getNotionalBalance() {
    return notionalBalance;
  }

  public void setNotionalBalance(CoinbaseFinancingAmount notionalBalance) {
    this.notionalBalance = notionalBalance;
  }

  public CoinbaseFinancingCollateral collateralType(CoinbaseFinancingCollateralType collateralType) {
    this.collateralType = collateralType;
    return this;
  }

   /**
   * Get collateralType
   * @return collateralType
  **/
  @ApiModelProperty(value = "")
  public CoinbaseFinancingCollateralType getCollateralType() {
    return collateralType;
  }

  public void setCollateralType(CoinbaseFinancingCollateralType collateralType) {
    this.collateralType = collateralType;
  }

  public CoinbaseFinancingCollateral percentage(String percentage) {
    this.percentage = percentage;
    return this;
  }

   /**
   * Get percentage
   * @return percentage
  **/
  @ApiModelProperty(value = "")
  public String getPercentage() {
    return percentage;
  }

  public void setPercentage(String percentage) {
    this.percentage = percentage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoinbaseFinancingCollateral coinbaseFinancingCollateral = (CoinbaseFinancingCollateral) o;
    return Objects.equals(this.id, coinbaseFinancingCollateral.id) &&
        Objects.equals(this.balance, coinbaseFinancingCollateral.balance) &&
        Objects.equals(this.notionalBalance, coinbaseFinancingCollateral.notionalBalance) &&
        Objects.equals(this.collateralType, coinbaseFinancingCollateral.collateralType) &&
        Objects.equals(this.percentage, coinbaseFinancingCollateral.percentage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, balance, notionalBalance, collateralType, percentage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoinbaseFinancingCollateral {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    notionalBalance: ").append(toIndentedString(notionalBalance)).append("\n");
    sb.append("    collateralType: ").append(toIndentedString(collateralType)).append("\n");
    sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
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

