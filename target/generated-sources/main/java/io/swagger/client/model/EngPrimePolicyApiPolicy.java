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
import io.swagger.client.model.EngPrimePolicyApiHierarchy;
import io.swagger.client.model.EngPrimePolicyApiRule;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;

/**
 * EngPrimePolicyApiPolicy
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-02-22T12:46:00.828-08:00")
public class EngPrimePolicyApiPolicy {
  @SerializedName("id")
  private String id = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("hierarchy")
  private EngPrimePolicyApiHierarchy hierarchy = null;

  @SerializedName("rules")
  private List<EngPrimePolicyApiRule> rules = null;

  @SerializedName("created_at")
  private OffsetDateTime createdAt = null;

  @SerializedName("created_by_user_id")
  private String createdByUserId = null;

  @SerializedName("deleted_at")
  private OffsetDateTime deletedAt = null;

  @SerializedName("is_default")
  private Boolean isDefault = null;

  public EngPrimePolicyApiPolicy id(String id) {
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

  public EngPrimePolicyApiPolicy type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public EngPrimePolicyApiPolicy hierarchy(EngPrimePolicyApiHierarchy hierarchy) {
    this.hierarchy = hierarchy;
    return this;
  }

   /**
   * Get hierarchy
   * @return hierarchy
  **/
  @ApiModelProperty(value = "")
  public EngPrimePolicyApiHierarchy getHierarchy() {
    return hierarchy;
  }

  public void setHierarchy(EngPrimePolicyApiHierarchy hierarchy) {
    this.hierarchy = hierarchy;
  }

  public EngPrimePolicyApiPolicy rules(List<EngPrimePolicyApiRule> rules) {
    this.rules = rules;
    return this;
  }

  public EngPrimePolicyApiPolicy addRulesItem(EngPrimePolicyApiRule rulesItem) {
    if (this.rules == null) {
      this.rules = new ArrayList<EngPrimePolicyApiRule>();
    }
    this.rules.add(rulesItem);
    return this;
  }

   /**
   * Get rules
   * @return rules
  **/
  @ApiModelProperty(value = "")
  public List<EngPrimePolicyApiRule> getRules() {
    return rules;
  }

  public void setRules(List<EngPrimePolicyApiRule> rules) {
    this.rules = rules;
  }

  public EngPrimePolicyApiPolicy createdAt(OffsetDateTime createdAt) {
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

  public EngPrimePolicyApiPolicy createdByUserId(String createdByUserId) {
    this.createdByUserId = createdByUserId;
    return this;
  }

   /**
   * Get createdByUserId
   * @return createdByUserId
  **/
  @ApiModelProperty(value = "")
  public String getCreatedByUserId() {
    return createdByUserId;
  }

  public void setCreatedByUserId(String createdByUserId) {
    this.createdByUserId = createdByUserId;
  }

  public EngPrimePolicyApiPolicy deletedAt(OffsetDateTime deletedAt) {
    this.deletedAt = deletedAt;
    return this;
  }

   /**
   * Get deletedAt
   * @return deletedAt
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getDeletedAt() {
    return deletedAt;
  }

  public void setDeletedAt(OffsetDateTime deletedAt) {
    this.deletedAt = deletedAt;
  }

  public EngPrimePolicyApiPolicy isDefault(Boolean isDefault) {
    this.isDefault = isDefault;
    return this;
  }

   /**
   * Get isDefault
   * @return isDefault
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsDefault() {
    return isDefault;
  }

  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EngPrimePolicyApiPolicy engPrimePolicyApiPolicy = (EngPrimePolicyApiPolicy) o;
    return Objects.equals(this.id, engPrimePolicyApiPolicy.id) &&
        Objects.equals(this.type, engPrimePolicyApiPolicy.type) &&
        Objects.equals(this.hierarchy, engPrimePolicyApiPolicy.hierarchy) &&
        Objects.equals(this.rules, engPrimePolicyApiPolicy.rules) &&
        Objects.equals(this.createdAt, engPrimePolicyApiPolicy.createdAt) &&
        Objects.equals(this.createdByUserId, engPrimePolicyApiPolicy.createdByUserId) &&
        Objects.equals(this.deletedAt, engPrimePolicyApiPolicy.deletedAt) &&
        Objects.equals(this.isDefault, engPrimePolicyApiPolicy.isDefault);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, hierarchy, rules, createdAt, createdByUserId, deletedAt, isDefault);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EngPrimePolicyApiPolicy {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    hierarchy: ").append(toIndentedString(hierarchy)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdByUserId: ").append(toIndentedString(createdByUserId)).append("\n");
    sb.append("    deletedAt: ").append(toIndentedString(deletedAt)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
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

