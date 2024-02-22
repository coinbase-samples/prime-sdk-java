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
import io.swagger.client.model.CoinbaseCustodyApiActivityState;
import io.swagger.client.model.CoinbaseCustodyApiAuditableType;
import java.io.IOException;

/**
 * CoinbaseCustodyApiUserLastActivity
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-02-22T12:46:00.828-08:00")
public class CoinbaseCustodyApiUserLastActivity {
  @SerializedName("id")
  private String id = null;

  @SerializedName("auditable_type")
  private CoinbaseCustodyApiAuditableType auditableType = null;

  @SerializedName("state")
  private CoinbaseCustodyApiActivityState state = null;

  @SerializedName("created_at")
  private String createdAt = null;

  @SerializedName("title")
  private String title = null;

  @SerializedName("last_update")
  private String lastUpdate = null;

  public CoinbaseCustodyApiUserLastActivity id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CoinbaseCustodyApiUserLastActivity auditableType(CoinbaseCustodyApiAuditableType auditableType) {
    this.auditableType = auditableType;
    return this;
  }

   /**
   * Get auditableType
   * @return auditableType
  **/
  @ApiModelProperty(required = true, value = "")
  public CoinbaseCustodyApiAuditableType getAuditableType() {
    return auditableType;
  }

  public void setAuditableType(CoinbaseCustodyApiAuditableType auditableType) {
    this.auditableType = auditableType;
  }

  public CoinbaseCustodyApiUserLastActivity state(CoinbaseCustodyApiActivityState state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @ApiModelProperty(required = true, value = "")
  public CoinbaseCustodyApiActivityState getState() {
    return state;
  }

  public void setState(CoinbaseCustodyApiActivityState state) {
    this.state = state;
  }

  public CoinbaseCustodyApiUserLastActivity createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @ApiModelProperty(required = true, value = "")
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public CoinbaseCustodyApiUserLastActivity title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @ApiModelProperty(required = true, value = "")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public CoinbaseCustodyApiUserLastActivity lastUpdate(String lastUpdate) {
    this.lastUpdate = lastUpdate;
    return this;
  }

   /**
   * Get lastUpdate
   * @return lastUpdate
  **/
  @ApiModelProperty(required = true, value = "")
  public String getLastUpdate() {
    return lastUpdate;
  }

  public void setLastUpdate(String lastUpdate) {
    this.lastUpdate = lastUpdate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoinbaseCustodyApiUserLastActivity coinbaseCustodyApiUserLastActivity = (CoinbaseCustodyApiUserLastActivity) o;
    return Objects.equals(this.id, coinbaseCustodyApiUserLastActivity.id) &&
        Objects.equals(this.auditableType, coinbaseCustodyApiUserLastActivity.auditableType) &&
        Objects.equals(this.state, coinbaseCustodyApiUserLastActivity.state) &&
        Objects.equals(this.createdAt, coinbaseCustodyApiUserLastActivity.createdAt) &&
        Objects.equals(this.title, coinbaseCustodyApiUserLastActivity.title) &&
        Objects.equals(this.lastUpdate, coinbaseCustodyApiUserLastActivity.lastUpdate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, auditableType, state, createdAt, title, lastUpdate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoinbaseCustodyApiUserLastActivity {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    auditableType: ").append(toIndentedString(auditableType)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    lastUpdate: ").append(toIndentedString(lastUpdate)).append("\n");
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

