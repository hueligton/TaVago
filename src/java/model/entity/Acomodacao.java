package model.entity;

public class Acomodacao {

    private int idAcomodacao;

    private String descricao;

    private int valor;

    private Categoria categoria;

    public Acomodacao() {
    }

    public Acomodacao(String descricao, int valor, Categoria categoria) {
        this.descricao = descricao;
        this.valor = valor;
        this.categoria = categoria;
    }

    public Acomodacao(int idAcomodacao, String descricao, int valor, Categoria categoria) {
        this.idAcomodacao = idAcomodacao;
        this.descricao = descricao;
        this.valor = valor;
        this.categoria = categoria;
    }

    public int getIdAcomodacao() {
        return idAcomodacao;
    }

    public void setIdAcomodacao(int idAcomodacao) {
        this.idAcomodacao = idAcomodacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
