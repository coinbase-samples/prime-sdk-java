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
import io.swagger.client.model.CoinbaseEngPrimeApiApiWeb3DepositActivityMetadata;
import java.io.IOException;

/**
 * CoinbaseEngPrimeApiApiWeb3DepositActivityDetails
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-02-22T12:46:00.828-08:00")
public class CoinbaseEngPrimeApiApiWeb3DepositActivityDetails {
  @SerializedName("network_name")
  private String networkName = null;

  @SerializedName("transaction_hash")
  private String transactionHash = null;

  @SerializedName("metadata")
  private CoinbaseEngPrimeApiApiWeb3DepositActivityMetadata metadata = null;

  @SerializedName("source_address")
  private String sourceAddress = null;

  @SerializedName("destination_address")
  private String destinationAddress = null;

  @SerializedName("destination_wallet_id")
  private String destinationWalletId = null;

  @SerializedName("chain_id")
  private String chainId = null;

  public CoinbaseEngPrimeApiApiWeb3DepositActivityDetails networkName(String networkName) {
    this.networkName = networkName;
    return this;
  }

   /**
   * Get networkName
   * @return networkName
  **/
  @ApiModelProperty(value = "")
  public String getNetworkName() {
    return networkName;
  }

  public void setNetworkName(String networkName) {
    this.networkName = networkName;
  }

  public CoinbaseEngPrimeApiApiWeb3DepositActivityDetails transactionHash(String transactionHash) {
    this.transactionHash = transactionHash;
    return this;
  }

   /**
   * Get transactionHash
   * @return transactionHash
  **/
  @ApiModelProperty(value = "")
  public String getTransactionHash() {
    return transactionHash;
  }

  public void setTransactionHash(String transactionHash) {
    this.transactionHash = transactionHash;
  }

  public CoinbaseEngPrimeApiApiWeb3DepositActivityDetails metadata(CoinbaseEngPrimeApiApiWeb3DepositActivityMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @ApiModelProperty(value = "")
  public CoinbaseEngPrimeApiApiWeb3DepositActivityMetadata getMetadata() {
    return metadata;
  }

  public void setMetadata(CoinbaseEngPrimeApiApiWeb3DepositActivityMetadata metadata) {
    this.metadata = metadata;
  }

  public CoinbaseEngPrimeApiApiWeb3DepositActivityDetails sourceAddress(String sourceAddress) {
    this.sourceAddress = sourceAddress;
    return this;
  }

   /**
   * Get sourceAddress
   * @return sourceAddress
  **/
  @ApiModelProperty(value = "")
  public String getSourceAddress() {
    return sourceAddress;
  }

  public void setSourceAddress(String sourceAddress) {
    this.sourceAddress = sourceAddress;
  }

  public CoinbaseEngPrimeApiApiWeb3DepositActivityDetails destinationAddress(String destinationAddress) {
    this.destinationAddress = destinationAddress;
    return this;
  }

   /**
   * Get destinationAddress
   * @return destinationAddress
  **/
  @ApiModelProperty(value = "")
  public String getDestinationAddress() {
    return destinationAddress;
  }

  public void setDestinationAddress(String destinationAddress) {
    this.destinationAddress = destinationAddress;
  }

  public CoinbaseEngPrimeApiApiWeb3DepositActivityDetails destinationWalletId(String destinationWalletId) {
    this.destinationWalletId = destinationWalletId;
    return this;
  }

   /**
   * Get destinationWalletId
   * @return destinationWalletId
  **/
  @ApiModelProperty(value = "")
  public String getDestinationWalletId() {
    return destinationWalletId;
  }

  public void setDestinationWalletId(String destinationWalletId) {
    this.destinationWalletId = destinationWalletId;
  }

  public CoinbaseEngPrimeApiApiWeb3DepositActivityDetails chainId(String chainId) {
    this.chainId = chainId;
    return this;
  }

   /**
   * Get chainId
   * @return chainId
  **/
  @ApiModelProperty(value = "")
  public String getChainId() {
    return chainId;
  }

  public void setChainId(String chainId) {
    this.chainId = chainId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoinbaseEngPrimeApiApiWeb3DepositActivityDetails coinbaseEngPrimeApiApiWeb3DepositActivityDetails = (CoinbaseEngPrimeApiApiWeb3DepositActivityDetails) o;
    return Objects.equals(this.networkName, coinbaseEngPrimeApiApiWeb3DepositActivityDetails.networkName) &&
        Objects.equals(this.transactionHash, coinbaseEngPrimeApiApiWeb3DepositActivityDetails.transactionHash) &&
        Objects.equals(this.metadata, coinbaseEngPrimeApiApiWeb3DepositActivityDetails.metadata) &&
        Objects.equals(this.sourceAddress, coinbaseEngPrimeApiApiWeb3DepositActivityDetails.sourceAddress) &&
        Objects.equals(this.destinationAddress, coinbaseEngPrimeApiApiWeb3DepositActivityDetails.destinationAddress) &&
        Objects.equals(this.destinationWalletId, coinbaseEngPrimeApiApiWeb3DepositActivityDetails.destinationWalletId) &&
        Objects.equals(this.chainId, coinbaseEngPrimeApiApiWeb3DepositActivityDetails.chainId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(networkName, transactionHash, metadata, sourceAddress, destinationAddress, destinationWalletId, chainId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoinbaseEngPrimeApiApiWeb3DepositActivityDetails {\n");
    
    sb.append("    networkName: ").append(toIndentedString(networkName)).append("\n");
    sb.append("    transactionHash: ").append(toIndentedString(transactionHash)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    sourceAddress: ").append(toIndentedString(sourceAddress)).append("\n");
    sb.append("    destinationAddress: ").append(toIndentedString(destinationAddress)).append("\n");
    sb.append("    destinationWalletId: ").append(toIndentedString(destinationWalletId)).append("\n");
    sb.append("    chainId: ").append(toIndentedString(chainId)).append("\n");
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

