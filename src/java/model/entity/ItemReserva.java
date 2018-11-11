package model.entity;

import java.util.Date;

public class ItemReserva {

    private int idItemReserva;

    private Date dataInicial;

    private Date dataFinal;

    private float valor;

    private Acomodacao acomodacao;

    private Hospede hospede;

    public ItemReserva() {
    }

    public ItemReserva(int idItemReserva, Date dataInicial, Date dataFinal, float valor, Acomodacao acomodacao, Hospede hospede) {
        this.idItemReserva = idItemReserva;
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
        this.valor = valor;
        this.acomodacao = acomodacao;
        this.hospede = hospede;
    }

    public ItemReserva(Date dataInicial, Date dataFinal, float valor, Acomodacao acomodacao, Hospede hospede) {
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
        this.valor = valor;
        this.acomodacao = acomodacao;
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

    public Acomodacao getAcomodacao() {
        return acomodacao;
    }

    public void setAcomodacao(Acomodacao acomodacao) {
        this.acomodacao = acomodacao;
    }

    public Hospede getHospede() {
        return hospede;
    }

    public void setHospede(Hospede hospede) {
        this.hospede = hospede;
    }

}
