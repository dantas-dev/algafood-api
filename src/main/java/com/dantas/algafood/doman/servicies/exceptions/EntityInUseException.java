package com.dantas.algafood.doman.servicies.exceptions;

public class EntityInUseException extends RuntimeException {

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
