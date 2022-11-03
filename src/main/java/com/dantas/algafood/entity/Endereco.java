package com.dantas.algafood.entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Embeddable
public class Endereco implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Column(name = "endereco_cep")
	private String cep;
	
	@Column(name = "endereco_logradouro")
	private String logradouro;
	
	@Column(name = "endereco_numero")
	private String numero;
	
	@Column(name = "endereco_complemento")
	private String complemento;
	
	@Column(name = "endereco_bairro")
	private String bairro;
	
	@ManyToOne //(fetch = FetchType.LAZY)
	@JoinColumn(name = "endereco_cidade_id")
	private Cidade cidade;
	
	public Endereco() {
		
	}
	
	public Endereco(String cep, String logradouro,
			String numero, String complemento,
			String bairro, Cidade cidade) {
		super();
		this.cep = cep;
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cidade = cidade;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(bairro, cep,
				cidade, complemento,
				logradouro, numero);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Endereco other = (Endereco) obj;
		return Objects.equals(bairro, other.bairro)
				&& Objects.equals(cep, other.cep)
				&& Objects.equals(cidade, other.cidade)
				&& Objects.equals(complemento, other.complemento)
				&& Objects.equals(logradouro, other.logradouro)
				&& Objects.equals(numero, other.numero);
	}
	@Override
	public String toString() {
		return "Endereco [cep=" + cep +
				", logradouro=" + logradouro +
				", numero=" + numero +
				", complemento=" + complemento +
				", bairro=" + bairro +
				", cidade=" + cidade + "]";
	}

}
