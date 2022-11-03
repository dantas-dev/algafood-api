package com.dantas.algafood.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.dantas.algafood.entity.Estado;

@Repository
public interface EstadoRepository extends GenericRepository<Estado> {

}
