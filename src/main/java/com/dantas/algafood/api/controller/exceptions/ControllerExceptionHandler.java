package com.dantas.algafood.api.controller.exceptions;

import com.dantas.algafood.exception.BadRequestException;
import com.dantas.algafood.exception.EntityInUseException;
import com.dantas.algafood.exception.ObjectExistingException;
import com.dantas.algafood.exception.ObjectNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class ControllerExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(ObjectNotFoundException.class)
    public ResponseEntity<StandardError> objectNotFound(ObjectNotFoundException e) {
        StandardError error = new StandardError(HttpStatus.NOT_FOUND.value(), e.getMessage(), LocalDateTime.now());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
    }

    @ExceptionHandler(ObjectExistingException.class)
    public ResponseEntity<StandardError> objectExisting(ObjectExistingException e) {
        StandardError error = new StandardError(HttpStatus.CONFLICT.value(), e.getMessage(), LocalDateTime.now());
        return ResponseEntity.status(HttpStatus.CONFLICT).body(error);
    }

    @ExceptionHandler(EntityInUseException.class)
    public ResponseEntity<StandardError> entityInUse(EntityInUseException e) {
        StandardError error = new StandardError(HttpStatus.CONFLICT.value(), e.getMessage(), LocalDateTime.now());
        return ResponseEntity.status(HttpStatus.CONFLICT).body(error);
    }

    @ExceptionHandler(BadRequestException.class)
    public ResponseEntity<StandardError> badRequest(BadRequestException e) {
        StandardError error = new StandardError(HttpStatus.BAD_REQUEST.value(), e.getMessage(), LocalDateTime.now());
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(error);
    }
}
