package com.dantas.algafood.doman.servicies;

import com.dantas.algafood.doman.model.Cidade;
import com.dantas.algafood.doman.repositories.CidadeRepository;
import com.dantas.algafood.doman.repositories.EstadoRepository;
import com.dantas.algafood.doman.servicies.exceptions.BadRequestException;
import com.dantas.algafood.doman.servicies.exceptions.EntityInUseException;
import com.dantas.algafood.doman.servicies.exceptions.ObjectExistingException;
import com.dantas.algafood.doman.servicies.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CidadeService {

    @Autowired
    private CidadeRepository repository;

    @Autowired
    private EstadoRepository estadoRepository;

    public List<Cidade> findAll() {
        return repository.findAll();
    }

    public Cidade findById(Long id) {
        final var obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                "Objeto não encontrado ID: " + id + " do tipo: " + Cidade.class.getName()));
    }

    public Cidade save(Cidade cidade) {
        requireNonExistentObjectInDB(cidade);
        return repository.save(cidade);
    }

    public void delete(Long id) {
        final var obj = repository.findById(id);
        if (obj.isEmpty()) {
            throw new ObjectNotFoundException("Objeto não encontrado ID: "
                    + id + " do tipo: " + Cidade.class.getName());
        }
        try {
            repository.delete(obj.get());
        } catch (EntityInUseException e) {
            e.getReturneMessage();
        }
    }

    public Cidade update(Long id, Cidade cidade) {
        final var obj = repository.findById(id);
        if (obj.isEmpty()) {
            throw new ObjectNotFoundException("Objeto não encontrado ID: "
                    + id + " do tipo: " + Cidade.class.getName());
        }
        requireNonExistentObjectInDB(cidade);
        objectEstadoNotExistent(cidade.getEstado().getId());
        obj.get().setNome(cidade.getNome());
        obj.get().setEstado(cidade.getEstado());
        return repository.save(obj.get());
    }

    private void requireNonExistentObjectInDB(Cidade cidade) {
        final var obj = repository.findByNome(cidade.getNome());
        if (obj != null) {
            throw new ObjectExistingException("Um objeto com o nome: "
                    + cidade.getNome() + " do tipo: "
                    + Cidade.class.getName() + " já existe!");
        }
    }

    private void objectEstadoNotExistent(Long id) {
        final var obj = estadoRepository.findById(id);
        if (obj.isEmpty()) {
            throw new BadRequestException("Não existe Estado com o ID: "
                    + id);
        }
    }
}
