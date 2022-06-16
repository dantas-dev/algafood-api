package com.dantas.algafood.doman.servicies;

import com.dantas.algafood.doman.model.Cozinha;
import com.dantas.algafood.doman.model.Restaurante;
import com.dantas.algafood.doman.repositories.CozinhaRepository;
import com.dantas.algafood.doman.repositories.RestauranteRepository;
import com.dantas.algafood.doman.servicies.exceptions.BadRequestException;
import com.dantas.algafood.doman.servicies.exceptions.EntityInUseException;
import com.dantas.algafood.doman.servicies.exceptions.ObjectExistingException;
import com.dantas.algafood.doman.servicies.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestauranteService {

    @Autowired
    private RestauranteRepository repository;

    @Autowired
    private CozinhaRepository cozinhaRepository;

    public List<Restaurante> findAll() {
        return repository.findAll();
    }

    public Restaurante findById(Long id) {
        final var obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                "Objeto não encontrado ID: " + id + " do tipo: " + Restaurante.class.getName()));
    }

    public Restaurante save(Restaurante restaurante) {
        requireNonExistentObjectInDB(restaurante);
        objectCozinhaNotExistent(restaurante.getCozinha().getId());
        return repository.save(restaurante);
    }

    public void delete(Long id) {
        final var obj = repository.findById(id);
        if (obj.isEmpty()) {
            throw new ObjectNotFoundException("Objeto não encontrado ID: "
                    + id + " do tipo: " + Restaurante.class.getName());
        }
        try {
            repository.delete(obj.get());
        } catch (EntityInUseException e) {
            e.getReturneMessage();
        }
    }

    public Restaurante update(Long id, Restaurante restaurante) {
        final var obj = repository.findById(id);
        if (obj.isEmpty()) {
            throw new ObjectNotFoundException("Objeto não encontrado ID: "
                    + id + " do tipo: " + Restaurante.class.getName());
        }
        requireNonExistentObjectInDB(restaurante);
        objectCozinhaNotExistent(restaurante.getCozinha().getId());
        obj.get().setNome(restaurante.getNome());
        obj.get().setTaxaFrete(restaurante.getTaxaFrete());
        obj.get().setCozinha(restaurante.getCozinha());
        return repository.save(obj.get());
    }

    private void requireNonExistentObjectInDB(Restaurante restaurante) {
        final var obj = repository.findByNome(restaurante.getNome());
        if (obj != null) {
            throw new ObjectExistingException("Um objeto com o nome: "
                    + restaurante.getNome() + " do tipo: "
                    + Restaurante.class.getName() + " já existe!");
        }
    }

    private void objectCozinhaNotExistent(Long id) {
        final var obj = cozinhaRepository.findById(id);
        if (obj.isEmpty()) {
            throw new BadRequestException("Não existe Cozinha com o ID: "
                    + id);
        }
    }

}
