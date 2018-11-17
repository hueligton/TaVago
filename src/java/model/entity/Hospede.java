package model.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "HOSPEDE")
public class Hospede extends Pessoa implements Serializable{

    @Column(nullable = false, length = 255)
    private String rua;

    @Column(nullable = false)
    private Integer numeroCasa;

    @Column(nullable = false, length = 255)
    private String cidade;

    @Column(nullable = false, length = 255)
    private String estado;

    @Column(nullable = false, length = 255)
    private String pais;

    public Hospede() {
    }

    public Hospede(String rua, Integer numeroCasa, String cidade, String estado, String pais) {

        this.rua = rua;
        this.numeroCasa = numeroCasa;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
    }

    public Hospede(Integer id, String nome, Long cpf, Integer telefone, String rua, Integer numeroCasa, String cidade, String estado, String pais) {
        super(id, nome, cpf, telefone);
        this.rua = rua;
        this.numeroCasa = numeroCasa;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
    }

    public Hospede(String nome, Long cpf, Integer telefone, String rua, Integer numeroCasa, String cidade, String estado, String pais) {
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

    public Integer getNumeroCasa() {
        return numeroCasa;
    }

    public void setNumeroCasa(Integer numeroCasa) {
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
