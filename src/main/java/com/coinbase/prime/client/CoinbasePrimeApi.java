package com.coinbase.prime.client;

import com.coinbase.prime.model.portfolio.ListPortfoliosResponse;
import com.coinbase.prime.model.wallets.CreateWalletRequest;
import com.coinbase.prime.model.wallets.CreateWalletResponse;
import com.coinbase.prime.model.wallets.ListWalletsRequest;
import com.coinbase.prime.model.wallets.ListWalletsResponse;

public interface CoinbasePrimeApi {
    ListPortfoliosResponse listPortfolios();
    ListWalletsResponse listWallets(ListWalletsRequest request);

    CreateWalletResponse createWallet(CreateWalletRequest request);
}
