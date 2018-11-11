package model.entity;

import java.util.Collection;

public class Hotel {

    private int idHotel;

    private String nome;

    private int quantidadeEstrela;

    private String telefone;

    private String rua;

    private int numeroHotel;

    private String cidade;

    private String estado;

    private String pais;

    private Collection<Acomodacao> acomodacao;

    public Hotel() {
    }

    public Hotel(String nome, int quantidadeEstrela, String telefone, String rua, int numeroHotel, String cidade, String estado, String pais, Collection<Acomodacao> acomodacao) {
        this.nome = nome;
        this.quantidadeEstrela = quantidadeEstrela;
        this.telefone = telefone;
        this.rua = rua;
        this.numeroHotel = numeroHotel;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
        this.acomodacao = acomodacao;
    }

    public Hotel(int idHotel, String nome, int quantidadeEstrela, String telefone, String rua, int numeroHotel, String cidade, String estado, String pais, Collection<Acomodacao> acomodacao) {
        this.idHotel = idHotel;
        this.nome = nome;
        this.quantidadeEstrela = quantidadeEstrela;
        this.telefone = telefone;
        this.rua = rua;
        this.numeroHotel = numeroHotel;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
        this.acomodacao = acomodacao;
    }

    public int getIdHotel() {
        return idHotel;
    }

    public void setIdHotel(int idHotel) {
        this.idHotel = idHotel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeEstrela() {
        return quantidadeEstrela;
    }

    public void setQuantidadeEstrela(int quantidadeEstrela) {
        this.quantidadeEstrela = quantidadeEstrela;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumeroHotel() {
        return numeroHotel;
    }

    public void setNumeroHotel(int numeroHotel) {
        this.numeroHotel = numeroHotel;
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

    public Collection<Acomodacao> getAcomodacao() {
        return acomodacao;
    }

    public void setAcomodacao(Collection<Acomodacao> acomodacao) {
        this.acomodacao = acomodacao;
    }

}
