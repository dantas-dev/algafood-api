package com.dantas.algafood.exception;

public class EntityInUseException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

    public EntityInUseException(String message) {
        super(message);
    }

    public EntityInUseException(String message, Throwable cause) {
        super(message, cause);
    }

    public String getReturneMessage() {
        return "Objeto não pode ser removido, pois está em uso";
    }
}
