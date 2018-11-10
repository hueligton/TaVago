package model.entity;

import java.util.Collection;

public class Categoria {

    private int id;

    private int descricao;

    private Collection<Acomodacao> acomodacao;

    public Categoria() {
    }

    public Categoria(int descricao, Collection<Acomodacao> acomodacao) {
        this.descricao = descricao;
        this.acomodacao = acomodacao;
    }

    public Categoria(int id, int descricao, Collection<Acomodacao> acomodacao) {
        this.id = id;
        this.descricao = descricao;
        this.acomodacao = acomodacao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDescricao() {
        return descricao;
    }

    public void setDescricao(int descricao) {
        this.descricao = descricao;
    }

    public Collection<Acomodacao> getAcomodacao() {
        return acomodacao;
    }

    public void setAcomodacao(Collection<Acomodacao> acomodacao) {
        this.acomodacao = acomodacao;
    }

}
