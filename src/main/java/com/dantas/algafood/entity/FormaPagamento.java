package com.dantas.algafood.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "tb_forma_pagamento")
public class FormaPagamento extends GenericEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;

    @Column(nullable = false)
    private String descricao;

}
