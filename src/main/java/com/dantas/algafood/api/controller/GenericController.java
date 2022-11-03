package com.dantas.algafood.api.controller;

import com.dantas.algafood.entity.GenericEntity;
import com.dantas.algafood.service.GenericService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@RequiredArgsConstructor
public abstract class GenericController<T extends GenericEntity> {

    private final GenericService<T> service;

    @GetMapping
    protected ResponseEntity<List<T>> findAll() {
        final var all = service.findAll();
        return ResponseEntity.ok(all);
    }

}
