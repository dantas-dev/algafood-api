package com.dantas.algafood.doman.servicies.exceptions;

public class EntityInUseException extends RuntimeException {

    public EntityInUseException(String message) {
        super(message);
    }

    public EntityInUseException(String message, Throwable cause) {
        super(message, cause);
    }

    public String getReturneMessage(Long id) {
        return String.format("Objeto com ID: %d não pode ser removido, pois está em uso", id);
    }
}
