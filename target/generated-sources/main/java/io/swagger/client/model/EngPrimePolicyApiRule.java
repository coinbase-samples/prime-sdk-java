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
import io.swagger.client.model.EngPrimePolicyApiConditionOptions;
import io.swagger.client.model.EngPrimePolicyApiOutcome;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * EngPrimePolicyApiRule
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-02-22T12:46:00.828-08:00")
public class EngPrimePolicyApiRule {
  @SerializedName("id")
  private String id = null;

  @SerializedName("condition_options")
  private List<EngPrimePolicyApiConditionOptions> conditionOptions = null;

  @SerializedName("outcome")
  private EngPrimePolicyApiOutcome outcome = null;

  @SerializedName("name")
  private String name = null;

  public EngPrimePolicyApiRule id(String id) {
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

  public EngPrimePolicyApiRule conditionOptions(List<EngPrimePolicyApiConditionOptions> conditionOptions) {
    this.conditionOptions = conditionOptions;
    return this;
  }

  public EngPrimePolicyApiRule addConditionOptionsItem(EngPrimePolicyApiConditionOptions conditionOptionsItem) {
    if (this.conditionOptions == null) {
      this.conditionOptions = new ArrayList<EngPrimePolicyApiConditionOptions>();
    }
    this.conditionOptions.add(conditionOptionsItem);
    return this;
  }

   /**
   * Get conditionOptions
   * @return conditionOptions
  **/
  @ApiModelProperty(value = "")
  public List<EngPrimePolicyApiConditionOptions> getConditionOptions() {
    return conditionOptions;
  }

  public void setConditionOptions(List<EngPrimePolicyApiConditionOptions> conditionOptions) {
    this.conditionOptions = conditionOptions;
  }

  public EngPrimePolicyApiRule outcome(EngPrimePolicyApiOutcome outcome) {
    this.outcome = outcome;
    return this;
  }

   /**
   * Get outcome
   * @return outcome
  **/
  @ApiModelProperty(value = "")
  public EngPrimePolicyApiOutcome getOutcome() {
    return outcome;
  }

  public void setOutcome(EngPrimePolicyApiOutcome outcome) {
    this.outcome = outcome;
  }

  public EngPrimePolicyApiRule name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EngPrimePolicyApiRule engPrimePolicyApiRule = (EngPrimePolicyApiRule) o;
    return Objects.equals(this.id, engPrimePolicyApiRule.id) &&
        Objects.equals(this.conditionOptions, engPrimePolicyApiRule.conditionOptions) &&
        Objects.equals(this.outcome, engPrimePolicyApiRule.outcome) &&
        Objects.equals(this.name, engPrimePolicyApiRule.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, conditionOptions, outcome, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EngPrimePolicyApiRule {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    conditionOptions: ").append(toIndentedString(conditionOptions)).append("\n");
    sb.append("    outcome: ").append(toIndentedString(outcome)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

