package com.coinbase.prime.client;

import com.coinbase.prime.model.allocations.*;
import com.coinbase.prime.model.assets.ListAssetsRequest;
import com.coinbase.prime.model.assets.ListAssetsResponse;
import com.coinbase.prime.model.invoice.ListInvoicesRequest;
import com.coinbase.prime.model.invoice.ListInvoicesResponse;
import com.coinbase.prime.model.paymentmethods.GetEntityPaymentMethodRequest;
import com.coinbase.prime.model.paymentmethods.GetEntityPaymentMethodResponse;
import com.coinbase.prime.model.paymentmethods.ListEntityPaymentMethodsRequest;
import com.coinbase.prime.model.paymentmethods.ListEntityPaymentMethodsResponse;
import com.coinbase.prime.model.portfolio.*;
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

    ListPortfoliosResponse listPortfolios();
    GetPortfolioByIdResponse getPortfolioById(GetPortfolioByIdRequest request);
    GetPortfolioCreditInformationResponse getPortfolioCreditInformation(GetPortfolioCreditInformationRequest request);

    ListWalletsResponse listWallets(ListWalletsRequest request);
    CreateWalletResponse createWallet(CreateWalletRequest request);
    GetWalletByIdResponse getWalletById(GetWalletByIdRequest request);
    GetWalletDepositInstructionsResponse getWalletDepositInstructions(GetWalletDepositInstructionsRequest request);
}
