package com.coinbase.prime.errors;

public class CoinbasePrimeClientException extends RuntimeException {
    public CoinbasePrimeClientException(String message) {
        super(message);
    }

    public CoinbasePrimeClientException(String message, Throwable cause) {
        super(message, cause);
    }

    public CoinbasePrimeClientException(Throwable cause) {
        super(cause);
    }
}
