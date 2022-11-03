package com.dantas.algafood.repository;

import com.dantas.algafood.entity.GenericEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.UUID;
@NoRepositoryBean
public interface GenericRepository<T extends GenericEntity> extends JpaRepository<T, UUID> {
}
