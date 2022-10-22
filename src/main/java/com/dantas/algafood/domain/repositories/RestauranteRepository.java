package com.dantas.algafood.domain.repositories;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.dantas.algafood.domain.model.Restaurante;

@Repository
public interface RestauranteRepository extends JpaRepository<Restaurante, Long>, JpaSpecificationExecutor<Restaurante>{

    Restaurante findRestauranteByNome(String nome);
    
    Optional<List<Restaurante>> findFretGratisByTaxaFrete(BigDecimal taxaFrete);
    
    List<Restaurante> find(String nome, BigDecimal taxaFreteInicial, BigDecimal taxaFreteFinal);    
    
    List<Restaurante> findComFreteGratis(String nome);

    @Query("from Restaurante r join r.cozinha left join fetch r.formaPagamentos")
    List<Restaurante> findAll();


}
