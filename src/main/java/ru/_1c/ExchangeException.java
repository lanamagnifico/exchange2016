package ru._1c;

public class ExchangeException extends Exception {

    public ExchangeException(String message, Throwable cause) {
        super(message, cause);
    }

    public ExchangeException(String message) {
        super(message);
    }
}
