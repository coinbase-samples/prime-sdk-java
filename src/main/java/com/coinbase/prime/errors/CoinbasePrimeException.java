package com.coinbase.prime.errors;

public class CoinbasePrimeException extends RuntimeException {
    private final int statusCode;

    public CoinbasePrimeException(int statusCode, String message) {
        super(message);
        this.statusCode = statusCode;
    }

    public CoinbasePrimeException(String message, Throwable cause) {
        super(message, cause);
        this.statusCode = 500;
    }

    public CoinbasePrimeException(int statusCode, String message, Throwable cause) {
        super(message, cause);
        this.statusCode = statusCode;
    }

    public CoinbasePrimeException(Throwable cause) {
        super(cause);
        this.statusCode = 500;
    }
}
