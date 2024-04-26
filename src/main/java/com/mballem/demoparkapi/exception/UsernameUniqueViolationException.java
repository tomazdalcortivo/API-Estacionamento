package com.mballem.demoparkapi.exception;

public class UsernameUniqueViolationException extends RuntimeException {
    public UsernameUniqueViolationException(String mensagem) {
        super(mensagem);
    }
}
