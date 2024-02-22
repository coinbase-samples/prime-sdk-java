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
import org.threeten.bp.OffsetDateTime;

/**
 * CoinbaseFinancingLoanInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-02-22T12:46:00.828-08:00")
public class CoinbaseFinancingLoanInfo {
  @SerializedName("portfolio_id")
  private String portfolioId = null;

  @SerializedName("symbol")
  private String symbol = null;

  @SerializedName("amount")
  private String amount = null;

  @SerializedName("notional_amount")
  private String notionalAmount = null;

  @SerializedName("due_date")
  private OffsetDateTime dueDate = null;

  @SerializedName("loan_id")
  private String loanId = null;

  public CoinbaseFinancingLoanInfo portfolioId(String portfolioId) {
    this.portfolioId = portfolioId;
    return this;
  }

   /**
   * Get portfolioId
   * @return portfolioId
  **/
  @ApiModelProperty(value = "")
  public String getPortfolioId() {
    return portfolioId;
  }

  public void setPortfolioId(String portfolioId) {
    this.portfolioId = portfolioId;
  }

  public CoinbaseFinancingLoanInfo symbol(String symbol) {
    this.symbol = symbol;
    return this;
  }

   /**
   * Get symbol
   * @return symbol
  **/
  @ApiModelProperty(value = "")
  public String getSymbol() {
    return symbol;
  }

  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  public CoinbaseFinancingLoanInfo amount(String amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(value = "")
  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  public CoinbaseFinancingLoanInfo notionalAmount(String notionalAmount) {
    this.notionalAmount = notionalAmount;
    return this;
  }

   /**
   * Get notionalAmount
   * @return notionalAmount
  **/
  @ApiModelProperty(value = "")
  public String getNotionalAmount() {
    return notionalAmount;
  }

  public void setNotionalAmount(String notionalAmount) {
    this.notionalAmount = notionalAmount;
  }

  public CoinbaseFinancingLoanInfo dueDate(OffsetDateTime dueDate) {
    this.dueDate = dueDate;
    return this;
  }

   /**
   * Get dueDate
   * @return dueDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getDueDate() {
    return dueDate;
  }

  public void setDueDate(OffsetDateTime dueDate) {
    this.dueDate = dueDate;
  }

  public CoinbaseFinancingLoanInfo loanId(String loanId) {
    this.loanId = loanId;
    return this;
  }

   /**
   * Get loanId
   * @return loanId
  **/
  @ApiModelProperty(value = "")
  public String getLoanId() {
    return loanId;
  }

  public void setLoanId(String loanId) {
    this.loanId = loanId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoinbaseFinancingLoanInfo coinbaseFinancingLoanInfo = (CoinbaseFinancingLoanInfo) o;
    return Objects.equals(this.portfolioId, coinbaseFinancingLoanInfo.portfolioId) &&
        Objects.equals(this.symbol, coinbaseFinancingLoanInfo.symbol) &&
        Objects.equals(this.amount, coinbaseFinancingLoanInfo.amount) &&
        Objects.equals(this.notionalAmount, coinbaseFinancingLoanInfo.notionalAmount) &&
        Objects.equals(this.dueDate, coinbaseFinancingLoanInfo.dueDate) &&
        Objects.equals(this.loanId, coinbaseFinancingLoanInfo.loanId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(portfolioId, symbol, amount, notionalAmount, dueDate, loanId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoinbaseFinancingLoanInfo {\n");
    
    sb.append("    portfolioId: ").append(toIndentedString(portfolioId)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    notionalAmount: ").append(toIndentedString(notionalAmount)).append("\n");
    sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
    sb.append("    loanId: ").append(toIndentedString(loanId)).append("\n");
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

