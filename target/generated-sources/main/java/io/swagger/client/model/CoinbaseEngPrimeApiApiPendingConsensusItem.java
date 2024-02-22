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
import io.swagger.client.model.CoinbaseEngPrimeApiApiHierarchy;
import java.io.IOException;

/**
 * CoinbaseEngPrimeApiApiPendingConsensusItem
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-02-22T12:46:00.828-08:00")
public class CoinbaseEngPrimeApiApiPendingConsensusItem {
  @SerializedName("hierarchy")
  private CoinbaseEngPrimeApiApiHierarchy hierarchy = null;

  @SerializedName("reference_type")
  private String referenceType = null;

  @SerializedName("num_approvals_remaining")
  private Integer numApprovalsRemaining = null;

  @SerializedName("activity_id")
  private String activityId = null;

  public CoinbaseEngPrimeApiApiPendingConsensusItem hierarchy(CoinbaseEngPrimeApiApiHierarchy hierarchy) {
    this.hierarchy = hierarchy;
    return this;
  }

   /**
   * Get hierarchy
   * @return hierarchy
  **/
  @ApiModelProperty(required = true, value = "")
  public CoinbaseEngPrimeApiApiHierarchy getHierarchy() {
    return hierarchy;
  }

  public void setHierarchy(CoinbaseEngPrimeApiApiHierarchy hierarchy) {
    this.hierarchy = hierarchy;
  }

  public CoinbaseEngPrimeApiApiPendingConsensusItem referenceType(String referenceType) {
    this.referenceType = referenceType;
    return this;
  }

   /**
   * Get referenceType
   * @return referenceType
  **/
  @ApiModelProperty(required = true, value = "")
  public String getReferenceType() {
    return referenceType;
  }

  public void setReferenceType(String referenceType) {
    this.referenceType = referenceType;
  }

  public CoinbaseEngPrimeApiApiPendingConsensusItem numApprovalsRemaining(Integer numApprovalsRemaining) {
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

  public CoinbaseEngPrimeApiApiPendingConsensusItem activityId(String activityId) {
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
    CoinbaseEngPrimeApiApiPendingConsensusItem coinbaseEngPrimeApiApiPendingConsensusItem = (CoinbaseEngPrimeApiApiPendingConsensusItem) o;
    return Objects.equals(this.hierarchy, coinbaseEngPrimeApiApiPendingConsensusItem.hierarchy) &&
        Objects.equals(this.referenceType, coinbaseEngPrimeApiApiPendingConsensusItem.referenceType) &&
        Objects.equals(this.numApprovalsRemaining, coinbaseEngPrimeApiApiPendingConsensusItem.numApprovalsRemaining) &&
        Objects.equals(this.activityId, coinbaseEngPrimeApiApiPendingConsensusItem.activityId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hierarchy, referenceType, numApprovalsRemaining, activityId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoinbaseEngPrimeApiApiPendingConsensusItem {\n");
    
    sb.append("    hierarchy: ").append(toIndentedString(hierarchy)).append("\n");
    sb.append("    referenceType: ").append(toIndentedString(referenceType)).append("\n");
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

