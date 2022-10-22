package com.dantas.algafood.domain.servicies;

import com.dantas.algafood.domain.model.Estado;
import com.dantas.algafood.domain.repositories.EstadoRepository;
import com.dantas.algafood.domain.servicies.exceptions.EntityInUseException;
import com.dantas.algafood.domain.servicies.exceptions.ObjectExistingException;
import com.dantas.algafood.domain.servicies.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstadoService {

    @Autowired
    private EstadoRepository repository;

    public List<Estado> findAll() {
        return repository.findAll();
    }

    public Estado findById(Long id) {
        final var obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                "Objeto não encontrado ID: " + id + " do tipo: " + Estado.class.getName()));
    }

    public Estado save(Estado estado) {
        requireNonExistentObjectInDB(estado);
        return repository.save(estado);
    }

    public void delete(Long id) {
        final var obj = repository.findById(id);
        if (obj.isEmpty()) {
            throw new ObjectNotFoundException("Objeto não encontrado ID: "
                    + id + " do tipo: " + Estado.class.getName());
        }
        try {
            repository.delete(obj.get());
        }catch (EntityInUseException e) {
            e.getReturneMessage();
        }
    }

    public Estado update(Long id, Estado estado) {
        final var obj = repository.findById(id);
        if (obj.isEmpty()) {
            throw new ObjectNotFoundException("Objeto não encontrado ID: "
                    + id + " do tipo: " + Estado.class.getName());
        }
        requireNonExistentObjectInDB(estado);
        obj.get().setNome(estado.getNome());
        return repository.save(obj.get());
    }

    private void requireNonExistentObjectInDB(Estado estado) {
        final var obj = repository.getNomeEstado(estado.getNome());
        if (obj.get() != null) {
            throw new ObjectExistingException("Um objeto com o nome: "
                    + estado.getNome() + " do tipo: "
                    + Estado.class.getName() + " já existe!");
        }
    }
}
