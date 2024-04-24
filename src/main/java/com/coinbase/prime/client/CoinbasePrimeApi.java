package com.coinbase.prime.client;

import com.coinbase.prime.model.allocations.CreatePortfolioAllocationsRequest;
import com.coinbase.prime.model.allocations.CreatePortfolioAllocationsResponse;
import com.coinbase.prime.model.allocations.CreatePortfolioNetAllocationsResponse;
import com.coinbase.prime.model.portfolio.*;
import com.coinbase.prime.model.wallets.*;

public interface CoinbasePrimeApi {
    CreatePortfolioAllocationsResponse createPortfolioAllocations(CreatePortfolioAllocationsRequest request);
    CreatePortfolioNetAllocationsResponse createPortfolioNetAllocations(CreatePortfolioAllocationsRequest request);


    ListPortfoliosResponse listPortfolios();
    GetPortfolioByIdResponse getPortfolioById(GetPortfolioByIdRequest request);
    GetPortfolioCreditInformationResponse getPortfolioCreditInformation(GetPortfolioCreditInformationRequest request);

    ListWalletsResponse listWallets(ListWalletsRequest request);
    CreateWalletResponse createWallet(CreateWalletRequest request);
    GetWalletByIdResponse getWalletById(GetWalletByIdRequest request);
    GetWalletDepositInstructionsResponse getWalletDepositInstructions(GetWalletDepositInstructionsRequest request);
}
