# Coinbase Prime Java SDK

## Overview

The *Coinbase Prime Java SDK* is a sample library that demonstrates the structure of a [Coinbase Prime](https://prime.coinbase.com/) driver for
the [REST APIs](https://docs.cdp.coinbase.com/prime/reference).

## License

The *Coinbase Prime Java SDK* sample library is free and open source and released under the [Apache License, Version 2.0](LICENSE).

The application and code are only available for demonstration purposes.

## Usage

To use the *Coinbase Prime Java SDK*, initialize the Credentials class and create a new client. The Credentials struct is JSON
enabled. Ensure that INTX API credentials are stored in a secure manner.


```java
public class Main {
    public static void main(String[] args) {
        String credsStringBlob = System.getenv("COINBASE_PRIME_CREDENTIALS");
        ObjectMapper mapper = new ObjectMapper();

        try {
            CoinbasePrimeCredentials credentials = mapper.readValue(credsStringBlob, CoinbasePrimeCredentials.class);
            CoinbasePrimeHttpClient client = new CoinbasePrimeHttpClient.Builder(credentials)
                    .withClient(HttpClient.newHttpClient())
                    .build();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
```

The JSON format expected for `COINBASE_PRIME_CREDENTIALS` is:

```
{
  "accessKey": "",
  "passphrase": "",
  "signingKey": ""
}
```

## Build

To build the sample library, ensure that Java Development Kit (JDK) 11+ is installed and then run:

```bash
mvn clean install
```