package com.thinkdifferent.demo.exception;

public class CloundVendorNotFoundException extends RuntimeException {
    public CloundVendorNotFoundException(String message) {
        super(message);
    }

    public CloundVendorNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
