package com.dantas.algafood.doman.servicies.exceptions;

public class ObjectExistingException extends RuntimeException{

    public ObjectExistingException(String message) {
        super(message);
    }

    public ObjectExistingException(String message, Throwable cause) {
        super(message, cause);
    }
}
