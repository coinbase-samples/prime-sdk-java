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
import io.swagger.client.model.CoinbaseTwsWeb3TransactionMetadataWeb3TransactionAssetTransfer;
import io.swagger.client.model.CoinbaseTwsWeb3TransactionMetadataWeb3TransactionFees;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Field on web3 transactions for specifying transaction amounts.
 */
@ApiModel(description = "Field on web3 transactions for specifying transaction amounts.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-02-22T12:46:00.828-08:00")
public class CoinbaseTwsWeb3TransactionMetadata {
  @SerializedName("fees")
  private CoinbaseTwsWeb3TransactionMetadataWeb3TransactionFees fees = null;

  @SerializedName("transfers")
  private List<CoinbaseTwsWeb3TransactionMetadataWeb3TransactionAssetTransfer> transfers = null;

  public CoinbaseTwsWeb3TransactionMetadata fees(CoinbaseTwsWeb3TransactionMetadataWeb3TransactionFees fees) {
    this.fees = fees;
    return this;
  }

   /**
   * Get fees
   * @return fees
  **/
  @ApiModelProperty(value = "")
  public CoinbaseTwsWeb3TransactionMetadataWeb3TransactionFees getFees() {
    return fees;
  }

  public void setFees(CoinbaseTwsWeb3TransactionMetadataWeb3TransactionFees fees) {
    this.fees = fees;
  }

  public CoinbaseTwsWeb3TransactionMetadata transfers(List<CoinbaseTwsWeb3TransactionMetadataWeb3TransactionAssetTransfer> transfers) {
    this.transfers = transfers;
    return this;
  }

  public CoinbaseTwsWeb3TransactionMetadata addTransfersItem(CoinbaseTwsWeb3TransactionMetadataWeb3TransactionAssetTransfer transfersItem) {
    if (this.transfers == null) {
      this.transfers = new ArrayList<CoinbaseTwsWeb3TransactionMetadataWeb3TransactionAssetTransfer>();
    }
    this.transfers.add(transfersItem);
    return this;
  }

   /**
   * Get transfers
   * @return transfers
  **/
  @ApiModelProperty(value = "")
  public List<CoinbaseTwsWeb3TransactionMetadataWeb3TransactionAssetTransfer> getTransfers() {
    return transfers;
  }

  public void setTransfers(List<CoinbaseTwsWeb3TransactionMetadataWeb3TransactionAssetTransfer> transfers) {
    this.transfers = transfers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoinbaseTwsWeb3TransactionMetadata coinbaseTwsWeb3TransactionMetadata = (CoinbaseTwsWeb3TransactionMetadata) o;
    return Objects.equals(this.fees, coinbaseTwsWeb3TransactionMetadata.fees) &&
        Objects.equals(this.transfers, coinbaseTwsWeb3TransactionMetadata.transfers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fees, transfers);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoinbaseTwsWeb3TransactionMetadata {\n");
    
    sb.append("    fees: ").append(toIndentedString(fees)).append("\n");
    sb.append("    transfers: ").append(toIndentedString(transfers)).append("\n");
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

