package com.whc1998.businessexercise.exceptions;

public class BusinessNotFoundException extends RuntimeException{
    public BusinessNotFoundException(String message) {
        super(message);
    }
}
