package com.dantas.algafood.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tb_grupo")
public class Grupo extends GenericEntity implements Serializable{

	private static final long serialVersionUID = 1L;

	@Column(nullable = false)
	private String nome;
	
	@ManyToMany
	@JoinTable(name = "tb_grupo_permissao",
	joinColumns = @JoinColumn(name = "grupo_id"),
	inverseJoinColumns = @JoinColumn(name = "permissao_id"))
	private List<Permissao> permissoes = new ArrayList<>();
	
}
