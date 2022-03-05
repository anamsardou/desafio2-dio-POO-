package br.com.dio.desafio2.dominio;

import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;

public class Pedido extends ItemPedido {
    private int numero;
    private ItemPedido itemPedido;

    @Override
    public String toString() {
        return "Pedido{" +
                "numero=" + numero +
                ", itemPedido=" + itemPedido +
                ", produto1=" + produto1 +
                ", fornecedor1=" + fornecedor1 +
                ", data=" + data +
                '}';
    }

    public ItemPedido getItemPedido() {
        return itemPedido;
    }

    public void setItemPedido(ItemPedido itemPedido) {
        this.itemPedido = itemPedido;
    }

    public Set<ItemPedido> getProduto1() {
        return produto1;
    }

    public void setProduto1(Set<ItemPedido> produto1) {
        this.produto1 = produto1;
    }

    public Set<Fornecedor> getFornecedor1() {
        return fornecedor1;
    }

    public void setFornecedor1(Set<Fornecedor> fornecedor1) {
        this.fornecedor1 = fornecedor1;
    }

    private Set<ItemPedido> produto1 = new LinkedHashSet<>();
    private Set<Fornecedor> fornecedor1 = new LinkedHashSet<>();


    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public LocalDate getData() {
        return data;
    }


    private final LocalDate data = LocalDate.now();

}
