package com.dantas.algafood.service;

import com.dantas.algafood.entity.Estado;
import com.dantas.algafood.repository.GenericRepository;
import org.springframework.stereotype.Service;

@Service
public class EstadoService extends GenericService<Estado> {

    public EstadoService(GenericRepository<Estado> repository) {
        super(repository);
    }
}
