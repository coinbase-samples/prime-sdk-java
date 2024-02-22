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
import io.swagger.client.model.CoreContractExpiryType;
import io.swagger.client.model.CoreRiskManagementType;
import java.io.IOException;

/**
 * CoinbaseBrokerageProxyCommonFutureProductDetails
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-02-22T12:46:00.828-08:00")
public class CoinbaseBrokerageProxyCommonFutureProductDetails {
  @SerializedName("risk_managed_by")
  private CoreRiskManagementType riskManagedBy = null;

  @SerializedName("contract_expiry_type")
  private CoreContractExpiryType contractExpiryType = null;

  public CoinbaseBrokerageProxyCommonFutureProductDetails riskManagedBy(CoreRiskManagementType riskManagedBy) {
    this.riskManagedBy = riskManagedBy;
    return this;
  }

   /**
   * Get riskManagedBy
   * @return riskManagedBy
  **/
  @ApiModelProperty(value = "")
  public CoreRiskManagementType getRiskManagedBy() {
    return riskManagedBy;
  }

  public void setRiskManagedBy(CoreRiskManagementType riskManagedBy) {
    this.riskManagedBy = riskManagedBy;
  }

  public CoinbaseBrokerageProxyCommonFutureProductDetails contractExpiryType(CoreContractExpiryType contractExpiryType) {
    this.contractExpiryType = contractExpiryType;
    return this;
  }

   /**
   * Get contractExpiryType
   * @return contractExpiryType
  **/
  @ApiModelProperty(value = "")
  public CoreContractExpiryType getContractExpiryType() {
    return contractExpiryType;
  }

  public void setContractExpiryType(CoreContractExpiryType contractExpiryType) {
    this.contractExpiryType = contractExpiryType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoinbaseBrokerageProxyCommonFutureProductDetails coinbaseBrokerageProxyCommonFutureProductDetails = (CoinbaseBrokerageProxyCommonFutureProductDetails) o;
    return Objects.equals(this.riskManagedBy, coinbaseBrokerageProxyCommonFutureProductDetails.riskManagedBy) &&
        Objects.equals(this.contractExpiryType, coinbaseBrokerageProxyCommonFutureProductDetails.contractExpiryType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(riskManagedBy, contractExpiryType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoinbaseBrokerageProxyCommonFutureProductDetails {\n");
    
    sb.append("    riskManagedBy: ").append(toIndentedString(riskManagedBy)).append("\n");
    sb.append("    contractExpiryType: ").append(toIndentedString(contractExpiryType)).append("\n");
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

