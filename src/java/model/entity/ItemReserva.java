package model.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;

@Entity
@Table(name = "ITEMRESERVA")
public class ItemReserva implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "itemreserva_sequence")
    @SequenceGenerator(name = "itemreserva_sequence", sequenceName = "itemreserva_seq", allocationSize = 1)
    @Column(nullable = false)
    private Integer idItemReserva;

    @Column(nullable = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataInicial;

    @Column(nullable = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataFinal;

    @Column(nullable = false)
    private Float valor;

    @ManyToOne
    private Acomodacao acomodacao;

    @OneToOne
    private Hospede hospede;

    public ItemReserva() {
    }

    public ItemReserva(Integer idItemReserva, Date dataInicial, Date dataFinal, float valor, Acomodacao acomodacao, Hospede hospede) {
        this.idItemReserva = idItemReserva;
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
        this.valor = valor;
        this.acomodacao = acomodacao;
        this.hospede = hospede;
    }

    public ItemReserva(Date dataInicial, Date dataFinal, Float valor, Acomodacao acomodacao, Hospede hospede) {
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
        this.valor = valor;
        this.acomodacao = acomodacao;
        this.hospede = hospede;
    }

    public Integer getIdItemReserva() {
        return idItemReserva;
    }

    public void setIdItemReserva(Integer idItemReserva) {
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

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
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
