package com.dantas.algafood.exception;

import java.io.Serializable;

public class ObjectExistingException extends RuntimeException implements Serializable{
	
	private static final long serialVersionUID = 1L;

    public ObjectExistingException(String message) {
        super(message);
    }

    public ObjectExistingException(String message, Throwable cause) {
        super(message, cause);
    }
}
