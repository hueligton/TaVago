package model.entity;

public class Categoria {

    private int id;

    private int descricao;

    public Categoria() {
    }

    public Categoria(int descricao) {
        this.descricao = descricao;
    }

    public Categoria(int id, int descricao) {
        this.id = id;
        this.descricao = descricao;
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
}
