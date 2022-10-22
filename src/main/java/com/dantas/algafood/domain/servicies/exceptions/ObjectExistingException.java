package com.dantas.algafood.domain.servicies.exceptions;

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
