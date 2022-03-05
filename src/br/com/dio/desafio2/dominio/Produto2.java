package br.com.dio.desafio2.dominio;

public interface Produto2 {
    @Override
    String toString();

    int getCodigo();

    void setCodigo(int codigo);

    String getDescricao();

    void setDescricao(String descricao);

    int getQuantidadeEstoque();

    void setQuantidadeEstoque(int quantidadeEstoque);
}
