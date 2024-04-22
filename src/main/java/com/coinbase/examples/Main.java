package com.coinbase.examples;

import com.coinbase.prime.credentials.CoinbasePrimeCredentials;
import com.coinbase.prime.client.CoinbasePrimeHttpClient;
import com.coinbase.prime.model.portfolio.GetPortfolioByIdRequest;
import com.coinbase.prime.model.portfolio.GetPortfolioByIdResponse;
import com.coinbase.prime.model.portfolio.ListPortfoliosResponse;
import com.coinbase.prime.model.wallets.ListWalletsRequest;
import com.coinbase.prime.model.wallets.ListWalletsResponse;
import com.coinbase.prime.model.wallets.WalletType;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
    public static void main(String[] args) {
        String credsStringBlob = System.getenv("PRIME_CREDENTIALS");
        ObjectMapper mapper = new ObjectMapper();
        try {
            CoinbasePrimeCredentials credentials = mapper.readValue(credsStringBlob, CoinbasePrimeCredentials.class);

            CoinbasePrimeHttpClient client = new CoinbasePrimeHttpClient.Builder(credentials).build();

            ListPortfoliosResponse resp = client.listPortfolios();
            System.out.println(mapper.writeValueAsString(resp));

            GetPortfolioByIdRequest req = new GetPortfolioByIdRequest.Builder()
                    .portfolioId(resp.getPortfolios().get(0).getId())
                    .build();
            GetPortfolioByIdResponse resp2 = client.getPortfolioById(req);

            System.out.println(mapper.writeValueAsString(resp2));

            ListWalletsRequest req2 = new ListWalletsRequest.Builder()
                    .portfolioId(resp.getPortfolios().get(0).getId())
                    .type(WalletType.TRADING)
                    .build();

            ListWalletsResponse resp3 = client.listWallets(req2);
            System.out.println(mapper.writeValueAsString(resp3));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
