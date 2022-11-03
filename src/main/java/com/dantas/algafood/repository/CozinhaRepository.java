package com.dantas.algafood.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dantas.algafood.entity.Cozinha;

@Repository
public interface CozinhaRepository extends GenericRepository<Cozinha> {
}
