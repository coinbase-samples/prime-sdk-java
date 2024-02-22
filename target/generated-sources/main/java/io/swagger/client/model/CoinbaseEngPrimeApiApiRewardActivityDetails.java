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
 * CoinbaseEngPrimeApiApiRewardActivityDetails
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-02-22T12:46:00.828-08:00")
public class CoinbaseEngPrimeApiApiRewardActivityDetails {
  @SerializedName("balance_pre_reward")
  private String balancePreReward = null;

  @SerializedName("balance_post_reward")
  private String balancePostReward = null;

  @SerializedName("reward_amount")
  private String rewardAmount = null;

  @SerializedName("reward_date_range")
  private String rewardDateRange = null;

  @SerializedName("tws_transaction_id")
  private String twsTransactionId = null;

  public CoinbaseEngPrimeApiApiRewardActivityDetails balancePreReward(String balancePreReward) {
    this.balancePreReward = balancePreReward;
    return this;
  }

   /**
   * Get balancePreReward
   * @return balancePreReward
  **/
  @ApiModelProperty(required = true, value = "")
  public String getBalancePreReward() {
    return balancePreReward;
  }

  public void setBalancePreReward(String balancePreReward) {
    this.balancePreReward = balancePreReward;
  }

  public CoinbaseEngPrimeApiApiRewardActivityDetails balancePostReward(String balancePostReward) {
    this.balancePostReward = balancePostReward;
    return this;
  }

   /**
   * Get balancePostReward
   * @return balancePostReward
  **/
  @ApiModelProperty(required = true, value = "")
  public String getBalancePostReward() {
    return balancePostReward;
  }

  public void setBalancePostReward(String balancePostReward) {
    this.balancePostReward = balancePostReward;
  }

  public CoinbaseEngPrimeApiApiRewardActivityDetails rewardAmount(String rewardAmount) {
    this.rewardAmount = rewardAmount;
    return this;
  }

   /**
   * Get rewardAmount
   * @return rewardAmount
  **/
  @ApiModelProperty(value = "")
  public String getRewardAmount() {
    return rewardAmount;
  }

  public void setRewardAmount(String rewardAmount) {
    this.rewardAmount = rewardAmount;
  }

  public CoinbaseEngPrimeApiApiRewardActivityDetails rewardDateRange(String rewardDateRange) {
    this.rewardDateRange = rewardDateRange;
    return this;
  }

   /**
   * Get rewardDateRange
   * @return rewardDateRange
  **/
  @ApiModelProperty(value = "")
  public String getRewardDateRange() {
    return rewardDateRange;
  }

  public void setRewardDateRange(String rewardDateRange) {
    this.rewardDateRange = rewardDateRange;
  }

  public CoinbaseEngPrimeApiApiRewardActivityDetails twsTransactionId(String twsTransactionId) {
    this.twsTransactionId = twsTransactionId;
    return this;
  }

   /**
   * Get twsTransactionId
   * @return twsTransactionId
  **/
  @ApiModelProperty(value = "")
  public String getTwsTransactionId() {
    return twsTransactionId;
  }

  public void setTwsTransactionId(String twsTransactionId) {
    this.twsTransactionId = twsTransactionId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoinbaseEngPrimeApiApiRewardActivityDetails coinbaseEngPrimeApiApiRewardActivityDetails = (CoinbaseEngPrimeApiApiRewardActivityDetails) o;
    return Objects.equals(this.balancePreReward, coinbaseEngPrimeApiApiRewardActivityDetails.balancePreReward) &&
        Objects.equals(this.balancePostReward, coinbaseEngPrimeApiApiRewardActivityDetails.balancePostReward) &&
        Objects.equals(this.rewardAmount, coinbaseEngPrimeApiApiRewardActivityDetails.rewardAmount) &&
        Objects.equals(this.rewardDateRange, coinbaseEngPrimeApiApiRewardActivityDetails.rewardDateRange) &&
        Objects.equals(this.twsTransactionId, coinbaseEngPrimeApiApiRewardActivityDetails.twsTransactionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(balancePreReward, balancePostReward, rewardAmount, rewardDateRange, twsTransactionId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoinbaseEngPrimeApiApiRewardActivityDetails {\n");
    
    sb.append("    balancePreReward: ").append(toIndentedString(balancePreReward)).append("\n");
    sb.append("    balancePostReward: ").append(toIndentedString(balancePostReward)).append("\n");
    sb.append("    rewardAmount: ").append(toIndentedString(rewardAmount)).append("\n");
    sb.append("    rewardDateRange: ").append(toIndentedString(rewardDateRange)).append("\n");
    sb.append("    twsTransactionId: ").append(toIndentedString(twsTransactionId)).append("\n");
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

