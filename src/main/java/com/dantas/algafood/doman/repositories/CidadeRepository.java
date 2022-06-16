package com.dantas.algafood.doman.repositories;

import com.dantas.algafood.doman.model.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CidadeRepository extends JpaRepository<Cidade, Long> {

    Cidade findByNome(String nome);

}
