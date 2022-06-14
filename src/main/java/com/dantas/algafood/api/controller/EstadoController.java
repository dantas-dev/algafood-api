package com.dantas.algafood.api.controller;

import com.dantas.algafood.doman.model.Estado;
import com.dantas.algafood.doman.repositories.EstadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/estados")
public class EstadoController {

    @Autowired
    private EstadoRepository repository;

    @GetMapping
    public List<Estado> findAll() {
        return repository.findAll();
    }

    @GetMapping(value = "/{id}")
    public Estado findById(@PathVariable Long id){
        final var obj = repository.findById(id);
        return obj.get();
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable Long id) {
        final var obj = repository.findById(id);
        if (obj.isPresent()) {
            repository.delete(obj.get());
        }
    }
}
