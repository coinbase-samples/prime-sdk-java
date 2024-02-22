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
 * CoinbaseTwsLedgerHoldReplacement
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-02-22T12:46:00.828-08:00")
public class CoinbaseTwsLedgerHoldReplacement {
  @SerializedName("hold_id_to_replace")
  private String holdIdToReplace = null;

  @SerializedName("new_hold_amount")
  private String newHoldAmount = null;

  @SerializedName("new_hold_id")
  private String newHoldId = null;

  public CoinbaseTwsLedgerHoldReplacement holdIdToReplace(String holdIdToReplace) {
    this.holdIdToReplace = holdIdToReplace;
    return this;
  }

   /**
   * Get holdIdToReplace
   * @return holdIdToReplace
  **/
  @ApiModelProperty(value = "")
  public String getHoldIdToReplace() {
    return holdIdToReplace;
  }

  public void setHoldIdToReplace(String holdIdToReplace) {
    this.holdIdToReplace = holdIdToReplace;
  }

  public CoinbaseTwsLedgerHoldReplacement newHoldAmount(String newHoldAmount) {
    this.newHoldAmount = newHoldAmount;
    return this;
  }

   /**
   * Get newHoldAmount
   * @return newHoldAmount
  **/
  @ApiModelProperty(value = "")
  public String getNewHoldAmount() {
    return newHoldAmount;
  }

  public void setNewHoldAmount(String newHoldAmount) {
    this.newHoldAmount = newHoldAmount;
  }

  public CoinbaseTwsLedgerHoldReplacement newHoldId(String newHoldId) {
    this.newHoldId = newHoldId;
    return this;
  }

   /**
   * Get newHoldId
   * @return newHoldId
  **/
  @ApiModelProperty(value = "")
  public String getNewHoldId() {
    return newHoldId;
  }

  public void setNewHoldId(String newHoldId) {
    this.newHoldId = newHoldId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoinbaseTwsLedgerHoldReplacement coinbaseTwsLedgerHoldReplacement = (CoinbaseTwsLedgerHoldReplacement) o;
    return Objects.equals(this.holdIdToReplace, coinbaseTwsLedgerHoldReplacement.holdIdToReplace) &&
        Objects.equals(this.newHoldAmount, coinbaseTwsLedgerHoldReplacement.newHoldAmount) &&
        Objects.equals(this.newHoldId, coinbaseTwsLedgerHoldReplacement.newHoldId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(holdIdToReplace, newHoldAmount, newHoldId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoinbaseTwsLedgerHoldReplacement {\n");
    
    sb.append("    holdIdToReplace: ").append(toIndentedString(holdIdToReplace)).append("\n");
    sb.append("    newHoldAmount: ").append(toIndentedString(newHoldAmount)).append("\n");
    sb.append("    newHoldId: ").append(toIndentedString(newHoldId)).append("\n");
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

