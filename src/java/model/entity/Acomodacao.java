package model.entity;

import java.util.Collection;

public class Acomodacao {

    private int idAcomodacao;

    private String descricao;

    private int valor;

    private Collection<ItemReserva> itemReserva;

    private Categoria categoria;

    private Hotel hotel;

    private Collection<ItemCarrinho> itemCarrinho;

    public Acomodacao() {
    }

    public Acomodacao(String descricao, int valor, Collection<ItemReserva> itemReserva, Categoria categoria, Hotel hotel, Collection<ItemCarrinho> itemCarrinho) {
        this.descricao = descricao;
        this.valor = valor;
        this.itemReserva = itemReserva;
        this.categoria = categoria;
        this.hotel = hotel;
        this.itemCarrinho = itemCarrinho;
    }

    public Acomodacao(int idAcomodacao, String descricao, int valor, Collection<ItemReserva> itemReserva, Categoria categoria, Hotel hotel, Collection<ItemCarrinho> itemCarrinho) {
        this.idAcomodacao = idAcomodacao;
        this.descricao = descricao;
        this.valor = valor;
        this.itemReserva = itemReserva;
        this.categoria = categoria;
        this.hotel = hotel;
        this.itemCarrinho = itemCarrinho;
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

    public Collection<ItemReserva> getItemReserva() {
        return itemReserva;
    }

    public void setItemReserva(Collection<ItemReserva> itemReserva) {
        this.itemReserva = itemReserva;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public Collection<ItemCarrinho> getItemCarrinho() {
        return itemCarrinho;
    }

    public void setItemCarrinho(Collection<ItemCarrinho> itemCarrinho) {
        this.itemCarrinho = itemCarrinho;
    }

}
