package br.com.dio.desafio2.dominio;

import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto();
        produto1.setCodigo(001);
        produto1.setDescricao("Papel Higiênico");
        produto1.setQuantidadeEstoque(10);

        Produto produto2 = new Produto();
        produto2.setCodigo(002);
        produto2.setDescricao("Papel Toalha");
        produto2.setQuantidadeEstoque(25);

        Produto produto3 = new Produto();
        produto3.setCodigo(003);
        produto3.setDescricao("Guardanapo");
        produto3.setQuantidadeEstoque(40);

        Fornecedor fornecedor1 = new Fornecedor();
        fornecedor1.setCodigo(111);
        fornecedor1.setNome("RGB");
        fornecedor1.setDescricao("Fornecedor de materiais de limpeza");
        fornecedor1.setTelefone(229986-3451);

        Fornecedor fornecedor2 = new Fornecedor();
        fornecedor2.setCodigo(222);
        fornecedor2.setNome("Galera");
        fornecedor2.setDescricao("Fornecedor de refrigerante");
        fornecedor2.setTelefone(2299856-4758);

        System.out.println(fornecedor1);
        System.out.println(fornecedor2);

        ItemPedido itemPedido1 = new ItemPedido();
        itemPedido1.setProduto(produto1);
        itemPedido1.setPrecoUnitário(9.00);
        itemPedido1.setQuantidade(9);
        itemPedido1.setFornecedor(fornecedor1);
        System.out.println(itemPedido1);

        ItemPedido itemPedido2 = new ItemPedido();
        itemPedido2.setProduto(produto2);
        itemPedido2.setPrecoUnitário(3.50);
        itemPedido2.setQuantidade(20);
        System.out.println(itemPedido2);

        ItemPedido itemPedido3 = new ItemPedido();
        itemPedido3.setProduto(produto3);
        itemPedido3.setPrecoUnitário(1.50);
        itemPedido3.setQuantidade(50);
        System.out.println(itemPedido3);

        Pedido pedido1 = new Pedido();
        pedido1.setNumero(1);
        pedido1.setItemPedido(itemPedido1);
        System.out.println(pedido1);


    }
}
