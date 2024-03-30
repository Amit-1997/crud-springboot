package com.spring.learn.Exception;

public class DuplicateValueFoundException extends RuntimeException{

    public DuplicateValueFoundException(String message) {
        super(message);
    }
}
