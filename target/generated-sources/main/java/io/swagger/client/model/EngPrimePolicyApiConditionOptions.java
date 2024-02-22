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
import java.util.ArrayList;
import java.util.List;

/**
 * ConditionOptions defines the possible options for a condition, ex. name: currency, options: fiat or crypto.
 */
@ApiModel(description = "ConditionOptions defines the possible options for a condition, ex. name: currency, options: fiat or crypto.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-02-22T12:46:00.828-08:00")
public class EngPrimePolicyApiConditionOptions {
  @SerializedName("name")
  private String name = null;

  @SerializedName("options")
  private List<String> options = null;

  public EngPrimePolicyApiConditionOptions name(String name) {
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

  public EngPrimePolicyApiConditionOptions options(List<String> options) {
    this.options = options;
    return this;
  }

  public EngPrimePolicyApiConditionOptions addOptionsItem(String optionsItem) {
    if (this.options == null) {
      this.options = new ArrayList<String>();
    }
    this.options.add(optionsItem);
    return this;
  }

   /**
   * Get options
   * @return options
  **/
  @ApiModelProperty(value = "")
  public List<String> getOptions() {
    return options;
  }

  public void setOptions(List<String> options) {
    this.options = options;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EngPrimePolicyApiConditionOptions engPrimePolicyApiConditionOptions = (EngPrimePolicyApiConditionOptions) o;
    return Objects.equals(this.name, engPrimePolicyApiConditionOptions.name) &&
        Objects.equals(this.options, engPrimePolicyApiConditionOptions.options);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, options);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EngPrimePolicyApiConditionOptions {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
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

