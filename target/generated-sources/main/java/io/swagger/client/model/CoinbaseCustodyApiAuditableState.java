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
import io.swagger.client.model.CoinbaseCustodyApiAdminChangeRequestState;
import io.swagger.client.model.CoinbaseCustodyApiApiKeyChangeState;
import io.swagger.client.model.CoinbaseCustodyApiBillingAddressChangeState;
import io.swagger.client.model.CoinbaseCustodyApiBillingPreferenceChangeState;
import io.swagger.client.model.CoinbaseCustodyApiDocumentSignatureState;
import io.swagger.client.model.CoinbaseCustodyApiEmailListChangeState;
import io.swagger.client.model.CoinbaseCustodyApiGovernanceVoteState;
import io.swagger.client.model.CoinbaseCustodyApiInvitationState;
import io.swagger.client.model.CoinbaseCustodyApiPaymentMethodChangeState;
import io.swagger.client.model.CoinbaseCustodyApiRedoPlanState;
import io.swagger.client.model.CoinbaseCustodyApiSettingsChangeState;
import io.swagger.client.model.CoinbaseCustodyApiSmartContractReleaseState;
import io.swagger.client.model.CoinbaseCustodyApiTransactionState;
import io.swagger.client.model.CoinbaseCustodyApiUserChangeRequestState;
import io.swagger.client.model.CoinbaseCustodyApiUserChangeState;
import io.swagger.client.model.CoinbaseCustodyApiWalletChangeState;
import io.swagger.client.model.CoinbaseCustodyApiWithdrawalAddressChangeState;
import java.io.IOException;

/**
 * CoinbaseCustodyApiAuditableState
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-02-22T12:46:00.828-08:00")
public class CoinbaseCustodyApiAuditableState {
  @SerializedName("wallet_change_state")
  private CoinbaseCustodyApiWalletChangeState walletChangeState = null;

  @SerializedName("user_change_state")
  private CoinbaseCustodyApiUserChangeState userChangeState = null;

  @SerializedName("smart_contract_release_state")
  private CoinbaseCustodyApiSmartContractReleaseState smartContractReleaseState = null;

  @SerializedName("settings_change_state")
  private CoinbaseCustodyApiSettingsChangeState settingsChangeState = null;

  @SerializedName("redo_plan_state")
  private CoinbaseCustodyApiRedoPlanState redoPlanState = null;

  @SerializedName("withdrawal_address_change_state")
  private CoinbaseCustodyApiWithdrawalAddressChangeState withdrawalAddressChangeState = null;

  @SerializedName("transaction_state")
  private CoinbaseCustodyApiTransactionState transactionState = null;

  @SerializedName("email_list_change_state")
  private CoinbaseCustodyApiEmailListChangeState emailListChangeState = null;

  @SerializedName("document_signature_state")
  private CoinbaseCustodyApiDocumentSignatureState documentSignatureState = null;

  @SerializedName("billing_preference_change_state")
  private CoinbaseCustodyApiBillingPreferenceChangeState billingPreferenceChangeState = null;

  @SerializedName("billing_address_change_state")
  private CoinbaseCustodyApiBillingAddressChangeState billingAddressChangeState = null;

  @SerializedName("api_key_change_state")
  private CoinbaseCustodyApiApiKeyChangeState apiKeyChangeState = null;

  @SerializedName("admin_change_request_state")
  private CoinbaseCustodyApiAdminChangeRequestState adminChangeRequestState = null;

  @SerializedName("governance_vote_state")
  private CoinbaseCustodyApiGovernanceVoteState governanceVoteState = null;

  @SerializedName("invitation_state")
  private CoinbaseCustodyApiInvitationState invitationState = null;

  @SerializedName("payment_method_change_state")
  private CoinbaseCustodyApiPaymentMethodChangeState paymentMethodChangeState = null;

  @SerializedName("user_change_request_state")
  private CoinbaseCustodyApiUserChangeRequestState userChangeRequestState = null;

  public CoinbaseCustodyApiAuditableState walletChangeState(CoinbaseCustodyApiWalletChangeState walletChangeState) {
    this.walletChangeState = walletChangeState;
    return this;
  }

   /**
   * Get walletChangeState
   * @return walletChangeState
  **/
  @ApiModelProperty(value = "")
  public CoinbaseCustodyApiWalletChangeState getWalletChangeState() {
    return walletChangeState;
  }

  public void setWalletChangeState(CoinbaseCustodyApiWalletChangeState walletChangeState) {
    this.walletChangeState = walletChangeState;
  }

  public CoinbaseCustodyApiAuditableState userChangeState(CoinbaseCustodyApiUserChangeState userChangeState) {
    this.userChangeState = userChangeState;
    return this;
  }

   /**
   * Get userChangeState
   * @return userChangeState
  **/
  @ApiModelProperty(value = "")
  public CoinbaseCustodyApiUserChangeState getUserChangeState() {
    return userChangeState;
  }

  public void setUserChangeState(CoinbaseCustodyApiUserChangeState userChangeState) {
    this.userChangeState = userChangeState;
  }

  public CoinbaseCustodyApiAuditableState smartContractReleaseState(CoinbaseCustodyApiSmartContractReleaseState smartContractReleaseState) {
    this.smartContractReleaseState = smartContractReleaseState;
    return this;
  }

   /**
   * Get smartContractReleaseState
   * @return smartContractReleaseState
  **/
  @ApiModelProperty(value = "")
  public CoinbaseCustodyApiSmartContractReleaseState getSmartContractReleaseState() {
    return smartContractReleaseState;
  }

  public void setSmartContractReleaseState(CoinbaseCustodyApiSmartContractReleaseState smartContractReleaseState) {
    this.smartContractReleaseState = smartContractReleaseState;
  }

  public CoinbaseCustodyApiAuditableState settingsChangeState(CoinbaseCustodyApiSettingsChangeState settingsChangeState) {
    this.settingsChangeState = settingsChangeState;
    return this;
  }

   /**
   * Get settingsChangeState
   * @return settingsChangeState
  **/
  @ApiModelProperty(value = "")
  public CoinbaseCustodyApiSettingsChangeState getSettingsChangeState() {
    return settingsChangeState;
  }

  public void setSettingsChangeState(CoinbaseCustodyApiSettingsChangeState settingsChangeState) {
    this.settingsChangeState = settingsChangeState;
  }

  public CoinbaseCustodyApiAuditableState redoPlanState(CoinbaseCustodyApiRedoPlanState redoPlanState) {
    this.redoPlanState = redoPlanState;
    return this;
  }

   /**
   * Get redoPlanState
   * @return redoPlanState
  **/
  @ApiModelProperty(value = "")
  public CoinbaseCustodyApiRedoPlanState getRedoPlanState() {
    return redoPlanState;
  }

  public void setRedoPlanState(CoinbaseCustodyApiRedoPlanState redoPlanState) {
    this.redoPlanState = redoPlanState;
  }

  public CoinbaseCustodyApiAuditableState withdrawalAddressChangeState(CoinbaseCustodyApiWithdrawalAddressChangeState withdrawalAddressChangeState) {
    this.withdrawalAddressChangeState = withdrawalAddressChangeState;
    return this;
  }

   /**
   * Get withdrawalAddressChangeState
   * @return withdrawalAddressChangeState
  **/
  @ApiModelProperty(value = "")
  public CoinbaseCustodyApiWithdrawalAddressChangeState getWithdrawalAddressChangeState() {
    return withdrawalAddressChangeState;
  }

  public void setWithdrawalAddressChangeState(CoinbaseCustodyApiWithdrawalAddressChangeState withdrawalAddressChangeState) {
    this.withdrawalAddressChangeState = withdrawalAddressChangeState;
  }

  public CoinbaseCustodyApiAuditableState transactionState(CoinbaseCustodyApiTransactionState transactionState) {
    this.transactionState = transactionState;
    return this;
  }

   /**
   * Get transactionState
   * @return transactionState
  **/
  @ApiModelProperty(value = "")
  public CoinbaseCustodyApiTransactionState getTransactionState() {
    return transactionState;
  }

  public void setTransactionState(CoinbaseCustodyApiTransactionState transactionState) {
    this.transactionState = transactionState;
  }

  public CoinbaseCustodyApiAuditableState emailListChangeState(CoinbaseCustodyApiEmailListChangeState emailListChangeState) {
    this.emailListChangeState = emailListChangeState;
    return this;
  }

   /**
   * Get emailListChangeState
   * @return emailListChangeState
  **/
  @ApiModelProperty(value = "")
  public CoinbaseCustodyApiEmailListChangeState getEmailListChangeState() {
    return emailListChangeState;
  }

  public void setEmailListChangeState(CoinbaseCustodyApiEmailListChangeState emailListChangeState) {
    this.emailListChangeState = emailListChangeState;
  }

  public CoinbaseCustodyApiAuditableState documentSignatureState(CoinbaseCustodyApiDocumentSignatureState documentSignatureState) {
    this.documentSignatureState = documentSignatureState;
    return this;
  }

   /**
   * Get documentSignatureState
   * @return documentSignatureState
  **/
  @ApiModelProperty(value = "")
  public CoinbaseCustodyApiDocumentSignatureState getDocumentSignatureState() {
    return documentSignatureState;
  }

  public void setDocumentSignatureState(CoinbaseCustodyApiDocumentSignatureState documentSignatureState) {
    this.documentSignatureState = documentSignatureState;
  }

  public CoinbaseCustodyApiAuditableState billingPreferenceChangeState(CoinbaseCustodyApiBillingPreferenceChangeState billingPreferenceChangeState) {
    this.billingPreferenceChangeState = billingPreferenceChangeState;
    return this;
  }

   /**
   * Get billingPreferenceChangeState
   * @return billingPreferenceChangeState
  **/
  @ApiModelProperty(value = "")
  public CoinbaseCustodyApiBillingPreferenceChangeState getBillingPreferenceChangeState() {
    return billingPreferenceChangeState;
  }

  public void setBillingPreferenceChangeState(CoinbaseCustodyApiBillingPreferenceChangeState billingPreferenceChangeState) {
    this.billingPreferenceChangeState = billingPreferenceChangeState;
  }

  public CoinbaseCustodyApiAuditableState billingAddressChangeState(CoinbaseCustodyApiBillingAddressChangeState billingAddressChangeState) {
    this.billingAddressChangeState = billingAddressChangeState;
    return this;
  }

   /**
   * Get billingAddressChangeState
   * @return billingAddressChangeState
  **/
  @ApiModelProperty(value = "")
  public CoinbaseCustodyApiBillingAddressChangeState getBillingAddressChangeState() {
    return billingAddressChangeState;
  }

  public void setBillingAddressChangeState(CoinbaseCustodyApiBillingAddressChangeState billingAddressChangeState) {
    this.billingAddressChangeState = billingAddressChangeState;
  }

  public CoinbaseCustodyApiAuditableState apiKeyChangeState(CoinbaseCustodyApiApiKeyChangeState apiKeyChangeState) {
    this.apiKeyChangeState = apiKeyChangeState;
    return this;
  }

   /**
   * Get apiKeyChangeState
   * @return apiKeyChangeState
  **/
  @ApiModelProperty(value = "")
  public CoinbaseCustodyApiApiKeyChangeState getApiKeyChangeState() {
    return apiKeyChangeState;
  }

  public void setApiKeyChangeState(CoinbaseCustodyApiApiKeyChangeState apiKeyChangeState) {
    this.apiKeyChangeState = apiKeyChangeState;
  }

  public CoinbaseCustodyApiAuditableState adminChangeRequestState(CoinbaseCustodyApiAdminChangeRequestState adminChangeRequestState) {
    this.adminChangeRequestState = adminChangeRequestState;
    return this;
  }

   /**
   * Get adminChangeRequestState
   * @return adminChangeRequestState
  **/
  @ApiModelProperty(value = "")
  public CoinbaseCustodyApiAdminChangeRequestState getAdminChangeRequestState() {
    return adminChangeRequestState;
  }

  public void setAdminChangeRequestState(CoinbaseCustodyApiAdminChangeRequestState adminChangeRequestState) {
    this.adminChangeRequestState = adminChangeRequestState;
  }

  public CoinbaseCustodyApiAuditableState governanceVoteState(CoinbaseCustodyApiGovernanceVoteState governanceVoteState) {
    this.governanceVoteState = governanceVoteState;
    return this;
  }

   /**
   * Get governanceVoteState
   * @return governanceVoteState
  **/
  @ApiModelProperty(value = "")
  public CoinbaseCustodyApiGovernanceVoteState getGovernanceVoteState() {
    return governanceVoteState;
  }

  public void setGovernanceVoteState(CoinbaseCustodyApiGovernanceVoteState governanceVoteState) {
    this.governanceVoteState = governanceVoteState;
  }

  public CoinbaseCustodyApiAuditableState invitationState(CoinbaseCustodyApiInvitationState invitationState) {
    this.invitationState = invitationState;
    return this;
  }

   /**
   * Get invitationState
   * @return invitationState
  **/
  @ApiModelProperty(value = "")
  public CoinbaseCustodyApiInvitationState getInvitationState() {
    return invitationState;
  }

  public void setInvitationState(CoinbaseCustodyApiInvitationState invitationState) {
    this.invitationState = invitationState;
  }

  public CoinbaseCustodyApiAuditableState paymentMethodChangeState(CoinbaseCustodyApiPaymentMethodChangeState paymentMethodChangeState) {
    this.paymentMethodChangeState = paymentMethodChangeState;
    return this;
  }

   /**
   * Get paymentMethodChangeState
   * @return paymentMethodChangeState
  **/
  @ApiModelProperty(value = "")
  public CoinbaseCustodyApiPaymentMethodChangeState getPaymentMethodChangeState() {
    return paymentMethodChangeState;
  }

  public void setPaymentMethodChangeState(CoinbaseCustodyApiPaymentMethodChangeState paymentMethodChangeState) {
    this.paymentMethodChangeState = paymentMethodChangeState;
  }

  public CoinbaseCustodyApiAuditableState userChangeRequestState(CoinbaseCustodyApiUserChangeRequestState userChangeRequestState) {
    this.userChangeRequestState = userChangeRequestState;
    return this;
  }

   /**
   * Get userChangeRequestState
   * @return userChangeRequestState
  **/
  @ApiModelProperty(value = "")
  public CoinbaseCustodyApiUserChangeRequestState getUserChangeRequestState() {
    return userChangeRequestState;
  }

  public void setUserChangeRequestState(CoinbaseCustodyApiUserChangeRequestState userChangeRequestState) {
    this.userChangeRequestState = userChangeRequestState;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoinbaseCustodyApiAuditableState coinbaseCustodyApiAuditableState = (CoinbaseCustodyApiAuditableState) o;
    return Objects.equals(this.walletChangeState, coinbaseCustodyApiAuditableState.walletChangeState) &&
        Objects.equals(this.userChangeState, coinbaseCustodyApiAuditableState.userChangeState) &&
        Objects.equals(this.smartContractReleaseState, coinbaseCustodyApiAuditableState.smartContractReleaseState) &&
        Objects.equals(this.settingsChangeState, coinbaseCustodyApiAuditableState.settingsChangeState) &&
        Objects.equals(this.redoPlanState, coinbaseCustodyApiAuditableState.redoPlanState) &&
        Objects.equals(this.withdrawalAddressChangeState, coinbaseCustodyApiAuditableState.withdrawalAddressChangeState) &&
        Objects.equals(this.transactionState, coinbaseCustodyApiAuditableState.transactionState) &&
        Objects.equals(this.emailListChangeState, coinbaseCustodyApiAuditableState.emailListChangeState) &&
        Objects.equals(this.documentSignatureState, coinbaseCustodyApiAuditableState.documentSignatureState) &&
        Objects.equals(this.billingPreferenceChangeState, coinbaseCustodyApiAuditableState.billingPreferenceChangeState) &&
        Objects.equals(this.billingAddressChangeState, coinbaseCustodyApiAuditableState.billingAddressChangeState) &&
        Objects.equals(this.apiKeyChangeState, coinbaseCustodyApiAuditableState.apiKeyChangeState) &&
        Objects.equals(this.adminChangeRequestState, coinbaseCustodyApiAuditableState.adminChangeRequestState) &&
        Objects.equals(this.governanceVoteState, coinbaseCustodyApiAuditableState.governanceVoteState) &&
        Objects.equals(this.invitationState, coinbaseCustodyApiAuditableState.invitationState) &&
        Objects.equals(this.paymentMethodChangeState, coinbaseCustodyApiAuditableState.paymentMethodChangeState) &&
        Objects.equals(this.userChangeRequestState, coinbaseCustodyApiAuditableState.userChangeRequestState);
  }

  @Override
  public int hashCode() {
    return Objects.hash(walletChangeState, userChangeState, smartContractReleaseState, settingsChangeState, redoPlanState, withdrawalAddressChangeState, transactionState, emailListChangeState, documentSignatureState, billingPreferenceChangeState, billingAddressChangeState, apiKeyChangeState, adminChangeRequestState, governanceVoteState, invitationState, paymentMethodChangeState, userChangeRequestState);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoinbaseCustodyApiAuditableState {\n");
    
    sb.append("    walletChangeState: ").append(toIndentedString(walletChangeState)).append("\n");
    sb.append("    userChangeState: ").append(toIndentedString(userChangeState)).append("\n");
    sb.append("    smartContractReleaseState: ").append(toIndentedString(smartContractReleaseState)).append("\n");
    sb.append("    settingsChangeState: ").append(toIndentedString(settingsChangeState)).append("\n");
    sb.append("    redoPlanState: ").append(toIndentedString(redoPlanState)).append("\n");
    sb.append("    withdrawalAddressChangeState: ").append(toIndentedString(withdrawalAddressChangeState)).append("\n");
    sb.append("    transactionState: ").append(toIndentedString(transactionState)).append("\n");
    sb.append("    emailListChangeState: ").append(toIndentedString(emailListChangeState)).append("\n");
    sb.append("    documentSignatureState: ").append(toIndentedString(documentSignatureState)).append("\n");
    sb.append("    billingPreferenceChangeState: ").append(toIndentedString(billingPreferenceChangeState)).append("\n");
    sb.append("    billingAddressChangeState: ").append(toIndentedString(billingAddressChangeState)).append("\n");
    sb.append("    apiKeyChangeState: ").append(toIndentedString(apiKeyChangeState)).append("\n");
    sb.append("    adminChangeRequestState: ").append(toIndentedString(adminChangeRequestState)).append("\n");
    sb.append("    governanceVoteState: ").append(toIndentedString(governanceVoteState)).append("\n");
    sb.append("    invitationState: ").append(toIndentedString(invitationState)).append("\n");
    sb.append("    paymentMethodChangeState: ").append(toIndentedString(paymentMethodChangeState)).append("\n");
    sb.append("    userChangeRequestState: ").append(toIndentedString(userChangeRequestState)).append("\n");
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

