package com.dantas.algafood.doman.repositories;

import com.dantas.algafood.doman.model.Cozinha;
import com.dantas.algafood.doman.model.Restaurante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CozinhaRepository extends JpaRepository<Cozinha, Long> {

    Restaurante findByNome(String nome);
}
