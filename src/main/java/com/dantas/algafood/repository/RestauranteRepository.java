package com.dantas.algafood.repository;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.dantas.algafood.entity.Restaurante;

@Repository
public interface RestauranteRepository extends GenericRepository<Restaurante>, JpaSpecificationExecutor<Restaurante>{
}
