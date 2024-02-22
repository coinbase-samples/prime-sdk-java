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
import io.swagger.client.model.CoinbaseEngPrimeActivityApiActivityType;
import java.io.IOException;

/**
 * CoinbaseEngPrimeApiApiPostApproveVehicleActivityResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-02-22T12:46:00.828-08:00")
public class CoinbaseEngPrimeApiApiPostApproveVehicleActivityResponse {
  @SerializedName("activity_type")
  private CoinbaseEngPrimeActivityApiActivityType activityType = null;

  @SerializedName("num_approvals_remaining")
  private Integer numApprovalsRemaining = null;

  @SerializedName("activity_id")
  private String activityId = null;

  public CoinbaseEngPrimeApiApiPostApproveVehicleActivityResponse activityType(CoinbaseEngPrimeActivityApiActivityType activityType) {
    this.activityType = activityType;
    return this;
  }

   /**
   * Get activityType
   * @return activityType
  **/
  @ApiModelProperty(required = true, value = "")
  public CoinbaseEngPrimeActivityApiActivityType getActivityType() {
    return activityType;
  }

  public void setActivityType(CoinbaseEngPrimeActivityApiActivityType activityType) {
    this.activityType = activityType;
  }

  public CoinbaseEngPrimeApiApiPostApproveVehicleActivityResponse numApprovalsRemaining(Integer numApprovalsRemaining) {
    this.numApprovalsRemaining = numApprovalsRemaining;
    return this;
  }

   /**
   * Get numApprovalsRemaining
   * @return numApprovalsRemaining
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getNumApprovalsRemaining() {
    return numApprovalsRemaining;
  }

  public void setNumApprovalsRemaining(Integer numApprovalsRemaining) {
    this.numApprovalsRemaining = numApprovalsRemaining;
  }

  public CoinbaseEngPrimeApiApiPostApproveVehicleActivityResponse activityId(String activityId) {
    this.activityId = activityId;
    return this;
  }

   /**
   * Get activityId
   * @return activityId
  **/
  @ApiModelProperty(required = true, value = "")
  public String getActivityId() {
    return activityId;
  }

  public void setActivityId(String activityId) {
    this.activityId = activityId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoinbaseEngPrimeApiApiPostApproveVehicleActivityResponse coinbaseEngPrimeApiApiPostApproveVehicleActivityResponse = (CoinbaseEngPrimeApiApiPostApproveVehicleActivityResponse) o;
    return Objects.equals(this.activityType, coinbaseEngPrimeApiApiPostApproveVehicleActivityResponse.activityType) &&
        Objects.equals(this.numApprovalsRemaining, coinbaseEngPrimeApiApiPostApproveVehicleActivityResponse.numApprovalsRemaining) &&
        Objects.equals(this.activityId, coinbaseEngPrimeApiApiPostApproveVehicleActivityResponse.activityId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activityType, numApprovalsRemaining, activityId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoinbaseEngPrimeApiApiPostApproveVehicleActivityResponse {\n");
    
    sb.append("    activityType: ").append(toIndentedString(activityType)).append("\n");
    sb.append("    numApprovalsRemaining: ").append(toIndentedString(numApprovalsRemaining)).append("\n");
    sb.append("    activityId: ").append(toIndentedString(activityId)).append("\n");
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

