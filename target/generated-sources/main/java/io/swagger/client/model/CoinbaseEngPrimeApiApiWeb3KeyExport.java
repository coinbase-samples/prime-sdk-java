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
import io.swagger.client.model.CoinbaseEngPrimeApiApiWeb3SecurityKey;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * CoinbaseEngPrimeApiApiWeb3KeyExport
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-02-22T12:46:00.828-08:00")
public class CoinbaseEngPrimeApiApiWeb3KeyExport {
  @SerializedName("key_exporter_id")
  private String keyExporterId = null;

  @SerializedName("security_key_ids")
  private List<String> securityKeyIds = null;

  @SerializedName("quorum_threshold")
  private Integer quorumThreshold = null;

  @SerializedName("key_export_operation_name")
  private String keyExportOperationName = null;

  @SerializedName("web3_security_keys")
  private List<CoinbaseEngPrimeApiApiWeb3SecurityKey> web3SecurityKeys = null;

  public CoinbaseEngPrimeApiApiWeb3KeyExport keyExporterId(String keyExporterId) {
    this.keyExporterId = keyExporterId;
    return this;
  }

   /**
   * Get keyExporterId
   * @return keyExporterId
  **/
  @ApiModelProperty(value = "")
  public String getKeyExporterId() {
    return keyExporterId;
  }

  public void setKeyExporterId(String keyExporterId) {
    this.keyExporterId = keyExporterId;
  }

  public CoinbaseEngPrimeApiApiWeb3KeyExport securityKeyIds(List<String> securityKeyIds) {
    this.securityKeyIds = securityKeyIds;
    return this;
  }

  public CoinbaseEngPrimeApiApiWeb3KeyExport addSecurityKeyIdsItem(String securityKeyIdsItem) {
    if (this.securityKeyIds == null) {
      this.securityKeyIds = new ArrayList<String>();
    }
    this.securityKeyIds.add(securityKeyIdsItem);
    return this;
  }

   /**
   * Get securityKeyIds
   * @return securityKeyIds
  **/
  @ApiModelProperty(value = "")
  public List<String> getSecurityKeyIds() {
    return securityKeyIds;
  }

  public void setSecurityKeyIds(List<String> securityKeyIds) {
    this.securityKeyIds = securityKeyIds;
  }

  public CoinbaseEngPrimeApiApiWeb3KeyExport quorumThreshold(Integer quorumThreshold) {
    this.quorumThreshold = quorumThreshold;
    return this;
  }

   /**
   * Get quorumThreshold
   * @return quorumThreshold
  **/
  @ApiModelProperty(value = "")
  public Integer getQuorumThreshold() {
    return quorumThreshold;
  }

  public void setQuorumThreshold(Integer quorumThreshold) {
    this.quorumThreshold = quorumThreshold;
  }

  public CoinbaseEngPrimeApiApiWeb3KeyExport keyExportOperationName(String keyExportOperationName) {
    this.keyExportOperationName = keyExportOperationName;
    return this;
  }

   /**
   * Get keyExportOperationName
   * @return keyExportOperationName
  **/
  @ApiModelProperty(value = "")
  public String getKeyExportOperationName() {
    return keyExportOperationName;
  }

  public void setKeyExportOperationName(String keyExportOperationName) {
    this.keyExportOperationName = keyExportOperationName;
  }

  public CoinbaseEngPrimeApiApiWeb3KeyExport web3SecurityKeys(List<CoinbaseEngPrimeApiApiWeb3SecurityKey> web3SecurityKeys) {
    this.web3SecurityKeys = web3SecurityKeys;
    return this;
  }

  public CoinbaseEngPrimeApiApiWeb3KeyExport addWeb3SecurityKeysItem(CoinbaseEngPrimeApiApiWeb3SecurityKey web3SecurityKeysItem) {
    if (this.web3SecurityKeys == null) {
      this.web3SecurityKeys = new ArrayList<CoinbaseEngPrimeApiApiWeb3SecurityKey>();
    }
    this.web3SecurityKeys.add(web3SecurityKeysItem);
    return this;
  }

   /**
   * Get web3SecurityKeys
   * @return web3SecurityKeys
  **/
  @ApiModelProperty(value = "")
  public List<CoinbaseEngPrimeApiApiWeb3SecurityKey> getWeb3SecurityKeys() {
    return web3SecurityKeys;
  }

  public void setWeb3SecurityKeys(List<CoinbaseEngPrimeApiApiWeb3SecurityKey> web3SecurityKeys) {
    this.web3SecurityKeys = web3SecurityKeys;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoinbaseEngPrimeApiApiWeb3KeyExport coinbaseEngPrimeApiApiWeb3KeyExport = (CoinbaseEngPrimeApiApiWeb3KeyExport) o;
    return Objects.equals(this.keyExporterId, coinbaseEngPrimeApiApiWeb3KeyExport.keyExporterId) &&
        Objects.equals(this.securityKeyIds, coinbaseEngPrimeApiApiWeb3KeyExport.securityKeyIds) &&
        Objects.equals(this.quorumThreshold, coinbaseEngPrimeApiApiWeb3KeyExport.quorumThreshold) &&
        Objects.equals(this.keyExportOperationName, coinbaseEngPrimeApiApiWeb3KeyExport.keyExportOperationName) &&
        Objects.equals(this.web3SecurityKeys, coinbaseEngPrimeApiApiWeb3KeyExport.web3SecurityKeys);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keyExporterId, securityKeyIds, quorumThreshold, keyExportOperationName, web3SecurityKeys);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoinbaseEngPrimeApiApiWeb3KeyExport {\n");
    
    sb.append("    keyExporterId: ").append(toIndentedString(keyExporterId)).append("\n");
    sb.append("    securityKeyIds: ").append(toIndentedString(securityKeyIds)).append("\n");
    sb.append("    quorumThreshold: ").append(toIndentedString(quorumThreshold)).append("\n");
    sb.append("    keyExportOperationName: ").append(toIndentedString(keyExportOperationName)).append("\n");
    sb.append("    web3SecurityKeys: ").append(toIndentedString(web3SecurityKeys)).append("\n");
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

