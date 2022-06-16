package com.dantas.algafood.doman.repositories;

import com.dantas.algafood.doman.model.Restaurante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestauranteRepository extends JpaRepository<Restaurante, Long> {

    Restaurante findByNome(String nome);
}
