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
import io.swagger.client.model.CoinbaseBrokerageProxyCommonJsonPatchOperation;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * CoinbaseBrokerageProxyCommonJsonPatch
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-02-22T12:46:00.828-08:00")
public class CoinbaseBrokerageProxyCommonJsonPatch {
  @SerializedName("operations")
  private List<CoinbaseBrokerageProxyCommonJsonPatchOperation> operations = new ArrayList<CoinbaseBrokerageProxyCommonJsonPatchOperation>();

  public CoinbaseBrokerageProxyCommonJsonPatch operations(List<CoinbaseBrokerageProxyCommonJsonPatchOperation> operations) {
    this.operations = operations;
    return this;
  }

  public CoinbaseBrokerageProxyCommonJsonPatch addOperationsItem(CoinbaseBrokerageProxyCommonJsonPatchOperation operationsItem) {
    this.operations.add(operationsItem);
    return this;
  }

   /**
   * Get operations
   * @return operations
  **/
  @ApiModelProperty(required = true, value = "")
  public List<CoinbaseBrokerageProxyCommonJsonPatchOperation> getOperations() {
    return operations;
  }

  public void setOperations(List<CoinbaseBrokerageProxyCommonJsonPatchOperation> operations) {
    this.operations = operations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoinbaseBrokerageProxyCommonJsonPatch coinbaseBrokerageProxyCommonJsonPatch = (CoinbaseBrokerageProxyCommonJsonPatch) o;
    return Objects.equals(this.operations, coinbaseBrokerageProxyCommonJsonPatch.operations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operations);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoinbaseBrokerageProxyCommonJsonPatch {\n");
    
    sb.append("    operations: ").append(toIndentedString(operations)).append("\n");
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

