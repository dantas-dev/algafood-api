package com.dantas.algafood.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table(name = "tb_produto")
public class Produto extends GenericEntity implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Column(nullable = false)
	private String nome;
	
	@Column(nullable = false)
	private String descricao;
	
	@Column(nullable = false)
	private BigDecimal preco;
	
	@Column(nullable = false)
	private Boolean ativo;

	@JsonIgnore
	@ManyToOne
	@JoinColumn(nullable = false)
	private Restaurante restaurante;

}
