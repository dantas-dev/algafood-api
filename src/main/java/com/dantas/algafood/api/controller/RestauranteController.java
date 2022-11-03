package com.dantas.algafood.api.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dantas.algafood.entity.Restaurante;
import com.dantas.algafood.service.RestauranteService;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "/restaurantes")
public class RestauranteController {

//    @Autowired
//    private RestauranteService service;
//
//    @GetMapping
//    public ResponseEntity<List<Restaurante>> findAll() {
//        final var obj = service.findAll();
//        return ResponseEntity.ok(obj);
//    }
//
//    @GetMapping(value = "/{id}")
//    public ResponseEntity<Restaurante> findById(@PathVariable Long id) {
//        final var obj = service.findById(id);
//        return ResponseEntity.ok(obj);
//    }
//
//    @PostMapping
//    public ResponseEntity<Restaurante> save(@RequestBody @Valid  Restaurante restaurante) {
//        final var obj = service.save(restaurante);
//        return ResponseEntity.status(HttpStatus.CREATED).body(obj);
//    }
//
//    @DeleteMapping(value = "/{id}")
//    public ResponseEntity<Restaurante> delete(@PathVariable Long id) {
//        service.delete(id);
//        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
//    }
//
//    @PutMapping(value = "/{id}")
//    public ResponseEntity<Restaurante> update(@PathVariable Long id, @RequestBody Restaurante restaurante) {
//        final var update = service.update(id, restaurante);
//        return ResponseEntity.ok(update);
//    }
//
//    @PatchMapping(value = "/{id}")
//    public ResponseEntity<Restaurante> partialUpdate(
//    		@PathVariable Long id,
//    		@RequestBody Map<String, Object> campo) {
//        final var partialUpdate = service.partialUpdate(id, campo);
//        return ResponseEntity.ok(partialUpdate);
//    }
//
}
