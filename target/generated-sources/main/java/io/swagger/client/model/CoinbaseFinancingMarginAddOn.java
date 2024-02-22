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
import io.swagger.client.model.CoinbaseFinancingMarginAddOnType;
import java.io.IOException;

/**
 * CoinbaseFinancingMarginAddOn
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-02-22T12:46:00.828-08:00")
public class CoinbaseFinancingMarginAddOn {
  @SerializedName("amount")
  private CoinbaseFinancingAmount amount = null;

  @SerializedName("add_on_type")
  private CoinbaseFinancingMarginAddOnType addOnType = null;

  public CoinbaseFinancingMarginAddOn amount(CoinbaseFinancingAmount amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(value = "")
  public CoinbaseFinancingAmount getAmount() {
    return amount;
  }

  public void setAmount(CoinbaseFinancingAmount amount) {
    this.amount = amount;
  }

  public CoinbaseFinancingMarginAddOn addOnType(CoinbaseFinancingMarginAddOnType addOnType) {
    this.addOnType = addOnType;
    return this;
  }

   /**
   * Get addOnType
   * @return addOnType
  **/
  @ApiModelProperty(value = "")
  public CoinbaseFinancingMarginAddOnType getAddOnType() {
    return addOnType;
  }

  public void setAddOnType(CoinbaseFinancingMarginAddOnType addOnType) {
    this.addOnType = addOnType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoinbaseFinancingMarginAddOn coinbaseFinancingMarginAddOn = (CoinbaseFinancingMarginAddOn) o;
    return Objects.equals(this.amount, coinbaseFinancingMarginAddOn.amount) &&
        Objects.equals(this.addOnType, coinbaseFinancingMarginAddOn.addOnType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, addOnType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoinbaseFinancingMarginAddOn {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    addOnType: ").append(toIndentedString(addOnType)).append("\n");
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

