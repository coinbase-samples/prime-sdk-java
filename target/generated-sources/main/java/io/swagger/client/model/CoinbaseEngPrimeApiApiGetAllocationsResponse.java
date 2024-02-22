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
import io.swagger.client.model.CoinbaseEngPrimeApiApiAllocation;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * CoinbaseEngPrimeApiApiGetAllocationsResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-02-22T12:46:00.828-08:00")
public class CoinbaseEngPrimeApiApiGetAllocationsResponse {
  @SerializedName("allocations")
  private List<CoinbaseEngPrimeApiApiAllocation> allocations = new ArrayList<CoinbaseEngPrimeApiApiAllocation>();

  public CoinbaseEngPrimeApiApiGetAllocationsResponse allocations(List<CoinbaseEngPrimeApiApiAllocation> allocations) {
    this.allocations = allocations;
    return this;
  }

  public CoinbaseEngPrimeApiApiGetAllocationsResponse addAllocationsItem(CoinbaseEngPrimeApiApiAllocation allocationsItem) {
    this.allocations.add(allocationsItem);
    return this;
  }

   /**
   * The allocations returned
   * @return allocations
  **/
  @ApiModelProperty(required = true, value = "The allocations returned")
  public List<CoinbaseEngPrimeApiApiAllocation> getAllocations() {
    return allocations;
  }

  public void setAllocations(List<CoinbaseEngPrimeApiApiAllocation> allocations) {
    this.allocations = allocations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoinbaseEngPrimeApiApiGetAllocationsResponse coinbaseEngPrimeApiApiGetAllocationsResponse = (CoinbaseEngPrimeApiApiGetAllocationsResponse) o;
    return Objects.equals(this.allocations, coinbaseEngPrimeApiApiGetAllocationsResponse.allocations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allocations);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoinbaseEngPrimeApiApiGetAllocationsResponse {\n");
    
    sb.append("    allocations: ").append(toIndentedString(allocations)).append("\n");
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

