package com.dantas.algafood.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "tb_permissao")
public class Permissao extends GenericEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String descricao;

}
