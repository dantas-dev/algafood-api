package com.dantas.algafood.repository;

import com.dantas.algafood.entity.Permissao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PermissaoRepository extends GenericRepository<Permissao> {
}
