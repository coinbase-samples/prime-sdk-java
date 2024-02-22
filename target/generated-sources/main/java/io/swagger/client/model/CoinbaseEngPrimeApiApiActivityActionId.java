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
import io.swagger.client.model.CoinbaseEngPrimeApiApiActivityAction;
import java.io.IOException;

/**
 * CoinbaseEngPrimeApiApiActivityActionId
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-02-22T12:46:00.828-08:00")
public class CoinbaseEngPrimeApiApiActivityActionId {
  @SerializedName("activity_id")
  private String activityId = null;

  @SerializedName("portfolio_id")
  private String portfolioId = null;

  @SerializedName("action")
  private CoinbaseEngPrimeApiApiActivityAction action = null;

  public CoinbaseEngPrimeApiApiActivityActionId activityId(String activityId) {
    this.activityId = activityId;
    return this;
  }

   /**
   * Get activityId
   * @return activityId
  **/
  @ApiModelProperty(value = "")
  public String getActivityId() {
    return activityId;
  }

  public void setActivityId(String activityId) {
    this.activityId = activityId;
  }

  public CoinbaseEngPrimeApiApiActivityActionId portfolioId(String portfolioId) {
    this.portfolioId = portfolioId;
    return this;
  }

   /**
   * Get portfolioId
   * @return portfolioId
  **/
  @ApiModelProperty(value = "")
  public String getPortfolioId() {
    return portfolioId;
  }

  public void setPortfolioId(String portfolioId) {
    this.portfolioId = portfolioId;
  }

  public CoinbaseEngPrimeApiApiActivityActionId action(CoinbaseEngPrimeApiApiActivityAction action) {
    this.action = action;
    return this;
  }

   /**
   * Get action
   * @return action
  **/
  @ApiModelProperty(value = "")
  public CoinbaseEngPrimeApiApiActivityAction getAction() {
    return action;
  }

  public void setAction(CoinbaseEngPrimeApiApiActivityAction action) {
    this.action = action;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoinbaseEngPrimeApiApiActivityActionId coinbaseEngPrimeApiApiActivityActionId = (CoinbaseEngPrimeApiApiActivityActionId) o;
    return Objects.equals(this.activityId, coinbaseEngPrimeApiApiActivityActionId.activityId) &&
        Objects.equals(this.portfolioId, coinbaseEngPrimeApiApiActivityActionId.portfolioId) &&
        Objects.equals(this.action, coinbaseEngPrimeApiApiActivityActionId.action);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activityId, portfolioId, action);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoinbaseEngPrimeApiApiActivityActionId {\n");
    
    sb.append("    activityId: ").append(toIndentedString(activityId)).append("\n");
    sb.append("    portfolioId: ").append(toIndentedString(portfolioId)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
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

