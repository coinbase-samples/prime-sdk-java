# PrimeApiApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**primeAPIBulkUserRolesUpdate**](PrimeApiApi.md#primeAPIBulkUserRolesUpdate) | **POST** /v1/users/{user_id}/roles/update | 
[**primeAPICancelTransaction**](PrimeApiApi.md#primeAPICancelTransaction) | **POST** /v1/portfolios/{portfolio_id}/transactions/cancel | 
[**primeAPICreateOrUpdatePreference**](PrimeApiApi.md#primeAPICreateOrUpdatePreference) | **POST** /v1/vehicles/{vehicle_id}/preferences | 
[**primeAPICreateOrderFillsDocument**](PrimeApiApi.md#primeAPICreateOrderFillsDocument) | **POST** /v1/portfolios/{portfolio_id}/orders/{order_id}/documents | 
[**primeAPICreateTestTransaction**](PrimeApiApi.md#primeAPICreateTestTransaction) | **POST** /v1/portfolios/{portfolio_id}/test_transaction | 
[**primeAPICreateTransaction**](PrimeApiApi.md#primeAPICreateTransaction) | **POST** /v1/portfolios/{portfolio_id}/transactions | 
[**primeAPICreateTransactionV2**](PrimeApiApi.md#primeAPICreateTransactionV2) | **POST** /v2/portfolios/{portfolio_id}/transactions | 
[**primeAPICreateVideoUpload**](PrimeApiApi.md#primeAPICreateVideoUpload) | **POST** /v1/video_uploads/create | 
[**primeAPICreateWallet**](PrimeApiApi.md#primeAPICreateWallet) | **POST** /v1/portfolios/{portfolio_id}/wallets | 
[**primeAPICreateWalletV2**](PrimeApiApi.md#primeAPICreateWalletV2) | **POST** /v2/portfolios/{portfolio_id}/wallets | 
[**primeAPICreateWeb3Action**](PrimeApiApi.md#primeAPICreateWeb3Action) | **POST** /v2/portfolios/{portfolio_id}/web3_actions | 
[**primeAPIDeleteAddressBookEntry**](PrimeApiApi.md#primeAPIDeleteAddressBookEntry) | **POST** /v1/portfolios/{portfolio_id}/addressbook/{address_entry_id} | 
[**primeAPIDeletePaymentMethod**](PrimeApiApi.md#primeAPIDeletePaymentMethod) | **POST** /v1/vehicles/{vehicle_id}/payment_methods/{payment_method_id} | 
[**primeAPIDismissNotification**](PrimeApiApi.md#primeAPIDismissNotification) | **POST** /v1/notifications/dismiss | 
[**primeAPIDownloadActivityReport**](PrimeApiApi.md#primeAPIDownloadActivityReport) | **GET** /v1/portfolios/{portfolio_id}/activity_report | 
[**primeAPIEnrollInStablecoinRewards**](PrimeApiApi.md#primeAPIEnrollInStablecoinRewards) | **POST** /v1/vehicles/{vehicle_id}/stablecoin_rewards/{currency}/enroll | 
[**primeAPIFetchInviteeAccessByEmail**](PrimeApiApi.md#primeAPIFetchInviteeAccessByEmail) | **POST** /v1/users/invitee_access | 
[**primeAPIFinishVideoUpload**](PrimeApiApi.md#primeAPIFinishVideoUpload) | **POST** /v1/video_uploads/{upload_id}/finish | 
[**primeAPIGenerateDALReport**](PrimeApiApi.md#primeAPIGenerateDALReport) | **GET** /v1/reporting_center/{vehicle_id}/generate/dal | 
[**primeAPIGenerateFinancingReport**](PrimeApiApi.md#primeAPIGenerateFinancingReport) | **GET** /v1/reporting_center/{vehicle_id}/generate/financing | 
[**primeAPIGenerateReportingCenterDocument**](PrimeApiApi.md#primeAPIGenerateReportingCenterDocument) | **GET** /v1/reporting_center/document/generate | 
[**primeAPIGenerateStatement**](PrimeApiApi.md#primeAPIGenerateStatement) | **GET** /v1/vehicles/{vehicle_id}/range_statement | 
[**primeAPIGenerateWeb3Report**](PrimeApiApi.md#primeAPIGenerateWeb3Report) | **GET** /v1/reporting_center/{portfolio_id}/generate/web3 | 
[**primeAPIGetAPIKey**](PrimeApiApi.md#primeAPIGetAPIKey) | **GET** /v1/portfolios/{portfolio_id}/api-key/{access_key} | 
[**primeAPIGetAPIKeyCount**](PrimeApiApi.md#primeAPIGetAPIKeyCount) | **GET** /v1/portfolios/{portfolio_id}/api-key-count | 
[**primeAPIGetAPIKeyCountV2**](PrimeApiApi.md#primeAPIGetAPIKeyCountV2) | **GET** /v2/groups/{group_id}/api-key-count | 
[**primeAPIGetAPIKeyV2**](PrimeApiApi.md#primeAPIGetAPIKeyV2) | **GET** /v2/groups/{group_id}/api-key/{access_key} | 
[**primeAPIGetAPIKeys**](PrimeApiApi.md#primeAPIGetAPIKeys) | **GET** /v1/portfolios/{portfolio_id}/api-key | 
[**primeAPIGetAPIKeysV2**](PrimeApiApi.md#primeAPIGetAPIKeysV2) | **GET** /v2/groups/{group_id}/api-key | 
[**primeAPIGetAUCFeeTiers**](PrimeApiApi.md#primeAPIGetAUCFeeTiers) | **GET** /v1/portfolios/{portfolio_id}/auc_tiers | 
[**primeAPIGetActivityFilters**](PrimeApiApi.md#primeAPIGetActivityFilters) | **GET** /v1/portfolios/{portfolio_id}/activity_filters | 
[**primeAPIGetAddressBook**](PrimeApiApi.md#primeAPIGetAddressBook) | **GET** /v1/portfolios/{portfolio_id}/addressbook | 
[**primeAPIGetAllLocateByPortfolio**](PrimeApiApi.md#primeAPIGetAllLocateByPortfolio) | **GET** /v1/vehicles/{entity_id}/portfolios/{portfolio_id}/pm/locates | 
[**primeAPIGetAllocationByOrder**](PrimeApiApi.md#primeAPIGetAllocationByOrder) | **GET** /v1/portfolios/{portfolio_id}/allocation/order/{order_id} | 
[**primeAPIGetAllocationLeg**](PrimeApiApi.md#primeAPIGetAllocationLeg) | **GET** /v1/portfolios/{portfolio_id}/allocation/{allocation_leg_id} | 
[**primeAPIGetAllocations**](PrimeApiApi.md#primeAPIGetAllocations) | **GET** /v1/portfolios/{portfolio_id}/allocations | 
[**primeAPIGetBalances**](PrimeApiApi.md#primeAPIGetBalances) | **GET** /v1/balances | 
[**primeAPIGetBillingEmailList**](PrimeApiApi.md#primeAPIGetBillingEmailList) | **GET** /v1/vehicles/{vehicle_id}/email_list | 
[**primeAPIGetBillingPreference**](PrimeApiApi.md#primeAPIGetBillingPreference) | **GET** /v1/vehicles/{vehicle_id}/billing_preference | 
[**primeAPIGetCandles**](PrimeApiApi.md#primeAPIGetCandles) | **GET** /v1/products/{product_id}/candles | 
[**primeAPIGetCandlesStream**](PrimeApiApi.md#primeAPIGetCandlesStream) | **GET** /v1/stream/products/{product_id}/candles | 
[**primeAPIGetConfig**](PrimeApiApi.md#primeAPIGetConfig) | **GET** /v1/configs/{name} | 
[**primeAPIGetConversionSummaries**](PrimeApiApi.md#primeAPIGetConversionSummaries) | **GET** /v1/vehicles/{vehicle_id}/margin_reports | 
[**primeAPIGetConversionSummariesV2**](PrimeApiApi.md#primeAPIGetConversionSummariesV2) | **GET** /v2/vehicles/{vehicle_id}/conversion_summaries | 
[**primeAPIGetCounterparty**](PrimeApiApi.md#primeAPIGetCounterparty) | **GET** /v1/portfolios/{portfolio_id}/counterparties | 
[**primeAPIGetCurrenciesInfo**](PrimeApiApi.md#primeAPIGetCurrenciesInfo) | **GET** /v1/currencies | 
[**primeAPIGetCurrentLocates**](PrimeApiApi.md#primeAPIGetCurrentLocates) | **GET** /v1/vehicles/{entity_id}/pm/locates | 
[**primeAPIGetDalCollateralSnapshots**](PrimeApiApi.md#primeAPIGetDalCollateralSnapshots) | **GET** /v1/vehicles/{entity_id}/dal_collateral_snapshots | 
[**primeAPIGetDepositInstructions**](PrimeApiApi.md#primeAPIGetDepositInstructions) | **GET** /v1/portfolios/{portfolio_id}/wallets/{wallet_id}/deposit_instructions | 
[**primeAPIGetDepthStream**](PrimeApiApi.md#primeAPIGetDepthStream) | **GET** /v1/stream/products/{product_id}/depth | 
[**primeAPIGetDeviceGroup**](PrimeApiApi.md#primeAPIGetDeviceGroup) | **GET** /v1/portfolios/{portfolio_id}/device_group | 
[**primeAPIGetDocument**](PrimeApiApi.md#primeAPIGetDocument) | **GET** /v1/vehicles/{vehicle_id}/documents/{document_key} | 
[**primeAPIGetDocumentDownloadLinks**](PrimeApiApi.md#primeAPIGetDocumentDownloadLinks) | **GET** /v1/reporting_center/document/{document_id}/download | 
[**primeAPIGetDocumentSignatureStatus**](PrimeApiApi.md#primeAPIGetDocumentSignatureStatus) | **GET** /v1/vehicles/{vehicle_id}/documents/{document_key}/status | 
[**primeAPIGetEntitySettings**](PrimeApiApi.md#primeAPIGetEntitySettings) | **GET** /v1/entities/{entity_id}/settings | 
[**primeAPIGetEvaluationResult**](PrimeApiApi.md#primeAPIGetEvaluationResult) | **GET** /v1/portfolios/{portfolio_id}/policies/evaluation | 
[**primeAPIGetExchangeRate**](PrimeApiApi.md#primeAPIGetExchangeRate) | **GET** /v1/portfolios/{portfolio_id}/source_currency/{source_currency_symbol}/destination_currency/{destination_currency_symbol}/exchange_rate | 
[**primeAPIGetFidoRegistration**](PrimeApiApi.md#primeAPIGetFidoRegistration) | **GET** /v1/users/{user_id}/fido/register | 
[**primeAPIGetFinancingProductPermisions**](PrimeApiApi.md#primeAPIGetFinancingProductPermisions) | **GET** /v1/vehicles/{vehicle_id}/financing_product_permissions | 
[**primeAPIGetGovernanceStatus**](PrimeApiApi.md#primeAPIGetGovernanceStatus) | **GET** /v1/portfolios/{portfolio_id}/wallets/{wallet_id}/governance/status | 
[**primeAPIGetGovernanceTopic**](PrimeApiApi.md#primeAPIGetGovernanceTopic) | **GET** /v1/vehicles/{vehicle_id}/{currency_symbol}/topics/{topic_id} | 
[**primeAPIGetGovernanceTopics**](PrimeApiApi.md#primeAPIGetGovernanceTopics) | **GET** /v1/vehicles/{vehicle_id}/{currency_symbol}/topics | 
[**primeAPIGetGovernanceVotes**](PrimeApiApi.md#primeAPIGetGovernanceVotes) | **GET** /v1/portfolios/{portfolio_id}/wallets/{wallet_id}/governance/votes | 
[**primeAPIGetGovernanceVotingWeights**](PrimeApiApi.md#primeAPIGetGovernanceVotingWeights) | **GET** /v1/wallets/{wallet_id}/voting_weights | 
[**primeAPIGetIVPortfolioBalances**](PrimeApiApi.md#primeAPIGetIVPortfolioBalances) | **GET** /v1/vehicles/{vehicle_id}/portfolios/balances | 
[**primeAPIGetIVRestrictions**](PrimeApiApi.md#primeAPIGetIVRestrictions) | **GET** /v1/vehicles/{vehicle_id}/restrictions | 
[**primeAPIGetIntrospect**](PrimeApiApi.md#primeAPIGetIntrospect) | **GET** /v1/sessions/introspect | 
[**primeAPIGetInvestmentVehicle**](PrimeApiApi.md#primeAPIGetInvestmentVehicle) | **GET** /v1/portfolios/{portfolio_id}/investmentVehicle | 
[**primeAPIGetInvestmentVehiclePortfolios**](PrimeApiApi.md#primeAPIGetInvestmentVehiclePortfolios) | **GET** /v1/users/{user_id}/investment_vehicle_portfolios | 
[**primeAPIGetInvoiceDownloadLink**](PrimeApiApi.md#primeAPIGetInvoiceDownloadLink) | **GET** /v1/vehicles/{vehicle_id}/invoices/{uuid}/download | 
[**primeAPIGetInvoices**](PrimeApiApi.md#primeAPIGetInvoices) | **GET** /v1/vehicles/{vehicle_id}/invoices | 
[**primeAPIGetInvoicesRemainingBalance**](PrimeApiApi.md#primeAPIGetInvoicesRemainingBalance) | **GET** /v1/vehicles/{vehicle_id}/invoices_balance | 
[**primeAPIGetIvDomicileCategory**](PrimeApiApi.md#primeAPIGetIvDomicileCategory) | **POST** /v1/vehicles/{vehicle_id}/domicile_category | 
[**primeAPIGetLadderStream**](PrimeApiApi.md#primeAPIGetLadderStream) | **GET** /v1/stream/products/{product_id}/ladder | 
[**primeAPIGetLatestTestTransaction**](PrimeApiApi.md#primeAPIGetLatestTestTransaction) | **POST** /v1/portfolios/{portfolio_id}/test_transaction/status | 
[**primeAPIGetLlCRollout**](PrimeApiApi.md#primeAPIGetLlCRollout) | **GET** /v1/get_llc_rollout | 
[**primeAPIGetLocateAssets**](PrimeApiApi.md#primeAPIGetLocateAssets) | **GET** /v1/vehicles/{entity_id}/pm/locates/assets | 
[**primeAPIGetMarketTradesStream**](PrimeApiApi.md#primeAPIGetMarketTradesStream) | **GET** /v1/stream/products/{product_id}/trades | 
[**primeAPIGetNotificationPreferencesForChannel**](PrimeApiApi.md#primeAPIGetNotificationPreferencesForChannel) | **GET** /v1/notification_preferences/{user_id} | 
[**primeAPIGetNotifications**](PrimeApiApi.md#primeAPIGetNotifications) | **GET** /v1/notifications | 
[**primeAPIGetOrder**](PrimeApiApi.md#primeAPIGetOrder) | **GET** /v1/orders/{order_id} | 
[**primeAPIGetOrderSimulationStream**](PrimeApiApi.md#primeAPIGetOrderSimulationStream) | **GET** /v1/stream/products/{product_id}/order_simulation | 
[**primeAPIGetOrdersStream**](PrimeApiApi.md#primeAPIGetOrdersStream) | **GET** /v1/stream/orders | 
[**primeAPIGetOrganization**](PrimeApiApi.md#primeAPIGetOrganization) | **GET** /v1/vehicles/{vehicle_id}/organization | 
[**primeAPIGetPendingConsensus**](PrimeApiApi.md#primeAPIGetPendingConsensus) | **GET** /v1/users/{user_id}/entities/{entity_id}/pending_consensus | 
[**primeAPIGetPortfolio**](PrimeApiApi.md#primeAPIGetPortfolio) | **GET** /v1/portfolios/{portfolio_id}/portfolio | 
[**primeAPIGetPortfolioActivities**](PrimeApiApi.md#primeAPIGetPortfolioActivities) | **GET** /v1/portfolios/{portfolio_id}/activities | 
[**primeAPIGetPortfolioActivitiesStream**](PrimeApiApi.md#primeAPIGetPortfolioActivitiesStream) | **GET** /v1/stream/portfolios/{portfolio_id}/activities | 
[**primeAPIGetPortfolioActivity**](PrimeApiApi.md#primeAPIGetPortfolioActivity) | **GET** /v1/portfolios/{portfolio_id}/activities/{activity_id} | 
[**primeAPIGetPortfolioActivityStream**](PrimeApiApi.md#primeAPIGetPortfolioActivityStream) | **GET** /v1/stream/portfolios/{portfolio_id}/activities/{activity_id} | 
[**primeAPIGetPortfolioBalances**](PrimeApiApi.md#primeAPIGetPortfolioBalances) | **GET** /v1/portfolios/{portfolio_id}/balances | 
[**primeAPIGetPortfolioBalancesStream**](PrimeApiApi.md#primeAPIGetPortfolioBalancesStream) | **GET** /v1/stream/portfolios/{portfolio_id}/balances | 
[**primeAPIGetPortfolioCommission**](PrimeApiApi.md#primeAPIGetPortfolioCommission) | **GET** /v1/portfolios/{portfolio_id}/commission | 
[**primeAPIGetPortfolioConciseUsers**](PrimeApiApi.md#primeAPIGetPortfolioConciseUsers) | **GET** /v1/portfolios/{portfolio_id}/users/concise | 
[**primeAPIGetPortfolioFeeInfo**](PrimeApiApi.md#primeAPIGetPortfolioFeeInfo) | **GET** /v1/portfolios/{portfolio_id}/fees | 
[**primeAPIGetPortfolioFinancingProductPermissions**](PrimeApiApi.md#primeAPIGetPortfolioFinancingProductPermissions) | **GET** /v1/portfolio/{portfolio_id}/financing_product_permissions | 
[**primeAPIGetPortfolioFinancingProductStream**](PrimeApiApi.md#primeAPIGetPortfolioFinancingProductStream) | **GET** /v1/stream/portfolios/{portfolio_id}/products/{product_id}/financing | 
[**primeAPIGetPortfolioFinancingStream**](PrimeApiApi.md#primeAPIGetPortfolioFinancingStream) | **GET** /v1/stream/portfolios/{portfolio_id}/financing | 
[**primeAPIGetPortfolioInvitations**](PrimeApiApi.md#primeAPIGetPortfolioInvitations) | **GET** /v1/portfolios/{portfolio_id}/invitations | 
[**primeAPIGetPortfolioSettings**](PrimeApiApi.md#primeAPIGetPortfolioSettings) | **GET** /v1/portfolios/{portfolio_id}/settings | 
[**primeAPIGetPortfolioUsers**](PrimeApiApi.md#primeAPIGetPortfolioUsers) | **GET** /v1/portfolios/{portfolio_id}/users | 
[**primeAPIGetPortfolioWalletsBalances**](PrimeApiApi.md#primeAPIGetPortfolioWalletsBalances) | **GET** /v1/portfolios/{portfolio_id}/wallets/balances/{currency_symbol} | 
[**primeAPIGetPortfolioWalletsBalancesStream**](PrimeApiApi.md#primeAPIGetPortfolioWalletsBalancesStream) | **GET** /v1/stream/portfolios/{portfolio_id}/wallets/balances/{currency_symbol} | 
[**primeAPIGetPortfoliosFinancingProductPermissions**](PrimeApiApi.md#primeAPIGetPortfoliosFinancingProductPermissions) | **GET** /v1/vehicles/{vehicle_id}/portfolio/financing_product_permissions | 
[**primeAPIGetPostTradeCredit**](PrimeApiApi.md#primeAPIGetPostTradeCredit) | **GET** /v1/portfolios/{portfolio_id}/credit | 
[**primeAPIGetPreference**](PrimeApiApi.md#primeAPIGetPreference) | **GET** /v1/vehicles/{vehicle_id}/preferences | 
[**primeAPIGetPrimeActivities**](PrimeApiApi.md#primeAPIGetPrimeActivities) | **GET** /v1/portfolios/{portfolio_id}/prime_activities | 
[**primeAPIGetPrimeActivitiesStream**](PrimeApiApi.md#primeAPIGetPrimeActivitiesStream) | **GET** /v1/stream/portfolios/{portfolio_id}/prime_activities | 
[**primeAPIGetPrimeActivityConsensusAudit**](PrimeApiApi.md#primeAPIGetPrimeActivityConsensusAudit) | **GET** /v1/portfolios/{portfolio_id}/activities/{activity_id}/consensus_audit | 
[**primeAPIGetPrimeActivityDetails**](PrimeApiApi.md#primeAPIGetPrimeActivityDetails) | **GET** /v1/portfolios/{portfolio_id}/activities/{activity_id}/activity_details | 
[**primeAPIGetPrimeActivityDetailsStream**](PrimeApiApi.md#primeAPIGetPrimeActivityDetailsStream) | **GET** /v1/stream/portfolios/{portfolio_id}/activities/{activity_id}/activity_details | 
[**primeAPIGetPrimeActivityDetailsStreamV2**](PrimeApiApi.md#primeAPIGetPrimeActivityDetailsStreamV2) | **GET** /v2/stream/portfolios/{portfolio_id}/activities/{activity_id}/activity_details | 
[**primeAPIGetPrimeActivityDetailsV2**](PrimeApiApi.md#primeAPIGetPrimeActivityDetailsV2) | **GET** /v2/portfolios/{portfolio_id}/activities/{activity_id}/activity_details | 
[**primeAPIGetPrimeActivityFilters**](PrimeApiApi.md#primeAPIGetPrimeActivityFilters) | **GET** /v1/portfolios/{portfolio_id}/prime_activity_filters | 
[**primeAPIGetPrimeInvoices**](PrimeApiApi.md#primeAPIGetPrimeInvoices) | **GET** /v1/vehicles/{vehicle_id}/invoices/prime | 
[**primeAPIGetProductStats**](PrimeApiApi.md#primeAPIGetProductStats) | **GET** /v1/products/{product_id}/stats | 
[**primeAPIGetProductStatsStream**](PrimeApiApi.md#primeAPIGetProductStatsStream) | **GET** /v1/stream/products/{product_id}/stats | 
[**primeAPIGetProducts**](PrimeApiApi.md#primeAPIGetProducts) | **GET** /v1/products | 
[**primeAPIGetProductsStream**](PrimeApiApi.md#primeAPIGetProductsStream) | **GET** /v1/stream/products | 
[**primeAPIGetRateCard**](PrimeApiApi.md#primeAPIGetRateCard) | **GET** /v1/{currency}/rate_cards | 
[**primeAPIGetReportingCenterDownloadLink**](PrimeApiApi.md#primeAPIGetReportingCenterDownloadLink) | **GET** /v1/reporting_center/{portfolio_id}/download | 
[**primeAPIGetReportingCenterFilters**](PrimeApiApi.md#primeAPIGetReportingCenterFilters) | **GET** /v1/reporting_center/{vehicle_id}/filters | 
[**primeAPIGetReportingDocumentByOrderId**](PrimeApiApi.md#primeAPIGetReportingDocumentByOrderId) | **GET** /v1/portfolios/{portfolio_id}/orders/{order_id}/documents | 
[**primeAPIGetReverseAllocation**](PrimeApiApi.md#primeAPIGetReverseAllocation) | **GET** /v1/portfolios/{portfolio_id}/allocation/{allocation_id}/reverse | 
[**primeAPIGetSignedDocument**](PrimeApiApi.md#primeAPIGetSignedDocument) | **GET** /v1/vehicles/{vehicle_id}/documents/signed/{document_key} | 
[**primeAPIGetStablecoinRewardsEarnings**](PrimeApiApi.md#primeAPIGetStablecoinRewardsEarnings) | **GET** /v1/vehicles/{vehicle_id}/portfolios/{portfolio_id}/stablecoin_rewards/{currency}/earnings | 
[**primeAPIGetStablecoinRewardsEnrollment**](PrimeApiApi.md#primeAPIGetStablecoinRewardsEnrollment) | **GET** /v1/vehicles/{vehicle_id}/stablecoin_rewards/{currency}/enrollment | 
[**primeAPIGetStakeTimeEstimation**](PrimeApiApi.md#primeAPIGetStakeTimeEstimation) | **GET** /v1/portfolios/{portfolio_id}/{currency_symbol}/stake_time_estimation | 
[**primeAPIGetStakingActivityDetails**](PrimeApiApi.md#primeAPIGetStakingActivityDetails) | **GET** /v1/portfolios/{portfolio_id}/activities/{activity_id}/staking_activity_details | 
[**primeAPIGetStatement**](PrimeApiApi.md#primeAPIGetStatement) | **GET** /v1/portfolios/statements/{statement_id} | 
[**primeAPIGetStatements**](PrimeApiApi.md#primeAPIGetStatements) | **GET** /v1/portfolios/{portfolio_id}/statements | 
[**primeAPIGetSystemStatus**](PrimeApiApi.md#primeAPIGetSystemStatus) | **GET** /v1/system_status | 
[**primeAPIGetTeamMemberDetails**](PrimeApiApi.md#primeAPIGetTeamMemberDetails) | **GET** /v1/team_member/detail | 
[**primeAPIGetTeamMembers**](PrimeApiApi.md#primeAPIGetTeamMembers) | **GET** /v1/team_members | 
[**primeAPIGetTradeReportGraphData**](PrimeApiApi.md#primeAPIGetTradeReportGraphData) | **GET** /v1/orders/{order_id}/report/graph | 
[**primeAPIGetTradeReportOrderDetails**](PrimeApiApi.md#primeAPIGetTradeReportOrderDetails) | **GET** /v1/orders/{order_id}/report/order-details | 
[**primeAPIGetTradeReportOrderDetailsAndGraphData**](PrimeApiApi.md#primeAPIGetTradeReportOrderDetailsAndGraphData) | **GET** /v1/orders/{order_id}/report/graph-and-details | 
[**primeAPIGetTradeReportOrderFills**](PrimeApiApi.md#primeAPIGetTradeReportOrderFills) | **GET** /v1/orders/{order_id}/report/fills | 
[**primeAPIGetTradeReportVenueFills**](PrimeApiApi.md#primeAPIGetTradeReportVenueFills) | **GET** /v1/orders/{order_id}/report/venue-fills | 
[**primeAPIGetTransferMethods**](PrimeApiApi.md#primeAPIGetTransferMethods) | **GET** /v1/vehicles/{vehicle_id}/transfer_methods | 
[**primeAPIGetUnstakeTimeEstimation**](PrimeApiApi.md#primeAPIGetUnstakeTimeEstimation) | **GET** /v1/portfolios/{portfolio_id}/{currency_symbol}/unstake_time_estimation | 
[**primeAPIGetUserEntityLevelPermission**](PrimeApiApi.md#primeAPIGetUserEntityLevelPermission) | **GET** /v1/user/{entity_id}/permission | 
[**primeAPIGetUserHierarchy**](PrimeApiApi.md#primeAPIGetUserHierarchy) | **GET** /v1/users/{user_id}/hierarchy | 
[**primeAPIGetUserInAppNotifications**](PrimeApiApi.md#primeAPIGetUserInAppNotifications) | **GET** /v1/notifications/in-app | 
[**primeAPIGetUserInAppNotificationsStream**](PrimeApiApi.md#primeAPIGetUserInAppNotificationsStream) | **GET** /v1/stream/notifications/in-app | 
[**primeAPIGetUserInfo**](PrimeApiApi.md#primeAPIGetUserInfo) | **GET** /v1/users/{user_id} | 
[**primeAPIGetUserInvitations**](PrimeApiApi.md#primeAPIGetUserInvitations) | **GET** /v1/invitations | 
[**primeAPIGetUserPortfolios**](PrimeApiApi.md#primeAPIGetUserPortfolios) | **GET** /v1/users/{user_id}/portfolios | 
[**primeAPIGetUserPreferences**](PrimeApiApi.md#primeAPIGetUserPreferences) | **GET** /v1/users/{user_id}/preferences | 
[**primeAPIGetUserRoles**](PrimeApiApi.md#primeAPIGetUserRoles) | **GET** /v1/users/{user_id}/{portfolio_id}/userRoles | 
[**primeAPIGetVehicleBalances**](PrimeApiApi.md#primeAPIGetVehicleBalances) | **GET** /v1/vehicles/{vehicle_id}/balances | 
[**primeAPIGetVehicleBalancesStream**](PrimeApiApi.md#primeAPIGetVehicleBalancesStream) | **GET** /v1/stream/vehicles/{vehicle_id}/balances | 
[**primeAPIGetVehicleBillingPermission**](PrimeApiApi.md#primeAPIGetVehicleBillingPermission) | **GET** /v1/portfolios/{portfolio_id}/billing_permission | 
[**primeAPIGetVehicleCurrencies**](PrimeApiApi.md#primeAPIGetVehicleCurrencies) | **GET** /v1/vehicles/{vehicle_id}/currencies | 
[**primeAPIGetVehicleCurrenciesStream**](PrimeApiApi.md#primeAPIGetVehicleCurrenciesStream) | **GET** /v1/stream/vehicles/{vehicle_id}/currencies | 
[**primeAPIGetVehicleFinancingStream**](PrimeApiApi.md#primeAPIGetVehicleFinancingStream) | **GET** /v1/stream/vehicles/{vehicle_id}/financing | 
[**primeAPIGetVehiclePortfolioMarginStream**](PrimeApiApi.md#primeAPIGetVehiclePortfolioMarginStream) | **GET** /v1/stream/vehicles/{vehicle_id}/financing/portfolio_margin | 
[**primeAPIGetVehiclePortfolioMarginStreamV2**](PrimeApiApi.md#primeAPIGetVehiclePortfolioMarginStreamV2) | **GET** /v2/stream/vehicles/{vehicle_id}/financing/portfolio_margin | 
[**primeAPIGetVehicleSpotPrices**](PrimeApiApi.md#primeAPIGetVehicleSpotPrices) | **GET** /v1/vehicles/{vehicle_id}/spot_prices | 
[**primeAPIGetVehicleSpotPricesStream**](PrimeApiApi.md#primeAPIGetVehicleSpotPricesStream) | **GET** /v1/stream/vehicles/{vehicle_id}/spot_prices | 
[**primeAPIGetVehicleValidators**](PrimeApiApi.md#primeAPIGetVehicleValidators) | **GET** /v1/vehicles/{vehicle_id}/{currency_symbol}/validators | 
[**primeAPIGetVideoUpload**](PrimeApiApi.md#primeAPIGetVideoUpload) | **GET** /v1/video_uploads/{upload_id} | 
[**primeAPIGetVideoUploadPermissions**](PrimeApiApi.md#primeAPIGetVideoUploadPermissions) | **GET** /v1/transactions/{transaction_id}/video_upload_permissions | 
[**primeAPIGetWallet**](PrimeApiApi.md#primeAPIGetWallet) | **GET** /v1/portfolios/{portfolio_id}/wallets/{wallet_id} | 
[**primeAPIGetWalletAssetSettings**](PrimeApiApi.md#primeAPIGetWalletAssetSettings) | **GET** /v1/portfolios/{portfolio_id}/wallets/{wallet_id}/asset_settings | 
[**primeAPIGetWalletBalances**](PrimeApiApi.md#primeAPIGetWalletBalances) | **GET** /v1/portfolios/{portfolio_id}/wallets/{wallet_id}/balances | 
[**primeAPIGetWalletBalancesStream**](PrimeApiApi.md#primeAPIGetWalletBalancesStream) | **GET** /v1/stream/portfolios/{portfolio_id}/wallets/{wallet_id}/balances | 
[**primeAPIGetWalletDefiBalances**](PrimeApiApi.md#primeAPIGetWalletDefiBalances) | **GET** /v1/portfolios/{portfolio_id}/wallets/{wallet_id}/defi/balances | 
[**primeAPIGetWalletRewardsStatus**](PrimeApiApi.md#primeAPIGetWalletRewardsStatus) | **GET** /v1/portfolios/{portfolio_id}/wallets/{wallet_id}/rewards | 
[**primeAPIGetWalletStakingStatus**](PrimeApiApi.md#primeAPIGetWalletStakingStatus) | **GET** /v1/portfolios/{portfolio_id}/wallets/{wallet_id}/staking | 
[**primeAPIGetWalletTokens**](PrimeApiApi.md#primeAPIGetWalletTokens) | **GET** /v1/portfolios/{portfolio_id}/wallet_tokens/{wallet_id} | 
[**primeAPIGetWalletVestingStatus**](PrimeApiApi.md#primeAPIGetWalletVestingStatus) | **GET** /v1/portfolios/{portfolio_id}/wallets/{wallet_id}/vesting | 
[**primeAPIGetWallets**](PrimeApiApi.md#primeAPIGetWallets) | **GET** /v1/portfolios/{portfolio_id}/wallets | 
[**primeAPIInitiateTransactionSigning**](PrimeApiApi.md#primeAPIInitiateTransactionSigning) | **POST** /v2/portfolios/{portfolio_id}/transactions/initiate_signing | 
[**primeAPIListActiveValidators**](PrimeApiApi.md#primeAPIListActiveValidators) | **GET** /v1/portfolios/{portfolio_id}/wallets/{wallet_id}/validators | 
[**primeAPIListBulkPoliciesForEntity**](PrimeApiApi.md#primeAPIListBulkPoliciesForEntity) | **GET** /v1/entities/{entity_id}/policies | 
[**primeAPIListDeviceGroups**](PrimeApiApi.md#primeAPIListDeviceGroups) | **GET** /v1/device_groups | 
[**primeAPIListInvitationsForUser**](PrimeApiApi.md#primeAPIListInvitationsForUser) | **GET** /v1/entities/{entity_id}/users/invitations | 
[**primeAPIListPaymentMethods**](PrimeApiApi.md#primeAPIListPaymentMethods) | **GET** /v1/vehicles/{vehicle_id}/payment_methods | 
[**primeAPIListPolicies**](PrimeApiApi.md#primeAPIListPolicies) | **GET** /v1/portfolios/{portfolio_id}/policies | 
[**primeAPIListReportingCenterData**](PrimeApiApi.md#primeAPIListReportingCenterData) | **GET** /v1/reporting_center/{vehicle_id} | 
[**primeAPIListSignerIdsForActivity**](PrimeApiApi.md#primeAPIListSignerIdsForActivity) | **GET** /v1/portfolios/{portfolio_id}/activities/{activity_id}/signers | 
[**primeAPIListTradingWalletCryptoDepositAddresses**](PrimeApiApi.md#primeAPIListTradingWalletCryptoDepositAddresses) | **GET** /v1/portfolios/{portfolio_id}/wallets/{wallet_id}/crypto_deposit_addresses | 
[**primeAPIListVideoUploads**](PrimeApiApi.md#primeAPIListVideoUploads) | **GET** /v1/video_uploads | 
[**primeAPIListWalletsV2**](PrimeApiApi.md#primeAPIListWalletsV2) | **GET** /v2/portfolios/{portfolio_id}/wallets | 
[**primeAPIListWeb3SecurityKeys**](PrimeApiApi.md#primeAPIListWeb3SecurityKeys) | **GET** /v2/portfolios/{portfolio_id}/web3_security_keys | 
[**primeAPIPostAcceptInvitation**](PrimeApiApi.md#primeAPIPostAcceptInvitation) | **POST** /v1/invitations/{invitation_id} | 
[**primeAPIPostActivateAPIKey**](PrimeApiApi.md#primeAPIPostActivateAPIKey) | **POST** /v1/portfolios/{portfolio_id}/api-key/activate | 
[**primeAPIPostActivateAPIKeyV2**](PrimeApiApi.md#primeAPIPostActivateAPIKeyV2) | **POST** /v2/groups/{group_id}/api-key/activate | 
[**primeAPIPostAddressBookEntry**](PrimeApiApi.md#primeAPIPostAddressBookEntry) | **POST** /v1/portfolios/{portfolio_id}/addressbook | 
[**primeAPIPostAllocation**](PrimeApiApi.md#primeAPIPostAllocation) | **POST** /v1/portfolios/{source_portfolio_id}/allocation | 
[**primeAPIPostAllocationPreview**](PrimeApiApi.md#primeAPIPostAllocationPreview) | **POST** /v1/portfolios/{source_portfolio_id}/allocation/preview | 
[**primeAPIPostApprovePortfolioActivity**](PrimeApiApi.md#primeAPIPostApprovePortfolioActivity) | **POST** /v1/portfolios/{portfolio_id}/activities/{activity_id}/approve | 
[**primeAPIPostApproveVehicleActivity**](PrimeApiApi.md#primeAPIPostApproveVehicleActivity) | **POST** /v1/vehicles/{vehicle_id}/activities/{activity_id}/approve | 
[**primeAPIPostBulkActionActivities**](PrimeApiApi.md#primeAPIPostBulkActionActivities) | **POST** /v1/activities/action/bulk | 
[**primeAPIPostBulkActionSetting**](PrimeApiApi.md#primeAPIPostBulkActionSetting) | **POST** /v1/settings/bulk_action | 
[**primeAPIPostBulkInvitation**](PrimeApiApi.md#primeAPIPostBulkInvitation) | **POST** /v1/users/invite | 
[**primeAPIPostCancelOrder**](PrimeApiApi.md#primeAPIPostCancelOrder) | **POST** /v1/orders/batch_cancel | 
[**primeAPIPostCreateAPIKey**](PrimeApiApi.md#primeAPIPostCreateAPIKey) | **POST** /v1/portfolios/{portfolio_id}/api-key/create | 
[**primeAPIPostCreateAPIKeyV2**](PrimeApiApi.md#primeAPIPostCreateAPIKeyV2) | **POST** /v2/groups/{group_id}/api-key/create | 
[**primeAPIPostDeactivateAPIKey**](PrimeApiApi.md#primeAPIPostDeactivateAPIKey) | **POST** /v1/portfolios/{portfolio_id}/api-key/deactivate | 
[**primeAPIPostDeactivateAPIKeyV2**](PrimeApiApi.md#primeAPIPostDeactivateAPIKeyV2) | **POST** /v2/groups/{group_id}/api-key/deactivate | 
[**primeAPIPostDelegationAccount**](PrimeApiApi.md#primeAPIPostDelegationAccount) | **POST** /v1/portfolios/{portfolio_id}/wallets/{wallet_id}/governance/delegation | 
[**primeAPIPostDocumentSignature**](PrimeApiApi.md#primeAPIPostDocumentSignature) | **POST** /v1/vehicles/{vehicle_id}/documents/{document_key} | 
[**primeAPIPostEntitySettings**](PrimeApiApi.md#primeAPIPostEntitySettings) | **POST** /v1/entities/{entity_id}/settings/{key} | 
[**primeAPIPostFidoChallenge**](PrimeApiApi.md#primeAPIPostFidoChallenge) | **POST** /v1/users/{user_id}/fido/challenge | 
[**primeAPIPostFidoChallengeCreate**](PrimeApiApi.md#primeAPIPostFidoChallengeCreate) | **POST** /v1/users/{user_id}/fido/challenge/create | 
[**primeAPIPostFidoRegistration**](PrimeApiApi.md#primeAPIPostFidoRegistration) | **POST** /v1/users/{user_id}/fido/register | 
[**primeAPIPostGovernanceStatus**](PrimeApiApi.md#primeAPIPostGovernanceStatus) | **POST** /v1/portfolios/{portfolio_id}/wallets/{wallet_id}/governance/status | 
[**primeAPIPostGovernanceVote**](PrimeApiApi.md#primeAPIPostGovernanceVote) | **POST** /v1/portfolios/{portfolio_id}/wallets/{wallet_id}/governance/votes | 
[**primeAPIPostInvitation**](PrimeApiApi.md#primeAPIPostInvitation) | **POST** /v1/portfolios/{portfolio_id}/invitations | 
[**primeAPIPostNetAllocationPreview**](PrimeApiApi.md#primeAPIPostNetAllocationPreview) | **POST** /v1/portfolios/{source_portfolio_id}/allocation/net_preview | 
[**primeAPIPostOrder**](PrimeApiApi.md#primeAPIPostOrder) | **POST** /v1/orders | 
[**primeAPIPostOrderPreview**](PrimeApiApi.md#primeAPIPostOrderPreview) | **POST** /v1/order/preview | 
[**primeAPIPostPortfolioSettings**](PrimeApiApi.md#primeAPIPostPortfolioSettings) | **POST** /v1/portfolios/{portfolio_id}/settings/{key} | 
[**primeAPIPostPreviewUserChange**](PrimeApiApi.md#primeAPIPostPreviewUserChange) | **POST** /v1/portfolios/{portfolio_id}/users/{user_id}/preview_user_change | 
[**primeAPIPostPushNotificationDeviceDeregistration**](PrimeApiApi.md#primeAPIPostPushNotificationDeviceDeregistration) | **POST** /v1/notifications/push/device_deregistration | 
[**primeAPIPostPushNotificationDeviceRegistration**](PrimeApiApi.md#primeAPIPostPushNotificationDeviceRegistration) | **POST** /v1/notifications/push/device_registration | 
[**primeAPIPostRejectPortfolioActivity**](PrimeApiApi.md#primeAPIPostRejectPortfolioActivity) | **POST** /v1/portfolios/{portfolio_id}/activities/{activity_id}/reject | 
[**primeAPIPostRejectVehicleActivity**](PrimeApiApi.md#primeAPIPostRejectVehicleActivity) | **POST** /v1/vehicles/{vehicle_id}/activities/{activity_id}/reject | 
[**primeAPIPostReverseAllocation**](PrimeApiApi.md#primeAPIPostReverseAllocation) | **POST** /v1/portfolios/{portfolio_id}/allocation/reverse | 
[**primeAPIPostUpdateBillingAddress**](PrimeApiApi.md#primeAPIPostUpdateBillingAddress) | **POST** /v1/vehicles/{vehicle_id}/billing_address | 
[**primeAPIPostUpdateBillingEmailList**](PrimeApiApi.md#primeAPIPostUpdateBillingEmailList) | **POST** /v1/vehicles/{vehicle_id}/email_list | 
[**primeAPIPostUpdateBillingPreference**](PrimeApiApi.md#primeAPIPostUpdateBillingPreference) | **POST** /v1/vehicles/{vehicle_id}/billing_preference | 
[**primeAPIPostUserInAppNotificationStatuses**](PrimeApiApi.md#primeAPIPostUserInAppNotificationStatuses) | **POST** /v1/notifications/in-app/status | 
[**primeAPIPostUserPreferences**](PrimeApiApi.md#primeAPIPostUserPreferences) | **POST** /v1/users/{user_id}/preferences | 
[**primeAPIPostUserUpdate**](PrimeApiApi.md#primeAPIPostUserUpdate) | **POST** /v1/portfolios/{portfolio_id}/users/{user_id} | 
[**primeAPIPostValidateAddress**](PrimeApiApi.md#primeAPIPostValidateAddress) | **POST** /v1/address/validate | 
[**primeAPIPostValidateCounterparty**](PrimeApiApi.md#primeAPIPostValidateCounterparty) | **POST** /v1/counterparties/{counterparty_id}/validate | 
[**primeAPIPreviewTransaction**](PrimeApiApi.md#primeAPIPreviewTransaction) | **POST** /v1/portfolios/{portfolio_id}/transactions/preview | 
[**primeAPISignalWeb3Action**](PrimeApiApi.md#primeAPISignalWeb3Action) | **POST** /v2/portfolios/{portfolio_id}/web3_actions/signal | 
[**primeAPISubmitDALRecall**](PrimeApiApi.md#primeAPISubmitDALRecall) | **POST** /v1/vehicles/{entity_id}/submit_recall | 
[**primeAPISubmitLocates**](PrimeApiApi.md#primeAPISubmitLocates) | **POST** /v1/vehicles/{entity_id}/pm/locates | 
[**primeAPISubmitMultipleLocates**](PrimeApiApi.md#primeAPISubmitMultipleLocates) | **POST** /v1/vehicles/{entity_id}/pm/multiple_locates | 
[**primeAPIUpdateNotificationPreferencesForChannel**](PrimeApiApi.md#primeAPIUpdateNotificationPreferencesForChannel) | **POST** /v1/notification_preferences/{user_id}/update | 
[**primeAPIUpdateWalletAssetSettings**](PrimeApiApi.md#primeAPIUpdateWalletAssetSettings) | **POST** /v1/portfolios/{portfolio_id}/wallets/{wallet_id}/asset_settings | 
[**primeAPIUpdateWalletName**](PrimeApiApi.md#primeAPIUpdateWalletName) | **POST** /v1/portfolios/{portfolio_id}/wallets/{wallet_id} | 
[**primeAPIUpdateWeb3Device**](PrimeApiApi.md#primeAPIUpdateWeb3Device) | **POST** /v1/web3_device | 
[**primeAPIUpsertPolicyChange**](PrimeApiApi.md#primeAPIUpsertPolicyChange) | **POST** /v1/portfolios/{portfolio_id}/policies | 
[**primeAPIValidateWeb3Authorization**](PrimeApiApi.md#primeAPIValidateWeb3Authorization) | **POST** /v1/portfolios/{portfolio_id}/web3/validate | 
[**primeAPIValidateWeb3SecurityKey**](PrimeApiApi.md#primeAPIValidateWeb3SecurityKey) | **POST** /v2/portfolios/{portfolio_id}/web3_actions/validate_security_key | 


<a name="primeAPIBulkUserRolesUpdate"></a>
# **primeAPIBulkUserRolesUpdate**
> CoinbaseEngPrimeApiApiBulkUserRolesUpdateResponse primeAPIBulkUserRolesUpdate(userId, body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


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
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**|  |
 **body** | [**CoinbaseEngPrimeApiApiBulkUserRolesUpdateRequest**](CoinbaseEngPrimeApiApiBulkUserRolesUpdateRequest.md)|  |

### Return type

[**CoinbaseEngPrimeApiApiBulkUserRolesUpdateResponse**](CoinbaseEngPrimeApiApiBulkUserRolesUpdateResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPICancelTransaction"></a>
# **primeAPICancelTransaction**
> CoinbaseEngPrimeApiApiCancelTransactionResponse primeAPICancelTransaction(portfolioId, body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String portfolioId = "portfolioId_example"; // String | Portfolio id of the transaction
CoinbaseEngPrimeApiApiCancelTransactionRequest body = new CoinbaseEngPrimeApiApiCancelTransactionRequest(); // CoinbaseEngPrimeApiApiCancelTransactionRequest | 
try {
    CoinbaseEngPrimeApiApiCancelTransactionResponse result = apiInstance.primeAPICancelTransaction(portfolioId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPICancelTransaction");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**| Portfolio id of the transaction |
 **body** | [**CoinbaseEngPrimeApiApiCancelTransactionRequest**](CoinbaseEngPrimeApiApiCancelTransactionRequest.md)|  |

### Return type

[**CoinbaseEngPrimeApiApiCancelTransactionResponse**](CoinbaseEngPrimeApiApiCancelTransactionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPICreateOrUpdatePreference"></a>
# **primeAPICreateOrUpdatePreference**
> CoinbaseEngPrimeApiApiCreateOrUpdatePreferenceResponse primeAPICreateOrUpdatePreference(vehicleId, body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String vehicleId = "vehicleId_example"; // String | 
CoinbaseEngPrimeApiApiCreateOrUpdatePreferenceRequest body = new CoinbaseEngPrimeApiApiCreateOrUpdatePreferenceRequest(); // CoinbaseEngPrimeApiApiCreateOrUpdatePreferenceRequest | 
try {
    CoinbaseEngPrimeApiApiCreateOrUpdatePreferenceResponse result = apiInstance.primeAPICreateOrUpdatePreference(vehicleId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPICreateOrUpdatePreference");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vehicleId** | **String**|  |
 **body** | [**CoinbaseEngPrimeApiApiCreateOrUpdatePreferenceRequest**](CoinbaseEngPrimeApiApiCreateOrUpdatePreferenceRequest.md)|  |

### Return type

[**CoinbaseEngPrimeApiApiCreateOrUpdatePreferenceResponse**](CoinbaseEngPrimeApiApiCreateOrUpdatePreferenceResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPICreateOrderFillsDocument"></a>
# **primeAPICreateOrderFillsDocument**
> CoinbaseEngPrimeApiApiCreateOrderFillsDocumentResponse primeAPICreateOrderFillsDocument(portfolioId, orderId, body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String portfolioId = "portfolioId_example"; // String | 
String orderId = "orderId_example"; // String | 
CoinbaseEngPrimeApiApiCreateOrderFillsDocumentRequest body = new CoinbaseEngPrimeApiApiCreateOrderFillsDocumentRequest(); // CoinbaseEngPrimeApiApiCreateOrderFillsDocumentRequest | 
try {
    CoinbaseEngPrimeApiApiCreateOrderFillsDocumentResponse result = apiInstance.primeAPICreateOrderFillsDocument(portfolioId, orderId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPICreateOrderFillsDocument");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**|  |
 **orderId** | **String**|  |
 **body** | [**CoinbaseEngPrimeApiApiCreateOrderFillsDocumentRequest**](CoinbaseEngPrimeApiApiCreateOrderFillsDocumentRequest.md)|  |

### Return type

[**CoinbaseEngPrimeApiApiCreateOrderFillsDocumentResponse**](CoinbaseEngPrimeApiApiCreateOrderFillsDocumentResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPICreateTestTransaction"></a>
# **primeAPICreateTestTransaction**
> CoinbaseEngPrimeApiApiCreateTestTransactionResponse primeAPICreateTestTransaction(portfolioId, body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String portfolioId = "portfolioId_example"; // String | 
CoinbaseEngPrimeApiApiCreateTestTransactionRequest body = new CoinbaseEngPrimeApiApiCreateTestTransactionRequest(); // CoinbaseEngPrimeApiApiCreateTestTransactionRequest | 
try {
    CoinbaseEngPrimeApiApiCreateTestTransactionResponse result = apiInstance.primeAPICreateTestTransaction(portfolioId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPICreateTestTransaction");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**|  |
 **body** | [**CoinbaseEngPrimeApiApiCreateTestTransactionRequest**](CoinbaseEngPrimeApiApiCreateTestTransactionRequest.md)|  |

### Return type

[**CoinbaseEngPrimeApiApiCreateTestTransactionResponse**](CoinbaseEngPrimeApiApiCreateTestTransactionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPICreateTransaction"></a>
# **primeAPICreateTransaction**
> CoinbaseEngPrimeApiApiNewConsensusActivityResponse primeAPICreateTransaction(portfolioId, body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String portfolioId = "portfolioId_example"; // String | The portfolio you want to transact with
CoinbaseEngPrimeApiApiCreateTransactionRequest body = new CoinbaseEngPrimeApiApiCreateTransactionRequest(); // CoinbaseEngPrimeApiApiCreateTransactionRequest | 
try {
    CoinbaseEngPrimeApiApiNewConsensusActivityResponse result = apiInstance.primeAPICreateTransaction(portfolioId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPICreateTransaction");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**| The portfolio you want to transact with |
 **body** | [**CoinbaseEngPrimeApiApiCreateTransactionRequest**](CoinbaseEngPrimeApiApiCreateTransactionRequest.md)|  |

### Return type

[**CoinbaseEngPrimeApiApiNewConsensusActivityResponse**](CoinbaseEngPrimeApiApiNewConsensusActivityResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPICreateTransactionV2"></a>
# **primeAPICreateTransactionV2**
> CoinbaseEngPrimeApiApiNewConsensusActivityResponse primeAPICreateTransactionV2(portfolioId, body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String portfolioId = "portfolioId_example"; // String | The portfolio to perform transaction action with
CoinbaseEngPrimeApiApiCreateTransactionV2Request body = new CoinbaseEngPrimeApiApiCreateTransactionV2Request(); // CoinbaseEngPrimeApiApiCreateTransactionV2Request | 
try {
    CoinbaseEngPrimeApiApiNewConsensusActivityResponse result = apiInstance.primeAPICreateTransactionV2(portfolioId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPICreateTransactionV2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**| The portfolio to perform transaction action with |
 **body** | [**CoinbaseEngPrimeApiApiCreateTransactionV2Request**](CoinbaseEngPrimeApiApiCreateTransactionV2Request.md)|  |

### Return type

[**CoinbaseEngPrimeApiApiNewConsensusActivityResponse**](CoinbaseEngPrimeApiApiNewConsensusActivityResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPICreateVideoUpload"></a>
# **primeAPICreateVideoUpload**
> CoinbaseCustodyApiVideoUpload primeAPICreateVideoUpload(body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
CoinbaseCustodyApiCreateVideoUploadRequest body = new CoinbaseCustodyApiCreateVideoUploadRequest(); // CoinbaseCustodyApiCreateVideoUploadRequest | 
try {
    CoinbaseCustodyApiVideoUpload result = apiInstance.primeAPICreateVideoUpload(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPICreateVideoUpload");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CoinbaseCustodyApiCreateVideoUploadRequest**](CoinbaseCustodyApiCreateVideoUploadRequest.md)|  |

### Return type

[**CoinbaseCustodyApiVideoUpload**](CoinbaseCustodyApiVideoUpload.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPICreateWallet"></a>
# **primeAPICreateWallet**
> CoinbaseEngPrimeApiApiCreateWalletResponse primeAPICreateWallet(portfolioId, body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String portfolioId = "portfolioId_example"; // String | 
CoinbaseEngPrimeApiApiCreateWalletRequest body = new CoinbaseEngPrimeApiApiCreateWalletRequest(); // CoinbaseEngPrimeApiApiCreateWalletRequest | 
try {
    CoinbaseEngPrimeApiApiCreateWalletResponse result = apiInstance.primeAPICreateWallet(portfolioId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPICreateWallet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**|  |
 **body** | [**CoinbaseEngPrimeApiApiCreateWalletRequest**](CoinbaseEngPrimeApiApiCreateWalletRequest.md)|  |

### Return type

[**CoinbaseEngPrimeApiApiCreateWalletResponse**](CoinbaseEngPrimeApiApiCreateWalletResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPICreateWalletV2"></a>
# **primeAPICreateWalletV2**
> CoinbaseEngPrimeApiApiNewConsensusActivityResponse primeAPICreateWalletV2(portfolioId, body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String portfolioId = "portfolioId_example"; // String | 
CoinbaseEngPrimeApiApiCreateWalletV2Request body = new CoinbaseEngPrimeApiApiCreateWalletV2Request(); // CoinbaseEngPrimeApiApiCreateWalletV2Request | 
try {
    CoinbaseEngPrimeApiApiNewConsensusActivityResponse result = apiInstance.primeAPICreateWalletV2(portfolioId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPICreateWalletV2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**|  |
 **body** | [**CoinbaseEngPrimeApiApiCreateWalletV2Request**](CoinbaseEngPrimeApiApiCreateWalletV2Request.md)|  |

### Return type

[**CoinbaseEngPrimeApiApiNewConsensusActivityResponse**](CoinbaseEngPrimeApiApiNewConsensusActivityResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPICreateWeb3Action"></a>
# **primeAPICreateWeb3Action**
> CoinbaseEngPrimeApiApiNewConsensusActivityResponse primeAPICreateWeb3Action(portfolioId, body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String portfolioId = "portfolioId_example"; // String | 
CoinbaseEngPrimeApiApiCreateWeb3ActionRequest body = new CoinbaseEngPrimeApiApiCreateWeb3ActionRequest(); // CoinbaseEngPrimeApiApiCreateWeb3ActionRequest | 
try {
    CoinbaseEngPrimeApiApiNewConsensusActivityResponse result = apiInstance.primeAPICreateWeb3Action(portfolioId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPICreateWeb3Action");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**|  |
 **body** | [**CoinbaseEngPrimeApiApiCreateWeb3ActionRequest**](CoinbaseEngPrimeApiApiCreateWeb3ActionRequest.md)|  |

### Return type

[**CoinbaseEngPrimeApiApiNewConsensusActivityResponse**](CoinbaseEngPrimeApiApiNewConsensusActivityResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIDeleteAddressBookEntry"></a>
# **primeAPIDeleteAddressBookEntry**
> CoinbaseEngPrimeApiApiDeleteAddressBookEntryResponse primeAPIDeleteAddressBookEntry(portfolioId, addressEntryId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String portfolioId = "portfolioId_example"; // String | Portfolio id
String addressEntryId = "addressEntryId_example"; // String | ID of address requested to be removed from the address book
try {
    CoinbaseEngPrimeApiApiDeleteAddressBookEntryResponse result = apiInstance.primeAPIDeleteAddressBookEntry(portfolioId, addressEntryId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIDeleteAddressBookEntry");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**| Portfolio id |
 **addressEntryId** | **String**| ID of address requested to be removed from the address book |

### Return type

[**CoinbaseEngPrimeApiApiDeleteAddressBookEntryResponse**](CoinbaseEngPrimeApiApiDeleteAddressBookEntryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIDeletePaymentMethod"></a>
# **primeAPIDeletePaymentMethod**
> CoinbaseEngPrimeApiApiDeletePaymentMethodResponse primeAPIDeletePaymentMethod(vehicleId, paymentMethodId, body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String vehicleId = "vehicleId_example"; // String | 
String paymentMethodId = "paymentMethodId_example"; // String | 
CoinbaseEngPrimeApiApiDeletePaymentMethodRequest body = new CoinbaseEngPrimeApiApiDeletePaymentMethodRequest(); // CoinbaseEngPrimeApiApiDeletePaymentMethodRequest | 
try {
    CoinbaseEngPrimeApiApiDeletePaymentMethodResponse result = apiInstance.primeAPIDeletePaymentMethod(vehicleId, paymentMethodId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIDeletePaymentMethod");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vehicleId** | **String**|  |
 **paymentMethodId** | **String**|  |
 **body** | [**CoinbaseEngPrimeApiApiDeletePaymentMethodRequest**](CoinbaseEngPrimeApiApiDeletePaymentMethodRequest.md)|  |

### Return type

[**CoinbaseEngPrimeApiApiDeletePaymentMethodResponse**](CoinbaseEngPrimeApiApiDeletePaymentMethodResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIDismissNotification"></a>
# **primeAPIDismissNotification**
> CoinbaseCustodyApiDismissNotificationResponse primeAPIDismissNotification(body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
CoinbaseCustodyApiDismissNotificationRequest body = new CoinbaseCustodyApiDismissNotificationRequest(); // CoinbaseCustodyApiDismissNotificationRequest | 
try {
    CoinbaseCustodyApiDismissNotificationResponse result = apiInstance.primeAPIDismissNotification(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIDismissNotification");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CoinbaseCustodyApiDismissNotificationRequest**](CoinbaseCustodyApiDismissNotificationRequest.md)|  |

### Return type

[**CoinbaseCustodyApiDismissNotificationResponse**](CoinbaseCustodyApiDismissNotificationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIDownloadActivityReport"></a>
# **primeAPIDownloadActivityReport**
> CoinbaseEngPrimeApiApiDownloadActivityReportResponse primeAPIDownloadActivityReport(portfolioId, organizationId, categories, currencies, types, secondaryTypes, statuses, startDate, endDate, search)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String portfolioId = "portfolioId_example"; // String | 
String organizationId = "organizationId_example"; // String | 
List<String> categories = Arrays.asList("categories_example"); // List<String> | ActivityCategories to filter by.
List<String> currencies = Arrays.asList("currencies_example"); // List<String> | 
List<String> types = Arrays.asList("types_example"); // List<String> | ActivityTypes to filter by.   - ACTIVITY_TYPE_PRINCIPAL_OUT: Lending specific activity types  - ACTIVITY_TYPE_BLOCK_TRADE: Block trades  - ACTIVITY_TYPE_USER_CHANGE_REQUEST_NO_PAS: No pas integration for user change request  - ACTIVITY_TYPE_SHORT_COLLATERAL_TRANSFER_WITHDRAWAL: Short Collateral Transfer Types
List<String> secondaryTypes = Arrays.asList("secondaryTypes_example"); // List<String> | ActivitySecondaryTypes to filter by.   - ACTIVITY_SECONDARY_TYPE_UNSPECIFIED: Order & Allocation secondary types  - ACTIVITY_SECONDARY_TYPE_INTERNAL_TRANSFER: Transaction secondary types  - ACTIVITY_SECONDARY_TYPE_CB_LENDS: Lending secondary types  - ACTIVITY_SECONDARY_TYPE_INVITE_TEAM_MEMBER: User Invite secondary types  - ACTIVITY_SECONDARY_TYPE_WEB3_WALLET: Wallet Create secondary types  - ACTIVITY_SECONDARY_TYPE_WEB3_SIGNER: Web3 Signer role secondary type
List<String> statuses = Arrays.asList("statuses_example"); // List<String> | ActivityStatuses to filter by.
String startDate = "startDate_example"; // String | Start date to filter activities by in YYYY-MM-DD format. Requires end_date to be specified if start_date provided. 
String endDate = "endDate_example"; // String | End date to filter activities by in YYYY-MM-DD format. Requires start_date to be specified if end_date provided. 
String search = "search_example"; // String | Query string to search titles and descriptions for.
try {
    CoinbaseEngPrimeApiApiDownloadActivityReportResponse result = apiInstance.primeAPIDownloadActivityReport(portfolioId, organizationId, categories, currencies, types, secondaryTypes, statuses, startDate, endDate, search);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIDownloadActivityReport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**|  |
 **organizationId** | **String**|  | [optional]
 **categories** | [**List&lt;String&gt;**](String.md)| ActivityCategories to filter by. | [optional] [enum: ACTIVITY_CATEGORY_UNSPECIFIED, ACTIVITY_CATEGORY_ORDER, ACTIVITY_CATEGORY_TRANSACTION, ACTIVITY_CATEGORY_ACCOUNT, ACTIVITY_CATEGORY_ADMIN, ACTIVITY_CATEGORY_LENDING, ACTIVITY_CATEGORY_ALLOCATION, ACTIVITY_CATEGORY_USER_CHANGE_REQUEST_NO_PAS, ACTIVITY_CATEGORY_WEB3_SIGNING_PAYLOAD]
 **currencies** | [**List&lt;String&gt;**](String.md)|  | [optional]
 **types** | [**List&lt;String&gt;**](String.md)| ActivityTypes to filter by.   - ACTIVITY_TYPE_PRINCIPAL_OUT: Lending specific activity types  - ACTIVITY_TYPE_BLOCK_TRADE: Block trades  - ACTIVITY_TYPE_USER_CHANGE_REQUEST_NO_PAS: No pas integration for user change request  - ACTIVITY_TYPE_SHORT_COLLATERAL_TRANSFER_WITHDRAWAL: Short Collateral Transfer Types | [optional] [enum: ACTIVITY_TYPE_UNSPECIFIED, ACTIVITY_TYPE_LIMIT_ORDER, ACTIVITY_TYPE_MARKET_ORDER, ACTIVITY_TYPE_TWAP_ORDER, ACTIVITY_TYPE_VWAP_ORDER, ACTIVITY_TYPE_STOP_LIMIT_ORDER, ACTIVITY_TYPE_DEPOSIT, ACTIVITY_TYPE_WITHDRAWAL, ACTIVITY_TYPE_CREATE_WALLET, ACTIVITY_TYPE_REMOVE_WALLET, ACTIVITY_TYPE_UPDATE_WALLET, ACTIVITY_TYPE_CAST_VOTE, ACTIVITY_TYPE_ENABLE_VOTING, ACTIVITY_TYPE_STAKE, ACTIVITY_TYPE_UNSTAKE, ACTIVITY_TYPE_CHANGE_VALIDATOR, ACTIVITY_TYPE_RESTAKE, ACTIVITY_TYPE_ADDRESS_BOOK, ACTIVITY_TYPE_TEAM_MEMBERS, ACTIVITY_TYPE_BILLING, ACTIVITY_TYPE_SECURITY, ACTIVITY_TYPE_API, ACTIVITY_TYPE_SETTINGS, ACTIVITY_TYPE_SMART_CONTRACT, ACTIVITY_TYPE_PRINCIPAL_OUT, ACTIVITY_TYPE_PRINCIPAL_IN, ACTIVITY_TYPE_COLLATERAL_OUT, ACTIVITY_TYPE_COLLATERAL_IN, ACTIVITY_TYPE_INTEREST_OUT, ACTIVITY_TYPE_INTEREST_IN, ACTIVITY_TYPE_ALLOCATION_IN, ACTIVITY_TYPE_ALLOCATION_OUT, ACTIVITY_TYPE_ALLOCATION_IN_REVERSAL, ACTIVITY_TYPE_ALLOCATION_OUT_REVERSAL, ACTIVITY_TYPE_CONVERSION, ACTIVITY_TYPE_BLOCK_TRADE, ACTIVITY_TYPE_USER_CHANGE_REQUEST_NO_PAS, ACTIVITY_TYPE_WEB3_TRANSACTION, ACTIVITY_TYPE_REWARD, ACTIVITY_TYPE_WEB3_MESSAGE, ACTIVITY_TYPE_WEB3_ADD_SIGNER, ACTIVITY_TYPE_WEB3_CLONE_KEYS, ACTIVITY_TYPE_WEB3_ONBOARDING, ACTIVITY_TYPE_WEB3_RECREATE_BACKUP, ACTIVITY_TYPE_MATCH_TRANSFER_DEPOSIT, ACTIVITY_TYPE_MATCH_TRANSFER_WITHDRAWAL, ACTIVITY_TYPE_WEB3_DEVICE_RECOVERY, ACTIVITY_TYPE_STAKING_CRYPTO_REBATE, ACTIVITY_TYPE_SHORT_COLLATERAL_TRANSFER_WITHDRAWAL, ACTIVITY_TYPE_SHORT_COLLATERAL_TRANSFER_RETURN, ACTIVITY_TYPE_WEB3_DEPOSIT_TRANSACTION, ACTIVITY_TYPE_ADVANCED_TRANSFER, ACTIVITY_TYPE_WEB3_UPLOAD_SECURITY_KEY, ACTIVITY_TYPE_WEB3_KEY_EXPORT, ACTIVITY_TYPE_WEB3_ARCHIVE_SECURITY_KEY]
 **secondaryTypes** | [**List&lt;String&gt;**](String.md)| ActivitySecondaryTypes to filter by.   - ACTIVITY_SECONDARY_TYPE_UNSPECIFIED: Order &amp; Allocation secondary types  - ACTIVITY_SECONDARY_TYPE_INTERNAL_TRANSFER: Transaction secondary types  - ACTIVITY_SECONDARY_TYPE_CB_LENDS: Lending secondary types  - ACTIVITY_SECONDARY_TYPE_INVITE_TEAM_MEMBER: User Invite secondary types  - ACTIVITY_SECONDARY_TYPE_WEB3_WALLET: Wallet Create secondary types  - ACTIVITY_SECONDARY_TYPE_WEB3_SIGNER: Web3 Signer role secondary type | [optional] [enum: ACTIVITY_SECONDARY_TYPE_UNSPECIFIED, ACTIVITY_SECONDARY_TYPE_BUY, ACTIVITY_SECONDARY_TYPE_SELL, ACTIVITY_SECONDARY_TYPE_INTERNAL_TRANSFER, ACTIVITY_SECONDARY_TYPE_SWEEP_TRANSFER, ACTIVITY_SECONDARY_TYPE_CB_LENDS, ACTIVITY_SECONDARY_TYPE_CB_BORROWS, ACTIVITY_SECONDARY_TYPE_INVITE_TEAM_MEMBER, ACTIVITY_SECONDARY_TYPE_WEB3_WALLET, ACTIVITY_SECONDARY_TYPE_QUALIFIED_CUSTODIAN_WALLET, ACTIVITY_SECONDARY_TYPE_WEB3_SIGNER]
 **statuses** | [**List&lt;String&gt;**](String.md)| ActivityStatuses to filter by. | [optional] [enum: ACTIVITY_STATUS_UNSPECIFIED, ACTIVITY_STATUS_OPEN, ACTIVITY_STATUS_CANCELLED, ACTIVITY_STATUS_PROCESSING, ACTIVITY_STATUS_COMPLETED, ACTIVITY_STATUS_EXPIRED, ACTIVITY_STATUS_REJECTED, ACTIVITY_STATUS_FAILED]
 **startDate** | **String**| Start date to filter activities by in YYYY-MM-DD format. Requires end_date to be specified if start_date provided.  | [optional]
 **endDate** | **String**| End date to filter activities by in YYYY-MM-DD format. Requires start_date to be specified if end_date provided.  | [optional]
 **search** | **String**| Query string to search titles and descriptions for. | [optional]

### Return type

[**CoinbaseEngPrimeApiApiDownloadActivityReportResponse**](CoinbaseEngPrimeApiApiDownloadActivityReportResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIEnrollInStablecoinRewards"></a>
# **primeAPIEnrollInStablecoinRewards**
> CoinbaseEngPrimeApiApiEnrollInStablecoinRewardsResponse primeAPIEnrollInStablecoinRewards(vehicleId, currency, body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String vehicleId = "vehicleId_example"; // String | 
String currency = "currency_example"; // String | 
CoinbaseEngPrimeApiApiEnrollInStablecoinRewardsRequest body = new CoinbaseEngPrimeApiApiEnrollInStablecoinRewardsRequest(); // CoinbaseEngPrimeApiApiEnrollInStablecoinRewardsRequest | 
try {
    CoinbaseEngPrimeApiApiEnrollInStablecoinRewardsResponse result = apiInstance.primeAPIEnrollInStablecoinRewards(vehicleId, currency, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIEnrollInStablecoinRewards");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vehicleId** | **String**|  |
 **currency** | **String**|  |
 **body** | [**CoinbaseEngPrimeApiApiEnrollInStablecoinRewardsRequest**](CoinbaseEngPrimeApiApiEnrollInStablecoinRewardsRequest.md)|  |

### Return type

[**CoinbaseEngPrimeApiApiEnrollInStablecoinRewardsResponse**](CoinbaseEngPrimeApiApiEnrollInStablecoinRewardsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIFetchInviteeAccessByEmail"></a>
# **primeAPIFetchInviteeAccessByEmail**
> CoinbaseEngPrimeApiApiFetchInviteeAccessByEmailResponse primeAPIFetchInviteeAccessByEmail(body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
CoinbaseEngPrimeApiApiFetchInviteeAccessByEmailRequest body = new CoinbaseEngPrimeApiApiFetchInviteeAccessByEmailRequest(); // CoinbaseEngPrimeApiApiFetchInviteeAccessByEmailRequest | 
try {
    CoinbaseEngPrimeApiApiFetchInviteeAccessByEmailResponse result = apiInstance.primeAPIFetchInviteeAccessByEmail(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIFetchInviteeAccessByEmail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CoinbaseEngPrimeApiApiFetchInviteeAccessByEmailRequest**](CoinbaseEngPrimeApiApiFetchInviteeAccessByEmailRequest.md)|  |

### Return type

[**CoinbaseEngPrimeApiApiFetchInviteeAccessByEmailResponse**](CoinbaseEngPrimeApiApiFetchInviteeAccessByEmailResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIFinishVideoUpload"></a>
# **primeAPIFinishVideoUpload**
> CoinbaseCustodyApiVideoUpload primeAPIFinishVideoUpload(uploadId, body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String uploadId = "uploadId_example"; // String | 
CoinbaseCustodyApiFinishVideoUploadRequest body = new CoinbaseCustodyApiFinishVideoUploadRequest(); // CoinbaseCustodyApiFinishVideoUploadRequest | 
try {
    CoinbaseCustodyApiVideoUpload result = apiInstance.primeAPIFinishVideoUpload(uploadId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIFinishVideoUpload");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uploadId** | **String**|  |
 **body** | [**CoinbaseCustodyApiFinishVideoUploadRequest**](CoinbaseCustodyApiFinishVideoUploadRequest.md)|  |

### Return type

[**CoinbaseCustodyApiVideoUpload**](CoinbaseCustodyApiVideoUpload.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGenerateDALReport"></a>
# **primeAPIGenerateDALReport**
> CoinbaseEngPrimeApiApiGenerateDALReportResponse primeAPIGenerateDALReport(vehicleId, dateStart, dateEnd)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String vehicleId = "vehicleId_example"; // String | 
String dateStart = "dateStart_example"; // String | 
String dateEnd = "dateEnd_example"; // String | 
try {
    CoinbaseEngPrimeApiApiGenerateDALReportResponse result = apiInstance.primeAPIGenerateDALReport(vehicleId, dateStart, dateEnd);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGenerateDALReport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vehicleId** | **String**|  |
 **dateStart** | **String**|  | [optional]
 **dateEnd** | **String**|  | [optional]

### Return type

[**CoinbaseEngPrimeApiApiGenerateDALReportResponse**](CoinbaseEngPrimeApiApiGenerateDALReportResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGenerateFinancingReport"></a>
# **primeAPIGenerateFinancingReport**
> CoinbaseEngPrimeApiApiGenerateFinancingReportResponse primeAPIGenerateFinancingReport(vehicleId, startUnix, endUnix, portfolioIds, reportTypes)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String vehicleId = "vehicleId_example"; // String | 
String startUnix = "startUnix_example"; // String | 
String endUnix = "endUnix_example"; // String | 
List<String> portfolioIds = Arrays.asList("portfolioIds_example"); // List<String> | 
List<String> reportTypes = Arrays.asList("reportTypes_example"); // List<String> |  - REPORT_TYPE_FINANCING_PORTFOLIO_MARGIN_SHORT_ACCRUALS: Financing portfolio margin report types  - REPORT_TYPE_FINANCING_TRADE_FINANCE_ACCRUALS: Financing trade finance report types  - REPORT_TYPE_FINANCING_DIGITAL_AGENCY_LENDING_ACCRUALS: Financing digital agency lending report types  - REPORT_TYPE_FINANCING_BILATERAL_LENDING_ACCRUALS: Financing bilateral lending report types  - REPORT_TYPE_STAKING: Staking report type  - REPORT_TYPE_WEB3_TRANSACTIONS_CSV: Web3 report type
try {
    CoinbaseEngPrimeApiApiGenerateFinancingReportResponse result = apiInstance.primeAPIGenerateFinancingReport(vehicleId, startUnix, endUnix, portfolioIds, reportTypes);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGenerateFinancingReport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vehicleId** | **String**|  |
 **startUnix** | **String**|  | [optional]
 **endUnix** | **String**|  | [optional]
 **portfolioIds** | [**List&lt;String&gt;**](String.md)|  | [optional]
 **reportTypes** | [**List&lt;String&gt;**](String.md)|  - REPORT_TYPE_FINANCING_PORTFOLIO_MARGIN_SHORT_ACCRUALS: Financing portfolio margin report types  - REPORT_TYPE_FINANCING_TRADE_FINANCE_ACCRUALS: Financing trade finance report types  - REPORT_TYPE_FINANCING_DIGITAL_AGENCY_LENDING_ACCRUALS: Financing digital agency lending report types  - REPORT_TYPE_FINANCING_BILATERAL_LENDING_ACCRUALS: Financing bilateral lending report types  - REPORT_TYPE_STAKING: Staking report type  - REPORT_TYPE_WEB3_TRANSACTIONS_CSV: Web3 report type | [optional] [enum: REPORT_TYPE_UNSPECIFIED, REPORT_TYPE_BALANCE, REPORT_TYPE_ADDRESS, REPORT_TYPE_TRANSACTION, REPORT_TYPE_FINANCING_PORTFOLIO_MARGIN_SHORT_ACCRUALS, REPORT_TYPE_FINANCING_PORTFOLIO_MARGIN_SHORT_COLLATERAL_ACCRUALS, REPORT_TYPE_FINANCING_PORTFOLIO_MARGIN_MARGIN_DETAIL, REPORT_TYPE_FINANCING_PORTFOLIO_MARGIN_MARGIN_SUMMARY, REPORT_TYPE_FINANCING_PORTFOLIO_MARGIN_CONVERSIONS, REPORT_TYPE_FINANCING_PORTFOLIO_MARGIN_MARGIN_SUMMARY_DOD, REPORT_TYPE_FINANCING_PORTFOLIO_MARGIN_MARGIN_SHORT_COLLATERAL_SUMMARY, REPORT_TYPE_FINANCING_PORTFOLIO_MARGIN_MARGIN_SHORT_COLLATERAL_DETAIL, REPORT_TYPE_FINANCING_TRADE_FINANCE_ACCRUALS, REPORT_TYPE_FINANCING_TRADE_FINANCE_USAGE, REPORT_TYPE_FINANCING_DIGITAL_AGENCY_LENDING_ACCRUALS, REPORT_TYPE_FINANCING_DIGITAL_AGENCY_LENDING_COLLATERAL, REPORT_TYPE_FINANCING_DIGITAL_AGENCY_LENDING_POSITION, REPORT_TYPE_FINANCING_BILATERAL_LENDING_ACCRUALS, REPORT_TYPE_FINANCING_BILATERAL_LENDING_COLLATERAL, REPORT_TYPE_STAKING, REPORT_TYPE_STAKING_SUMMARY_CSV, REPORT_TYPE_STAKING_WALLET_REWARDS_SUMMARY_CSV, REPORT_TYPE_STAKING_WALLET_TRANSACTIONS_CSV, REPORT_TYPE_WEB3_TRANSACTIONS_CSV, REPORT_TYPE_WEB3_BALANCES_CSV]

### Return type

[**CoinbaseEngPrimeApiApiGenerateFinancingReportResponse**](CoinbaseEngPrimeApiApiGenerateFinancingReportResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGenerateReportingCenterDocument"></a>
# **primeAPIGenerateReportingCenterDocument**
> CoinbaseEngPrimeApiApiGenerateReportingCenterDocumentResponse primeAPIGenerateReportingCenterDocument(reportType, stakingReportGenerationArgsPortfolioId, stakingReportGenerationArgsStartUnix, stakingReportGenerationArgsEndUnix)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String reportType = "GENERATE_REPORT_TYPE_UNSPECIFIED"; // String | 
String stakingReportGenerationArgsPortfolioId = "stakingReportGenerationArgsPortfolioId_example"; // String | 
String stakingReportGenerationArgsStartUnix = "stakingReportGenerationArgsStartUnix_example"; // String | 
String stakingReportGenerationArgsEndUnix = "stakingReportGenerationArgsEndUnix_example"; // String | 
try {
    CoinbaseEngPrimeApiApiGenerateReportingCenterDocumentResponse result = apiInstance.primeAPIGenerateReportingCenterDocument(reportType, stakingReportGenerationArgsPortfolioId, stakingReportGenerationArgsStartUnix, stakingReportGenerationArgsEndUnix);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGenerateReportingCenterDocument");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportType** | **String**|  | [optional] [default to GENERATE_REPORT_TYPE_UNSPECIFIED] [enum: GENERATE_REPORT_TYPE_UNSPECIFIED, GENERATE_REPORT_TYPE_DAL_REPORT, GENERATE_REPORT_TYPE_STAKING_REPORT]
 **stakingReportGenerationArgsPortfolioId** | **String**|  | [optional]
 **stakingReportGenerationArgsStartUnix** | **String**|  | [optional]
 **stakingReportGenerationArgsEndUnix** | **String**|  | [optional]

### Return type

[**CoinbaseEngPrimeApiApiGenerateReportingCenterDocumentResponse**](CoinbaseEngPrimeApiApiGenerateReportingCenterDocumentResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGenerateStatement"></a>
# **primeAPIGenerateStatement**
> CoinbaseEngPrimeApiApiGenerateStatementResponse primeAPIGenerateStatement(vehicleId, portfolioId, startDate, endDate, startDateRfc3339, endDateRfc3339, portfolioIds, statementType)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String vehicleId = "vehicleId_example"; // String | 
String portfolioId = "portfolioId_example"; // String | 
String startDate = "startDate_example"; // String | 
String endDate = "endDate_example"; // String | 
String startDateRfc3339 = "startDateRfc3339_example"; // String | 
String endDateRfc3339 = "endDateRfc3339_example"; // String | 
List<String> portfolioIds = Arrays.asList("portfolioIds_example"); // List<String> | 
String statementType = "STATEMENT_TYPE_UNKNOWN"; // String |  - STATEMENT_TYPE_CUSTODY_EOM: This type correspond to portfolio level statement  - STATEMENT_TYPE_PRIME_ENTITY_LEVEL: This type correspond to entity level statement
try {
    CoinbaseEngPrimeApiApiGenerateStatementResponse result = apiInstance.primeAPIGenerateStatement(vehicleId, portfolioId, startDate, endDate, startDateRfc3339, endDateRfc3339, portfolioIds, statementType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGenerateStatement");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vehicleId** | **String**|  |
 **portfolioId** | **String**|  | [optional]
 **startDate** | **String**|  | [optional]
 **endDate** | **String**|  | [optional]
 **startDateRfc3339** | **String**|  | [optional]
 **endDateRfc3339** | **String**|  | [optional]
 **portfolioIds** | [**List&lt;String&gt;**](String.md)|  | [optional]
 **statementType** | **String**|  - STATEMENT_TYPE_CUSTODY_EOM: This type correspond to portfolio level statement  - STATEMENT_TYPE_PRIME_ENTITY_LEVEL: This type correspond to entity level statement | [optional] [default to STATEMENT_TYPE_UNKNOWN] [enum: STATEMENT_TYPE_UNKNOWN, STATEMENT_TYPE_CUSTODY_EOM, STATEMENT_TYPE_PRIME_ENTITY_LEVEL]

### Return type

[**CoinbaseEngPrimeApiApiGenerateStatementResponse**](CoinbaseEngPrimeApiApiGenerateStatementResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGenerateWeb3Report"></a>
# **primeAPIGenerateWeb3Report**
> CoinbaseEngPrimeApiApiGenerateWeb3ReportResponse primeAPIGenerateWeb3Report(portfolioId, startUnix, endUnix)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String portfolioId = "portfolioId_example"; // String | 
String startUnix = "startUnix_example"; // String | 
String endUnix = "endUnix_example"; // String | 
try {
    CoinbaseEngPrimeApiApiGenerateWeb3ReportResponse result = apiInstance.primeAPIGenerateWeb3Report(portfolioId, startUnix, endUnix);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGenerateWeb3Report");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**|  |
 **startUnix** | **String**|  | [optional]
 **endUnix** | **String**|  | [optional]

### Return type

[**CoinbaseEngPrimeApiApiGenerateWeb3ReportResponse**](CoinbaseEngPrimeApiApiGenerateWeb3ReportResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetAPIKey"></a>
# **primeAPIGetAPIKey**
> CoinbaseEngPrimeApiApiGetAPIKeyResponse primeAPIGetAPIKey(portfolioId, accessKey)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String portfolioId = "portfolioId_example"; // String | 
String accessKey = "accessKey_example"; // String | 
try {
    CoinbaseEngPrimeApiApiGetAPIKeyResponse result = apiInstance.primeAPIGetAPIKey(portfolioId, accessKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetAPIKey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**|  |
 **accessKey** | **String**|  |

### Return type

[**CoinbaseEngPrimeApiApiGetAPIKeyResponse**](CoinbaseEngPrimeApiApiGetAPIKeyResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetAPIKeyCount"></a>
# **primeAPIGetAPIKeyCount**
> CoinbaseEngPrimeApiApiGetAPIKeyCountResponse primeAPIGetAPIKeyCount(portfolioId, createdByUserId, states)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String portfolioId = "portfolioId_example"; // String | 
String createdByUserId = "createdByUserId_example"; // String | 
List<String> states = Arrays.asList("states_example"); // List<String> | 
try {
    CoinbaseEngPrimeApiApiGetAPIKeyCountResponse result = apiInstance.primeAPIGetAPIKeyCount(portfolioId, createdByUserId, states);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetAPIKeyCount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**|  |
 **createdByUserId** | **String**|  | [optional]
 **states** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: API_KEY_STATE_UNKNOWN, API_KEY_STATE_PENDING, API_KEY_STATE_ACTIVATED, API_KEY_STATE_DEACTIVATED, API_KEY_STATE_EXPIRED, API_KEY_STATE_DORMANT]

### Return type

[**CoinbaseEngPrimeApiApiGetAPIKeyCountResponse**](CoinbaseEngPrimeApiApiGetAPIKeyCountResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetAPIKeyCountV2"></a>
# **primeAPIGetAPIKeyCountV2**
> CoinbaseEngPrimeApiApiGetAPIKeyCountResponse primeAPIGetAPIKeyCountV2(groupId, createdByUserId, states)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String groupId = "groupId_example"; // String | 
String createdByUserId = "createdByUserId_example"; // String | 
List<String> states = Arrays.asList("states_example"); // List<String> | 
try {
    CoinbaseEngPrimeApiApiGetAPIKeyCountResponse result = apiInstance.primeAPIGetAPIKeyCountV2(groupId, createdByUserId, states);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetAPIKeyCountV2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **String**|  |
 **createdByUserId** | **String**|  | [optional]
 **states** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: API_KEY_STATE_UNKNOWN, API_KEY_STATE_PENDING, API_KEY_STATE_ACTIVATED, API_KEY_STATE_DEACTIVATED, API_KEY_STATE_EXPIRED, API_KEY_STATE_DORMANT]

### Return type

[**CoinbaseEngPrimeApiApiGetAPIKeyCountResponse**](CoinbaseEngPrimeApiApiGetAPIKeyCountResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetAPIKeyV2"></a>
# **primeAPIGetAPIKeyV2**
> CoinbaseEngPrimeApiApiGetAPIKeyResponse primeAPIGetAPIKeyV2(groupId, accessKey)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String groupId = "groupId_example"; // String | 
String accessKey = "accessKey_example"; // String | 
try {
    CoinbaseEngPrimeApiApiGetAPIKeyResponse result = apiInstance.primeAPIGetAPIKeyV2(groupId, accessKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetAPIKeyV2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **String**|  |
 **accessKey** | **String**|  |

### Return type

[**CoinbaseEngPrimeApiApiGetAPIKeyResponse**](CoinbaseEngPrimeApiApiGetAPIKeyResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetAPIKeys"></a>
# **primeAPIGetAPIKeys**
> CoinbaseEngPrimeApiApiListAPIKeysResponse primeAPIGetAPIKeys(portfolioId, searchText, cursor, limit, states)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String portfolioId = "portfolioId_example"; // String | 
String searchText = "searchText_example"; // String | 
String cursor = "cursor_example"; // String | 
Integer limit = 56; // Integer | 
List<String> states = Arrays.asList("states_example"); // List<String> | 
try {
    CoinbaseEngPrimeApiApiListAPIKeysResponse result = apiInstance.primeAPIGetAPIKeys(portfolioId, searchText, cursor, limit, states);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetAPIKeys");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**|  |
 **searchText** | **String**|  | [optional]
 **cursor** | **String**|  | [optional]
 **limit** | **Integer**|  | [optional]
 **states** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: API_KEY_STATE_UNKNOWN, API_KEY_STATE_PENDING, API_KEY_STATE_ACTIVATED, API_KEY_STATE_DEACTIVATED, API_KEY_STATE_EXPIRED, API_KEY_STATE_DORMANT]

### Return type

[**CoinbaseEngPrimeApiApiListAPIKeysResponse**](CoinbaseEngPrimeApiApiListAPIKeysResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetAPIKeysV2"></a>
# **primeAPIGetAPIKeysV2**
> CoinbaseEngPrimeApiApiListAPIKeysResponse primeAPIGetAPIKeysV2(groupId, searchText, cursor, limit, states, type)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String groupId = "groupId_example"; // String | 
String searchText = "searchText_example"; // String | 
String cursor = "cursor_example"; // String | 
Integer limit = 56; // Integer | 
List<String> states = Arrays.asList("states_example"); // List<String> | 
String type = "PORTFOLIO"; // String | 
try {
    CoinbaseEngPrimeApiApiListAPIKeysResponse result = apiInstance.primeAPIGetAPIKeysV2(groupId, searchText, cursor, limit, states, type);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetAPIKeysV2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **String**|  |
 **searchText** | **String**|  | [optional]
 **cursor** | **String**|  | [optional]
 **limit** | **Integer**|  | [optional]
 **states** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: API_KEY_STATE_UNKNOWN, API_KEY_STATE_PENDING, API_KEY_STATE_ACTIVATED, API_KEY_STATE_DEACTIVATED, API_KEY_STATE_EXPIRED, API_KEY_STATE_DORMANT]
 **type** | **String**|  | [optional] [default to PORTFOLIO] [enum: PORTFOLIO, ENTITY, ORGANIZATION]

### Return type

[**CoinbaseEngPrimeApiApiListAPIKeysResponse**](CoinbaseEngPrimeApiApiListAPIKeysResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetAUCFeeTiers"></a>
# **primeAPIGetAUCFeeTiers**
> EngPrimeBillingApiGetAUCFeeTiersResponse primeAPIGetAUCFeeTiers(portfolioId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String portfolioId = "portfolioId_example"; // String | 
try {
    EngPrimeBillingApiGetAUCFeeTiersResponse result = apiInstance.primeAPIGetAUCFeeTiers(portfolioId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetAUCFeeTiers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**|  |

### Return type

[**EngPrimeBillingApiGetAUCFeeTiersResponse**](EngPrimeBillingApiGetAUCFeeTiersResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetActivityFilters"></a>
# **primeAPIGetActivityFilters**
> CoinbaseEngPrimeApiApiGetActivityFiltersResponse primeAPIGetActivityFilters(portfolioId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String portfolioId = "portfolioId_example"; // String | 
try {
    CoinbaseEngPrimeApiApiGetActivityFiltersResponse result = apiInstance.primeAPIGetActivityFilters(portfolioId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetActivityFilters");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**|  |

### Return type

[**CoinbaseEngPrimeApiApiGetActivityFiltersResponse**](CoinbaseEngPrimeApiApiGetActivityFiltersResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetAddressBook"></a>
# **primeAPIGetAddressBook**
> CoinbaseEngPrimeApiApiAddressBookResponse primeAPIGetAddressBook(portfolioId, currencySymbol, search, cursor, limit, sortDirection, type)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String portfolioId = "portfolioId_example"; // String | Portfolio id
String currencySymbol = "currencySymbol_example"; // String | Cryptocurrency symbol, if nothing is passed all addresses will be returned
String search = "search_example"; // String | Query string that matches the address name
String cursor = "cursor_example"; // String | Id to retrieve additional results strictly after.
Integer limit = 56; // Integer | Number of addresses to retrieve
String sortDirection = "DESC"; // String | Sorting order
String type = "ADDRESS_BOOK_TYPE_UNSPECIFIED"; // String | Type of address book entry
try {
    CoinbaseEngPrimeApiApiAddressBookResponse result = apiInstance.primeAPIGetAddressBook(portfolioId, currencySymbol, search, cursor, limit, sortDirection, type);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetAddressBook");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**| Portfolio id |
 **currencySymbol** | **String**| Cryptocurrency symbol, if nothing is passed all addresses will be returned | [optional]
 **search** | **String**| Query string that matches the address name | [optional]
 **cursor** | **String**| Id to retrieve additional results strictly after. | [optional]
 **limit** | **Integer**| Number of addresses to retrieve | [optional]
 **sortDirection** | **String**| Sorting order | [optional] [default to DESC] [enum: DESC, ASC]
 **type** | **String**| Type of address book entry | [optional] [default to ADDRESS_BOOK_TYPE_UNSPECIFIED] [enum: ADDRESS_BOOK_TYPE_UNSPECIFIED, ADDRESS_BOOK_TYPE_ADDRESS, ADDRESS_BOOK_TYPE_COUNTERPARTY_ID]

### Return type

[**CoinbaseEngPrimeApiApiAddressBookResponse**](CoinbaseEngPrimeApiApiAddressBookResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetAllLocateByPortfolio"></a>
# **primeAPIGetAllLocateByPortfolio**
> CoinbaseFinancingGetAllLocatesByPortfolioResponse primeAPIGetAllLocateByPortfolio(entityId, portfolioId, search, sortKey, filtersStatuses, filtersStartConversionDate, filtersEndConversionDate, paginationLimit, paginationCursor, paginationDirection)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String entityId = "entityId_example"; // String | 
String portfolioId = "portfolioId_example"; // String | 
String search = "search_example"; // String | 
String sortKey = "sortKey_example"; // String | 
List<String> filtersStatuses = Arrays.asList("filtersStatuses_example"); // List<String> | 
String filtersStartConversionDate = "filtersStartConversionDate_example"; // String | 
String filtersEndConversionDate = "filtersEndConversionDate_example"; // String | 
Long paginationLimit = 789L; // Long | 
String paginationCursor = "paginationCursor_example"; // String | 
String paginationDirection = "DESC"; // String | 
try {
    CoinbaseFinancingGetAllLocatesByPortfolioResponse result = apiInstance.primeAPIGetAllLocateByPortfolio(entityId, portfolioId, search, sortKey, filtersStatuses, filtersStartConversionDate, filtersEndConversionDate, paginationLimit, paginationCursor, paginationDirection);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetAllLocateByPortfolio");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **entityId** | **String**|  |
 **portfolioId** | **String**|  |
 **search** | **String**|  | [optional]
 **sortKey** | **String**|  | [optional]
 **filtersStatuses** | [**List&lt;String&gt;**](String.md)|  | [optional]
 **filtersStartConversionDate** | **String**|  | [optional]
 **filtersEndConversionDate** | **String**|  | [optional]
 **paginationLimit** | **Long**|  | [optional]
 **paginationCursor** | **String**|  | [optional]
 **paginationDirection** | **String**|  | [optional] [default to DESC] [enum: DESC, ASC]

### Return type

[**CoinbaseFinancingGetAllLocatesByPortfolioResponse**](CoinbaseFinancingGetAllLocatesByPortfolioResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetAllocationByOrder"></a>
# **primeAPIGetAllocationByOrder**
> CoinbaseEngPrimeApiApiGetAllocationByOrderResponse primeAPIGetAllocationByOrder(portfolioId, orderId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String portfolioId = "portfolioId_example"; // String | The ID of the portfolio to get allocation for
String orderId = "orderId_example"; // String | The ID of the order to get allocation for
try {
    CoinbaseEngPrimeApiApiGetAllocationByOrderResponse result = apiInstance.primeAPIGetAllocationByOrder(portfolioId, orderId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetAllocationByOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**| The ID of the portfolio to get allocation for |
 **orderId** | **String**| The ID of the order to get allocation for |

### Return type

[**CoinbaseEngPrimeApiApiGetAllocationByOrderResponse**](CoinbaseEngPrimeApiApiGetAllocationByOrderResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetAllocationLeg"></a>
# **primeAPIGetAllocationLeg**
> CoinbaseEngPrimeApiApiGetAllocationLegResponse primeAPIGetAllocationLeg(portfolioId, allocationLegId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String portfolioId = "portfolioId_example"; // String | The ID of the portfolio to get allocation for
String allocationLegId = "allocationLegId_example"; // String | The ID of the allocation to get allocation for
try {
    CoinbaseEngPrimeApiApiGetAllocationLegResponse result = apiInstance.primeAPIGetAllocationLeg(portfolioId, allocationLegId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetAllocationLeg");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**| The ID of the portfolio to get allocation for |
 **allocationLegId** | **String**| The ID of the allocation to get allocation for |

### Return type

[**CoinbaseEngPrimeApiApiGetAllocationLegResponse**](CoinbaseEngPrimeApiApiGetAllocationLegResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetAllocations"></a>
# **primeAPIGetAllocations**
> CoinbaseEngPrimeApiApiGetAllocationsResponse primeAPIGetAllocations(portfolioId, allocationIds)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String portfolioId = "portfolioId_example"; // String | The ID of the portfolio to get allocation for
List<String> allocationIds = Arrays.asList("allocationIds_example"); // List<String> | An array of allocation ids to get allocations for
try {
    CoinbaseEngPrimeApiApiGetAllocationsResponse result = apiInstance.primeAPIGetAllocations(portfolioId, allocationIds);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetAllocations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**| The ID of the portfolio to get allocation for |
 **allocationIds** | [**List&lt;String&gt;**](String.md)| An array of allocation ids to get allocations for |

### Return type

[**CoinbaseEngPrimeApiApiGetAllocationsResponse**](CoinbaseEngPrimeApiApiGetAllocationsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetBalances"></a>
# **primeAPIGetBalances**
> CoinbaseEngPrimeApiApiGetBalancesResponse primeAPIGetBalances(balanceOwnerReferenceId, balanceOwnerPrimeWallet, visibility)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String balanceOwnerReferenceId = "balanceOwnerReferenceId_example"; // String | 
String balanceOwnerPrimeWallet = "PRIME_WALLET_BALANCE_TYPE_UNSPECIFIED"; // String | 
List<String> visibility = Arrays.asList("visibility_example"); // List<String> | 
try {
    CoinbaseEngPrimeApiApiGetBalancesResponse result = apiInstance.primeAPIGetBalances(balanceOwnerReferenceId, balanceOwnerPrimeWallet, visibility);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetBalances");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **balanceOwnerReferenceId** | **String**|  | [optional]
 **balanceOwnerPrimeWallet** | **String**|  | [optional] [default to PRIME_WALLET_BALANCE_TYPE_UNSPECIFIED] [enum: PRIME_WALLET_BALANCE_TYPE_UNSPECIFIED, PRIME_WALLET_BALANCE_TYPE_WEB3_WALLET]
 **visibility** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: VISIBILITY_STATUS_UNSPECIFIED, VISIBILITY_STATUS_VISIBLE, VISIBILITY_STATUS_HIDDEN, VISIBILITY_STATUS_SPAM]

### Return type

[**CoinbaseEngPrimeApiApiGetBalancesResponse**](CoinbaseEngPrimeApiApiGetBalancesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetBillingEmailList"></a>
# **primeAPIGetBillingEmailList**
> CoinbaseEngPrimeApiApiGetBillingEmailListResponse primeAPIGetBillingEmailList(vehicleId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String vehicleId = "vehicleId_example"; // String | 
try {
    CoinbaseEngPrimeApiApiGetBillingEmailListResponse result = apiInstance.primeAPIGetBillingEmailList(vehicleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetBillingEmailList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vehicleId** | **String**|  |

### Return type

[**CoinbaseEngPrimeApiApiGetBillingEmailListResponse**](CoinbaseEngPrimeApiApiGetBillingEmailListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetBillingPreference"></a>
# **primeAPIGetBillingPreference**
> CoinbaseEngPrimeApiApiGetBillingPreferenceResponse primeAPIGetBillingPreference(vehicleId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String vehicleId = "vehicleId_example"; // String | 
try {
    CoinbaseEngPrimeApiApiGetBillingPreferenceResponse result = apiInstance.primeAPIGetBillingPreference(vehicleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetBillingPreference");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vehicleId** | **String**|  |

### Return type

[**CoinbaseEngPrimeApiApiGetBillingPreferenceResponse**](CoinbaseEngPrimeApiApiGetBillingPreferenceResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetCandles"></a>
# **primeAPIGetCandles**
> CoinbaseBrokerageProxyTradingApiCandles primeAPIGetCandles(productId, start, end, granularity, geolocationLocality, geolocationCountry, userId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String productId = "productId_example"; // String | The trading pair, i.e. 'BTC-USD'
String start = "start_example"; // String | Timestamp for starting range of aggregations (e.g 1596640920)
String end = "end_example"; // String | Timestamp for ending range of aggregations (e.g 1596650920)
String granularity = "UNKNOWN_GRANULARITY"; // String | The candle interval (e.g. 1m, 5m, 15m)
String geolocationLocality = "geolocationLocality_example"; // String | 
String geolocationCountry = "geolocationCountry_example"; // String | 
String userId = "userId_example"; // String | optional field used for feature flags
try {
    CoinbaseBrokerageProxyTradingApiCandles result = apiInstance.primeAPIGetCandles(productId, start, end, granularity, geolocationLocality, geolocationCountry, userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetCandles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productId** | **String**| The trading pair, i.e. &#39;BTC-USD&#39; |
 **start** | **String**| Timestamp for starting range of aggregations (e.g 1596640920) |
 **end** | **String**| Timestamp for ending range of aggregations (e.g 1596650920) |
 **granularity** | **String**| The candle interval (e.g. 1m, 5m, 15m) | [default to UNKNOWN_GRANULARITY] [enum: UNKNOWN_GRANULARITY, ONE_MINUTE, FIVE_MINUTE, FIFTEEN_MINUTE, THIRTY_MINUTE, ONE_HOUR, TWO_HOUR, SIX_HOUR, ONE_DAY]
 **geolocationLocality** | **String**|  | [optional]
 **geolocationCountry** | **String**|  | [optional]
 **userId** | **String**| optional field used for feature flags | [optional]

### Return type

[**CoinbaseBrokerageProxyTradingApiCandles**](CoinbaseBrokerageProxyTradingApiCandles.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetCandlesStream"></a>
# **primeAPIGetCandlesStream**
> StreamResultOfCoinbaseBrokerageProxyTradingApiGetCandlesStreamResponse primeAPIGetCandlesStream(productId, granularity, limit, updateInterval, geolocationLocality, geolocationCountry, userId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String productId = "productId_example"; // String | The trading pair, i.e. 'BTC-USD'
String granularity = "UNKNOWN_GRANULARITY"; // String | The candle interval (e.g. 1m, 5m, 15m)
Integer limit = 56; // Integer | Number of candles to return in the initial snapshot. Maximum of 300
String updateInterval = "ONE_SECOND_CANDLE"; // String | Time between each patch, limited to 1 second for now due to implementation details.
String geolocationLocality = "geolocationLocality_example"; // String | 
String geolocationCountry = "geolocationCountry_example"; // String | 
String userId = "userId_example"; // String | optional field used for feature flags
try {
    StreamResultOfCoinbaseBrokerageProxyTradingApiGetCandlesStreamResponse result = apiInstance.primeAPIGetCandlesStream(productId, granularity, limit, updateInterval, geolocationLocality, geolocationCountry, userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetCandlesStream");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productId** | **String**| The trading pair, i.e. &#39;BTC-USD&#39; |
 **granularity** | **String**| The candle interval (e.g. 1m, 5m, 15m) | [default to UNKNOWN_GRANULARITY] [enum: UNKNOWN_GRANULARITY, ONE_MINUTE, FIVE_MINUTE, FIFTEEN_MINUTE, THIRTY_MINUTE, ONE_HOUR, TWO_HOUR, SIX_HOUR, ONE_DAY]
 **limit** | **Integer**| Number of candles to return in the initial snapshot. Maximum of 300 |
 **updateInterval** | **String**| Time between each patch, limited to 1 second for now due to implementation details. | [default to ONE_SECOND_CANDLE] [enum: ONE_SECOND_CANDLE]
 **geolocationLocality** | **String**|  | [optional]
 **geolocationCountry** | **String**|  | [optional]
 **userId** | **String**| optional field used for feature flags | [optional]

### Return type

[**StreamResultOfCoinbaseBrokerageProxyTradingApiGetCandlesStreamResponse**](StreamResultOfCoinbaseBrokerageProxyTradingApiGetCandlesStreamResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetConfig"></a>
# **primeAPIGetConfig**
> CoinbaseEngPrimeApiApiConfig primeAPIGetConfig(name)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String name = "name_example"; // String | Get the config with a specific name
try {
    CoinbaseEngPrimeApiApiConfig result = apiInstance.primeAPIGetConfig(name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Get the config with a specific name |

### Return type

[**CoinbaseEngPrimeApiApiConfig**](CoinbaseEngPrimeApiApiConfig.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetConversionSummaries"></a>
# **primeAPIGetConversionSummaries**
> CoinbaseFinancingGetConversionSummariesV2Response primeAPIGetConversionSummaries(vehicleId, startDate, endDate)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String vehicleId = "vehicleId_example"; // String | 
OffsetDateTime startDate = new OffsetDateTime(); // OffsetDateTime | 
OffsetDateTime endDate = new OffsetDateTime(); // OffsetDateTime | 
try {
    CoinbaseFinancingGetConversionSummariesV2Response result = apiInstance.primeAPIGetConversionSummaries(vehicleId, startDate, endDate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetConversionSummaries");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vehicleId** | **String**|  |
 **startDate** | **OffsetDateTime**|  | [optional]
 **endDate** | **OffsetDateTime**|  | [optional]

### Return type

[**CoinbaseFinancingGetConversionSummariesV2Response**](CoinbaseFinancingGetConversionSummariesV2Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetConversionSummariesV2"></a>
# **primeAPIGetConversionSummariesV2**
> CoinbaseEngPrimeApiApiGetConversionSummariesV2Response primeAPIGetConversionSummariesV2(vehicleId, startDate, endDate)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String vehicleId = "vehicleId_example"; // String | 
OffsetDateTime startDate = new OffsetDateTime(); // OffsetDateTime | 
OffsetDateTime endDate = new OffsetDateTime(); // OffsetDateTime | 
try {
    CoinbaseEngPrimeApiApiGetConversionSummariesV2Response result = apiInstance.primeAPIGetConversionSummariesV2(vehicleId, startDate, endDate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetConversionSummariesV2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vehicleId** | **String**|  |
 **startDate** | **OffsetDateTime**|  | [optional]
 **endDate** | **OffsetDateTime**|  | [optional]

### Return type

[**CoinbaseEngPrimeApiApiGetConversionSummariesV2Response**](CoinbaseEngPrimeApiApiGetConversionSummariesV2Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetCounterparty"></a>
# **primeAPIGetCounterparty**
> CoinbaseEngPrimeApiApiGetCounterpartyResponse primeAPIGetCounterparty(portfolioId, qcCounterparty)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String portfolioId = "portfolioId_example"; // String | portfolio id
Boolean qcCounterparty = true; // Boolean | is the request for the qc counterparty
try {
    CoinbaseEngPrimeApiApiGetCounterpartyResponse result = apiInstance.primeAPIGetCounterparty(portfolioId, qcCounterparty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetCounterparty");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**| portfolio id |
 **qcCounterparty** | **Boolean**| is the request for the qc counterparty | [optional]

### Return type

[**CoinbaseEngPrimeApiApiGetCounterpartyResponse**](CoinbaseEngPrimeApiApiGetCounterpartyResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetCurrenciesInfo"></a>
# **primeAPIGetCurrenciesInfo**
> CoinbaseEngPrimeApiApiGetCurrenciesInfoResponse primeAPIGetCurrenciesInfo(queryLevel, queryIds)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String queryLevel = "CURRENCY_INFO_QUERY_LEVEL_UNSPECIFIED"; // String | 
List<String> queryIds = Arrays.asList("queryIds_example"); // List<String> | 
try {
    CoinbaseEngPrimeApiApiGetCurrenciesInfoResponse result = apiInstance.primeAPIGetCurrenciesInfo(queryLevel, queryIds);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetCurrenciesInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **queryLevel** | **String**|  | [optional] [default to CURRENCY_INFO_QUERY_LEVEL_UNSPECIFIED] [enum: CURRENCY_INFO_QUERY_LEVEL_UNSPECIFIED, CURRENCY_INFO_QUERY_LEVEL_PORTFOLIO]
 **queryIds** | [**List&lt;String&gt;**](String.md)|  | [optional]

### Return type

[**CoinbaseEngPrimeApiApiGetCurrenciesInfoResponse**](CoinbaseEngPrimeApiApiGetCurrenciesInfoResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetCurrentLocates"></a>
# **primeAPIGetCurrentLocates**
> CoinbaseFinancingGetCurrentLocatesResponse primeAPIGetCurrentLocates(entityId, portfolioId, locateIds, conversionDate)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String entityId = "entityId_example"; // String | 
String portfolioId = "portfolioId_example"; // String | 
List<String> locateIds = Arrays.asList("locateIds_example"); // List<String> | 
String conversionDate = "conversionDate_example"; // String | 
try {
    CoinbaseFinancingGetCurrentLocatesResponse result = apiInstance.primeAPIGetCurrentLocates(entityId, portfolioId, locateIds, conversionDate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetCurrentLocates");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **entityId** | **String**|  |
 **portfolioId** | **String**|  | [optional]
 **locateIds** | [**List&lt;String&gt;**](String.md)|  | [optional]
 **conversionDate** | **String**|  | [optional]

### Return type

[**CoinbaseFinancingGetCurrentLocatesResponse**](CoinbaseFinancingGetCurrentLocatesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetDalCollateralSnapshots"></a>
# **primeAPIGetDalCollateralSnapshots**
> CoinbaseFinancingGetDalCollateralSnapshotsResponse primeAPIGetDalCollateralSnapshots(entityId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String entityId = "entityId_example"; // String | 
try {
    CoinbaseFinancingGetDalCollateralSnapshotsResponse result = apiInstance.primeAPIGetDalCollateralSnapshots(entityId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetDalCollateralSnapshots");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **entityId** | **String**|  |

### Return type

[**CoinbaseFinancingGetDalCollateralSnapshotsResponse**](CoinbaseFinancingGetDalCollateralSnapshotsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetDepositInstructions"></a>
# **primeAPIGetDepositInstructions**
> CoinbaseEngPrimeApiApiGetDepositInstructionsResponse primeAPIGetDepositInstructions(portfolioId, walletId, transferMethodType)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String portfolioId = "portfolioId_example"; // String | 
String walletId = "walletId_example"; // String | 
String transferMethodType = "transferMethodType_example"; // String | 
try {
    CoinbaseEngPrimeApiApiGetDepositInstructionsResponse result = apiInstance.primeAPIGetDepositInstructions(portfolioId, walletId, transferMethodType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetDepositInstructions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**|  |
 **walletId** | **String**|  |
 **transferMethodType** | **String**|  | [optional]

### Return type

[**CoinbaseEngPrimeApiApiGetDepositInstructionsResponse**](CoinbaseEngPrimeApiApiGetDepositInstructionsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetDepthStream"></a>
# **primeAPIGetDepthStream**
> StreamResultOfCoinbaseBrokerageProxyTradingApiGetDepthStreamResponse primeAPIGetDepthStream(productId, updateInterval, geolocationLocality, geolocationCountry)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String productId = "productId_example"; // String | 
String updateInterval = "TWO_HUNDRED_FIFTY_MS_DEPTH"; // String | 
String geolocationLocality = "geolocationLocality_example"; // String | 
String geolocationCountry = "geolocationCountry_example"; // String | 
try {
    StreamResultOfCoinbaseBrokerageProxyTradingApiGetDepthStreamResponse result = apiInstance.primeAPIGetDepthStream(productId, updateInterval, geolocationLocality, geolocationCountry);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetDepthStream");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productId** | **String**|  |
 **updateInterval** | **String**|  | [optional] [default to TWO_HUNDRED_FIFTY_MS_DEPTH] [enum: TWO_HUNDRED_FIFTY_MS_DEPTH, FIVE_HUNDRED_MS_DEPTH]
 **geolocationLocality** | **String**|  | [optional]
 **geolocationCountry** | **String**|  | [optional]

### Return type

[**StreamResultOfCoinbaseBrokerageProxyTradingApiGetDepthStreamResponse**](StreamResultOfCoinbaseBrokerageProxyTradingApiGetDepthStreamResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetDeviceGroup"></a>
# **primeAPIGetDeviceGroup**
> CoinbaseEngPrimeApiApiGetDeviceGroupResponse primeAPIGetDeviceGroup(portfolioId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String portfolioId = "portfolioId_example"; // String | 
try {
    CoinbaseEngPrimeApiApiGetDeviceGroupResponse result = apiInstance.primeAPIGetDeviceGroup(portfolioId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetDeviceGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**|  |

### Return type

[**CoinbaseEngPrimeApiApiGetDeviceGroupResponse**](CoinbaseEngPrimeApiApiGetDeviceGroupResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetDocument"></a>
# **primeAPIGetDocument**
> CoinbaseEngPrimeApiApiGetDocumentResponse primeAPIGetDocument(vehicleId, documentKey)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String vehicleId = "vehicleId_example"; // String | 
String documentKey = "documentKey_example"; // String | 
try {
    CoinbaseEngPrimeApiApiGetDocumentResponse result = apiInstance.primeAPIGetDocument(vehicleId, documentKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetDocument");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vehicleId** | **String**|  |
 **documentKey** | **String**|  | [enum: DOCUMENT_TYPE_UNKNOWN, DOCUMENT_TYPE_STAKING_ADDENDUM, DOCUMENT_TYPE_STACKING_ADDENDUM, DOCUMENT_TYPE_NFT_ADDENDUM, DOCUMENT_TYPE_ETH_STAKING_ADDENDUM, DOCUMENT_TYPE_WEB3_TERMS_AND_CONDITIONS, DOCUMENT_TYPE_LIQUID_STAKING_ADDENDUM, DOCUMENT_TYPE_LSETH_STAKING_ADDENDUM, DOCUMENT_TYPE_USDC_REWARDS_ADDENDUM]

### Return type

[**CoinbaseEngPrimeApiApiGetDocumentResponse**](CoinbaseEngPrimeApiApiGetDocumentResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetDocumentDownloadLinks"></a>
# **primeAPIGetDocumentDownloadLinks**
> CoinbaseEngPrimeApiApiGetDocumentDownloadLinksResponse primeAPIGetDocumentDownloadLinks(documentId, portfolioId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String documentId = "documentId_example"; // String | 
String portfolioId = "portfolioId_example"; // String | 
try {
    CoinbaseEngPrimeApiApiGetDocumentDownloadLinksResponse result = apiInstance.primeAPIGetDocumentDownloadLinks(documentId, portfolioId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetDocumentDownloadLinks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **documentId** | **String**|  |
 **portfolioId** | **String**|  | [optional]

### Return type

[**CoinbaseEngPrimeApiApiGetDocumentDownloadLinksResponse**](CoinbaseEngPrimeApiApiGetDocumentDownloadLinksResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetDocumentSignatureStatus"></a>
# **primeAPIGetDocumentSignatureStatus**
> CoinbaseEngPrimeApiApiGetDocumentSignatureStatusResponse primeAPIGetDocumentSignatureStatus(vehicleId, documentKey)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String vehicleId = "vehicleId_example"; // String | 
String documentKey = "documentKey_example"; // String | 
try {
    CoinbaseEngPrimeApiApiGetDocumentSignatureStatusResponse result = apiInstance.primeAPIGetDocumentSignatureStatus(vehicleId, documentKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetDocumentSignatureStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vehicleId** | **String**|  |
 **documentKey** | **String**|  | [enum: DOCUMENT_TYPE_UNKNOWN, DOCUMENT_TYPE_STAKING_ADDENDUM, DOCUMENT_TYPE_STACKING_ADDENDUM, DOCUMENT_TYPE_NFT_ADDENDUM, DOCUMENT_TYPE_ETH_STAKING_ADDENDUM, DOCUMENT_TYPE_WEB3_TERMS_AND_CONDITIONS, DOCUMENT_TYPE_LIQUID_STAKING_ADDENDUM, DOCUMENT_TYPE_LSETH_STAKING_ADDENDUM, DOCUMENT_TYPE_USDC_REWARDS_ADDENDUM]

### Return type

[**CoinbaseEngPrimeApiApiGetDocumentSignatureStatusResponse**](CoinbaseEngPrimeApiApiGetDocumentSignatureStatusResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetEntitySettings"></a>
# **primeAPIGetEntitySettings**
> List&lt;CoinbaseCustodyApiSettings&gt; primeAPIGetEntitySettings(entityId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String entityId = "entityId_example"; // String | 
try {
    List<CoinbaseCustodyApiSettings> result = apiInstance.primeAPIGetEntitySettings(entityId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetEntitySettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **entityId** | **String**|  |

### Return type

[**List&lt;CoinbaseCustodyApiSettings&gt;**](CoinbaseCustodyApiSettings.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetEvaluationResult"></a>
# **primeAPIGetEvaluationResult**
> CoinbaseEngPrimeApiApiGetEvaluationResultResponse primeAPIGetEvaluationResult(portfolioId, activityId, transactionId, hierarchyHierarchyType, hierarchyHierarchyId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String portfolioId = "portfolioId_example"; // String | Portfolio ID
String activityId = "activityId_example"; // String | Activity ID
String transactionId = "transactionId_example"; // String | Transaction ID
String hierarchyHierarchyType = "HIERARCHY_TYPE_UNKNOWN"; // String | 
String hierarchyHierarchyId = "hierarchyHierarchyId_example"; // String | 
try {
    CoinbaseEngPrimeApiApiGetEvaluationResultResponse result = apiInstance.primeAPIGetEvaluationResult(portfolioId, activityId, transactionId, hierarchyHierarchyType, hierarchyHierarchyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetEvaluationResult");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**| Portfolio ID |
 **activityId** | **String**| Activity ID | [optional]
 **transactionId** | **String**| Transaction ID | [optional]
 **hierarchyHierarchyType** | **String**|  | [optional] [default to HIERARCHY_TYPE_UNKNOWN] [enum: HIERARCHY_TYPE_UNKNOWN, HIERARCHY_TYPE_PORTFOLIO, HIERARCHY_TYPE_ENTITY]
 **hierarchyHierarchyId** | **String**|  | [optional]

### Return type

[**CoinbaseEngPrimeApiApiGetEvaluationResultResponse**](CoinbaseEngPrimeApiApiGetEvaluationResultResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetExchangeRate"></a>
# **primeAPIGetExchangeRate**
> CoinbaseEngPrimeApiApiGetExchangeRateResponse primeAPIGetExchangeRate(portfolioId, sourceCurrencySymbol, destinationCurrencySymbol)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String portfolioId = "portfolioId_example"; // String | 
String sourceCurrencySymbol = "sourceCurrencySymbol_example"; // String | 
String destinationCurrencySymbol = "destinationCurrencySymbol_example"; // String | 
try {
    CoinbaseEngPrimeApiApiGetExchangeRateResponse result = apiInstance.primeAPIGetExchangeRate(portfolioId, sourceCurrencySymbol, destinationCurrencySymbol);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetExchangeRate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**|  |
 **sourceCurrencySymbol** | **String**|  |
 **destinationCurrencySymbol** | **String**|  |

### Return type

[**CoinbaseEngPrimeApiApiGetExchangeRateResponse**](CoinbaseEngPrimeApiApiGetExchangeRateResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetFidoRegistration"></a>
# **primeAPIGetFidoRegistration**
> CoinbaseEngPrimeApiApiGetFidoRegistrationResponse primeAPIGetFidoRegistration(userId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String userId = "userId_example"; // String | User UUID.
try {
    CoinbaseEngPrimeApiApiGetFidoRegistrationResponse result = apiInstance.primeAPIGetFidoRegistration(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetFidoRegistration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| User UUID. |

### Return type

[**CoinbaseEngPrimeApiApiGetFidoRegistrationResponse**](CoinbaseEngPrimeApiApiGetFidoRegistrationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetFinancingProductPermisions"></a>
# **primeAPIGetFinancingProductPermisions**
> CoinbaseEngPrimeApiApiGetFinancingProductPermisionsResponse primeAPIGetFinancingProductPermisions(vehicleId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String vehicleId = "vehicleId_example"; // String | 
try {
    CoinbaseEngPrimeApiApiGetFinancingProductPermisionsResponse result = apiInstance.primeAPIGetFinancingProductPermisions(vehicleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetFinancingProductPermisions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vehicleId** | **String**|  |

### Return type

[**CoinbaseEngPrimeApiApiGetFinancingProductPermisionsResponse**](CoinbaseEngPrimeApiApiGetFinancingProductPermisionsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetGovernanceStatus"></a>
# **primeAPIGetGovernanceStatus**
> CoinbaseEngPrimeApiApiGetGovernanceStatusResponse primeAPIGetGovernanceStatus(portfolioId, walletId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String portfolioId = "portfolioId_example"; // String | 
String walletId = "walletId_example"; // String | 
try {
    CoinbaseEngPrimeApiApiGetGovernanceStatusResponse result = apiInstance.primeAPIGetGovernanceStatus(portfolioId, walletId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetGovernanceStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**|  |
 **walletId** | **String**|  |

### Return type

[**CoinbaseEngPrimeApiApiGetGovernanceStatusResponse**](CoinbaseEngPrimeApiApiGetGovernanceStatusResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetGovernanceTopic"></a>
# **primeAPIGetGovernanceTopic**
> CoinbaseCustodyApiGovernanceTopic primeAPIGetGovernanceTopic(vehicleId, currencySymbol, topicId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String vehicleId = "vehicleId_example"; // String | 
String currencySymbol = "currencySymbol_example"; // String | 
String topicId = "topicId_example"; // String | 
try {
    CoinbaseCustodyApiGovernanceTopic result = apiInstance.primeAPIGetGovernanceTopic(vehicleId, currencySymbol, topicId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetGovernanceTopic");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vehicleId** | **String**|  |
 **currencySymbol** | **String**|  |
 **topicId** | **String**|  |

### Return type

[**CoinbaseCustodyApiGovernanceTopic**](CoinbaseCustodyApiGovernanceTopic.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetGovernanceTopics"></a>
# **primeAPIGetGovernanceTopics**
> CoinbaseEngPrimeApiApiGetGovernanceTopicsResponse primeAPIGetGovernanceTopics(vehicleId, currencySymbol, cursor, limit, sortDirection, search)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String vehicleId = "vehicleId_example"; // String | 
String currencySymbol = "currencySymbol_example"; // String | 
String cursor = "cursor_example"; // String | 
Integer limit = 56; // Integer | 
String sortDirection = "DESC"; // String | 
String search = "search_example"; // String | 
try {
    CoinbaseEngPrimeApiApiGetGovernanceTopicsResponse result = apiInstance.primeAPIGetGovernanceTopics(vehicleId, currencySymbol, cursor, limit, sortDirection, search);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetGovernanceTopics");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vehicleId** | **String**|  |
 **currencySymbol** | **String**|  |
 **cursor** | **String**|  | [optional]
 **limit** | **Integer**|  | [optional]
 **sortDirection** | **String**|  | [optional] [default to DESC] [enum: DESC, ASC]
 **search** | **String**|  | [optional]

### Return type

[**CoinbaseEngPrimeApiApiGetGovernanceTopicsResponse**](CoinbaseEngPrimeApiApiGetGovernanceTopicsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetGovernanceVotes"></a>
# **primeAPIGetGovernanceVotes**
> CoinbaseEngPrimeApiApiGetGovernanceVotesResponse primeAPIGetGovernanceVotes(portfolioId, walletId, cursor, limit, sortDirection)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String portfolioId = "portfolioId_example"; // String | 
String walletId = "walletId_example"; // String | 
String cursor = "cursor_example"; // String | 
Integer limit = 56; // Integer | 
String sortDirection = "DESC"; // String | 
try {
    CoinbaseEngPrimeApiApiGetGovernanceVotesResponse result = apiInstance.primeAPIGetGovernanceVotes(portfolioId, walletId, cursor, limit, sortDirection);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetGovernanceVotes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**|  |
 **walletId** | **String**|  |
 **cursor** | **String**|  | [optional]
 **limit** | **Integer**|  | [optional]
 **sortDirection** | **String**|  | [optional] [default to DESC] [enum: DESC, ASC]

### Return type

[**CoinbaseEngPrimeApiApiGetGovernanceVotesResponse**](CoinbaseEngPrimeApiApiGetGovernanceVotesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetGovernanceVotingWeights"></a>
# **primeAPIGetGovernanceVotingWeights**
> CoinbaseCustodyApiGetVotingWeightsResponse primeAPIGetGovernanceVotingWeights(walletId, topicIds, portfolioId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String walletId = "walletId_example"; // String | 
List<String> topicIds = Arrays.asList("topicIds_example"); // List<String> | 
String portfolioId = "portfolioId_example"; // String | 
try {
    CoinbaseCustodyApiGetVotingWeightsResponse result = apiInstance.primeAPIGetGovernanceVotingWeights(walletId, topicIds, portfolioId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetGovernanceVotingWeights");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **walletId** | **String**|  |
 **topicIds** | [**List&lt;String&gt;**](String.md)|  | [optional]
 **portfolioId** | **String**|  | [optional]

### Return type

[**CoinbaseCustodyApiGetVotingWeightsResponse**](CoinbaseCustodyApiGetVotingWeightsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetIVPortfolioBalances"></a>
# **primeAPIGetIVPortfolioBalances**
> CoinbaseEngPrimeApiApiGetIVPortfolioBalancesResponse primeAPIGetIVPortfolioBalances(vehicleId, currencySymbol)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String vehicleId = "vehicleId_example"; // String | 
String currencySymbol = "currencySymbol_example"; // String | 
try {
    CoinbaseEngPrimeApiApiGetIVPortfolioBalancesResponse result = apiInstance.primeAPIGetIVPortfolioBalances(vehicleId, currencySymbol);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetIVPortfolioBalances");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vehicleId** | **String**|  |
 **currencySymbol** | **String**|  | [optional]

### Return type

[**CoinbaseEngPrimeApiApiGetIVPortfolioBalancesResponse**](CoinbaseEngPrimeApiApiGetIVPortfolioBalancesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetIVRestrictions"></a>
# **primeAPIGetIVRestrictions**
> CoinbaseEngPrimeApiApiGetIVRestrictionsResponse primeAPIGetIVRestrictions(vehicleId, currencySymbol)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String vehicleId = "vehicleId_example"; // String | 
String currencySymbol = "currencySymbol_example"; // String | 
try {
    CoinbaseEngPrimeApiApiGetIVRestrictionsResponse result = apiInstance.primeAPIGetIVRestrictions(vehicleId, currencySymbol);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetIVRestrictions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vehicleId** | **String**|  |
 **currencySymbol** | **String**|  | [optional]

### Return type

[**CoinbaseEngPrimeApiApiGetIVRestrictionsResponse**](CoinbaseEngPrimeApiApiGetIVRestrictionsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetIntrospect"></a>
# **primeAPIGetIntrospect**
> CoinbaseEngPrimeApiApiGetIntrospectResponse primeAPIGetIntrospect()



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
try {
    CoinbaseEngPrimeApiApiGetIntrospectResponse result = apiInstance.primeAPIGetIntrospect();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetIntrospect");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CoinbaseEngPrimeApiApiGetIntrospectResponse**](CoinbaseEngPrimeApiApiGetIntrospectResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetInvestmentVehicle"></a>
# **primeAPIGetInvestmentVehicle**
> CoinbaseEngPrimeApiApiGetInvestmentVehicleResponse primeAPIGetInvestmentVehicle(portfolioId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String portfolioId = "portfolioId_example"; // String | Filter results by a specific profile_id
try {
    CoinbaseEngPrimeApiApiGetInvestmentVehicleResponse result = apiInstance.primeAPIGetInvestmentVehicle(portfolioId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetInvestmentVehicle");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**| Filter results by a specific profile_id |

### Return type

[**CoinbaseEngPrimeApiApiGetInvestmentVehicleResponse**](CoinbaseEngPrimeApiApiGetInvestmentVehicleResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetInvestmentVehiclePortfolios"></a>
# **primeAPIGetInvestmentVehiclePortfolios**
> CoinbaseEngPrimeApiApiGetInvestmentVehiclePortfoliosResponse primeAPIGetInvestmentVehiclePortfolios(userId, portfolioId, vehicleId, includeRoles, paginationLimit, paginationOffset)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String userId = "userId_example"; // String | 
String portfolioId = "portfolioId_example"; // String | 
String vehicleId = "vehicleId_example"; // String | 
Boolean includeRoles = true; // Boolean | 
Integer paginationLimit = 56; // Integer | 
Integer paginationOffset = 56; // Integer | 
try {
    CoinbaseEngPrimeApiApiGetInvestmentVehiclePortfoliosResponse result = apiInstance.primeAPIGetInvestmentVehiclePortfolios(userId, portfolioId, vehicleId, includeRoles, paginationLimit, paginationOffset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetInvestmentVehiclePortfolios");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**|  |
 **portfolioId** | **String**|  | [optional]
 **vehicleId** | **String**|  | [optional]
 **includeRoles** | **Boolean**|  | [optional]
 **paginationLimit** | **Integer**|  | [optional]
 **paginationOffset** | **Integer**|  | [optional]

### Return type

[**CoinbaseEngPrimeApiApiGetInvestmentVehiclePortfoliosResponse**](CoinbaseEngPrimeApiApiGetInvestmentVehiclePortfoliosResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetInvoiceDownloadLink"></a>
# **primeAPIGetInvoiceDownloadLink**
> CoinbaseEngPrimeApiApiGetInvoiceDownloadLinkResponse primeAPIGetInvoiceDownloadLink(vehicleId, uuid)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String vehicleId = "vehicleId_example"; // String | 
String uuid = "uuid_example"; // String | 
try {
    CoinbaseEngPrimeApiApiGetInvoiceDownloadLinkResponse result = apiInstance.primeAPIGetInvoiceDownloadLink(vehicleId, uuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetInvoiceDownloadLink");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vehicleId** | **String**|  |
 **uuid** | **String**|  |

### Return type

[**CoinbaseEngPrimeApiApiGetInvoiceDownloadLinkResponse**](CoinbaseEngPrimeApiApiGetInvoiceDownloadLinkResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetInvoices"></a>
# **primeAPIGetInvoices**
> List&lt;CoinbaseCustodyApiInvoice&gt; primeAPIGetInvoices(vehicleId, invoiceNumber, billingYear)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String vehicleId = "vehicleId_example"; // String | 
String invoiceNumber = "invoiceNumber_example"; // String | 
Integer billingYear = 56; // Integer | 
try {
    List<CoinbaseCustodyApiInvoice> result = apiInstance.primeAPIGetInvoices(vehicleId, invoiceNumber, billingYear);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetInvoices");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vehicleId** | **String**|  |
 **invoiceNumber** | **String**|  | [optional]
 **billingYear** | **Integer**|  | [optional]

### Return type

[**List&lt;CoinbaseCustodyApiInvoice&gt;**](CoinbaseCustodyApiInvoice.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetInvoicesRemainingBalance"></a>
# **primeAPIGetInvoicesRemainingBalance**
> CoinbaseEngPrimeApiApiGetInvoicesRemainingBalanceResponse primeAPIGetInvoicesRemainingBalance(vehicleId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String vehicleId = "vehicleId_example"; // String | 
try {
    CoinbaseEngPrimeApiApiGetInvoicesRemainingBalanceResponse result = apiInstance.primeAPIGetInvoicesRemainingBalance(vehicleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetInvoicesRemainingBalance");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vehicleId** | **String**|  |

### Return type

[**CoinbaseEngPrimeApiApiGetInvoicesRemainingBalanceResponse**](CoinbaseEngPrimeApiApiGetInvoicesRemainingBalanceResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetIvDomicileCategory"></a>
# **primeAPIGetIvDomicileCategory**
> CoinbaseEngPrimeApiApiGetIvDomicileCategoryResponse primeAPIGetIvDomicileCategory(vehicleId, body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String vehicleId = "vehicleId_example"; // String | 
CoinbaseEngPrimeApiApiGetIvDomicileCategoryRequest body = new CoinbaseEngPrimeApiApiGetIvDomicileCategoryRequest(); // CoinbaseEngPrimeApiApiGetIvDomicileCategoryRequest | 
try {
    CoinbaseEngPrimeApiApiGetIvDomicileCategoryResponse result = apiInstance.primeAPIGetIvDomicileCategory(vehicleId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetIvDomicileCategory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vehicleId** | **String**|  |
 **body** | [**CoinbaseEngPrimeApiApiGetIvDomicileCategoryRequest**](CoinbaseEngPrimeApiApiGetIvDomicileCategoryRequest.md)|  |

### Return type

[**CoinbaseEngPrimeApiApiGetIvDomicileCategoryResponse**](CoinbaseEngPrimeApiApiGetIvDomicileCategoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetLadderStream"></a>
# **primeAPIGetLadderStream**
> StreamResultOfCoinbaseBrokerageProxyTradingApiGetLadderStreamResponse primeAPIGetLadderStream(productId, updateInterval, aggregation, feeAdjust, orderAmount, geolocationLocality, geolocationCountry)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String productId = "productId_example"; // String | Product id for the requested ladder
String updateInterval = "FIFTY_MS_LADDER"; // String | Time between each patch for the ladder
String aggregation = "aggregation_example"; // String | Aggregation amount for the requested ladder
Boolean feeAdjust = true; // Boolean | True if the requested ladder is fee adjust
String orderAmount = "orderAmount_example"; // String | (Deprecated) Order amount for the requested ladder
String geolocationLocality = "geolocationLocality_example"; // String | 
String geolocationCountry = "geolocationCountry_example"; // String | 
try {
    StreamResultOfCoinbaseBrokerageProxyTradingApiGetLadderStreamResponse result = apiInstance.primeAPIGetLadderStream(productId, updateInterval, aggregation, feeAdjust, orderAmount, geolocationLocality, geolocationCountry);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetLadderStream");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productId** | **String**| Product id for the requested ladder |
 **updateInterval** | **String**| Time between each patch for the ladder | [default to FIFTY_MS_LADDER] [enum: FIFTY_MS_LADDER, TWO_HUNDRED_FIFTY_MS_LADDER, FIVE_HUNDRED_MS_LADDER]
 **aggregation** | **String**| Aggregation amount for the requested ladder |
 **feeAdjust** | **Boolean**| True if the requested ladder is fee adjust |
 **orderAmount** | **String**| (Deprecated) Order amount for the requested ladder | [optional]
 **geolocationLocality** | **String**|  | [optional]
 **geolocationCountry** | **String**|  | [optional]

### Return type

[**StreamResultOfCoinbaseBrokerageProxyTradingApiGetLadderStreamResponse**](StreamResultOfCoinbaseBrokerageProxyTradingApiGetLadderStreamResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetLatestTestTransaction"></a>
# **primeAPIGetLatestTestTransaction**
> CoinbaseEngPrimeApiApiGetLatestTestTransactionResponse primeAPIGetLatestTestTransaction(portfolioId, body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String portfolioId = "portfolioId_example"; // String | 
CoinbaseEngPrimeApiApiGetLatestTestTransactionRequest body = new CoinbaseEngPrimeApiApiGetLatestTestTransactionRequest(); // CoinbaseEngPrimeApiApiGetLatestTestTransactionRequest | 
try {
    CoinbaseEngPrimeApiApiGetLatestTestTransactionResponse result = apiInstance.primeAPIGetLatestTestTransaction(portfolioId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetLatestTestTransaction");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**|  |
 **body** | [**CoinbaseEngPrimeApiApiGetLatestTestTransactionRequest**](CoinbaseEngPrimeApiApiGetLatestTestTransactionRequest.md)|  |

### Return type

[**CoinbaseEngPrimeApiApiGetLatestTestTransactionResponse**](CoinbaseEngPrimeApiApiGetLatestTestTransactionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetLlCRollout"></a>
# **primeAPIGetLlCRollout**
> CoinbaseEngPrimeApiApiLlcRolloutResponse primeAPIGetLlCRollout()



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
try {
    CoinbaseEngPrimeApiApiLlcRolloutResponse result = apiInstance.primeAPIGetLlCRollout();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetLlCRollout");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CoinbaseEngPrimeApiApiLlcRolloutResponse**](CoinbaseEngPrimeApiApiLlcRolloutResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetLocateAssets"></a>
# **primeAPIGetLocateAssets**
> CoinbaseFinancingGetLocateAssetsResponse primeAPIGetLocateAssets(entityId, date)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String entityId = "entityId_example"; // String | 
OffsetDateTime date = new OffsetDateTime(); // OffsetDateTime | 
try {
    CoinbaseFinancingGetLocateAssetsResponse result = apiInstance.primeAPIGetLocateAssets(entityId, date);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetLocateAssets");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **entityId** | **String**|  |
 **date** | **OffsetDateTime**|  | [optional]

### Return type

[**CoinbaseFinancingGetLocateAssetsResponse**](CoinbaseFinancingGetLocateAssetsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetMarketTradesStream"></a>
# **primeAPIGetMarketTradesStream**
> StreamResultOfCoinbaseBrokerageProxyTradingApiGetMarketTradesStreamResponse primeAPIGetMarketTradesStream(productId, limit, updateInterval, venueFilters, sideFilter, orderByField, sortDirection)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String productId = "productId_example"; // String | The trading pair, i.e. 'BTC-USD'
Integer limit = 56; // Integer | Number of trades to return.
String updateInterval = "HUNDRED_MS_MARKET_TRADES"; // String | Time between each patch for the market trades
List<String> venueFilters = Arrays.asList("venueFilters_example"); // List<String> | List of Venue filters to apply on trades
String sideFilter = "ALL_ORDERS"; // String | Side filters to apply on trades
String orderByField = "PRICE"; // String | The field the data can be ordered by (e.g. price)
String sortDirection = "ASC"; // String | The direction the data will be ordered by (e.g. ASC | DSC)
try {
    StreamResultOfCoinbaseBrokerageProxyTradingApiGetMarketTradesStreamResponse result = apiInstance.primeAPIGetMarketTradesStream(productId, limit, updateInterval, venueFilters, sideFilter, orderByField, sortDirection);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetMarketTradesStream");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productId** | **String**| The trading pair, i.e. &#39;BTC-USD&#39; |
 **limit** | **Integer**| Number of trades to return. |
 **updateInterval** | **String**| Time between each patch for the market trades | [default to HUNDRED_MS_MARKET_TRADES] [enum: HUNDRED_MS_MARKET_TRADES, TWO_HUNDRED_FIFTY_MS_MARKET_TRADES]
 **venueFilters** | [**List&lt;String&gt;**](String.md)| List of Venue filters to apply on trades | [optional] [enum: COINBASE, BITSTAMP, LMAX, KRAKEN, FTX, NEPTUNE]
 **sideFilter** | **String**| Side filters to apply on trades | [optional] [default to ALL_ORDERS] [enum: ALL_ORDERS, BUY_ORDERS, SELL_ORDERS]
 **orderByField** | **String**| The field the data can be ordered by (e.g. price) | [optional] [default to PRICE] [enum: PRICE, AMOUNT, TIME, EXCHANGE]
 **sortDirection** | **String**| The direction the data will be ordered by (e.g. ASC | DSC) | [optional] [default to ASC] [enum: ASC, DESC]

### Return type

[**StreamResultOfCoinbaseBrokerageProxyTradingApiGetMarketTradesStreamResponse**](StreamResultOfCoinbaseBrokerageProxyTradingApiGetMarketTradesStreamResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetNotificationPreferencesForChannel"></a>
# **primeAPIGetNotificationPreferencesForChannel**
> CoinbaseEngPrimeApiApiGetUserPreferencesForChannelResponse primeAPIGetNotificationPreferencesForChannel(userId, channel)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String userId = "userId_example"; // String | 
String channel = "CHANNEL_UNSPECIFIED"; // String | 
try {
    CoinbaseEngPrimeApiApiGetUserPreferencesForChannelResponse result = apiInstance.primeAPIGetNotificationPreferencesForChannel(userId, channel);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetNotificationPreferencesForChannel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**|  |
 **channel** | **String**|  | [optional] [default to CHANNEL_UNSPECIFIED] [enum: CHANNEL_UNSPECIFIED, CHANNEL_EMAIL, CHANNEL_PUSH, CHANNEL_IN_APP, CHANNEL_SMS]

### Return type

[**CoinbaseEngPrimeApiApiGetUserPreferencesForChannelResponse**](CoinbaseEngPrimeApiApiGetUserPreferencesForChannelResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetNotifications"></a>
# **primeAPIGetNotifications**
> CoinbaseCustodyApiGetNotificationsResponse primeAPIGetNotifications(organizationId, type)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String organizationId = "organizationId_example"; // String | 
String type = "type_example"; // String | 
try {
    CoinbaseCustodyApiGetNotificationsResponse result = apiInstance.primeAPIGetNotifications(organizationId, type);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetNotifications");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**|  | [optional]
 **type** | **String**|  | [optional]

### Return type

[**CoinbaseCustodyApiGetNotificationsResponse**](CoinbaseCustodyApiGetNotificationsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetOrder"></a>
# **primeAPIGetOrder**
> CoinbaseBrokerageProxyCommonOrder primeAPIGetOrder(orderId, portfolioId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String orderId = "orderId_example"; // String | 
String portfolioId = "portfolioId_example"; // String | 
try {
    CoinbaseBrokerageProxyCommonOrder result = apiInstance.primeAPIGetOrder(orderId, portfolioId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **String**|  |
 **portfolioId** | **String**|  | [optional]

### Return type

[**CoinbaseBrokerageProxyCommonOrder**](CoinbaseBrokerageProxyCommonOrder.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetOrderSimulationStream"></a>
# **primeAPIGetOrderSimulationStream**
> StreamResultOfCoinbaseBrokerageProxyTradingApiGetOrderSimulationResponse primeAPIGetOrderSimulationStream(productId, updateInterval, orderAmount, feeAdjust)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String productId = "productId_example"; // String | Product id for the requested ladder
String updateInterval = "FIFTY_MS_LADDER"; // String | Time between each patch for the order simulation
String orderAmount = "orderAmount_example"; // String | Order amount for the requested ladder
Boolean feeAdjust = true; // Boolean | True if the requested ladder is fee adjust
try {
    StreamResultOfCoinbaseBrokerageProxyTradingApiGetOrderSimulationResponse result = apiInstance.primeAPIGetOrderSimulationStream(productId, updateInterval, orderAmount, feeAdjust);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetOrderSimulationStream");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productId** | **String**| Product id for the requested ladder |
 **updateInterval** | **String**| Time between each patch for the order simulation | [default to FIFTY_MS_LADDER] [enum: FIFTY_MS_LADDER, TWO_HUNDRED_FIFTY_MS_LADDER, FIVE_HUNDRED_MS_LADDER]
 **orderAmount** | **String**| Order amount for the requested ladder |
 **feeAdjust** | **Boolean**| True if the requested ladder is fee adjust |

### Return type

[**StreamResultOfCoinbaseBrokerageProxyTradingApiGetOrderSimulationResponse**](StreamResultOfCoinbaseBrokerageProxyTradingApiGetOrderSimulationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetOrdersStream"></a>
# **primeAPIGetOrdersStream**
> StreamResultOfCoinbaseBrokerageProxyTradingApiOrderStreamResponse primeAPIGetOrdersStream(updateInterval, productId, status, userId, portfolioId, productType, orderPlacementSources, riskManagementType, contractExpiryType, orderPlacementFilterApplyNotFilter, orderPlacementFilterOrderPlacementSources)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String updateInterval = "TWO_HUNDRED_FIFTY_MS_ORDERS"; // String | Time between each patch for the current orders stream
String productId = "productId_example"; // String | The trading pair, i.e. 'BTC-USD'
String status = "UNKNOWN_ORDER_EXECUTION_STATUS"; // String | The status of the order, i.e. 'filled', 'open'
String userId = "userId_example"; // String | The uuid of the user who created the order
String portfolioId = "portfolioId_example"; // String | Optionally specify a portfolio id. Only orders from this portfolio will be returned in the stream.
String productType = "UNKNOWN_PRODUCT_TYPE"; // String | Optionally specify a product type to filter by, i.e. 'FUTURE', 'SPOT'
List<String> orderPlacementSources = Arrays.asList("orderPlacementSources_example"); // List<String> | Optionally specify N order placement source to filter by, i.e. 'RETAIL_WEB_CLIENT', 'RETAIL_SIMPLE'
String riskManagementType = "UNKNOWN_RISK_MANAGEMENT_TYPE"; // String | Optionally specify a risk management type to filter by, i.e. 'MANAGED_BY_FCM', 'MANAGED_BY_VENUE'
String contractExpiryType = "UNKNOWN_CONTRACT_EXPIRY_TYPE"; // String | Optionally specify a contract expiry type to filter by, i.e. 'EXPIRING', 'PERPETUAL'
Boolean orderPlacementFilterApplyNotFilter = true; // Boolean | 
List<String> orderPlacementFilterOrderPlacementSources = Arrays.asList("orderPlacementFilterOrderPlacementSources_example"); // List<String> | 
try {
    StreamResultOfCoinbaseBrokerageProxyTradingApiOrderStreamResponse result = apiInstance.primeAPIGetOrdersStream(updateInterval, productId, status, userId, portfolioId, productType, orderPlacementSources, riskManagementType, contractExpiryType, orderPlacementFilterApplyNotFilter, orderPlacementFilterOrderPlacementSources);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetOrdersStream");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **updateInterval** | **String**| Time between each patch for the current orders stream | [default to TWO_HUNDRED_FIFTY_MS_ORDERS] [enum: TWO_HUNDRED_FIFTY_MS_ORDERS]
 **productId** | **String**| The trading pair, i.e. &#39;BTC-USD&#39; | [optional]
 **status** | **String**| The status of the order, i.e. &#39;filled&#39;, &#39;open&#39; | [optional] [default to UNKNOWN_ORDER_EXECUTION_STATUS] [enum: UNKNOWN_ORDER_EXECUTION_STATUS, PENDING, OPEN, FILLED, CANCELLED, EXPIRED, FAILED]
 **userId** | **String**| The uuid of the user who created the order | [optional]
 **portfolioId** | **String**| Optionally specify a portfolio id. Only orders from this portfolio will be returned in the stream. | [optional]
 **productType** | **String**| Optionally specify a product type to filter by, i.e. &#39;FUTURE&#39;, &#39;SPOT&#39; | [optional] [default to UNKNOWN_PRODUCT_TYPE] [enum: UNKNOWN_PRODUCT_TYPE, SPOT, FUTURE]
 **orderPlacementSources** | [**List&lt;String&gt;**](String.md)| Optionally specify N order placement source to filter by, i.e. &#39;RETAIL_WEB_CLIENT&#39;, &#39;RETAIL_SIMPLE&#39; | [optional] [enum: UNKNOWN_PLACEMENT_SOURCE, RETAIL_PUBLIC_API, RETAIL_WEB_CLIENT, RETAIL_MOBILE_WEB_CLIENT, RETAIL_IOS_CLIENT, RETAIL_ANDROID_CLIENT, RETAIL_SIMPLE, RETAIL_PUBLIC_API_OAUTH2, RETAIL_ADVANCED_UNKNOWN, RETAIL_LIQUIDATION, RETAIL_PUBLIC_API_CLOUD, FIX, PRIME_INTERNAL_API, PRIME_PUBLIC_API, PRIME_UNKNOWN, NEITHER_PRIME_RETAIL]
 **riskManagementType** | **String**| Optionally specify a risk management type to filter by, i.e. &#39;MANAGED_BY_FCM&#39;, &#39;MANAGED_BY_VENUE&#39; | [optional] [default to UNKNOWN_RISK_MANAGEMENT_TYPE] [enum: UNKNOWN_RISK_MANAGEMENT_TYPE, MANAGED_BY_FCM, MANAGED_BY_VENUE]
 **contractExpiryType** | **String**| Optionally specify a contract expiry type to filter by, i.e. &#39;EXPIRING&#39;, &#39;PERPETUAL&#39; | [optional] [default to UNKNOWN_CONTRACT_EXPIRY_TYPE] [enum: UNKNOWN_CONTRACT_EXPIRY_TYPE, EXPIRING, PERPETUAL]
 **orderPlacementFilterApplyNotFilter** | **Boolean**|  | [optional]
 **orderPlacementFilterOrderPlacementSources** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: UNKNOWN_PLACEMENT_SOURCE, RETAIL_PUBLIC_API, RETAIL_WEB_CLIENT, RETAIL_MOBILE_WEB_CLIENT, RETAIL_IOS_CLIENT, RETAIL_ANDROID_CLIENT, RETAIL_SIMPLE, RETAIL_PUBLIC_API_OAUTH2, RETAIL_ADVANCED_UNKNOWN, RETAIL_LIQUIDATION, RETAIL_PUBLIC_API_CLOUD, FIX, PRIME_INTERNAL_API, PRIME_PUBLIC_API, PRIME_UNKNOWN, NEITHER_PRIME_RETAIL]

### Return type

[**StreamResultOfCoinbaseBrokerageProxyTradingApiOrderStreamResponse**](StreamResultOfCoinbaseBrokerageProxyTradingApiOrderStreamResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetOrganization"></a>
# **primeAPIGetOrganization**
> CoinbaseEngPrimeApiApiGetOrganizationResponse primeAPIGetOrganization(vehicleId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String vehicleId = "vehicleId_example"; // String | 
try {
    CoinbaseEngPrimeApiApiGetOrganizationResponse result = apiInstance.primeAPIGetOrganization(vehicleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetOrganization");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vehicleId** | **String**|  |

### Return type

[**CoinbaseEngPrimeApiApiGetOrganizationResponse**](CoinbaseEngPrimeApiApiGetOrganizationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetPendingConsensus"></a>
# **primeAPIGetPendingConsensus**
> CoinbaseEngPrimeApiApiGetPendingConsensusResponse primeAPIGetPendingConsensus(userId, entityId, referenceType)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String userId = "userId_example"; // String | 
String entityId = "entityId_example"; // String | 
String referenceType = "REFERENCE_TYPE_INVITATION"; // String | 
try {
    CoinbaseEngPrimeApiApiGetPendingConsensusResponse result = apiInstance.primeAPIGetPendingConsensus(userId, entityId, referenceType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetPendingConsensus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**|  |
 **entityId** | **String**|  |
 **referenceType** | **String**|  | [optional] [default to REFERENCE_TYPE_INVITATION] [enum: REFERENCE_TYPE_INVITATION, REFERENCE_TYPE_USER_CHANGE, REFERENCE_TYPE_USER_CHANGES]

### Return type

[**CoinbaseEngPrimeApiApiGetPendingConsensusResponse**](CoinbaseEngPrimeApiApiGetPendingConsensusResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetPortfolio"></a>
# **primeAPIGetPortfolio**
> CoinbaseEngPrimeApiApiPortfolio primeAPIGetPortfolio(portfolioId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String portfolioId = "portfolioId_example"; // String | Filter results by a specific profile_id
try {
    CoinbaseEngPrimeApiApiPortfolio result = apiInstance.primeAPIGetPortfolio(portfolioId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetPortfolio");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**| Filter results by a specific profile_id |

### Return type

[**CoinbaseEngPrimeApiApiPortfolio**](CoinbaseEngPrimeApiApiPortfolio.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetPortfolioActivities"></a>
# **primeAPIGetPortfolioActivities**
> CoinbaseEngPrimeApiApiGetPortfolioActivitiesResponse primeAPIGetPortfolioActivities(portfolioId, states, currencies, type, startDate, endDate, search, cursor, limit, sortDirection)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String portfolioId = "portfolioId_example"; // String | Portfolio to retrieve activities for.
List<String> states = Arrays.asList("states_example"); // List<String> | States to filter by.
List<String> currencies = Arrays.asList("currencies_example"); // List<String> | Currencies to filter by.
String type = "ACTIVITY_TYPE_UNKNOWN"; // String | Types to filter by.   - ACTIVITY_TYPE_WITHDRAWAL: PrimeActivityService Custody ActivityTypes that will replace the above
String startDate = "startDate_example"; // String | Start date to filter activities by in YYYY-MM-DD format. Requires end_date to be specified if start_date provided. 
String endDate = "endDate_example"; // String | End date to filter activities by in YYYY-MM-DD format. Requires start_date to be specified if end_date provided. 
String search = "search_example"; // String | Query string to search titles and descriptions for.
String cursor = "cursor_example"; // String | Activity id to retrieve additional results strictly after.
Integer limit = 56; // Integer | Number of activities to retrieve
String sortDirection = "DESC"; // String | Sorting order of activities
try {
    CoinbaseEngPrimeApiApiGetPortfolioActivitiesResponse result = apiInstance.primeAPIGetPortfolioActivities(portfolioId, states, currencies, type, startDate, endDate, search, cursor, limit, sortDirection);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetPortfolioActivities");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**| Portfolio to retrieve activities for. |
 **states** | [**List&lt;String&gt;**](String.md)| States to filter by. | [optional] [enum: ACTIVITY_STATE_UNKNOWN, ACTIVITY_STATE_SETTLED, ACTIVITY_STATE_CREATED, ACTIVITY_STATE_EXPIRED, ACTIVITY_STATE_REJECTED]
 **currencies** | [**List&lt;String&gt;**](String.md)| Currencies to filter by. | [optional]
 **type** | **String**| Types to filter by.   - ACTIVITY_TYPE_WITHDRAWAL: PrimeActivityService Custody ActivityTypes that will replace the above | [optional] [default to ACTIVITY_TYPE_UNKNOWN] [enum: ACTIVITY_TYPE_UNKNOWN, ACTIVITY_TYPE_GOVERNANCE_VOTE, ACTIVITY_TYPE_INVITATION, ACTIVITY_TYPE_WALLET_CHANGE, ACTIVITY_TYPE_API_KEY_CHANGE, ACTIVITY_TYPE_SETTINGS_CHANGE, ACTIVITY_TYPE_BILLING_PREFERENCE_CHANGE, ACTIVITY_TYPE_PAYMENT_METHOD_CHANGE, ACTIVITY_TYPE_WITHDRAWAL, ACTIVITY_TYPE_DEPOSIT, ACTIVITY_TYPE_CREATE_WALLET, ACTIVITY_TYPE_REMOVE_WALLET, ACTIVITY_TYPE_UPDATE_WALLET, ACTIVITY_TYPE_CAST_VOTE, ACTIVITY_TYPE_ENABLE_VOTING, ACTIVITY_TYPE_STAKE, ACTIVITY_TYPE_UNSTAKE, ACTIVITY_TYPE_CHANGE_VALIDATOR, ACTIVITY_TYPE_RESTAKE, ACTIVITY_TYPE_ADDRESS_BOOK, ACTIVITY_TYPE_TEAM_MEMBERS, ACTIVITY_TYPE_BILLING, ACTIVITY_TYPE_SECURITY, ACTIVITY_TYPE_API, ACTIVITY_TYPE_SETTINGS, ACTIVITY_TYPE_SMART_CONTRACT, ACTIVITY_TYPE_USER_CHANGE_REQUEST_NO_PAS, ACTIVITY_TYPE_WEB3_TRANSACTION, ACTIVITY_TYPE_WEB3_MESSAGE]
 **startDate** | **String**| Start date to filter activities by in YYYY-MM-DD format. Requires end_date to be specified if start_date provided.  | [optional]
 **endDate** | **String**| End date to filter activities by in YYYY-MM-DD format. Requires start_date to be specified if end_date provided.  | [optional]
 **search** | **String**| Query string to search titles and descriptions for. | [optional]
 **cursor** | **String**| Activity id to retrieve additional results strictly after. | [optional]
 **limit** | **Integer**| Number of activities to retrieve | [optional]
 **sortDirection** | **String**| Sorting order of activities | [optional] [default to DESC] [enum: DESC, ASC]

### Return type

[**CoinbaseEngPrimeApiApiGetPortfolioActivitiesResponse**](CoinbaseEngPrimeApiApiGetPortfolioActivitiesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetPortfolioActivitiesStream"></a>
# **primeAPIGetPortfolioActivitiesStream**
> StreamResultOfCoinbaseEngPrimeApiApiGetPortfolioActivitiesStreamResponse primeAPIGetPortfolioActivitiesStream(portfolioId, states, currencies, type, startDate, endDate, search, cursor, limit, sortDirection)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String portfolioId = "portfolioId_example"; // String | Portfolio to retrieve activities for.
List<String> states = Arrays.asList("states_example"); // List<String> | States to filter by.
List<String> currencies = Arrays.asList("currencies_example"); // List<String> | Currencies to filter by.
String type = "ACTIVITY_TYPE_UNKNOWN"; // String | Types to filter by.   - ACTIVITY_TYPE_WITHDRAWAL: PrimeActivityService Custody ActivityTypes that will replace the above
String startDate = "startDate_example"; // String | Start date to filter activities by in YYYY-MM-DD format. Requires end_date to be specified if start_date provided. 
String endDate = "endDate_example"; // String | End date to filter activities by in YYYY-MM-DD format. Requires start_date to be specified if end_date provided. 
String search = "search_example"; // String | Query string to search titles and descriptions for.
String cursor = "cursor_example"; // String | Activity id to retrieve additional results strictly after.
Integer limit = 56; // Integer | Number of activities to retrieve
String sortDirection = "DESC"; // String | Sorting order of activities
try {
    StreamResultOfCoinbaseEngPrimeApiApiGetPortfolioActivitiesStreamResponse result = apiInstance.primeAPIGetPortfolioActivitiesStream(portfolioId, states, currencies, type, startDate, endDate, search, cursor, limit, sortDirection);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetPortfolioActivitiesStream");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**| Portfolio to retrieve activities for. |
 **states** | [**List&lt;String&gt;**](String.md)| States to filter by. | [optional] [enum: ACTIVITY_STATE_UNKNOWN, ACTIVITY_STATE_SETTLED, ACTIVITY_STATE_CREATED, ACTIVITY_STATE_EXPIRED, ACTIVITY_STATE_REJECTED]
 **currencies** | [**List&lt;String&gt;**](String.md)| Currencies to filter by. | [optional]
 **type** | **String**| Types to filter by.   - ACTIVITY_TYPE_WITHDRAWAL: PrimeActivityService Custody ActivityTypes that will replace the above | [optional] [default to ACTIVITY_TYPE_UNKNOWN] [enum: ACTIVITY_TYPE_UNKNOWN, ACTIVITY_TYPE_GOVERNANCE_VOTE, ACTIVITY_TYPE_INVITATION, ACTIVITY_TYPE_WALLET_CHANGE, ACTIVITY_TYPE_API_KEY_CHANGE, ACTIVITY_TYPE_SETTINGS_CHANGE, ACTIVITY_TYPE_BILLING_PREFERENCE_CHANGE, ACTIVITY_TYPE_PAYMENT_METHOD_CHANGE, ACTIVITY_TYPE_WITHDRAWAL, ACTIVITY_TYPE_DEPOSIT, ACTIVITY_TYPE_CREATE_WALLET, ACTIVITY_TYPE_REMOVE_WALLET, ACTIVITY_TYPE_UPDATE_WALLET, ACTIVITY_TYPE_CAST_VOTE, ACTIVITY_TYPE_ENABLE_VOTING, ACTIVITY_TYPE_STAKE, ACTIVITY_TYPE_UNSTAKE, ACTIVITY_TYPE_CHANGE_VALIDATOR, ACTIVITY_TYPE_RESTAKE, ACTIVITY_TYPE_ADDRESS_BOOK, ACTIVITY_TYPE_TEAM_MEMBERS, ACTIVITY_TYPE_BILLING, ACTIVITY_TYPE_SECURITY, ACTIVITY_TYPE_API, ACTIVITY_TYPE_SETTINGS, ACTIVITY_TYPE_SMART_CONTRACT, ACTIVITY_TYPE_USER_CHANGE_REQUEST_NO_PAS, ACTIVITY_TYPE_WEB3_TRANSACTION, ACTIVITY_TYPE_WEB3_MESSAGE]
 **startDate** | **String**| Start date to filter activities by in YYYY-MM-DD format. Requires end_date to be specified if start_date provided.  | [optional]
 **endDate** | **String**| End date to filter activities by in YYYY-MM-DD format. Requires start_date to be specified if end_date provided.  | [optional]
 **search** | **String**| Query string to search titles and descriptions for. | [optional]
 **cursor** | **String**| Activity id to retrieve additional results strictly after. | [optional]
 **limit** | **Integer**| Number of activities to retrieve | [optional]
 **sortDirection** | **String**| Sorting order of activities | [optional] [default to DESC] [enum: DESC, ASC]

### Return type

[**StreamResultOfCoinbaseEngPrimeApiApiGetPortfolioActivitiesStreamResponse**](StreamResultOfCoinbaseEngPrimeApiApiGetPortfolioActivitiesStreamResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetPortfolioActivity"></a>
# **primeAPIGetPortfolioActivity**
> CoinbaseCustodyApiActivity primeAPIGetPortfolioActivity(portfolioId, activityId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String portfolioId = "portfolioId_example"; // String | 
String activityId = "activityId_example"; // String | 
try {
    CoinbaseCustodyApiActivity result = apiInstance.primeAPIGetPortfolioActivity(portfolioId, activityId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetPortfolioActivity");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**|  |
 **activityId** | **String**|  |

### Return type

[**CoinbaseCustodyApiActivity**](CoinbaseCustodyApiActivity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetPortfolioActivityStream"></a>
# **primeAPIGetPortfolioActivityStream**
> StreamResultOfCoinbaseEngPrimeApiApiGetPortfolioActivityStreamResponse primeAPIGetPortfolioActivityStream(portfolioId, activityId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String portfolioId = "portfolioId_example"; // String | 
String activityId = "activityId_example"; // String | 
try {
    StreamResultOfCoinbaseEngPrimeApiApiGetPortfolioActivityStreamResponse result = apiInstance.primeAPIGetPortfolioActivityStream(portfolioId, activityId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetPortfolioActivityStream");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**|  |
 **activityId** | **String**|  |

### Return type

[**StreamResultOfCoinbaseEngPrimeApiApiGetPortfolioActivityStreamResponse**](StreamResultOfCoinbaseEngPrimeApiApiGetPortfolioActivityStreamResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetPortfolioBalances"></a>
# **primeAPIGetPortfolioBalances**
> CoinbaseCustodyApiGetBalanceResponse primeAPIGetPortfolioBalances(portfolioId, currencySymbol)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String portfolioId = "portfolioId_example"; // String | The ID of the portfolio to get balances for
String currencySymbol = "currencySymbol_example"; // String | Optional filter for symbol of the currency to get balances for
try {
    CoinbaseCustodyApiGetBalanceResponse result = apiInstance.primeAPIGetPortfolioBalances(portfolioId, currencySymbol);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetPortfolioBalances");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**| The ID of the portfolio to get balances for |
 **currencySymbol** | **String**| Optional filter for symbol of the currency to get balances for | [optional]

### Return type

[**CoinbaseCustodyApiGetBalanceResponse**](CoinbaseCustodyApiGetBalanceResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetPortfolioBalancesStream"></a>
# **primeAPIGetPortfolioBalancesStream**
> StreamResultOfCoinbaseEngPrimeApiApiGetBalancesStreamResponse primeAPIGetPortfolioBalancesStream(portfolioId, currencySymbol)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String portfolioId = "portfolioId_example"; // String | The ID of the portfolio to get balances for
String currencySymbol = "currencySymbol_example"; // String | Optional filter for symbol of the currency to get balances for
try {
    StreamResultOfCoinbaseEngPrimeApiApiGetBalancesStreamResponse result = apiInstance.primeAPIGetPortfolioBalancesStream(portfolioId, currencySymbol);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetPortfolioBalancesStream");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**| The ID of the portfolio to get balances for |
 **currencySymbol** | **String**| Optional filter for symbol of the currency to get balances for | [optional]

### Return type

[**StreamResultOfCoinbaseEngPrimeApiApiGetBalancesStreamResponse**](StreamResultOfCoinbaseEngPrimeApiApiGetBalancesStreamResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetPortfolioCommission"></a>
# **primeAPIGetPortfolioCommission**
> CoinbaseEngPrimeApiApiGetPortfolioCommissionResponse primeAPIGetPortfolioCommission(portfolioId, productId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String portfolioId = "portfolioId_example"; // String | 
String productId = "productId_example"; // String | 
try {
    CoinbaseEngPrimeApiApiGetPortfolioCommissionResponse result = apiInstance.primeAPIGetPortfolioCommission(portfolioId, productId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetPortfolioCommission");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**|  |
 **productId** | **String**|  | [optional]

### Return type

[**CoinbaseEngPrimeApiApiGetPortfolioCommissionResponse**](CoinbaseEngPrimeApiApiGetPortfolioCommissionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetPortfolioConciseUsers"></a>
# **primeAPIGetPortfolioConciseUsers**
> CoinbaseEngPrimeApiApiListPortfolioConciseUsersResponse primeAPIGetPortfolioConciseUsers(portfolioId, cursor, limit, sortDirection, search, roles, secondaryRoles)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String portfolioId = "portfolioId_example"; // String | The portfolio ID
String cursor = "cursor_example"; // String | Id to retrieve additional results strictly after.
Integer limit = 56; // Integer | Number of users to retrieve
String sortDirection = "DESC"; // String | Sorting order
String search = "search_example"; // String | Search query to match user name
List<String> roles = Arrays.asList("roles_example"); // List<String> | Users with these roles (or provided secondary roles) to include in response
List<String> secondaryRoles = Arrays.asList("secondaryRoles_example"); // List<String> | Users with these secondary roles (or provided roles) to include in response
try {
    CoinbaseEngPrimeApiApiListPortfolioConciseUsersResponse result = apiInstance.primeAPIGetPortfolioConciseUsers(portfolioId, cursor, limit, sortDirection, search, roles, secondaryRoles);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetPortfolioConciseUsers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**| The portfolio ID |
 **cursor** | **String**| Id to retrieve additional results strictly after. | [optional]
 **limit** | **Integer**| Number of users to retrieve | [optional]
 **sortDirection** | **String**| Sorting order | [optional] [default to DESC] [enum: DESC, ASC]
 **search** | **String**| Search query to match user name | [optional]
 **roles** | [**List&lt;String&gt;**](String.md)| Users with these roles (or provided secondary roles) to include in response | [optional] [enum: ROLE_UNKNOWN, ROLE_AUTHORIZED_SIGNATORY, ROLE_INITIATOR, ROLE_APPROVER, ROLE_AUDITOR, ROLE_ADMINISTRATOR, ROLE_TRADER, ROLE_INTERNAL_TRADER, ROLE_TEAM_MANAGER, ROLE_FULL_TRADER, ROLE_INTERNAL_AUDITOR]
 **secondaryRoles** | [**List&lt;String&gt;**](String.md)| Users with these secondary roles (or provided roles) to include in response | [optional] [enum: SECONDARY_ROLE_UNKNOWN, SECONDARY_ROLE_VIDEO_APPROVER, SECONDARY_ROLE_TEAM_APPROVER, SECONDARY_ROLE_WEB3_SIGNER]

### Return type

[**CoinbaseEngPrimeApiApiListPortfolioConciseUsersResponse**](CoinbaseEngPrimeApiApiListPortfolioConciseUsersResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetPortfolioFeeInfo"></a>
# **primeAPIGetPortfolioFeeInfo**
> CoinbaseEngPrimeFeesApiGetFeeInfoResponse primeAPIGetPortfolioFeeInfo(portfolioId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String portfolioId = "portfolioId_example"; // String | 
try {
    CoinbaseEngPrimeFeesApiGetFeeInfoResponse result = apiInstance.primeAPIGetPortfolioFeeInfo(portfolioId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetPortfolioFeeInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**|  |

### Return type

[**CoinbaseEngPrimeFeesApiGetFeeInfoResponse**](CoinbaseEngPrimeFeesApiGetFeeInfoResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetPortfolioFinancingProductPermissions"></a>
# **primeAPIGetPortfolioFinancingProductPermissions**
> CoinbaseFinancingPortfolioOverviewResponse primeAPIGetPortfolioFinancingProductPermissions(portfolioId, portfolioIds)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String portfolioId = "portfolioId_example"; // String | 
List<String> portfolioIds = Arrays.asList("portfolioIds_example"); // List<String> | 
try {
    CoinbaseFinancingPortfolioOverviewResponse result = apiInstance.primeAPIGetPortfolioFinancingProductPermissions(portfolioId, portfolioIds);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetPortfolioFinancingProductPermissions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**|  |
 **portfolioIds** | [**List&lt;String&gt;**](String.md)|  | [optional]

### Return type

[**CoinbaseFinancingPortfolioOverviewResponse**](CoinbaseFinancingPortfolioOverviewResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetPortfolioFinancingProductStream"></a>
# **primeAPIGetPortfolioFinancingProductStream**
> StreamResultOfCoinbaseEngPrimeApiApiPortfolioFinancingProductStreamResponse primeAPIGetPortfolioFinancingProductStream(portfolioId, productId, updateInterval)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String portfolioId = "portfolioId_example"; // String | 
String productId = "productId_example"; // String | 
String updateInterval = "TWO_HUNDRED_FIFTY_MS_FINANCING"; // String | 
try {
    StreamResultOfCoinbaseEngPrimeApiApiPortfolioFinancingProductStreamResponse result = apiInstance.primeAPIGetPortfolioFinancingProductStream(portfolioId, productId, updateInterval);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetPortfolioFinancingProductStream");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**|  |
 **productId** | **String**|  |
 **updateInterval** | **String**|  | [optional] [default to TWO_HUNDRED_FIFTY_MS_FINANCING] [enum: TWO_HUNDRED_FIFTY_MS_FINANCING]

### Return type

[**StreamResultOfCoinbaseEngPrimeApiApiPortfolioFinancingProductStreamResponse**](StreamResultOfCoinbaseEngPrimeApiApiPortfolioFinancingProductStreamResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetPortfolioFinancingStream"></a>
# **primeAPIGetPortfolioFinancingStream**
> StreamResultOfCoinbaseEngPrimeApiApiPortfolioFinancingStreamResponse primeAPIGetPortfolioFinancingStream(portfolioId, updateInterval)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String portfolioId = "portfolioId_example"; // String | 
String updateInterval = "TWO_HUNDRED_FIFTY_MS_FINANCING"; // String | Amount of time in ms between updates
try {
    StreamResultOfCoinbaseEngPrimeApiApiPortfolioFinancingStreamResponse result = apiInstance.primeAPIGetPortfolioFinancingStream(portfolioId, updateInterval);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetPortfolioFinancingStream");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**|  |
 **updateInterval** | **String**| Amount of time in ms between updates | [default to TWO_HUNDRED_FIFTY_MS_FINANCING] [enum: TWO_HUNDRED_FIFTY_MS_FINANCING]

### Return type

[**StreamResultOfCoinbaseEngPrimeApiApiPortfolioFinancingStreamResponse**](StreamResultOfCoinbaseEngPrimeApiApiPortfolioFinancingStreamResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetPortfolioInvitations"></a>
# **primeAPIGetPortfolioInvitations**
> CoinbaseEngPrimeApiApiGetInvitationsResponse primeAPIGetPortfolioInvitations(portfolioId, states)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String portfolioId = "portfolioId_example"; // String | 
List<String> states = Arrays.asList("states_example"); // List<String> | 
try {
    CoinbaseEngPrimeApiApiGetInvitationsResponse result = apiInstance.primeAPIGetPortfolioInvitations(portfolioId, states);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetPortfolioInvitations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**|  |
 **states** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: INVITATION_STATE_UNKNOWN, INVITATION_STATE_CREATED, INVITATION_STATE_APPROVED, INVITATION_STATE_REJECTED, INVITATION_STATE_ACCEPTED, INVITATION_STATE_ADMIN_CREATED, INVITATION_STATE_EXPIRED, INVITATION_STATE_REQUESTED, INVITATION_STATE_USER_REJECTED]

### Return type

[**CoinbaseEngPrimeApiApiGetInvitationsResponse**](CoinbaseEngPrimeApiApiGetInvitationsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetPortfolioSettings"></a>
# **primeAPIGetPortfolioSettings**
> List&lt;CoinbaseCustodyApiSettings&gt; primeAPIGetPortfolioSettings(portfolioId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String portfolioId = "portfolioId_example"; // String | 
try {
    List<CoinbaseCustodyApiSettings> result = apiInstance.primeAPIGetPortfolioSettings(portfolioId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetPortfolioSettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**|  |

### Return type

[**List&lt;CoinbaseCustodyApiSettings&gt;**](CoinbaseCustodyApiSettings.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetPortfolioUsers"></a>
# **primeAPIGetPortfolioUsers**
> CoinbaseEngPrimeApiApiListPortfolioUsersResponse primeAPIGetPortfolioUsers(portfolioId, cursor, limit, sortDirection, search, permission, roles, secondaryRoles, restrictEntityUsers)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String portfolioId = "portfolioId_example"; // String | The portfolio ID
String cursor = "cursor_example"; // String | Id to retrieve additional results strictly after.
Integer limit = 56; // Integer | Number of users to retrieve
String sortDirection = "DESC"; // String | Sorting order
String search = "search_example"; // String | Search query to match user name
String permission = "PERMISSION_UNKNOWN"; // String | Permission to filter all users by
List<String> roles = Arrays.asList("roles_example"); // List<String> | Users with these roles (or provided secondary roles) to include in response
List<String> secondaryRoles = Arrays.asList("secondaryRoles_example"); // List<String> | Users with these secondary roles (or provided roles) to include in response
Boolean restrictEntityUsers = true; // Boolean | If set to true, will not return entity users as part of the response
try {
    CoinbaseEngPrimeApiApiListPortfolioUsersResponse result = apiInstance.primeAPIGetPortfolioUsers(portfolioId, cursor, limit, sortDirection, search, permission, roles, secondaryRoles, restrictEntityUsers);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetPortfolioUsers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**| The portfolio ID |
 **cursor** | **String**| Id to retrieve additional results strictly after. | [optional]
 **limit** | **Integer**| Number of users to retrieve | [optional]
 **sortDirection** | **String**| Sorting order | [optional] [default to DESC] [enum: DESC, ASC]
 **search** | **String**| Search query to match user name | [optional]
 **permission** | **String**| Permission to filter all users by | [optional] [default to PERMISSION_UNKNOWN] [enum: PERMISSION_UNKNOWN, PERMISSION_READ, PERMISSION_INITIATE, PERMISSION_REVIEW, PERMISSION_ADMIN, PERMISSION_TRADE, PERMISSION_VIDEO_APPROVE, PERMISSION_TEAM_APPROVE, PERMISSION_WEB3_SIGN]
 **roles** | [**List&lt;String&gt;**](String.md)| Users with these roles (or provided secondary roles) to include in response | [optional] [enum: ROLE_UNKNOWN, ROLE_AUTHORIZED_SIGNATORY, ROLE_INITIATOR, ROLE_APPROVER, ROLE_AUDITOR, ROLE_ADMINISTRATOR, ROLE_TRADER, ROLE_INTERNAL_TRADER, ROLE_TEAM_MANAGER, ROLE_FULL_TRADER, ROLE_INTERNAL_AUDITOR]
 **secondaryRoles** | [**List&lt;String&gt;**](String.md)| Users with these secondary roles (or provided roles) to include in response | [optional] [enum: SECONDARY_ROLE_UNKNOWN, SECONDARY_ROLE_VIDEO_APPROVER, SECONDARY_ROLE_TEAM_APPROVER, SECONDARY_ROLE_WEB3_SIGNER]
 **restrictEntityUsers** | **Boolean**| If set to true, will not return entity users as part of the response | [optional]

### Return type

[**CoinbaseEngPrimeApiApiListPortfolioUsersResponse**](CoinbaseEngPrimeApiApiListPortfolioUsersResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetPortfolioWalletsBalances"></a>
# **primeAPIGetPortfolioWalletsBalances**
> CoinbaseCustodyApiGetBalanceResponse primeAPIGetPortfolioWalletsBalances(portfolioId, currencySymbol)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String portfolioId = "portfolioId_example"; // String | The ID of the portfolio to get balances for
String currencySymbol = "currencySymbol_example"; // String | The filter for symbol of the currency to get balances for
try {
    CoinbaseCustodyApiGetBalanceResponse result = apiInstance.primeAPIGetPortfolioWalletsBalances(portfolioId, currencySymbol);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetPortfolioWalletsBalances");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**| The ID of the portfolio to get balances for |
 **currencySymbol** | **String**| The filter for symbol of the currency to get balances for |

### Return type

[**CoinbaseCustodyApiGetBalanceResponse**](CoinbaseCustodyApiGetBalanceResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetPortfolioWalletsBalancesStream"></a>
# **primeAPIGetPortfolioWalletsBalancesStream**
> StreamResultOfCoinbaseEngPrimeApiApiGetBalancesStreamResponse primeAPIGetPortfolioWalletsBalancesStream(portfolioId, currencySymbol)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String portfolioId = "portfolioId_example"; // String | The ID of the portfolio to get balances for
String currencySymbol = "currencySymbol_example"; // String | The filter for symbol of the currency to get balances for
try {
    StreamResultOfCoinbaseEngPrimeApiApiGetBalancesStreamResponse result = apiInstance.primeAPIGetPortfolioWalletsBalancesStream(portfolioId, currencySymbol);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetPortfolioWalletsBalancesStream");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**| The ID of the portfolio to get balances for |
 **currencySymbol** | **String**| The filter for symbol of the currency to get balances for |

### Return type

[**StreamResultOfCoinbaseEngPrimeApiApiGetBalancesStreamResponse**](StreamResultOfCoinbaseEngPrimeApiApiGetBalancesStreamResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetPortfoliosFinancingProductPermissions"></a>
# **primeAPIGetPortfoliosFinancingProductPermissions**
> CoinbaseFinancingPortfolioOverviewResponse primeAPIGetPortfoliosFinancingProductPermissions(vehicleId, portfolioIds)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String vehicleId = "vehicleId_example"; // String | 
List<String> portfolioIds = Arrays.asList("portfolioIds_example"); // List<String> | 
try {
    CoinbaseFinancingPortfolioOverviewResponse result = apiInstance.primeAPIGetPortfoliosFinancingProductPermissions(vehicleId, portfolioIds);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetPortfoliosFinancingProductPermissions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vehicleId** | **String**|  |
 **portfolioIds** | [**List&lt;String&gt;**](String.md)|  | [optional]

### Return type

[**CoinbaseFinancingPortfolioOverviewResponse**](CoinbaseFinancingPortfolioOverviewResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetPostTradeCredit"></a>
# **primeAPIGetPostTradeCredit**
> CoinbaseEngPrimeApiApiGetPostTradeCreditResponse primeAPIGetPostTradeCredit(portfolioId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String portfolioId = "portfolioId_example"; // String | Portfolio id for the financing request
try {
    CoinbaseEngPrimeApiApiGetPostTradeCreditResponse result = apiInstance.primeAPIGetPostTradeCredit(portfolioId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetPostTradeCredit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**| Portfolio id for the financing request |

### Return type

[**CoinbaseEngPrimeApiApiGetPostTradeCreditResponse**](CoinbaseEngPrimeApiApiGetPostTradeCreditResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetPreference"></a>
# **primeAPIGetPreference**
> CoinbaseEngPrimeApiApiGetPreferenceResponse primeAPIGetPreference(vehicleId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String vehicleId = "vehicleId_example"; // String | 
try {
    CoinbaseEngPrimeApiApiGetPreferenceResponse result = apiInstance.primeAPIGetPreference(vehicleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetPreference");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vehicleId** | **String**|  |

### Return type

[**CoinbaseEngPrimeApiApiGetPreferenceResponse**](CoinbaseEngPrimeApiApiGetPreferenceResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetPrimeActivities"></a>
# **primeAPIGetPrimeActivities**
> CoinbaseEngPrimeApiApiGetPrimeActivitiesResponse primeAPIGetPrimeActivities(portfolioId, organizationId, statuses, currencies, types, secondaryTypes, startDate, endDate, search, cursor, limit, categories, processingInFront, statusUpdatedAtStart, statusUpdatedAtEnd, sortDirection)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String portfolioId = "portfolioId_example"; // String | Portfolio to retrieve activities for.
String organizationId = "organizationId_example"; // String | Organization to retrieve activities for.
List<String> statuses = Arrays.asList("statuses_example"); // List<String> | ActivityStatuses to filter by.
List<String> currencies = Arrays.asList("currencies_example"); // List<String> | Currencies to filter by.
List<String> types = Arrays.asList("types_example"); // List<String> | ActivityTypes to filter by.   - ACTIVITY_TYPE_PRINCIPAL_OUT: Lending specific activity types  - ACTIVITY_TYPE_BLOCK_TRADE: Block trades  - ACTIVITY_TYPE_USER_CHANGE_REQUEST_NO_PAS: No pas integration for user change request  - ACTIVITY_TYPE_SHORT_COLLATERAL_TRANSFER_WITHDRAWAL: Short Collateral Transfer Types
List<String> secondaryTypes = Arrays.asList("secondaryTypes_example"); // List<String> | ActivitySecondaryTypes to filter by.   - ACTIVITY_SECONDARY_TYPE_UNSPECIFIED: Order & Allocation secondary types  - ACTIVITY_SECONDARY_TYPE_INTERNAL_TRANSFER: Transaction secondary types  - ACTIVITY_SECONDARY_TYPE_CB_LENDS: Lending secondary types  - ACTIVITY_SECONDARY_TYPE_INVITE_TEAM_MEMBER: User Invite secondary types  - ACTIVITY_SECONDARY_TYPE_WEB3_WALLET: Wallet Create secondary types  - ACTIVITY_SECONDARY_TYPE_WEB3_SIGNER: Web3 Signer role secondary type
String startDate = "startDate_example"; // String | Start date to filter activities by in RFC3339 Time format. Requires end_date to be specified if start_date provided. 
String endDate = "endDate_example"; // String | End date to filter activities by in RFC3339 Time format. Requires start_date to be specified if end_date provided. 
String search = "search_example"; // String | Query string to search titles and descriptions for.
String cursor = "cursor_example"; // String | Activity cursor to retrieve additional results strictly after.
Integer limit = 56; // Integer | Number of activities to retrieve
List<String> categories = Arrays.asList("categories_example"); // List<String> | ActivityCategories to filter by.
Boolean processingInFront = true; // Boolean | Whether sort processing activities in front
String statusUpdatedAtStart = "statusUpdatedAtStart_example"; // String | Beginning of the \"Status Update At\" to filter activities by in RFC3339 Time format.
String statusUpdatedAtEnd = "statusUpdatedAtEnd_example"; // String | End of the \"Status Update At\" to filter activities by in RFC3339 Time format.
String sortDirection = "DESC"; // String | Sorting order of activities
try {
    CoinbaseEngPrimeApiApiGetPrimeActivitiesResponse result = apiInstance.primeAPIGetPrimeActivities(portfolioId, organizationId, statuses, currencies, types, secondaryTypes, startDate, endDate, search, cursor, limit, categories, processingInFront, statusUpdatedAtStart, statusUpdatedAtEnd, sortDirection);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetPrimeActivities");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**| Portfolio to retrieve activities for. |
 **organizationId** | **String**| Organization to retrieve activities for. | [optional]
 **statuses** | [**List&lt;String&gt;**](String.md)| ActivityStatuses to filter by. | [optional] [enum: ACTIVITY_STATUS_UNSPECIFIED, ACTIVITY_STATUS_OPEN, ACTIVITY_STATUS_CANCELLED, ACTIVITY_STATUS_PROCESSING, ACTIVITY_STATUS_COMPLETED, ACTIVITY_STATUS_EXPIRED, ACTIVITY_STATUS_REJECTED, ACTIVITY_STATUS_FAILED]
 **currencies** | [**List&lt;String&gt;**](String.md)| Currencies to filter by. | [optional]
 **types** | [**List&lt;String&gt;**](String.md)| ActivityTypes to filter by.   - ACTIVITY_TYPE_PRINCIPAL_OUT: Lending specific activity types  - ACTIVITY_TYPE_BLOCK_TRADE: Block trades  - ACTIVITY_TYPE_USER_CHANGE_REQUEST_NO_PAS: No pas integration for user change request  - ACTIVITY_TYPE_SHORT_COLLATERAL_TRANSFER_WITHDRAWAL: Short Collateral Transfer Types | [optional] [enum: ACTIVITY_TYPE_UNSPECIFIED, ACTIVITY_TYPE_LIMIT_ORDER, ACTIVITY_TYPE_MARKET_ORDER, ACTIVITY_TYPE_TWAP_ORDER, ACTIVITY_TYPE_VWAP_ORDER, ACTIVITY_TYPE_STOP_LIMIT_ORDER, ACTIVITY_TYPE_DEPOSIT, ACTIVITY_TYPE_WITHDRAWAL, ACTIVITY_TYPE_CREATE_WALLET, ACTIVITY_TYPE_REMOVE_WALLET, ACTIVITY_TYPE_UPDATE_WALLET, ACTIVITY_TYPE_CAST_VOTE, ACTIVITY_TYPE_ENABLE_VOTING, ACTIVITY_TYPE_STAKE, ACTIVITY_TYPE_UNSTAKE, ACTIVITY_TYPE_CHANGE_VALIDATOR, ACTIVITY_TYPE_RESTAKE, ACTIVITY_TYPE_ADDRESS_BOOK, ACTIVITY_TYPE_TEAM_MEMBERS, ACTIVITY_TYPE_BILLING, ACTIVITY_TYPE_SECURITY, ACTIVITY_TYPE_API, ACTIVITY_TYPE_SETTINGS, ACTIVITY_TYPE_SMART_CONTRACT, ACTIVITY_TYPE_PRINCIPAL_OUT, ACTIVITY_TYPE_PRINCIPAL_IN, ACTIVITY_TYPE_COLLATERAL_OUT, ACTIVITY_TYPE_COLLATERAL_IN, ACTIVITY_TYPE_INTEREST_OUT, ACTIVITY_TYPE_INTEREST_IN, ACTIVITY_TYPE_ALLOCATION_IN, ACTIVITY_TYPE_ALLOCATION_OUT, ACTIVITY_TYPE_ALLOCATION_IN_REVERSAL, ACTIVITY_TYPE_ALLOCATION_OUT_REVERSAL, ACTIVITY_TYPE_CONVERSION, ACTIVITY_TYPE_BLOCK_TRADE, ACTIVITY_TYPE_USER_CHANGE_REQUEST_NO_PAS, ACTIVITY_TYPE_WEB3_TRANSACTION, ACTIVITY_TYPE_REWARD, ACTIVITY_TYPE_WEB3_MESSAGE, ACTIVITY_TYPE_WEB3_ADD_SIGNER, ACTIVITY_TYPE_WEB3_CLONE_KEYS, ACTIVITY_TYPE_WEB3_ONBOARDING, ACTIVITY_TYPE_WEB3_RECREATE_BACKUP, ACTIVITY_TYPE_MATCH_TRANSFER_DEPOSIT, ACTIVITY_TYPE_MATCH_TRANSFER_WITHDRAWAL, ACTIVITY_TYPE_WEB3_DEVICE_RECOVERY, ACTIVITY_TYPE_STAKING_CRYPTO_REBATE, ACTIVITY_TYPE_SHORT_COLLATERAL_TRANSFER_WITHDRAWAL, ACTIVITY_TYPE_SHORT_COLLATERAL_TRANSFER_RETURN, ACTIVITY_TYPE_WEB3_DEPOSIT_TRANSACTION, ACTIVITY_TYPE_ADVANCED_TRANSFER, ACTIVITY_TYPE_WEB3_UPLOAD_SECURITY_KEY, ACTIVITY_TYPE_WEB3_KEY_EXPORT, ACTIVITY_TYPE_WEB3_ARCHIVE_SECURITY_KEY]
 **secondaryTypes** | [**List&lt;String&gt;**](String.md)| ActivitySecondaryTypes to filter by.   - ACTIVITY_SECONDARY_TYPE_UNSPECIFIED: Order &amp; Allocation secondary types  - ACTIVITY_SECONDARY_TYPE_INTERNAL_TRANSFER: Transaction secondary types  - ACTIVITY_SECONDARY_TYPE_CB_LENDS: Lending secondary types  - ACTIVITY_SECONDARY_TYPE_INVITE_TEAM_MEMBER: User Invite secondary types  - ACTIVITY_SECONDARY_TYPE_WEB3_WALLET: Wallet Create secondary types  - ACTIVITY_SECONDARY_TYPE_WEB3_SIGNER: Web3 Signer role secondary type | [optional] [enum: ACTIVITY_SECONDARY_TYPE_UNSPECIFIED, ACTIVITY_SECONDARY_TYPE_BUY, ACTIVITY_SECONDARY_TYPE_SELL, ACTIVITY_SECONDARY_TYPE_INTERNAL_TRANSFER, ACTIVITY_SECONDARY_TYPE_SWEEP_TRANSFER, ACTIVITY_SECONDARY_TYPE_CB_LENDS, ACTIVITY_SECONDARY_TYPE_CB_BORROWS, ACTIVITY_SECONDARY_TYPE_INVITE_TEAM_MEMBER, ACTIVITY_SECONDARY_TYPE_WEB3_WALLET, ACTIVITY_SECONDARY_TYPE_QUALIFIED_CUSTODIAN_WALLET, ACTIVITY_SECONDARY_TYPE_WEB3_SIGNER]
 **startDate** | **String**| Start date to filter activities by in RFC3339 Time format. Requires end_date to be specified if start_date provided.  | [optional]
 **endDate** | **String**| End date to filter activities by in RFC3339 Time format. Requires start_date to be specified if end_date provided.  | [optional]
 **search** | **String**| Query string to search titles and descriptions for. | [optional]
 **cursor** | **String**| Activity cursor to retrieve additional results strictly after. | [optional]
 **limit** | **Integer**| Number of activities to retrieve | [optional]
 **categories** | [**List&lt;String&gt;**](String.md)| ActivityCategories to filter by. | [optional] [enum: ACTIVITY_CATEGORY_UNSPECIFIED, ACTIVITY_CATEGORY_ORDER, ACTIVITY_CATEGORY_TRANSACTION, ACTIVITY_CATEGORY_ACCOUNT, ACTIVITY_CATEGORY_ADMIN, ACTIVITY_CATEGORY_LENDING, ACTIVITY_CATEGORY_ALLOCATION, ACTIVITY_CATEGORY_USER_CHANGE_REQUEST_NO_PAS, ACTIVITY_CATEGORY_WEB3_SIGNING_PAYLOAD]
 **processingInFront** | **Boolean**| Whether sort processing activities in front | [optional]
 **statusUpdatedAtStart** | **String**| Beginning of the \&quot;Status Update At\&quot; to filter activities by in RFC3339 Time format. | [optional]
 **statusUpdatedAtEnd** | **String**| End of the \&quot;Status Update At\&quot; to filter activities by in RFC3339 Time format. | [optional]
 **sortDirection** | **String**| Sorting order of activities | [optional] [default to DESC] [enum: DESC, ASC]

### Return type

[**CoinbaseEngPrimeApiApiGetPrimeActivitiesResponse**](CoinbaseEngPrimeApiApiGetPrimeActivitiesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetPrimeActivitiesStream"></a>
# **primeAPIGetPrimeActivitiesStream**
> StreamResultOfCoinbaseEngPrimeApiApiGetPrimeActivitiesStreamResponse primeAPIGetPrimeActivitiesStream(portfolioId, organizationId, statuses, currencies, types, secondaryTypes, startDate, endDate, search, cursor, limit, categories, processingInFront, sortDirection)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String portfolioId = "portfolioId_example"; // String | Portfolio to retrieve activities for.
String organizationId = "organizationId_example"; // String | Organization to retrieve activities for.
List<String> statuses = Arrays.asList("statuses_example"); // List<String> | ActivityStatuses to filter by.
List<String> currencies = Arrays.asList("currencies_example"); // List<String> | Currencies to filter by.
List<String> types = Arrays.asList("types_example"); // List<String> | ActivityTypes to filter by.   - ACTIVITY_TYPE_PRINCIPAL_OUT: Lending specific activity types  - ACTIVITY_TYPE_BLOCK_TRADE: Block trades  - ACTIVITY_TYPE_USER_CHANGE_REQUEST_NO_PAS: No pas integration for user change request  - ACTIVITY_TYPE_SHORT_COLLATERAL_TRANSFER_WITHDRAWAL: Short Collateral Transfer Types
List<String> secondaryTypes = Arrays.asList("secondaryTypes_example"); // List<String> | ActivitySecondaryTypes to filter by.   - ACTIVITY_SECONDARY_TYPE_UNSPECIFIED: Order & Allocation secondary types  - ACTIVITY_SECONDARY_TYPE_INTERNAL_TRANSFER: Transaction secondary types  - ACTIVITY_SECONDARY_TYPE_CB_LENDS: Lending secondary types  - ACTIVITY_SECONDARY_TYPE_INVITE_TEAM_MEMBER: User Invite secondary types  - ACTIVITY_SECONDARY_TYPE_WEB3_WALLET: Wallet Create secondary types  - ACTIVITY_SECONDARY_TYPE_WEB3_SIGNER: Web3 Signer role secondary type
String startDate = "startDate_example"; // String | Start date to filter activities by in RFC3339 Time format. Requires end_date to be specified if start_date provided. 
String endDate = "endDate_example"; // String | End date to filter activities by in RFC3339 Time format. Requires start_date to be specified if end_date provided. 
String search = "search_example"; // String | Query string to search titles and descriptions for.
String cursor = "cursor_example"; // String | Activity cursor to retrieve additional results strictly after.
Integer limit = 56; // Integer | Number of activities to retrieve
List<String> categories = Arrays.asList("categories_example"); // List<String> | ActivityCategories to filter by.
Boolean processingInFront = true; // Boolean | Whether sort processing activities in front
String sortDirection = "DESC"; // String | Sorting order of activities
try {
    StreamResultOfCoinbaseEngPrimeApiApiGetPrimeActivitiesStreamResponse result = apiInstance.primeAPIGetPrimeActivitiesStream(portfolioId, organizationId, statuses, currencies, types, secondaryTypes, startDate, endDate, search, cursor, limit, categories, processingInFront, sortDirection);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetPrimeActivitiesStream");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**| Portfolio to retrieve activities for. |
 **organizationId** | **String**| Organization to retrieve activities for. | [optional]
 **statuses** | [**List&lt;String&gt;**](String.md)| ActivityStatuses to filter by. | [optional] [enum: ACTIVITY_STATUS_UNSPECIFIED, ACTIVITY_STATUS_OPEN, ACTIVITY_STATUS_CANCELLED, ACTIVITY_STATUS_PROCESSING, ACTIVITY_STATUS_COMPLETED, ACTIVITY_STATUS_EXPIRED, ACTIVITY_STATUS_REJECTED, ACTIVITY_STATUS_FAILED]
 **currencies** | [**List&lt;String&gt;**](String.md)| Currencies to filter by. | [optional]
 **types** | [**List&lt;String&gt;**](String.md)| ActivityTypes to filter by.   - ACTIVITY_TYPE_PRINCIPAL_OUT: Lending specific activity types  - ACTIVITY_TYPE_BLOCK_TRADE: Block trades  - ACTIVITY_TYPE_USER_CHANGE_REQUEST_NO_PAS: No pas integration for user change request  - ACTIVITY_TYPE_SHORT_COLLATERAL_TRANSFER_WITHDRAWAL: Short Collateral Transfer Types | [optional] [enum: ACTIVITY_TYPE_UNSPECIFIED, ACTIVITY_TYPE_LIMIT_ORDER, ACTIVITY_TYPE_MARKET_ORDER, ACTIVITY_TYPE_TWAP_ORDER, ACTIVITY_TYPE_VWAP_ORDER, ACTIVITY_TYPE_STOP_LIMIT_ORDER, ACTIVITY_TYPE_DEPOSIT, ACTIVITY_TYPE_WITHDRAWAL, ACTIVITY_TYPE_CREATE_WALLET, ACTIVITY_TYPE_REMOVE_WALLET, ACTIVITY_TYPE_UPDATE_WALLET, ACTIVITY_TYPE_CAST_VOTE, ACTIVITY_TYPE_ENABLE_VOTING, ACTIVITY_TYPE_STAKE, ACTIVITY_TYPE_UNSTAKE, ACTIVITY_TYPE_CHANGE_VALIDATOR, ACTIVITY_TYPE_RESTAKE, ACTIVITY_TYPE_ADDRESS_BOOK, ACTIVITY_TYPE_TEAM_MEMBERS, ACTIVITY_TYPE_BILLING, ACTIVITY_TYPE_SECURITY, ACTIVITY_TYPE_API, ACTIVITY_TYPE_SETTINGS, ACTIVITY_TYPE_SMART_CONTRACT, ACTIVITY_TYPE_PRINCIPAL_OUT, ACTIVITY_TYPE_PRINCIPAL_IN, ACTIVITY_TYPE_COLLATERAL_OUT, ACTIVITY_TYPE_COLLATERAL_IN, ACTIVITY_TYPE_INTEREST_OUT, ACTIVITY_TYPE_INTEREST_IN, ACTIVITY_TYPE_ALLOCATION_IN, ACTIVITY_TYPE_ALLOCATION_OUT, ACTIVITY_TYPE_ALLOCATION_IN_REVERSAL, ACTIVITY_TYPE_ALLOCATION_OUT_REVERSAL, ACTIVITY_TYPE_CONVERSION, ACTIVITY_TYPE_BLOCK_TRADE, ACTIVITY_TYPE_USER_CHANGE_REQUEST_NO_PAS, ACTIVITY_TYPE_WEB3_TRANSACTION, ACTIVITY_TYPE_REWARD, ACTIVITY_TYPE_WEB3_MESSAGE, ACTIVITY_TYPE_WEB3_ADD_SIGNER, ACTIVITY_TYPE_WEB3_CLONE_KEYS, ACTIVITY_TYPE_WEB3_ONBOARDING, ACTIVITY_TYPE_WEB3_RECREATE_BACKUP, ACTIVITY_TYPE_MATCH_TRANSFER_DEPOSIT, ACTIVITY_TYPE_MATCH_TRANSFER_WITHDRAWAL, ACTIVITY_TYPE_WEB3_DEVICE_RECOVERY, ACTIVITY_TYPE_STAKING_CRYPTO_REBATE, ACTIVITY_TYPE_SHORT_COLLATERAL_TRANSFER_WITHDRAWAL, ACTIVITY_TYPE_SHORT_COLLATERAL_TRANSFER_RETURN, ACTIVITY_TYPE_WEB3_DEPOSIT_TRANSACTION, ACTIVITY_TYPE_ADVANCED_TRANSFER, ACTIVITY_TYPE_WEB3_UPLOAD_SECURITY_KEY, ACTIVITY_TYPE_WEB3_KEY_EXPORT, ACTIVITY_TYPE_WEB3_ARCHIVE_SECURITY_KEY]
 **secondaryTypes** | [**List&lt;String&gt;**](String.md)| ActivitySecondaryTypes to filter by.   - ACTIVITY_SECONDARY_TYPE_UNSPECIFIED: Order &amp; Allocation secondary types  - ACTIVITY_SECONDARY_TYPE_INTERNAL_TRANSFER: Transaction secondary types  - ACTIVITY_SECONDARY_TYPE_CB_LENDS: Lending secondary types  - ACTIVITY_SECONDARY_TYPE_INVITE_TEAM_MEMBER: User Invite secondary types  - ACTIVITY_SECONDARY_TYPE_WEB3_WALLET: Wallet Create secondary types  - ACTIVITY_SECONDARY_TYPE_WEB3_SIGNER: Web3 Signer role secondary type | [optional] [enum: ACTIVITY_SECONDARY_TYPE_UNSPECIFIED, ACTIVITY_SECONDARY_TYPE_BUY, ACTIVITY_SECONDARY_TYPE_SELL, ACTIVITY_SECONDARY_TYPE_INTERNAL_TRANSFER, ACTIVITY_SECONDARY_TYPE_SWEEP_TRANSFER, ACTIVITY_SECONDARY_TYPE_CB_LENDS, ACTIVITY_SECONDARY_TYPE_CB_BORROWS, ACTIVITY_SECONDARY_TYPE_INVITE_TEAM_MEMBER, ACTIVITY_SECONDARY_TYPE_WEB3_WALLET, ACTIVITY_SECONDARY_TYPE_QUALIFIED_CUSTODIAN_WALLET, ACTIVITY_SECONDARY_TYPE_WEB3_SIGNER]
 **startDate** | **String**| Start date to filter activities by in RFC3339 Time format. Requires end_date to be specified if start_date provided.  | [optional]
 **endDate** | **String**| End date to filter activities by in RFC3339 Time format. Requires start_date to be specified if end_date provided.  | [optional]
 **search** | **String**| Query string to search titles and descriptions for. | [optional]
 **cursor** | **String**| Activity cursor to retrieve additional results strictly after. | [optional]
 **limit** | **Integer**| Number of activities to retrieve | [optional]
 **categories** | [**List&lt;String&gt;**](String.md)| ActivityCategories to filter by. | [optional] [enum: ACTIVITY_CATEGORY_UNSPECIFIED, ACTIVITY_CATEGORY_ORDER, ACTIVITY_CATEGORY_TRANSACTION, ACTIVITY_CATEGORY_ACCOUNT, ACTIVITY_CATEGORY_ADMIN, ACTIVITY_CATEGORY_LENDING, ACTIVITY_CATEGORY_ALLOCATION, ACTIVITY_CATEGORY_USER_CHANGE_REQUEST_NO_PAS, ACTIVITY_CATEGORY_WEB3_SIGNING_PAYLOAD]
 **processingInFront** | **Boolean**| Whether sort processing activities in front | [optional]
 **sortDirection** | **String**| Sorting order of activities | [optional] [default to DESC] [enum: DESC, ASC]

### Return type

[**StreamResultOfCoinbaseEngPrimeApiApiGetPrimeActivitiesStreamResponse**](StreamResultOfCoinbaseEngPrimeApiApiGetPrimeActivitiesStreamResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetPrimeActivityConsensusAudit"></a>
# **primeAPIGetPrimeActivityConsensusAudit**
> CoinbaseEngPrimeApiApiActivityConsensusAuditResult primeAPIGetPrimeActivityConsensusAudit(portfolioId, activityId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String portfolioId = "portfolioId_example"; // String | 
String activityId = "activityId_example"; // String | 
try {
    CoinbaseEngPrimeApiApiActivityConsensusAuditResult result = apiInstance.primeAPIGetPrimeActivityConsensusAudit(portfolioId, activityId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetPrimeActivityConsensusAudit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**|  |
 **activityId** | **String**|  |

### Return type

[**CoinbaseEngPrimeApiApiActivityConsensusAuditResult**](CoinbaseEngPrimeApiApiActivityConsensusAuditResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetPrimeActivityDetails"></a>
# **primeAPIGetPrimeActivityDetails**
> CoinbaseEngPrimeApiApiGetPrimeActivityDetailsResponse primeAPIGetPrimeActivityDetails(portfolioId, activityId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String portfolioId = "portfolioId_example"; // String | 
String activityId = "activityId_example"; // String | 
try {
    CoinbaseEngPrimeApiApiGetPrimeActivityDetailsResponse result = apiInstance.primeAPIGetPrimeActivityDetails(portfolioId, activityId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetPrimeActivityDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**|  |
 **activityId** | **String**|  |

### Return type

[**CoinbaseEngPrimeApiApiGetPrimeActivityDetailsResponse**](CoinbaseEngPrimeApiApiGetPrimeActivityDetailsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetPrimeActivityDetailsStream"></a>
# **primeAPIGetPrimeActivityDetailsStream**
> StreamResultOfCoinbaseEngPrimeApiApiGetPrimeActivityDetailsStreamResponse primeAPIGetPrimeActivityDetailsStream(portfolioId, activityId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String portfolioId = "portfolioId_example"; // String | 
String activityId = "activityId_example"; // String | 
try {
    StreamResultOfCoinbaseEngPrimeApiApiGetPrimeActivityDetailsStreamResponse result = apiInstance.primeAPIGetPrimeActivityDetailsStream(portfolioId, activityId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetPrimeActivityDetailsStream");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**|  |
 **activityId** | **String**|  |

### Return type

[**StreamResultOfCoinbaseEngPrimeApiApiGetPrimeActivityDetailsStreamResponse**](StreamResultOfCoinbaseEngPrimeApiApiGetPrimeActivityDetailsStreamResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetPrimeActivityDetailsStreamV2"></a>
# **primeAPIGetPrimeActivityDetailsStreamV2**
> StreamResultOfCoinbaseEngPrimeApiApiGetPrimeActivityDetailsV2StreamResponse primeAPIGetPrimeActivityDetailsStreamV2(portfolioId, activityId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String portfolioId = "portfolioId_example"; // String | 
String activityId = "activityId_example"; // String | 
try {
    StreamResultOfCoinbaseEngPrimeApiApiGetPrimeActivityDetailsV2StreamResponse result = apiInstance.primeAPIGetPrimeActivityDetailsStreamV2(portfolioId, activityId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetPrimeActivityDetailsStreamV2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**|  |
 **activityId** | **String**|  |

### Return type

[**StreamResultOfCoinbaseEngPrimeApiApiGetPrimeActivityDetailsV2StreamResponse**](StreamResultOfCoinbaseEngPrimeApiApiGetPrimeActivityDetailsV2StreamResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetPrimeActivityDetailsV2"></a>
# **primeAPIGetPrimeActivityDetailsV2**
> CoinbaseEngPrimeApiApiGetPrimeActivityDetailsV2Response primeAPIGetPrimeActivityDetailsV2(portfolioId, activityId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String portfolioId = "portfolioId_example"; // String | 
String activityId = "activityId_example"; // String | 
try {
    CoinbaseEngPrimeApiApiGetPrimeActivityDetailsV2Response result = apiInstance.primeAPIGetPrimeActivityDetailsV2(portfolioId, activityId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetPrimeActivityDetailsV2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**|  |
 **activityId** | **String**|  |

### Return type

[**CoinbaseEngPrimeApiApiGetPrimeActivityDetailsV2Response**](CoinbaseEngPrimeApiApiGetPrimeActivityDetailsV2Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetPrimeActivityFilters"></a>
# **primeAPIGetPrimeActivityFilters**
> CoinbaseEngPrimeApiApiGetPrimeActivityFiltersResponse primeAPIGetPrimeActivityFilters(portfolioId, categories, statuses)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String portfolioId = "portfolioId_example"; // String | 
List<String> categories = Arrays.asList("categories_example"); // List<String> | 
List<String> statuses = Arrays.asList("statuses_example"); // List<String> | 
try {
    CoinbaseEngPrimeApiApiGetPrimeActivityFiltersResponse result = apiInstance.primeAPIGetPrimeActivityFilters(portfolioId, categories, statuses);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetPrimeActivityFilters");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**|  |
 **categories** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: ACTIVITY_CATEGORY_UNSPECIFIED, ACTIVITY_CATEGORY_ORDER, ACTIVITY_CATEGORY_TRANSACTION, ACTIVITY_CATEGORY_ACCOUNT, ACTIVITY_CATEGORY_ADMIN, ACTIVITY_CATEGORY_LENDING, ACTIVITY_CATEGORY_ALLOCATION, ACTIVITY_CATEGORY_USER_CHANGE_REQUEST_NO_PAS, ACTIVITY_CATEGORY_WEB3_SIGNING_PAYLOAD]
 **statuses** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: ACTIVITY_STATUS_UNSPECIFIED, ACTIVITY_STATUS_OPEN, ACTIVITY_STATUS_CANCELLED, ACTIVITY_STATUS_PROCESSING, ACTIVITY_STATUS_COMPLETED, ACTIVITY_STATUS_EXPIRED, ACTIVITY_STATUS_REJECTED, ACTIVITY_STATUS_FAILED]

### Return type

[**CoinbaseEngPrimeApiApiGetPrimeActivityFiltersResponse**](CoinbaseEngPrimeApiApiGetPrimeActivityFiltersResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetPrimeInvoices"></a>
# **primeAPIGetPrimeInvoices**
> List&lt;CoinbaseEngPrimeApiApiInvoice&gt; primeAPIGetPrimeInvoices(vehicleId, invoiceNumber, billingYear)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String vehicleId = "vehicleId_example"; // String | 
String invoiceNumber = "invoiceNumber_example"; // String | 
Integer billingYear = 56; // Integer | 
try {
    List<CoinbaseEngPrimeApiApiInvoice> result = apiInstance.primeAPIGetPrimeInvoices(vehicleId, invoiceNumber, billingYear);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetPrimeInvoices");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vehicleId** | **String**|  |
 **invoiceNumber** | **String**|  | [optional]
 **billingYear** | **Integer**|  | [optional]

### Return type

[**List&lt;CoinbaseEngPrimeApiApiInvoice&gt;**](CoinbaseEngPrimeApiApiInvoice.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetProductStats"></a>
# **primeAPIGetProductStats**
> CoinbaseBrokerageProxyTradingApiProductStats primeAPIGetProductStats(productId, geolocationLocality, geolocationCountry)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String productId = "productId_example"; // String | The trading pair, i.e. 'BTC-USD'
String geolocationLocality = "geolocationLocality_example"; // String | 
String geolocationCountry = "geolocationCountry_example"; // String | 
try {
    CoinbaseBrokerageProxyTradingApiProductStats result = apiInstance.primeAPIGetProductStats(productId, geolocationLocality, geolocationCountry);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetProductStats");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productId** | **String**| The trading pair, i.e. &#39;BTC-USD&#39; |
 **geolocationLocality** | **String**|  | [optional]
 **geolocationCountry** | **String**|  | [optional]

### Return type

[**CoinbaseBrokerageProxyTradingApiProductStats**](CoinbaseBrokerageProxyTradingApiProductStats.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetProductStatsStream"></a>
# **primeAPIGetProductStatsStream**
> StreamResultOfCoinbaseBrokerageProxyTradingApiGetProductStatsStreamResponse primeAPIGetProductStatsStream(productId, updateInterval, geolocationLocality, geolocationCountry)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String productId = "productId_example"; // String | The trading pair, i.e. 'BTC-USD'
String updateInterval = "TWO_HUNDRED_FIFTY_MS_STATS"; // String | Time between each patch for the stats
String geolocationLocality = "geolocationLocality_example"; // String | 
String geolocationCountry = "geolocationCountry_example"; // String | 
try {
    StreamResultOfCoinbaseBrokerageProxyTradingApiGetProductStatsStreamResponse result = apiInstance.primeAPIGetProductStatsStream(productId, updateInterval, geolocationLocality, geolocationCountry);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetProductStatsStream");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productId** | **String**| The trading pair, i.e. &#39;BTC-USD&#39; |
 **updateInterval** | **String**| Time between each patch for the stats | [default to TWO_HUNDRED_FIFTY_MS_STATS] [enum: TWO_HUNDRED_FIFTY_MS_STATS]
 **geolocationLocality** | **String**|  | [optional]
 **geolocationCountry** | **String**|  | [optional]

### Return type

[**StreamResultOfCoinbaseBrokerageProxyTradingApiGetProductStatsStreamResponse**](StreamResultOfCoinbaseBrokerageProxyTradingApiGetProductStatsStreamResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetProducts"></a>
# **primeAPIGetProducts**
> CoinbaseEngPrimeApiApiProducts primeAPIGetProducts(limit, productId, portfolioId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
Long limit = 789L; // Long | Number of products to return in the initial snapshot. Maximum of 100
List<String> productId = Arrays.asList("productId_example"); // List<String> | 
String portfolioId = "portfolioId_example"; // String | 
try {
    CoinbaseEngPrimeApiApiProducts result = apiInstance.primeAPIGetProducts(limit, productId, portfolioId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetProducts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Long**| Number of products to return in the initial snapshot. Maximum of 100 | [optional]
 **productId** | [**List&lt;String&gt;**](String.md)|  | [optional]
 **portfolioId** | **String**|  | [optional]

### Return type

[**CoinbaseEngPrimeApiApiProducts**](CoinbaseEngPrimeApiApiProducts.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetProductsStream"></a>
# **primeAPIGetProductsStream**
> StreamResultOfCoinbaseEngPrimeApiApiGetProductsStreamResponse primeAPIGetProductsStream(updateInterval, limit, productId, portfolioId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String updateInterval = "TWO_HUNDRED_FIFTY_MS_PRODUCTS"; // String | Time between each patch for the products
Long limit = 789L; // Long | Number of products to return in the initial snapshot.
List<String> productId = Arrays.asList("productId_example"); // List<String> | 
String portfolioId = "portfolioId_example"; // String | 
try {
    StreamResultOfCoinbaseEngPrimeApiApiGetProductsStreamResponse result = apiInstance.primeAPIGetProductsStream(updateInterval, limit, productId, portfolioId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetProductsStream");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **updateInterval** | **String**| Time between each patch for the products | [default to TWO_HUNDRED_FIFTY_MS_PRODUCTS] [enum: TWO_HUNDRED_FIFTY_MS_PRODUCTS, THREE_SECOND_PRODUCTS]
 **limit** | **Long**| Number of products to return in the initial snapshot. | [optional]
 **productId** | [**List&lt;String&gt;**](String.md)|  | [optional]
 **portfolioId** | **String**|  | [optional]

### Return type

[**StreamResultOfCoinbaseEngPrimeApiApiGetProductsStreamResponse**](StreamResultOfCoinbaseEngPrimeApiApiGetProductsStreamResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetRateCard"></a>
# **primeAPIGetRateCard**
> CoinbaseEngPrimeApiApiGetRateCardResponse primeAPIGetRateCard(currency)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String currency = "currency_example"; // String | 
try {
    CoinbaseEngPrimeApiApiGetRateCardResponse result = apiInstance.primeAPIGetRateCard(currency);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetRateCard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **String**|  |

### Return type

[**CoinbaseEngPrimeApiApiGetRateCardResponse**](CoinbaseEngPrimeApiApiGetRateCardResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetReportingCenterDownloadLink"></a>
# **primeAPIGetReportingCenterDownloadLink**
> CoinbaseEngPrimeApiApiGetReportingCenterDownloadLinkResponse primeAPIGetReportingCenterDownloadLink(portfolioId, s3Bucket, s3Key, type)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String portfolioId = "portfolioId_example"; // String | 
String s3Bucket = "s3Bucket_example"; // String | 
String s3Key = "s3Key_example"; // String | 
String type = "REPORT_TYPE_UNSPECIFIED"; // String | 
try {
    CoinbaseEngPrimeApiApiGetReportingCenterDownloadLinkResponse result = apiInstance.primeAPIGetReportingCenterDownloadLink(portfolioId, s3Bucket, s3Key, type);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetReportingCenterDownloadLink");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**|  |
 **s3Bucket** | **String**|  | [optional]
 **s3Key** | **String**|  | [optional]
 **type** | **String**|  | [optional] [default to REPORT_TYPE_UNSPECIFIED] [enum: REPORT_TYPE_UNSPECIFIED, REPORT_TYPE_MONTHLY_STATEMENT]

### Return type

[**CoinbaseEngPrimeApiApiGetReportingCenterDownloadLinkResponse**](CoinbaseEngPrimeApiApiGetReportingCenterDownloadLinkResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetReportingCenterFilters"></a>
# **primeAPIGetReportingCenterFilters**
> CoinbaseEngPrimeApiApiGetReportingCenterFiltersResponse primeAPIGetReportingCenterFilters(vehicleId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String vehicleId = "vehicleId_example"; // String | 
try {
    CoinbaseEngPrimeApiApiGetReportingCenterFiltersResponse result = apiInstance.primeAPIGetReportingCenterFilters(vehicleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetReportingCenterFilters");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vehicleId** | **String**|  |

### Return type

[**CoinbaseEngPrimeApiApiGetReportingCenterFiltersResponse**](CoinbaseEngPrimeApiApiGetReportingCenterFiltersResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetReportingDocumentByOrderId"></a>
# **primeAPIGetReportingDocumentByOrderId**
> CoinbaseEngPrimeReportingApiDocument primeAPIGetReportingDocumentByOrderId(portfolioId, orderId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String portfolioId = "portfolioId_example"; // String | 
String orderId = "orderId_example"; // String | 
try {
    CoinbaseEngPrimeReportingApiDocument result = apiInstance.primeAPIGetReportingDocumentByOrderId(portfolioId, orderId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetReportingDocumentByOrderId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**|  |
 **orderId** | **String**|  |

### Return type

[**CoinbaseEngPrimeReportingApiDocument**](CoinbaseEngPrimeReportingApiDocument.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetReverseAllocation"></a>
# **primeAPIGetReverseAllocation**
> CoinbaseEngPrimeApiApiGetReverseAllocationResponse primeAPIGetReverseAllocation(portfolioId, allocationId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String portfolioId = "portfolioId_example"; // String | The ID of the portfolio to get allocation for
String allocationId = "allocationId_example"; // String | The allocation id to get allocations for
try {
    CoinbaseEngPrimeApiApiGetReverseAllocationResponse result = apiInstance.primeAPIGetReverseAllocation(portfolioId, allocationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetReverseAllocation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**| The ID of the portfolio to get allocation for |
 **allocationId** | **String**| The allocation id to get allocations for |

### Return type

[**CoinbaseEngPrimeApiApiGetReverseAllocationResponse**](CoinbaseEngPrimeApiApiGetReverseAllocationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetSignedDocument"></a>
# **primeAPIGetSignedDocument**
> CoinbaseEngPrimeApiApiGetSignedDocumentResponse primeAPIGetSignedDocument(vehicleId, documentKey)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String vehicleId = "vehicleId_example"; // String | 
String documentKey = "documentKey_example"; // String | 
try {
    CoinbaseEngPrimeApiApiGetSignedDocumentResponse result = apiInstance.primeAPIGetSignedDocument(vehicleId, documentKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetSignedDocument");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vehicleId** | **String**|  |
 **documentKey** | **String**|  | [enum: DOCUMENT_TYPE_UNKNOWN, DOCUMENT_TYPE_STAKING_ADDENDUM, DOCUMENT_TYPE_STACKING_ADDENDUM, DOCUMENT_TYPE_NFT_ADDENDUM, DOCUMENT_TYPE_ETH_STAKING_ADDENDUM, DOCUMENT_TYPE_WEB3_TERMS_AND_CONDITIONS, DOCUMENT_TYPE_LIQUID_STAKING_ADDENDUM, DOCUMENT_TYPE_LSETH_STAKING_ADDENDUM, DOCUMENT_TYPE_USDC_REWARDS_ADDENDUM]

### Return type

[**CoinbaseEngPrimeApiApiGetSignedDocumentResponse**](CoinbaseEngPrimeApiApiGetSignedDocumentResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetStablecoinRewardsEarnings"></a>
# **primeAPIGetStablecoinRewardsEarnings**
> CoinbaseEngPrimeApiApiGetStablecoinRewardsEarningsResponse primeAPIGetStablecoinRewardsEarnings(vehicleId, portfolioId, currency)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String vehicleId = "vehicleId_example"; // String | 
String portfolioId = "portfolioId_example"; // String | 
String currency = "currency_example"; // String | 
try {
    CoinbaseEngPrimeApiApiGetStablecoinRewardsEarningsResponse result = apiInstance.primeAPIGetStablecoinRewardsEarnings(vehicleId, portfolioId, currency);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetStablecoinRewardsEarnings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vehicleId** | **String**|  |
 **portfolioId** | **String**|  |
 **currency** | **String**|  |

### Return type

[**CoinbaseEngPrimeApiApiGetStablecoinRewardsEarningsResponse**](CoinbaseEngPrimeApiApiGetStablecoinRewardsEarningsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetStablecoinRewardsEnrollment"></a>
# **primeAPIGetStablecoinRewardsEnrollment**
> CoinbaseEngPrimeApiApiGetStablecoinRewardsEnrollmentResponse primeAPIGetStablecoinRewardsEnrollment(vehicleId, currency)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String vehicleId = "vehicleId_example"; // String | 
String currency = "currency_example"; // String | 
try {
    CoinbaseEngPrimeApiApiGetStablecoinRewardsEnrollmentResponse result = apiInstance.primeAPIGetStablecoinRewardsEnrollment(vehicleId, currency);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetStablecoinRewardsEnrollment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vehicleId** | **String**|  |
 **currency** | **String**|  |

### Return type

[**CoinbaseEngPrimeApiApiGetStablecoinRewardsEnrollmentResponse**](CoinbaseEngPrimeApiApiGetStablecoinRewardsEnrollmentResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetStakeTimeEstimation"></a>
# **primeAPIGetStakeTimeEstimation**
> CoinbaseCustodyApiGetStakeTimeEstimationResponse primeAPIGetStakeTimeEstimation(portfolioId, currencySymbol)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String portfolioId = "portfolioId_example"; // String | 
String currencySymbol = "currencySymbol_example"; // String | 
try {
    CoinbaseCustodyApiGetStakeTimeEstimationResponse result = apiInstance.primeAPIGetStakeTimeEstimation(portfolioId, currencySymbol);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetStakeTimeEstimation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**|  |
 **currencySymbol** | **String**|  |

### Return type

[**CoinbaseCustodyApiGetStakeTimeEstimationResponse**](CoinbaseCustodyApiGetStakeTimeEstimationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetStakingActivityDetails"></a>
# **primeAPIGetStakingActivityDetails**
> CoinbaseCustodyApiGetStakingActivityDetailsResponse primeAPIGetStakingActivityDetails(portfolioId, activityId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String portfolioId = "portfolioId_example"; // String | 
String activityId = "activityId_example"; // String | 
try {
    CoinbaseCustodyApiGetStakingActivityDetailsResponse result = apiInstance.primeAPIGetStakingActivityDetails(portfolioId, activityId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetStakingActivityDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**|  |
 **activityId** | **String**|  |

### Return type

[**CoinbaseCustodyApiGetStakingActivityDetailsResponse**](CoinbaseCustodyApiGetStakingActivityDetailsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetStatement"></a>
# **primeAPIGetStatement**
> CoinbaseEngPrimeApiApiGetStatementResponse primeAPIGetStatement(statementId, portfolioId, portfolioIds)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String statementId = "statementId_example"; // String | 
String portfolioId = "portfolioId_example"; // String | 
List<String> portfolioIds = Arrays.asList("portfolioIds_example"); // List<String> | 
try {
    CoinbaseEngPrimeApiApiGetStatementResponse result = apiInstance.primeAPIGetStatement(statementId, portfolioId, portfolioIds);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetStatement");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **statementId** | **String**|  |
 **portfolioId** | **String**|  | [optional]
 **portfolioIds** | [**List&lt;String&gt;**](String.md)|  | [optional]

### Return type

[**CoinbaseEngPrimeApiApiGetStatementResponse**](CoinbaseEngPrimeApiApiGetStatementResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetStatements"></a>
# **primeAPIGetStatements**
> List&lt;CoinbaseEngPrimeReportingApiStatement&gt; primeAPIGetStatements(portfolioId, year)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String portfolioId = "portfolioId_example"; // String | 
Integer year = 56; // Integer | 
try {
    List<CoinbaseEngPrimeReportingApiStatement> result = apiInstance.primeAPIGetStatements(portfolioId, year);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetStatements");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**|  |
 **year** | **Integer**|  | [optional]

### Return type

[**List&lt;CoinbaseEngPrimeReportingApiStatement&gt;**](CoinbaseEngPrimeReportingApiStatement.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetSystemStatus"></a>
# **primeAPIGetSystemStatus**
> CoinbaseEngPrimeApiApiSystemStatusResponse primeAPIGetSystemStatus()



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
try {
    CoinbaseEngPrimeApiApiSystemStatusResponse result = apiInstance.primeAPIGetSystemStatus();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetSystemStatus");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CoinbaseEngPrimeApiApiSystemStatusResponse**](CoinbaseEngPrimeApiApiSystemStatusResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetTeamMemberDetails"></a>
# **primeAPIGetTeamMemberDetails**
> CoinbaseEngPrimeApiApiGetTeamMemberDetailResponse primeAPIGetTeamMemberDetails(entityId, userId, email)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String entityId = "entityId_example"; // String | The entity id
String userId = "userId_example"; // String | The user id
String email = "email_example"; // String | The user email
try {
    CoinbaseEngPrimeApiApiGetTeamMemberDetailResponse result = apiInstance.primeAPIGetTeamMemberDetails(entityId, userId, email);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetTeamMemberDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **entityId** | **String**| The entity id |
 **userId** | **String**| The user id |
 **email** | **String**| The user email |

### Return type

[**CoinbaseEngPrimeApiApiGetTeamMemberDetailResponse**](CoinbaseEngPrimeApiApiGetTeamMemberDetailResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetTeamMembers"></a>
# **primeAPIGetTeamMembers**
> CoinbaseEngPrimeApiApiGetTeamMembersResponse primeAPIGetTeamMembers(queryLevel, queryIds, cursor, limit, sortDirection, search, permission, roles, secondaryRoles, accessTypeFilter)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String queryLevel = "PORTFOLIO"; // String | The query level
List<String> queryIds = Arrays.asList("queryIds_example"); // List<String> | The query IDs
String cursor = "cursor_example"; // String | Id to retrieve additional results strictly after.
Integer limit = 56; // Integer | Number of users to retrieve
String sortDirection = "DESC"; // String | Sorting order
String search = "search_example"; // String | Search query to match user name
String permission = "PERMISSION_UNKNOWN"; // String | Permission to filter all users by
List<String> roles = Arrays.asList("roles_example"); // List<String> | Users with these roles (or provided secondary roles) to include in response
List<String> secondaryRoles = Arrays.asList("secondaryRoles_example"); // List<String> | Users with these secondary roles (or provided roles) to include in response
String accessTypeFilter = "ACCESS_TYPE_UNSPECIFIED"; // String | The access type filter
try {
    CoinbaseEngPrimeApiApiGetTeamMembersResponse result = apiInstance.primeAPIGetTeamMembers(queryLevel, queryIds, cursor, limit, sortDirection, search, permission, roles, secondaryRoles, accessTypeFilter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetTeamMembers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **queryLevel** | **String**| The query level | [default to PORTFOLIO] [enum: PORTFOLIO, ENTITY, ORGANIZATION, USER]
 **queryIds** | [**List&lt;String&gt;**](String.md)| The query IDs |
 **cursor** | **String**| Id to retrieve additional results strictly after. | [optional]
 **limit** | **Integer**| Number of users to retrieve | [optional]
 **sortDirection** | **String**| Sorting order | [optional] [default to DESC] [enum: DESC, ASC]
 **search** | **String**| Search query to match user name | [optional]
 **permission** | **String**| Permission to filter all users by | [optional] [default to PERMISSION_UNKNOWN] [enum: PERMISSION_UNKNOWN, PERMISSION_READ, PERMISSION_INITIATE, PERMISSION_REVIEW, PERMISSION_ADMIN, PERMISSION_TRADE, PERMISSION_VIDEO_APPROVE, PERMISSION_TEAM_APPROVE, PERMISSION_WEB3_SIGN]
 **roles** | [**List&lt;String&gt;**](String.md)| Users with these roles (or provided secondary roles) to include in response | [optional] [enum: ROLE_UNKNOWN, ROLE_AUTHORIZED_SIGNATORY, ROLE_INITIATOR, ROLE_APPROVER, ROLE_AUDITOR, ROLE_ADMINISTRATOR, ROLE_TRADER, ROLE_INTERNAL_TRADER, ROLE_TEAM_MANAGER, ROLE_FULL_TRADER, ROLE_INTERNAL_AUDITOR]
 **secondaryRoles** | [**List&lt;String&gt;**](String.md)| Users with these secondary roles (or provided roles) to include in response | [optional] [enum: SECONDARY_ROLE_UNKNOWN, SECONDARY_ROLE_VIDEO_APPROVER, SECONDARY_ROLE_TEAM_APPROVER, SECONDARY_ROLE_WEB3_SIGNER]
 **accessTypeFilter** | **String**| The access type filter | [optional] [default to ACCESS_TYPE_UNSPECIFIED] [enum: ACCESS_TYPE_UNSPECIFIED, ACCESS_TYPE_PORTFOLIO, ACCESS_TYPE_ENTITY]

### Return type

[**CoinbaseEngPrimeApiApiGetTeamMembersResponse**](CoinbaseEngPrimeApiApiGetTeamMembersResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetTradeReportGraphData"></a>
# **primeAPIGetTradeReportGraphData**
> CoinbaseBrokerageProxyTradingApiGetTradeReportGraphDataResponse primeAPIGetTradeReportGraphData(orderId, portfolioId, intervalSize)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String orderId = "orderId_example"; // String | 
String portfolioId = "portfolioId_example"; // String | 
String intervalSize = "UNKNOWN_INTERVAL"; // String | 
try {
    CoinbaseBrokerageProxyTradingApiGetTradeReportGraphDataResponse result = apiInstance.primeAPIGetTradeReportGraphData(orderId, portfolioId, intervalSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetTradeReportGraphData");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **String**|  |
 **portfolioId** | **String**|  | [optional]
 **intervalSize** | **String**|  | [optional] [default to UNKNOWN_INTERVAL] [enum: UNKNOWN_INTERVAL, SECOND, MINUTE, FIVE_MINUTES, FIFTEEN_MINUTES, THIRTY_MINUTES, HOUR, TWO_HOURS, SIX_HOURS, DAY, WEEK, FOUR_WEEKS, YEAR, THIRTY_SECONDS]

### Return type

[**CoinbaseBrokerageProxyTradingApiGetTradeReportGraphDataResponse**](CoinbaseBrokerageProxyTradingApiGetTradeReportGraphDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetTradeReportOrderDetails"></a>
# **primeAPIGetTradeReportOrderDetails**
> CoinbaseBrokerageProxyTradingApiTradeReportOrder primeAPIGetTradeReportOrderDetails(orderId, portfolioId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String orderId = "orderId_example"; // String | ID of order
String portfolioId = "portfolioId_example"; // String | ID of order's portfolio
try {
    CoinbaseBrokerageProxyTradingApiTradeReportOrder result = apiInstance.primeAPIGetTradeReportOrderDetails(orderId, portfolioId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetTradeReportOrderDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **String**| ID of order |
 **portfolioId** | **String**| ID of order&#39;s portfolio |

### Return type

[**CoinbaseBrokerageProxyTradingApiTradeReportOrder**](CoinbaseBrokerageProxyTradingApiTradeReportOrder.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetTradeReportOrderDetailsAndGraphData"></a>
# **primeAPIGetTradeReportOrderDetailsAndGraphData**
> CoinbaseBrokerageProxyTradingApiGetTradeReportOrderDetailsAndGraphDataResponse primeAPIGetTradeReportOrderDetailsAndGraphData(orderId, portfolioId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String orderId = "orderId_example"; // String | 
String portfolioId = "portfolioId_example"; // String | 
try {
    CoinbaseBrokerageProxyTradingApiGetTradeReportOrderDetailsAndGraphDataResponse result = apiInstance.primeAPIGetTradeReportOrderDetailsAndGraphData(orderId, portfolioId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetTradeReportOrderDetailsAndGraphData");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **String**|  |
 **portfolioId** | **String**|  | [optional]

### Return type

[**CoinbaseBrokerageProxyTradingApiGetTradeReportOrderDetailsAndGraphDataResponse**](CoinbaseBrokerageProxyTradingApiGetTradeReportOrderDetailsAndGraphDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetTradeReportOrderFills"></a>
# **primeAPIGetTradeReportOrderFills**
> CoinbaseBrokerageProxyTradingApiGetTradeReportOrderFillsResponse primeAPIGetTradeReportOrderFills(orderId, portfolioId, limit, beforeTradeId, afterTradeId, cursor)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String orderId = "orderId_example"; // String | ID of order
String portfolioId = "portfolioId_example"; // String | ID of order's portfolio
Long limit = 789L; // Long | Maximum number of fills to return in response
String beforeTradeId = "beforeTradeId_example"; // String | Trade ID of fill that response should start before. Fills are sorted by (trade_time, trade_id) descending.
String afterTradeId = "afterTradeId_example"; // String | Trade ID of fill that response should start after. Fills are sorted by (trade_time, trade_id) descending.
String cursor = "cursor_example"; // String | Cursor to be used for pagination.
try {
    CoinbaseBrokerageProxyTradingApiGetTradeReportOrderFillsResponse result = apiInstance.primeAPIGetTradeReportOrderFills(orderId, portfolioId, limit, beforeTradeId, afterTradeId, cursor);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetTradeReportOrderFills");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **String**| ID of order |
 **portfolioId** | **String**| ID of order&#39;s portfolio |
 **limit** | **Long**| Maximum number of fills to return in response | [optional]
 **beforeTradeId** | **String**| Trade ID of fill that response should start before. Fills are sorted by (trade_time, trade_id) descending. | [optional]
 **afterTradeId** | **String**| Trade ID of fill that response should start after. Fills are sorted by (trade_time, trade_id) descending. | [optional]
 **cursor** | **String**| Cursor to be used for pagination. | [optional]

### Return type

[**CoinbaseBrokerageProxyTradingApiGetTradeReportOrderFillsResponse**](CoinbaseBrokerageProxyTradingApiGetTradeReportOrderFillsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetTradeReportVenueFills"></a>
# **primeAPIGetTradeReportVenueFills**
> CoinbaseBrokerageProxyTradingApiGetTradeReportVenueFillsResponse primeAPIGetTradeReportVenueFills(orderId, portfolioId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String orderId = "orderId_example"; // String | ID of order
String portfolioId = "portfolioId_example"; // String | ID of order's portfolio
try {
    CoinbaseBrokerageProxyTradingApiGetTradeReportVenueFillsResponse result = apiInstance.primeAPIGetTradeReportVenueFills(orderId, portfolioId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetTradeReportVenueFills");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **String**| ID of order |
 **portfolioId** | **String**| ID of order&#39;s portfolio |

### Return type

[**CoinbaseBrokerageProxyTradingApiGetTradeReportVenueFillsResponse**](CoinbaseBrokerageProxyTradingApiGetTradeReportVenueFillsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetTransferMethods"></a>
# **primeAPIGetTransferMethods**
> CoinbaseEngPrimeApiApiGetTransferMethodsResponse primeAPIGetTransferMethods(vehicleId, currencySymbol, transactionType)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String vehicleId = "vehicleId_example"; // String | The investment vehicle you want to transfer to/from
String currencySymbol = "currencySymbol_example"; // String | The symbol of the currency you want to transfer
String transactionType = "TRANSACTION_TYPE_UNKNOWN"; // String | The type of transaction you want to initiate
try {
    CoinbaseEngPrimeApiApiGetTransferMethodsResponse result = apiInstance.primeAPIGetTransferMethods(vehicleId, currencySymbol, transactionType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetTransferMethods");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vehicleId** | **String**| The investment vehicle you want to transfer to/from |
 **currencySymbol** | **String**| The symbol of the currency you want to transfer |
 **transactionType** | **String**| The type of transaction you want to initiate | [default to TRANSACTION_TYPE_UNKNOWN] [enum: TRANSACTION_TYPE_UNKNOWN, TRANSACTION_TYPE_DEPOSIT, TRANSACTION_TYPE_WITHDRAWAL, TRANSACTION_TYPE_REWARD, TRANSACTION_TYPE_SWEEP_WITHDRAWAL, TRANSACTION_TYPE_SWEEP_DEPOSIT, TRANSACTION_TYPE_TRANSFER_WITHDRAWAL, TRANSACTION_TYPE_TRANSFER_DEPOSIT, TRANSACTION_TYPE_PROXY_WITHDRAWAL, TRANSACTION_TYPE_PROXY_DEPOSIT, TRANSACTION_TYPE_COINBASE_DEPOSIT, TRANSACTION_TYPE_KEY_REGISTRATION, TRANSACTION_TYPE_BILLING_WITHDRAWAL, TRANSACTION_TYPE_DELEGATION, TRANSACTION_TYPE_UNDELEGATION, TRANSACTION_TYPE_RESTAKE, TRANSACTION_TYPE_COMPLETE_UNBONDING, TRANSACTION_TYPE_COINBASE_REFUND, TRANSACTION_TYPE_WITHDRAW_UNBONDED, TRANSACTION_TYPE_STAKE_ACCOUNT_CREATE, TRANSACTION_TYPE_CHANGE_VALIDATOR, TRANSACTION_TYPE_STAKE, TRANSACTION_TYPE_UNSTAKE, TRANSACTION_TYPE_INTERNAL_DEPOSIT, TRANSACTION_TYPE_INTERNAL_WITHDRAWAL, TRANSACTION_TYPE_STAKE_AUTHORIZE_WITH_SEED, TRANSACTION_TYPE_REMOVE_AUTHORIZED_PARTY, TRANSACTION_TYPE_SLASH, TRANSACTION_TYPE_CLAIM_REWARDS, TRANSACTION_TYPE_VOTE_AUTHORIZE]

### Return type

[**CoinbaseEngPrimeApiApiGetTransferMethodsResponse**](CoinbaseEngPrimeApiApiGetTransferMethodsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetUnstakeTimeEstimation"></a>
# **primeAPIGetUnstakeTimeEstimation**
> CoinbaseCustodyApiGetUnstakeTimeEstimationResponse primeAPIGetUnstakeTimeEstimation(portfolioId, currencySymbol)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String portfolioId = "portfolioId_example"; // String | 
String currencySymbol = "currencySymbol_example"; // String | 
try {
    CoinbaseCustodyApiGetUnstakeTimeEstimationResponse result = apiInstance.primeAPIGetUnstakeTimeEstimation(portfolioId, currencySymbol);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetUnstakeTimeEstimation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**|  |
 **currencySymbol** | **String**|  |

### Return type

[**CoinbaseCustodyApiGetUnstakeTimeEstimationResponse**](CoinbaseCustodyApiGetUnstakeTimeEstimationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetUserEntityLevelPermission"></a>
# **primeAPIGetUserEntityLevelPermission**
> CoinbaseEngPrimeApiApiGetUserEntityLevelPermissionResponse primeAPIGetUserEntityLevelPermission(entityId, permission)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String entityId = "entityId_example"; // String | 
String permission = "PERMISSION_UNKNOWN"; // String | 
try {
    CoinbaseEngPrimeApiApiGetUserEntityLevelPermissionResponse result = apiInstance.primeAPIGetUserEntityLevelPermission(entityId, permission);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetUserEntityLevelPermission");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **entityId** | **String**|  |
 **permission** | **String**|  | [optional] [default to PERMISSION_UNKNOWN] [enum: PERMISSION_UNKNOWN, PERMISSION_READ, PERMISSION_INITIATE, PERMISSION_REVIEW, PERMISSION_ADMIN, PERMISSION_TRADE, PERMISSION_VIDEO_APPROVE, PERMISSION_TEAM_APPROVE, PERMISSION_WEB3_SIGN]

### Return type

[**CoinbaseEngPrimeApiApiGetUserEntityLevelPermissionResponse**](CoinbaseEngPrimeApiApiGetUserEntityLevelPermissionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetUserHierarchy"></a>
# **primeAPIGetUserHierarchy**
> CoinbaseEngPrimeApiApiGetUserHierarchyResponse primeAPIGetUserHierarchy(userId, experiences)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String userId = "userId_example"; // String | The user ID, use 'self' to get the current user.
List<String> experiences = Arrays.asList("experiences_example"); // List<String> | 
try {
    CoinbaseEngPrimeApiApiGetUserHierarchyResponse result = apiInstance.primeAPIGetUserHierarchy(userId, experiences);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetUserHierarchy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| The user ID, use &#39;self&#39; to get the current user. |
 **experiences** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: EXPERIENCE_UNKNOWN, EXPERIENCE_PRIME, EXPERIENCE_PRIME_VAULT_ONLY, EXPERIENCE_CUSTODY, EXPERIENCE_ALL]

### Return type

[**CoinbaseEngPrimeApiApiGetUserHierarchyResponse**](CoinbaseEngPrimeApiApiGetUserHierarchyResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetUserInAppNotifications"></a>
# **primeAPIGetUserInAppNotifications**
> CoinbaseEngPrimeApiApiGetUserInAppNotificationsResponse primeAPIGetUserInAppNotifications(limit, portfolioFilterPortfolioId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
Integer limit = 56; // Integer | 
String portfolioFilterPortfolioId = "portfolioFilterPortfolioId_example"; // String | 
try {
    CoinbaseEngPrimeApiApiGetUserInAppNotificationsResponse result = apiInstance.primeAPIGetUserInAppNotifications(limit, portfolioFilterPortfolioId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetUserInAppNotifications");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**|  | [optional]
 **portfolioFilterPortfolioId** | **String**|  | [optional]

### Return type

[**CoinbaseEngPrimeApiApiGetUserInAppNotificationsResponse**](CoinbaseEngPrimeApiApiGetUserInAppNotificationsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetUserInAppNotificationsStream"></a>
# **primeAPIGetUserInAppNotificationsStream**
> StreamResultOfCoinbaseEngPrimeApiApiGetUserInAppNotificationsStreamResponse primeAPIGetUserInAppNotificationsStream(limit, portfolioFilterPortfolioId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
Integer limit = 56; // Integer | 
String portfolioFilterPortfolioId = "portfolioFilterPortfolioId_example"; // String | 
try {
    StreamResultOfCoinbaseEngPrimeApiApiGetUserInAppNotificationsStreamResponse result = apiInstance.primeAPIGetUserInAppNotificationsStream(limit, portfolioFilterPortfolioId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetUserInAppNotificationsStream");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**|  | [optional]
 **portfolioFilterPortfolioId** | **String**|  | [optional]

### Return type

[**StreamResultOfCoinbaseEngPrimeApiApiGetUserInAppNotificationsStreamResponse**](StreamResultOfCoinbaseEngPrimeApiApiGetUserInAppNotificationsStreamResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetUserInfo"></a>
# **primeAPIGetUserInfo**
> CoinbaseEngPrimeApiApiGetUserInfoResponse primeAPIGetUserInfo(userId, portfolioId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String userId = "userId_example"; // String | The user ID, use 'self' to get the current user.
String portfolioId = "portfolioId_example"; // String | The portfolio ID, used to verify permission.
try {
    CoinbaseEngPrimeApiApiGetUserInfoResponse result = apiInstance.primeAPIGetUserInfo(userId, portfolioId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetUserInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| The user ID, use &#39;self&#39; to get the current user. |
 **portfolioId** | **String**| The portfolio ID, used to verify permission. | [optional]

### Return type

[**CoinbaseEngPrimeApiApiGetUserInfoResponse**](CoinbaseEngPrimeApiApiGetUserInfoResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetUserInvitations"></a>
# **primeAPIGetUserInvitations**
> CoinbaseEngPrimeApiApiGetInvitationsResponse primeAPIGetUserInvitations(states)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
List<String> states = Arrays.asList("states_example"); // List<String> | 
try {
    CoinbaseEngPrimeApiApiGetInvitationsResponse result = apiInstance.primeAPIGetUserInvitations(states);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetUserInvitations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **states** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: INVITATION_STATE_UNKNOWN, INVITATION_STATE_CREATED, INVITATION_STATE_APPROVED, INVITATION_STATE_REJECTED, INVITATION_STATE_ACCEPTED, INVITATION_STATE_ADMIN_CREATED, INVITATION_STATE_EXPIRED, INVITATION_STATE_REQUESTED, INVITATION_STATE_USER_REJECTED]

### Return type

[**CoinbaseEngPrimeApiApiGetInvitationsResponse**](CoinbaseEngPrimeApiApiGetInvitationsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetUserPortfolios"></a>
# **primeAPIGetUserPortfolios**
> CoinbaseEngPrimeApiApiGetUserPortfoliosResponse primeAPIGetUserPortfolios(userId, paginationLimit, paginationOffset)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String userId = "userId_example"; // String | 
Integer paginationLimit = 56; // Integer | 
Integer paginationOffset = 56; // Integer | 
try {
    CoinbaseEngPrimeApiApiGetUserPortfoliosResponse result = apiInstance.primeAPIGetUserPortfolios(userId, paginationLimit, paginationOffset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetUserPortfolios");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**|  |
 **paginationLimit** | **Integer**|  | [optional]
 **paginationOffset** | **Integer**|  | [optional]

### Return type

[**CoinbaseEngPrimeApiApiGetUserPortfoliosResponse**](CoinbaseEngPrimeApiApiGetUserPortfoliosResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetUserPreferences"></a>
# **primeAPIGetUserPreferences**
> CoinbaseEngPrimeApiApiUserPreferences primeAPIGetUserPreferences(userId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String userId = "userId_example"; // String | 
try {
    CoinbaseEngPrimeApiApiUserPreferences result = apiInstance.primeAPIGetUserPreferences(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetUserPreferences");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**|  |

### Return type

[**CoinbaseEngPrimeApiApiUserPreferences**](CoinbaseEngPrimeApiApiUserPreferences.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetUserRoles"></a>
# **primeAPIGetUserRoles**
> CoinbaseEngPrimeApiApiGetUserRolesResponse primeAPIGetUserRoles(userId, portfolioId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String userId = "userId_example"; // String | 
String portfolioId = "portfolioId_example"; // String | 
try {
    CoinbaseEngPrimeApiApiGetUserRolesResponse result = apiInstance.primeAPIGetUserRoles(userId, portfolioId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetUserRoles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**|  |
 **portfolioId** | **String**|  |

### Return type

[**CoinbaseEngPrimeApiApiGetUserRolesResponse**](CoinbaseEngPrimeApiApiGetUserRolesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetVehicleBalances"></a>
# **primeAPIGetVehicleBalances**
> CoinbaseCustodyApiGetBalanceResponse primeAPIGetVehicleBalances(vehicleId, currencySymbol)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String vehicleId = "vehicleId_example"; // String | The ID of the vehicle to get balances for
String currencySymbol = "currencySymbol_example"; // String | Optional filter for symbol of the currency to get balances for
try {
    CoinbaseCustodyApiGetBalanceResponse result = apiInstance.primeAPIGetVehicleBalances(vehicleId, currencySymbol);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetVehicleBalances");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vehicleId** | **String**| The ID of the vehicle to get balances for |
 **currencySymbol** | **String**| Optional filter for symbol of the currency to get balances for | [optional]

### Return type

[**CoinbaseCustodyApiGetBalanceResponse**](CoinbaseCustodyApiGetBalanceResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetVehicleBalancesStream"></a>
# **primeAPIGetVehicleBalancesStream**
> StreamResultOfCoinbaseEngPrimeApiApiGetBalancesStreamResponse primeAPIGetVehicleBalancesStream(vehicleId, currencySymbol)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String vehicleId = "vehicleId_example"; // String | The ID of the vehicle to get balances for
String currencySymbol = "currencySymbol_example"; // String | Optional filter for symbol of the currency to get balances for
try {
    StreamResultOfCoinbaseEngPrimeApiApiGetBalancesStreamResponse result = apiInstance.primeAPIGetVehicleBalancesStream(vehicleId, currencySymbol);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetVehicleBalancesStream");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vehicleId** | **String**| The ID of the vehicle to get balances for |
 **currencySymbol** | **String**| Optional filter for symbol of the currency to get balances for | [optional]

### Return type

[**StreamResultOfCoinbaseEngPrimeApiApiGetBalancesStreamResponse**](StreamResultOfCoinbaseEngPrimeApiApiGetBalancesStreamResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetVehicleBillingPermission"></a>
# **primeAPIGetVehicleBillingPermission**
> CoinbaseEngPrimeApiApiGetVehicleBillingPermissionResponse primeAPIGetVehicleBillingPermission(portfolioId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String portfolioId = "portfolioId_example"; // String | 
try {
    CoinbaseEngPrimeApiApiGetVehicleBillingPermissionResponse result = apiInstance.primeAPIGetVehicleBillingPermission(portfolioId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetVehicleBillingPermission");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**|  |

### Return type

[**CoinbaseEngPrimeApiApiGetVehicleBillingPermissionResponse**](CoinbaseEngPrimeApiApiGetVehicleBillingPermissionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetVehicleCurrencies"></a>
# **primeAPIGetVehicleCurrencies**
> List&lt;CoinbaseCustodyApiCurrency&gt; primeAPIGetVehicleCurrencies(vehicleId, currencySymbols, onlyBillableCurrencies)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String vehicleId = "vehicleId_example"; // String | 
List<String> currencySymbols = Arrays.asList("currencySymbols_example"); // List<String> | 
Boolean onlyBillableCurrencies = true; // Boolean | 
try {
    List<CoinbaseCustodyApiCurrency> result = apiInstance.primeAPIGetVehicleCurrencies(vehicleId, currencySymbols, onlyBillableCurrencies);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetVehicleCurrencies");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vehicleId** | **String**|  |
 **currencySymbols** | [**List&lt;String&gt;**](String.md)|  | [optional]
 **onlyBillableCurrencies** | **Boolean**|  | [optional]

### Return type

[**List&lt;CoinbaseCustodyApiCurrency&gt;**](CoinbaseCustodyApiCurrency.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetVehicleCurrenciesStream"></a>
# **primeAPIGetVehicleCurrenciesStream**
> StreamResultOfCoinbaseEngPrimeApiApiGetVehicleCurrenciesStreamResponse primeAPIGetVehicleCurrenciesStream(vehicleId, currencySymbols, onlyBillableCurrencies)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String vehicleId = "vehicleId_example"; // String | 
List<String> currencySymbols = Arrays.asList("currencySymbols_example"); // List<String> | 
Boolean onlyBillableCurrencies = true; // Boolean | 
try {
    StreamResultOfCoinbaseEngPrimeApiApiGetVehicleCurrenciesStreamResponse result = apiInstance.primeAPIGetVehicleCurrenciesStream(vehicleId, currencySymbols, onlyBillableCurrencies);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetVehicleCurrenciesStream");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vehicleId** | **String**|  |
 **currencySymbols** | [**List&lt;String&gt;**](String.md)|  | [optional]
 **onlyBillableCurrencies** | **Boolean**|  | [optional]

### Return type

[**StreamResultOfCoinbaseEngPrimeApiApiGetVehicleCurrenciesStreamResponse**](StreamResultOfCoinbaseEngPrimeApiApiGetVehicleCurrenciesStreamResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetVehicleFinancingStream"></a>
# **primeAPIGetVehicleFinancingStream**
> StreamResultOfCoinbaseEngPrimeApiApiVehicleFinancingStreamResponse primeAPIGetVehicleFinancingStream(vehicleId, updateInterval)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String vehicleId = "vehicleId_example"; // String | 
String updateInterval = "TWO_HUNDRED_FIFTY_MS_FINANCING"; // String | Amount of time in ms between updates
try {
    StreamResultOfCoinbaseEngPrimeApiApiVehicleFinancingStreamResponse result = apiInstance.primeAPIGetVehicleFinancingStream(vehicleId, updateInterval);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetVehicleFinancingStream");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vehicleId** | **String**|  |
 **updateInterval** | **String**| Amount of time in ms between updates | [default to TWO_HUNDRED_FIFTY_MS_FINANCING] [enum: TWO_HUNDRED_FIFTY_MS_FINANCING]

### Return type

[**StreamResultOfCoinbaseEngPrimeApiApiVehicleFinancingStreamResponse**](StreamResultOfCoinbaseEngPrimeApiApiVehicleFinancingStreamResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetVehiclePortfolioMarginStream"></a>
# **primeAPIGetVehiclePortfolioMarginStream**
> StreamResultOfCoinbaseEngPrimeApiApiVehiclePortfolioMarginStreamResponse primeAPIGetVehiclePortfolioMarginStream(vehicleId, updateInterval)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String vehicleId = "vehicleId_example"; // String | 
String updateInterval = "TWO_HUNDRED_FIFTY_MS_FINANCING"; // String | Amount of time in ms between updates
try {
    StreamResultOfCoinbaseEngPrimeApiApiVehiclePortfolioMarginStreamResponse result = apiInstance.primeAPIGetVehiclePortfolioMarginStream(vehicleId, updateInterval);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetVehiclePortfolioMarginStream");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vehicleId** | **String**|  |
 **updateInterval** | **String**| Amount of time in ms between updates | [default to TWO_HUNDRED_FIFTY_MS_FINANCING] [enum: TWO_HUNDRED_FIFTY_MS_FINANCING]

### Return type

[**StreamResultOfCoinbaseEngPrimeApiApiVehiclePortfolioMarginStreamResponse**](StreamResultOfCoinbaseEngPrimeApiApiVehiclePortfolioMarginStreamResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetVehiclePortfolioMarginStreamV2"></a>
# **primeAPIGetVehiclePortfolioMarginStreamV2**
> StreamResultOfCoinbaseEngPrimeApiApiVehiclePortfolioMarginStreamResponseV2 primeAPIGetVehiclePortfolioMarginStreamV2(vehicleId, updateInterval, marginSummaryContext)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String vehicleId = "vehicleId_example"; // String | 
String updateInterval = "TWO_HUNDRED_FIFTY_MS_FINANCING"; // String | Amount of time in ms between updates
String marginSummaryContext = "UNSPECIFIED"; // String | optional field to request a subset of MarginSummary data.
try {
    StreamResultOfCoinbaseEngPrimeApiApiVehiclePortfolioMarginStreamResponseV2 result = apiInstance.primeAPIGetVehiclePortfolioMarginStreamV2(vehicleId, updateInterval, marginSummaryContext);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetVehiclePortfolioMarginStreamV2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vehicleId** | **String**|  |
 **updateInterval** | **String**| Amount of time in ms between updates | [default to TWO_HUNDRED_FIFTY_MS_FINANCING] [enum: TWO_HUNDRED_FIFTY_MS_FINANCING]
 **marginSummaryContext** | **String**| optional field to request a subset of MarginSummary data. | [optional] [default to UNSPECIFIED] [enum: UNSPECIFIED, CREDIT_USAGE]

### Return type

[**StreamResultOfCoinbaseEngPrimeApiApiVehiclePortfolioMarginStreamResponseV2**](StreamResultOfCoinbaseEngPrimeApiApiVehiclePortfolioMarginStreamResponseV2.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetVehicleSpotPrices"></a>
# **primeAPIGetVehicleSpotPrices**
> Map&lt;String, CoinbaseEngPrimeApiApiSpotPrice&gt; primeAPIGetVehicleSpotPrices(vehicleId, fiatCurrencySymbol, currencySymbols)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String vehicleId = "vehicleId_example"; // String | 
String fiatCurrencySymbol = "fiatCurrencySymbol_example"; // String | 
List<String> currencySymbols = Arrays.asList("currencySymbols_example"); // List<String> | 
try {
    Map<String, CoinbaseEngPrimeApiApiSpotPrice> result = apiInstance.primeAPIGetVehicleSpotPrices(vehicleId, fiatCurrencySymbol, currencySymbols);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetVehicleSpotPrices");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vehicleId** | **String**|  |
 **fiatCurrencySymbol** | **String**|  | [optional]
 **currencySymbols** | [**List&lt;String&gt;**](String.md)|  | [optional]

### Return type

[**Map&lt;String, CoinbaseEngPrimeApiApiSpotPrice&gt;**](CoinbaseEngPrimeApiApiSpotPrice.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetVehicleSpotPricesStream"></a>
# **primeAPIGetVehicleSpotPricesStream**
> StreamResultOfCoinbaseEngPrimeApiApiGetVehicleSpotPricesStreamResponse primeAPIGetVehicleSpotPricesStream(vehicleId, fiatCurrencySymbol, currencySymbols)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String vehicleId = "vehicleId_example"; // String | 
String fiatCurrencySymbol = "fiatCurrencySymbol_example"; // String | 
List<String> currencySymbols = Arrays.asList("currencySymbols_example"); // List<String> | 
try {
    StreamResultOfCoinbaseEngPrimeApiApiGetVehicleSpotPricesStreamResponse result = apiInstance.primeAPIGetVehicleSpotPricesStream(vehicleId, fiatCurrencySymbol, currencySymbols);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetVehicleSpotPricesStream");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vehicleId** | **String**|  |
 **fiatCurrencySymbol** | **String**|  | [optional]
 **currencySymbols** | [**List&lt;String&gt;**](String.md)|  | [optional]

### Return type

[**StreamResultOfCoinbaseEngPrimeApiApiGetVehicleSpotPricesStreamResponse**](StreamResultOfCoinbaseEngPrimeApiApiGetVehicleSpotPricesStreamResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetVehicleValidators"></a>
# **primeAPIGetVehicleValidators**
> List&lt;CoinbaseCustodyApiStakingValidator&gt; primeAPIGetVehicleValidators(vehicleId, currencySymbol, walletId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String vehicleId = "vehicleId_example"; // String | 
String currencySymbol = "currencySymbol_example"; // String | 
String walletId = "walletId_example"; // String | 
try {
    List<CoinbaseCustodyApiStakingValidator> result = apiInstance.primeAPIGetVehicleValidators(vehicleId, currencySymbol, walletId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetVehicleValidators");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vehicleId** | **String**|  |
 **currencySymbol** | **String**|  |
 **walletId** | **String**|  | [optional]

### Return type

[**List&lt;CoinbaseCustodyApiStakingValidator&gt;**](CoinbaseCustodyApiStakingValidator.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetVideoUpload"></a>
# **primeAPIGetVideoUpload**
> CoinbaseCustodyApiVideoUpload primeAPIGetVideoUpload(uploadId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String uploadId = "uploadId_example"; // String | 
try {
    CoinbaseCustodyApiVideoUpload result = apiInstance.primeAPIGetVideoUpload(uploadId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetVideoUpload");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uploadId** | **String**|  |

### Return type

[**CoinbaseCustodyApiVideoUpload**](CoinbaseCustodyApiVideoUpload.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetVideoUploadPermissions"></a>
# **primeAPIGetVideoUploadPermissions**
> CoinbaseCustodyApiGetVideoUploadPermissionsResponse primeAPIGetVideoUploadPermissions(transactionId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String transactionId = "transactionId_example"; // String | 
try {
    CoinbaseCustodyApiGetVideoUploadPermissionsResponse result = apiInstance.primeAPIGetVideoUploadPermissions(transactionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetVideoUploadPermissions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transactionId** | **String**|  |

### Return type

[**CoinbaseCustodyApiGetVideoUploadPermissionsResponse**](CoinbaseCustodyApiGetVideoUploadPermissionsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetWallet"></a>
# **primeAPIGetWallet**
> CoinbaseEngPrimeApiApiGetWalletResponse primeAPIGetWallet(portfolioId, walletId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String portfolioId = "portfolioId_example"; // String | 
String walletId = "walletId_example"; // String | 
try {
    CoinbaseEngPrimeApiApiGetWalletResponse result = apiInstance.primeAPIGetWallet(portfolioId, walletId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetWallet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**|  |
 **walletId** | **String**|  |

### Return type

[**CoinbaseEngPrimeApiApiGetWalletResponse**](CoinbaseEngPrimeApiApiGetWalletResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetWalletAssetSettings"></a>
# **primeAPIGetWalletAssetSettings**
> CoinbaseEngPrimeApiApiGetWalletAssetSettingsResponse primeAPIGetWalletAssetSettings(portfolioId, walletId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String portfolioId = "portfolioId_example"; // String | 
String walletId = "walletId_example"; // String | 
try {
    CoinbaseEngPrimeApiApiGetWalletAssetSettingsResponse result = apiInstance.primeAPIGetWalletAssetSettings(portfolioId, walletId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetWalletAssetSettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**|  |
 **walletId** | **String**|  |

### Return type

[**CoinbaseEngPrimeApiApiGetWalletAssetSettingsResponse**](CoinbaseEngPrimeApiApiGetWalletAssetSettingsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetWalletBalances"></a>
# **primeAPIGetWalletBalances**
> CoinbaseCustodyApiGetBalanceResponse primeAPIGetWalletBalances(portfolioId, walletId, currencySymbol)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String portfolioId = "portfolioId_example"; // String | The ID of the portfolio that contains the wallet
String walletId = "walletId_example"; // String | The ID of the wallet to get balances for
String currencySymbol = "currencySymbol_example"; // String | Optional filter for symbol of the currency to get balances for
try {
    CoinbaseCustodyApiGetBalanceResponse result = apiInstance.primeAPIGetWalletBalances(portfolioId, walletId, currencySymbol);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetWalletBalances");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**| The ID of the portfolio that contains the wallet |
 **walletId** | **String**| The ID of the wallet to get balances for |
 **currencySymbol** | **String**| Optional filter for symbol of the currency to get balances for | [optional]

### Return type

[**CoinbaseCustodyApiGetBalanceResponse**](CoinbaseCustodyApiGetBalanceResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetWalletBalancesStream"></a>
# **primeAPIGetWalletBalancesStream**
> StreamResultOfCoinbaseEngPrimeApiApiGetBalancesStreamResponse primeAPIGetWalletBalancesStream(portfolioId, walletId, currencySymbol)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String portfolioId = "portfolioId_example"; // String | The ID of the portfolio that contains the wallet
String walletId = "walletId_example"; // String | The ID of the wallet to get balances for
String currencySymbol = "currencySymbol_example"; // String | Optional filter for symbol of the currency to get balances for
try {
    StreamResultOfCoinbaseEngPrimeApiApiGetBalancesStreamResponse result = apiInstance.primeAPIGetWalletBalancesStream(portfolioId, walletId, currencySymbol);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetWalletBalancesStream");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**| The ID of the portfolio that contains the wallet |
 **walletId** | **String**| The ID of the wallet to get balances for |
 **currencySymbol** | **String**| Optional filter for symbol of the currency to get balances for | [optional]

### Return type

[**StreamResultOfCoinbaseEngPrimeApiApiGetBalancesStreamResponse**](StreamResultOfCoinbaseEngPrimeApiApiGetBalancesStreamResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetWalletDefiBalances"></a>
# **primeAPIGetWalletDefiBalances**
> CoinbaseEngPrimeApiApiGetWalletDefiBalancesResponse primeAPIGetWalletDefiBalances(portfolioId, walletId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String portfolioId = "portfolioId_example"; // String | The ID of the portfolio that contains the wallet
String walletId = "walletId_example"; // String | The ID of the wallet to get defi balances for
try {
    CoinbaseEngPrimeApiApiGetWalletDefiBalancesResponse result = apiInstance.primeAPIGetWalletDefiBalances(portfolioId, walletId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetWalletDefiBalances");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**| The ID of the portfolio that contains the wallet |
 **walletId** | **String**| The ID of the wallet to get defi balances for |

### Return type

[**CoinbaseEngPrimeApiApiGetWalletDefiBalancesResponse**](CoinbaseEngPrimeApiApiGetWalletDefiBalancesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetWalletRewardsStatus"></a>
# **primeAPIGetWalletRewardsStatus**
> CoinbaseCustodyApiWalletRewardsStatus primeAPIGetWalletRewardsStatus(portfolioId, walletId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String portfolioId = "portfolioId_example"; // String | 
String walletId = "walletId_example"; // String | 
try {
    CoinbaseCustodyApiWalletRewardsStatus result = apiInstance.primeAPIGetWalletRewardsStatus(portfolioId, walletId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetWalletRewardsStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**|  |
 **walletId** | **String**|  |

### Return type

[**CoinbaseCustodyApiWalletRewardsStatus**](CoinbaseCustodyApiWalletRewardsStatus.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetWalletStakingStatus"></a>
# **primeAPIGetWalletStakingStatus**
> CoinbaseCustodyApiWalletStakingStatus primeAPIGetWalletStakingStatus(portfolioId, walletId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String portfolioId = "portfolioId_example"; // String | 
String walletId = "walletId_example"; // String | 
try {
    CoinbaseCustodyApiWalletStakingStatus result = apiInstance.primeAPIGetWalletStakingStatus(portfolioId, walletId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetWalletStakingStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**|  |
 **walletId** | **String**|  |

### Return type

[**CoinbaseCustodyApiWalletStakingStatus**](CoinbaseCustodyApiWalletStakingStatus.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetWalletTokens"></a>
# **primeAPIGetWalletTokens**
> CoinbaseEngPrimeApiApiListWalletTokensResponse primeAPIGetWalletTokens(portfolioId, walletId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String portfolioId = "portfolioId_example"; // String | 
String walletId = "walletId_example"; // String | 
try {
    CoinbaseEngPrimeApiApiListWalletTokensResponse result = apiInstance.primeAPIGetWalletTokens(portfolioId, walletId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetWalletTokens");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**|  |
 **walletId** | **String**|  |

### Return type

[**CoinbaseEngPrimeApiApiListWalletTokensResponse**](CoinbaseEngPrimeApiApiListWalletTokensResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetWalletVestingStatus"></a>
# **primeAPIGetWalletVestingStatus**
> CoinbaseEngPrimeApiApiGetWalletVestingStatusResponse primeAPIGetWalletVestingStatus(portfolioId, walletId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String portfolioId = "portfolioId_example"; // String | 
String walletId = "walletId_example"; // String | 
try {
    CoinbaseEngPrimeApiApiGetWalletVestingStatusResponse result = apiInstance.primeAPIGetWalletVestingStatus(portfolioId, walletId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetWalletVestingStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**|  |
 **walletId** | **String**|  |

### Return type

[**CoinbaseEngPrimeApiApiGetWalletVestingStatusResponse**](CoinbaseEngPrimeApiApiGetWalletVestingStatusResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIGetWallets"></a>
# **primeAPIGetWallets**
> CoinbaseEngPrimeApiApiListWalletsResponse primeAPIGetWallets(portfolioId, states, currencySymbols, cursor, limit, sortDirection, search, types, actions, sortField)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String portfolioId = "portfolioId_example"; // String | 
List<String> states = Arrays.asList("states_example"); // List<String> | 
List<String> currencySymbols = Arrays.asList("currencySymbols_example"); // List<String> | 
String cursor = "cursor_example"; // String | Id to retrieve additional results strictly after.
Integer limit = 56; // Integer | Number of wallets to retrieve
String sortDirection = "DESC"; // String | Sorting order
String search = "search_example"; // String | Search query to match user name
List<String> types = Arrays.asList("types_example"); // List<String> | Filter to only return specified types
List<String> actions = Arrays.asList("actions_example"); // List<String> | Filter to only return specified available actions
String sortField = "sortField_example"; // String | Sorting field
try {
    CoinbaseEngPrimeApiApiListWalletsResponse result = apiInstance.primeAPIGetWallets(portfolioId, states, currencySymbols, cursor, limit, sortDirection, search, types, actions, sortField);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIGetWallets");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**|  |
 **states** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: WALLET_STATE_UNKNOWN, IN_USE, REMOVED, PENDING]
 **currencySymbols** | [**List&lt;String&gt;**](String.md)|  | [optional]
 **cursor** | **String**| Id to retrieve additional results strictly after. | [optional]
 **limit** | **Integer**| Number of wallets to retrieve | [optional]
 **sortDirection** | **String**| Sorting order | [optional] [default to DESC] [enum: DESC, ASC]
 **search** | **String**| Search query to match user name | [optional]
 **types** | [**List&lt;String&gt;**](String.md)| Filter to only return specified types | [optional] [enum: WALLET_TYPE_UNKNOWN, STANDARD, STAKING, VOTING, SECONDARY, SIGNALLING, TRADABLE, CONTRACT, PRIME_OMNIBUS_QC]
 **actions** | [**List&lt;String&gt;**](String.md)| Filter to only return specified available actions | [optional] [enum: WALLET_ACTION_UNKNOWN, DEPOSIT, WITHDRAW, DELEGATE, UNDELEGATE, UNSTAKE, RESTAKE, CHANGE_VALIDATOR, ENABLE_GOVERNANCE, DISABLE_GOVERNANCE, STAKE, VOTE, PARTIAL_STAKE, CONVERSION, CLAIM_REWARDS]
 **sortField** | **String**| Sorting field | [optional]

### Return type

[**CoinbaseEngPrimeApiApiListWalletsResponse**](CoinbaseEngPrimeApiApiListWalletsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIInitiateTransactionSigning"></a>
# **primeAPIInitiateTransactionSigning**
> CoinbaseEngPrimeApiApiInitiateTransactionSigningResponse primeAPIInitiateTransactionSigning(portfolioId, body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String portfolioId = "portfolioId_example"; // String | 
CoinbaseEngPrimeApiApiInitiateTransactionSigningRequest body = new CoinbaseEngPrimeApiApiInitiateTransactionSigningRequest(); // CoinbaseEngPrimeApiApiInitiateTransactionSigningRequest | 
try {
    CoinbaseEngPrimeApiApiInitiateTransactionSigningResponse result = apiInstance.primeAPIInitiateTransactionSigning(portfolioId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIInitiateTransactionSigning");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**|  |
 **body** | [**CoinbaseEngPrimeApiApiInitiateTransactionSigningRequest**](CoinbaseEngPrimeApiApiInitiateTransactionSigningRequest.md)|  |

### Return type

[**CoinbaseEngPrimeApiApiInitiateTransactionSigningResponse**](CoinbaseEngPrimeApiApiInitiateTransactionSigningResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIListActiveValidators"></a>
# **primeAPIListActiveValidators**
> CoinbaseEngPrimeApiApiListActiveValidatorsResponse primeAPIListActiveValidators(portfolioId, walletId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String portfolioId = "portfolioId_example"; // String | 
String walletId = "walletId_example"; // String | 
try {
    CoinbaseEngPrimeApiApiListActiveValidatorsResponse result = apiInstance.primeAPIListActiveValidators(portfolioId, walletId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIListActiveValidators");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**|  |
 **walletId** | **String**|  |

### Return type

[**CoinbaseEngPrimeApiApiListActiveValidatorsResponse**](CoinbaseEngPrimeApiApiListActiveValidatorsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIListBulkPoliciesForEntity"></a>
# **primeAPIListBulkPoliciesForEntity**
> CoinbaseEngPrimeApiApiListBulkPoliciesResponse primeAPIListBulkPoliciesForEntity(entityId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String entityId = "entityId_example"; // String | 
try {
    CoinbaseEngPrimeApiApiListBulkPoliciesResponse result = apiInstance.primeAPIListBulkPoliciesForEntity(entityId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIListBulkPoliciesForEntity");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **entityId** | **String**|  |

### Return type

[**CoinbaseEngPrimeApiApiListBulkPoliciesResponse**](CoinbaseEngPrimeApiApiListBulkPoliciesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIListDeviceGroups"></a>
# **primeAPIListDeviceGroups**
> CoinbaseEngPrimeApiApiListDeviceGroupsResponse primeAPIListDeviceGroups(listLevel, listIds)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String listLevel = "LIST_LEVEL_UNSPECIFIED"; // String | 
List<String> listIds = Arrays.asList("listIds_example"); // List<String> | 
try {
    CoinbaseEngPrimeApiApiListDeviceGroupsResponse result = apiInstance.primeAPIListDeviceGroups(listLevel, listIds);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIListDeviceGroups");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **listLevel** | **String**|  | [optional] [default to LIST_LEVEL_UNSPECIFIED] [enum: LIST_LEVEL_UNSPECIFIED, LIST_LEVEL_PORTFOLIO, LIST_LEVEL_ENTITY, LIST_LEVEL_ORGANIZATION]
 **listIds** | [**List&lt;String&gt;**](String.md)|  | [optional]

### Return type

[**CoinbaseEngPrimeApiApiListDeviceGroupsResponse**](CoinbaseEngPrimeApiApiListDeviceGroupsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIListInvitationsForUser"></a>
# **primeAPIListInvitationsForUser**
> CoinbaseEngPrimeApiApiListUserInvitationResponse primeAPIListInvitationsForUser(entityId, email)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String entityId = "entityId_example"; // String | 
String email = "email_example"; // String | 
try {
    CoinbaseEngPrimeApiApiListUserInvitationResponse result = apiInstance.primeAPIListInvitationsForUser(entityId, email);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIListInvitationsForUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **entityId** | **String**|  |
 **email** | **String**|  | [optional]

### Return type

[**CoinbaseEngPrimeApiApiListUserInvitationResponse**](CoinbaseEngPrimeApiApiListUserInvitationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIListPaymentMethods"></a>
# **primeAPIListPaymentMethods**
> CoinbaseEngPrimeApiApiListPaymentMethodsResponse primeAPIListPaymentMethods(vehicleId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String vehicleId = "vehicleId_example"; // String | 
try {
    CoinbaseEngPrimeApiApiListPaymentMethodsResponse result = apiInstance.primeAPIListPaymentMethods(vehicleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIListPaymentMethods");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vehicleId** | **String**|  |

### Return type

[**CoinbaseEngPrimeApiApiListPaymentMethodsResponse**](CoinbaseEngPrimeApiApiListPaymentMethodsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIListPolicies"></a>
# **primeAPIListPolicies**
> EngPrimePolicyApiListPoliciesResponse primeAPIListPolicies(portfolioId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String portfolioId = "portfolioId_example"; // String | Portfolio ID
try {
    EngPrimePolicyApiListPoliciesResponse result = apiInstance.primeAPIListPolicies(portfolioId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIListPolicies");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**| Portfolio ID |

### Return type

[**EngPrimePolicyApiListPoliciesResponse**](EngPrimePolicyApiListPoliciesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIListReportingCenterData"></a>
# **primeAPIListReportingCenterData**
> CoinbaseEngPrimeApiApiListReportingCenterDataResponse primeAPIListReportingCenterData(vehicleId, portfolioIds, cursor, limit, year, type)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String vehicleId = "vehicleId_example"; // String | 
List<String> portfolioIds = Arrays.asList("portfolioIds_example"); // List<String> | 
String cursor = "cursor_example"; // String | 
String limit = "limit_example"; // String | 
String year = "year_example"; // String | 
String type = "REPORT_TYPE_UNSPECIFIED"; // String | 
try {
    CoinbaseEngPrimeApiApiListReportingCenterDataResponse result = apiInstance.primeAPIListReportingCenterData(vehicleId, portfolioIds, cursor, limit, year, type);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIListReportingCenterData");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vehicleId** | **String**|  |
 **portfolioIds** | [**List&lt;String&gt;**](String.md)|  | [optional]
 **cursor** | **String**|  | [optional]
 **limit** | **String**|  | [optional]
 **year** | **String**|  | [optional]
 **type** | **String**|  | [optional] [default to REPORT_TYPE_UNSPECIFIED] [enum: REPORT_TYPE_UNSPECIFIED, REPORT_TYPE_MONTHLY_STATEMENT]

### Return type

[**CoinbaseEngPrimeApiApiListReportingCenterDataResponse**](CoinbaseEngPrimeApiApiListReportingCenterDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIListSignerIdsForActivity"></a>
# **primeAPIListSignerIdsForActivity**
> CoinbaseEngPrimeApiApiListSignerIdsForActivityResponse primeAPIListSignerIdsForActivity(portfolioId, activityId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String portfolioId = "portfolioId_example"; // String | 
String activityId = "activityId_example"; // String | 
try {
    CoinbaseEngPrimeApiApiListSignerIdsForActivityResponse result = apiInstance.primeAPIListSignerIdsForActivity(portfolioId, activityId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIListSignerIdsForActivity");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**|  |
 **activityId** | **String**|  |

### Return type

[**CoinbaseEngPrimeApiApiListSignerIdsForActivityResponse**](CoinbaseEngPrimeApiApiListSignerIdsForActivityResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIListTradingWalletCryptoDepositAddresses"></a>
# **primeAPIListTradingWalletCryptoDepositAddresses**
> CoinbaseEngPrimeApiApiListTradingWalletCryptoDepositAddressesResponse primeAPIListTradingWalletCryptoDepositAddresses(portfolioId, walletId, search, cursor, limit, sortDirection)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String portfolioId = "portfolioId_example"; // String | 
String walletId = "walletId_example"; // String | 
String search = "search_example"; // String | 
String cursor = "cursor_example"; // String | Id to retrieve additional results strictly after.
Integer limit = 56; // Integer | Number of addresses to retrieve
String sortDirection = "DESC"; // String | Sorting order
try {
    CoinbaseEngPrimeApiApiListTradingWalletCryptoDepositAddressesResponse result = apiInstance.primeAPIListTradingWalletCryptoDepositAddresses(portfolioId, walletId, search, cursor, limit, sortDirection);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIListTradingWalletCryptoDepositAddresses");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**|  |
 **walletId** | **String**|  |
 **search** | **String**|  | [optional]
 **cursor** | **String**| Id to retrieve additional results strictly after. | [optional]
 **limit** | **Integer**| Number of addresses to retrieve | [optional]
 **sortDirection** | **String**| Sorting order | [optional] [default to DESC] [enum: DESC, ASC]

### Return type

[**CoinbaseEngPrimeApiApiListTradingWalletCryptoDepositAddressesResponse**](CoinbaseEngPrimeApiApiListTradingWalletCryptoDepositAddressesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIListVideoUploads"></a>
# **primeAPIListVideoUploads**
> CoinbaseCustodyApiListVideoUploadsResponse primeAPIListVideoUploads(transactionId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String transactionId = "transactionId_example"; // String | 
try {
    CoinbaseCustodyApiListVideoUploadsResponse result = apiInstance.primeAPIListVideoUploads(transactionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIListVideoUploads");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transactionId** | **String**|  | [optional]

### Return type

[**CoinbaseCustodyApiListVideoUploadsResponse**](CoinbaseCustodyApiListVideoUploadsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIListWalletsV2"></a>
# **primeAPIListWalletsV2**
> CoinbaseEngPrimeApiApiListWalletsV2Response primeAPIListWalletsV2(portfolioId, states, currencySymbols, types, cursor, limit, sortDirection, fetchWalletOptionResolveBalances, fetchWalletOptionResolveCurrency, fetchWalletOptionResolveStakingInfo, fetchWalletOptionResolveVestingInfo, fetchWalletOptionResolveAvailableActions, name, sortBy, actions)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String portfolioId = "portfolioId_example"; // String | 
List<String> states = Arrays.asList("states_example"); // List<String> | Filter to only return specified states
List<String> currencySymbols = Arrays.asList("currencySymbols_example"); // List<String> | 
List<String> types = Arrays.asList("types_example"); // List<String> | Filter to only return specified types
String cursor = "cursor_example"; // String | Id to retrieve additional results strictly after.
String limit = "limit_example"; // String | Number of wallets to retrieve
String sortDirection = "DESC"; // String | Sorting order
Boolean fetchWalletOptionResolveBalances = true; // Boolean | 
Boolean fetchWalletOptionResolveCurrency = true; // Boolean | 
Boolean fetchWalletOptionResolveStakingInfo = true; // Boolean | 
Boolean fetchWalletOptionResolveVestingInfo = true; // Boolean | 
Boolean fetchWalletOptionResolveAvailableActions = true; // Boolean | 
String name = "name_example"; // String | Filter wallets that contain given name
String sortBy = "LIST_WALLETS_SORT_BY_UNSPECIFIED"; // String | Sorting By
List<String> actions = Arrays.asList("actions_example"); // List<String> | Filter to only return specified available actions
try {
    CoinbaseEngPrimeApiApiListWalletsV2Response result = apiInstance.primeAPIListWalletsV2(portfolioId, states, currencySymbols, types, cursor, limit, sortDirection, fetchWalletOptionResolveBalances, fetchWalletOptionResolveCurrency, fetchWalletOptionResolveStakingInfo, fetchWalletOptionResolveVestingInfo, fetchWalletOptionResolveAvailableActions, name, sortBy, actions);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIListWalletsV2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**|  |
 **states** | [**List&lt;String&gt;**](String.md)| Filter to only return specified states | [optional] [enum: WALLET_STATE_UNKNOWN, WALLET_STATE_PENDING, WALLET_STATE_IN_USE, WALLET_STATE_REMOVED]
 **currencySymbols** | [**List&lt;String&gt;**](String.md)|  | [optional]
 **types** | [**List&lt;String&gt;**](String.md)| Filter to only return specified types | [optional] [enum: WALLET_TYPE_UNKNOWN, WALLET_TYPE_COLD, WALLET_TYPE_TRADING, WALLET_TYPE_WEB3, WALLET_TYPE_PRIME_OMNIBUS_QC]
 **cursor** | **String**| Id to retrieve additional results strictly after. | [optional]
 **limit** | **String**| Number of wallets to retrieve | [optional]
 **sortDirection** | **String**| Sorting order | [optional] [default to DESC] [enum: DESC, ASC]
 **fetchWalletOptionResolveBalances** | **Boolean**|  | [optional]
 **fetchWalletOptionResolveCurrency** | **Boolean**|  | [optional]
 **fetchWalletOptionResolveStakingInfo** | **Boolean**|  | [optional]
 **fetchWalletOptionResolveVestingInfo** | **Boolean**|  | [optional]
 **fetchWalletOptionResolveAvailableActions** | **Boolean**|  | [optional]
 **name** | **String**| Filter wallets that contain given name | [optional]
 **sortBy** | **String**| Sorting By | [optional] [default to LIST_WALLETS_SORT_BY_UNSPECIFIED] [enum: LIST_WALLETS_SORT_BY_UNSPECIFIED, LIST_WALLETS_SORT_BY_CREATED_AT, LIST_WALLETS_SORT_BY_BALANCE]
 **actions** | [**List&lt;String&gt;**](String.md)| Filter to only return specified available actions | [optional] [enum: WALLET_ACTION_UNKNOWN, WALLET_ACTION_WITHDRAWAL, WALLET_ACTION_DEPOSIT, WALLET_ACTION_STAKE, WALLET_ACTION_UNSTAKE, WALLET_ACTION_GOVERNANCE, WALLET_ACTION_PARTIAL_STAKE, WALLET_ACTION_VESTING, WALLET_ACTION_VOTING, WALLET_ACTION_RESTAKING, WALLET_ACTION_CHANGE_VALIDATOR, WALLET_ACTION_DELEGATE, WALLET_ACTION_CONVERSION]

### Return type

[**CoinbaseEngPrimeApiApiListWalletsV2Response**](CoinbaseEngPrimeApiApiListWalletsV2Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIListWeb3SecurityKeys"></a>
# **primeAPIListWeb3SecurityKeys**
> CoinbaseEngPrimeApiApiListWeb3SecurityKeysResponse primeAPIListWeb3SecurityKeys(portfolioId, includeArchived)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String portfolioId = "portfolioId_example"; // String | 
Boolean includeArchived = true; // Boolean | 
try {
    CoinbaseEngPrimeApiApiListWeb3SecurityKeysResponse result = apiInstance.primeAPIListWeb3SecurityKeys(portfolioId, includeArchived);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIListWeb3SecurityKeys");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**|  |
 **includeArchived** | **Boolean**|  | [optional]

### Return type

[**CoinbaseEngPrimeApiApiListWeb3SecurityKeysResponse**](CoinbaseEngPrimeApiApiListWeb3SecurityKeysResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIPostAcceptInvitation"></a>
# **primeAPIPostAcceptInvitation**
> CoinbaseEngPrimeApiApiAcceptInvitationResponse primeAPIPostAcceptInvitation(invitationId, body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String invitationId = "invitationId_example"; // String | 
CoinbaseEngPrimeApiApiAcceptInvitationRequest body = new CoinbaseEngPrimeApiApiAcceptInvitationRequest(); // CoinbaseEngPrimeApiApiAcceptInvitationRequest | 
try {
    CoinbaseEngPrimeApiApiAcceptInvitationResponse result = apiInstance.primeAPIPostAcceptInvitation(invitationId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIPostAcceptInvitation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invitationId** | **String**|  |
 **body** | [**CoinbaseEngPrimeApiApiAcceptInvitationRequest**](CoinbaseEngPrimeApiApiAcceptInvitationRequest.md)|  |

### Return type

[**CoinbaseEngPrimeApiApiAcceptInvitationResponse**](CoinbaseEngPrimeApiApiAcceptInvitationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIPostActivateAPIKey"></a>
# **primeAPIPostActivateAPIKey**
> CoinbaseEngPrimeApiApiActivateAPIKeyResponse primeAPIPostActivateAPIKey(portfolioId, body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String portfolioId = "portfolioId_example"; // String | 
CoinbaseEngPrimeApiApiActivateAPIKeyRequest body = new CoinbaseEngPrimeApiApiActivateAPIKeyRequest(); // CoinbaseEngPrimeApiApiActivateAPIKeyRequest | 
try {
    CoinbaseEngPrimeApiApiActivateAPIKeyResponse result = apiInstance.primeAPIPostActivateAPIKey(portfolioId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIPostActivateAPIKey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**|  |
 **body** | [**CoinbaseEngPrimeApiApiActivateAPIKeyRequest**](CoinbaseEngPrimeApiApiActivateAPIKeyRequest.md)|  |

### Return type

[**CoinbaseEngPrimeApiApiActivateAPIKeyResponse**](CoinbaseEngPrimeApiApiActivateAPIKeyResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIPostActivateAPIKeyV2"></a>
# **primeAPIPostActivateAPIKeyV2**
> CoinbaseEngPrimeApiApiActivateAPIKeyResponse primeAPIPostActivateAPIKeyV2(groupId, body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String groupId = "groupId_example"; // String | 
CoinbaseEngPrimeApiApiActivateAPIKeyRequestV2 body = new CoinbaseEngPrimeApiApiActivateAPIKeyRequestV2(); // CoinbaseEngPrimeApiApiActivateAPIKeyRequestV2 | 
try {
    CoinbaseEngPrimeApiApiActivateAPIKeyResponse result = apiInstance.primeAPIPostActivateAPIKeyV2(groupId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIPostActivateAPIKeyV2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **String**|  |
 **body** | [**CoinbaseEngPrimeApiApiActivateAPIKeyRequestV2**](CoinbaseEngPrimeApiApiActivateAPIKeyRequestV2.md)|  |

### Return type

[**CoinbaseEngPrimeApiApiActivateAPIKeyResponse**](CoinbaseEngPrimeApiApiActivateAPIKeyResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIPostAddressBookEntry"></a>
# **primeAPIPostAddressBookEntry**
> CoinbaseEngPrimeApiApiPostAddressBookEntryResponse primeAPIPostAddressBookEntry(portfolioId, body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String portfolioId = "portfolioId_example"; // String | Portfolio id
CoinbaseEngPrimeApiApiPostAddressBookEntryRequest body = new CoinbaseEngPrimeApiApiPostAddressBookEntryRequest(); // CoinbaseEngPrimeApiApiPostAddressBookEntryRequest | 
try {
    CoinbaseEngPrimeApiApiPostAddressBookEntryResponse result = apiInstance.primeAPIPostAddressBookEntry(portfolioId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIPostAddressBookEntry");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**| Portfolio id |
 **body** | [**CoinbaseEngPrimeApiApiPostAddressBookEntryRequest**](CoinbaseEngPrimeApiApiPostAddressBookEntryRequest.md)|  |

### Return type

[**CoinbaseEngPrimeApiApiPostAddressBookEntryResponse**](CoinbaseEngPrimeApiApiPostAddressBookEntryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIPostAllocation"></a>
# **primeAPIPostAllocation**
> CoinbaseEngPrimeApiApiPostAllocationResponse primeAPIPostAllocation(sourcePortfolioId, body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String sourcePortfolioId = "sourcePortfolioId_example"; // String | The source portfolio id for the allocation
CoinbaseEngPrimeApiApiPostAllocationRequest body = new CoinbaseEngPrimeApiApiPostAllocationRequest(); // CoinbaseEngPrimeApiApiPostAllocationRequest | 
try {
    CoinbaseEngPrimeApiApiPostAllocationResponse result = apiInstance.primeAPIPostAllocation(sourcePortfolioId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIPostAllocation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sourcePortfolioId** | **String**| The source portfolio id for the allocation |
 **body** | [**CoinbaseEngPrimeApiApiPostAllocationRequest**](CoinbaseEngPrimeApiApiPostAllocationRequest.md)|  |

### Return type

[**CoinbaseEngPrimeApiApiPostAllocationResponse**](CoinbaseEngPrimeApiApiPostAllocationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIPostAllocationPreview"></a>
# **primeAPIPostAllocationPreview**
> CoinbaseEngPrimeApiApiPostAllocationPreviewResponse primeAPIPostAllocationPreview(sourcePortfolioId, body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String sourcePortfolioId = "sourcePortfolioId_example"; // String | The ID of the source portfolio id
CoinbaseEngPrimeApiApiPostAllocationPreviewRequest body = new CoinbaseEngPrimeApiApiPostAllocationPreviewRequest(); // CoinbaseEngPrimeApiApiPostAllocationPreviewRequest | 
try {
    CoinbaseEngPrimeApiApiPostAllocationPreviewResponse result = apiInstance.primeAPIPostAllocationPreview(sourcePortfolioId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIPostAllocationPreview");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sourcePortfolioId** | **String**| The ID of the source portfolio id |
 **body** | [**CoinbaseEngPrimeApiApiPostAllocationPreviewRequest**](CoinbaseEngPrimeApiApiPostAllocationPreviewRequest.md)|  |

### Return type

[**CoinbaseEngPrimeApiApiPostAllocationPreviewResponse**](CoinbaseEngPrimeApiApiPostAllocationPreviewResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIPostApprovePortfolioActivity"></a>
# **primeAPIPostApprovePortfolioActivity**
> CoinbaseEngPrimeApiApiPostApprovePortfolioActivityResponse primeAPIPostApprovePortfolioActivity(portfolioId, activityId, body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String portfolioId = "portfolioId_example"; // String | 
String activityId = "activityId_example"; // String | 
CoinbaseEngPrimeApiApiPostApprovePortfolioActivityRequest body = new CoinbaseEngPrimeApiApiPostApprovePortfolioActivityRequest(); // CoinbaseEngPrimeApiApiPostApprovePortfolioActivityRequest | 
try {
    CoinbaseEngPrimeApiApiPostApprovePortfolioActivityResponse result = apiInstance.primeAPIPostApprovePortfolioActivity(portfolioId, activityId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIPostApprovePortfolioActivity");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**|  |
 **activityId** | **String**|  |
 **body** | [**CoinbaseEngPrimeApiApiPostApprovePortfolioActivityRequest**](CoinbaseEngPrimeApiApiPostApprovePortfolioActivityRequest.md)|  |

### Return type

[**CoinbaseEngPrimeApiApiPostApprovePortfolioActivityResponse**](CoinbaseEngPrimeApiApiPostApprovePortfolioActivityResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIPostApproveVehicleActivity"></a>
# **primeAPIPostApproveVehicleActivity**
> CoinbaseEngPrimeApiApiPostApproveVehicleActivityResponse primeAPIPostApproveVehicleActivity(vehicleId, activityId, body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String vehicleId = "vehicleId_example"; // String | 
String activityId = "activityId_example"; // String | 
CoinbaseEngPrimeApiApiPostApproveVehicleActivityRequest body = new CoinbaseEngPrimeApiApiPostApproveVehicleActivityRequest(); // CoinbaseEngPrimeApiApiPostApproveVehicleActivityRequest | 
try {
    CoinbaseEngPrimeApiApiPostApproveVehicleActivityResponse result = apiInstance.primeAPIPostApproveVehicleActivity(vehicleId, activityId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIPostApproveVehicleActivity");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vehicleId** | **String**|  |
 **activityId** | **String**|  |
 **body** | [**CoinbaseEngPrimeApiApiPostApproveVehicleActivityRequest**](CoinbaseEngPrimeApiApiPostApproveVehicleActivityRequest.md)|  |

### Return type

[**CoinbaseEngPrimeApiApiPostApproveVehicleActivityResponse**](CoinbaseEngPrimeApiApiPostApproveVehicleActivityResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIPostBulkActionActivities"></a>
# **primeAPIPostBulkActionActivities**
> CoinbaseEngPrimeApiApiPostBulkActionActivitiesResponse primeAPIPostBulkActionActivities(body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
CoinbaseEngPrimeApiApiPostBulkActionActivitiesRequest body = new CoinbaseEngPrimeApiApiPostBulkActionActivitiesRequest(); // CoinbaseEngPrimeApiApiPostBulkActionActivitiesRequest | 
try {
    CoinbaseEngPrimeApiApiPostBulkActionActivitiesResponse result = apiInstance.primeAPIPostBulkActionActivities(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIPostBulkActionActivities");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CoinbaseEngPrimeApiApiPostBulkActionActivitiesRequest**](CoinbaseEngPrimeApiApiPostBulkActionActivitiesRequest.md)|  |

### Return type

[**CoinbaseEngPrimeApiApiPostBulkActionActivitiesResponse**](CoinbaseEngPrimeApiApiPostBulkActionActivitiesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIPostBulkActionSetting"></a>
# **primeAPIPostBulkActionSetting**
> CoinbaseEngPrimeApiApiPostBulkActionSettingsResponse primeAPIPostBulkActionSetting(body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
CoinbaseEngPrimeApiApiPostBulkActionSettingsRequest body = new CoinbaseEngPrimeApiApiPostBulkActionSettingsRequest(); // CoinbaseEngPrimeApiApiPostBulkActionSettingsRequest | 
try {
    CoinbaseEngPrimeApiApiPostBulkActionSettingsResponse result = apiInstance.primeAPIPostBulkActionSetting(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIPostBulkActionSetting");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CoinbaseEngPrimeApiApiPostBulkActionSettingsRequest**](CoinbaseEngPrimeApiApiPostBulkActionSettingsRequest.md)|  |

### Return type

[**CoinbaseEngPrimeApiApiPostBulkActionSettingsResponse**](CoinbaseEngPrimeApiApiPostBulkActionSettingsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIPostBulkInvitation"></a>
# **primeAPIPostBulkInvitation**
> CoinbaseEngPrimeApiApiPostBulkUserInvitationResponse primeAPIPostBulkInvitation(body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
CoinbaseEngPrimeApiApiPostBulkUserInvitationRequest body = new CoinbaseEngPrimeApiApiPostBulkUserInvitationRequest(); // CoinbaseEngPrimeApiApiPostBulkUserInvitationRequest | 
try {
    CoinbaseEngPrimeApiApiPostBulkUserInvitationResponse result = apiInstance.primeAPIPostBulkInvitation(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIPostBulkInvitation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CoinbaseEngPrimeApiApiPostBulkUserInvitationRequest**](CoinbaseEngPrimeApiApiPostBulkUserInvitationRequest.md)|  |

### Return type

[**CoinbaseEngPrimeApiApiPostBulkUserInvitationResponse**](CoinbaseEngPrimeApiApiPostBulkUserInvitationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIPostCancelOrder"></a>
# **primeAPIPostCancelOrder**
> CoinbaseEngPrimeApiApiPostCancelOrderResponseBody primeAPIPostCancelOrder(body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
CoinbaseEngPrimeApiApiPostCancelOrderRequest body = new CoinbaseEngPrimeApiApiPostCancelOrderRequest(); // CoinbaseEngPrimeApiApiPostCancelOrderRequest | 
try {
    CoinbaseEngPrimeApiApiPostCancelOrderResponseBody result = apiInstance.primeAPIPostCancelOrder(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIPostCancelOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CoinbaseEngPrimeApiApiPostCancelOrderRequest**](CoinbaseEngPrimeApiApiPostCancelOrderRequest.md)|  |

### Return type

[**CoinbaseEngPrimeApiApiPostCancelOrderResponseBody**](CoinbaseEngPrimeApiApiPostCancelOrderResponseBody.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIPostCreateAPIKey"></a>
# **primeAPIPostCreateAPIKey**
> CoinbaseEngPrimeApiApiCreateAPIKeyResponse primeAPIPostCreateAPIKey(portfolioId, body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String portfolioId = "portfolioId_example"; // String | 
CoinbaseEngPrimeApiApiCreateAPIKeyRequest body = new CoinbaseEngPrimeApiApiCreateAPIKeyRequest(); // CoinbaseEngPrimeApiApiCreateAPIKeyRequest | 
try {
    CoinbaseEngPrimeApiApiCreateAPIKeyResponse result = apiInstance.primeAPIPostCreateAPIKey(portfolioId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIPostCreateAPIKey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**|  |
 **body** | [**CoinbaseEngPrimeApiApiCreateAPIKeyRequest**](CoinbaseEngPrimeApiApiCreateAPIKeyRequest.md)|  |

### Return type

[**CoinbaseEngPrimeApiApiCreateAPIKeyResponse**](CoinbaseEngPrimeApiApiCreateAPIKeyResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIPostCreateAPIKeyV2"></a>
# **primeAPIPostCreateAPIKeyV2**
> CoinbaseEngPrimeApiApiCreateAPIKeyResponse primeAPIPostCreateAPIKeyV2(groupId, body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String groupId = "groupId_example"; // String | 
CoinbaseEngPrimeApiApiCreateAPIKeyRequestV2 body = new CoinbaseEngPrimeApiApiCreateAPIKeyRequestV2(); // CoinbaseEngPrimeApiApiCreateAPIKeyRequestV2 | 
try {
    CoinbaseEngPrimeApiApiCreateAPIKeyResponse result = apiInstance.primeAPIPostCreateAPIKeyV2(groupId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIPostCreateAPIKeyV2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **String**|  |
 **body** | [**CoinbaseEngPrimeApiApiCreateAPIKeyRequestV2**](CoinbaseEngPrimeApiApiCreateAPIKeyRequestV2.md)|  |

### Return type

[**CoinbaseEngPrimeApiApiCreateAPIKeyResponse**](CoinbaseEngPrimeApiApiCreateAPIKeyResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIPostDeactivateAPIKey"></a>
# **primeAPIPostDeactivateAPIKey**
> CoinbaseEngPrimeApiApiDeactivateAPIKeyResponse primeAPIPostDeactivateAPIKey(portfolioId, body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String portfolioId = "portfolioId_example"; // String | 
CoinbaseEngPrimeApiApiDeactivateAPIKeyRequest body = new CoinbaseEngPrimeApiApiDeactivateAPIKeyRequest(); // CoinbaseEngPrimeApiApiDeactivateAPIKeyRequest | 
try {
    CoinbaseEngPrimeApiApiDeactivateAPIKeyResponse result = apiInstance.primeAPIPostDeactivateAPIKey(portfolioId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIPostDeactivateAPIKey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**|  |
 **body** | [**CoinbaseEngPrimeApiApiDeactivateAPIKeyRequest**](CoinbaseEngPrimeApiApiDeactivateAPIKeyRequest.md)|  |

### Return type

[**CoinbaseEngPrimeApiApiDeactivateAPIKeyResponse**](CoinbaseEngPrimeApiApiDeactivateAPIKeyResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIPostDeactivateAPIKeyV2"></a>
# **primeAPIPostDeactivateAPIKeyV2**
> CoinbaseEngPrimeApiApiDeactivateAPIKeyResponse primeAPIPostDeactivateAPIKeyV2(groupId, body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String groupId = "groupId_example"; // String | 
CoinbaseEngPrimeApiApiDeactivateAPIKeyRequestV2 body = new CoinbaseEngPrimeApiApiDeactivateAPIKeyRequestV2(); // CoinbaseEngPrimeApiApiDeactivateAPIKeyRequestV2 | 
try {
    CoinbaseEngPrimeApiApiDeactivateAPIKeyResponse result = apiInstance.primeAPIPostDeactivateAPIKeyV2(groupId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIPostDeactivateAPIKeyV2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **String**|  |
 **body** | [**CoinbaseEngPrimeApiApiDeactivateAPIKeyRequestV2**](CoinbaseEngPrimeApiApiDeactivateAPIKeyRequestV2.md)|  |

### Return type

[**CoinbaseEngPrimeApiApiDeactivateAPIKeyResponse**](CoinbaseEngPrimeApiApiDeactivateAPIKeyResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIPostDelegationAccount"></a>
# **primeAPIPostDelegationAccount**
> CoinbaseEngPrimeApiApiPostDelegationAccountResponse primeAPIPostDelegationAccount(portfolioId, walletId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String portfolioId = "portfolioId_example"; // String | 
String walletId = "walletId_example"; // String | 
try {
    CoinbaseEngPrimeApiApiPostDelegationAccountResponse result = apiInstance.primeAPIPostDelegationAccount(portfolioId, walletId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIPostDelegationAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**|  |
 **walletId** | **String**|  |

### Return type

[**CoinbaseEngPrimeApiApiPostDelegationAccountResponse**](CoinbaseEngPrimeApiApiPostDelegationAccountResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIPostDocumentSignature"></a>
# **primeAPIPostDocumentSignature**
> CoinbaseEngPrimeApiApiPostDocumentSignatureResponse primeAPIPostDocumentSignature(vehicleId, documentKey, body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String vehicleId = "vehicleId_example"; // String | 
String documentKey = "documentKey_example"; // String | 
CoinbaseEngPrimeApiApiPostDocumentSignatureRequest body = new CoinbaseEngPrimeApiApiPostDocumentSignatureRequest(); // CoinbaseEngPrimeApiApiPostDocumentSignatureRequest | 
try {
    CoinbaseEngPrimeApiApiPostDocumentSignatureResponse result = apiInstance.primeAPIPostDocumentSignature(vehicleId, documentKey, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIPostDocumentSignature");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vehicleId** | **String**|  |
 **documentKey** | **String**|  | [enum: DOCUMENT_TYPE_UNKNOWN, DOCUMENT_TYPE_STAKING_ADDENDUM, DOCUMENT_TYPE_STACKING_ADDENDUM, DOCUMENT_TYPE_NFT_ADDENDUM, DOCUMENT_TYPE_ETH_STAKING_ADDENDUM, DOCUMENT_TYPE_WEB3_TERMS_AND_CONDITIONS, DOCUMENT_TYPE_LIQUID_STAKING_ADDENDUM, DOCUMENT_TYPE_LSETH_STAKING_ADDENDUM, DOCUMENT_TYPE_USDC_REWARDS_ADDENDUM]
 **body** | [**CoinbaseEngPrimeApiApiPostDocumentSignatureRequest**](CoinbaseEngPrimeApiApiPostDocumentSignatureRequest.md)|  |

### Return type

[**CoinbaseEngPrimeApiApiPostDocumentSignatureResponse**](CoinbaseEngPrimeApiApiPostDocumentSignatureResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIPostEntitySettings"></a>
# **primeAPIPostEntitySettings**
> CoinbaseEngPrimeApiApiPostEntitySettingsResponse primeAPIPostEntitySettings(entityId, key, body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String entityId = "entityId_example"; // String | 
String key = "key_example"; // String | 
CoinbaseEngPrimeApiApiPostEntitySettingsRequest body = new CoinbaseEngPrimeApiApiPostEntitySettingsRequest(); // CoinbaseEngPrimeApiApiPostEntitySettingsRequest | 
try {
    CoinbaseEngPrimeApiApiPostEntitySettingsResponse result = apiInstance.primeAPIPostEntitySettings(entityId, key, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIPostEntitySettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **entityId** | **String**|  |
 **key** | **String**|  | [enum: SETTINGS_KEY_UNKNOWN, SETTINGS_KEY_CONSENSUS_WITHDRAWAL, SETTINGS_KEY_MAX_WITHDRAWAL_AMOUNT, SETTINGS_KEY_TRUSTED_ADDRESS_PROTECTION, SETTINGS_KEY_MULTI_WALLETS, SETTINGS_KEY_API_KEY_GENERATION, SETTINGS_KEY_CONSENSUS_ONE, SETTINGS_KEY_SIGN_STAKING_ADDENDUM, SETTINGS_KEY_GOVERNANCE_VOTE_CONSENSUS, SETTINGS_KEY_REQUIRED_APPROVAL, SETTINGS_KEY_VIDEO_CONSENSUS, SETTINGS_KEY_ORGANIZATION_AUL_STATUS]
 **body** | [**CoinbaseEngPrimeApiApiPostEntitySettingsRequest**](CoinbaseEngPrimeApiApiPostEntitySettingsRequest.md)|  |

### Return type

[**CoinbaseEngPrimeApiApiPostEntitySettingsResponse**](CoinbaseEngPrimeApiApiPostEntitySettingsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIPostFidoChallenge"></a>
# **primeAPIPostFidoChallenge**
> CoinbaseEngPrimeApiApiPostFidoChallengeResponse primeAPIPostFidoChallenge(userId, body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String userId = "userId_example"; // String | User UUID.
CoinbaseEngPrimeApiApiPostFidoChallengeRequest body = new CoinbaseEngPrimeApiApiPostFidoChallengeRequest(); // CoinbaseEngPrimeApiApiPostFidoChallengeRequest | 
try {
    CoinbaseEngPrimeApiApiPostFidoChallengeResponse result = apiInstance.primeAPIPostFidoChallenge(userId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIPostFidoChallenge");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| User UUID. |
 **body** | [**CoinbaseEngPrimeApiApiPostFidoChallengeRequest**](CoinbaseEngPrimeApiApiPostFidoChallengeRequest.md)|  |

### Return type

[**CoinbaseEngPrimeApiApiPostFidoChallengeResponse**](CoinbaseEngPrimeApiApiPostFidoChallengeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIPostFidoChallengeCreate"></a>
# **primeAPIPostFidoChallengeCreate**
> CoinbaseEngPrimeApiApiPostFidoChallengeCreateResponse primeAPIPostFidoChallengeCreate(userId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String userId = "userId_example"; // String | User UUID.
try {
    CoinbaseEngPrimeApiApiPostFidoChallengeCreateResponse result = apiInstance.primeAPIPostFidoChallengeCreate(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIPostFidoChallengeCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| User UUID. |

### Return type

[**CoinbaseEngPrimeApiApiPostFidoChallengeCreateResponse**](CoinbaseEngPrimeApiApiPostFidoChallengeCreateResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIPostFidoRegistration"></a>
# **primeAPIPostFidoRegistration**
> CoinbaseEngPrimeApiApiPostFidoRegistrationResponse primeAPIPostFidoRegistration(userId, body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String userId = "userId_example"; // String | User UUID.
CoinbaseEngPrimeApiApiPostFidoRegistrationRequest body = new CoinbaseEngPrimeApiApiPostFidoRegistrationRequest(); // CoinbaseEngPrimeApiApiPostFidoRegistrationRequest | 
try {
    CoinbaseEngPrimeApiApiPostFidoRegistrationResponse result = apiInstance.primeAPIPostFidoRegistration(userId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIPostFidoRegistration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| User UUID. |
 **body** | [**CoinbaseEngPrimeApiApiPostFidoRegistrationRequest**](CoinbaseEngPrimeApiApiPostFidoRegistrationRequest.md)|  |

### Return type

[**CoinbaseEngPrimeApiApiPostFidoRegistrationResponse**](CoinbaseEngPrimeApiApiPostFidoRegistrationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIPostGovernanceStatus"></a>
# **primeAPIPostGovernanceStatus**
> CoinbaseEngPrimeApiApiPostGovernanceStatusResponseBody primeAPIPostGovernanceStatus(portfolioId, walletId, body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String portfolioId = "portfolioId_example"; // String | 
String walletId = "walletId_example"; // String | 
CoinbaseEngPrimeApiApiPostGovernanceStatusRequest body = new CoinbaseEngPrimeApiApiPostGovernanceStatusRequest(); // CoinbaseEngPrimeApiApiPostGovernanceStatusRequest | 
try {
    CoinbaseEngPrimeApiApiPostGovernanceStatusResponseBody result = apiInstance.primeAPIPostGovernanceStatus(portfolioId, walletId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIPostGovernanceStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**|  |
 **walletId** | **String**|  |
 **body** | [**CoinbaseEngPrimeApiApiPostGovernanceStatusRequest**](CoinbaseEngPrimeApiApiPostGovernanceStatusRequest.md)|  |

### Return type

[**CoinbaseEngPrimeApiApiPostGovernanceStatusResponseBody**](CoinbaseEngPrimeApiApiPostGovernanceStatusResponseBody.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIPostGovernanceVote"></a>
# **primeAPIPostGovernanceVote**
> CoinbaseEngPrimeApiApiPostGovernanceVoteResponse primeAPIPostGovernanceVote(portfolioId, walletId, body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String portfolioId = "portfolioId_example"; // String | 
String walletId = "walletId_example"; // String | 
CoinbaseEngPrimeApiApiPostGovernanceVoteRequest body = new CoinbaseEngPrimeApiApiPostGovernanceVoteRequest(); // CoinbaseEngPrimeApiApiPostGovernanceVoteRequest | 
try {
    CoinbaseEngPrimeApiApiPostGovernanceVoteResponse result = apiInstance.primeAPIPostGovernanceVote(portfolioId, walletId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIPostGovernanceVote");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**|  |
 **walletId** | **String**|  |
 **body** | [**CoinbaseEngPrimeApiApiPostGovernanceVoteRequest**](CoinbaseEngPrimeApiApiPostGovernanceVoteRequest.md)|  |

### Return type

[**CoinbaseEngPrimeApiApiPostGovernanceVoteResponse**](CoinbaseEngPrimeApiApiPostGovernanceVoteResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIPostInvitation"></a>
# **primeAPIPostInvitation**
> CoinbaseEngPrimeApiApiNewConsensusActivityResponse primeAPIPostInvitation(portfolioId, body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String portfolioId = "portfolioId_example"; // String | 
CoinbaseEngPrimeApiApiCreateInvitationRequest body = new CoinbaseEngPrimeApiApiCreateInvitationRequest(); // CoinbaseEngPrimeApiApiCreateInvitationRequest | 
try {
    CoinbaseEngPrimeApiApiNewConsensusActivityResponse result = apiInstance.primeAPIPostInvitation(portfolioId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIPostInvitation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**|  |
 **body** | [**CoinbaseEngPrimeApiApiCreateInvitationRequest**](CoinbaseEngPrimeApiApiCreateInvitationRequest.md)|  |

### Return type

[**CoinbaseEngPrimeApiApiNewConsensusActivityResponse**](CoinbaseEngPrimeApiApiNewConsensusActivityResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIPostNetAllocationPreview"></a>
# **primeAPIPostNetAllocationPreview**
> CoinbaseEngPrimeApiApiPostNetAllocationPreviewResponse primeAPIPostNetAllocationPreview(sourcePortfolioId, body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String sourcePortfolioId = "sourcePortfolioId_example"; // String | The ID of the source portfolio id
CoinbaseEngPrimeApiApiPostNetAllocationPreviewRequest body = new CoinbaseEngPrimeApiApiPostNetAllocationPreviewRequest(); // CoinbaseEngPrimeApiApiPostNetAllocationPreviewRequest | 
try {
    CoinbaseEngPrimeApiApiPostNetAllocationPreviewResponse result = apiInstance.primeAPIPostNetAllocationPreview(sourcePortfolioId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIPostNetAllocationPreview");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sourcePortfolioId** | **String**| The ID of the source portfolio id |
 **body** | [**CoinbaseEngPrimeApiApiPostNetAllocationPreviewRequest**](CoinbaseEngPrimeApiApiPostNetAllocationPreviewRequest.md)|  |

### Return type

[**CoinbaseEngPrimeApiApiPostNetAllocationPreviewResponse**](CoinbaseEngPrimeApiApiPostNetAllocationPreviewResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIPostOrder"></a>
# **primeAPIPostOrder**
> CoinbaseEngPrimeApiApiPostOrderResponseBody primeAPIPostOrder(body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
CoinbaseEngPrimeApiApiPostOrderRequest body = new CoinbaseEngPrimeApiApiPostOrderRequest(); // CoinbaseEngPrimeApiApiPostOrderRequest | 
try {
    CoinbaseEngPrimeApiApiPostOrderResponseBody result = apiInstance.primeAPIPostOrder(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIPostOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CoinbaseEngPrimeApiApiPostOrderRequest**](CoinbaseEngPrimeApiApiPostOrderRequest.md)|  |

### Return type

[**CoinbaseEngPrimeApiApiPostOrderResponseBody**](CoinbaseEngPrimeApiApiPostOrderResponseBody.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIPostOrderPreview"></a>
# **primeAPIPostOrderPreview**
> CoinbaseEngPrimeApiApiOrderPreviewResponseBody primeAPIPostOrderPreview(body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
CoinbaseEngPrimeApiApiPostOrderPreviewRequest body = new CoinbaseEngPrimeApiApiPostOrderPreviewRequest(); // CoinbaseEngPrimeApiApiPostOrderPreviewRequest | 
try {
    CoinbaseEngPrimeApiApiOrderPreviewResponseBody result = apiInstance.primeAPIPostOrderPreview(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIPostOrderPreview");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CoinbaseEngPrimeApiApiPostOrderPreviewRequest**](CoinbaseEngPrimeApiApiPostOrderPreviewRequest.md)|  |

### Return type

[**CoinbaseEngPrimeApiApiOrderPreviewResponseBody**](CoinbaseEngPrimeApiApiOrderPreviewResponseBody.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIPostPortfolioSettings"></a>
# **primeAPIPostPortfolioSettings**
> CoinbaseEngPrimeApiApiPostPortfolioSettingsResponse primeAPIPostPortfolioSettings(portfolioId, key, body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String portfolioId = "portfolioId_example"; // String | 
String key = "key_example"; // String | 
CoinbaseEngPrimeApiApiPostPortfolioSettingsRequest body = new CoinbaseEngPrimeApiApiPostPortfolioSettingsRequest(); // CoinbaseEngPrimeApiApiPostPortfolioSettingsRequest | 
try {
    CoinbaseEngPrimeApiApiPostPortfolioSettingsResponse result = apiInstance.primeAPIPostPortfolioSettings(portfolioId, key, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIPostPortfolioSettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**|  |
 **key** | **String**|  | [enum: SETTINGS_KEY_UNKNOWN, SETTINGS_KEY_CONSENSUS_WITHDRAWAL, SETTINGS_KEY_MAX_WITHDRAWAL_AMOUNT, SETTINGS_KEY_TRUSTED_ADDRESS_PROTECTION, SETTINGS_KEY_MULTI_WALLETS, SETTINGS_KEY_API_KEY_GENERATION, SETTINGS_KEY_CONSENSUS_ONE, SETTINGS_KEY_SIGN_STAKING_ADDENDUM, SETTINGS_KEY_GOVERNANCE_VOTE_CONSENSUS, SETTINGS_KEY_REQUIRED_APPROVAL, SETTINGS_KEY_VIDEO_CONSENSUS, SETTINGS_KEY_ORGANIZATION_AUL_STATUS]
 **body** | [**CoinbaseEngPrimeApiApiPostPortfolioSettingsRequest**](CoinbaseEngPrimeApiApiPostPortfolioSettingsRequest.md)|  |

### Return type

[**CoinbaseEngPrimeApiApiPostPortfolioSettingsResponse**](CoinbaseEngPrimeApiApiPostPortfolioSettingsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIPostPreviewUserChange"></a>
# **primeAPIPostPreviewUserChange**
> CoinbaseEngPrimeApiApiPostPreviewUserChangeResponse primeAPIPostPreviewUserChange(portfolioId, userId, body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String portfolioId = "portfolioId_example"; // String | 
String userId = "userId_example"; // String | 
CoinbaseEngPrimeApiApiPostPreviewUserChangeRequest body = new CoinbaseEngPrimeApiApiPostPreviewUserChangeRequest(); // CoinbaseEngPrimeApiApiPostPreviewUserChangeRequest | 
try {
    CoinbaseEngPrimeApiApiPostPreviewUserChangeResponse result = apiInstance.primeAPIPostPreviewUserChange(portfolioId, userId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIPostPreviewUserChange");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**|  |
 **userId** | **String**|  |
 **body** | [**CoinbaseEngPrimeApiApiPostPreviewUserChangeRequest**](CoinbaseEngPrimeApiApiPostPreviewUserChangeRequest.md)|  |

### Return type

[**CoinbaseEngPrimeApiApiPostPreviewUserChangeResponse**](CoinbaseEngPrimeApiApiPostPreviewUserChangeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIPostPushNotificationDeviceDeregistration"></a>
# **primeAPIPostPushNotificationDeviceDeregistration**
> Object primeAPIPostPushNotificationDeviceDeregistration(body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
CoinbaseEngPrimeApiApiPostPushNotificationDeviceDeregistrationRequest body = new CoinbaseEngPrimeApiApiPostPushNotificationDeviceDeregistrationRequest(); // CoinbaseEngPrimeApiApiPostPushNotificationDeviceDeregistrationRequest | 
try {
    Object result = apiInstance.primeAPIPostPushNotificationDeviceDeregistration(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIPostPushNotificationDeviceDeregistration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CoinbaseEngPrimeApiApiPostPushNotificationDeviceDeregistrationRequest**](CoinbaseEngPrimeApiApiPostPushNotificationDeviceDeregistrationRequest.md)|  |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIPostPushNotificationDeviceRegistration"></a>
# **primeAPIPostPushNotificationDeviceRegistration**
> Object primeAPIPostPushNotificationDeviceRegistration(body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
CoinbaseEngPrimeApiApiPostPushNotificationDeviceRegistrationRequest body = new CoinbaseEngPrimeApiApiPostPushNotificationDeviceRegistrationRequest(); // CoinbaseEngPrimeApiApiPostPushNotificationDeviceRegistrationRequest | 
try {
    Object result = apiInstance.primeAPIPostPushNotificationDeviceRegistration(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIPostPushNotificationDeviceRegistration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CoinbaseEngPrimeApiApiPostPushNotificationDeviceRegistrationRequest**](CoinbaseEngPrimeApiApiPostPushNotificationDeviceRegistrationRequest.md)|  |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIPostRejectPortfolioActivity"></a>
# **primeAPIPostRejectPortfolioActivity**
> CoinbaseEngPrimeApiApiPostRejectPortfolioActivityResponse primeAPIPostRejectPortfolioActivity(portfolioId, activityId, body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String portfolioId = "portfolioId_example"; // String | 
String activityId = "activityId_example"; // String | 
CoinbaseEngPrimeApiApiPostRejectPortfolioActivityRequest body = new CoinbaseEngPrimeApiApiPostRejectPortfolioActivityRequest(); // CoinbaseEngPrimeApiApiPostRejectPortfolioActivityRequest | 
try {
    CoinbaseEngPrimeApiApiPostRejectPortfolioActivityResponse result = apiInstance.primeAPIPostRejectPortfolioActivity(portfolioId, activityId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIPostRejectPortfolioActivity");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**|  |
 **activityId** | **String**|  |
 **body** | [**CoinbaseEngPrimeApiApiPostRejectPortfolioActivityRequest**](CoinbaseEngPrimeApiApiPostRejectPortfolioActivityRequest.md)|  |

### Return type

[**CoinbaseEngPrimeApiApiPostRejectPortfolioActivityResponse**](CoinbaseEngPrimeApiApiPostRejectPortfolioActivityResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIPostRejectVehicleActivity"></a>
# **primeAPIPostRejectVehicleActivity**
> CoinbaseEngPrimeApiApiPostRejectVehicleActivityResponse primeAPIPostRejectVehicleActivity(vehicleId, activityId, body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String vehicleId = "vehicleId_example"; // String | 
String activityId = "activityId_example"; // String | 
CoinbaseEngPrimeApiApiPostRejectVehicleActivityRequest body = new CoinbaseEngPrimeApiApiPostRejectVehicleActivityRequest(); // CoinbaseEngPrimeApiApiPostRejectVehicleActivityRequest | 
try {
    CoinbaseEngPrimeApiApiPostRejectVehicleActivityResponse result = apiInstance.primeAPIPostRejectVehicleActivity(vehicleId, activityId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIPostRejectVehicleActivity");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vehicleId** | **String**|  |
 **activityId** | **String**|  |
 **body** | [**CoinbaseEngPrimeApiApiPostRejectVehicleActivityRequest**](CoinbaseEngPrimeApiApiPostRejectVehicleActivityRequest.md)|  |

### Return type

[**CoinbaseEngPrimeApiApiPostRejectVehicleActivityResponse**](CoinbaseEngPrimeApiApiPostRejectVehicleActivityResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIPostReverseAllocation"></a>
# **primeAPIPostReverseAllocation**
> CoinbaseEngPrimeApiApiPostAllocationResponse primeAPIPostReverseAllocation(portfolioId, body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String portfolioId = "portfolioId_example"; // String | The ID of the portfolio of the allocation
CoinbaseEngPrimeApiApiPostReverseAllocationRequest body = new CoinbaseEngPrimeApiApiPostReverseAllocationRequest(); // CoinbaseEngPrimeApiApiPostReverseAllocationRequest | 
try {
    CoinbaseEngPrimeApiApiPostAllocationResponse result = apiInstance.primeAPIPostReverseAllocation(portfolioId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIPostReverseAllocation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**| The ID of the portfolio of the allocation |
 **body** | [**CoinbaseEngPrimeApiApiPostReverseAllocationRequest**](CoinbaseEngPrimeApiApiPostReverseAllocationRequest.md)|  |

### Return type

[**CoinbaseEngPrimeApiApiPostAllocationResponse**](CoinbaseEngPrimeApiApiPostAllocationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIPostUpdateBillingAddress"></a>
# **primeAPIPostUpdateBillingAddress**
> CoinbaseEngPrimeApiApiPostUpdateBillingAddressResponse primeAPIPostUpdateBillingAddress(vehicleId, body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String vehicleId = "vehicleId_example"; // String | 
CoinbaseEngPrimeApiApiPostUpdateBillingAddressRequest body = new CoinbaseEngPrimeApiApiPostUpdateBillingAddressRequest(); // CoinbaseEngPrimeApiApiPostUpdateBillingAddressRequest | 
try {
    CoinbaseEngPrimeApiApiPostUpdateBillingAddressResponse result = apiInstance.primeAPIPostUpdateBillingAddress(vehicleId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIPostUpdateBillingAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vehicleId** | **String**|  |
 **body** | [**CoinbaseEngPrimeApiApiPostUpdateBillingAddressRequest**](CoinbaseEngPrimeApiApiPostUpdateBillingAddressRequest.md)|  |

### Return type

[**CoinbaseEngPrimeApiApiPostUpdateBillingAddressResponse**](CoinbaseEngPrimeApiApiPostUpdateBillingAddressResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIPostUpdateBillingEmailList"></a>
# **primeAPIPostUpdateBillingEmailList**
> CoinbaseEngPrimeApiApiPostUpdateBillingEmailListResponse primeAPIPostUpdateBillingEmailList(vehicleId, body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String vehicleId = "vehicleId_example"; // String | 
CoinbaseEngPrimeApiApiPostUpdateBillingEmailListRequest body = new CoinbaseEngPrimeApiApiPostUpdateBillingEmailListRequest(); // CoinbaseEngPrimeApiApiPostUpdateBillingEmailListRequest | 
try {
    CoinbaseEngPrimeApiApiPostUpdateBillingEmailListResponse result = apiInstance.primeAPIPostUpdateBillingEmailList(vehicleId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIPostUpdateBillingEmailList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vehicleId** | **String**|  |
 **body** | [**CoinbaseEngPrimeApiApiPostUpdateBillingEmailListRequest**](CoinbaseEngPrimeApiApiPostUpdateBillingEmailListRequest.md)|  |

### Return type

[**CoinbaseEngPrimeApiApiPostUpdateBillingEmailListResponse**](CoinbaseEngPrimeApiApiPostUpdateBillingEmailListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIPostUpdateBillingPreference"></a>
# **primeAPIPostUpdateBillingPreference**
> CoinbaseEngPrimeApiApiNewConsensusActivityResponse primeAPIPostUpdateBillingPreference(vehicleId, body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String vehicleId = "vehicleId_example"; // String | 
CoinbaseEngPrimeApiApiPostUpdateBillingPreferenceRequest body = new CoinbaseEngPrimeApiApiPostUpdateBillingPreferenceRequest(); // CoinbaseEngPrimeApiApiPostUpdateBillingPreferenceRequest | 
try {
    CoinbaseEngPrimeApiApiNewConsensusActivityResponse result = apiInstance.primeAPIPostUpdateBillingPreference(vehicleId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIPostUpdateBillingPreference");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vehicleId** | **String**|  |
 **body** | [**CoinbaseEngPrimeApiApiPostUpdateBillingPreferenceRequest**](CoinbaseEngPrimeApiApiPostUpdateBillingPreferenceRequest.md)|  |

### Return type

[**CoinbaseEngPrimeApiApiNewConsensusActivityResponse**](CoinbaseEngPrimeApiApiNewConsensusActivityResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIPostUserInAppNotificationStatuses"></a>
# **primeAPIPostUserInAppNotificationStatuses**
> Object primeAPIPostUserInAppNotificationStatuses(body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
CoinbaseEngPrimeApiApiPostUserInAppNotificationStatusesRequest body = new CoinbaseEngPrimeApiApiPostUserInAppNotificationStatusesRequest(); // CoinbaseEngPrimeApiApiPostUserInAppNotificationStatusesRequest | 
try {
    Object result = apiInstance.primeAPIPostUserInAppNotificationStatuses(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIPostUserInAppNotificationStatuses");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CoinbaseEngPrimeApiApiPostUserInAppNotificationStatusesRequest**](CoinbaseEngPrimeApiApiPostUserInAppNotificationStatusesRequest.md)|  |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIPostUserPreferences"></a>
# **primeAPIPostUserPreferences**
> CoinbaseEngPrimeApiApiUserPreferences primeAPIPostUserPreferences(userId, body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String userId = "userId_example"; // String | 
CoinbaseEngPrimeApiApiPostUserPreferencesRequest body = new CoinbaseEngPrimeApiApiPostUserPreferencesRequest(); // CoinbaseEngPrimeApiApiPostUserPreferencesRequest | 
try {
    CoinbaseEngPrimeApiApiUserPreferences result = apiInstance.primeAPIPostUserPreferences(userId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIPostUserPreferences");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**|  |
 **body** | [**CoinbaseEngPrimeApiApiPostUserPreferencesRequest**](CoinbaseEngPrimeApiApiPostUserPreferencesRequest.md)|  |

### Return type

[**CoinbaseEngPrimeApiApiUserPreferences**](CoinbaseEngPrimeApiApiUserPreferences.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIPostUserUpdate"></a>
# **primeAPIPostUserUpdate**
> CoinbaseEngPrimeApiApiNewConsensusActivityResponse primeAPIPostUserUpdate(portfolioId, userId, body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String portfolioId = "portfolioId_example"; // String | 
String userId = "userId_example"; // String | 
CoinbaseEngPrimeApiApiPostUserUpdateRequest body = new CoinbaseEngPrimeApiApiPostUserUpdateRequest(); // CoinbaseEngPrimeApiApiPostUserUpdateRequest | 
try {
    CoinbaseEngPrimeApiApiNewConsensusActivityResponse result = apiInstance.primeAPIPostUserUpdate(portfolioId, userId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIPostUserUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**|  |
 **userId** | **String**|  |
 **body** | [**CoinbaseEngPrimeApiApiPostUserUpdateRequest**](CoinbaseEngPrimeApiApiPostUserUpdateRequest.md)|  |

### Return type

[**CoinbaseEngPrimeApiApiNewConsensusActivityResponse**](CoinbaseEngPrimeApiApiNewConsensusActivityResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIPostValidateAddress"></a>
# **primeAPIPostValidateAddress**
> CoinbaseEngPrimeApiApiValidateAddressResponse primeAPIPostValidateAddress(body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
CoinbaseEngPrimeApiApiValidateAddressRequest body = new CoinbaseEngPrimeApiApiValidateAddressRequest(); // CoinbaseEngPrimeApiApiValidateAddressRequest | 
try {
    CoinbaseEngPrimeApiApiValidateAddressResponse result = apiInstance.primeAPIPostValidateAddress(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIPostValidateAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CoinbaseEngPrimeApiApiValidateAddressRequest**](CoinbaseEngPrimeApiApiValidateAddressRequest.md)|  |

### Return type

[**CoinbaseEngPrimeApiApiValidateAddressResponse**](CoinbaseEngPrimeApiApiValidateAddressResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIPostValidateCounterparty"></a>
# **primeAPIPostValidateCounterparty**
> CoinbaseEngPrimeApiApiValidateCounterpartyResponse primeAPIPostValidateCounterparty(counterpartyId, body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String counterpartyId = "counterpartyId_example"; // String | counterparty_id
CoinbaseEngPrimeApiApiValidateCounterpartyRequest body = new CoinbaseEngPrimeApiApiValidateCounterpartyRequest(); // CoinbaseEngPrimeApiApiValidateCounterpartyRequest | 
try {
    CoinbaseEngPrimeApiApiValidateCounterpartyResponse result = apiInstance.primeAPIPostValidateCounterparty(counterpartyId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIPostValidateCounterparty");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **counterpartyId** | **String**| counterparty_id |
 **body** | [**CoinbaseEngPrimeApiApiValidateCounterpartyRequest**](CoinbaseEngPrimeApiApiValidateCounterpartyRequest.md)|  |

### Return type

[**CoinbaseEngPrimeApiApiValidateCounterpartyResponse**](CoinbaseEngPrimeApiApiValidateCounterpartyResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIPreviewTransaction"></a>
# **primeAPIPreviewTransaction**
> CoinbaseEngPrimeApiApiPreviewTransactionResponse primeAPIPreviewTransaction(portfolioId, body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String portfolioId = "portfolioId_example"; // String | The portfolio you want to transact with
CoinbaseEngPrimeApiApiPreviewTransactionRequest body = new CoinbaseEngPrimeApiApiPreviewTransactionRequest(); // CoinbaseEngPrimeApiApiPreviewTransactionRequest | 
try {
    CoinbaseEngPrimeApiApiPreviewTransactionResponse result = apiInstance.primeAPIPreviewTransaction(portfolioId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIPreviewTransaction");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**| The portfolio you want to transact with |
 **body** | [**CoinbaseEngPrimeApiApiPreviewTransactionRequest**](CoinbaseEngPrimeApiApiPreviewTransactionRequest.md)|  |

### Return type

[**CoinbaseEngPrimeApiApiPreviewTransactionResponse**](CoinbaseEngPrimeApiApiPreviewTransactionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPISignalWeb3Action"></a>
# **primeAPISignalWeb3Action**
> CoinbaseEngPrimeApiApiSignalWeb3ActionResponse primeAPISignalWeb3Action(portfolioId, body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String portfolioId = "portfolioId_example"; // String | 
CoinbaseEngPrimeApiApiSignalWeb3ActionRequest body = new CoinbaseEngPrimeApiApiSignalWeb3ActionRequest(); // CoinbaseEngPrimeApiApiSignalWeb3ActionRequest | 
try {
    CoinbaseEngPrimeApiApiSignalWeb3ActionResponse result = apiInstance.primeAPISignalWeb3Action(portfolioId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPISignalWeb3Action");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**|  |
 **body** | [**CoinbaseEngPrimeApiApiSignalWeb3ActionRequest**](CoinbaseEngPrimeApiApiSignalWeb3ActionRequest.md)|  |

### Return type

[**CoinbaseEngPrimeApiApiSignalWeb3ActionResponse**](CoinbaseEngPrimeApiApiSignalWeb3ActionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPISubmitDALRecall"></a>
# **primeAPISubmitDALRecall**
> CoinbaseFinancingSubmitDALRecallResponse primeAPISubmitDALRecall(entityId, body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String entityId = "entityId_example"; // String | 
CoinbaseFinancingSubmitDALRecallRequest body = new CoinbaseFinancingSubmitDALRecallRequest(); // CoinbaseFinancingSubmitDALRecallRequest | 
try {
    CoinbaseFinancingSubmitDALRecallResponse result = apiInstance.primeAPISubmitDALRecall(entityId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPISubmitDALRecall");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **entityId** | **String**|  |
 **body** | [**CoinbaseFinancingSubmitDALRecallRequest**](CoinbaseFinancingSubmitDALRecallRequest.md)|  |

### Return type

[**CoinbaseFinancingSubmitDALRecallResponse**](CoinbaseFinancingSubmitDALRecallResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPISubmitLocates"></a>
# **primeAPISubmitLocates**
> CoinbaseFinancingSubmitLocatesResponse primeAPISubmitLocates(entityId, body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String entityId = "entityId_example"; // String | 
CoinbaseFinancingSubmitLocatesRequest body = new CoinbaseFinancingSubmitLocatesRequest(); // CoinbaseFinancingSubmitLocatesRequest | 
try {
    CoinbaseFinancingSubmitLocatesResponse result = apiInstance.primeAPISubmitLocates(entityId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPISubmitLocates");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **entityId** | **String**|  |
 **body** | [**CoinbaseFinancingSubmitLocatesRequest**](CoinbaseFinancingSubmitLocatesRequest.md)|  |

### Return type

[**CoinbaseFinancingSubmitLocatesResponse**](CoinbaseFinancingSubmitLocatesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPISubmitMultipleLocates"></a>
# **primeAPISubmitMultipleLocates**
> CoinbaseFinancingSubmitMultipleLocatesResponse primeAPISubmitMultipleLocates(entityId, body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String entityId = "entityId_example"; // String | 
CoinbaseFinancingSubmitMultipleLocatesRequest body = new CoinbaseFinancingSubmitMultipleLocatesRequest(); // CoinbaseFinancingSubmitMultipleLocatesRequest | 
try {
    CoinbaseFinancingSubmitMultipleLocatesResponse result = apiInstance.primeAPISubmitMultipleLocates(entityId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPISubmitMultipleLocates");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **entityId** | **String**|  |
 **body** | [**CoinbaseFinancingSubmitMultipleLocatesRequest**](CoinbaseFinancingSubmitMultipleLocatesRequest.md)|  |

### Return type

[**CoinbaseFinancingSubmitMultipleLocatesResponse**](CoinbaseFinancingSubmitMultipleLocatesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIUpdateNotificationPreferencesForChannel"></a>
# **primeAPIUpdateNotificationPreferencesForChannel**
> CoinbaseEngPrimeApiApiUpdateUserPreferencesForChannelResponse primeAPIUpdateNotificationPreferencesForChannel(userId, body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String userId = "userId_example"; // String | 
CoinbaseEngPrimeApiApiUpdateUserPreferencesForChannelRequest body = new CoinbaseEngPrimeApiApiUpdateUserPreferencesForChannelRequest(); // CoinbaseEngPrimeApiApiUpdateUserPreferencesForChannelRequest | 
try {
    CoinbaseEngPrimeApiApiUpdateUserPreferencesForChannelResponse result = apiInstance.primeAPIUpdateNotificationPreferencesForChannel(userId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIUpdateNotificationPreferencesForChannel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**|  |
 **body** | [**CoinbaseEngPrimeApiApiUpdateUserPreferencesForChannelRequest**](CoinbaseEngPrimeApiApiUpdateUserPreferencesForChannelRequest.md)|  |

### Return type

[**CoinbaseEngPrimeApiApiUpdateUserPreferencesForChannelResponse**](CoinbaseEngPrimeApiApiUpdateUserPreferencesForChannelResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIUpdateWalletAssetSettings"></a>
# **primeAPIUpdateWalletAssetSettings**
> CoinbaseEngPrimeApiApiUpdateWalletAssetSettingsResponse primeAPIUpdateWalletAssetSettings(portfolioId, walletId, body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String portfolioId = "portfolioId_example"; // String | 
String walletId = "walletId_example"; // String | 
CoinbaseEngPrimeApiApiUpdateWalletAssetSettingsRequest body = new CoinbaseEngPrimeApiApiUpdateWalletAssetSettingsRequest(); // CoinbaseEngPrimeApiApiUpdateWalletAssetSettingsRequest | 
try {
    CoinbaseEngPrimeApiApiUpdateWalletAssetSettingsResponse result = apiInstance.primeAPIUpdateWalletAssetSettings(portfolioId, walletId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIUpdateWalletAssetSettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**|  |
 **walletId** | **String**|  |
 **body** | [**CoinbaseEngPrimeApiApiUpdateWalletAssetSettingsRequest**](CoinbaseEngPrimeApiApiUpdateWalletAssetSettingsRequest.md)|  |

### Return type

[**CoinbaseEngPrimeApiApiUpdateWalletAssetSettingsResponse**](CoinbaseEngPrimeApiApiUpdateWalletAssetSettingsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIUpdateWalletName"></a>
# **primeAPIUpdateWalletName**
> CoinbaseEngPrimeApiApiUpdateWalletNameResponse primeAPIUpdateWalletName(portfolioId, walletId, body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String portfolioId = "portfolioId_example"; // String | 
String walletId = "walletId_example"; // String | 
CoinbaseEngPrimeApiApiUpdateWalletNameRequest body = new CoinbaseEngPrimeApiApiUpdateWalletNameRequest(); // CoinbaseEngPrimeApiApiUpdateWalletNameRequest | 
try {
    CoinbaseEngPrimeApiApiUpdateWalletNameResponse result = apiInstance.primeAPIUpdateWalletName(portfolioId, walletId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIUpdateWalletName");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**|  |
 **walletId** | **String**|  |
 **body** | [**CoinbaseEngPrimeApiApiUpdateWalletNameRequest**](CoinbaseEngPrimeApiApiUpdateWalletNameRequest.md)|  |

### Return type

[**CoinbaseEngPrimeApiApiUpdateWalletNameResponse**](CoinbaseEngPrimeApiApiUpdateWalletNameResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIUpdateWeb3Device"></a>
# **primeAPIUpdateWeb3Device**
> CoinbaseEngPrimeApiApiUpdateWeb3DeviceResponse primeAPIUpdateWeb3Device(body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
CoinbaseEngPrimeApiApiUpdateWeb3DeviceRequest body = new CoinbaseEngPrimeApiApiUpdateWeb3DeviceRequest(); // CoinbaseEngPrimeApiApiUpdateWeb3DeviceRequest | 
try {
    CoinbaseEngPrimeApiApiUpdateWeb3DeviceResponse result = apiInstance.primeAPIUpdateWeb3Device(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIUpdateWeb3Device");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CoinbaseEngPrimeApiApiUpdateWeb3DeviceRequest**](CoinbaseEngPrimeApiApiUpdateWeb3DeviceRequest.md)|  |

### Return type

[**CoinbaseEngPrimeApiApiUpdateWeb3DeviceResponse**](CoinbaseEngPrimeApiApiUpdateWeb3DeviceResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIUpsertPolicyChange"></a>
# **primeAPIUpsertPolicyChange**
> CoinbaseEngPrimeApiApiUpsertPolicyChangeResponse primeAPIUpsertPolicyChange(portfolioId, body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String portfolioId = "portfolioId_example"; // String | 
CoinbaseEngPrimeApiApiUpsertPolicyChangeRequest body = new CoinbaseEngPrimeApiApiUpsertPolicyChangeRequest(); // CoinbaseEngPrimeApiApiUpsertPolicyChangeRequest | 
try {
    CoinbaseEngPrimeApiApiUpsertPolicyChangeResponse result = apiInstance.primeAPIUpsertPolicyChange(portfolioId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIUpsertPolicyChange");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**|  |
 **body** | [**CoinbaseEngPrimeApiApiUpsertPolicyChangeRequest**](CoinbaseEngPrimeApiApiUpsertPolicyChangeRequest.md)|  |

### Return type

[**CoinbaseEngPrimeApiApiUpsertPolicyChangeResponse**](CoinbaseEngPrimeApiApiUpsertPolicyChangeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIValidateWeb3Authorization"></a>
# **primeAPIValidateWeb3Authorization**
> CoinbaseEngPrimeApiApiValidateWeb3AuthorizationResponse primeAPIValidateWeb3Authorization(portfolioId, body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String portfolioId = "portfolioId_example"; // String | 
CoinbaseEngPrimeApiApiValidateWeb3AuthorizationRequest body = new CoinbaseEngPrimeApiApiValidateWeb3AuthorizationRequest(); // CoinbaseEngPrimeApiApiValidateWeb3AuthorizationRequest | 
try {
    CoinbaseEngPrimeApiApiValidateWeb3AuthorizationResponse result = apiInstance.primeAPIValidateWeb3Authorization(portfolioId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIValidateWeb3Authorization");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**|  |
 **body** | [**CoinbaseEngPrimeApiApiValidateWeb3AuthorizationRequest**](CoinbaseEngPrimeApiApiValidateWeb3AuthorizationRequest.md)|  |

### Return type

[**CoinbaseEngPrimeApiApiValidateWeb3AuthorizationResponse**](CoinbaseEngPrimeApiApiValidateWeb3AuthorizationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="primeAPIValidateWeb3SecurityKey"></a>
# **primeAPIValidateWeb3SecurityKey**
> CoinbaseEngPrimeApiApiValidateWeb3SecurityKeyResponse primeAPIValidateWeb3SecurityKey(portfolioId, body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimeApiApi;


PrimeApiApi apiInstance = new PrimeApiApi();
String portfolioId = "portfolioId_example"; // String | 
CoinbaseEngPrimeApiApiValidateWeb3SecurityKeyRequest body = new CoinbaseEngPrimeApiApiValidateWeb3SecurityKeyRequest(); // CoinbaseEngPrimeApiApiValidateWeb3SecurityKeyRequest | 
try {
    CoinbaseEngPrimeApiApiValidateWeb3SecurityKeyResponse result = apiInstance.primeAPIValidateWeb3SecurityKey(portfolioId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimeApiApi#primeAPIValidateWeb3SecurityKey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**|  |
 **body** | [**CoinbaseEngPrimeApiApiValidateWeb3SecurityKeyRequest**](CoinbaseEngPrimeApiApiValidateWeb3SecurityKeyRequest.md)|  |

### Return type

[**CoinbaseEngPrimeApiApiValidateWeb3SecurityKeyResponse**](CoinbaseEngPrimeApiApiValidateWeb3SecurityKeyResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

