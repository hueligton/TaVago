package model.entity;

public class Hospede extends Pessoa {

    private String rua;

    private int numeroCasa;

    private String cidade;

    private String estado;

    private String pais;

    public Hospede() {
    }

    public Hospede(String rua, int numeroCasa, String cidade, String estado, String pais) {

        this.rua = rua;
        this.numeroCasa = numeroCasa;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
    }

    public Hospede(int id, String nome, long cpf, int telefone, String rua, int numeroCasa, String cidade, String estado, String pais) {
        super(id, nome, cpf, telefone);
        this.rua = rua;
        this.numeroCasa = numeroCasa;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
    }

    public Hospede(String nome, long cpf, int telefone, String rua, int numeroCasa, String cidade, String estado, String pais) {
        super(nome, cpf, telefone);
        this.rua = rua;
        this.numeroCasa = numeroCasa;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumeroCasa() {
        return numeroCasa;
    }

    public void setNumeroCasa(int numeroCasa) {
        this.numeroCasa = numeroCasa;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
}
