package model.entity;

import java.util.Date;

public class ItemCarrinho {

    private Date dataInicial;

    private Date dataFinal;
    
    private int quantidade;
    
    private Double valor;

    private Acomodacao acomodacao;
    
    private Hospede hospede;

    public ItemCarrinho() {
    }

    public ItemCarrinho(Date dataInicial, Date dataFinal, int quantidade, Acomodacao acomodacao) {
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
        this.quantidade = quantidade;
        this.acomodacao = acomodacao;
        setValor();
    }
    
    public void atualizarValor() {
        valor = acomodacao.getValor() * quantidade;
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

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
        setValor();
    }

    public Double getValor() {
        return valor;
    }

    private void setValor() {
        valor = acomodacao.getValor() * quantidade;
    }

    public Acomodacao getAcomodacao() {
        return acomodacao;
    }

    public Hospede getHospede() {
        return hospede;
    }

    public void setHospede(Hospede hospede) {
        this.hospede = hospede;
    }

    public Hospede getHospede() {
        return hospede;
    }

    public void setHospede(Hospede hospede) {
        this.hospede = hospede;
    }
    
    

}
