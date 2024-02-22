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

/**
 * CoinbaseCustodyApiDestinationTag
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-02-22T12:46:00.828-08:00")
public class CoinbaseCustodyApiDestinationTag {
  @SerializedName("destination_tag")
  private String destinationTag = null;

  public CoinbaseCustodyApiDestinationTag destinationTag(String destinationTag) {
    this.destinationTag = destinationTag;
    return this;
  }

   /**
   * Get destinationTag
   * @return destinationTag
  **/
  @ApiModelProperty(value = "")
  public String getDestinationTag() {
    return destinationTag;
  }

  public void setDestinationTag(String destinationTag) {
    this.destinationTag = destinationTag;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoinbaseCustodyApiDestinationTag coinbaseCustodyApiDestinationTag = (CoinbaseCustodyApiDestinationTag) o;
    return Objects.equals(this.destinationTag, coinbaseCustodyApiDestinationTag.destinationTag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destinationTag);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoinbaseCustodyApiDestinationTag {\n");
    
    sb.append("    destinationTag: ").append(toIndentedString(destinationTag)).append("\n");
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

