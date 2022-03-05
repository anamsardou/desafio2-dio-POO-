package br.com.dio.desafio2.dominio;

public class ItemPedido extends Fornecedor {
    private Produto produto;
    private Fornecedor fornecedor;

    @Override
    public String toString() {
        return "ItemPedido{" +
                "produto=" + produto +
                ", fornecedor=" + fornecedor +
                ", precoUnitário=" + precoUnitário +
                ", quantidade=" + quantidade +
                '}';
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    private double precoUnitário;
    private int quantidade;

    public double getPrecoUnitário() {
        return precoUnitário;
    }

    public void setPrecoUnitário(double precoUnitário) {
        this.precoUnitário = precoUnitário;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
