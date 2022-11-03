package com.dantas.algafood.api.controller;

import com.dantas.algafood.entity.Cidade;
import com.dantas.algafood.service.CidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/cidades")
public class CidadeController {

//    @Autowired
//    private CidadeService service;
//
//    @GetMapping
//    public ResponseEntity<List<Cidade>> findAll() {
//        final var obj = service.findAll();
//        return ResponseEntity.ok(obj);
//    }
//
//    @GetMapping(value = "/{id}")
//    public ResponseEntity<Cidade> findById(@PathVariable Long id) {
//        final var obj = service.findById(id);
//        return ResponseEntity.ok(obj);
//    }
//
//    @PostMapping
//    public ResponseEntity<Cidade> save(@RequestBody Cidade cidade) {
//        final var obj = service.save(cidade);
//        return ResponseEntity.status(HttpStatus.CREATED).body(obj);
//    }
//
//    @DeleteMapping(value = "/{id}")
//    public ResponseEntity<Cidade> delete(@PathVariable Long id) {
//        service.delete(id);
//        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
//    }
//
//    @PutMapping(value = "/{id}")
//    public ResponseEntity<Cidade> update(@PathVariable Long id, @RequestBody Cidade cidade) {
//        final var update = service.update(id, cidade);
//        return ResponseEntity.ok(update);
//    }
}
