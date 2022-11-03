package com.dantas.algafood.service;

import com.dantas.algafood.entity.Cozinha;
import com.dantas.algafood.entity.Restaurante;
import com.dantas.algafood.repository.CozinhaRepository;
import com.dantas.algafood.exception.EntityInUseException;
import com.dantas.algafood.exception.ObjectExistingException;
import com.dantas.algafood.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CozinhaService {

//    @Autowired
//    private CozinhaRepository repository;
//
//    public List<Cozinha> findAll() {
//        return repository.findAll();
//    }
//
//    public Cozinha findById(Long id) {
//        final var obj = repository.findById(id);
//        return obj.orElseThrow(() -> new ObjectNotFoundException(
//                "Objeto não encontrado ID: " + id + " do tipo: " + Restaurante.class.getName()));
//    }
//
//    public Cozinha save(Cozinha cozinha) {
//        requireNonExistentObjectInDB(cozinha);
//        return repository.save(cozinha);
//    }
//
//    public void delete(Long id) {
//        final var obj = repository.findById(id);
//        if (obj.isEmpty()) {
//            throw new ObjectNotFoundException("Objeto não encontrado ID: "
//                    + id + " do tipo: " + Cozinha.class.getName());
//        }
//        try {
//            repository.delete(obj.get());
//        } catch (EntityInUseException e) {
//            e.getReturneMessage();
//        }
//    }
//
//    public Cozinha update(Long id, Cozinha cozinha) {
//        final var obj = repository.findById(id);
//        if (obj.isEmpty()) {
//            throw new ObjectNotFoundException("Objeto não encontrado ID: "
//                    + id + " do tipo: " + Cozinha.class.getName());
//        }
//        requireNonExistentObjectInDB(cozinha);
//        obj.get().setNome(cozinha.getNome());
//        return repository.save(obj.get());
//    }
//
//    private void requireNonExistentObjectInDB(Cozinha cozinha) {
//        final var obj = repository.findCozinhaByNome(cozinha.getNome());
//        if (obj.get() != null) {
//            throw new ObjectExistingException("Um objeto com o nome: " + cozinha.getNome() + " do tipo: "
//					+ Cozinha.class.getName() + " já existe!");
//        }
//    }

}
