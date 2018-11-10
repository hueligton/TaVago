package model.entity;

import java.util.Date;

public class ItemReserva {

    private int idItemReserva;

    private Date dataInicial;

    private Date dataFinal;

    private float valor;

    private Reserva reserva;

    private Acomodacao acomodacao;

    private ItemCarrinho itemCarrinho;

    private Hospede hospede;

    public ItemReserva() {
    }

    public ItemReserva(int idItemReserva, Date dataInicial, Date dataFinal, float valor, Reserva reserva, Acomodacao acomodacao, ItemCarrinho itemCarrinho, Hospede hospede) {
        this.idItemReserva = idItemReserva;
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
        this.valor = valor;
        this.reserva = reserva;
        this.acomodacao = acomodacao;
        this.itemCarrinho = itemCarrinho;
        this.hospede = hospede;
    }

    public ItemReserva(Date dataInicial, Date dataFinal, float valor, Reserva reserva, Acomodacao acomodacao, ItemCarrinho itemCarrinho, Hospede hospede) {
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
        this.valor = valor;
        this.reserva = reserva;
        this.acomodacao = acomodacao;
        this.itemCarrinho = itemCarrinho;
        this.hospede = hospede;
    }

    public int getIdItemReserva() {
        return idItemReserva;
    }

    public void setIdItemReserva(int idItemReserva) {
        this.idItemReserva = idItemReserva;
    }

    public Date getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(Date dataInicial) {
        this.dataInicial = dataInicial;
    }

    public Date getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(Date dataFinal) {
        this.dataFinal = dataFinal;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    public Acomodacao getAcomodacao() {
        return acomodacao;
    }

    public void setAcomodacao(Acomodacao acomodacao) {
        this.acomodacao = acomodacao;
    }

    public ItemCarrinho getItemCarrinho() {
        return itemCarrinho;
    }

    public void setItemCarrinho(ItemCarrinho itemCarrinho) {
        this.itemCarrinho = itemCarrinho;
    }

    public Hospede getHospede() {
        return hospede;
    }

    public void setHospede(Hospede hospede) {
        this.hospede = hospede;
    }

}
