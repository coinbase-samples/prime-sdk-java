# Coinbase Prime Java SDK

## Overview

The *Coinbase Prime Java SDK* is a sample library that demonstrates the structure of a [Coinbase Prime](https://prime.coinbase.com/) driver for
the [REST APIs](https://docs.cdp.coinbase.com/prime/reference).

## License

The *Coinbase Prime Java SDK* sample library is free and open source and released under the [Apache License, Version 2.0](LICENSE).

The application and code are only available for demonstration purposes.

## Usage

To use the *Coinbase Prime Java SDK*, initialize the Credentials class and create a new client. The Credentials struct is JSON
enabled. Ensure that Prime API credentials are stored in a secure manner. This client can then be used to instantiate 
Coinbase Prime Services. An example using the PortfoliosService is shown below:

```java
public class Main {
    public static void main(String[] args) {
        String credsStringBlob = System.getenv("COINBASE_PRIME_CREDENTIALS");
        ObjectMapper mapper = new ObjectMapper();

        try {
            CoinbasePrimeCredentials credentials = new CoinbasePrimeCredentials(credsStringBlob);
            CoinbasePrimeClient client = new CoinbasePrimeClient(credentials);

            String portfolioId = System.getenv("COINBASE_PRIME_PORTFOLIO_ID");

            PortfoliosService portfoliosService = PrimeServiceFactory.createPortfoliosService(client);
            GetPortfolioByIdResponse portfolioResponse = portfoliosService.getPortfolioById(
                    new GetPortfolioByIdRequest.Builder()
                            .portfolioId(portfolioId)
                            .build());

            System.out.println(mapper.writeValueAsString(portfolioResponse));
        } catch (Exception e) {
            e.printStackTrace(e);
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

For a full example on using the SDK, see the [`Main`](src/main/java/com/coinbase/examples/Main.java) class under the com.coinbase.examples package.

**Warning**: this does place a market order for a very small amount of ADA. Please ensure that you have the necessary funds in your account before running this code.

## Binaries

Binaries and dependency information for Maven, Gradle, Ivy and others can be found at the [Maven Central Repository](https://central.sonatype.com/search?q=g%3Acom.coinbase.prime+a%3Acoinbase-prime-sdk-java&smo=true)

Maven example:

```xml
<dependency>
    <groupId>com.coinbase.prime</groupId>
    <artifactId>coinbase-prime-sdk-java</artifactId>
    <version>x.y.z</version>
</dependency>
```

## Build

To build the sample library, ensure that Java Development Kit (JDK) 11+ is installed and then run:

```bash
mvn clean install
```

## Running Examples

The SDK includes several example classes demonstrating how to use various endpoints. 

### Setup Environment Variables

First, set up your credentials as environment variables:

```bash
export COINBASE_PRIME_CREDENTIALS='{"accessKey":"your-access-key","passphrase":"your-passphrase","signingKey":"your-signing-key"}'
export COINBASE_PRIME_PORTFOLIO_ID="your-portfolio-id"
```

### Option 1: Using Maven directly

```bash
mvn exec:java -Dexec.mainClass="com.coinbase.examples.transactions.ListPortfolioTransactions"
```

**Note:** Make sure the environment variables are exported in your current shell session before running the examples.

### Available Examples

**Transactions:**
- `com.coinbase.examples.transactions.ListPortfolioTransactions` - List portfolio transactions

**Wallets:**
- `com.coinbase.examples.wallets.ListPortfolioWallets` - List all wallets in a portfolio
- `com.coinbase.examples.wallets.GetWallet <wallet-id>` - Get wallet details
- `com.coinbase.examples.wallets.ListWalletAddresses <wallet-id> <network-id>` - List addresses for a wallet
- `com.coinbase.examples.wallets.GetWalletDepositInstructions <wallet-id> [deposit-type]` - Get deposit instructions (deposit-type: CRYPTO, WIRE, SEN, SWIFT, SEPA)

**Other:**
- `com.coinbase.examples.Main` - Comprehensive example with multiple API calls

**Example Usage:**

```bash
# List all wallets
mvn exec:java -Dexec.mainClass="com.coinbase.examples.wallets.ListPortfolioWallets"

# Get specific wallet details
mvn exec:java -Dexec.mainClass="com.coinbase.examples.wallets.GetWallet" -Dexec.args="wallet-id-here"

# List wallet addresses
mvn exec:java -Dexec.mainClass="com.coinbase.examples.wallets.ListWalletAddresses" -Dexec.args="wallet-id network-id"

# Get deposit instructions (defaults to CRYPTO)
mvn exec:java -Dexec.mainClass="com.coinbase.examples.wallets.GetWalletDepositInstructions" -Dexec.args="wallet-id"

# Get deposit instructions for WIRE
mvn exec:java -Dexec.mainClass="com.coinbase.examples.wallets.GetWalletDepositInstructions" -Dexec.args="wallet-id WIRE"
```

## Code generation

The SDK is generated from the published OpenAPI spec (`https://api.prime.coinbase.com/v1/openapi.yaml`). The spec is downloaded at generation time (not committed).

From the repository root:

```bash
mvn -Pgenerate
```

Optional: compare without writing files: `mvn -Pgenerate -Dgenerator.args=--diff`, or dry run: `-Dgenerator.args=--dry-run`.

This regenerates domain models and enums, per-operation `*Request` / `*Response` types, `*Service` / `*ServiceImpl`, `PrimeServiceFactory`, and adds missing example stubs only when an example file does not already exist.

See [`tools/model-generator/README.md`](tools/model-generator/README.md) for configuration (`config/generator-config.json`, `operations-overrides.json`) and module details.
