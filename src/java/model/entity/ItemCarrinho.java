package model.entity;

import java.util.Date;

public class ItemCarrinho {

    private Date dataInicial;

    private Date dataFinal;

    private Acomodacao acomodacao;

    public ItemCarrinho() {
    }

    public ItemCarrinho(Date dataInicial, Date dataFinal, Acomodacao acomodacao) {
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
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

    public Acomodacao getAcomodacao() {
        return acomodacao;
    }

    public void setAcomodacao(Acomodacao acomodacao) {
        this.acomodacao = acomodacao;
    }

}
