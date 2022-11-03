package com.dantas.algafood.repository.spec;

import java.io.Serializable;
import java.math.BigDecimal;

import org.springframework.data.jpa.domain.Specification;

import com.dantas.algafood.entity.Restaurante;

public class RestauranteSpecs implements Serializable {

	private static final long serialVersionUID = 1L;

	public static Specification<Restaurante> comFreteGratis() {
		return (root, query, builder) -> builder.equal(root.get("taxaFrete"), BigDecimal.ZERO);
	}

	public static Specification<Restaurante> comNomeSemelhante(String nome) {
		return (root, query, builder) -> builder.like(root.get("nome"), "%" + nome + "%");
	}

}
