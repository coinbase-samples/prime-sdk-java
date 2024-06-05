package com.coinbase.examples;

import com.coinbase.prime.credentials.CoinbasePrimeCredentials;
import com.coinbase.prime.client.CoinbasePrimeHttpClient;
import com.coinbase.prime.model.allocations.GetPortfolioAllocationsRequest;
import com.coinbase.prime.model.allocations.GetPortfolioAllocationsResponse;
import com.coinbase.prime.model.portfolios.ListPortfoliosResponse;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.sql.Date;

public class Main {
    public static void main(String[] args) {
        String credsStringBlob = System.getenv("PRIME_CREDENTIALS");
        ObjectMapper mapper = new ObjectMapper();
        try {
            CoinbasePrimeCredentials credentials = mapper.readValue(credsStringBlob, CoinbasePrimeCredentials.class);

            CoinbasePrimeHttpClient client = new CoinbasePrimeHttpClient.Builder(credentials).build();

            ListPortfoliosResponse resp = client.listPortfolios();
            System.out.println(mapper.writeValueAsString(resp));

            GetPortfolioAllocationsResponse resp2 = client.getPortfolioAllocations(
                    new GetPortfolioAllocationsRequest.Builder()
                            .portfolioId(resp.getPortfolios().get(0).getId())
                            .startDate(new Date(1704096000000L))
                            .build()
            );
            System.out.println(mapper.writeValueAsString(resp2));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
