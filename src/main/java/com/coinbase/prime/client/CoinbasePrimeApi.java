package com.coinbase.prime.client;

import com.coinbase.prime.model.portfolio.GetPortfolioByIdRequest;
import com.coinbase.prime.model.portfolio.GetPortfolioByIdResponse;
import com.coinbase.prime.model.portfolio.ListPortfoliosResponse;
import com.coinbase.prime.model.wallets.*;

public interface CoinbasePrimeApi {
    ListPortfoliosResponse listPortfolios();
    GetPortfolioByIdResponse getPortfolioById(GetPortfolioByIdRequest request);
    ListWalletsResponse listWallets(ListWalletsRequest request);

    CreateWalletResponse createWallet(CreateWalletRequest request);

    GetWalletByIdResponse getWalletById(GetWalletByIdRequest request);

    GetWalletDepositInstructionsResponse getWalletDepositInstructions(GetWalletDepositInstructionsRequest request);
}
