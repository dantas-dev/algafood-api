package com.dantas.algafood.doman.servicies;

import com.dantas.algafood.doman.model.Cozinha;
import com.dantas.algafood.doman.model.Restaurante;
import com.dantas.algafood.doman.repositories.CozinhaRepository;
import com.dantas.algafood.doman.servicies.exceptions.EntityInUseException;
import com.dantas.algafood.doman.servicies.exceptions.ObjectExistingException;
import com.dantas.algafood.doman.servicies.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CozinhaService {

    @Autowired
    private CozinhaRepository repository;

    public List<Cozinha> findAll() {
        return repository.findAll();
    }

    public Cozinha findById(Long id) {
        final var obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                "Objeto não encontrado ID: " + id + " do tipo: " + Restaurante.class.getName()));
    }

    public Cozinha save(Cozinha cozinha) {
        requireNonExistentObjectInDB(cozinha);
        return repository.save(cozinha);
    }

    public void delete(Long id) {
        final var obj = repository.findById(id);
        if (obj.isEmpty()) {
            throw new ObjectNotFoundException("Objeto não encontrado ID: "
                    + id + " do tipo: " + Cozinha.class.getName());
        }
        try {
            repository.delete(obj.get());
        } catch (EntityInUseException e) {
            e.getReturneMessage();
        }
    }

    public Cozinha update(Long id, Cozinha cozinha) {
        final var obj = repository.findById(id);
        if (obj.isEmpty()) {
            throw new ObjectNotFoundException("Objeto não encontrado ID: "
                    + id + " do tipo: " + Cozinha.class.getName());
        }
        requireNonExistentObjectInDB(cozinha);
        obj.get().setNome(cozinha.getNome());
        return repository.save(obj.get());
    }

    private void requireNonExistentObjectInDB(Cozinha cozinha) {
        final var obj = repository.findByNome(cozinha.getNome());
        if (obj != null) {
            throw new ObjectExistingException("Objeto não encontrado ID: "
                    + cozinha.getNome() + " do tipo: "
                    + Cozinha.class.getName());
        }
    }

}
