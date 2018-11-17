package model.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name = "ACOMODACAO", schema = "TaVagoDB")
public class Acomodacao implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "acomodacao_sequence")
    @SequenceGenerator(name = "acomodacao_sequence", sequenceName = "acomodacao_seq", allocationSize = 1)
    @Column(nullable = false)
    private Integer idAcomodacao;

    @Column(nullable = false, length = 255)
    private String descricao;

    @Column(nullable = false)
    private Float valor;

    @ManyToOne
    private Categoria categoria;

    public Acomodacao() {
    }

    public Acomodacao(String descricao, Float valor, Categoria categoria) {
        this.descricao = descricao;
        this.valor = valor;
        this.categoria = categoria;
    }

    public Acomodacao(Integer idAcomodacao, String descricao, Float valor, Categoria categoria) {
        this.idAcomodacao = idAcomodacao;
        this.descricao = descricao;
        this.valor = valor;
        this.categoria = categoria;
    }

    public Integer getIdAcomodacao() {
        return idAcomodacao;
    }

    public void setIdAcomodacao(Integer idAcomodacao) {
        this.idAcomodacao = idAcomodacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
