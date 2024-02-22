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
import io.swagger.client.model.CoinbaseCustodyApiTransferType;
import java.io.IOException;

/**
 * CoinbaseCustodyApiTransferMetadata
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-02-22T12:46:00.828-08:00")
public class CoinbaseCustodyApiTransferMetadata {
  @SerializedName("resolved_name")
  private String resolvedName = null;

  @SerializedName("transfer_type")
  private CoinbaseCustodyApiTransferType transferType = null;

  public CoinbaseCustodyApiTransferMetadata resolvedName(String resolvedName) {
    this.resolvedName = resolvedName;
    return this;
  }

   /**
   * Get resolvedName
   * @return resolvedName
  **/
  @ApiModelProperty(value = "")
  public String getResolvedName() {
    return resolvedName;
  }

  public void setResolvedName(String resolvedName) {
    this.resolvedName = resolvedName;
  }

  public CoinbaseCustodyApiTransferMetadata transferType(CoinbaseCustodyApiTransferType transferType) {
    this.transferType = transferType;
    return this;
  }

   /**
   * Get transferType
   * @return transferType
  **/
  @ApiModelProperty(value = "")
  public CoinbaseCustodyApiTransferType getTransferType() {
    return transferType;
  }

  public void setTransferType(CoinbaseCustodyApiTransferType transferType) {
    this.transferType = transferType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoinbaseCustodyApiTransferMetadata coinbaseCustodyApiTransferMetadata = (CoinbaseCustodyApiTransferMetadata) o;
    return Objects.equals(this.resolvedName, coinbaseCustodyApiTransferMetadata.resolvedName) &&
        Objects.equals(this.transferType, coinbaseCustodyApiTransferMetadata.transferType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resolvedName, transferType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoinbaseCustodyApiTransferMetadata {\n");
    
    sb.append("    resolvedName: ").append(toIndentedString(resolvedName)).append("\n");
    sb.append("    transferType: ").append(toIndentedString(transferType)).append("\n");
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

