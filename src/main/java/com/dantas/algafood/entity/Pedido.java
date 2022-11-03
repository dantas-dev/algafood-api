package com.dantas.algafood.entity;

import com.dantas.algafood.enums.StatusPedido;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "tb_pedido")
public class Pedido extends GenericEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @ManyToOne
    @JoinColumn(name = "restaurante_id", nullable = false)
    private Restaurante restaurante;

    @ManyToOne
    @JoinColumn(name = "usuario_cliente_id", nullable = false)
    private Usuario cliente;

    @OneToMany(mappedBy = "pedido")
    private List<ItemPedido> itens = new ArrayList<>();

    @Column(nullable = false)
    private BigDecimal subtotal;

    @Column(nullable = false)
    private BigDecimal taxaFrete;

    @Column(nullable = false)
    private BigDecimal valorTotal;

    @Embedded
    @JoinColumn(name = "endereco_cidade_id", nullable = false)
    private Endereco enderecoEntrega;

    @ManyToOne
    @JoinColumn(name = "forma_pagamento_id", nullable = false)
    private FormaPagamento formaPagamento;

    private StatusPedido statusPedido;

    @CreationTimestamp
    @Column(nullable = false)
    private LocalDateTime dataCriacao;

    private LocalDateTime dataConfurmacao;

    private LocalDateTime dataCancelamento;

    private LocalDateTime dataEntrega;

}
