package model.entity;

public class Hospede extends Pessoa {

    private String rua;

    private int numeroCasa;

    private String cidade;

    private String estado;

    private String pais;

    private ItemReserva itemReserva;

    public Hospede() {
    }

    public Hospede(String rua, int numeroCasa, String cidade, String estado, String pais, ItemReserva itemReserva) {
        this.rua = rua;
        this.numeroCasa = numeroCasa;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
        this.itemReserva = itemReserva;
    }

    public Hospede(String rua, int numeroCasa, String cidade, String estado, String pais, ItemReserva itemReserva, int id, String nome, long cpf, int telefone) {
        super(id, nome, cpf, telefone);
        this.rua = rua;
        this.numeroCasa = numeroCasa;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
        this.itemReserva = itemReserva;
    }

    public Hospede(String rua, int numeroCasa, String cidade, String estado, String pais, ItemReserva itemReserva, String nome, long cpf, int telefone) {
        super(nome, cpf, telefone);
        this.rua = rua;
        this.numeroCasa = numeroCasa;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
        this.itemReserva = itemReserva;
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

    public ItemReserva getItemReserva() {
        return itemReserva;
    }

    public void setItemReserva(ItemReserva itemReserva) {
        this.itemReserva = itemReserva;
    }

}
