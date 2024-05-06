package com.coinbase.prime.client;

import com.coinbase.prime.model.activities.GetActivityByActivityIdRequest;
import com.coinbase.prime.model.activities.GetActivityByActivityIdResponse;
import com.coinbase.prime.model.activities.ListActivitiesRequest;
import com.coinbase.prime.model.activities.ListActivitiesResponse;
import com.coinbase.prime.model.allocations.*;
import com.coinbase.prime.model.assets.ListAssetsRequest;
import com.coinbase.prime.model.assets.ListAssetsResponse;
import com.coinbase.prime.model.invoice.ListInvoicesRequest;
import com.coinbase.prime.model.invoice.ListInvoicesResponse;
import com.coinbase.prime.model.paymentmethods.GetEntityPaymentMethodRequest;
import com.coinbase.prime.model.paymentmethods.GetEntityPaymentMethodResponse;
import com.coinbase.prime.model.paymentmethods.ListEntityPaymentMethodsRequest;
import com.coinbase.prime.model.paymentmethods.ListEntityPaymentMethodsResponse;
import com.coinbase.prime.model.portfolios.*;
import com.coinbase.prime.model.users.ListPortfolioUsersRequest;
import com.coinbase.prime.model.users.ListPortfolioUsersResponse;
import com.coinbase.prime.model.users.ListUsersRequest;
import com.coinbase.prime.model.users.ListUsersResponse;
import com.coinbase.prime.model.wallets.*;

public interface CoinbasePrimeApi {
    CreatePortfolioAllocationsResponse createPortfolioAllocations(CreatePortfolioAllocationsRequest request);
    CreatePortfolioNetAllocationsResponse createPortfolioNetAllocations(CreatePortfolioAllocationsRequest request);
    ListPortfolioAllocationsResponse listPortfolioAllocations(ListPortfolioAllocationsRequest request);
    GetAllocationByIdResponse getAllocationById(GetAllocationByIdRequest request);
    GetNetAllocationsByNettingIdResponse getNetAllocationsByNettingId(GetNetAllocationsByNettingIdRequest request);

    ListInvoicesResponse listInvoices(ListInvoicesRequest request);

    ListAssetsResponse listAssets(ListAssetsRequest request);

    ListEntityPaymentMethodsResponse listEntityPaymentMethods(ListEntityPaymentMethodsRequest entityId);
    GetEntityPaymentMethodResponse getEntityPaymentMethod(GetEntityPaymentMethodRequest request);

    ListUsersResponse listUsers(ListUsersRequest request);
    ListPortfolioUsersResponse listPortfolioUsers(ListPortfolioUsersRequest request);

    ListActivitiesResponse listActivities(ListActivitiesRequest request);
    GetActivityByActivityIdResponse getActivityByActivityId(GetActivityByActivityIdRequest request);

    ListPortfoliosResponse listPortfolios();
    GetPortfolioByIdResponse getPortfolioById(GetPortfolioByIdRequest request);
    GetPortfolioCreditInformationResponse getPortfolioCreditInformation(GetPortfolioCreditInformationRequest request);

    ListWalletsResponse listWallets(ListWalletsRequest request);
    CreateWalletResponse createWallet(CreateWalletRequest request);
    GetWalletByIdResponse getWalletById(GetWalletByIdRequest request);
    GetWalletDepositInstructionsResponse getWalletDepositInstructions(GetWalletDepositInstructionsRequest request);
}
