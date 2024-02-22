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
import io.swagger.client.model.EngPrimeBillingApiAUCContractFeeTiers;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * EngPrimeBillingApiGetAUCFeeTiersResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-02-22T12:46:00.828-08:00")
public class EngPrimeBillingApiGetAUCFeeTiersResponse {
  @SerializedName("auc_fee_tiers")
  private List<EngPrimeBillingApiAUCContractFeeTiers> aucFeeTiers = null;

  public EngPrimeBillingApiGetAUCFeeTiersResponse aucFeeTiers(List<EngPrimeBillingApiAUCContractFeeTiers> aucFeeTiers) {
    this.aucFeeTiers = aucFeeTiers;
    return this;
  }

  public EngPrimeBillingApiGetAUCFeeTiersResponse addAucFeeTiersItem(EngPrimeBillingApiAUCContractFeeTiers aucFeeTiersItem) {
    if (this.aucFeeTiers == null) {
      this.aucFeeTiers = new ArrayList<EngPrimeBillingApiAUCContractFeeTiers>();
    }
    this.aucFeeTiers.add(aucFeeTiersItem);
    return this;
  }

   /**
   * Get aucFeeTiers
   * @return aucFeeTiers
  **/
  @ApiModelProperty(value = "")
  public List<EngPrimeBillingApiAUCContractFeeTiers> getAucFeeTiers() {
    return aucFeeTiers;
  }

  public void setAucFeeTiers(List<EngPrimeBillingApiAUCContractFeeTiers> aucFeeTiers) {
    this.aucFeeTiers = aucFeeTiers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EngPrimeBillingApiGetAUCFeeTiersResponse engPrimeBillingApiGetAUCFeeTiersResponse = (EngPrimeBillingApiGetAUCFeeTiersResponse) o;
    return Objects.equals(this.aucFeeTiers, engPrimeBillingApiGetAUCFeeTiersResponse.aucFeeTiers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aucFeeTiers);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EngPrimeBillingApiGetAUCFeeTiersResponse {\n");
    
    sb.append("    aucFeeTiers: ").append(toIndentedString(aucFeeTiers)).append("\n");
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

