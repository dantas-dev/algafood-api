package com.dantas.algafood.service;

import com.dantas.algafood.entity.GenericEntity;
import com.dantas.algafood.exception.ObjectNotFoundException;
import com.dantas.algafood.repository.GenericRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.UUID;

@RequiredArgsConstructor
public abstract class GenericService<T extends GenericEntity> {

    private final GenericRepository<T> repository;

    public List<T> findAll() {
        return repository.findAll();
    }

    public T findById(final UUID id) {
        return repository.findById(id)
                .orElseThrow(() -> new ObjectNotFoundException(String.format("object with id: %s not found", id)));
    }

    public T create(final T t) {
        return repository.save(t);
    }

    public void delete(final UUID id) {
        repository.delete(findById(id));
    }
}
