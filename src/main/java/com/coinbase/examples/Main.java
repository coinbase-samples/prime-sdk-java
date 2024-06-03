package com.coinbase.examples;

import com.coinbase.prime.credentials.CoinbasePrimeCredentials;
import com.coinbase.prime.client.CoinbasePrimeHttpClient;
import com.coinbase.prime.model.balances.ListPortfolioBalancesRequest;
import com.coinbase.prime.model.balances.ListPortfolioBalancesResponse;
import com.coinbase.prime.model.commission.GetPortfolioCommissionRequest;
import com.coinbase.prime.model.commission.GetPortfolioCommissionResponse;
import com.coinbase.prime.model.invoice.ListInvoicesRequest;
import com.coinbase.prime.model.invoice.Invoice;
import com.coinbase.prime.model.invoice.ListInvoicesResponse;
import com.coinbase.prime.model.portfolios.ListPortfoliosResponse;
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

            ListPortfolioBalancesResponse resp2 = client.listPortfolioBalances(
                    new ListPortfolioBalancesRequest.Builder()
                            .portfolioId(resp.getPortfolios().get(0).getId())
                            .build());
            System.out.println(mapper.writeValueAsString(resp2));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
