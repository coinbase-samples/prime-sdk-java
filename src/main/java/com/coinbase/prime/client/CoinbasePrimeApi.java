package com.coinbase.prime.client;

import com.coinbase.prime.model.portfolio.ListPortfoliosResponse;
import com.coinbase.prime.model.wallets.*;

public interface CoinbasePrimeApi {
    ListPortfoliosResponse listPortfolios();
    ListWalletsResponse listWallets(ListWalletsRequest request);

    CreateWalletResponse createWallet(CreateWalletRequest request);

    GetWalletByIdResponse getWalletById(GetWalletByIdRequest request);

    GetWalletDepositInstructionsResponse getWalletDepositInstructions(GetWalletDepositInstructionsRequest request);
}
