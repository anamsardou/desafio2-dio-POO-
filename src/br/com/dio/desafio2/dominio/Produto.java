package br.com.dio.desafio2.dominio;

import java.util.LinkedHashSet;
import java.util.Set;

public class Produto implements Produto2 {

    private int codigo;
    private String descricao;
    private int quantidadeEstoque;

    private Set<Produto> produtosSolicitados = new LinkedHashSet<>();
    private Set<Produto> produtosComprados = new LinkedHashSet<>();

    @Override
    public String toString() {
        return "Produto{" +
                "codigo=" + codigo +
                ", descricao='" + descricao + '\'' +
                ", quantidadeEstoque=" + quantidadeEstoque +
                '}';
    }

    @Override
    public int getCodigo() {
        return codigo;
    }

    @Override
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String getDescricao() {
        return descricao;
    }

   @Override
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    @Override
    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }
}
