package com.dantas.algafood.domain.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Getter
@Setter
@Entity
@Table(name = "tb_pedido")
public class Pedido implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

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

    public Pedido() {

    }

    public Pedido(Long id, Restaurante restaurante,
                  Usuario cliente, BigDecimal subtotal,
                  BigDecimal taxaFrete, BigDecimal valorTotal,
                  Endereco enderecoEntrega, FormaPagamento formaPagamento,
                  StatusPedido statusPedido, LocalDateTime dataCriacao,
                  LocalDateTime dataConfurmacao, LocalDateTime dataCancelamento,
                  LocalDateTime dataEntrega) {
        this.id = id;
        this.restaurante = restaurante;
        this.cliente = cliente;
        this.subtotal = subtotal;
        this.taxaFrete = taxaFrete;
        this.valorTotal = valorTotal;
        this.enderecoEntrega = enderecoEntrega;
        this.formaPagamento = formaPagamento;
        this.statusPedido = statusPedido;
        this.dataCriacao = dataCriacao;
        this.dataConfurmacao = dataConfurmacao;
        this.dataCancelamento = dataCancelamento;
        this.dataEntrega = dataEntrega;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pedido pedido = (Pedido) o;
        return Objects.equals(id, pedido.id)
                && Objects.equals(subtotal, pedido.subtotal)
                && Objects.equals(taxaFrete, pedido.taxaFrete)
                && Objects.equals(valorTotal, pedido.valorTotal)
                && Objects.equals(dataCriacao, pedido.dataCriacao)
                && Objects.equals(dataConfurmacao, pedido.dataConfurmacao)
                && Objects.equals(dataCancelamento, pedido.dataCancelamento)
                && Objects.equals(dataEntrega, pedido.dataEntrega)
                && Objects.equals(formaPagamento, pedido.formaPagamento)
                && Objects.equals(restaurante, pedido.restaurante)
                && Objects.equals(cliente, pedido.cliente)
                && Objects.equals(enderecoEntrega, pedido.enderecoEntrega);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, subtotal, taxaFrete,
                valorTotal, dataCriacao, dataConfurmacao,
                dataCancelamento, dataEntrega, formaPagamento,
                restaurante, cliente, enderecoEntrega);
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", subtotal=" + subtotal +
                ", taxaFrete=" + taxaFrete +
                ", valorTotal=" + valorTotal +
                ", dataCriacao=" + dataCriacao +
                ", dataConfurmacao=" + dataConfurmacao +
                ", dataCancelamento=" + dataCancelamento +
                ", dataEntrega=" + dataEntrega +
                ", formaPagamento=" + formaPagamento +
                ", restaurante=" + restaurante +
                ", cliente=" + cliente +
                ", enderecoEntrega=" + enderecoEntrega +
                '}';
    }
}
