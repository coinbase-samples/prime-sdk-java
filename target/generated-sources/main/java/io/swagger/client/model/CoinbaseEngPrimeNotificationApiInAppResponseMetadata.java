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
import io.swagger.client.model.CoinbaseEngPrimeNotificationApiAssociateObject;
import io.swagger.client.model.CoinbaseEngPrimeNotificationApiInAppStatus;
import io.swagger.client.model.CoinbaseEngPrimeNotificationApiInAppType;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;

/**
 * CoinbaseEngPrimeNotificationApiInAppResponseMetadata
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-02-22T12:46:00.828-08:00")
public class CoinbaseEngPrimeNotificationApiInAppResponseMetadata {
  @SerializedName("in_app_notification_id")
  private String inAppNotificationId = null;

  @SerializedName("user_id")
  private String userId = null;

  @SerializedName("created_at")
  private OffsetDateTime createdAt = null;

  @SerializedName("status")
  private CoinbaseEngPrimeNotificationApiInAppStatus status = null;

  @SerializedName("associate_object")
  private CoinbaseEngPrimeNotificationApiAssociateObject associateObject = null;

  @SerializedName("in_app_type")
  private CoinbaseEngPrimeNotificationApiInAppType inAppType = null;

  public CoinbaseEngPrimeNotificationApiInAppResponseMetadata inAppNotificationId(String inAppNotificationId) {
    this.inAppNotificationId = inAppNotificationId;
    return this;
  }

   /**
   * Get inAppNotificationId
   * @return inAppNotificationId
  **/
  @ApiModelProperty(value = "")
  public String getInAppNotificationId() {
    return inAppNotificationId;
  }

  public void setInAppNotificationId(String inAppNotificationId) {
    this.inAppNotificationId = inAppNotificationId;
  }

  public CoinbaseEngPrimeNotificationApiInAppResponseMetadata userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @ApiModelProperty(value = "")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public CoinbaseEngPrimeNotificationApiInAppResponseMetadata createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public CoinbaseEngPrimeNotificationApiInAppResponseMetadata status(CoinbaseEngPrimeNotificationApiInAppStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public CoinbaseEngPrimeNotificationApiInAppStatus getStatus() {
    return status;
  }

  public void setStatus(CoinbaseEngPrimeNotificationApiInAppStatus status) {
    this.status = status;
  }

  public CoinbaseEngPrimeNotificationApiInAppResponseMetadata associateObject(CoinbaseEngPrimeNotificationApiAssociateObject associateObject) {
    this.associateObject = associateObject;
    return this;
  }

   /**
   * Get associateObject
   * @return associateObject
  **/
  @ApiModelProperty(value = "")
  public CoinbaseEngPrimeNotificationApiAssociateObject getAssociateObject() {
    return associateObject;
  }

  public void setAssociateObject(CoinbaseEngPrimeNotificationApiAssociateObject associateObject) {
    this.associateObject = associateObject;
  }

  public CoinbaseEngPrimeNotificationApiInAppResponseMetadata inAppType(CoinbaseEngPrimeNotificationApiInAppType inAppType) {
    this.inAppType = inAppType;
    return this;
  }

   /**
   * Get inAppType
   * @return inAppType
  **/
  @ApiModelProperty(value = "")
  public CoinbaseEngPrimeNotificationApiInAppType getInAppType() {
    return inAppType;
  }

  public void setInAppType(CoinbaseEngPrimeNotificationApiInAppType inAppType) {
    this.inAppType = inAppType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoinbaseEngPrimeNotificationApiInAppResponseMetadata coinbaseEngPrimeNotificationApiInAppResponseMetadata = (CoinbaseEngPrimeNotificationApiInAppResponseMetadata) o;
    return Objects.equals(this.inAppNotificationId, coinbaseEngPrimeNotificationApiInAppResponseMetadata.inAppNotificationId) &&
        Objects.equals(this.userId, coinbaseEngPrimeNotificationApiInAppResponseMetadata.userId) &&
        Objects.equals(this.createdAt, coinbaseEngPrimeNotificationApiInAppResponseMetadata.createdAt) &&
        Objects.equals(this.status, coinbaseEngPrimeNotificationApiInAppResponseMetadata.status) &&
        Objects.equals(this.associateObject, coinbaseEngPrimeNotificationApiInAppResponseMetadata.associateObject) &&
        Objects.equals(this.inAppType, coinbaseEngPrimeNotificationApiInAppResponseMetadata.inAppType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inAppNotificationId, userId, createdAt, status, associateObject, inAppType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoinbaseEngPrimeNotificationApiInAppResponseMetadata {\n");
    
    sb.append("    inAppNotificationId: ").append(toIndentedString(inAppNotificationId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    associateObject: ").append(toIndentedString(associateObject)).append("\n");
    sb.append("    inAppType: ").append(toIndentedString(inAppType)).append("\n");
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

