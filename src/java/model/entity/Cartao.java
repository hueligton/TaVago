package model.entity;

public class Cartao {

    private String titular;

    private String numeroCartao;

    private String vencimento;

    private int codigoSeguranca;

    public Cartao() {
    }

    public Cartao(String titular, String numeroCartao, String vencimento, int codigoSeguranca) {
        this.titular = titular;
        this.numeroCartao = numeroCartao;
        this.vencimento = vencimento;
        this.codigoSeguranca = codigoSeguranca;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public String getVencimento() {
        return vencimento;
    }

    public void setVencimento(String vencimento) {
        this.vencimento = vencimento;
    }

    public int getCodigoSeguranca() {
        return codigoSeguranca;
    }

    public void setCodigoSeguranca(int codigoSeguranca) {
        this.codigoSeguranca = codigoSeguranca;
    }
}
