package com.dantas.algafood.domain.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tb_produto")
public class Produto implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
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

	public Produto() {
	
	}

	public Produto(Long id, String nome, String descricao, BigDecimal preco, Boolean ativo, Restaurante restaurante) {
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.preco = preco;
		this.ativo = ativo;
		this.restaurante = restaurante;
	}

	@Override
	public int hashCode() {
		return Objects.hash(ativo, descricao, id, nome, preco, restaurante);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return Objects.equals(ativo, other.ativo)
				&& Objects.equals(descricao, other.descricao)
				&& Objects.equals(id, other.id)
				&& Objects.equals(nome, other.nome)
				&& Objects.equals(preco, other.preco)
				&& Objects.equals(restaurante, other.restaurante);
	}

	@Override
	public String toString() {
		return "Produto [id=" + id
				+ ", nome=" + nome
				+ ", descricao=" + descricao
				+ ", preco=" + preco
				+ ", ativo=" + ativo
				+ ", restaurante=" + restaurante + "]";
	}

}
