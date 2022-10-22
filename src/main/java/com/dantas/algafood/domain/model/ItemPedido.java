package com.dantas.algafood.domain.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

@Getter
@Setter
@Entity
@Table(name = "tb_item_pedido")
public class ItemPedido implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer quantidade;

    private BigDecimal precoUnitario;

    private BigDecimal precoTotal;

    private String observacao;

    @ManyToOne
    @JoinColumn(name = "pedido_id", nullable = false)
    private Pedido pedido;

    @ManyToOne
    @JoinColumn(name = "produto_id", nullable = false)
    private Produto produto;

    public ItemPedido() {
    }

    public ItemPedido(Long id, Integer quantidade,
                      BigDecimal precoUnitario, BigDecimal precoTotal,
                      String observacao, Pedido pedido, Produto produto) {
        this.id = id;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
        this.precoTotal = precoTotal;
        this.observacao = observacao;
        this.pedido = pedido;
        this.produto = produto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItemPedido that = (ItemPedido) o;
        return Objects.equals(id, that.id)
                && Objects.equals(precoUnitario, that.precoUnitario)
                && Objects.equals(precoTotal, that.precoTotal)
                && Objects.equals(quantidade, that.quantidade)
                && Objects.equals(observacao, that.observacao)
                && Objects.equals(pedido, that.pedido)
                && Objects.equals(produto, that.produto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, precoUnitario,
                precoTotal, quantidade,
                observacao, pedido, produto);
    }

    @Override
    public String toString() {
        return "ItemPedido{" +
                "id=" + id +
                ", precoUnitario=" + precoUnitario +
                ", precoTotal=" + precoTotal +
                ", quantidade=" + quantidade +
                ", observacao='" + observacao + '\'' +
                ", pedido=" + pedido +
                ", produto=" + produto +
                '}';
    }
}
