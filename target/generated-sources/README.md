# swagger-java-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-java-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-java-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.PrimeApiApi;

import java.io.File;
import java.util.*;

public class PrimeApiApiExample {

    public static void main(String[] args) {
        
        PrimeApiApi apiInstance = new PrimeApiApi();
        String userId = "userId_example"; // String | 
        CoinbaseEngPrimeApiApiBulkUserRolesUpdateRequest body = new CoinbaseEngPrimeApiApiBulkUserRolesUpdateRequest(); // CoinbaseEngPrimeApiApiBulkUserRolesUpdateRequest | 
        try {
            CoinbaseEngPrimeApiApiBulkUserRolesUpdateResponse result = apiInstance.primeAPIBulkUserRolesUpdate(userId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PrimeApiApi#primeAPIBulkUserRolesUpdate");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://localhost*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*PrimeApiApi* | [**primeAPIBulkUserRolesUpdate**](docs/PrimeApiApi.md#primeAPIBulkUserRolesUpdate) | **POST** /v1/users/{user_id}/roles/update | 
*PrimeApiApi* | [**primeAPICancelTransaction**](docs/PrimeApiApi.md#primeAPICancelTransaction) | **POST** /v1/portfolios/{portfolio_id}/transactions/cancel | 
*PrimeApiApi* | [**primeAPICreateOrUpdatePreference**](docs/PrimeApiApi.md#primeAPICreateOrUpdatePreference) | **POST** /v1/vehicles/{vehicle_id}/preferences | 
*PrimeApiApi* | [**primeAPICreateOrderFillsDocument**](docs/PrimeApiApi.md#primeAPICreateOrderFillsDocument) | **POST** /v1/portfolios/{portfolio_id}/orders/{order_id}/documents | 
*PrimeApiApi* | [**primeAPICreateTestTransaction**](docs/PrimeApiApi.md#primeAPICreateTestTransaction) | **POST** /v1/portfolios/{portfolio_id}/test_transaction | 
*PrimeApiApi* | [**primeAPICreateTransaction**](docs/PrimeApiApi.md#primeAPICreateTransaction) | **POST** /v1/portfolios/{portfolio_id}/transactions | 
*PrimeApiApi* | [**primeAPICreateTransactionV2**](docs/PrimeApiApi.md#primeAPICreateTransactionV2) | **POST** /v2/portfolios/{portfolio_id}/transactions | 
*PrimeApiApi* | [**primeAPICreateVideoUpload**](docs/PrimeApiApi.md#primeAPICreateVideoUpload) | **POST** /v1/video_uploads/create | 
*PrimeApiApi* | [**primeAPICreateWallet**](docs/PrimeApiApi.md#primeAPICreateWallet) | **POST** /v1/portfolios/{portfolio_id}/wallets | 
*PrimeApiApi* | [**primeAPICreateWalletV2**](docs/PrimeApiApi.md#primeAPICreateWalletV2) | **POST** /v2/portfolios/{portfolio_id}/wallets | 
*PrimeApiApi* | [**primeAPICreateWeb3Action**](docs/PrimeApiApi.md#primeAPICreateWeb3Action) | **POST** /v2/portfolios/{portfolio_id}/web3_actions | 
*PrimeApiApi* | [**primeAPIDeleteAddressBookEntry**](docs/PrimeApiApi.md#primeAPIDeleteAddressBookEntry) | **POST** /v1/portfolios/{portfolio_id}/addressbook/{address_entry_id} | 
*PrimeApiApi* | [**primeAPIDeletePaymentMethod**](docs/PrimeApiApi.md#primeAPIDeletePaymentMethod) | **POST** /v1/vehicles/{vehicle_id}/payment_methods/{payment_method_id} | 
*PrimeApiApi* | [**primeAPIDismissNotification**](docs/PrimeApiApi.md#primeAPIDismissNotification) | **POST** /v1/notifications/dismiss | 
*PrimeApiApi* | [**primeAPIDownloadActivityReport**](docs/PrimeApiApi.md#primeAPIDownloadActivityReport) | **GET** /v1/portfolios/{portfolio_id}/activity_report | 
*PrimeApiApi* | [**primeAPIEnrollInStablecoinRewards**](docs/PrimeApiApi.md#primeAPIEnrollInStablecoinRewards) | **POST** /v1/vehicles/{vehicle_id}/stablecoin_rewards/{currency}/enroll | 
*PrimeApiApi* | [**primeAPIFetchInviteeAccessByEmail**](docs/PrimeApiApi.md#primeAPIFetchInviteeAccessByEmail) | **POST** /v1/users/invitee_access | 
*PrimeApiApi* | [**primeAPIFinishVideoUpload**](docs/PrimeApiApi.md#primeAPIFinishVideoUpload) | **POST** /v1/video_uploads/{upload_id}/finish | 
*PrimeApiApi* | [**primeAPIGenerateDALReport**](docs/PrimeApiApi.md#primeAPIGenerateDALReport) | **GET** /v1/reporting_center/{vehicle_id}/generate/dal | 
*PrimeApiApi* | [**primeAPIGenerateFinancingReport**](docs/PrimeApiApi.md#primeAPIGenerateFinancingReport) | **GET** /v1/reporting_center/{vehicle_id}/generate/financing | 
*PrimeApiApi* | [**primeAPIGenerateReportingCenterDocument**](docs/PrimeApiApi.md#primeAPIGenerateReportingCenterDocument) | **GET** /v1/reporting_center/document/generate | 
*PrimeApiApi* | [**primeAPIGenerateStatement**](docs/PrimeApiApi.md#primeAPIGenerateStatement) | **GET** /v1/vehicles/{vehicle_id}/range_statement | 
*PrimeApiApi* | [**primeAPIGenerateWeb3Report**](docs/PrimeApiApi.md#primeAPIGenerateWeb3Report) | **GET** /v1/reporting_center/{portfolio_id}/generate/web3 | 
*PrimeApiApi* | [**primeAPIGetAPIKey**](docs/PrimeApiApi.md#primeAPIGetAPIKey) | **GET** /v1/portfolios/{portfolio_id}/api-key/{access_key} | 
*PrimeApiApi* | [**primeAPIGetAPIKeyCount**](docs/PrimeApiApi.md#primeAPIGetAPIKeyCount) | **GET** /v1/portfolios/{portfolio_id}/api-key-count | 
*PrimeApiApi* | [**primeAPIGetAPIKeyCountV2**](docs/PrimeApiApi.md#primeAPIGetAPIKeyCountV2) | **GET** /v2/groups/{group_id}/api-key-count | 
*PrimeApiApi* | [**primeAPIGetAPIKeyV2**](docs/PrimeApiApi.md#primeAPIGetAPIKeyV2) | **GET** /v2/groups/{group_id}/api-key/{access_key} | 
*PrimeApiApi* | [**primeAPIGetAPIKeys**](docs/PrimeApiApi.md#primeAPIGetAPIKeys) | **GET** /v1/portfolios/{portfolio_id}/api-key | 
*PrimeApiApi* | [**primeAPIGetAPIKeysV2**](docs/PrimeApiApi.md#primeAPIGetAPIKeysV2) | **GET** /v2/groups/{group_id}/api-key | 
*PrimeApiApi* | [**primeAPIGetAUCFeeTiers**](docs/PrimeApiApi.md#primeAPIGetAUCFeeTiers) | **GET** /v1/portfolios/{portfolio_id}/auc_tiers | 
*PrimeApiApi* | [**primeAPIGetActivityFilters**](docs/PrimeApiApi.md#primeAPIGetActivityFilters) | **GET** /v1/portfolios/{portfolio_id}/activity_filters | 
*PrimeApiApi* | [**primeAPIGetAddressBook**](docs/PrimeApiApi.md#primeAPIGetAddressBook) | **GET** /v1/portfolios/{portfolio_id}/addressbook | 
*PrimeApiApi* | [**primeAPIGetAllLocateByPortfolio**](docs/PrimeApiApi.md#primeAPIGetAllLocateByPortfolio) | **GET** /v1/vehicles/{entity_id}/portfolios/{portfolio_id}/pm/locates | 
*PrimeApiApi* | [**primeAPIGetAllocationByOrder**](docs/PrimeApiApi.md#primeAPIGetAllocationByOrder) | **GET** /v1/portfolios/{portfolio_id}/allocation/order/{order_id} | 
*PrimeApiApi* | [**primeAPIGetAllocationLeg**](docs/PrimeApiApi.md#primeAPIGetAllocationLeg) | **GET** /v1/portfolios/{portfolio_id}/allocation/{allocation_leg_id} | 
*PrimeApiApi* | [**primeAPIGetAllocations**](docs/PrimeApiApi.md#primeAPIGetAllocations) | **GET** /v1/portfolios/{portfolio_id}/allocations | 
*PrimeApiApi* | [**primeAPIGetBalances**](docs/PrimeApiApi.md#primeAPIGetBalances) | **GET** /v1/balances | 
*PrimeApiApi* | [**primeAPIGetBillingEmailList**](docs/PrimeApiApi.md#primeAPIGetBillingEmailList) | **GET** /v1/vehicles/{vehicle_id}/email_list | 
*PrimeApiApi* | [**primeAPIGetBillingPreference**](docs/PrimeApiApi.md#primeAPIGetBillingPreference) | **GET** /v1/vehicles/{vehicle_id}/billing_preference | 
*PrimeApiApi* | [**primeAPIGetCandles**](docs/PrimeApiApi.md#primeAPIGetCandles) | **GET** /v1/products/{product_id}/candles | 
*PrimeApiApi* | [**primeAPIGetCandlesStream**](docs/PrimeApiApi.md#primeAPIGetCandlesStream) | **GET** /v1/stream/products/{product_id}/candles | 
*PrimeApiApi* | [**primeAPIGetConfig**](docs/PrimeApiApi.md#primeAPIGetConfig) | **GET** /v1/configs/{name} | 
*PrimeApiApi* | [**primeAPIGetConversionSummaries**](docs/PrimeApiApi.md#primeAPIGetConversionSummaries) | **GET** /v1/vehicles/{vehicle_id}/margin_reports | 
*PrimeApiApi* | [**primeAPIGetConversionSummariesV2**](docs/PrimeApiApi.md#primeAPIGetConversionSummariesV2) | **GET** /v2/vehicles/{vehicle_id}/conversion_summaries | 
*PrimeApiApi* | [**primeAPIGetCounterparty**](docs/PrimeApiApi.md#primeAPIGetCounterparty) | **GET** /v1/portfolios/{portfolio_id}/counterparties | 
*PrimeApiApi* | [**primeAPIGetCurrenciesInfo**](docs/PrimeApiApi.md#primeAPIGetCurrenciesInfo) | **GET** /v1/currencies | 
*PrimeApiApi* | [**primeAPIGetCurrentLocates**](docs/PrimeApiApi.md#primeAPIGetCurrentLocates) | **GET** /v1/vehicles/{entity_id}/pm/locates | 
*PrimeApiApi* | [**primeAPIGetDalCollateralSnapshots**](docs/PrimeApiApi.md#primeAPIGetDalCollateralSnapshots) | **GET** /v1/vehicles/{entity_id}/dal_collateral_snapshots | 
*PrimeApiApi* | [**primeAPIGetDepositInstructions**](docs/PrimeApiApi.md#primeAPIGetDepositInstructions) | **GET** /v1/portfolios/{portfolio_id}/wallets/{wallet_id}/deposit_instructions | 
*PrimeApiApi* | [**primeAPIGetDepthStream**](docs/PrimeApiApi.md#primeAPIGetDepthStream) | **GET** /v1/stream/products/{product_id}/depth | 
*PrimeApiApi* | [**primeAPIGetDeviceGroup**](docs/PrimeApiApi.md#primeAPIGetDeviceGroup) | **GET** /v1/portfolios/{portfolio_id}/device_group | 
*PrimeApiApi* | [**primeAPIGetDocument**](docs/PrimeApiApi.md#primeAPIGetDocument) | **GET** /v1/vehicles/{vehicle_id}/documents/{document_key} | 
*PrimeApiApi* | [**primeAPIGetDocumentDownloadLinks**](docs/PrimeApiApi.md#primeAPIGetDocumentDownloadLinks) | **GET** /v1/reporting_center/document/{document_id}/download | 
*PrimeApiApi* | [**primeAPIGetDocumentSignatureStatus**](docs/PrimeApiApi.md#primeAPIGetDocumentSignatureStatus) | **GET** /v1/vehicles/{vehicle_id}/documents/{document_key}/status | 
*PrimeApiApi* | [**primeAPIGetEntitySettings**](docs/PrimeApiApi.md#primeAPIGetEntitySettings) | **GET** /v1/entities/{entity_id}/settings | 
*PrimeApiApi* | [**primeAPIGetEvaluationResult**](docs/PrimeApiApi.md#primeAPIGetEvaluationResult) | **GET** /v1/portfolios/{portfolio_id}/policies/evaluation | 
*PrimeApiApi* | [**primeAPIGetExchangeRate**](docs/PrimeApiApi.md#primeAPIGetExchangeRate) | **GET** /v1/portfolios/{portfolio_id}/source_currency/{source_currency_symbol}/destination_currency/{destination_currency_symbol}/exchange_rate | 
*PrimeApiApi* | [**primeAPIGetFidoRegistration**](docs/PrimeApiApi.md#primeAPIGetFidoRegistration) | **GET** /v1/users/{user_id}/fido/register | 
*PrimeApiApi* | [**primeAPIGetFinancingProductPermisions**](docs/PrimeApiApi.md#primeAPIGetFinancingProductPermisions) | **GET** /v1/vehicles/{vehicle_id}/financing_product_permissions | 
*PrimeApiApi* | [**primeAPIGetGovernanceStatus**](docs/PrimeApiApi.md#primeAPIGetGovernanceStatus) | **GET** /v1/portfolios/{portfolio_id}/wallets/{wallet_id}/governance/status | 
*PrimeApiApi* | [**primeAPIGetGovernanceTopic**](docs/PrimeApiApi.md#primeAPIGetGovernanceTopic) | **GET** /v1/vehicles/{vehicle_id}/{currency_symbol}/topics/{topic_id} | 
*PrimeApiApi* | [**primeAPIGetGovernanceTopics**](docs/PrimeApiApi.md#primeAPIGetGovernanceTopics) | **GET** /v1/vehicles/{vehicle_id}/{currency_symbol}/topics | 
*PrimeApiApi* | [**primeAPIGetGovernanceVotes**](docs/PrimeApiApi.md#primeAPIGetGovernanceVotes) | **GET** /v1/portfolios/{portfolio_id}/wallets/{wallet_id}/governance/votes | 
*PrimeApiApi* | [**primeAPIGetGovernanceVotingWeights**](docs/PrimeApiApi.md#primeAPIGetGovernanceVotingWeights) | **GET** /v1/wallets/{wallet_id}/voting_weights | 
*PrimeApiApi* | [**primeAPIGetIVPortfolioBalances**](docs/PrimeApiApi.md#primeAPIGetIVPortfolioBalances) | **GET** /v1/vehicles/{vehicle_id}/portfolios/balances | 
*PrimeApiApi* | [**primeAPIGetIVRestrictions**](docs/PrimeApiApi.md#primeAPIGetIVRestrictions) | **GET** /v1/vehicles/{vehicle_id}/restrictions | 
*PrimeApiApi* | [**primeAPIGetIntrospect**](docs/PrimeApiApi.md#primeAPIGetIntrospect) | **GET** /v1/sessions/introspect | 
*PrimeApiApi* | [**primeAPIGetInvestmentVehicle**](docs/PrimeApiApi.md#primeAPIGetInvestmentVehicle) | **GET** /v1/portfolios/{portfolio_id}/investmentVehicle | 
*PrimeApiApi* | [**primeAPIGetInvestmentVehiclePortfolios**](docs/PrimeApiApi.md#primeAPIGetInvestmentVehiclePortfolios) | **GET** /v1/users/{user_id}/investment_vehicle_portfolios | 
*PrimeApiApi* | [**primeAPIGetInvoiceDownloadLink**](docs/PrimeApiApi.md#primeAPIGetInvoiceDownloadLink) | **GET** /v1/vehicles/{vehicle_id}/invoices/{uuid}/download | 
*PrimeApiApi* | [**primeAPIGetInvoices**](docs/PrimeApiApi.md#primeAPIGetInvoices) | **GET** /v1/vehicles/{vehicle_id}/invoices | 
*PrimeApiApi* | [**primeAPIGetInvoicesRemainingBalance**](docs/PrimeApiApi.md#primeAPIGetInvoicesRemainingBalance) | **GET** /v1/vehicles/{vehicle_id}/invoices_balance | 
*PrimeApiApi* | [**primeAPIGetIvDomicileCategory**](docs/PrimeApiApi.md#primeAPIGetIvDomicileCategory) | **POST** /v1/vehicles/{vehicle_id}/domicile_category | 
*PrimeApiApi* | [**primeAPIGetLadderStream**](docs/PrimeApiApi.md#primeAPIGetLadderStream) | **GET** /v1/stream/products/{product_id}/ladder | 
*PrimeApiApi* | [**primeAPIGetLatestTestTransaction**](docs/PrimeApiApi.md#primeAPIGetLatestTestTransaction) | **POST** /v1/portfolios/{portfolio_id}/test_transaction/status | 
*PrimeApiApi* | [**primeAPIGetLlCRollout**](docs/PrimeApiApi.md#primeAPIGetLlCRollout) | **GET** /v1/get_llc_rollout | 
*PrimeApiApi* | [**primeAPIGetLocateAssets**](docs/PrimeApiApi.md#primeAPIGetLocateAssets) | **GET** /v1/vehicles/{entity_id}/pm/locates/assets | 
*PrimeApiApi* | [**primeAPIGetMarketTradesStream**](docs/PrimeApiApi.md#primeAPIGetMarketTradesStream) | **GET** /v1/stream/products/{product_id}/trades | 
*PrimeApiApi* | [**primeAPIGetNotificationPreferencesForChannel**](docs/PrimeApiApi.md#primeAPIGetNotificationPreferencesForChannel) | **GET** /v1/notification_preferences/{user_id} | 
*PrimeApiApi* | [**primeAPIGetNotifications**](docs/PrimeApiApi.md#primeAPIGetNotifications) | **GET** /v1/notifications | 
*PrimeApiApi* | [**primeAPIGetOrder**](docs/PrimeApiApi.md#primeAPIGetOrder) | **GET** /v1/orders/{order_id} | 
*PrimeApiApi* | [**primeAPIGetOrderSimulationStream**](docs/PrimeApiApi.md#primeAPIGetOrderSimulationStream) | **GET** /v1/stream/products/{product_id}/order_simulation | 
*PrimeApiApi* | [**primeAPIGetOrdersStream**](docs/PrimeApiApi.md#primeAPIGetOrdersStream) | **GET** /v1/stream/orders | 
*PrimeApiApi* | [**primeAPIGetOrganization**](docs/PrimeApiApi.md#primeAPIGetOrganization) | **GET** /v1/vehicles/{vehicle_id}/organization | 
*PrimeApiApi* | [**primeAPIGetPendingConsensus**](docs/PrimeApiApi.md#primeAPIGetPendingConsensus) | **GET** /v1/users/{user_id}/entities/{entity_id}/pending_consensus | 
*PrimeApiApi* | [**primeAPIGetPortfolio**](docs/PrimeApiApi.md#primeAPIGetPortfolio) | **GET** /v1/portfolios/{portfolio_id}/portfolio | 
*PrimeApiApi* | [**primeAPIGetPortfolioActivities**](docs/PrimeApiApi.md#primeAPIGetPortfolioActivities) | **GET** /v1/portfolios/{portfolio_id}/activities | 
*PrimeApiApi* | [**primeAPIGetPortfolioActivitiesStream**](docs/PrimeApiApi.md#primeAPIGetPortfolioActivitiesStream) | **GET** /v1/stream/portfolios/{portfolio_id}/activities | 
*PrimeApiApi* | [**primeAPIGetPortfolioActivity**](docs/PrimeApiApi.md#primeAPIGetPortfolioActivity) | **GET** /v1/portfolios/{portfolio_id}/activities/{activity_id} | 
*PrimeApiApi* | [**primeAPIGetPortfolioActivityStream**](docs/PrimeApiApi.md#primeAPIGetPortfolioActivityStream) | **GET** /v1/stream/portfolios/{portfolio_id}/activities/{activity_id} | 
*PrimeApiApi* | [**primeAPIGetPortfolioBalances**](docs/PrimeApiApi.md#primeAPIGetPortfolioBalances) | **GET** /v1/portfolios/{portfolio_id}/balances | 
*PrimeApiApi* | [**primeAPIGetPortfolioBalancesStream**](docs/PrimeApiApi.md#primeAPIGetPortfolioBalancesStream) | **GET** /v1/stream/portfolios/{portfolio_id}/balances | 
*PrimeApiApi* | [**primeAPIGetPortfolioCommission**](docs/PrimeApiApi.md#primeAPIGetPortfolioCommission) | **GET** /v1/portfolios/{portfolio_id}/commission | 
*PrimeApiApi* | [**primeAPIGetPortfolioConciseUsers**](docs/PrimeApiApi.md#primeAPIGetPortfolioConciseUsers) | **GET** /v1/portfolios/{portfolio_id}/users/concise | 
*PrimeApiApi* | [**primeAPIGetPortfolioFeeInfo**](docs/PrimeApiApi.md#primeAPIGetPortfolioFeeInfo) | **GET** /v1/portfolios/{portfolio_id}/fees | 
*PrimeApiApi* | [**primeAPIGetPortfolioFinancingProductPermissions**](docs/PrimeApiApi.md#primeAPIGetPortfolioFinancingProductPermissions) | **GET** /v1/portfolio/{portfolio_id}/financing_product_permissions | 
*PrimeApiApi* | [**primeAPIGetPortfolioFinancingProductStream**](docs/PrimeApiApi.md#primeAPIGetPortfolioFinancingProductStream) | **GET** /v1/stream/portfolios/{portfolio_id}/products/{product_id}/financing | 
*PrimeApiApi* | [**primeAPIGetPortfolioFinancingStream**](docs/PrimeApiApi.md#primeAPIGetPortfolioFinancingStream) | **GET** /v1/stream/portfolios/{portfolio_id}/financing | 
*PrimeApiApi* | [**primeAPIGetPortfolioInvitations**](docs/PrimeApiApi.md#primeAPIGetPortfolioInvitations) | **GET** /v1/portfolios/{portfolio_id}/invitations | 
*PrimeApiApi* | [**primeAPIGetPortfolioSettings**](docs/PrimeApiApi.md#primeAPIGetPortfolioSettings) | **GET** /v1/portfolios/{portfolio_id}/settings | 
*PrimeApiApi* | [**primeAPIGetPortfolioUsers**](docs/PrimeApiApi.md#primeAPIGetPortfolioUsers) | **GET** /v1/portfolios/{portfolio_id}/users | 
*PrimeApiApi* | [**primeAPIGetPortfolioWalletsBalances**](docs/PrimeApiApi.md#primeAPIGetPortfolioWalletsBalances) | **GET** /v1/portfolios/{portfolio_id}/wallets/balances/{currency_symbol} | 
*PrimeApiApi* | [**primeAPIGetPortfolioWalletsBalancesStream**](docs/PrimeApiApi.md#primeAPIGetPortfolioWalletsBalancesStream) | **GET** /v1/stream/portfolios/{portfolio_id}/wallets/balances/{currency_symbol} | 
*PrimeApiApi* | [**primeAPIGetPortfoliosFinancingProductPermissions**](docs/PrimeApiApi.md#primeAPIGetPortfoliosFinancingProductPermissions) | **GET** /v1/vehicles/{vehicle_id}/portfolio/financing_product_permissions | 
*PrimeApiApi* | [**primeAPIGetPostTradeCredit**](docs/PrimeApiApi.md#primeAPIGetPostTradeCredit) | **GET** /v1/portfolios/{portfolio_id}/credit | 
*PrimeApiApi* | [**primeAPIGetPreference**](docs/PrimeApiApi.md#primeAPIGetPreference) | **GET** /v1/vehicles/{vehicle_id}/preferences | 
*PrimeApiApi* | [**primeAPIGetPrimeActivities**](docs/PrimeApiApi.md#primeAPIGetPrimeActivities) | **GET** /v1/portfolios/{portfolio_id}/prime_activities | 
*PrimeApiApi* | [**primeAPIGetPrimeActivitiesStream**](docs/PrimeApiApi.md#primeAPIGetPrimeActivitiesStream) | **GET** /v1/stream/portfolios/{portfolio_id}/prime_activities | 
*PrimeApiApi* | [**primeAPIGetPrimeActivityConsensusAudit**](docs/PrimeApiApi.md#primeAPIGetPrimeActivityConsensusAudit) | **GET** /v1/portfolios/{portfolio_id}/activities/{activity_id}/consensus_audit | 
*PrimeApiApi* | [**primeAPIGetPrimeActivityDetails**](docs/PrimeApiApi.md#primeAPIGetPrimeActivityDetails) | **GET** /v1/portfolios/{portfolio_id}/activities/{activity_id}/activity_details | 
*PrimeApiApi* | [**primeAPIGetPrimeActivityDetailsStream**](docs/PrimeApiApi.md#primeAPIGetPrimeActivityDetailsStream) | **GET** /v1/stream/portfolios/{portfolio_id}/activities/{activity_id}/activity_details | 
*PrimeApiApi* | [**primeAPIGetPrimeActivityDetailsStreamV2**](docs/PrimeApiApi.md#primeAPIGetPrimeActivityDetailsStreamV2) | **GET** /v2/stream/portfolios/{portfolio_id}/activities/{activity_id}/activity_details | 
*PrimeApiApi* | [**primeAPIGetPrimeActivityDetailsV2**](docs/PrimeApiApi.md#primeAPIGetPrimeActivityDetailsV2) | **GET** /v2/portfolios/{portfolio_id}/activities/{activity_id}/activity_details | 
*PrimeApiApi* | [**primeAPIGetPrimeActivityFilters**](docs/PrimeApiApi.md#primeAPIGetPrimeActivityFilters) | **GET** /v1/portfolios/{portfolio_id}/prime_activity_filters | 
*PrimeApiApi* | [**primeAPIGetPrimeInvoices**](docs/PrimeApiApi.md#primeAPIGetPrimeInvoices) | **GET** /v1/vehicles/{vehicle_id}/invoices/prime | 
*PrimeApiApi* | [**primeAPIGetProductStats**](docs/PrimeApiApi.md#primeAPIGetProductStats) | **GET** /v1/products/{product_id}/stats | 
*PrimeApiApi* | [**primeAPIGetProductStatsStream**](docs/PrimeApiApi.md#primeAPIGetProductStatsStream) | **GET** /v1/stream/products/{product_id}/stats | 
*PrimeApiApi* | [**primeAPIGetProducts**](docs/PrimeApiApi.md#primeAPIGetProducts) | **GET** /v1/products | 
*PrimeApiApi* | [**primeAPIGetProductsStream**](docs/PrimeApiApi.md#primeAPIGetProductsStream) | **GET** /v1/stream/products | 
*PrimeApiApi* | [**primeAPIGetRateCard**](docs/PrimeApiApi.md#primeAPIGetRateCard) | **GET** /v1/{currency}/rate_cards | 
*PrimeApiApi* | [**primeAPIGetReportingCenterDownloadLink**](docs/PrimeApiApi.md#primeAPIGetReportingCenterDownloadLink) | **GET** /v1/reporting_center/{portfolio_id}/download | 
*PrimeApiApi* | [**primeAPIGetReportingCenterFilters**](docs/PrimeApiApi.md#primeAPIGetReportingCenterFilters) | **GET** /v1/reporting_center/{vehicle_id}/filters | 
*PrimeApiApi* | [**primeAPIGetReportingDocumentByOrderId**](docs/PrimeApiApi.md#primeAPIGetReportingDocumentByOrderId) | **GET** /v1/portfolios/{portfolio_id}/orders/{order_id}/documents | 
*PrimeApiApi* | [**primeAPIGetReverseAllocation**](docs/PrimeApiApi.md#primeAPIGetReverseAllocation) | **GET** /v1/portfolios/{portfolio_id}/allocation/{allocation_id}/reverse | 
*PrimeApiApi* | [**primeAPIGetSignedDocument**](docs/PrimeApiApi.md#primeAPIGetSignedDocument) | **GET** /v1/vehicles/{vehicle_id}/documents/signed/{document_key} | 
*PrimeApiApi* | [**primeAPIGetStablecoinRewardsEarnings**](docs/PrimeApiApi.md#primeAPIGetStablecoinRewardsEarnings) | **GET** /v1/vehicles/{vehicle_id}/portfolios/{portfolio_id}/stablecoin_rewards/{currency}/earnings | 
*PrimeApiApi* | [**primeAPIGetStablecoinRewardsEnrollment**](docs/PrimeApiApi.md#primeAPIGetStablecoinRewardsEnrollment) | **GET** /v1/vehicles/{vehicle_id}/stablecoin_rewards/{currency}/enrollment | 
*PrimeApiApi* | [**primeAPIGetStakeTimeEstimation**](docs/PrimeApiApi.md#primeAPIGetStakeTimeEstimation) | **GET** /v1/portfolios/{portfolio_id}/{currency_symbol}/stake_time_estimation | 
*PrimeApiApi* | [**primeAPIGetStakingActivityDetails**](docs/PrimeApiApi.md#primeAPIGetStakingActivityDetails) | **GET** /v1/portfolios/{portfolio_id}/activities/{activity_id}/staking_activity_details | 
*PrimeApiApi* | [**primeAPIGetStatement**](docs/PrimeApiApi.md#primeAPIGetStatement) | **GET** /v1/portfolios/statements/{statement_id} | 
*PrimeApiApi* | [**primeAPIGetStatements**](docs/PrimeApiApi.md#primeAPIGetStatements) | **GET** /v1/portfolios/{portfolio_id}/statements | 
*PrimeApiApi* | [**primeAPIGetSystemStatus**](docs/PrimeApiApi.md#primeAPIGetSystemStatus) | **GET** /v1/system_status | 
*PrimeApiApi* | [**primeAPIGetTeamMemberDetails**](docs/PrimeApiApi.md#primeAPIGetTeamMemberDetails) | **GET** /v1/team_member/detail | 
*PrimeApiApi* | [**primeAPIGetTeamMembers**](docs/PrimeApiApi.md#primeAPIGetTeamMembers) | **GET** /v1/team_members | 
*PrimeApiApi* | [**primeAPIGetTradeReportGraphData**](docs/PrimeApiApi.md#primeAPIGetTradeReportGraphData) | **GET** /v1/orders/{order_id}/report/graph | 
*PrimeApiApi* | [**primeAPIGetTradeReportOrderDetails**](docs/PrimeApiApi.md#primeAPIGetTradeReportOrderDetails) | **GET** /v1/orders/{order_id}/report/order-details | 
*PrimeApiApi* | [**primeAPIGetTradeReportOrderDetailsAndGraphData**](docs/PrimeApiApi.md#primeAPIGetTradeReportOrderDetailsAndGraphData) | **GET** /v1/orders/{order_id}/report/graph-and-details | 
*PrimeApiApi* | [**primeAPIGetTradeReportOrderFills**](docs/PrimeApiApi.md#primeAPIGetTradeReportOrderFills) | **GET** /v1/orders/{order_id}/report/fills | 
*PrimeApiApi* | [**primeAPIGetTradeReportVenueFills**](docs/PrimeApiApi.md#primeAPIGetTradeReportVenueFills) | **GET** /v1/orders/{order_id}/report/venue-fills | 
*PrimeApiApi* | [**primeAPIGetTransferMethods**](docs/PrimeApiApi.md#primeAPIGetTransferMethods) | **GET** /v1/vehicles/{vehicle_id}/transfer_methods | 
*PrimeApiApi* | [**primeAPIGetUnstakeTimeEstimation**](docs/PrimeApiApi.md#primeAPIGetUnstakeTimeEstimation) | **GET** /v1/portfolios/{portfolio_id}/{currency_symbol}/unstake_time_estimation | 
*PrimeApiApi* | [**primeAPIGetUserEntityLevelPermission**](docs/PrimeApiApi.md#primeAPIGetUserEntityLevelPermission) | **GET** /v1/user/{entity_id}/permission | 
*PrimeApiApi* | [**primeAPIGetUserHierarchy**](docs/PrimeApiApi.md#primeAPIGetUserHierarchy) | **GET** /v1/users/{user_id}/hierarchy | 
*PrimeApiApi* | [**primeAPIGetUserInAppNotifications**](docs/PrimeApiApi.md#primeAPIGetUserInAppNotifications) | **GET** /v1/notifications/in-app | 
*PrimeApiApi* | [**primeAPIGetUserInAppNotificationsStream**](docs/PrimeApiApi.md#primeAPIGetUserInAppNotificationsStream) | **GET** /v1/stream/notifications/in-app | 
*PrimeApiApi* | [**primeAPIGetUserInfo**](docs/PrimeApiApi.md#primeAPIGetUserInfo) | **GET** /v1/users/{user_id} | 
*PrimeApiApi* | [**primeAPIGetUserInvitations**](docs/PrimeApiApi.md#primeAPIGetUserInvitations) | **GET** /v1/invitations | 
*PrimeApiApi* | [**primeAPIGetUserPortfolios**](docs/PrimeApiApi.md#primeAPIGetUserPortfolios) | **GET** /v1/users/{user_id}/portfolios | 
*PrimeApiApi* | [**primeAPIGetUserPreferences**](docs/PrimeApiApi.md#primeAPIGetUserPreferences) | **GET** /v1/users/{user_id}/preferences | 
*PrimeApiApi* | [**primeAPIGetUserRoles**](docs/PrimeApiApi.md#primeAPIGetUserRoles) | **GET** /v1/users/{user_id}/{portfolio_id}/userRoles | 
*PrimeApiApi* | [**primeAPIGetVehicleBalances**](docs/PrimeApiApi.md#primeAPIGetVehicleBalances) | **GET** /v1/vehicles/{vehicle_id}/balances | 
*PrimeApiApi* | [**primeAPIGetVehicleBalancesStream**](docs/PrimeApiApi.md#primeAPIGetVehicleBalancesStream) | **GET** /v1/stream/vehicles/{vehicle_id}/balances | 
*PrimeApiApi* | [**primeAPIGetVehicleBillingPermission**](docs/PrimeApiApi.md#primeAPIGetVehicleBillingPermission) | **GET** /v1/portfolios/{portfolio_id}/billing_permission | 
*PrimeApiApi* | [**primeAPIGetVehicleCurrencies**](docs/PrimeApiApi.md#primeAPIGetVehicleCurrencies) | **GET** /v1/vehicles/{vehicle_id}/currencies | 
*PrimeApiApi* | [**primeAPIGetVehicleCurrenciesStream**](docs/PrimeApiApi.md#primeAPIGetVehicleCurrenciesStream) | **GET** /v1/stream/vehicles/{vehicle_id}/currencies | 
*PrimeApiApi* | [**primeAPIGetVehicleFinancingStream**](docs/PrimeApiApi.md#primeAPIGetVehicleFinancingStream) | **GET** /v1/stream/vehicles/{vehicle_id}/financing | 
*PrimeApiApi* | [**primeAPIGetVehiclePortfolioMarginStream**](docs/PrimeApiApi.md#primeAPIGetVehiclePortfolioMarginStream) | **GET** /v1/stream/vehicles/{vehicle_id}/financing/portfolio_margin | 
*PrimeApiApi* | [**primeAPIGetVehiclePortfolioMarginStreamV2**](docs/PrimeApiApi.md#primeAPIGetVehiclePortfolioMarginStreamV2) | **GET** /v2/stream/vehicles/{vehicle_id}/financing/portfolio_margin | 
*PrimeApiApi* | [**primeAPIGetVehicleSpotPrices**](docs/PrimeApiApi.md#primeAPIGetVehicleSpotPrices) | **GET** /v1/vehicles/{vehicle_id}/spot_prices | 
*PrimeApiApi* | [**primeAPIGetVehicleSpotPricesStream**](docs/PrimeApiApi.md#primeAPIGetVehicleSpotPricesStream) | **GET** /v1/stream/vehicles/{vehicle_id}/spot_prices | 
*PrimeApiApi* | [**primeAPIGetVehicleValidators**](docs/PrimeApiApi.md#primeAPIGetVehicleValidators) | **GET** /v1/vehicles/{vehicle_id}/{currency_symbol}/validators | 
*PrimeApiApi* | [**primeAPIGetVideoUpload**](docs/PrimeApiApi.md#primeAPIGetVideoUpload) | **GET** /v1/video_uploads/{upload_id} | 
*PrimeApiApi* | [**primeAPIGetVideoUploadPermissions**](docs/PrimeApiApi.md#primeAPIGetVideoUploadPermissions) | **GET** /v1/transactions/{transaction_id}/video_upload_permissions | 
*PrimeApiApi* | [**primeAPIGetWallet**](docs/PrimeApiApi.md#primeAPIGetWallet) | **GET** /v1/portfolios/{portfolio_id}/wallets/{wallet_id} | 
*PrimeApiApi* | [**primeAPIGetWalletAssetSettings**](docs/PrimeApiApi.md#primeAPIGetWalletAssetSettings) | **GET** /v1/portfolios/{portfolio_id}/wallets/{wallet_id}/asset_settings | 
*PrimeApiApi* | [**primeAPIGetWalletBalances**](docs/PrimeApiApi.md#primeAPIGetWalletBalances) | **GET** /v1/portfolios/{portfolio_id}/wallets/{wallet_id}/balances | 
*PrimeApiApi* | [**primeAPIGetWalletBalancesStream**](docs/PrimeApiApi.md#primeAPIGetWalletBalancesStream) | **GET** /v1/stream/portfolios/{portfolio_id}/wallets/{wallet_id}/balances | 
*PrimeApiApi* | [**primeAPIGetWalletDefiBalances**](docs/PrimeApiApi.md#primeAPIGetWalletDefiBalances) | **GET** /v1/portfolios/{portfolio_id}/wallets/{wallet_id}/defi/balances | 
*PrimeApiApi* | [**primeAPIGetWalletRewardsStatus**](docs/PrimeApiApi.md#primeAPIGetWalletRewardsStatus) | **GET** /v1/portfolios/{portfolio_id}/wallets/{wallet_id}/rewards | 
*PrimeApiApi* | [**primeAPIGetWalletStakingStatus**](docs/PrimeApiApi.md#primeAPIGetWalletStakingStatus) | **GET** /v1/portfolios/{portfolio_id}/wallets/{wallet_id}/staking | 
*PrimeApiApi* | [**primeAPIGetWalletTokens**](docs/PrimeApiApi.md#primeAPIGetWalletTokens) | **GET** /v1/portfolios/{portfolio_id}/wallet_tokens/{wallet_id} | 
*PrimeApiApi* | [**primeAPIGetWalletVestingStatus**](docs/PrimeApiApi.md#primeAPIGetWalletVestingStatus) | **GET** /v1/portfolios/{portfolio_id}/wallets/{wallet_id}/vesting | 
*PrimeApiApi* | [**primeAPIGetWallets**](docs/PrimeApiApi.md#primeAPIGetWallets) | **GET** /v1/portfolios/{portfolio_id}/wallets | 
*PrimeApiApi* | [**primeAPIInitiateTransactionSigning**](docs/PrimeApiApi.md#primeAPIInitiateTransactionSigning) | **POST** /v2/portfolios/{portfolio_id}/transactions/initiate_signing | 
*PrimeApiApi* | [**primeAPIListActiveValidators**](docs/PrimeApiApi.md#primeAPIListActiveValidators) | **GET** /v1/portfolios/{portfolio_id}/wallets/{wallet_id}/validators | 
*PrimeApiApi* | [**primeAPIListBulkPoliciesForEntity**](docs/PrimeApiApi.md#primeAPIListBulkPoliciesForEntity) | **GET** /v1/entities/{entity_id}/policies | 
*PrimeApiApi* | [**primeAPIListDeviceGroups**](docs/PrimeApiApi.md#primeAPIListDeviceGroups) | **GET** /v1/device_groups | 
*PrimeApiApi* | [**primeAPIListInvitationsForUser**](docs/PrimeApiApi.md#primeAPIListInvitationsForUser) | **GET** /v1/entities/{entity_id}/users/invitations | 
*PrimeApiApi* | [**primeAPIListPaymentMethods**](docs/PrimeApiApi.md#primeAPIListPaymentMethods) | **GET** /v1/vehicles/{vehicle_id}/payment_methods | 
*PrimeApiApi* | [**primeAPIListPolicies**](docs/PrimeApiApi.md#primeAPIListPolicies) | **GET** /v1/portfolios/{portfolio_id}/policies | 
*PrimeApiApi* | [**primeAPIListReportingCenterData**](docs/PrimeApiApi.md#primeAPIListReportingCenterData) | **GET** /v1/reporting_center/{vehicle_id} | 
*PrimeApiApi* | [**primeAPIListSignerIdsForActivity**](docs/PrimeApiApi.md#primeAPIListSignerIdsForActivity) | **GET** /v1/portfolios/{portfolio_id}/activities/{activity_id}/signers | 
*PrimeApiApi* | [**primeAPIListTradingWalletCryptoDepositAddresses**](docs/PrimeApiApi.md#primeAPIListTradingWalletCryptoDepositAddresses) | **GET** /v1/portfolios/{portfolio_id}/wallets/{wallet_id}/crypto_deposit_addresses | 
*PrimeApiApi* | [**primeAPIListVideoUploads**](docs/PrimeApiApi.md#primeAPIListVideoUploads) | **GET** /v1/video_uploads | 
*PrimeApiApi* | [**primeAPIListWalletsV2**](docs/PrimeApiApi.md#primeAPIListWalletsV2) | **GET** /v2/portfolios/{portfolio_id}/wallets | 
*PrimeApiApi* | [**primeAPIListWeb3SecurityKeys**](docs/PrimeApiApi.md#primeAPIListWeb3SecurityKeys) | **GET** /v2/portfolios/{portfolio_id}/web3_security_keys | 
*PrimeApiApi* | [**primeAPIPostAcceptInvitation**](docs/PrimeApiApi.md#primeAPIPostAcceptInvitation) | **POST** /v1/invitations/{invitation_id} | 
*PrimeApiApi* | [**primeAPIPostActivateAPIKey**](docs/PrimeApiApi.md#primeAPIPostActivateAPIKey) | **POST** /v1/portfolios/{portfolio_id}/api-key/activate | 
*PrimeApiApi* | [**primeAPIPostActivateAPIKeyV2**](docs/PrimeApiApi.md#primeAPIPostActivateAPIKeyV2) | **POST** /v2/groups/{group_id}/api-key/activate | 
*PrimeApiApi* | [**primeAPIPostAddressBookEntry**](docs/PrimeApiApi.md#primeAPIPostAddressBookEntry) | **POST** /v1/portfolios/{portfolio_id}/addressbook | 
*PrimeApiApi* | [**primeAPIPostAllocation**](docs/PrimeApiApi.md#primeAPIPostAllocation) | **POST** /v1/portfolios/{source_portfolio_id}/allocation | 
*PrimeApiApi* | [**primeAPIPostAllocationPreview**](docs/PrimeApiApi.md#primeAPIPostAllocationPreview) | **POST** /v1/portfolios/{source_portfolio_id}/allocation/preview | 
*PrimeApiApi* | [**primeAPIPostApprovePortfolioActivity**](docs/PrimeApiApi.md#primeAPIPostApprovePortfolioActivity) | **POST** /v1/portfolios/{portfolio_id}/activities/{activity_id}/approve | 
*PrimeApiApi* | [**primeAPIPostApproveVehicleActivity**](docs/PrimeApiApi.md#primeAPIPostApproveVehicleActivity) | **POST** /v1/vehicles/{vehicle_id}/activities/{activity_id}/approve | 
*PrimeApiApi* | [**primeAPIPostBulkActionActivities**](docs/PrimeApiApi.md#primeAPIPostBulkActionActivities) | **POST** /v1/activities/action/bulk | 
*PrimeApiApi* | [**primeAPIPostBulkActionSetting**](docs/PrimeApiApi.md#primeAPIPostBulkActionSetting) | **POST** /v1/settings/bulk_action | 
*PrimeApiApi* | [**primeAPIPostBulkInvitation**](docs/PrimeApiApi.md#primeAPIPostBulkInvitation) | **POST** /v1/users/invite | 
*PrimeApiApi* | [**primeAPIPostCancelOrder**](docs/PrimeApiApi.md#primeAPIPostCancelOrder) | **POST** /v1/orders/batch_cancel | 
*PrimeApiApi* | [**primeAPIPostCreateAPIKey**](docs/PrimeApiApi.md#primeAPIPostCreateAPIKey) | **POST** /v1/portfolios/{portfolio_id}/api-key/create | 
*PrimeApiApi* | [**primeAPIPostCreateAPIKeyV2**](docs/PrimeApiApi.md#primeAPIPostCreateAPIKeyV2) | **POST** /v2/groups/{group_id}/api-key/create | 
*PrimeApiApi* | [**primeAPIPostDeactivateAPIKey**](docs/PrimeApiApi.md#primeAPIPostDeactivateAPIKey) | **POST** /v1/portfolios/{portfolio_id}/api-key/deactivate | 
*PrimeApiApi* | [**primeAPIPostDeactivateAPIKeyV2**](docs/PrimeApiApi.md#primeAPIPostDeactivateAPIKeyV2) | **POST** /v2/groups/{group_id}/api-key/deactivate | 
*PrimeApiApi* | [**primeAPIPostDelegationAccount**](docs/PrimeApiApi.md#primeAPIPostDelegationAccount) | **POST** /v1/portfolios/{portfolio_id}/wallets/{wallet_id}/governance/delegation | 
*PrimeApiApi* | [**primeAPIPostDocumentSignature**](docs/PrimeApiApi.md#primeAPIPostDocumentSignature) | **POST** /v1/vehicles/{vehicle_id}/documents/{document_key} | 
*PrimeApiApi* | [**primeAPIPostEntitySettings**](docs/PrimeApiApi.md#primeAPIPostEntitySettings) | **POST** /v1/entities/{entity_id}/settings/{key} | 
*PrimeApiApi* | [**primeAPIPostFidoChallenge**](docs/PrimeApiApi.md#primeAPIPostFidoChallenge) | **POST** /v1/users/{user_id}/fido/challenge | 
*PrimeApiApi* | [**primeAPIPostFidoChallengeCreate**](docs/PrimeApiApi.md#primeAPIPostFidoChallengeCreate) | **POST** /v1/users/{user_id}/fido/challenge/create | 
*PrimeApiApi* | [**primeAPIPostFidoRegistration**](docs/PrimeApiApi.md#primeAPIPostFidoRegistration) | **POST** /v1/users/{user_id}/fido/register | 
*PrimeApiApi* | [**primeAPIPostGovernanceStatus**](docs/PrimeApiApi.md#primeAPIPostGovernanceStatus) | **POST** /v1/portfolios/{portfolio_id}/wallets/{wallet_id}/governance/status | 
*PrimeApiApi* | [**primeAPIPostGovernanceVote**](docs/PrimeApiApi.md#primeAPIPostGovernanceVote) | **POST** /v1/portfolios/{portfolio_id}/wallets/{wallet_id}/governance/votes | 
*PrimeApiApi* | [**primeAPIPostInvitation**](docs/PrimeApiApi.md#primeAPIPostInvitation) | **POST** /v1/portfolios/{portfolio_id}/invitations | 
*PrimeApiApi* | [**primeAPIPostNetAllocationPreview**](docs/PrimeApiApi.md#primeAPIPostNetAllocationPreview) | **POST** /v1/portfolios/{source_portfolio_id}/allocation/net_preview | 
*PrimeApiApi* | [**primeAPIPostOrder**](docs/PrimeApiApi.md#primeAPIPostOrder) | **POST** /v1/orders | 
*PrimeApiApi* | [**primeAPIPostOrderPreview**](docs/PrimeApiApi.md#primeAPIPostOrderPreview) | **POST** /v1/order/preview | 
*PrimeApiApi* | [**primeAPIPostPortfolioSettings**](docs/PrimeApiApi.md#primeAPIPostPortfolioSettings) | **POST** /v1/portfolios/{portfolio_id}/settings/{key} | 
*PrimeApiApi* | [**primeAPIPostPreviewUserChange**](docs/PrimeApiApi.md#primeAPIPostPreviewUserChange) | **POST** /v1/portfolios/{portfolio_id}/users/{user_id}/preview_user_change | 
*PrimeApiApi* | [**primeAPIPostPushNotificationDeviceDeregistration**](docs/PrimeApiApi.md#primeAPIPostPushNotificationDeviceDeregistration) | **POST** /v1/notifications/push/device_deregistration | 
*PrimeApiApi* | [**primeAPIPostPushNotificationDeviceRegistration**](docs/PrimeApiApi.md#primeAPIPostPushNotificationDeviceRegistration) | **POST** /v1/notifications/push/device_registration | 
*PrimeApiApi* | [**primeAPIPostRejectPortfolioActivity**](docs/PrimeApiApi.md#primeAPIPostRejectPortfolioActivity) | **POST** /v1/portfolios/{portfolio_id}/activities/{activity_id}/reject | 
*PrimeApiApi* | [**primeAPIPostRejectVehicleActivity**](docs/PrimeApiApi.md#primeAPIPostRejectVehicleActivity) | **POST** /v1/vehicles/{vehicle_id}/activities/{activity_id}/reject | 
*PrimeApiApi* | [**primeAPIPostReverseAllocation**](docs/PrimeApiApi.md#primeAPIPostReverseAllocation) | **POST** /v1/portfolios/{portfolio_id}/allocation/reverse | 
*PrimeApiApi* | [**primeAPIPostUpdateBillingAddress**](docs/PrimeApiApi.md#primeAPIPostUpdateBillingAddress) | **POST** /v1/vehicles/{vehicle_id}/billing_address | 
*PrimeApiApi* | [**primeAPIPostUpdateBillingEmailList**](docs/PrimeApiApi.md#primeAPIPostUpdateBillingEmailList) | **POST** /v1/vehicles/{vehicle_id}/email_list | 
*PrimeApiApi* | [**primeAPIPostUpdateBillingPreference**](docs/PrimeApiApi.md#primeAPIPostUpdateBillingPreference) | **POST** /v1/vehicles/{vehicle_id}/billing_preference | 
*PrimeApiApi* | [**primeAPIPostUserInAppNotificationStatuses**](docs/PrimeApiApi.md#primeAPIPostUserInAppNotificationStatuses) | **POST** /v1/notifications/in-app/status | 
*PrimeApiApi* | [**primeAPIPostUserPreferences**](docs/PrimeApiApi.md#primeAPIPostUserPreferences) | **POST** /v1/users/{user_id}/preferences | 
*PrimeApiApi* | [**primeAPIPostUserUpdate**](docs/PrimeApiApi.md#primeAPIPostUserUpdate) | **POST** /v1/portfolios/{portfolio_id}/users/{user_id} | 
*PrimeApiApi* | [**primeAPIPostValidateAddress**](docs/PrimeApiApi.md#primeAPIPostValidateAddress) | **POST** /v1/address/validate | 
*PrimeApiApi* | [**primeAPIPostValidateCounterparty**](docs/PrimeApiApi.md#primeAPIPostValidateCounterparty) | **POST** /v1/counterparties/{counterparty_id}/validate | 
*PrimeApiApi* | [**primeAPIPreviewTransaction**](docs/PrimeApiApi.md#primeAPIPreviewTransaction) | **POST** /v1/portfolios/{portfolio_id}/transactions/preview | 
*PrimeApiApi* | [**primeAPISignalWeb3Action**](docs/PrimeApiApi.md#primeAPISignalWeb3Action) | **POST** /v2/portfolios/{portfolio_id}/web3_actions/signal | 
*PrimeApiApi* | [**primeAPISubmitDALRecall**](docs/PrimeApiApi.md#primeAPISubmitDALRecall) | **POST** /v1/vehicles/{entity_id}/submit_recall | 
*PrimeApiApi* | [**primeAPISubmitLocates**](docs/PrimeApiApi.md#primeAPISubmitLocates) | **POST** /v1/vehicles/{entity_id}/pm/locates | 
*PrimeApiApi* | [**primeAPISubmitMultipleLocates**](docs/PrimeApiApi.md#primeAPISubmitMultipleLocates) | **POST** /v1/vehicles/{entity_id}/pm/multiple_locates | 
*PrimeApiApi* | [**primeAPIUpdateNotificationPreferencesForChannel**](docs/PrimeApiApi.md#primeAPIUpdateNotificationPreferencesForChannel) | **POST** /v1/notification_preferences/{user_id}/update | 
*PrimeApiApi* | [**primeAPIUpdateWalletAssetSettings**](docs/PrimeApiApi.md#primeAPIUpdateWalletAssetSettings) | **POST** /v1/portfolios/{portfolio_id}/wallets/{wallet_id}/asset_settings | 
*PrimeApiApi* | [**primeAPIUpdateWalletName**](docs/PrimeApiApi.md#primeAPIUpdateWalletName) | **POST** /v1/portfolios/{portfolio_id}/wallets/{wallet_id} | 
*PrimeApiApi* | [**primeAPIUpdateWeb3Device**](docs/PrimeApiApi.md#primeAPIUpdateWeb3Device) | **POST** /v1/web3_device | 
*PrimeApiApi* | [**primeAPIUpsertPolicyChange**](docs/PrimeApiApi.md#primeAPIUpsertPolicyChange) | **POST** /v1/portfolios/{portfolio_id}/policies | 
*PrimeApiApi* | [**primeAPIValidateWeb3Authorization**](docs/PrimeApiApi.md#primeAPIValidateWeb3Authorization) | **POST** /v1/portfolios/{portfolio_id}/web3/validate | 
*PrimeApiApi* | [**primeAPIValidateWeb3SecurityKey**](docs/PrimeApiApi.md#primeAPIValidateWeb3SecurityKey) | **POST** /v2/portfolios/{portfolio_id}/web3_actions/validate_security_key | 


## Documentation for Models

 - [CoinbaseBrokerageProxyCommonBlockTradeLimitLimitFok](docs/CoinbaseBrokerageProxyCommonBlockTradeLimitLimitFok.md)
 - [CoinbaseBrokerageProxyCommonCancelReason](docs/CoinbaseBrokerageProxyCommonCancelReason.md)
 - [CoinbaseBrokerageProxyCommonCommissionModel](docs/CoinbaseBrokerageProxyCommonCommissionModel.md)
 - [CoinbaseBrokerageProxyCommonCrossingType](docs/CoinbaseBrokerageProxyCommonCrossingType.md)
 - [CoinbaseBrokerageProxyCommonEdit](docs/CoinbaseBrokerageProxyCommonEdit.md)
 - [CoinbaseBrokerageProxyCommonFill](docs/CoinbaseBrokerageProxyCommonFill.md)
 - [CoinbaseBrokerageProxyCommonFillMetadata](docs/CoinbaseBrokerageProxyCommonFillMetadata.md)
 - [CoinbaseBrokerageProxyCommonFutureProductDetails](docs/CoinbaseBrokerageProxyCommonFutureProductDetails.md)
 - [CoinbaseBrokerageProxyCommonHeartbeat](docs/CoinbaseBrokerageProxyCommonHeartbeat.md)
 - [CoinbaseBrokerageProxyCommonJsonPatch](docs/CoinbaseBrokerageProxyCommonJsonPatch.md)
 - [CoinbaseBrokerageProxyCommonJsonPatchOperation](docs/CoinbaseBrokerageProxyCommonJsonPatchOperation.md)
 - [CoinbaseBrokerageProxyCommonLimitLimitGtc](docs/CoinbaseBrokerageProxyCommonLimitLimitGtc.md)
 - [CoinbaseBrokerageProxyCommonLimitLimitGtd](docs/CoinbaseBrokerageProxyCommonLimitLimitGtd.md)
 - [CoinbaseBrokerageProxyCommonLiquidationMarketGtc](docs/CoinbaseBrokerageProxyCommonLiquidationMarketGtc.md)
 - [CoinbaseBrokerageProxyCommonLiquidationMarketGtd](docs/CoinbaseBrokerageProxyCommonLiquidationMarketGtd.md)
 - [CoinbaseBrokerageProxyCommonLiquidityIndicator](docs/CoinbaseBrokerageProxyCommonLiquidityIndicator.md)
 - [CoinbaseBrokerageProxyCommonMarginScope](docs/CoinbaseBrokerageProxyCommonMarginScope.md)
 - [CoinbaseBrokerageProxyCommonMarketMarketIoc](docs/CoinbaseBrokerageProxyCommonMarketMarketIoc.md)
 - [CoinbaseBrokerageProxyCommonOrder](docs/CoinbaseBrokerageProxyCommonOrder.md)
 - [CoinbaseBrokerageProxyCommonOrderConfiguration](docs/CoinbaseBrokerageProxyCommonOrderConfiguration.md)
 - [CoinbaseBrokerageProxyCommonOrderExecutionStatus](docs/CoinbaseBrokerageProxyCommonOrderExecutionStatus.md)
 - [CoinbaseBrokerageProxyCommonOrderMetadata](docs/CoinbaseBrokerageProxyCommonOrderMetadata.md)
 - [CoinbaseBrokerageProxyCommonOrderSide](docs/CoinbaseBrokerageProxyCommonOrderSide.md)
 - [CoinbaseBrokerageProxyCommonOrders](docs/CoinbaseBrokerageProxyCommonOrders.md)
 - [CoinbaseBrokerageProxyCommonProductDetails](docs/CoinbaseBrokerageProxyCommonProductDetails.md)
 - [CoinbaseBrokerageProxyCommonRejectReason](docs/CoinbaseBrokerageProxyCommonRejectReason.md)
 - [CoinbaseBrokerageProxyCommonSorLimitFok](docs/CoinbaseBrokerageProxyCommonSorLimitFok.md)
 - [CoinbaseBrokerageProxyCommonSorLimitIoc](docs/CoinbaseBrokerageProxyCommonSorLimitIoc.md)
 - [CoinbaseBrokerageProxyCommonStopLimitStopLimitGtc](docs/CoinbaseBrokerageProxyCommonStopLimitStopLimitGtc.md)
 - [CoinbaseBrokerageProxyCommonStopLimitStopLimitGtd](docs/CoinbaseBrokerageProxyCommonStopLimitStopLimitGtd.md)
 - [CoinbaseBrokerageProxyCommonStopPriceDirection](docs/CoinbaseBrokerageProxyCommonStopPriceDirection.md)
 - [CoinbaseBrokerageProxyCommonStopTriggerStatus](docs/CoinbaseBrokerageProxyCommonStopTriggerStatus.md)
 - [CoinbaseBrokerageProxyCommonTimeInForceType](docs/CoinbaseBrokerageProxyCommonTimeInForceType.md)
 - [CoinbaseBrokerageProxyCommonTriggerStopLimitGtc](docs/CoinbaseBrokerageProxyCommonTriggerStopLimitGtc.md)
 - [CoinbaseBrokerageProxyCommonTriggerStopLimitGtd](docs/CoinbaseBrokerageProxyCommonTriggerStopLimitGtd.md)
 - [CoinbaseBrokerageProxyCommonTriggerTakeProfitStopLossGtc](docs/CoinbaseBrokerageProxyCommonTriggerTakeProfitStopLossGtc.md)
 - [CoinbaseBrokerageProxyCommonTriggerTakeProfitStopLossGtd](docs/CoinbaseBrokerageProxyCommonTriggerTakeProfitStopLossGtd.md)
 - [CoinbaseBrokerageProxyCommonTwapLimitGtd](docs/CoinbaseBrokerageProxyCommonTwapLimitGtd.md)
 - [CoinbaseBrokerageProxyCommonVwapLimitGtd](docs/CoinbaseBrokerageProxyCommonVwapLimitGtd.md)
 - [CoinbaseBrokerageProxyEventsMaterializedApiCancelReason](docs/CoinbaseBrokerageProxyEventsMaterializedApiCancelReason.md)
 - [CoinbaseBrokerageProxyEventsMaterializedApiCrossingType](docs/CoinbaseBrokerageProxyEventsMaterializedApiCrossingType.md)
 - [CoinbaseBrokerageProxyEventsMaterializedApiEntryOrderConfiguration](docs/CoinbaseBrokerageProxyEventsMaterializedApiEntryOrderConfiguration.md)
 - [CoinbaseBrokerageProxyEventsMaterializedApiEntryOrderConfigurationBlockTradeLimitLimitFok](docs/CoinbaseBrokerageProxyEventsMaterializedApiEntryOrderConfigurationBlockTradeLimitLimitFok.md)
 - [CoinbaseBrokerageProxyEventsMaterializedApiEntryOrderConfigurationLimitLimitGtc](docs/CoinbaseBrokerageProxyEventsMaterializedApiEntryOrderConfigurationLimitLimitGtc.md)
 - [CoinbaseBrokerageProxyEventsMaterializedApiEntryOrderConfigurationLimitLimitGtd](docs/CoinbaseBrokerageProxyEventsMaterializedApiEntryOrderConfigurationLimitLimitGtd.md)
 - [CoinbaseBrokerageProxyEventsMaterializedApiEntryOrderConfigurationLiquidationMarketGtc](docs/CoinbaseBrokerageProxyEventsMaterializedApiEntryOrderConfigurationLiquidationMarketGtc.md)
 - [CoinbaseBrokerageProxyEventsMaterializedApiEntryOrderConfigurationLiquidationMarketGtd](docs/CoinbaseBrokerageProxyEventsMaterializedApiEntryOrderConfigurationLiquidationMarketGtd.md)
 - [CoinbaseBrokerageProxyEventsMaterializedApiEntryOrderConfigurationMarketMarketIoc](docs/CoinbaseBrokerageProxyEventsMaterializedApiEntryOrderConfigurationMarketMarketIoc.md)
 - [CoinbaseBrokerageProxyEventsMaterializedApiEntryOrderConfigurationSorLimitFok](docs/CoinbaseBrokerageProxyEventsMaterializedApiEntryOrderConfigurationSorLimitFok.md)
 - [CoinbaseBrokerageProxyEventsMaterializedApiEntryOrderConfigurationSorLimitIoc](docs/CoinbaseBrokerageProxyEventsMaterializedApiEntryOrderConfigurationSorLimitIoc.md)
 - [CoinbaseBrokerageProxyEventsMaterializedApiEntryOrderConfigurationStopLimitStopLimitGtc](docs/CoinbaseBrokerageProxyEventsMaterializedApiEntryOrderConfigurationStopLimitStopLimitGtc.md)
 - [CoinbaseBrokerageProxyEventsMaterializedApiEntryOrderConfigurationStopLimitStopLimitGtd](docs/CoinbaseBrokerageProxyEventsMaterializedApiEntryOrderConfigurationStopLimitStopLimitGtd.md)
 - [CoinbaseBrokerageProxyEventsMaterializedApiEntryOrderConfigurationTriggerStopLimitGtc](docs/CoinbaseBrokerageProxyEventsMaterializedApiEntryOrderConfigurationTriggerStopLimitGtc.md)
 - [CoinbaseBrokerageProxyEventsMaterializedApiEntryOrderConfigurationTriggerStopLimitGtd](docs/CoinbaseBrokerageProxyEventsMaterializedApiEntryOrderConfigurationTriggerStopLimitGtd.md)
 - [CoinbaseBrokerageProxyEventsMaterializedApiEntryOrderConfigurationTriggerTakeProfitStopLossGtc](docs/CoinbaseBrokerageProxyEventsMaterializedApiEntryOrderConfigurationTriggerTakeProfitStopLossGtc.md)
 - [CoinbaseBrokerageProxyEventsMaterializedApiEntryOrderConfigurationTriggerTakeProfitStopLossGtd](docs/CoinbaseBrokerageProxyEventsMaterializedApiEntryOrderConfigurationTriggerTakeProfitStopLossGtd.md)
 - [CoinbaseBrokerageProxyEventsMaterializedApiEntryOrderConfigurationTwapLimitGtd](docs/CoinbaseBrokerageProxyEventsMaterializedApiEntryOrderConfigurationTwapLimitGtd.md)
 - [CoinbaseBrokerageProxyEventsMaterializedApiEntryOrderConfigurationVwapLimitGtd](docs/CoinbaseBrokerageProxyEventsMaterializedApiEntryOrderConfigurationVwapLimitGtd.md)
 - [CoinbaseBrokerageProxyEventsMaterializedApiExchangeCounterParty](docs/CoinbaseBrokerageProxyEventsMaterializedApiExchangeCounterParty.md)
 - [CoinbaseBrokerageProxyEventsMaterializedApiStopDirection](docs/CoinbaseBrokerageProxyEventsMaterializedApiStopDirection.md)
 - [CoinbaseBrokerageProxyTradingApiCandle](docs/CoinbaseBrokerageProxyTradingApiCandle.md)
 - [CoinbaseBrokerageProxyTradingApiCandles](docs/CoinbaseBrokerageProxyTradingApiCandles.md)
 - [CoinbaseBrokerageProxyTradingApiDepth](docs/CoinbaseBrokerageProxyTradingApiDepth.md)
 - [CoinbaseBrokerageProxyTradingApiFcmTradingSessionDetails](docs/CoinbaseBrokerageProxyTradingApiFcmTradingSessionDetails.md)
 - [CoinbaseBrokerageProxyTradingApiFutureProductDetails](docs/CoinbaseBrokerageProxyTradingApiFutureProductDetails.md)
 - [CoinbaseBrokerageProxyTradingApiFutureProductStats](docs/CoinbaseBrokerageProxyTradingApiFutureProductStats.md)
 - [CoinbaseBrokerageProxyTradingApiGeolocationInformation](docs/CoinbaseBrokerageProxyTradingApiGeolocationInformation.md)
 - [CoinbaseBrokerageProxyTradingApiGetCandlesResponse](docs/CoinbaseBrokerageProxyTradingApiGetCandlesResponse.md)
 - [CoinbaseBrokerageProxyTradingApiGetCandlesStreamBody](docs/CoinbaseBrokerageProxyTradingApiGetCandlesStreamBody.md)
 - [CoinbaseBrokerageProxyTradingApiGetCandlesStreamResponse](docs/CoinbaseBrokerageProxyTradingApiGetCandlesStreamResponse.md)
 - [CoinbaseBrokerageProxyTradingApiGetDepthStreamBody](docs/CoinbaseBrokerageProxyTradingApiGetDepthStreamBody.md)
 - [CoinbaseBrokerageProxyTradingApiGetDepthStreamResponse](docs/CoinbaseBrokerageProxyTradingApiGetDepthStreamResponse.md)
 - [CoinbaseBrokerageProxyTradingApiGetLadderStreamBody](docs/CoinbaseBrokerageProxyTradingApiGetLadderStreamBody.md)
 - [CoinbaseBrokerageProxyTradingApiGetLadderStreamResponse](docs/CoinbaseBrokerageProxyTradingApiGetLadderStreamResponse.md)
 - [CoinbaseBrokerageProxyTradingApiGetMarketTradesStreamBody](docs/CoinbaseBrokerageProxyTradingApiGetMarketTradesStreamBody.md)
 - [CoinbaseBrokerageProxyTradingApiGetMarketTradesStreamResponse](docs/CoinbaseBrokerageProxyTradingApiGetMarketTradesStreamResponse.md)
 - [CoinbaseBrokerageProxyTradingApiGetOrderSimulationResponse](docs/CoinbaseBrokerageProxyTradingApiGetOrderSimulationResponse.md)
 - [CoinbaseBrokerageProxyTradingApiGetOrderSimulationStreamBody](docs/CoinbaseBrokerageProxyTradingApiGetOrderSimulationStreamBody.md)
 - [CoinbaseBrokerageProxyTradingApiGetProductStatsResponse](docs/CoinbaseBrokerageProxyTradingApiGetProductStatsResponse.md)
 - [CoinbaseBrokerageProxyTradingApiGetProductStatsStreamBody](docs/CoinbaseBrokerageProxyTradingApiGetProductStatsStreamBody.md)
 - [CoinbaseBrokerageProxyTradingApiGetProductStatsStreamResponse](docs/CoinbaseBrokerageProxyTradingApiGetProductStatsStreamResponse.md)
 - [CoinbaseBrokerageProxyTradingApiGetTradeReportGraphDataResponse](docs/CoinbaseBrokerageProxyTradingApiGetTradeReportGraphDataResponse.md)
 - [CoinbaseBrokerageProxyTradingApiGetTradeReportOrderDetailsAndGraphDataResponse](docs/CoinbaseBrokerageProxyTradingApiGetTradeReportOrderDetailsAndGraphDataResponse.md)
 - [CoinbaseBrokerageProxyTradingApiGetTradeReportOrderDetailsResponse](docs/CoinbaseBrokerageProxyTradingApiGetTradeReportOrderDetailsResponse.md)
 - [CoinbaseBrokerageProxyTradingApiGetTradeReportOrderFillsResponse](docs/CoinbaseBrokerageProxyTradingApiGetTradeReportOrderFillsResponse.md)
 - [CoinbaseBrokerageProxyTradingApiGetTradeReportVenueFillsResponse](docs/CoinbaseBrokerageProxyTradingApiGetTradeReportVenueFillsResponse.md)
 - [CoinbaseBrokerageProxyTradingApiGranularity](docs/CoinbaseBrokerageProxyTradingApiGranularity.md)
 - [CoinbaseBrokerageProxyTradingApiL2Level](docs/CoinbaseBrokerageProxyTradingApiL2Level.md)
 - [CoinbaseBrokerageProxyTradingApiLadder](docs/CoinbaseBrokerageProxyTradingApiLadder.md)
 - [CoinbaseBrokerageProxyTradingApiLadderBestPrice](docs/CoinbaseBrokerageProxyTradingApiLadderBestPrice.md)
 - [CoinbaseBrokerageProxyTradingApiLadderBestPriceError](docs/CoinbaseBrokerageProxyTradingApiLadderBestPriceError.md)
 - [CoinbaseBrokerageProxyTradingApiLadderPriceLevel](docs/CoinbaseBrokerageProxyTradingApiLadderPriceLevel.md)
 - [CoinbaseBrokerageProxyTradingApiLadderSpreadError](docs/CoinbaseBrokerageProxyTradingApiLadderSpreadError.md)
 - [CoinbaseBrokerageProxyTradingApiMarketTrade](docs/CoinbaseBrokerageProxyTradingApiMarketTrade.md)
 - [CoinbaseBrokerageProxyTradingApiMarketTradeIntervalData](docs/CoinbaseBrokerageProxyTradingApiMarketTradeIntervalData.md)
 - [CoinbaseBrokerageProxyTradingApiMarketTradeSideFilter](docs/CoinbaseBrokerageProxyTradingApiMarketTradeSideFilter.md)
 - [CoinbaseBrokerageProxyTradingApiMarketTrades](docs/CoinbaseBrokerageProxyTradingApiMarketTrades.md)
 - [CoinbaseBrokerageProxyTradingApiMarketTradesOrderByField](docs/CoinbaseBrokerageProxyTradingApiMarketTradesOrderByField.md)
 - [CoinbaseBrokerageProxyTradingApiMarketTradesVenueFilter](docs/CoinbaseBrokerageProxyTradingApiMarketTradesVenueFilter.md)
 - [CoinbaseBrokerageProxyTradingApiOrderPlacementSourceFilter](docs/CoinbaseBrokerageProxyTradingApiOrderPlacementSourceFilter.md)
 - [CoinbaseBrokerageProxyTradingApiOrderSimulated](docs/CoinbaseBrokerageProxyTradingApiOrderSimulated.md)
 - [CoinbaseBrokerageProxyTradingApiOrderStreamBody](docs/CoinbaseBrokerageProxyTradingApiOrderStreamBody.md)
 - [CoinbaseBrokerageProxyTradingApiOrderStreamResponse](docs/CoinbaseBrokerageProxyTradingApiOrderStreamResponse.md)
 - [CoinbaseBrokerageProxyTradingApiOrderTradeIntervalData](docs/CoinbaseBrokerageProxyTradingApiOrderTradeIntervalData.md)
 - [CoinbaseBrokerageProxyTradingApiProductPermissions](docs/CoinbaseBrokerageProxyTradingApiProductPermissions.md)
 - [CoinbaseBrokerageProxyTradingApiProductStats](docs/CoinbaseBrokerageProxyTradingApiProductStats.md)
 - [CoinbaseBrokerageProxyTradingApiSortDirection](docs/CoinbaseBrokerageProxyTradingApiSortDirection.md)
 - [CoinbaseBrokerageProxyTradingApiSpread](docs/CoinbaseBrokerageProxyTradingApiSpread.md)
 - [CoinbaseBrokerageProxyTradingApiTradeIntervalSize](docs/CoinbaseBrokerageProxyTradingApiTradeIntervalSize.md)
 - [CoinbaseBrokerageProxyTradingApiTradeReportFill](docs/CoinbaseBrokerageProxyTradingApiTradeReportFill.md)
 - [CoinbaseBrokerageProxyTradingApiTradeReportOrder](docs/CoinbaseBrokerageProxyTradingApiTradeReportOrder.md)
 - [CoinbaseBrokerageProxyTradingApiTradeReportVenueFill](docs/CoinbaseBrokerageProxyTradingApiTradeReportVenueFill.md)
 - [CoinbaseBrokerageProxyTradingApiUpdateIntervalCandles](docs/CoinbaseBrokerageProxyTradingApiUpdateIntervalCandles.md)
 - [CoinbaseBrokerageProxyTradingApiUpdateIntervalDepth](docs/CoinbaseBrokerageProxyTradingApiUpdateIntervalDepth.md)
 - [CoinbaseBrokerageProxyTradingApiUpdateIntervalLadder](docs/CoinbaseBrokerageProxyTradingApiUpdateIntervalLadder.md)
 - [CoinbaseBrokerageProxyTradingApiUpdateIntervalMarketTrades](docs/CoinbaseBrokerageProxyTradingApiUpdateIntervalMarketTrades.md)
 - [CoinbaseBrokerageProxyTradingApiUpdateIntervalOrders](docs/CoinbaseBrokerageProxyTradingApiUpdateIntervalOrders.md)
 - [CoinbaseBrokerageProxyTradingApiUpdateIntervalStats](docs/CoinbaseBrokerageProxyTradingApiUpdateIntervalStats.md)
 - [CoinbaseBrokerageTypesDecimal](docs/CoinbaseBrokerageTypesDecimal.md)
 - [CoinbaseCustodyApiAPIKeyChangePlatform](docs/CoinbaseCustodyApiAPIKeyChangePlatform.md)
 - [CoinbaseCustodyApiAPIKeyPermission](docs/CoinbaseCustodyApiAPIKeyPermission.md)
 - [CoinbaseCustodyApiAccessType](docs/CoinbaseCustodyApiAccessType.md)
 - [CoinbaseCustodyApiActiveValidator](docs/CoinbaseCustodyApiActiveValidator.md)
 - [CoinbaseCustodyApiActivity](docs/CoinbaseCustodyApiActivity.md)
 - [CoinbaseCustodyApiActivityCurrency](docs/CoinbaseCustodyApiActivityCurrency.md)
 - [CoinbaseCustodyApiActivityDetails](docs/CoinbaseCustodyApiActivityDetails.md)
 - [CoinbaseCustodyApiActivityState](docs/CoinbaseCustodyApiActivityState.md)
 - [CoinbaseCustodyApiActivityTimeRemaining](docs/CoinbaseCustodyApiActivityTimeRemaining.md)
 - [CoinbaseCustodyApiActivityTimelineEvent](docs/CoinbaseCustodyApiActivityTimelineEvent.md)
 - [CoinbaseCustodyApiActivityType](docs/CoinbaseCustodyApiActivityType.md)
 - [CoinbaseCustodyApiActivityUser](docs/CoinbaseCustodyApiActivityUser.md)
 - [CoinbaseCustodyApiAddress](docs/CoinbaseCustodyApiAddress.md)
 - [CoinbaseCustodyApiAddressBookEntry](docs/CoinbaseCustodyApiAddressBookEntry.md)
 - [CoinbaseCustodyApiAddressBookType](docs/CoinbaseCustodyApiAddressBookType.md)
 - [CoinbaseCustodyApiAddressState](docs/CoinbaseCustodyApiAddressState.md)
 - [CoinbaseCustodyApiAdminChangeRequestAuditData](docs/CoinbaseCustodyApiAdminChangeRequestAuditData.md)
 - [CoinbaseCustodyApiAdminChangeRequestAuditValue](docs/CoinbaseCustodyApiAdminChangeRequestAuditValue.md)
 - [CoinbaseCustodyApiAdminChangeRequestState](docs/CoinbaseCustodyApiAdminChangeRequestState.md)
 - [CoinbaseCustodyApiAdminChangeRequestTask](docs/CoinbaseCustodyApiAdminChangeRequestTask.md)
 - [CoinbaseCustodyApiApiKeyChangeAuditData](docs/CoinbaseCustodyApiApiKeyChangeAuditData.md)
 - [CoinbaseCustodyApiApiKeyChangeAuditValue](docs/CoinbaseCustodyApiApiKeyChangeAuditValue.md)
 - [CoinbaseCustodyApiApiKeyChangeCategory](docs/CoinbaseCustodyApiApiKeyChangeCategory.md)
 - [CoinbaseCustodyApiApiKeyChangeState](docs/CoinbaseCustodyApiApiKeyChangeState.md)
 - [CoinbaseCustodyApiApiKeyScope](docs/CoinbaseCustodyApiApiKeyScope.md)
 - [CoinbaseCustodyApiApprovalPlatform](docs/CoinbaseCustodyApiApprovalPlatform.md)
 - [CoinbaseCustodyApiAssignedValueStrategy](docs/CoinbaseCustodyApiAssignedValueStrategy.md)
 - [CoinbaseCustodyApiAuditableState](docs/CoinbaseCustodyApiAuditableState.md)
 - [CoinbaseCustodyApiAuditableType](docs/CoinbaseCustodyApiAuditableType.md)
 - [CoinbaseCustodyApiBalance](docs/CoinbaseCustodyApiBalance.md)
 - [CoinbaseCustodyApiBalanceScope](docs/CoinbaseCustodyApiBalanceScope.md)
 - [CoinbaseCustodyApiBillingAddressChangeAuditData](docs/CoinbaseCustodyApiBillingAddressChangeAuditData.md)
 - [CoinbaseCustodyApiBillingAddressChangeAuditValue](docs/CoinbaseCustodyApiBillingAddressChangeAuditValue.md)
 - [CoinbaseCustodyApiBillingAddressChangeState](docs/CoinbaseCustodyApiBillingAddressChangeState.md)
 - [CoinbaseCustodyApiBillingPreference](docs/CoinbaseCustodyApiBillingPreference.md)
 - [CoinbaseCustodyApiBillingPreferenceChangeAuditData](docs/CoinbaseCustodyApiBillingPreferenceChangeAuditData.md)
 - [CoinbaseCustodyApiBillingPreferenceChangeAuditValue](docs/CoinbaseCustodyApiBillingPreferenceChangeAuditValue.md)
 - [CoinbaseCustodyApiBillingPreferenceChangeCategory](docs/CoinbaseCustodyApiBillingPreferenceChangeCategory.md)
 - [CoinbaseCustodyApiBillingPreferenceChangeState](docs/CoinbaseCustodyApiBillingPreferenceChangeState.md)
 - [CoinbaseCustodyApiBillingPreferenceState](docs/CoinbaseCustodyApiBillingPreferenceState.md)
 - [CoinbaseCustodyApiCompletedEvaluation](docs/CoinbaseCustodyApiCompletedEvaluation.md)
 - [CoinbaseCustodyApiConditionValue](docs/CoinbaseCustodyApiConditionValue.md)
 - [CoinbaseCustodyApiConsensusSetting](docs/CoinbaseCustodyApiConsensusSetting.md)
 - [CoinbaseCustodyApiConsensusWithdrawalValue](docs/CoinbaseCustodyApiConsensusWithdrawalValue.md)
 - [CoinbaseCustodyApiConversionOptions](docs/CoinbaseCustodyApiConversionOptions.md)
 - [CoinbaseCustodyApiCreateVideoUploadRequest](docs/CoinbaseCustodyApiCreateVideoUploadRequest.md)
 - [CoinbaseCustodyApiCryptoDepositAddress](docs/CoinbaseCustodyApiCryptoDepositAddress.md)
 - [CoinbaseCustodyApiCryptoNetwork](docs/CoinbaseCustodyApiCryptoNetwork.md)
 - [CoinbaseCustodyApiCurrency](docs/CoinbaseCustodyApiCurrency.md)
 - [CoinbaseCustodyApiCurrencyType](docs/CoinbaseCustodyApiCurrencyType.md)
 - [CoinbaseCustodyApiDestinationOptions](docs/CoinbaseCustodyApiDestinationOptions.md)
 - [CoinbaseCustodyApiDestinationTag](docs/CoinbaseCustodyApiDestinationTag.md)
 - [CoinbaseCustodyApiDismissNotificationRequest](docs/CoinbaseCustodyApiDismissNotificationRequest.md)
 - [CoinbaseCustodyApiDismissNotificationResponse](docs/CoinbaseCustodyApiDismissNotificationResponse.md)
 - [CoinbaseCustodyApiDisplayUser](docs/CoinbaseCustodyApiDisplayUser.md)
 - [CoinbaseCustodyApiDocumentSignature](docs/CoinbaseCustodyApiDocumentSignature.md)
 - [CoinbaseCustodyApiDocumentSignatureAuditData](docs/CoinbaseCustodyApiDocumentSignatureAuditData.md)
 - [CoinbaseCustodyApiDocumentSignatureAuditValue](docs/CoinbaseCustodyApiDocumentSignatureAuditValue.md)
 - [CoinbaseCustodyApiDocumentSignatureState](docs/CoinbaseCustodyApiDocumentSignatureState.md)
 - [CoinbaseCustodyApiDocumentType](docs/CoinbaseCustodyApiDocumentType.md)
 - [CoinbaseCustodyApiEmailList](docs/CoinbaseCustodyApiEmailList.md)
 - [CoinbaseCustodyApiEmailListAction](docs/CoinbaseCustodyApiEmailListAction.md)
 - [CoinbaseCustodyApiEmailListChangeAuditData](docs/CoinbaseCustodyApiEmailListChangeAuditData.md)
 - [CoinbaseCustodyApiEmailListChangeAuditValue](docs/CoinbaseCustodyApiEmailListChangeAuditValue.md)
 - [CoinbaseCustodyApiEmailListChangeState](docs/CoinbaseCustodyApiEmailListChangeState.md)
 - [CoinbaseCustodyApiEmailListState](docs/CoinbaseCustodyApiEmailListState.md)
 - [CoinbaseCustodyApiEmailListType](docs/CoinbaseCustodyApiEmailListType.md)
 - [CoinbaseCustodyApiEnabledValue](docs/CoinbaseCustodyApiEnabledValue.md)
 - [CoinbaseCustodyApiEvaluationInput](docs/CoinbaseCustodyApiEvaluationInput.md)
 - [CoinbaseCustodyApiExperience](docs/CoinbaseCustodyApiExperience.md)
 - [CoinbaseCustodyApiFeeEstimate](docs/CoinbaseCustodyApiFeeEstimate.md)
 - [CoinbaseCustodyApiFinishVideoUploadRequest](docs/CoinbaseCustodyApiFinishVideoUploadRequest.md)
 - [CoinbaseCustodyApiGetBalanceResponse](docs/CoinbaseCustodyApiGetBalanceResponse.md)
 - [CoinbaseCustodyApiGetNotificationsResponse](docs/CoinbaseCustodyApiGetNotificationsResponse.md)
 - [CoinbaseCustodyApiGetStakeTimeEstimationResponse](docs/CoinbaseCustodyApiGetStakeTimeEstimationResponse.md)
 - [CoinbaseCustodyApiGetStakingActivityDetailsResponse](docs/CoinbaseCustodyApiGetStakingActivityDetailsResponse.md)
 - [CoinbaseCustodyApiGetUnstakeTimeEstimationResponse](docs/CoinbaseCustodyApiGetUnstakeTimeEstimationResponse.md)
 - [CoinbaseCustodyApiGetUserInformationResponse](docs/CoinbaseCustodyApiGetUserInformationResponse.md)
 - [CoinbaseCustodyApiGetVideoUploadPermissionsResponse](docs/CoinbaseCustodyApiGetVideoUploadPermissionsResponse.md)
 - [CoinbaseCustodyApiGetVotingWeightsResponse](docs/CoinbaseCustodyApiGetVotingWeightsResponse.md)
 - [CoinbaseCustodyApiGovernanceProposal](docs/CoinbaseCustodyApiGovernanceProposal.md)
 - [CoinbaseCustodyApiGovernanceTopic](docs/CoinbaseCustodyApiGovernanceTopic.md)
 - [CoinbaseCustodyApiGovernanceTopicState](docs/CoinbaseCustodyApiGovernanceTopicState.md)
 - [CoinbaseCustodyApiGovernanceTopicType](docs/CoinbaseCustodyApiGovernanceTopicType.md)
 - [CoinbaseCustodyApiGovernanceVote](docs/CoinbaseCustodyApiGovernanceVote.md)
 - [CoinbaseCustodyApiGovernanceVoteAuditData](docs/CoinbaseCustodyApiGovernanceVoteAuditData.md)
 - [CoinbaseCustodyApiGovernanceVoteState](docs/CoinbaseCustodyApiGovernanceVoteState.md)
 - [CoinbaseCustodyApiGroupType](docs/CoinbaseCustodyApiGroupType.md)
 - [CoinbaseCustodyApiHierarchy](docs/CoinbaseCustodyApiHierarchy.md)
 - [CoinbaseCustodyApiHierarchyType](docs/CoinbaseCustodyApiHierarchyType.md)
 - [CoinbaseCustodyApiInvestmentVehicle](docs/CoinbaseCustodyApiInvestmentVehicle.md)
 - [CoinbaseCustodyApiInvestmentVehicleEntity](docs/CoinbaseCustodyApiInvestmentVehicleEntity.md)
 - [CoinbaseCustodyApiInvitation](docs/CoinbaseCustodyApiInvitation.md)
 - [CoinbaseCustodyApiInvitationAuditData](docs/CoinbaseCustodyApiInvitationAuditData.md)
 - [CoinbaseCustodyApiInvitationRole](docs/CoinbaseCustodyApiInvitationRole.md)
 - [CoinbaseCustodyApiInvitationSecondaryRole](docs/CoinbaseCustodyApiInvitationSecondaryRole.md)
 - [CoinbaseCustodyApiInvitationState](docs/CoinbaseCustodyApiInvitationState.md)
 - [CoinbaseCustodyApiInvoice](docs/CoinbaseCustodyApiInvoice.md)
 - [CoinbaseCustodyApiInvoiceState](docs/CoinbaseCustodyApiInvoiceState.md)
 - [CoinbaseCustodyApiKeyRegistrationOptions](docs/CoinbaseCustodyApiKeyRegistrationOptions.md)
 - [CoinbaseCustodyApiListVideoUploadsResponse](docs/CoinbaseCustodyApiListVideoUploadsResponse.md)
 - [CoinbaseCustodyApiMacbethAccount](docs/CoinbaseCustodyApiMacbethAccount.md)
 - [CoinbaseCustodyApiMaxWithdrawalLimitValue](docs/CoinbaseCustodyApiMaxWithdrawalLimitValue.md)
 - [CoinbaseCustodyApiMemo](docs/CoinbaseCustodyApiMemo.md)
 - [CoinbaseCustodyApiMiddleOfficeOptions](docs/CoinbaseCustodyApiMiddleOfficeOptions.md)
 - [CoinbaseCustodyApiNotification](docs/CoinbaseCustodyApiNotification.md)
 - [CoinbaseCustodyApiOrganization](docs/CoinbaseCustodyApiOrganization.md)
 - [CoinbaseCustodyApiOrganizationAULStatus](docs/CoinbaseCustodyApiOrganizationAULStatus.md)
 - [CoinbaseCustodyApiOutcome](docs/CoinbaseCustodyApiOutcome.md)
 - [CoinbaseCustodyApiOutcomeDetail](docs/CoinbaseCustodyApiOutcomeDetail.md)
 - [CoinbaseCustodyApiPaymentMethodChangeAuditData](docs/CoinbaseCustodyApiPaymentMethodChangeAuditData.md)
 - [CoinbaseCustodyApiPaymentMethodChangeAuditValue](docs/CoinbaseCustodyApiPaymentMethodChangeAuditValue.md)
 - [CoinbaseCustodyApiPaymentMethodChangeCategory](docs/CoinbaseCustodyApiPaymentMethodChangeCategory.md)
 - [CoinbaseCustodyApiPaymentMethodChangeState](docs/CoinbaseCustodyApiPaymentMethodChangeState.md)
 - [CoinbaseCustodyApiPaymentMethodSummary](docs/CoinbaseCustodyApiPaymentMethodSummary.md)
 - [CoinbaseCustodyApiPaymentMethodType](docs/CoinbaseCustodyApiPaymentMethodType.md)
 - [CoinbaseCustodyApiPermission](docs/CoinbaseCustodyApiPermission.md)
 - [CoinbaseCustodyApiPortfolio](docs/CoinbaseCustodyApiPortfolio.md)
 - [CoinbaseCustodyApiPortfolioBalance](docs/CoinbaseCustodyApiPortfolioBalance.md)
 - [CoinbaseCustodyApiPortfolioType](docs/CoinbaseCustodyApiPortfolioType.md)
 - [CoinbaseCustodyApiPropertiesEnabled](docs/CoinbaseCustodyApiPropertiesEnabled.md)
 - [CoinbaseCustodyApiQueryLevel](docs/CoinbaseCustodyApiQueryLevel.md)
 - [CoinbaseCustodyApiRedeemRequestStatus](docs/CoinbaseCustodyApiRedeemRequestStatus.md)
 - [CoinbaseCustodyApiRedoPlanAuditData](docs/CoinbaseCustodyApiRedoPlanAuditData.md)
 - [CoinbaseCustodyApiRedoPlanAuditValue](docs/CoinbaseCustodyApiRedoPlanAuditValue.md)
 - [CoinbaseCustodyApiRedoPlanState](docs/CoinbaseCustodyApiRedoPlanState.md)
 - [CoinbaseCustodyApiRequiredApprovalValue](docs/CoinbaseCustodyApiRequiredApprovalValue.md)
 - [CoinbaseCustodyApiRequiredApprovalValueApprovalThreshold](docs/CoinbaseCustodyApiRequiredApprovalValueApprovalThreshold.md)
 - [CoinbaseCustodyApiRequiredWithdrawalOptions](docs/CoinbaseCustodyApiRequiredWithdrawalOptions.md)
 - [CoinbaseCustodyApiRewardOptions](docs/CoinbaseCustodyApiRewardOptions.md)
 - [CoinbaseCustodyApiRewardsBalance](docs/CoinbaseCustodyApiRewardsBalance.md)
 - [CoinbaseCustodyApiRole](docs/CoinbaseCustodyApiRole.md)
 - [CoinbaseCustodyApiSaturationLevel](docs/CoinbaseCustodyApiSaturationLevel.md)
 - [CoinbaseCustodyApiSecondaryAuditableType](docs/CoinbaseCustodyApiSecondaryAuditableType.md)
 - [CoinbaseCustodyApiSecondaryRole](docs/CoinbaseCustodyApiSecondaryRole.md)
 - [CoinbaseCustodyApiSettings](docs/CoinbaseCustodyApiSettings.md)
 - [CoinbaseCustodyApiSettingsChangeAuditData](docs/CoinbaseCustodyApiSettingsChangeAuditData.md)
 - [CoinbaseCustodyApiSettingsChangeAuditValue](docs/CoinbaseCustodyApiSettingsChangeAuditValue.md)
 - [CoinbaseCustodyApiSettingsChangeState](docs/CoinbaseCustodyApiSettingsChangeState.md)
 - [CoinbaseCustodyApiSettingsKey](docs/CoinbaseCustodyApiSettingsKey.md)
 - [CoinbaseCustodyApiSettingsSpecKey](docs/CoinbaseCustodyApiSettingsSpecKey.md)
 - [CoinbaseCustodyApiSettingsValue](docs/CoinbaseCustodyApiSettingsValue.md)
 - [CoinbaseCustodyApiSmartContract](docs/CoinbaseCustodyApiSmartContract.md)
 - [CoinbaseCustodyApiSmartContractRelease](docs/CoinbaseCustodyApiSmartContractRelease.md)
 - [CoinbaseCustodyApiSmartContractReleaseAuditData](docs/CoinbaseCustodyApiSmartContractReleaseAuditData.md)
 - [CoinbaseCustodyApiSmartContractReleaseState](docs/CoinbaseCustodyApiSmartContractReleaseState.md)
 - [CoinbaseCustodyApiSmartContractReleaseType](docs/CoinbaseCustodyApiSmartContractReleaseType.md)
 - [CoinbaseCustodyApiSmartContractState](docs/CoinbaseCustodyApiSmartContractState.md)
 - [CoinbaseCustodyApiStakingBalance](docs/CoinbaseCustodyApiStakingBalance.md)
 - [CoinbaseCustodyApiStakingOptions](docs/CoinbaseCustodyApiStakingOptions.md)
 - [CoinbaseCustodyApiStakingValidator](docs/CoinbaseCustodyApiStakingValidator.md)
 - [CoinbaseCustodyApiStandardAuditValue](docs/CoinbaseCustodyApiStandardAuditValue.md)
 - [CoinbaseCustodyApiTestTransaction](docs/CoinbaseCustodyApiTestTransaction.md)
 - [CoinbaseCustodyApiTestTransactionState](docs/CoinbaseCustodyApiTestTransactionState.md)
 - [CoinbaseCustodyApiToken](docs/CoinbaseCustodyApiToken.md)
 - [CoinbaseCustodyApiTotalFiatBalance](docs/CoinbaseCustodyApiTotalFiatBalance.md)
 - [CoinbaseCustodyApiTransactionAuditData](docs/CoinbaseCustodyApiTransactionAuditData.md)
 - [CoinbaseCustodyApiTransactionAuditDataCoinbaseTransactionType](docs/CoinbaseCustodyApiTransactionAuditDataCoinbaseTransactionType.md)
 - [CoinbaseCustodyApiTransactionAuditDataRedoTxInfo](docs/CoinbaseCustodyApiTransactionAuditDataRedoTxInfo.md)
 - [CoinbaseCustodyApiTransactionAuditDataTestWithdrawal](docs/CoinbaseCustodyApiTransactionAuditDataTestWithdrawal.md)
 - [CoinbaseCustodyApiTransactionAuditValue](docs/CoinbaseCustodyApiTransactionAuditValue.md)
 - [CoinbaseCustodyApiTransactionState](docs/CoinbaseCustodyApiTransactionState.md)
 - [CoinbaseCustodyApiTransactionType](docs/CoinbaseCustodyApiTransactionType.md)
 - [CoinbaseCustodyApiTransferCurrencyType](docs/CoinbaseCustodyApiTransferCurrencyType.md)
 - [CoinbaseCustodyApiTransferMetadata](docs/CoinbaseCustodyApiTransferMetadata.md)
 - [CoinbaseCustodyApiTransferMethod](docs/CoinbaseCustodyApiTransferMethod.md)
 - [CoinbaseCustodyApiTransferMethodType](docs/CoinbaseCustodyApiTransferMethodType.md)
 - [CoinbaseCustodyApiTransferSummary](docs/CoinbaseCustodyApiTransferSummary.md)
 - [CoinbaseCustodyApiTransferType](docs/CoinbaseCustodyApiTransferType.md)
 - [CoinbaseCustodyApiUnbondingStatus](docs/CoinbaseCustodyApiUnbondingStatus.md)
 - [CoinbaseCustodyApiUser](docs/CoinbaseCustodyApiUser.md)
 - [CoinbaseCustodyApiUserChangeAuditData](docs/CoinbaseCustodyApiUserChangeAuditData.md)
 - [CoinbaseCustodyApiUserChangeAuditValue](docs/CoinbaseCustodyApiUserChangeAuditValue.md)
 - [CoinbaseCustodyApiUserChangeCategory](docs/CoinbaseCustodyApiUserChangeCategory.md)
 - [CoinbaseCustodyApiUserChangeRequestAuditData](docs/CoinbaseCustodyApiUserChangeRequestAuditData.md)
 - [CoinbaseCustodyApiUserChangeRequestState](docs/CoinbaseCustodyApiUserChangeRequestState.md)
 - [CoinbaseCustodyApiUserChangeRequestTask](docs/CoinbaseCustodyApiUserChangeRequestTask.md)
 - [CoinbaseCustodyApiUserChangeRole](docs/CoinbaseCustodyApiUserChangeRole.md)
 - [CoinbaseCustodyApiUserChangeSecondaryRole](docs/CoinbaseCustodyApiUserChangeSecondaryRole.md)
 - [CoinbaseCustodyApiUserChangeState](docs/CoinbaseCustodyApiUserChangeState.md)
 - [CoinbaseCustodyApiUserInformation](docs/CoinbaseCustodyApiUserInformation.md)
 - [CoinbaseCustodyApiUserLastActivity](docs/CoinbaseCustodyApiUserLastActivity.md)
 - [CoinbaseCustodyApiUserPortfolioRole](docs/CoinbaseCustodyApiUserPortfolioRole.md)
 - [CoinbaseCustodyApiUserPortfolioRoles](docs/CoinbaseCustodyApiUserPortfolioRoles.md)
 - [CoinbaseCustodyApiUserRole](docs/CoinbaseCustodyApiUserRole.md)
 - [CoinbaseCustodyApiValidationError](docs/CoinbaseCustodyApiValidationError.md)
 - [CoinbaseCustodyApiValidatorCategory](docs/CoinbaseCustodyApiValidatorCategory.md)
 - [CoinbaseCustodyApiValidatorStatus](docs/CoinbaseCustodyApiValidatorStatus.md)
 - [CoinbaseCustodyApiVestingBalance](docs/CoinbaseCustodyApiVestingBalance.md)
 - [CoinbaseCustodyApiVideoCallSetting](docs/CoinbaseCustodyApiVideoCallSetting.md)
 - [CoinbaseCustodyApiVideoUpload](docs/CoinbaseCustodyApiVideoUpload.md)
 - [CoinbaseCustodyApiVideoUploadState](docs/CoinbaseCustodyApiVideoUploadState.md)
 - [CoinbaseCustodyApiVoteAuthorizeOptions](docs/CoinbaseCustodyApiVoteAuthorizeOptions.md)
 - [CoinbaseCustodyApiWallet](docs/CoinbaseCustodyApiWallet.md)
 - [CoinbaseCustodyApiWalletAction](docs/CoinbaseCustodyApiWalletAction.md)
 - [CoinbaseCustodyApiWalletChangeAuditData](docs/CoinbaseCustodyApiWalletChangeAuditData.md)
 - [CoinbaseCustodyApiWalletChangeAuditValue](docs/CoinbaseCustodyApiWalletChangeAuditValue.md)
 - [CoinbaseCustodyApiWalletChangeCategory](docs/CoinbaseCustodyApiWalletChangeCategory.md)
 - [CoinbaseCustodyApiWalletChangeState](docs/CoinbaseCustodyApiWalletChangeState.md)
 - [CoinbaseCustodyApiWalletRewardsStatus](docs/CoinbaseCustodyApiWalletRewardsStatus.md)
 - [CoinbaseCustodyApiWalletStakingStatus](docs/CoinbaseCustodyApiWalletStakingStatus.md)
 - [CoinbaseCustodyApiWalletStakingStatusState](docs/CoinbaseCustodyApiWalletStakingStatusState.md)
 - [CoinbaseCustodyApiWalletState](docs/CoinbaseCustodyApiWalletState.md)
 - [CoinbaseCustodyApiWalletType](docs/CoinbaseCustodyApiWalletType.md)
 - [CoinbaseCustodyApiWalletVestingStatus](docs/CoinbaseCustodyApiWalletVestingStatus.md)
 - [CoinbaseCustodyApiWeb3Signers](docs/CoinbaseCustodyApiWeb3Signers.md)
 - [CoinbaseCustodyApiWithdrawalAddressChangeAuditData](docs/CoinbaseCustodyApiWithdrawalAddressChangeAuditData.md)
 - [CoinbaseCustodyApiWithdrawalAddressChangeAuditValue](docs/CoinbaseCustodyApiWithdrawalAddressChangeAuditValue.md)
 - [CoinbaseCustodyApiWithdrawalAddressChangeCategory](docs/CoinbaseCustodyApiWithdrawalAddressChangeCategory.md)
 - [CoinbaseCustodyApiWithdrawalAddressChangeState](docs/CoinbaseCustodyApiWithdrawalAddressChangeState.md)
 - [CoinbaseDocumentApiV1ReportType](docs/CoinbaseDocumentApiV1ReportType.md)
 - [CoinbaseEngPrimeActivityApiAccountMetadata](docs/CoinbaseEngPrimeActivityApiAccountMetadata.md)
 - [CoinbaseEngPrimeActivityApiAction](docs/CoinbaseEngPrimeActivityApiAction.md)
 - [CoinbaseEngPrimeActivityApiActivity](docs/CoinbaseEngPrimeActivityApiActivity.md)
 - [CoinbaseEngPrimeActivityApiActivityCategory](docs/CoinbaseEngPrimeActivityApiActivityCategory.md)
 - [CoinbaseEngPrimeActivityApiActivitySecondaryType](docs/CoinbaseEngPrimeActivityApiActivitySecondaryType.md)
 - [CoinbaseEngPrimeActivityApiActivityStatus](docs/CoinbaseEngPrimeActivityApiActivityStatus.md)
 - [CoinbaseEngPrimeActivityApiActivityType](docs/CoinbaseEngPrimeActivityApiActivityType.md)
 - [CoinbaseEngPrimeActivityApiAllocationMetadata](docs/CoinbaseEngPrimeActivityApiAllocationMetadata.md)
 - [CoinbaseEngPrimeActivityApiBillingWithdrawalMetadata](docs/CoinbaseEngPrimeActivityApiBillingWithdrawalMetadata.md)
 - [CoinbaseEngPrimeActivityApiConsensusMetadata](docs/CoinbaseEngPrimeActivityApiConsensusMetadata.md)
 - [CoinbaseEngPrimeActivityApiConversionMetadata](docs/CoinbaseEngPrimeActivityApiConversionMetadata.md)
 - [CoinbaseEngPrimeActivityApiHierarchy](docs/CoinbaseEngPrimeActivityApiHierarchy.md)
 - [CoinbaseEngPrimeActivityApiHierarchyType](docs/CoinbaseEngPrimeActivityApiHierarchyType.md)
 - [CoinbaseEngPrimeActivityApiOrderExecutionMetadata](docs/CoinbaseEngPrimeActivityApiOrderExecutionMetadata.md)
 - [CoinbaseEngPrimeActivityApiRoleChangeTypes](docs/CoinbaseEngPrimeActivityApiRoleChangeTypes.md)
 - [CoinbaseEngPrimeActivityApiTimeline](docs/CoinbaseEngPrimeActivityApiTimeline.md)
 - [CoinbaseEngPrimeActivityApiTimelineEvent](docs/CoinbaseEngPrimeActivityApiTimelineEvent.md)
 - [CoinbaseEngPrimeActivityApiTransactionMetadata](docs/CoinbaseEngPrimeActivityApiTransactionMetadata.md)
 - [CoinbaseEngPrimeActivityApiUserAction](docs/CoinbaseEngPrimeActivityApiUserAction.md)
 - [CoinbaseEngPrimeActivityApiUserChangeMetadata](docs/CoinbaseEngPrimeActivityApiUserChangeMetadata.md)
 - [CoinbaseEngPrimeActivityApiUserInformation](docs/CoinbaseEngPrimeActivityApiUserInformation.md)
 - [CoinbaseEngPrimeActivityApiUserRoles](docs/CoinbaseEngPrimeActivityApiUserRoles.md)
 - [CoinbaseEngPrimeApiApiAcceptInvitationRequest](docs/CoinbaseEngPrimeApiApiAcceptInvitationRequest.md)
 - [CoinbaseEngPrimeApiApiAcceptInvitationResponse](docs/CoinbaseEngPrimeApiApiAcceptInvitationResponse.md)
 - [CoinbaseEngPrimeApiApiActivateAPIKeyRequest](docs/CoinbaseEngPrimeApiApiActivateAPIKeyRequest.md)
 - [CoinbaseEngPrimeApiApiActivateAPIKeyRequestV2](docs/CoinbaseEngPrimeApiApiActivateAPIKeyRequestV2.md)
 - [CoinbaseEngPrimeApiApiActivateAPIKeyResponse](docs/CoinbaseEngPrimeApiApiActivateAPIKeyResponse.md)
 - [CoinbaseEngPrimeApiApiActivityAction](docs/CoinbaseEngPrimeApiApiActivityAction.md)
 - [CoinbaseEngPrimeApiApiActivityActionId](docs/CoinbaseEngPrimeApiApiActivityActionId.md)
 - [CoinbaseEngPrimeApiApiActivityConsensusAuditResult](docs/CoinbaseEngPrimeApiApiActivityConsensusAuditResult.md)
 - [CoinbaseEngPrimeApiApiAddress](docs/CoinbaseEngPrimeApiApiAddress.md)
 - [CoinbaseEngPrimeApiApiAddressBookResponse](docs/CoinbaseEngPrimeApiApiAddressBookResponse.md)
 - [CoinbaseEngPrimeApiApiAddressBookType](docs/CoinbaseEngPrimeApiApiAddressBookType.md)
 - [CoinbaseEngPrimeApiApiAddressState](docs/CoinbaseEngPrimeApiApiAddressState.md)
 - [CoinbaseEngPrimeApiApiAdvancedTransferActivityDetails](docs/CoinbaseEngPrimeApiApiAdvancedTransferActivityDetails.md)
 - [CoinbaseEngPrimeApiApiAllocation](docs/CoinbaseEngPrimeApiApiAllocation.md)
 - [CoinbaseEngPrimeApiApiAllocationAmount](docs/CoinbaseEngPrimeApiApiAllocationAmount.md)
 - [CoinbaseEngPrimeApiApiAllocationLeg](docs/CoinbaseEngPrimeApiApiAllocationLeg.md)
 - [CoinbaseEngPrimeApiApiAllocationPreviewLeg](docs/CoinbaseEngPrimeApiApiAllocationPreviewLeg.md)
 - [CoinbaseEngPrimeApiApiAllocationStatus](docs/CoinbaseEngPrimeApiApiAllocationStatus.md)
 - [CoinbaseEngPrimeApiApiAmountDue](docs/CoinbaseEngPrimeApiApiAmountDue.md)
 - [CoinbaseEngPrimeApiApiAmountField](docs/CoinbaseEngPrimeApiApiAmountField.md)
 - [CoinbaseEngPrimeApiApiArchiveSecurityKey](docs/CoinbaseEngPrimeApiApiArchiveSecurityKey.md)
 - [CoinbaseEngPrimeApiApiAssetVisibilityStatus](docs/CoinbaseEngPrimeApiApiAssetVisibilityStatus.md)
 - [CoinbaseEngPrimeApiApiAssociation](docs/CoinbaseEngPrimeApiApiAssociation.md)
 - [CoinbaseEngPrimeApiApiAssociationType](docs/CoinbaseEngPrimeApiApiAssociationType.md)
 - [CoinbaseEngPrimeApiApiAuthenticationExtensionsClientInputs](docs/CoinbaseEngPrimeApiApiAuthenticationExtensionsClientInputs.md)
 - [CoinbaseEngPrimeApiApiAuthenticationExtensionsClientOutputs](docs/CoinbaseEngPrimeApiApiAuthenticationExtensionsClientOutputs.md)
 - [CoinbaseEngPrimeApiApiAuthenticatorSelectionCriteria](docs/CoinbaseEngPrimeApiApiAuthenticatorSelectionCriteria.md)
 - [CoinbaseEngPrimeApiApiAutoBillingPreference](docs/CoinbaseEngPrimeApiApiAutoBillingPreference.md)
 - [CoinbaseEngPrimeApiApiBalance](docs/CoinbaseEngPrimeApiApiBalance.md)
 - [CoinbaseEngPrimeApiApiBalanceCurrency](docs/CoinbaseEngPrimeApiApiBalanceCurrency.md)
 - [CoinbaseEngPrimeApiApiBalanceOwner](docs/CoinbaseEngPrimeApiApiBalanceOwner.md)
 - [CoinbaseEngPrimeApiApiBillingPreferenceState](docs/CoinbaseEngPrimeApiApiBillingPreferenceState.md)
 - [CoinbaseEngPrimeApiApiBlockchainAddress](docs/CoinbaseEngPrimeApiApiBlockchainAddress.md)
 - [CoinbaseEngPrimeApiApiBlockchainNetwork](docs/CoinbaseEngPrimeApiApiBlockchainNetwork.md)
 - [CoinbaseEngPrimeApiApiBlockchainNetworks](docs/CoinbaseEngPrimeApiApiBlockchainNetworks.md)
 - [CoinbaseEngPrimeApiApiBollingerBands](docs/CoinbaseEngPrimeApiApiBollingerBands.md)
 - [CoinbaseEngPrimeApiApiBulkUserRolesUpdateRequest](docs/CoinbaseEngPrimeApiApiBulkUserRolesUpdateRequest.md)
 - [CoinbaseEngPrimeApiApiBulkUserRolesUpdateResponse](docs/CoinbaseEngPrimeApiApiBulkUserRolesUpdateResponse.md)
 - [CoinbaseEngPrimeApiApiCancelOrderFailureReason](docs/CoinbaseEngPrimeApiApiCancelOrderFailureReason.md)
 - [CoinbaseEngPrimeApiApiCancelOrderResult](docs/CoinbaseEngPrimeApiApiCancelOrderResult.md)
 - [CoinbaseEngPrimeApiApiCancelTransactionRequest](docs/CoinbaseEngPrimeApiApiCancelTransactionRequest.md)
 - [CoinbaseEngPrimeApiApiCancelTransactionResponse](docs/CoinbaseEngPrimeApiApiCancelTransactionResponse.md)
 - [CoinbaseEngPrimeApiApiChartConfiguration](docs/CoinbaseEngPrimeApiApiChartConfiguration.md)
 - [CoinbaseEngPrimeApiApiConfig](docs/CoinbaseEngPrimeApiApiConfig.md)
 - [CoinbaseEngPrimeApiApiConfigType](docs/CoinbaseEngPrimeApiApiConfigType.md)
 - [CoinbaseEngPrimeApiApiConversionActivityDetails](docs/CoinbaseEngPrimeApiApiConversionActivityDetails.md)
 - [CoinbaseEngPrimeApiApiConversionSummary](docs/CoinbaseEngPrimeApiApiConversionSummary.md)
 - [CoinbaseEngPrimeApiApiCounterparty](docs/CoinbaseEngPrimeApiApiCounterparty.md)
 - [CoinbaseEngPrimeApiApiCreateAPIKeyRequest](docs/CoinbaseEngPrimeApiApiCreateAPIKeyRequest.md)
 - [CoinbaseEngPrimeApiApiCreateAPIKeyRequestV2](docs/CoinbaseEngPrimeApiApiCreateAPIKeyRequestV2.md)
 - [CoinbaseEngPrimeApiApiCreateAPIKeyResponse](docs/CoinbaseEngPrimeApiApiCreateAPIKeyResponse.md)
 - [CoinbaseEngPrimeApiApiCreateInvitationRequest](docs/CoinbaseEngPrimeApiApiCreateInvitationRequest.md)
 - [CoinbaseEngPrimeApiApiCreateOrUpdatePreferenceRequest](docs/CoinbaseEngPrimeApiApiCreateOrUpdatePreferenceRequest.md)
 - [CoinbaseEngPrimeApiApiCreateOrUpdatePreferenceResponse](docs/CoinbaseEngPrimeApiApiCreateOrUpdatePreferenceResponse.md)
 - [CoinbaseEngPrimeApiApiCreateOrderFillsDocumentRequest](docs/CoinbaseEngPrimeApiApiCreateOrderFillsDocumentRequest.md)
 - [CoinbaseEngPrimeApiApiCreateOrderFillsDocumentResponse](docs/CoinbaseEngPrimeApiApiCreateOrderFillsDocumentResponse.md)
 - [CoinbaseEngPrimeApiApiCreateTestTransactionRequest](docs/CoinbaseEngPrimeApiApiCreateTestTransactionRequest.md)
 - [CoinbaseEngPrimeApiApiCreateTestTransactionResponse](docs/CoinbaseEngPrimeApiApiCreateTestTransactionResponse.md)
 - [CoinbaseEngPrimeApiApiCreateTransactionRequest](docs/CoinbaseEngPrimeApiApiCreateTransactionRequest.md)
 - [CoinbaseEngPrimeApiApiCreateTransactionV2Request](docs/CoinbaseEngPrimeApiApiCreateTransactionV2Request.md)
 - [CoinbaseEngPrimeApiApiCreateWalletRequest](docs/CoinbaseEngPrimeApiApiCreateWalletRequest.md)
 - [CoinbaseEngPrimeApiApiCreateWalletResponse](docs/CoinbaseEngPrimeApiApiCreateWalletResponse.md)
 - [CoinbaseEngPrimeApiApiCreateWalletV2Request](docs/CoinbaseEngPrimeApiApiCreateWalletV2Request.md)
 - [CoinbaseEngPrimeApiApiCreateWeb3ActionRequest](docs/CoinbaseEngPrimeApiApiCreateWeb3ActionRequest.md)
 - [CoinbaseEngPrimeApiApiCryptoNetwork](docs/CoinbaseEngPrimeApiApiCryptoNetwork.md)
 - [CoinbaseEngPrimeApiApiCurrency](docs/CoinbaseEngPrimeApiApiCurrency.md)
 - [CoinbaseEngPrimeApiApiCurrencyInfo](docs/CoinbaseEngPrimeApiApiCurrencyInfo.md)
 - [CoinbaseEngPrimeApiApiCurrencyInfoOverrides](docs/CoinbaseEngPrimeApiApiCurrencyInfoOverrides.md)
 - [CoinbaseEngPrimeApiApiCurrencyInfoQueryLevel](docs/CoinbaseEngPrimeApiApiCurrencyInfoQueryLevel.md)
 - [CoinbaseEngPrimeApiApiCurrencyInfoWeb3Overrides](docs/CoinbaseEngPrimeApiApiCurrencyInfoWeb3Overrides.md)
 - [CoinbaseEngPrimeApiApiDeactivateAPIKeyRequest](docs/CoinbaseEngPrimeApiApiDeactivateAPIKeyRequest.md)
 - [CoinbaseEngPrimeApiApiDeactivateAPIKeyRequestV2](docs/CoinbaseEngPrimeApiApiDeactivateAPIKeyRequestV2.md)
 - [CoinbaseEngPrimeApiApiDeactivateAPIKeyResponse](docs/CoinbaseEngPrimeApiApiDeactivateAPIKeyResponse.md)
 - [CoinbaseEngPrimeApiApiDefaultPortfolioUpdate](docs/CoinbaseEngPrimeApiApiDefaultPortfolioUpdate.md)
 - [CoinbaseEngPrimeApiApiDeleteAddressBookEntryResponse](docs/CoinbaseEngPrimeApiApiDeleteAddressBookEntryResponse.md)
 - [CoinbaseEngPrimeApiApiDeletePaymentMethodRequest](docs/CoinbaseEngPrimeApiApiDeletePaymentMethodRequest.md)
 - [CoinbaseEngPrimeApiApiDeletePaymentMethodResponse](docs/CoinbaseEngPrimeApiApiDeletePaymentMethodResponse.md)
 - [CoinbaseEngPrimeApiApiDevice](docs/CoinbaseEngPrimeApiApiDevice.md)
 - [CoinbaseEngPrimeApiApiDeviceGroup](docs/CoinbaseEngPrimeApiApiDeviceGroup.md)
 - [CoinbaseEngPrimeApiApiDeviceOsName](docs/CoinbaseEngPrimeApiApiDeviceOsName.md)
 - [CoinbaseEngPrimeApiApiDeviceState](docs/CoinbaseEngPrimeApiApiDeviceState.md)
 - [CoinbaseEngPrimeApiApiDocument](docs/CoinbaseEngPrimeApiApiDocument.md)
 - [CoinbaseEngPrimeApiApiDocumentDownloadBundle](docs/CoinbaseEngPrimeApiApiDocumentDownloadBundle.md)
 - [CoinbaseEngPrimeApiApiDownloadActivityReportResponse](docs/CoinbaseEngPrimeApiApiDownloadActivityReportResponse.md)
 - [CoinbaseEngPrimeApiApiEnrollInStablecoinRewardsRequest](docs/CoinbaseEngPrimeApiApiEnrollInStablecoinRewardsRequest.md)
 - [CoinbaseEngPrimeApiApiEnrollInStablecoinRewardsResponse](docs/CoinbaseEngPrimeApiApiEnrollInStablecoinRewardsResponse.md)
 - [CoinbaseEngPrimeApiApiFavoriteProductsUpdate](docs/CoinbaseEngPrimeApiApiFavoriteProductsUpdate.md)
 - [CoinbaseEngPrimeApiApiFetchInviteeAccessByEmailRequest](docs/CoinbaseEngPrimeApiApiFetchInviteeAccessByEmailRequest.md)
 - [CoinbaseEngPrimeApiApiFetchInviteeAccessByEmailResponse](docs/CoinbaseEngPrimeApiApiFetchInviteeAccessByEmailResponse.md)
 - [CoinbaseEngPrimeApiApiFetchWalletOption](docs/CoinbaseEngPrimeApiApiFetchWalletOption.md)
 - [CoinbaseEngPrimeApiApiGenerateDALReportResponse](docs/CoinbaseEngPrimeApiApiGenerateDALReportResponse.md)
 - [CoinbaseEngPrimeApiApiGenerateFinancingReportResponse](docs/CoinbaseEngPrimeApiApiGenerateFinancingReportResponse.md)
 - [CoinbaseEngPrimeApiApiGenerateReportingCenterDocumentResponse](docs/CoinbaseEngPrimeApiApiGenerateReportingCenterDocumentResponse.md)
 - [CoinbaseEngPrimeApiApiGenerateStakingReportArgs](docs/CoinbaseEngPrimeApiApiGenerateStakingReportArgs.md)
 - [CoinbaseEngPrimeApiApiGenerateStatementResponse](docs/CoinbaseEngPrimeApiApiGenerateStatementResponse.md)
 - [CoinbaseEngPrimeApiApiGenerateWeb3ReportResponse](docs/CoinbaseEngPrimeApiApiGenerateWeb3ReportResponse.md)
 - [CoinbaseEngPrimeApiApiGetAPIKeyCountResponse](docs/CoinbaseEngPrimeApiApiGetAPIKeyCountResponse.md)
 - [CoinbaseEngPrimeApiApiGetAPIKeyResponse](docs/CoinbaseEngPrimeApiApiGetAPIKeyResponse.md)
 - [CoinbaseEngPrimeApiApiGetActivityFiltersResponse](docs/CoinbaseEngPrimeApiApiGetActivityFiltersResponse.md)
 - [CoinbaseEngPrimeApiApiGetAllocationByOrderResponse](docs/CoinbaseEngPrimeApiApiGetAllocationByOrderResponse.md)
 - [CoinbaseEngPrimeApiApiGetAllocationLegResponse](docs/CoinbaseEngPrimeApiApiGetAllocationLegResponse.md)
 - [CoinbaseEngPrimeApiApiGetAllocationsResponse](docs/CoinbaseEngPrimeApiApiGetAllocationsResponse.md)
 - [CoinbaseEngPrimeApiApiGetBalancesResponse](docs/CoinbaseEngPrimeApiApiGetBalancesResponse.md)
 - [CoinbaseEngPrimeApiApiGetBalancesStreamBody](docs/CoinbaseEngPrimeApiApiGetBalancesStreamBody.md)
 - [CoinbaseEngPrimeApiApiGetBalancesStreamResponse](docs/CoinbaseEngPrimeApiApiGetBalancesStreamResponse.md)
 - [CoinbaseEngPrimeApiApiGetBillingEmailListResponse](docs/CoinbaseEngPrimeApiApiGetBillingEmailListResponse.md)
 - [CoinbaseEngPrimeApiApiGetBillingPreferenceResponse](docs/CoinbaseEngPrimeApiApiGetBillingPreferenceResponse.md)
 - [CoinbaseEngPrimeApiApiGetConversionSummariesV2Response](docs/CoinbaseEngPrimeApiApiGetConversionSummariesV2Response.md)
 - [CoinbaseEngPrimeApiApiGetCounterpartyResponse](docs/CoinbaseEngPrimeApiApiGetCounterpartyResponse.md)
 - [CoinbaseEngPrimeApiApiGetCurrenciesInfoResponse](docs/CoinbaseEngPrimeApiApiGetCurrenciesInfoResponse.md)
 - [CoinbaseEngPrimeApiApiGetDepositInstructionsResponse](docs/CoinbaseEngPrimeApiApiGetDepositInstructionsResponse.md)
 - [CoinbaseEngPrimeApiApiGetDeviceGroupResponse](docs/CoinbaseEngPrimeApiApiGetDeviceGroupResponse.md)
 - [CoinbaseEngPrimeApiApiGetDocumentDownloadLinksResponse](docs/CoinbaseEngPrimeApiApiGetDocumentDownloadLinksResponse.md)
 - [CoinbaseEngPrimeApiApiGetDocumentResponse](docs/CoinbaseEngPrimeApiApiGetDocumentResponse.md)
 - [CoinbaseEngPrimeApiApiGetDocumentSignatureStatusResponse](docs/CoinbaseEngPrimeApiApiGetDocumentSignatureStatusResponse.md)
 - [CoinbaseEngPrimeApiApiGetEntitySettingsResponse](docs/CoinbaseEngPrimeApiApiGetEntitySettingsResponse.md)
 - [CoinbaseEngPrimeApiApiGetEvaluationResultResponse](docs/CoinbaseEngPrimeApiApiGetEvaluationResultResponse.md)
 - [CoinbaseEngPrimeApiApiGetExchangeRateResponse](docs/CoinbaseEngPrimeApiApiGetExchangeRateResponse.md)
 - [CoinbaseEngPrimeApiApiGetFidoRegistrationResponse](docs/CoinbaseEngPrimeApiApiGetFidoRegistrationResponse.md)
 - [CoinbaseEngPrimeApiApiGetFinancingProductPermisionsResponse](docs/CoinbaseEngPrimeApiApiGetFinancingProductPermisionsResponse.md)
 - [CoinbaseEngPrimeApiApiGetGovernanceStatusResponse](docs/CoinbaseEngPrimeApiApiGetGovernanceStatusResponse.md)
 - [CoinbaseEngPrimeApiApiGetGovernanceTopicResponse](docs/CoinbaseEngPrimeApiApiGetGovernanceTopicResponse.md)
 - [CoinbaseEngPrimeApiApiGetGovernanceTopicsResponse](docs/CoinbaseEngPrimeApiApiGetGovernanceTopicsResponse.md)
 - [CoinbaseEngPrimeApiApiGetGovernanceVotesResponse](docs/CoinbaseEngPrimeApiApiGetGovernanceVotesResponse.md)
 - [CoinbaseEngPrimeApiApiGetIVPortfolioBalancesResponse](docs/CoinbaseEngPrimeApiApiGetIVPortfolioBalancesResponse.md)
 - [CoinbaseEngPrimeApiApiGetIVRestrictionsResponse](docs/CoinbaseEngPrimeApiApiGetIVRestrictionsResponse.md)
 - [CoinbaseEngPrimeApiApiGetIntrospectResponse](docs/CoinbaseEngPrimeApiApiGetIntrospectResponse.md)
 - [CoinbaseEngPrimeApiApiGetInvestmentVehiclePortfoliosResponse](docs/CoinbaseEngPrimeApiApiGetInvestmentVehiclePortfoliosResponse.md)
 - [CoinbaseEngPrimeApiApiGetInvestmentVehicleResponse](docs/CoinbaseEngPrimeApiApiGetInvestmentVehicleResponse.md)
 - [CoinbaseEngPrimeApiApiGetInvitationsResponse](docs/CoinbaseEngPrimeApiApiGetInvitationsResponse.md)
 - [CoinbaseEngPrimeApiApiGetInvoiceDownloadLinkResponse](docs/CoinbaseEngPrimeApiApiGetInvoiceDownloadLinkResponse.md)
 - [CoinbaseEngPrimeApiApiGetInvoicesRemainingBalanceResponse](docs/CoinbaseEngPrimeApiApiGetInvoicesRemainingBalanceResponse.md)
 - [CoinbaseEngPrimeApiApiGetInvoicesResponse](docs/CoinbaseEngPrimeApiApiGetInvoicesResponse.md)
 - [CoinbaseEngPrimeApiApiGetIsPrimeEnabledForUserResponse](docs/CoinbaseEngPrimeApiApiGetIsPrimeEnabledForUserResponse.md)
 - [CoinbaseEngPrimeApiApiGetIvDomicileCategoryRequest](docs/CoinbaseEngPrimeApiApiGetIvDomicileCategoryRequest.md)
 - [CoinbaseEngPrimeApiApiGetIvDomicileCategoryResponse](docs/CoinbaseEngPrimeApiApiGetIvDomicileCategoryResponse.md)
 - [CoinbaseEngPrimeApiApiGetLatestTestTransactionRequest](docs/CoinbaseEngPrimeApiApiGetLatestTestTransactionRequest.md)
 - [CoinbaseEngPrimeApiApiGetLatestTestTransactionResponse](docs/CoinbaseEngPrimeApiApiGetLatestTestTransactionResponse.md)
 - [CoinbaseEngPrimeApiApiGetOrderResponse](docs/CoinbaseEngPrimeApiApiGetOrderResponse.md)
 - [CoinbaseEngPrimeApiApiGetOrganizationResponse](docs/CoinbaseEngPrimeApiApiGetOrganizationResponse.md)
 - [CoinbaseEngPrimeApiApiGetPendingConsensusResponse](docs/CoinbaseEngPrimeApiApiGetPendingConsensusResponse.md)
 - [CoinbaseEngPrimeApiApiGetPortfolioActivitiesResponse](docs/CoinbaseEngPrimeApiApiGetPortfolioActivitiesResponse.md)
 - [CoinbaseEngPrimeApiApiGetPortfolioActivitiesStreamResponse](docs/CoinbaseEngPrimeApiApiGetPortfolioActivitiesStreamResponse.md)
 - [CoinbaseEngPrimeApiApiGetPortfolioActivitiesStreamResponseBody](docs/CoinbaseEngPrimeApiApiGetPortfolioActivitiesStreamResponseBody.md)
 - [CoinbaseEngPrimeApiApiGetPortfolioActivityResponse](docs/CoinbaseEngPrimeApiApiGetPortfolioActivityResponse.md)
 - [CoinbaseEngPrimeApiApiGetPortfolioActivityStreamResponse](docs/CoinbaseEngPrimeApiApiGetPortfolioActivityStreamResponse.md)
 - [CoinbaseEngPrimeApiApiGetPortfolioActivityStreamResponseBody](docs/CoinbaseEngPrimeApiApiGetPortfolioActivityStreamResponseBody.md)
 - [CoinbaseEngPrimeApiApiGetPortfolioCommissionResponse](docs/CoinbaseEngPrimeApiApiGetPortfolioCommissionResponse.md)
 - [CoinbaseEngPrimeApiApiGetPostTradeCreditResponse](docs/CoinbaseEngPrimeApiApiGetPostTradeCreditResponse.md)
 - [CoinbaseEngPrimeApiApiGetPreferenceResponse](docs/CoinbaseEngPrimeApiApiGetPreferenceResponse.md)
 - [CoinbaseEngPrimeApiApiGetPrimeActivitiesResponse](docs/CoinbaseEngPrimeApiApiGetPrimeActivitiesResponse.md)
 - [CoinbaseEngPrimeApiApiGetPrimeActivitiesStreamResponse](docs/CoinbaseEngPrimeApiApiGetPrimeActivitiesStreamResponse.md)
 - [CoinbaseEngPrimeApiApiGetPrimeActivitiesStreamResponseBody](docs/CoinbaseEngPrimeApiApiGetPrimeActivitiesStreamResponseBody.md)
 - [CoinbaseEngPrimeApiApiGetPrimeActivityConsensusAuditResponse](docs/CoinbaseEngPrimeApiApiGetPrimeActivityConsensusAuditResponse.md)
 - [CoinbaseEngPrimeApiApiGetPrimeActivityDetailsResponse](docs/CoinbaseEngPrimeApiApiGetPrimeActivityDetailsResponse.md)
 - [CoinbaseEngPrimeApiApiGetPrimeActivityDetailsStreamResponse](docs/CoinbaseEngPrimeApiApiGetPrimeActivityDetailsStreamResponse.md)
 - [CoinbaseEngPrimeApiApiGetPrimeActivityDetailsStreamResponseBody](docs/CoinbaseEngPrimeApiApiGetPrimeActivityDetailsStreamResponseBody.md)
 - [CoinbaseEngPrimeApiApiGetPrimeActivityDetailsV2Response](docs/CoinbaseEngPrimeApiApiGetPrimeActivityDetailsV2Response.md)
 - [CoinbaseEngPrimeApiApiGetPrimeActivityDetailsV2StreamResponse](docs/CoinbaseEngPrimeApiApiGetPrimeActivityDetailsV2StreamResponse.md)
 - [CoinbaseEngPrimeApiApiGetPrimeActivityDetailsV2StreamResponseBody](docs/CoinbaseEngPrimeApiApiGetPrimeActivityDetailsV2StreamResponseBody.md)
 - [CoinbaseEngPrimeApiApiGetPrimeActivityFiltersResponse](docs/CoinbaseEngPrimeApiApiGetPrimeActivityFiltersResponse.md)
 - [CoinbaseEngPrimeApiApiGetPrimeInvoicesResponse](docs/CoinbaseEngPrimeApiApiGetPrimeInvoicesResponse.md)
 - [CoinbaseEngPrimeApiApiGetProductsResponse](docs/CoinbaseEngPrimeApiApiGetProductsResponse.md)
 - [CoinbaseEngPrimeApiApiGetProductsStreamResponse](docs/CoinbaseEngPrimeApiApiGetProductsStreamResponse.md)
 - [CoinbaseEngPrimeApiApiGetProductsStreamResponseBody](docs/CoinbaseEngPrimeApiApiGetProductsStreamResponseBody.md)
 - [CoinbaseEngPrimeApiApiGetRateCardResponse](docs/CoinbaseEngPrimeApiApiGetRateCardResponse.md)
 - [CoinbaseEngPrimeApiApiGetReportingCenterDownloadLinkResponse](docs/CoinbaseEngPrimeApiApiGetReportingCenterDownloadLinkResponse.md)
 - [CoinbaseEngPrimeApiApiGetReportingCenterFiltersResponse](docs/CoinbaseEngPrimeApiApiGetReportingCenterFiltersResponse.md)
 - [CoinbaseEngPrimeApiApiGetReportingDocumentByOrderIdResponse](docs/CoinbaseEngPrimeApiApiGetReportingDocumentByOrderIdResponse.md)
 - [CoinbaseEngPrimeApiApiGetReverseAllocationResponse](docs/CoinbaseEngPrimeApiApiGetReverseAllocationResponse.md)
 - [CoinbaseEngPrimeApiApiGetSettingsResponse](docs/CoinbaseEngPrimeApiApiGetSettingsResponse.md)
 - [CoinbaseEngPrimeApiApiGetSignedDocumentResponse](docs/CoinbaseEngPrimeApiApiGetSignedDocumentResponse.md)
 - [CoinbaseEngPrimeApiApiGetStablecoinRewardsEarningsResponse](docs/CoinbaseEngPrimeApiApiGetStablecoinRewardsEarningsResponse.md)
 - [CoinbaseEngPrimeApiApiGetStablecoinRewardsEnrollmentResponse](docs/CoinbaseEngPrimeApiApiGetStablecoinRewardsEnrollmentResponse.md)
 - [CoinbaseEngPrimeApiApiGetStatementResponse](docs/CoinbaseEngPrimeApiApiGetStatementResponse.md)
 - [CoinbaseEngPrimeApiApiGetStatementsResponse](docs/CoinbaseEngPrimeApiApiGetStatementsResponse.md)
 - [CoinbaseEngPrimeApiApiGetTeamMemberDetailResponse](docs/CoinbaseEngPrimeApiApiGetTeamMemberDetailResponse.md)
 - [CoinbaseEngPrimeApiApiGetTeamMembersResponse](docs/CoinbaseEngPrimeApiApiGetTeamMembersResponse.md)
 - [CoinbaseEngPrimeApiApiGetTransferMethodsResponse](docs/CoinbaseEngPrimeApiApiGetTransferMethodsResponse.md)
 - [CoinbaseEngPrimeApiApiGetUserEntityLevelPermissionResponse](docs/CoinbaseEngPrimeApiApiGetUserEntityLevelPermissionResponse.md)
 - [CoinbaseEngPrimeApiApiGetUserHierarchyResponse](docs/CoinbaseEngPrimeApiApiGetUserHierarchyResponse.md)
 - [CoinbaseEngPrimeApiApiGetUserInAppNotificationsResponse](docs/CoinbaseEngPrimeApiApiGetUserInAppNotificationsResponse.md)
 - [CoinbaseEngPrimeApiApiGetUserInAppNotificationsStreamResponse](docs/CoinbaseEngPrimeApiApiGetUserInAppNotificationsStreamResponse.md)
 - [CoinbaseEngPrimeApiApiGetUserInAppNotificationsStreamResponseBody](docs/CoinbaseEngPrimeApiApiGetUserInAppNotificationsStreamResponseBody.md)
 - [CoinbaseEngPrimeApiApiGetUserInfoResponse](docs/CoinbaseEngPrimeApiApiGetUserInfoResponse.md)
 - [CoinbaseEngPrimeApiApiGetUserPortfoliosResponse](docs/CoinbaseEngPrimeApiApiGetUserPortfoliosResponse.md)
 - [CoinbaseEngPrimeApiApiGetUserPreferencesForChannelResponse](docs/CoinbaseEngPrimeApiApiGetUserPreferencesForChannelResponse.md)
 - [CoinbaseEngPrimeApiApiGetUserPreferencesResponse](docs/CoinbaseEngPrimeApiApiGetUserPreferencesResponse.md)
 - [CoinbaseEngPrimeApiApiGetUserRolesResponse](docs/CoinbaseEngPrimeApiApiGetUserRolesResponse.md)
 - [CoinbaseEngPrimeApiApiGetVehicleBillingPermissionResponse](docs/CoinbaseEngPrimeApiApiGetVehicleBillingPermissionResponse.md)
 - [CoinbaseEngPrimeApiApiGetVehicleCurrenciesResponse](docs/CoinbaseEngPrimeApiApiGetVehicleCurrenciesResponse.md)
 - [CoinbaseEngPrimeApiApiGetVehicleCurrenciesStreamResponse](docs/CoinbaseEngPrimeApiApiGetVehicleCurrenciesStreamResponse.md)
 - [CoinbaseEngPrimeApiApiGetVehicleCurrenciesStreamResponseBody](docs/CoinbaseEngPrimeApiApiGetVehicleCurrenciesStreamResponseBody.md)
 - [CoinbaseEngPrimeApiApiGetVehicleSpotPricesResponse](docs/CoinbaseEngPrimeApiApiGetVehicleSpotPricesResponse.md)
 - [CoinbaseEngPrimeApiApiGetVehicleSpotPricesStreamBody](docs/CoinbaseEngPrimeApiApiGetVehicleSpotPricesStreamBody.md)
 - [CoinbaseEngPrimeApiApiGetVehicleSpotPricesStreamResponse](docs/CoinbaseEngPrimeApiApiGetVehicleSpotPricesStreamResponse.md)
 - [CoinbaseEngPrimeApiApiGetVehicleValidatorsResponse](docs/CoinbaseEngPrimeApiApiGetVehicleValidatorsResponse.md)
 - [CoinbaseEngPrimeApiApiGetWalletAssetSettingsResponse](docs/CoinbaseEngPrimeApiApiGetWalletAssetSettingsResponse.md)
 - [CoinbaseEngPrimeApiApiGetWalletDefiBalancesResponse](docs/CoinbaseEngPrimeApiApiGetWalletDefiBalancesResponse.md)
 - [CoinbaseEngPrimeApiApiGetWalletResponse](docs/CoinbaseEngPrimeApiApiGetWalletResponse.md)
 - [CoinbaseEngPrimeApiApiGetWalletRewardsStatusResponse](docs/CoinbaseEngPrimeApiApiGetWalletRewardsStatusResponse.md)
 - [CoinbaseEngPrimeApiApiGetWalletStakingStatusResponse](docs/CoinbaseEngPrimeApiApiGetWalletStakingStatusResponse.md)
 - [CoinbaseEngPrimeApiApiGetWalletVestingStatusResponse](docs/CoinbaseEngPrimeApiApiGetWalletVestingStatusResponse.md)
 - [CoinbaseEngPrimeApiApiHeartbeat](docs/CoinbaseEngPrimeApiApiHeartbeat.md)
 - [CoinbaseEngPrimeApiApiHierarchy](docs/CoinbaseEngPrimeApiApiHierarchy.md)
 - [CoinbaseEngPrimeApiApiHierarchyType](docs/CoinbaseEngPrimeApiApiHierarchyType.md)
 - [CoinbaseEngPrimeApiApiInitiateTransactionSigningRequest](docs/CoinbaseEngPrimeApiApiInitiateTransactionSigningRequest.md)
 - [CoinbaseEngPrimeApiApiInitiateTransactionSigningResponse](docs/CoinbaseEngPrimeApiApiInitiateTransactionSigningResponse.md)
 - [CoinbaseEngPrimeApiApiInvitation](docs/CoinbaseEngPrimeApiApiInvitation.md)
 - [CoinbaseEngPrimeApiApiInvitationRole](docs/CoinbaseEngPrimeApiApiInvitationRole.md)
 - [CoinbaseEngPrimeApiApiInvitationSecondaryRole](docs/CoinbaseEngPrimeApiApiInvitationSecondaryRole.md)
 - [CoinbaseEngPrimeApiApiInvitationStatus](docs/CoinbaseEngPrimeApiApiInvitationStatus.md)
 - [CoinbaseEngPrimeApiApiInvoice](docs/CoinbaseEngPrimeApiApiInvoice.md)
 - [CoinbaseEngPrimeApiApiInvoiceState](docs/CoinbaseEngPrimeApiApiInvoiceState.md)
 - [CoinbaseEngPrimeApiApiJsonPatch](docs/CoinbaseEngPrimeApiApiJsonPatch.md)
 - [CoinbaseEngPrimeApiApiJsonPatchOperation](docs/CoinbaseEngPrimeApiApiJsonPatchOperation.md)
 - [CoinbaseEngPrimeApiApiKeyboardShortcutsToggleUpdate](docs/CoinbaseEngPrimeApiApiKeyboardShortcutsToggleUpdate.md)
 - [CoinbaseEngPrimeApiApiLadderIcebergToggleUpdate](docs/CoinbaseEngPrimeApiApiLadderIcebergToggleUpdate.md)
 - [CoinbaseEngPrimeApiApiLadderLevelDoubleclickOrderingUpdate](docs/CoinbaseEngPrimeApiApiLadderLevelDoubleclickOrderingUpdate.md)
 - [CoinbaseEngPrimeApiApiLimitLimitGtc](docs/CoinbaseEngPrimeApiApiLimitLimitGtc.md)
 - [CoinbaseEngPrimeApiApiLimitLimitGtd](docs/CoinbaseEngPrimeApiApiLimitLimitGtd.md)
 - [CoinbaseEngPrimeApiApiLimitOffsetPaginatedRequest](docs/CoinbaseEngPrimeApiApiLimitOffsetPaginatedRequest.md)
 - [CoinbaseEngPrimeApiApiLimitOffsetPaginatedResponse](docs/CoinbaseEngPrimeApiApiLimitOffsetPaginatedResponse.md)
 - [CoinbaseEngPrimeApiApiListAPIKeysResponse](docs/CoinbaseEngPrimeApiApiListAPIKeysResponse.md)
 - [CoinbaseEngPrimeApiApiListActiveValidatorsResponse](docs/CoinbaseEngPrimeApiApiListActiveValidatorsResponse.md)
 - [CoinbaseEngPrimeApiApiListBulkPoliciesResponse](docs/CoinbaseEngPrimeApiApiListBulkPoliciesResponse.md)
 - [CoinbaseEngPrimeApiApiListDeviceGroupsResponse](docs/CoinbaseEngPrimeApiApiListDeviceGroupsResponse.md)
 - [CoinbaseEngPrimeApiApiListLevel](docs/CoinbaseEngPrimeApiApiListLevel.md)
 - [CoinbaseEngPrimeApiApiListPaymentMethodsResponse](docs/CoinbaseEngPrimeApiApiListPaymentMethodsResponse.md)
 - [CoinbaseEngPrimeApiApiListPolicyResponseItem](docs/CoinbaseEngPrimeApiApiListPolicyResponseItem.md)
 - [CoinbaseEngPrimeApiApiListPortfolioConciseUsersResponse](docs/CoinbaseEngPrimeApiApiListPortfolioConciseUsersResponse.md)
 - [CoinbaseEngPrimeApiApiListPortfolioUsersResponse](docs/CoinbaseEngPrimeApiApiListPortfolioUsersResponse.md)
 - [CoinbaseEngPrimeApiApiListReportingCenterDataResponse](docs/CoinbaseEngPrimeApiApiListReportingCenterDataResponse.md)
 - [CoinbaseEngPrimeApiApiListSignerIdsForActivityResponse](docs/CoinbaseEngPrimeApiApiListSignerIdsForActivityResponse.md)
 - [CoinbaseEngPrimeApiApiListTradingWalletCryptoDepositAddressesResponse](docs/CoinbaseEngPrimeApiApiListTradingWalletCryptoDepositAddressesResponse.md)
 - [CoinbaseEngPrimeApiApiListUserInvitationResponse](docs/CoinbaseEngPrimeApiApiListUserInvitationResponse.md)
 - [CoinbaseEngPrimeApiApiListWalletTokensResponse](docs/CoinbaseEngPrimeApiApiListWalletTokensResponse.md)
 - [CoinbaseEngPrimeApiApiListWalletsResponse](docs/CoinbaseEngPrimeApiApiListWalletsResponse.md)
 - [CoinbaseEngPrimeApiApiListWalletsV2RequestSortBy](docs/CoinbaseEngPrimeApiApiListWalletsV2RequestSortBy.md)
 - [CoinbaseEngPrimeApiApiListWalletsV2Response](docs/CoinbaseEngPrimeApiApiListWalletsV2Response.md)
 - [CoinbaseEngPrimeApiApiListWeb3SecurityKeysResponse](docs/CoinbaseEngPrimeApiApiListWeb3SecurityKeysResponse.md)
 - [CoinbaseEngPrimeApiApiLlcRolloutResponse](docs/CoinbaseEngPrimeApiApiLlcRolloutResponse.md)
 - [CoinbaseEngPrimeApiApiLoginUser](docs/CoinbaseEngPrimeApiApiLoginUser.md)
 - [CoinbaseEngPrimeApiApiMacd](docs/CoinbaseEngPrimeApiApiMacd.md)
 - [CoinbaseEngPrimeApiApiMarginCallHistoryRecord](docs/CoinbaseEngPrimeApiApiMarginCallHistoryRecord.md)
 - [CoinbaseEngPrimeApiApiMarginSummary](docs/CoinbaseEngPrimeApiApiMarginSummary.md)
 - [CoinbaseEngPrimeApiApiMarginSummaryContext](docs/CoinbaseEngPrimeApiApiMarginSummaryContext.md)
 - [CoinbaseEngPrimeApiApiMarketMarketIoc](docs/CoinbaseEngPrimeApiApiMarketMarketIoc.md)
 - [CoinbaseEngPrimeApiApiMatchTransferActivityDetails](docs/CoinbaseEngPrimeApiApiMatchTransferActivityDetails.md)
 - [CoinbaseEngPrimeApiApiMatchTransferDetail](docs/CoinbaseEngPrimeApiApiMatchTransferDetail.md)
 - [CoinbaseEngPrimeApiApiMovingAverage](docs/CoinbaseEngPrimeApiApiMovingAverage.md)
 - [CoinbaseEngPrimeApiApiNetworkFamily](docs/CoinbaseEngPrimeApiApiNetworkFamily.md)
 - [CoinbaseEngPrimeApiApiNewConsensusActivityResponse](docs/CoinbaseEngPrimeApiApiNewConsensusActivityResponse.md)
 - [CoinbaseEngPrimeApiApiOrderCancelConfirmationWindowToggleUpdate](docs/CoinbaseEngPrimeApiApiOrderCancelConfirmationWindowToggleUpdate.md)
 - [CoinbaseEngPrimeApiApiOrderConfiguration](docs/CoinbaseEngPrimeApiApiOrderConfiguration.md)
 - [CoinbaseEngPrimeApiApiOrderConfirmationWindowToggleUpdate](docs/CoinbaseEngPrimeApiApiOrderConfirmationWindowToggleUpdate.md)
 - [CoinbaseEngPrimeApiApiOrderFormPersistToggleUpdate](docs/CoinbaseEngPrimeApiApiOrderFormPersistToggleUpdate.md)
 - [CoinbaseEngPrimeApiApiOrderFormSizeWarningsToggleUpdate](docs/CoinbaseEngPrimeApiApiOrderFormSizeWarningsToggleUpdate.md)
 - [CoinbaseEngPrimeApiApiOrderPreviewResponseBody](docs/CoinbaseEngPrimeApiApiOrderPreviewResponseBody.md)
 - [CoinbaseEngPrimeApiApiOrderRaiseExactToggleUpdate](docs/CoinbaseEngPrimeApiApiOrderRaiseExactToggleUpdate.md)
 - [CoinbaseEngPrimeApiApiOrderSide](docs/CoinbaseEngPrimeApiApiOrderSide.md)
 - [CoinbaseEngPrimeApiApiOrderTableColumn](docs/CoinbaseEngPrimeApiApiOrderTableColumn.md)
 - [CoinbaseEngPrimeApiApiOrderTableColumnUpdate](docs/CoinbaseEngPrimeApiApiOrderTableColumnUpdate.md)
 - [CoinbaseEngPrimeApiApiOrganizationDomicileCategory](docs/CoinbaseEngPrimeApiApiOrganizationDomicileCategory.md)
 - [CoinbaseEngPrimeApiApiPMAssetInfo](docs/CoinbaseEngPrimeApiApiPMAssetInfo.md)
 - [CoinbaseEngPrimeApiApiPaginatedResponse](docs/CoinbaseEngPrimeApiApiPaginatedResponse.md)
 - [CoinbaseEngPrimeApiApiPendingConsensusItem](docs/CoinbaseEngPrimeApiApiPendingConsensusItem.md)
 - [CoinbaseEngPrimeApiApiPermission](docs/CoinbaseEngPrimeApiApiPermission.md)
 - [CoinbaseEngPrimeApiApiPinnedOrdersUpdate](docs/CoinbaseEngPrimeApiApiPinnedOrdersUpdate.md)
 - [CoinbaseEngPrimeApiApiPortfolio](docs/CoinbaseEngPrimeApiApiPortfolio.md)
 - [CoinbaseEngPrimeApiApiPortfolioFinancing](docs/CoinbaseEngPrimeApiApiPortfolioFinancing.md)
 - [CoinbaseEngPrimeApiApiPortfolioFinancingProduct](docs/CoinbaseEngPrimeApiApiPortfolioFinancingProduct.md)
 - [CoinbaseEngPrimeApiApiPortfolioFinancingProductStreamBody](docs/CoinbaseEngPrimeApiApiPortfolioFinancingProductStreamBody.md)
 - [CoinbaseEngPrimeApiApiPortfolioFinancingProductStreamResponse](docs/CoinbaseEngPrimeApiApiPortfolioFinancingProductStreamResponse.md)
 - [CoinbaseEngPrimeApiApiPortfolioFinancingStreamBody](docs/CoinbaseEngPrimeApiApiPortfolioFinancingStreamBody.md)
 - [CoinbaseEngPrimeApiApiPortfolioFinancingStreamResponse](docs/CoinbaseEngPrimeApiApiPortfolioFinancingStreamResponse.md)
 - [CoinbaseEngPrimeApiApiPortfolioInfo](docs/CoinbaseEngPrimeApiApiPortfolioInfo.md)
 - [CoinbaseEngPrimeApiApiPostAddressBookEntryRequest](docs/CoinbaseEngPrimeApiApiPostAddressBookEntryRequest.md)
 - [CoinbaseEngPrimeApiApiPostAddressBookEntryResponse](docs/CoinbaseEngPrimeApiApiPostAddressBookEntryResponse.md)
 - [CoinbaseEngPrimeApiApiPostAllocationPreviewRequest](docs/CoinbaseEngPrimeApiApiPostAllocationPreviewRequest.md)
 - [CoinbaseEngPrimeApiApiPostAllocationPreviewResponse](docs/CoinbaseEngPrimeApiApiPostAllocationPreviewResponse.md)
 - [CoinbaseEngPrimeApiApiPostAllocationRequest](docs/CoinbaseEngPrimeApiApiPostAllocationRequest.md)
 - [CoinbaseEngPrimeApiApiPostAllocationResponse](docs/CoinbaseEngPrimeApiApiPostAllocationResponse.md)
 - [CoinbaseEngPrimeApiApiPostAllocationResponseBody](docs/CoinbaseEngPrimeApiApiPostAllocationResponseBody.md)
 - [CoinbaseEngPrimeApiApiPostApprovePortfolioActivityRequest](docs/CoinbaseEngPrimeApiApiPostApprovePortfolioActivityRequest.md)
 - [CoinbaseEngPrimeApiApiPostApprovePortfolioActivityResponse](docs/CoinbaseEngPrimeApiApiPostApprovePortfolioActivityResponse.md)
 - [CoinbaseEngPrimeApiApiPostApproveVehicleActivityRequest](docs/CoinbaseEngPrimeApiApiPostApproveVehicleActivityRequest.md)
 - [CoinbaseEngPrimeApiApiPostApproveVehicleActivityResponse](docs/CoinbaseEngPrimeApiApiPostApproveVehicleActivityResponse.md)
 - [CoinbaseEngPrimeApiApiPostBulkActionActivitiesRequest](docs/CoinbaseEngPrimeApiApiPostBulkActionActivitiesRequest.md)
 - [CoinbaseEngPrimeApiApiPostBulkActionActivitiesResponse](docs/CoinbaseEngPrimeApiApiPostBulkActionActivitiesResponse.md)
 - [CoinbaseEngPrimeApiApiPostBulkActionActivityError](docs/CoinbaseEngPrimeApiApiPostBulkActionActivityError.md)
 - [CoinbaseEngPrimeApiApiPostBulkActionActivityResponse](docs/CoinbaseEngPrimeApiApiPostBulkActionActivityResponse.md)
 - [CoinbaseEngPrimeApiApiPostBulkActionActivitySuccess](docs/CoinbaseEngPrimeApiApiPostBulkActionActivitySuccess.md)
 - [CoinbaseEngPrimeApiApiPostBulkActionSettingsRequest](docs/CoinbaseEngPrimeApiApiPostBulkActionSettingsRequest.md)
 - [CoinbaseEngPrimeApiApiPostBulkActionSettingsResponse](docs/CoinbaseEngPrimeApiApiPostBulkActionSettingsResponse.md)
 - [CoinbaseEngPrimeApiApiPostBulkUserInvitationRequest](docs/CoinbaseEngPrimeApiApiPostBulkUserInvitationRequest.md)
 - [CoinbaseEngPrimeApiApiPostBulkUserInvitationResponse](docs/CoinbaseEngPrimeApiApiPostBulkUserInvitationResponse.md)
 - [CoinbaseEngPrimeApiApiPostCancelOrderRequest](docs/CoinbaseEngPrimeApiApiPostCancelOrderRequest.md)
 - [CoinbaseEngPrimeApiApiPostCancelOrderResponse](docs/CoinbaseEngPrimeApiApiPostCancelOrderResponse.md)
 - [CoinbaseEngPrimeApiApiPostCancelOrderResponseBody](docs/CoinbaseEngPrimeApiApiPostCancelOrderResponseBody.md)
 - [CoinbaseEngPrimeApiApiPostDelegationAccountResponse](docs/CoinbaseEngPrimeApiApiPostDelegationAccountResponse.md)
 - [CoinbaseEngPrimeApiApiPostDocumentSignatureRequest](docs/CoinbaseEngPrimeApiApiPostDocumentSignatureRequest.md)
 - [CoinbaseEngPrimeApiApiPostDocumentSignatureResponse](docs/CoinbaseEngPrimeApiApiPostDocumentSignatureResponse.md)
 - [CoinbaseEngPrimeApiApiPostEntitySettingsRequest](docs/CoinbaseEngPrimeApiApiPostEntitySettingsRequest.md)
 - [CoinbaseEngPrimeApiApiPostEntitySettingsResponse](docs/CoinbaseEngPrimeApiApiPostEntitySettingsResponse.md)
 - [CoinbaseEngPrimeApiApiPostFidoChallengeCreateResponse](docs/CoinbaseEngPrimeApiApiPostFidoChallengeCreateResponse.md)
 - [CoinbaseEngPrimeApiApiPostFidoChallengeRequest](docs/CoinbaseEngPrimeApiApiPostFidoChallengeRequest.md)
 - [CoinbaseEngPrimeApiApiPostFidoChallengeResponse](docs/CoinbaseEngPrimeApiApiPostFidoChallengeResponse.md)
 - [CoinbaseEngPrimeApiApiPostFidoRegistrationRequest](docs/CoinbaseEngPrimeApiApiPostFidoRegistrationRequest.md)
 - [CoinbaseEngPrimeApiApiPostFidoRegistrationResponse](docs/CoinbaseEngPrimeApiApiPostFidoRegistrationResponse.md)
 - [CoinbaseEngPrimeApiApiPostGovernanceStatusRequest](docs/CoinbaseEngPrimeApiApiPostGovernanceStatusRequest.md)
 - [CoinbaseEngPrimeApiApiPostGovernanceStatusResponse](docs/CoinbaseEngPrimeApiApiPostGovernanceStatusResponse.md)
 - [CoinbaseEngPrimeApiApiPostGovernanceStatusResponseBody](docs/CoinbaseEngPrimeApiApiPostGovernanceStatusResponseBody.md)
 - [CoinbaseEngPrimeApiApiPostGovernanceVoteRequest](docs/CoinbaseEngPrimeApiApiPostGovernanceVoteRequest.md)
 - [CoinbaseEngPrimeApiApiPostGovernanceVoteResponse](docs/CoinbaseEngPrimeApiApiPostGovernanceVoteResponse.md)
 - [CoinbaseEngPrimeApiApiPostNetAllocationPreviewRequest](docs/CoinbaseEngPrimeApiApiPostNetAllocationPreviewRequest.md)
 - [CoinbaseEngPrimeApiApiPostNetAllocationPreviewResponse](docs/CoinbaseEngPrimeApiApiPostNetAllocationPreviewResponse.md)
 - [CoinbaseEngPrimeApiApiPostOrderPreviewRequest](docs/CoinbaseEngPrimeApiApiPostOrderPreviewRequest.md)
 - [CoinbaseEngPrimeApiApiPostOrderPreviewResponse](docs/CoinbaseEngPrimeApiApiPostOrderPreviewResponse.md)
 - [CoinbaseEngPrimeApiApiPostOrderRequest](docs/CoinbaseEngPrimeApiApiPostOrderRequest.md)
 - [CoinbaseEngPrimeApiApiPostOrderResponse](docs/CoinbaseEngPrimeApiApiPostOrderResponse.md)
 - [CoinbaseEngPrimeApiApiPostOrderResponseBody](docs/CoinbaseEngPrimeApiApiPostOrderResponseBody.md)
 - [CoinbaseEngPrimeApiApiPostPortfolioSettingsRequest](docs/CoinbaseEngPrimeApiApiPostPortfolioSettingsRequest.md)
 - [CoinbaseEngPrimeApiApiPostPortfolioSettingsResponse](docs/CoinbaseEngPrimeApiApiPostPortfolioSettingsResponse.md)
 - [CoinbaseEngPrimeApiApiPostPreviewUserChangeRequest](docs/CoinbaseEngPrimeApiApiPostPreviewUserChangeRequest.md)
 - [CoinbaseEngPrimeApiApiPostPreviewUserChangeResponse](docs/CoinbaseEngPrimeApiApiPostPreviewUserChangeResponse.md)
 - [CoinbaseEngPrimeApiApiPostPushNotificationDeviceDeregistrationRequest](docs/CoinbaseEngPrimeApiApiPostPushNotificationDeviceDeregistrationRequest.md)
 - [CoinbaseEngPrimeApiApiPostPushNotificationDeviceRegistrationRequest](docs/CoinbaseEngPrimeApiApiPostPushNotificationDeviceRegistrationRequest.md)
 - [CoinbaseEngPrimeApiApiPostRejectPortfolioActivityRequest](docs/CoinbaseEngPrimeApiApiPostRejectPortfolioActivityRequest.md)
 - [CoinbaseEngPrimeApiApiPostRejectPortfolioActivityResponse](docs/CoinbaseEngPrimeApiApiPostRejectPortfolioActivityResponse.md)
 - [CoinbaseEngPrimeApiApiPostRejectVehicleActivityRequest](docs/CoinbaseEngPrimeApiApiPostRejectVehicleActivityRequest.md)
 - [CoinbaseEngPrimeApiApiPostRejectVehicleActivityResponse](docs/CoinbaseEngPrimeApiApiPostRejectVehicleActivityResponse.md)
 - [CoinbaseEngPrimeApiApiPostReverseAllocationRequest](docs/CoinbaseEngPrimeApiApiPostReverseAllocationRequest.md)
 - [CoinbaseEngPrimeApiApiPostTradeCredit](docs/CoinbaseEngPrimeApiApiPostTradeCredit.md)
 - [CoinbaseEngPrimeApiApiPostTradeCreditInformation](docs/CoinbaseEngPrimeApiApiPostTradeCreditInformation.md)
 - [CoinbaseEngPrimeApiApiPostUpdateBillingAddressRequest](docs/CoinbaseEngPrimeApiApiPostUpdateBillingAddressRequest.md)
 - [CoinbaseEngPrimeApiApiPostUpdateBillingAddressResponse](docs/CoinbaseEngPrimeApiApiPostUpdateBillingAddressResponse.md)
 - [CoinbaseEngPrimeApiApiPostUpdateBillingEmailListRequest](docs/CoinbaseEngPrimeApiApiPostUpdateBillingEmailListRequest.md)
 - [CoinbaseEngPrimeApiApiPostUpdateBillingEmailListResponse](docs/CoinbaseEngPrimeApiApiPostUpdateBillingEmailListResponse.md)
 - [CoinbaseEngPrimeApiApiPostUpdateBillingPreferenceRequest](docs/CoinbaseEngPrimeApiApiPostUpdateBillingPreferenceRequest.md)
 - [CoinbaseEngPrimeApiApiPostUserInAppNotificationStatusesRequest](docs/CoinbaseEngPrimeApiApiPostUserInAppNotificationStatusesRequest.md)
 - [CoinbaseEngPrimeApiApiPostUserPreferencesRequest](docs/CoinbaseEngPrimeApiApiPostUserPreferencesRequest.md)
 - [CoinbaseEngPrimeApiApiPostUserPreferencesResponse](docs/CoinbaseEngPrimeApiApiPostUserPreferencesResponse.md)
 - [CoinbaseEngPrimeApiApiPostUserUpdateRequest](docs/CoinbaseEngPrimeApiApiPostUserUpdateRequest.md)
 - [CoinbaseEngPrimeApiApiPreviewAllocationFailureReason](docs/CoinbaseEngPrimeApiApiPreviewAllocationFailureReason.md)
 - [CoinbaseEngPrimeApiApiPreviewAllocationLegFailureReason](docs/CoinbaseEngPrimeApiApiPreviewAllocationLegFailureReason.md)
 - [CoinbaseEngPrimeApiApiPreviewFailureReason](docs/CoinbaseEngPrimeApiApiPreviewFailureReason.md)
 - [CoinbaseEngPrimeApiApiPreviewSizeType](docs/CoinbaseEngPrimeApiApiPreviewSizeType.md)
 - [CoinbaseEngPrimeApiApiPreviewTransactionRequest](docs/CoinbaseEngPrimeApiApiPreviewTransactionRequest.md)
 - [CoinbaseEngPrimeApiApiPreviewTransactionResponse](docs/CoinbaseEngPrimeApiApiPreviewTransactionResponse.md)
 - [CoinbaseEngPrimeApiApiPrimeActivityDetails](docs/CoinbaseEngPrimeApiApiPrimeActivityDetails.md)
 - [CoinbaseEngPrimeApiApiPrimeBetaToggleUpdate](docs/CoinbaseEngPrimeApiApiPrimeBetaToggleUpdate.md)
 - [CoinbaseEngPrimeApiApiPrimeWalletBalanceType](docs/CoinbaseEngPrimeApiApiPrimeWalletBalanceType.md)
 - [CoinbaseEngPrimeApiApiProduct](docs/CoinbaseEngPrimeApiApiProduct.md)
 - [CoinbaseEngPrimeApiApiProductPermissions](docs/CoinbaseEngPrimeApiApiProductPermissions.md)
 - [CoinbaseEngPrimeApiApiProducts](docs/CoinbaseEngPrimeApiApiProducts.md)
 - [CoinbaseEngPrimeApiApiPublicKeyCredentialDescriptor](docs/CoinbaseEngPrimeApiApiPublicKeyCredentialDescriptor.md)
 - [CoinbaseEngPrimeApiApiPublicKeyCredentialParameters](docs/CoinbaseEngPrimeApiApiPublicKeyCredentialParameters.md)
 - [CoinbaseEngPrimeApiApiQueryLevel](docs/CoinbaseEngPrimeApiApiQueryLevel.md)
 - [CoinbaseEngPrimeApiApiReferenceType](docs/CoinbaseEngPrimeApiApiReferenceType.md)
 - [CoinbaseEngPrimeApiApiReward](docs/CoinbaseEngPrimeApiApiReward.md)
 - [CoinbaseEngPrimeApiApiRewardActivityDetails](docs/CoinbaseEngPrimeApiApiRewardActivityDetails.md)
 - [CoinbaseEngPrimeApiApiRole](docs/CoinbaseEngPrimeApiApiRole.md)
 - [CoinbaseEngPrimeApiApiRoleChangeType](docs/CoinbaseEngPrimeApiApiRoleChangeType.md)
 - [CoinbaseEngPrimeApiApiRpEntity](docs/CoinbaseEngPrimeApiApiRpEntity.md)
 - [CoinbaseEngPrimeApiApiRsi](docs/CoinbaseEngPrimeApiApiRsi.md)
 - [CoinbaseEngPrimeApiApiSecondFactor](docs/CoinbaseEngPrimeApiApiSecondFactor.md)
 - [CoinbaseEngPrimeApiApiSettlementDue](docs/CoinbaseEngPrimeApiApiSettlementDue.md)
 - [CoinbaseEngPrimeApiApiSettlementStatus](docs/CoinbaseEngPrimeApiApiSettlementStatus.md)
 - [CoinbaseEngPrimeApiApiShortCollateralTransferActivityDetails](docs/CoinbaseEngPrimeApiApiShortCollateralTransferActivityDetails.md)
 - [CoinbaseEngPrimeApiApiShowNewUserTradeExperienceUpdate](docs/CoinbaseEngPrimeApiApiShowNewUserTradeExperienceUpdate.md)
 - [CoinbaseEngPrimeApiApiSignalWeb3ActionRequest](docs/CoinbaseEngPrimeApiApiSignalWeb3ActionRequest.md)
 - [CoinbaseEngPrimeApiApiSignalWeb3ActionRequestSignal](docs/CoinbaseEngPrimeApiApiSignalWeb3ActionRequestSignal.md)
 - [CoinbaseEngPrimeApiApiSignalWeb3ActionRequestSignalExecuteBackupSignal](docs/CoinbaseEngPrimeApiApiSignalWeb3ActionRequestSignalExecuteBackupSignal.md)
 - [CoinbaseEngPrimeApiApiSignalWeb3ActionRequestSignalExecuteDeviceRecoverySignal](docs/CoinbaseEngPrimeApiApiSignalWeb3ActionRequestSignalExecuteDeviceRecoverySignal.md)
 - [CoinbaseEngPrimeApiApiSignalWeb3ActionRequestSignalExecuteKeyExportSignal](docs/CoinbaseEngPrimeApiApiSignalWeb3ActionRequestSignalExecuteKeyExportSignal.md)
 - [CoinbaseEngPrimeApiApiSignalWeb3ActionRequestSignalExecuteSignerAdditionSignal](docs/CoinbaseEngPrimeApiApiSignalWeb3ActionRequestSignalExecuteSignerAdditionSignal.md)
 - [CoinbaseEngPrimeApiApiSignalWeb3ActionRequestSignalGenerateKeysSignal](docs/CoinbaseEngPrimeApiApiSignalWeb3ActionRequestSignalGenerateKeysSignal.md)
 - [CoinbaseEngPrimeApiApiSignalWeb3ActionRequestSignalPasscodeConfirmedSignal](docs/CoinbaseEngPrimeApiApiSignalWeb3ActionRequestSignalPasscodeConfirmedSignal.md)
 - [CoinbaseEngPrimeApiApiSignalWeb3ActionResponse](docs/CoinbaseEngPrimeApiApiSignalWeb3ActionResponse.md)
 - [CoinbaseEngPrimeApiApiSigningBackend](docs/CoinbaseEngPrimeApiApiSigningBackend.md)
 - [CoinbaseEngPrimeApiApiSorLimitFok](docs/CoinbaseEngPrimeApiApiSorLimitFok.md)
 - [CoinbaseEngPrimeApiApiSorLimitIoc](docs/CoinbaseEngPrimeApiApiSorLimitIoc.md)
 - [CoinbaseEngPrimeApiApiSortDirection](docs/CoinbaseEngPrimeApiApiSortDirection.md)
 - [CoinbaseEngPrimeApiApiSpotPrice](docs/CoinbaseEngPrimeApiApiSpotPrice.md)
 - [CoinbaseEngPrimeApiApiStake](docs/CoinbaseEngPrimeApiApiStake.md)
 - [CoinbaseEngPrimeApiApiStakingCryptoRebateActivityDetails](docs/CoinbaseEngPrimeApiApiStakingCryptoRebateActivityDetails.md)
 - [CoinbaseEngPrimeApiApiStakingInfo](docs/CoinbaseEngPrimeApiApiStakingInfo.md)
 - [CoinbaseEngPrimeApiApiStopPriceDirection](docs/CoinbaseEngPrimeApiApiStopPriceDirection.md)
 - [CoinbaseEngPrimeApiApiStudyInputs](docs/CoinbaseEngPrimeApiApiStudyInputs.md)
 - [CoinbaseEngPrimeApiApiSupplyAndBorrow](docs/CoinbaseEngPrimeApiApiSupplyAndBorrow.md)
 - [CoinbaseEngPrimeApiApiSystemStatus](docs/CoinbaseEngPrimeApiApiSystemStatus.md)
 - [CoinbaseEngPrimeApiApiSystemStatusResponse](docs/CoinbaseEngPrimeApiApiSystemStatusResponse.md)
 - [CoinbaseEngPrimeApiApiSystemStatusType](docs/CoinbaseEngPrimeApiApiSystemStatusType.md)
 - [CoinbaseEngPrimeApiApiTWSTransactionActivityDetails](docs/CoinbaseEngPrimeApiApiTWSTransactionActivityDetails.md)
 - [CoinbaseEngPrimeApiApiToken](docs/CoinbaseEngPrimeApiApiToken.md)
 - [CoinbaseEngPrimeApiApiTransactionFee](docs/CoinbaseEngPrimeApiApiTransactionFee.md)
 - [CoinbaseEngPrimeApiApiTriggerStopLimitGtc](docs/CoinbaseEngPrimeApiApiTriggerStopLimitGtc.md)
 - [CoinbaseEngPrimeApiApiTriggerStopLimitGtd](docs/CoinbaseEngPrimeApiApiTriggerStopLimitGtd.md)
 - [CoinbaseEngPrimeApiApiTwapLimitGtd](docs/CoinbaseEngPrimeApiApiTwapLimitGtd.md)
 - [CoinbaseEngPrimeApiApiTwsWalletActivityDetails](docs/CoinbaseEngPrimeApiApiTwsWalletActivityDetails.md)
 - [CoinbaseEngPrimeApiApiUpdateIntervalPortfolioFinancing](docs/CoinbaseEngPrimeApiApiUpdateIntervalPortfolioFinancing.md)
 - [CoinbaseEngPrimeApiApiUpdateIntervalProducts](docs/CoinbaseEngPrimeApiApiUpdateIntervalProducts.md)
 - [CoinbaseEngPrimeApiApiUpdateLevel](docs/CoinbaseEngPrimeApiApiUpdateLevel.md)
 - [CoinbaseEngPrimeApiApiUpdateUserPreferencesForChannelRequest](docs/CoinbaseEngPrimeApiApiUpdateUserPreferencesForChannelRequest.md)
 - [CoinbaseEngPrimeApiApiUpdateUserPreferencesForChannelResponse](docs/CoinbaseEngPrimeApiApiUpdateUserPreferencesForChannelResponse.md)
 - [CoinbaseEngPrimeApiApiUpdateWalletAssetSettingsRequest](docs/CoinbaseEngPrimeApiApiUpdateWalletAssetSettingsRequest.md)
 - [CoinbaseEngPrimeApiApiUpdateWalletAssetSettingsResponse](docs/CoinbaseEngPrimeApiApiUpdateWalletAssetSettingsResponse.md)
 - [CoinbaseEngPrimeApiApiUpdateWalletNameRequest](docs/CoinbaseEngPrimeApiApiUpdateWalletNameRequest.md)
 - [CoinbaseEngPrimeApiApiUpdateWalletNameResponse](docs/CoinbaseEngPrimeApiApiUpdateWalletNameResponse.md)
 - [CoinbaseEngPrimeApiApiUpdateWeb3DeviceRequest](docs/CoinbaseEngPrimeApiApiUpdateWeb3DeviceRequest.md)
 - [CoinbaseEngPrimeApiApiUpdateWeb3DeviceResponse](docs/CoinbaseEngPrimeApiApiUpdateWeb3DeviceResponse.md)
 - [CoinbaseEngPrimeApiApiUpdatedDevice](docs/CoinbaseEngPrimeApiApiUpdatedDevice.md)
 - [CoinbaseEngPrimeApiApiUploadSecurityKey](docs/CoinbaseEngPrimeApiApiUploadSecurityKey.md)
 - [CoinbaseEngPrimeApiApiUpsertPolicyChangeRequest](docs/CoinbaseEngPrimeApiApiUpsertPolicyChangeRequest.md)
 - [CoinbaseEngPrimeApiApiUpsertPolicyChangeResponse](docs/CoinbaseEngPrimeApiApiUpsertPolicyChangeResponse.md)
 - [CoinbaseEngPrimeApiApiUserChangeDetails](docs/CoinbaseEngPrimeApiApiUserChangeDetails.md)
 - [CoinbaseEngPrimeApiApiUserChangesActivityDetails](docs/CoinbaseEngPrimeApiApiUserChangesActivityDetails.md)
 - [CoinbaseEngPrimeApiApiUserEntity](docs/CoinbaseEngPrimeApiApiUserEntity.md)
 - [CoinbaseEngPrimeApiApiUserInvitationResponseItem](docs/CoinbaseEngPrimeApiApiUserInvitationResponseItem.md)
 - [CoinbaseEngPrimeApiApiUserInvite](docs/CoinbaseEngPrimeApiApiUserInvite.md)
 - [CoinbaseEngPrimeApiApiUserPreferences](docs/CoinbaseEngPrimeApiApiUserPreferences.md)
 - [CoinbaseEngPrimeApiApiUserRole](docs/CoinbaseEngPrimeApiApiUserRole.md)
 - [CoinbaseEngPrimeApiApiUserRolesUpdate](docs/CoinbaseEngPrimeApiApiUserRolesUpdate.md)
 - [CoinbaseEngPrimeApiApiUserRolesUpdateResponseItem](docs/CoinbaseEngPrimeApiApiUserRolesUpdateResponseItem.md)
 - [CoinbaseEngPrimeApiApiValidateAddressRequest](docs/CoinbaseEngPrimeApiApiValidateAddressRequest.md)
 - [CoinbaseEngPrimeApiApiValidateAddressResponse](docs/CoinbaseEngPrimeApiApiValidateAddressResponse.md)
 - [CoinbaseEngPrimeApiApiValidateCounterpartyRequest](docs/CoinbaseEngPrimeApiApiValidateCounterpartyRequest.md)
 - [CoinbaseEngPrimeApiApiValidateCounterpartyResponse](docs/CoinbaseEngPrimeApiApiValidateCounterpartyResponse.md)
 - [CoinbaseEngPrimeApiApiValidateWeb3AuthorizationRequest](docs/CoinbaseEngPrimeApiApiValidateWeb3AuthorizationRequest.md)
 - [CoinbaseEngPrimeApiApiValidateWeb3AuthorizationResponse](docs/CoinbaseEngPrimeApiApiValidateWeb3AuthorizationResponse.md)
 - [CoinbaseEngPrimeApiApiValidateWeb3SecurityKeyRequest](docs/CoinbaseEngPrimeApiApiValidateWeb3SecurityKeyRequest.md)
 - [CoinbaseEngPrimeApiApiValidateWeb3SecurityKeyResponse](docs/CoinbaseEngPrimeApiApiValidateWeb3SecurityKeyResponse.md)
 - [CoinbaseEngPrimeApiApiVehicleFinancing](docs/CoinbaseEngPrimeApiApiVehicleFinancing.md)
 - [CoinbaseEngPrimeApiApiVehicleFinancingStreamBody](docs/CoinbaseEngPrimeApiApiVehicleFinancingStreamBody.md)
 - [CoinbaseEngPrimeApiApiVehicleFinancingStreamResponse](docs/CoinbaseEngPrimeApiApiVehicleFinancingStreamResponse.md)
 - [CoinbaseEngPrimeApiApiVehiclePortfolioMargin](docs/CoinbaseEngPrimeApiApiVehiclePortfolioMargin.md)
 - [CoinbaseEngPrimeApiApiVehiclePortfolioMarginStreamBody](docs/CoinbaseEngPrimeApiApiVehiclePortfolioMarginStreamBody.md)
 - [CoinbaseEngPrimeApiApiVehiclePortfolioMarginStreamBodyV2](docs/CoinbaseEngPrimeApiApiVehiclePortfolioMarginStreamBodyV2.md)
 - [CoinbaseEngPrimeApiApiVehiclePortfolioMarginStreamResponse](docs/CoinbaseEngPrimeApiApiVehiclePortfolioMarginStreamResponse.md)
 - [CoinbaseEngPrimeApiApiVehiclePortfolioMarginStreamResponseV2](docs/CoinbaseEngPrimeApiApiVehiclePortfolioMarginStreamResponseV2.md)
 - [CoinbaseEngPrimeApiApiVehiclePortfolioMarginV2](docs/CoinbaseEngPrimeApiApiVehiclePortfolioMarginV2.md)
 - [CoinbaseEngPrimeApiApiVestingInfo](docs/CoinbaseEngPrimeApiApiVestingInfo.md)
 - [CoinbaseEngPrimeApiApiVwapLimitGtd](docs/CoinbaseEngPrimeApiApiVwapLimitGtd.md)
 - [CoinbaseEngPrimeApiApiWalletAction](docs/CoinbaseEngPrimeApiApiWalletAction.md)
 - [CoinbaseEngPrimeApiApiWalletBalance](docs/CoinbaseEngPrimeApiApiWalletBalance.md)
 - [CoinbaseEngPrimeApiApiWalletCollectibleSetting](docs/CoinbaseEngPrimeApiApiWalletCollectibleSetting.md)
 - [CoinbaseEngPrimeApiApiWalletCryptoSetting](docs/CoinbaseEngPrimeApiApiWalletCryptoSetting.md)
 - [CoinbaseEngPrimeApiApiWalletState](docs/CoinbaseEngPrimeApiApiWalletState.md)
 - [CoinbaseEngPrimeApiApiWalletType](docs/CoinbaseEngPrimeApiApiWalletType.md)
 - [CoinbaseEngPrimeApiApiWalletV2](docs/CoinbaseEngPrimeApiApiWalletV2.md)
 - [CoinbaseEngPrimeApiApiWalletWithAddress](docs/CoinbaseEngPrimeApiApiWalletWithAddress.md)
 - [CoinbaseEngPrimeApiApiWarningMsg](docs/CoinbaseEngPrimeApiApiWarningMsg.md)
 - [CoinbaseEngPrimeApiApiWeb3Action](docs/CoinbaseEngPrimeApiApiWeb3Action.md)
 - [CoinbaseEngPrimeApiApiWeb3ActionAction](docs/CoinbaseEngPrimeApiApiWeb3ActionAction.md)
 - [CoinbaseEngPrimeApiApiWeb3ActionActivityDetails](docs/CoinbaseEngPrimeApiApiWeb3ActionActivityDetails.md)
 - [CoinbaseEngPrimeApiApiWeb3ActionType](docs/CoinbaseEngPrimeApiApiWeb3ActionType.md)
 - [CoinbaseEngPrimeApiApiWeb3AddSignerActivityDetails](docs/CoinbaseEngPrimeApiApiWeb3AddSignerActivityDetails.md)
 - [CoinbaseEngPrimeApiApiWeb3Backup](docs/CoinbaseEngPrimeApiApiWeb3Backup.md)
 - [CoinbaseEngPrimeApiApiWeb3DepositActivityDetails](docs/CoinbaseEngPrimeApiApiWeb3DepositActivityDetails.md)
 - [CoinbaseEngPrimeApiApiWeb3DepositActivityMetadata](docs/CoinbaseEngPrimeApiApiWeb3DepositActivityMetadata.md)
 - [CoinbaseEngPrimeApiApiWeb3DepositActivityMetadataAssetTransfer](docs/CoinbaseEngPrimeApiApiWeb3DepositActivityMetadataAssetTransfer.md)
 - [CoinbaseEngPrimeApiApiWeb3Device](docs/CoinbaseEngPrimeApiApiWeb3Device.md)
 - [CoinbaseEngPrimeApiApiWeb3Info](docs/CoinbaseEngPrimeApiApiWeb3Info.md)
 - [CoinbaseEngPrimeApiApiWeb3KeyExport](docs/CoinbaseEngPrimeApiApiWeb3KeyExport.md)
 - [CoinbaseEngPrimeApiApiWeb3MessageActivityDetails](docs/CoinbaseEngPrimeApiApiWeb3MessageActivityDetails.md)
 - [CoinbaseEngPrimeApiApiWeb3Onboarding](docs/CoinbaseEngPrimeApiApiWeb3Onboarding.md)
 - [CoinbaseEngPrimeApiApiWeb3Recovery](docs/CoinbaseEngPrimeApiApiWeb3Recovery.md)
 - [CoinbaseEngPrimeApiApiWeb3RiskScore](docs/CoinbaseEngPrimeApiApiWeb3RiskScore.md)
 - [CoinbaseEngPrimeApiApiWeb3SecurityKey](docs/CoinbaseEngPrimeApiApiWeb3SecurityKey.md)
 - [CoinbaseEngPrimeApiApiWeb3SecurityKeyStatus](docs/CoinbaseEngPrimeApiApiWeb3SecurityKeyStatus.md)
 - [CoinbaseEngPrimeApiApiWeb3SignerAddition](docs/CoinbaseEngPrimeApiApiWeb3SignerAddition.md)
 - [CoinbaseEngPrimeApiApiWeb3TransactionActivityDetails](docs/CoinbaseEngPrimeApiApiWeb3TransactionActivityDetails.md)
 - [CoinbaseEngPrimeApiApiWeb3TransactionActivityMetadata](docs/CoinbaseEngPrimeApiApiWeb3TransactionActivityMetadata.md)
 - [CoinbaseEngPrimeApiApiWeb3TransactionActivityMetadataAssetTransfer](docs/CoinbaseEngPrimeApiApiWeb3TransactionActivityMetadataAssetTransfer.md)
 - [CoinbaseEngPrimeApiApiWeb3TransactionActivityMetadataContractCallData](docs/CoinbaseEngPrimeApiApiWeb3TransactionActivityMetadataContractCallData.md)
 - [CoinbaseEngPrimeApiApiWeb3TransactionActivityMetadataContractCallDataArgument](docs/CoinbaseEngPrimeApiApiWeb3TransactionActivityMetadataContractCallDataArgument.md)
 - [CoinbaseEngPrimeApiApiWeb3TransactionActivityMetadataFees](docs/CoinbaseEngPrimeApiApiWeb3TransactionActivityMetadataFees.md)
 - [CoinbaseEngPrimeApiApiYieldFarm](docs/CoinbaseEngPrimeApiApiYieldFarm.md)
 - [CoinbaseEngPrimeApikeyApiAPIKey](docs/CoinbaseEngPrimeApikeyApiAPIKey.md)
 - [CoinbaseEngPrimeApikeyApiAPIKeyPermission](docs/CoinbaseEngPrimeApikeyApiAPIKeyPermission.md)
 - [CoinbaseEngPrimeApikeyApiAPIKeyState](docs/CoinbaseEngPrimeApikeyApiAPIKeyState.md)
 - [CoinbaseEngPrimeApikeyApiAPIKeyType](docs/CoinbaseEngPrimeApikeyApiAPIKeyType.md)
 - [CoinbaseEngPrimeApikeyApiUser](docs/CoinbaseEngPrimeApikeyApiUser.md)
 - [CoinbaseEngPrimeFeesApiFeeModel](docs/CoinbaseEngPrimeFeesApiFeeModel.md)
 - [CoinbaseEngPrimeFeesApiFeeTier](docs/CoinbaseEngPrimeFeesApiFeeTier.md)
 - [CoinbaseEngPrimeFeesApiGetFeeInfoResponse](docs/CoinbaseEngPrimeFeesApiGetFeeInfoResponse.md)
 - [CoinbaseEngPrimeNotificationApiAssociateObject](docs/CoinbaseEngPrimeNotificationApiAssociateObject.md)
 - [CoinbaseEngPrimeNotificationApiChannel](docs/CoinbaseEngPrimeNotificationApiChannel.md)
 - [CoinbaseEngPrimeNotificationApiConvertedInAppTemplate](docs/CoinbaseEngPrimeNotificationApiConvertedInAppTemplate.md)
 - [CoinbaseEngPrimeNotificationApiCurrencyAndTradeInfo](docs/CoinbaseEngPrimeNotificationApiCurrencyAndTradeInfo.md)
 - [CoinbaseEngPrimeNotificationApiInAppNotification](docs/CoinbaseEngPrimeNotificationApiInAppNotification.md)
 - [CoinbaseEngPrimeNotificationApiInAppNotificationStatusUpdate](docs/CoinbaseEngPrimeNotificationApiInAppNotificationStatusUpdate.md)
 - [CoinbaseEngPrimeNotificationApiInAppResponseMetadata](docs/CoinbaseEngPrimeNotificationApiInAppResponseMetadata.md)
 - [CoinbaseEngPrimeNotificationApiInAppStatus](docs/CoinbaseEngPrimeNotificationApiInAppStatus.md)
 - [CoinbaseEngPrimeNotificationApiInAppType](docs/CoinbaseEngPrimeNotificationApiInAppType.md)
 - [CoinbaseEngPrimeNotificationApiInformationConvertedInAppTemplate](docs/CoinbaseEngPrimeNotificationApiInformationConvertedInAppTemplate.md)
 - [CoinbaseEngPrimeNotificationApiNotificationCategory](docs/CoinbaseEngPrimeNotificationApiNotificationCategory.md)
 - [CoinbaseEngPrimeNotificationApiPortfolioFilter](docs/CoinbaseEngPrimeNotificationApiPortfolioFilter.md)
 - [CoinbaseEngPrimeNotificationApiStatusUpdateConvertedInAppTemplate](docs/CoinbaseEngPrimeNotificationApiStatusUpdateConvertedInAppTemplate.md)
 - [CoinbaseEngPrimeNotificationApiTaskConvertedInAppTemplate](docs/CoinbaseEngPrimeNotificationApiTaskConvertedInAppTemplate.md)
 - [CoinbaseEngPrimeNotificationApiUserPreferenceForChannel](docs/CoinbaseEngPrimeNotificationApiUserPreferenceForChannel.md)
 - [CoinbaseEngPrimeNotificationApiWarningConvertedInAppTemplate](docs/CoinbaseEngPrimeNotificationApiWarningConvertedInAppTemplate.md)
 - [CoinbaseEngPrimeReportingApiDocument](docs/CoinbaseEngPrimeReportingApiDocument.md)
 - [CoinbaseEngPrimeReportingApiDocumentFormat](docs/CoinbaseEngPrimeReportingApiDocumentFormat.md)
 - [CoinbaseEngPrimeReportingApiDocumentState](docs/CoinbaseEngPrimeReportingApiDocumentState.md)
 - [CoinbaseEngPrimeReportingApiDocumentType](docs/CoinbaseEngPrimeReportingApiDocumentType.md)
 - [CoinbaseEngPrimeReportingApiReport](docs/CoinbaseEngPrimeReportingApiReport.md)
 - [CoinbaseEngPrimeReportingApiReportFormat](docs/CoinbaseEngPrimeReportingApiReportFormat.md)
 - [CoinbaseEngPrimeReportingApiReportingCenterGenerateReportType](docs/CoinbaseEngPrimeReportingApiReportingCenterGenerateReportType.md)
 - [CoinbaseEngPrimeReportingApiReportingCenterInitiatorType](docs/CoinbaseEngPrimeReportingApiReportingCenterInitiatorType.md)
 - [CoinbaseEngPrimeReportingApiReportingCenterReportType](docs/CoinbaseEngPrimeReportingApiReportingCenterReportType.md)
 - [CoinbaseEngPrimeReportingApiReportingCenterReportingCenterData](docs/CoinbaseEngPrimeReportingApiReportingCenterReportingCenterData.md)
 - [CoinbaseEngPrimeReportingApiReportingCenterUserInformation](docs/CoinbaseEngPrimeReportingApiReportingCenterUserInformation.md)
 - [CoinbaseEngPrimeReportingApiStatement](docs/CoinbaseEngPrimeReportingApiStatement.md)
 - [CoinbaseEngPrimeReportingApiStatementState](docs/CoinbaseEngPrimeReportingApiStatementState.md)
 - [CoinbaseEngPrimeReportingApiStatementType](docs/CoinbaseEngPrimeReportingApiStatementType.md)
 - [CoinbaseFinancingAmount](docs/CoinbaseFinancingAmount.md)
 - [CoinbaseFinancingAssetLongShortPosition](docs/CoinbaseFinancingAssetLongShortPosition.md)
 - [CoinbaseFinancingCollateral](docs/CoinbaseFinancingCollateral.md)
 - [CoinbaseFinancingCollateralSnapshot](docs/CoinbaseFinancingCollateralSnapshot.md)
 - [CoinbaseFinancingCollateralType](docs/CoinbaseFinancingCollateralType.md)
 - [CoinbaseFinancingConversionSummaryV2](docs/CoinbaseFinancingConversionSummaryV2.md)
 - [CoinbaseFinancingGetAllLocatesByPortfolioResponse](docs/CoinbaseFinancingGetAllLocatesByPortfolioResponse.md)
 - [CoinbaseFinancingGetConversionSummariesV2Response](docs/CoinbaseFinancingGetConversionSummariesV2Response.md)
 - [CoinbaseFinancingGetCurrentLocatesResponse](docs/CoinbaseFinancingGetCurrentLocatesResponse.md)
 - [CoinbaseFinancingGetDalCollateralSnapshotsResponse](docs/CoinbaseFinancingGetDalCollateralSnapshotsResponse.md)
 - [CoinbaseFinancingGetLocateAssetsResponse](docs/CoinbaseFinancingGetLocateAssetsResponse.md)
 - [CoinbaseFinancingLoanInfo](docs/CoinbaseFinancingLoanInfo.md)
 - [CoinbaseFinancingLocateAsset](docs/CoinbaseFinancingLocateAsset.md)
 - [CoinbaseFinancingLocateError](docs/CoinbaseFinancingLocateError.md)
 - [CoinbaseFinancingLocateFiltersWithDate](docs/CoinbaseFinancingLocateFiltersWithDate.md)
 - [CoinbaseFinancingMarginAddOn](docs/CoinbaseFinancingMarginAddOn.md)
 - [CoinbaseFinancingMarginAddOnType](docs/CoinbaseFinancingMarginAddOnType.md)
 - [CoinbaseFinancingMarginCallHistoryRecord](docs/CoinbaseFinancingMarginCallHistoryRecord.md)
 - [CoinbaseFinancingMarginCallStatus](docs/CoinbaseFinancingMarginCallStatus.md)
 - [CoinbaseFinancingMarginInformation](docs/CoinbaseFinancingMarginInformation.md)
 - [CoinbaseFinancingMarketRate](docs/CoinbaseFinancingMarketRate.md)
 - [CoinbaseFinancingNewLocate](docs/CoinbaseFinancingNewLocate.md)
 - [CoinbaseFinancingPMAssetInfo](docs/CoinbaseFinancingPMAssetInfo.md)
 - [CoinbaseFinancingPMLocate](docs/CoinbaseFinancingPMLocate.md)
 - [CoinbaseFinancingPaginationDirection](docs/CoinbaseFinancingPaginationDirection.md)
 - [CoinbaseFinancingPaginationOptions](docs/CoinbaseFinancingPaginationOptions.md)
 - [CoinbaseFinancingPaginationResponse](docs/CoinbaseFinancingPaginationResponse.md)
 - [CoinbaseFinancingPortfolioAsset](docs/CoinbaseFinancingPortfolioAsset.md)
 - [CoinbaseFinancingPortfolioFinancingOverview](docs/CoinbaseFinancingPortfolioFinancingOverview.md)
 - [CoinbaseFinancingPortfolioOverviewResponse](docs/CoinbaseFinancingPortfolioOverviewResponse.md)
 - [CoinbaseFinancingRateType](docs/CoinbaseFinancingRateType.md)
 - [CoinbaseFinancingSettlementDue](docs/CoinbaseFinancingSettlementDue.md)
 - [CoinbaseFinancingSettlementStatus](docs/CoinbaseFinancingSettlementStatus.md)
 - [CoinbaseFinancingSubmitDALRecallRequest](docs/CoinbaseFinancingSubmitDALRecallRequest.md)
 - [CoinbaseFinancingSubmitDALRecallResponse](docs/CoinbaseFinancingSubmitDALRecallResponse.md)
 - [CoinbaseFinancingSubmitLocatesRequest](docs/CoinbaseFinancingSubmitLocatesRequest.md)
 - [CoinbaseFinancingSubmitLocatesResponse](docs/CoinbaseFinancingSubmitLocatesResponse.md)
 - [CoinbaseFinancingSubmitMultipleLocatesRequest](docs/CoinbaseFinancingSubmitMultipleLocatesRequest.md)
 - [CoinbaseFinancingSubmitMultipleLocatesResponse](docs/CoinbaseFinancingSubmitMultipleLocatesResponse.md)
 - [CoinbaseFinancingTFAssetInfo](docs/CoinbaseFinancingTFAssetInfo.md)
 - [CoinbasePaymentsCommonAddress](docs/CoinbasePaymentsCommonAddress.md)
 - [CoinbasePaymentsCommonDigitalWalletDetails](docs/CoinbasePaymentsCommonDigitalWalletDetails.md)
 - [CoinbasePaymentsCommonMoney](docs/CoinbasePaymentsCommonMoney.md)
 - [CoinbasePaymentsCommonPaymentMethodsAddress](docs/CoinbasePaymentsCommonPaymentMethodsAddress.md)
 - [CoinbasePaymentsCommonPaymentMethodsAllocation](docs/CoinbasePaymentsCommonPaymentMethodsAllocation.md)
 - [CoinbasePaymentsCommonPaymentMethodsAllocationLeg](docs/CoinbasePaymentsCommonPaymentMethodsAllocationLeg.md)
 - [CoinbasePaymentsCommonPaymentMethodsApplePay](docs/CoinbasePaymentsCommonPaymentMethodsApplePay.md)
 - [CoinbasePaymentsCommonPaymentMethodsApplePayBraintreeData](docs/CoinbasePaymentsCommonPaymentMethodsApplePayBraintreeData.md)
 - [CoinbasePaymentsCommonPaymentMethodsApplePayResult](docs/CoinbasePaymentsCommonPaymentMethodsApplePayResult.md)
 - [CoinbasePaymentsCommonPaymentMethodsApplePayScheme](docs/CoinbasePaymentsCommonPaymentMethodsApplePayScheme.md)
 - [CoinbasePaymentsCommonPaymentMethodsBancomatPay](docs/CoinbasePaymentsCommonPaymentMethodsBancomatPay.md)
 - [CoinbasePaymentsCommonPaymentMethodsBancomatPayAccount](docs/CoinbasePaymentsCommonPaymentMethodsBancomatPayAccount.md)
 - [CoinbasePaymentsCommonPaymentMethodsBankAccount](docs/CoinbasePaymentsCommonPaymentMethodsBankAccount.md)
 - [CoinbasePaymentsCommonPaymentMethodsBlockchainAddress](docs/CoinbasePaymentsCommonPaymentMethodsBlockchainAddress.md)
 - [CoinbasePaymentsCommonPaymentMethodsBlockchainTransaction](docs/CoinbasePaymentsCommonPaymentMethodsBlockchainTransaction.md)
 - [CoinbasePaymentsCommonPaymentMethodsCTN](docs/CoinbasePaymentsCommonPaymentMethodsCTN.md)
 - [CoinbasePaymentsCommonPaymentMethodsCard](docs/CoinbasePaymentsCommonPaymentMethodsCard.md)
 - [CoinbasePaymentsCommonPaymentMethodsCardDob](docs/CoinbasePaymentsCommonPaymentMethodsCardDob.md)
 - [CoinbasePaymentsCommonPaymentMethodsCardScheme](docs/CoinbasePaymentsCommonPaymentMethodsCardScheme.md)
 - [CoinbasePaymentsCommonPaymentMethodsCbit](docs/CoinbasePaymentsCommonPaymentMethodsCbit.md)
 - [CoinbasePaymentsCommonPaymentMethodsCheckoutPaymentLink](docs/CoinbasePaymentsCommonPaymentMethodsCheckoutPaymentLink.md)
 - [CoinbasePaymentsCommonPaymentMethodsCoinbaseAccount](docs/CoinbasePaymentsCommonPaymentMethodsCoinbaseAccount.md)
 - [CoinbasePaymentsCommonPaymentMethodsCustodialPool](docs/CoinbasePaymentsCommonPaymentMethodsCustodialPool.md)
 - [CoinbasePaymentsCommonPaymentMethodsDAppWalletAccount](docs/CoinbasePaymentsCommonPaymentMethodsDAppWalletAccount.md)
 - [CoinbasePaymentsCommonPaymentMethodsDAppWalletBlockchainAddress](docs/CoinbasePaymentsCommonPaymentMethodsDAppWalletBlockchainAddress.md)
 - [CoinbasePaymentsCommonPaymentMethodsDefaultAccount](docs/CoinbasePaymentsCommonPaymentMethodsDefaultAccount.md)
 - [CoinbasePaymentsCommonPaymentMethodsDenebIMPS](docs/CoinbasePaymentsCommonPaymentMethodsDenebIMPS.md)
 - [CoinbasePaymentsCommonPaymentMethodsDenebUPI](docs/CoinbasePaymentsCommonPaymentMethodsDenebUPI.md)
 - [CoinbasePaymentsCommonPaymentMethodsDerivativeSettlement](docs/CoinbasePaymentsCommonPaymentMethodsDerivativeSettlement.md)
 - [CoinbasePaymentsCommonPaymentMethodsDerivativeSettlementAccountSettlement](docs/CoinbasePaymentsCommonPaymentMethodsDerivativeSettlementAccountSettlement.md)
 - [CoinbasePaymentsCommonPaymentMethodsDerivativeSettlementEquityReset](docs/CoinbasePaymentsCommonPaymentMethodsDerivativeSettlementEquityReset.md)
 - [CoinbasePaymentsCommonPaymentMethodsDirectDeposit](docs/CoinbasePaymentsCommonPaymentMethodsDirectDeposit.md)
 - [CoinbasePaymentsCommonPaymentMethodsEmailAddress](docs/CoinbasePaymentsCommonPaymentMethodsEmailAddress.md)
 - [CoinbasePaymentsCommonPaymentMethodsExpiryDate](docs/CoinbasePaymentsCommonPaymentMethodsExpiryDate.md)
 - [CoinbasePaymentsCommonPaymentMethodsExternalPaymentMethod](docs/CoinbasePaymentsCommonPaymentMethodsExternalPaymentMethod.md)
 - [CoinbasePaymentsCommonPaymentMethodsFedwire](docs/CoinbasePaymentsCommonPaymentMethodsFedwire.md)
 - [CoinbasePaymentsCommonPaymentMethodsFedwireAccount](docs/CoinbasePaymentsCommonPaymentMethodsFedwireAccount.md)
 - [CoinbasePaymentsCommonPaymentMethodsFedwireAddress](docs/CoinbasePaymentsCommonPaymentMethodsFedwireAddress.md)
 - [CoinbasePaymentsCommonPaymentMethodsFedwireInstitution](docs/CoinbasePaymentsCommonPaymentMethodsFedwireInstitution.md)
 - [CoinbasePaymentsCommonPaymentMethodsFedwireInstitutionType](docs/CoinbasePaymentsCommonPaymentMethodsFedwireInstitutionType.md)
 - [CoinbasePaymentsCommonPaymentMethodsFirstDataToken](docs/CoinbasePaymentsCommonPaymentMethodsFirstDataToken.md)
 - [CoinbasePaymentsCommonPaymentMethodsFundMovement](docs/CoinbasePaymentsCommonPaymentMethodsFundMovement.md)
 - [CoinbasePaymentsCommonPaymentMethodsGooglePay](docs/CoinbasePaymentsCommonPaymentMethodsGooglePay.md)
 - [CoinbasePaymentsCommonPaymentMethodsGooglePayBraintreeData](docs/CoinbasePaymentsCommonPaymentMethodsGooglePayBraintreeData.md)
 - [CoinbasePaymentsCommonPaymentMethodsGooglePayResult](docs/CoinbasePaymentsCommonPaymentMethodsGooglePayResult.md)
 - [CoinbasePaymentsCommonPaymentMethodsGooglePayScheme](docs/CoinbasePaymentsCommonPaymentMethodsGooglePayScheme.md)
 - [CoinbasePaymentsCommonPaymentMethodsHotWallet](docs/CoinbasePaymentsCommonPaymentMethodsHotWallet.md)
 - [CoinbasePaymentsCommonPaymentMethodsIdeal](docs/CoinbasePaymentsCommonPaymentMethodsIdeal.md)
 - [CoinbasePaymentsCommonPaymentMethodsIdentityContractCall](docs/CoinbasePaymentsCommonPaymentMethodsIdentityContractCall.md)
 - [CoinbasePaymentsCommonPaymentMethodsInterac](docs/CoinbasePaymentsCommonPaymentMethodsInterac.md)
 - [CoinbasePaymentsCommonPaymentMethodsInteracAccount](docs/CoinbasePaymentsCommonPaymentMethodsInteracAccount.md)
 - [CoinbasePaymentsCommonPaymentMethodsIntraBank](docs/CoinbasePaymentsCommonPaymentMethodsIntraBank.md)
 - [CoinbasePaymentsCommonPaymentMethodsLedgerAccount](docs/CoinbasePaymentsCommonPaymentMethodsLedgerAccount.md)
 - [CoinbasePaymentsCommonPaymentMethodsLedgerNamedAccount](docs/CoinbasePaymentsCommonPaymentMethodsLedgerNamedAccount.md)
 - [CoinbasePaymentsCommonPaymentMethodsLiquidityPool](docs/CoinbasePaymentsCommonPaymentMethodsLiquidityPool.md)
 - [CoinbasePaymentsCommonPaymentMethodsMagicSpendBlockchainAddress](docs/CoinbasePaymentsCommonPaymentMethodsMagicSpendBlockchainAddress.md)
 - [CoinbasePaymentsCommonPaymentMethodsMerchant](docs/CoinbasePaymentsCommonPaymentMethodsMerchant.md)
 - [CoinbasePaymentsCommonPaymentMethodsNovaAccount](docs/CoinbasePaymentsCommonPaymentMethodsNovaAccount.md)
 - [CoinbasePaymentsCommonPaymentMethodsOwner](docs/CoinbasePaymentsCommonPaymentMethodsOwner.md)
 - [CoinbasePaymentsCommonPaymentMethodsOwnerType](docs/CoinbasePaymentsCommonPaymentMethodsOwnerType.md)
 - [CoinbasePaymentsCommonPaymentMethodsPaymentMethod](docs/CoinbasePaymentsCommonPaymentMethodsPaymentMethod.md)
 - [CoinbasePaymentsCommonPaymentMethodsPaymentMethodType](docs/CoinbasePaymentsCommonPaymentMethodsPaymentMethodType.md)
 - [CoinbasePaymentsCommonPaymentMethodsPaypal](docs/CoinbasePaymentsCommonPaymentMethodsPaypal.md)
 - [CoinbasePaymentsCommonPaymentMethodsPaypalAccount](docs/CoinbasePaymentsCommonPaymentMethodsPaypalAccount.md)
 - [CoinbasePaymentsCommonPaymentMethodsPaypalMerchant](docs/CoinbasePaymentsCommonPaymentMethodsPaypalMerchant.md)
 - [CoinbasePaymentsCommonPaymentMethodsPaypalMetadata](docs/CoinbasePaymentsCommonPaymentMethodsPaypalMetadata.md)
 - [CoinbasePaymentsCommonPaymentMethodsPhoneNumber](docs/CoinbasePaymentsCommonPaymentMethodsPhoneNumber.md)
 - [CoinbasePaymentsCommonPaymentMethodsPixEbanx](docs/CoinbasePaymentsCommonPaymentMethodsPixEbanx.md)
 - [CoinbasePaymentsCommonPaymentMethodsPixEbanxPixDeposit](docs/CoinbasePaymentsCommonPaymentMethodsPixEbanxPixDeposit.md)
 - [CoinbasePaymentsCommonPaymentMethodsPixEbanxPixWithdrawal](docs/CoinbasePaymentsCommonPaymentMethodsPixEbanxPixWithdrawal.md)
 - [CoinbasePaymentsCommonPaymentMethodsProAccount](docs/CoinbasePaymentsCommonPaymentMethodsProAccount.md)
 - [CoinbasePaymentsCommonPaymentMethodsProInternalAccount](docs/CoinbasePaymentsCommonPaymentMethodsProInternalAccount.md)
 - [CoinbasePaymentsCommonPaymentMethodsRemitly](docs/CoinbasePaymentsCommonPaymentMethodsRemitly.md)
 - [CoinbasePaymentsCommonPaymentMethodsRemitlyAccount](docs/CoinbasePaymentsCommonPaymentMethodsRemitlyAccount.md)
 - [CoinbasePaymentsCommonPaymentMethodsRtp](docs/CoinbasePaymentsCommonPaymentMethodsRtp.md)
 - [CoinbasePaymentsCommonPaymentMethodsRtpAccount](docs/CoinbasePaymentsCommonPaymentMethodsRtpAccount.md)
 - [CoinbasePaymentsCommonPaymentMethodsRtpInstitution](docs/CoinbasePaymentsCommonPaymentMethodsRtpInstitution.md)
 - [CoinbasePaymentsCommonPaymentMethodsSepa](docs/CoinbasePaymentsCommonPaymentMethodsSepa.md)
 - [CoinbasePaymentsCommonPaymentMethodsSepaAccount](docs/CoinbasePaymentsCommonPaymentMethodsSepaAccount.md)
 - [CoinbasePaymentsCommonPaymentMethodsSepaAccountDetail](docs/CoinbasePaymentsCommonPaymentMethodsSepaAccountDetail.md)
 - [CoinbasePaymentsCommonPaymentMethodsSepaInstitution](docs/CoinbasePaymentsCommonPaymentMethodsSepaInstitution.md)
 - [CoinbasePaymentsCommonPaymentMethodsSepaV2](docs/CoinbasePaymentsCommonPaymentMethodsSepaV2.md)
 - [CoinbasePaymentsCommonPaymentMethodsSgFast](docs/CoinbasePaymentsCommonPaymentMethodsSgFast.md)
 - [CoinbasePaymentsCommonPaymentMethodsSgFastAccount](docs/CoinbasePaymentsCommonPaymentMethodsSgFastAccount.md)
 - [CoinbasePaymentsCommonPaymentMethodsSgFastInstitution](docs/CoinbasePaymentsCommonPaymentMethodsSgFastInstitution.md)
 - [CoinbasePaymentsCommonPaymentMethodsSgPayNow](docs/CoinbasePaymentsCommonPaymentMethodsSgPayNow.md)
 - [CoinbasePaymentsCommonPaymentMethodsSgPayNowIdentifierType](docs/CoinbasePaymentsCommonPaymentMethodsSgPayNowIdentifierType.md)
 - [CoinbasePaymentsCommonPaymentMethodsSignet](docs/CoinbasePaymentsCommonPaymentMethodsSignet.md)
 - [CoinbasePaymentsCommonPaymentMethodsSofort](docs/CoinbasePaymentsCommonPaymentMethodsSofort.md)
 - [CoinbasePaymentsCommonPaymentMethodsSwift](docs/CoinbasePaymentsCommonPaymentMethodsSwift.md)
 - [CoinbasePaymentsCommonPaymentMethodsSwiftAccount](docs/CoinbasePaymentsCommonPaymentMethodsSwiftAccount.md)
 - [CoinbasePaymentsCommonPaymentMethodsSwiftInstitution](docs/CoinbasePaymentsCommonPaymentMethodsSwiftInstitution.md)
 - [CoinbasePaymentsCommonPaymentMethodsTransferPointer](docs/CoinbasePaymentsCommonPaymentMethodsTransferPointer.md)
 - [CoinbasePaymentsCommonPaymentMethodsUk](docs/CoinbasePaymentsCommonPaymentMethodsUk.md)
 - [CoinbasePaymentsCommonPaymentMethodsUkAccount](docs/CoinbasePaymentsCommonPaymentMethodsUkAccount.md)
 - [CoinbasePaymentsCommonPaymentMethodsUkInstitution](docs/CoinbasePaymentsCommonPaymentMethodsUkInstitution.md)
 - [CoinbasePaymentsCommonPaymentMethodsUser](docs/CoinbasePaymentsCommonPaymentMethodsUser.md)
 - [CoinbasePaymentsCommonPaymentMethodsVaultToken](docs/CoinbasePaymentsCommonPaymentMethodsVaultToken.md)
 - [CoinbasePaymentsCommonPaymentMethodsVendorPayment](docs/CoinbasePaymentsCommonPaymentMethodsVendorPayment.md)
 - [CoinbasePaymentsCommonPaymentMethodsVenue](docs/CoinbasePaymentsCommonPaymentMethodsVenue.md)
 - [CoinbasePaymentsCommonPaymentMethodsWorldpayParams](docs/CoinbasePaymentsCommonPaymentMethodsWorldpayParams.md)
 - [CoinbasePaymentsCommonPaymentMethodsZaakpayMobikwik](docs/CoinbasePaymentsCommonPaymentMethodsZaakpayMobikwik.md)
 - [CoinbasePaymentsCommonPaymentMethodsZengin](docs/CoinbasePaymentsCommonPaymentMethodsZengin.md)
 - [CoinbasePaymentsCommonPaymentMethodsZenginAccount](docs/CoinbasePaymentsCommonPaymentMethodsZenginAccount.md)
 - [CoinbasePaymentsCommonPaymentMethodsZenginInstitution](docs/CoinbasePaymentsCommonPaymentMethodsZenginInstitution.md)
 - [CoinbasePaymentsCommonPaymentMethodsZenginV2](docs/CoinbasePaymentsCommonPaymentMethodsZenginV2.md)
 - [CoinbasePaymentsCommonPaymentMethodsZenginV2Account](docs/CoinbasePaymentsCommonPaymentMethodsZenginV2Account.md)
 - [CoinbasePaymentsCommonPaymentMethodsZenginV2Institution](docs/CoinbasePaymentsCommonPaymentMethodsZenginV2Institution.md)
 - [CoinbasePaymentsCommonPaymentMethodsZepto](docs/CoinbasePaymentsCommonPaymentMethodsZepto.md)
 - [CoinbasePaymentsCommonPaymentMethodsZeptoAccount](docs/CoinbasePaymentsCommonPaymentMethodsZeptoAccount.md)
 - [CoinbaseRewardsOrchestrationAmount](docs/CoinbaseRewardsOrchestrationAmount.md)
 - [CoinbaseRewardsOrchestrationEnrollment](docs/CoinbaseRewardsOrchestrationEnrollment.md)
 - [CoinbaseRewardsOrchestrationEntityType](docs/CoinbaseRewardsOrchestrationEntityType.md)
 - [CoinbaseRewardsOrchestrationMonthlyRewards](docs/CoinbaseRewardsOrchestrationMonthlyRewards.md)
 - [CoinbaseRewardsOrchestrationPlatform](docs/CoinbaseRewardsOrchestrationPlatform.md)
 - [CoinbaseRewardsOrchestrationPreference](docs/CoinbaseRewardsOrchestrationPreference.md)
 - [CoinbaseRewardsOrchestrationPrimeAssetInScope](docs/CoinbaseRewardsOrchestrationPrimeAssetInScope.md)
 - [CoinbaseRewardsOrchestrationPrimeRewardsEarnings](docs/CoinbaseRewardsOrchestrationPrimeRewardsEarnings.md)
 - [CoinbaseRewardsOrchestrationProgram](docs/CoinbaseRewardsOrchestrationProgram.md)
 - [CoinbaseRewardsOrchestrationRateCard](docs/CoinbaseRewardsOrchestrationRateCard.md)
 - [CoinbaseRewardsOrchestrationRateTier](docs/CoinbaseRewardsOrchestrationRateTier.md)
 - [CoinbaseTwsActionVerb](docs/CoinbaseTwsActionVerb.md)
 - [CoinbaseTwsActionVerbType](docs/CoinbaseTwsActionVerbType.md)
 - [CoinbaseTwsAvaxStakingOption](docs/CoinbaseTwsAvaxStakingOption.md)
 - [CoinbaseTwsBlockchainAddress](docs/CoinbaseTwsBlockchainAddress.md)
 - [CoinbaseTwsConversionAction](docs/CoinbaseTwsConversionAction.md)
 - [CoinbaseTwsCreateWalletOption](docs/CoinbaseTwsCreateWalletOption.md)
 - [CoinbaseTwsCryptoDestination](docs/CoinbaseTwsCryptoDestination.md)
 - [CoinbaseTwsCryptoWithdrawalAction](docs/CoinbaseTwsCryptoWithdrawalAction.md)
 - [CoinbaseTwsDappContext](docs/CoinbaseTwsDappContext.md)
 - [CoinbaseTwsDerivativeSettlementAction](docs/CoinbaseTwsDerivativeSettlementAction.md)
 - [CoinbaseTwsDerivativeSettlementActionSettlementMovement](docs/CoinbaseTwsDerivativeSettlementActionSettlementMovement.md)
 - [CoinbaseTwsEth2Option](docs/CoinbaseTwsEth2Option.md)
 - [CoinbaseTwsEvmTransactionDetails](docs/CoinbaseTwsEvmTransactionDetails.md)
 - [CoinbaseTwsFiatDestination](docs/CoinbaseTwsFiatDestination.md)
 - [CoinbaseTwsFiatWithdrawalAction](docs/CoinbaseTwsFiatWithdrawalAction.md)
 - [CoinbaseTwsGovernanceAction](docs/CoinbaseTwsGovernanceAction.md)
 - [CoinbaseTwsGovernanceActionType](docs/CoinbaseTwsGovernanceActionType.md)
 - [CoinbaseTwsLedgerDestination](docs/CoinbaseTwsLedgerDestination.md)
 - [CoinbaseTwsLedgerHoldReplacement](docs/CoinbaseTwsLedgerHoldReplacement.md)
 - [CoinbaseTwsLedgerTransferAction](docs/CoinbaseTwsLedgerTransferAction.md)
 - [CoinbaseTwsLedgerTransferActionType](docs/CoinbaseTwsLedgerTransferActionType.md)
 - [CoinbaseTwsLsethOption](docs/CoinbaseTwsLsethOption.md)
 - [CoinbaseTwsMatchTransferAction](docs/CoinbaseTwsMatchTransferAction.md)
 - [CoinbaseTwsMatchTransferActionMatchTransferDetail](docs/CoinbaseTwsMatchTransferActionMatchTransferDetail.md)
 - [CoinbaseTwsNamedAccountMetadata](docs/CoinbaseTwsNamedAccountMetadata.md)
 - [CoinbaseTwsNamedAccountType](docs/CoinbaseTwsNamedAccountType.md)
 - [CoinbaseTwsNetworkFamily](docs/CoinbaseTwsNetworkFamily.md)
 - [CoinbaseTwsNetworkMetadata](docs/CoinbaseTwsNetworkMetadata.md)
 - [CoinbaseTwsNftWithdrawalAction](docs/CoinbaseTwsNftWithdrawalAction.md)
 - [CoinbaseTwsOmnibusQcWalletCreationOption](docs/CoinbaseTwsOmnibusQcWalletCreationOption.md)
 - [CoinbaseTwsSigningBackend](docs/CoinbaseTwsSigningBackend.md)
 - [CoinbaseTwsStacksStakeOption](docs/CoinbaseTwsStacksStakeOption.md)
 - [CoinbaseTwsStakeAction](docs/CoinbaseTwsStakeAction.md)
 - [CoinbaseTwsStakeActionType](docs/CoinbaseTwsStakeActionType.md)
 - [CoinbaseTwsStakeOptionStakingType](docs/CoinbaseTwsStakeOptionStakingType.md)
 - [CoinbaseTwsTradingWalletCreationOption](docs/CoinbaseTwsTradingWalletCreationOption.md)
 - [CoinbaseTwsWalletAndBlockchainAddress](docs/CoinbaseTwsWalletAndBlockchainAddress.md)
 - [CoinbaseTwsWalletType](docs/CoinbaseTwsWalletType.md)
 - [CoinbaseTwsWeb3MessageAction](docs/CoinbaseTwsWeb3MessageAction.md)
 - [CoinbaseTwsWeb3TransactionAction](docs/CoinbaseTwsWeb3TransactionAction.md)
 - [CoinbaseTwsWeb3TransactionMetadata](docs/CoinbaseTwsWeb3TransactionMetadata.md)
 - [CoinbaseTwsWeb3TransactionMetadataWeb3TransactionAssetTransfer](docs/CoinbaseTwsWeb3TransactionMetadataWeb3TransactionAssetTransfer.md)
 - [CoinbaseTwsWeb3TransactionMetadataWeb3TransactionFees](docs/CoinbaseTwsWeb3TransactionMetadataWeb3TransactionFees.md)
 - [CoinbaseTwsWeb3WalletCreationOption](docs/CoinbaseTwsWeb3WalletCreationOption.md)
 - [CoreContractExpiryType](docs/CoreContractExpiryType.md)
 - [CoreOrderPlacementSource](docs/CoreOrderPlacementSource.md)
 - [CoreProductType](docs/CoreProductType.md)
 - [CoreRiskManagementType](docs/CoreRiskManagementType.md)
 - [EngPrimeBillingApiAUCContractFeeTiers](docs/EngPrimeBillingApiAUCContractFeeTiers.md)
 - [EngPrimeBillingApiFeeTier](docs/EngPrimeBillingApiFeeTier.md)
 - [EngPrimeBillingApiGetAUCFeeTiersResponse](docs/EngPrimeBillingApiGetAUCFeeTiersResponse.md)
 - [EngPrimePolicyApiCompletedEvaluation](docs/EngPrimePolicyApiCompletedEvaluation.md)
 - [EngPrimePolicyApiConditionOptions](docs/EngPrimePolicyApiConditionOptions.md)
 - [EngPrimePolicyApiConditionValue](docs/EngPrimePolicyApiConditionValue.md)
 - [EngPrimePolicyApiConsensusSetting](docs/EngPrimePolicyApiConsensusSetting.md)
 - [EngPrimePolicyApiEvaluationInput](docs/EngPrimePolicyApiEvaluationInput.md)
 - [EngPrimePolicyApiEvaluationResult](docs/EngPrimePolicyApiEvaluationResult.md)
 - [EngPrimePolicyApiHierarchy](docs/EngPrimePolicyApiHierarchy.md)
 - [EngPrimePolicyApiHierarchyType](docs/EngPrimePolicyApiHierarchyType.md)
 - [EngPrimePolicyApiListPoliciesResponse](docs/EngPrimePolicyApiListPoliciesResponse.md)
 - [EngPrimePolicyApiObjectReference](docs/EngPrimePolicyApiObjectReference.md)
 - [EngPrimePolicyApiOutcome](docs/EngPrimePolicyApiOutcome.md)
 - [EngPrimePolicyApiOutcomeDetail](docs/EngPrimePolicyApiOutcomeDetail.md)
 - [EngPrimePolicyApiPolicy](docs/EngPrimePolicyApiPolicy.md)
 - [EngPrimePolicyApiRule](docs/EngPrimePolicyApiRule.md)
 - [EngPrimePolicyApiVideoCallSetting](docs/EngPrimePolicyApiVideoCallSetting.md)
 - [EngPrimePolicyApiWeb3Signers](docs/EngPrimePolicyApiWeb3Signers.md)
 - [GoogleProtobufAny](docs/GoogleProtobufAny.md)
 - [GoogleProtobufNullValue](docs/GoogleProtobufNullValue.md)
 - [GrpcGatewayRuntimeError](docs/GrpcGatewayRuntimeError.md)
 - [GrpcGatewayRuntimeStreamError](docs/GrpcGatewayRuntimeStreamError.md)
 - [ScannerAddress](docs/ScannerAddress.md)
 - [ScannerAmount](docs/ScannerAmount.md)
 - [ScannerAmountRange](docs/ScannerAmountRange.md)
 - [ScannerAttribute](docs/ScannerAttribute.md)
 - [ScannerAttributeType](docs/ScannerAttributeType.md)
 - [ScannerBalanceApprovalOperation](docs/ScannerBalanceApprovalOperation.md)
 - [ScannerBalanceTransferOperation](docs/ScannerBalanceTransferOperation.md)
 - [ScannerBlockchain](docs/ScannerBlockchain.md)
 - [ScannerContract](docs/ScannerContract.md)
 - [ScannerContractOwnershipTransferOperation](docs/ScannerContractOwnershipTransferOperation.md)
 - [ScannerCurrency](docs/ScannerCurrency.md)
 - [ScannerCurrencyType](docs/ScannerCurrencyType.md)
 - [ScannerDecodedMessage](docs/ScannerDecodedMessage.md)
 - [ScannerHint](docs/ScannerHint.md)
 - [ScannerHintType](docs/ScannerHintType.md)
 - [ScannerImage](docs/ScannerImage.md)
 - [ScannerItemApprovalAllOperation](docs/ScannerItemApprovalAllOperation.md)
 - [ScannerItemApprovalOperation](docs/ScannerItemApprovalOperation.md)
 - [ScannerItemTransferOperation](docs/ScannerItemTransferOperation.md)
 - [ScannerMessageValidation](docs/ScannerMessageValidation.md)
 - [ScannerNFTCollection](docs/ScannerNFTCollection.md)
 - [ScannerNFTItem](docs/ScannerNFTItem.md)
 - [ScannerNotice](docs/ScannerNotice.md)
 - [ScannerNoticeLevel](docs/ScannerNoticeLevel.md)
 - [ScannerNoticeType](docs/ScannerNoticeType.md)
 - [ScannerOperation](docs/ScannerOperation.md)
 - [ScannerOperationType](docs/ScannerOperationType.md)
 - [ScannerQuantityRange](docs/ScannerQuantityRange.md)
 - [ScannerResult](docs/ScannerResult.md)
 - [ScannerScanMessageResponse](docs/ScannerScanMessageResponse.md)
 - [ScannerScanResponse](docs/ScannerScanResponse.md)
 - [ScannerSourceCoordinate](docs/ScannerSourceCoordinate.md)
 - [ScannerTime](docs/ScannerTime.md)
 - [ScannerTxDataBundle](docs/ScannerTxDataBundle.md)
 - [ScannerUnit](docs/ScannerUnit.md)
 - [ScannerValidity](docs/ScannerValidity.md)
 - [StreamResultOfCoinbaseBrokerageProxyTradingApiGetCandlesStreamResponse](docs/StreamResultOfCoinbaseBrokerageProxyTradingApiGetCandlesStreamResponse.md)
 - [StreamResultOfCoinbaseBrokerageProxyTradingApiGetDepthStreamResponse](docs/StreamResultOfCoinbaseBrokerageProxyTradingApiGetDepthStreamResponse.md)
 - [StreamResultOfCoinbaseBrokerageProxyTradingApiGetLadderStreamResponse](docs/StreamResultOfCoinbaseBrokerageProxyTradingApiGetLadderStreamResponse.md)
 - [StreamResultOfCoinbaseBrokerageProxyTradingApiGetMarketTradesStreamResponse](docs/StreamResultOfCoinbaseBrokerageProxyTradingApiGetMarketTradesStreamResponse.md)
 - [StreamResultOfCoinbaseBrokerageProxyTradingApiGetOrderSimulationResponse](docs/StreamResultOfCoinbaseBrokerageProxyTradingApiGetOrderSimulationResponse.md)
 - [StreamResultOfCoinbaseBrokerageProxyTradingApiGetProductStatsStreamResponse](docs/StreamResultOfCoinbaseBrokerageProxyTradingApiGetProductStatsStreamResponse.md)
 - [StreamResultOfCoinbaseBrokerageProxyTradingApiOrderStreamResponse](docs/StreamResultOfCoinbaseBrokerageProxyTradingApiOrderStreamResponse.md)
 - [StreamResultOfCoinbaseEngPrimeApiApiGetBalancesStreamResponse](docs/StreamResultOfCoinbaseEngPrimeApiApiGetBalancesStreamResponse.md)
 - [StreamResultOfCoinbaseEngPrimeApiApiGetPortfolioActivitiesStreamResponse](docs/StreamResultOfCoinbaseEngPrimeApiApiGetPortfolioActivitiesStreamResponse.md)
 - [StreamResultOfCoinbaseEngPrimeApiApiGetPortfolioActivityStreamResponse](docs/StreamResultOfCoinbaseEngPrimeApiApiGetPortfolioActivityStreamResponse.md)
 - [StreamResultOfCoinbaseEngPrimeApiApiGetPrimeActivitiesStreamResponse](docs/StreamResultOfCoinbaseEngPrimeApiApiGetPrimeActivitiesStreamResponse.md)
 - [StreamResultOfCoinbaseEngPrimeApiApiGetPrimeActivityDetailsStreamResponse](docs/StreamResultOfCoinbaseEngPrimeApiApiGetPrimeActivityDetailsStreamResponse.md)
 - [StreamResultOfCoinbaseEngPrimeApiApiGetPrimeActivityDetailsV2StreamResponse](docs/StreamResultOfCoinbaseEngPrimeApiApiGetPrimeActivityDetailsV2StreamResponse.md)
 - [StreamResultOfCoinbaseEngPrimeApiApiGetProductsStreamResponse](docs/StreamResultOfCoinbaseEngPrimeApiApiGetProductsStreamResponse.md)
 - [StreamResultOfCoinbaseEngPrimeApiApiGetUserInAppNotificationsStreamResponse](docs/StreamResultOfCoinbaseEngPrimeApiApiGetUserInAppNotificationsStreamResponse.md)
 - [StreamResultOfCoinbaseEngPrimeApiApiGetVehicleCurrenciesStreamResponse](docs/StreamResultOfCoinbaseEngPrimeApiApiGetVehicleCurrenciesStreamResponse.md)
 - [StreamResultOfCoinbaseEngPrimeApiApiGetVehicleSpotPricesStreamResponse](docs/StreamResultOfCoinbaseEngPrimeApiApiGetVehicleSpotPricesStreamResponse.md)
 - [StreamResultOfCoinbaseEngPrimeApiApiPortfolioFinancingProductStreamResponse](docs/StreamResultOfCoinbaseEngPrimeApiApiPortfolioFinancingProductStreamResponse.md)
 - [StreamResultOfCoinbaseEngPrimeApiApiPortfolioFinancingStreamResponse](docs/StreamResultOfCoinbaseEngPrimeApiApiPortfolioFinancingStreamResponse.md)
 - [StreamResultOfCoinbaseEngPrimeApiApiVehicleFinancingStreamResponse](docs/StreamResultOfCoinbaseEngPrimeApiApiVehicleFinancingStreamResponse.md)
 - [StreamResultOfCoinbaseEngPrimeApiApiVehiclePortfolioMarginStreamResponse](docs/StreamResultOfCoinbaseEngPrimeApiApiVehiclePortfolioMarginStreamResponse.md)
 - [StreamResultOfCoinbaseEngPrimeApiApiVehiclePortfolioMarginStreamResponseV2](docs/StreamResultOfCoinbaseEngPrimeApiApiVehiclePortfolioMarginStreamResponseV2.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



