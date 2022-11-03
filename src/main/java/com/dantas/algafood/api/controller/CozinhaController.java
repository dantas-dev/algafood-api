package com.dantas.algafood.api.controller;

import com.dantas.algafood.entity.Cozinha;
import com.dantas.algafood.service.CozinhaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/cozinhas")
public class CozinhaController {

//    @Autowired
//    private CozinhaService service;
//
//    @GetMapping
//    public ResponseEntity<List<Cozinha>> findAll() {
//        final var obj = service.findAll();
//        return ResponseEntity.ok(obj);
//    }
//
//    @GetMapping(value = "/{id}")
//    public ResponseEntity<Cozinha> findById(@PathVariable Long id) {
//        final var obj = service.findById(id);
//        return ResponseEntity.ok(obj);
//    }
//
//    @PostMapping
//    public ResponseEntity<Cozinha> save(@RequestBody Cozinha cozinha) {
//        final var obj = service.save(cozinha);
//        return ResponseEntity.status(HttpStatus.CREATED).body(obj);
//    }
//
//    @DeleteMapping(value = "/{id}")
//    public ResponseEntity<Cozinha> delete(@PathVariable Long id) {
//        service.delete(id);
//        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
//    }
//
//
//    @PutMapping(value = "/{id}")
//    public ResponseEntity<Cozinha> update(@PathVariable Long id, @RequestBody Cozinha cozinha) {
//        final var update = service.update(id, cozinha);
//        return ResponseEntity.ok(update);
//    }

}
