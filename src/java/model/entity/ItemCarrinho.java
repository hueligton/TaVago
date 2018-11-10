package model.entity;

import java.util.Date;

public class ItemCarrinho {

    private Date dataInicial;

    private Date dataFinal;

    private ItemReserva itemReserva;

    private Carrinho carrinho;

    private Acomodacao acomodacao;

    public ItemCarrinho() {
    }

    public ItemCarrinho(Date dataInicial, Date dataFinal, ItemReserva itemReserva, Carrinho carrinho, Acomodacao acomodacao) {
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
        this.itemReserva = itemReserva;
        this.carrinho = carrinho;
        this.acomodacao = acomodacao;
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

    public ItemReserva getItemReserva() {
        return itemReserva;
    }

    public void setItemReserva(ItemReserva itemReserva) {
        this.itemReserva = itemReserva;
    }

    public Carrinho getCarrinho() {
        return carrinho;
    }

    public void setCarrinho(Carrinho carrinho) {
        this.carrinho = carrinho;
    }

    public Acomodacao getAcomodacao() {
        return acomodacao;
    }

    public void setAcomodacao(Acomodacao acomodacao) {
        this.acomodacao = acomodacao;
    }

}
