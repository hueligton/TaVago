package model.entity;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "HOTEL", schema = "TaVagoDB")
public class Hotel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "hotel_sequence")
    @SequenceGenerator(name = "hotel_sequence", sequenceName = "hotel_seq", allocationSize = 1)
    @Column(nullable = false)
    private Integer idHotel;

    @Column(nullable = false, length = 255)
    private String nome;

    @Column(nullable = false)
    private Integer quantidadeEstrela;

    @Column(nullable = false, length = 255)
    private String telefone;

    @Column(nullable = false, length = 255)
    private String rua;

    @Column(nullable = false)
    private Integer numeroHotel;

    @Column(nullable = false, length = 255)
    private String cidade;

    @Column(nullable = false, length = 255)
    private String estado;

    @Column(nullable = false, length = 255)
    private String pais;

    @OneToMany
    private Collection<Acomodacao> acomodacao;

    public Hotel() {
    }

    public Hotel(String nome, Integer quantidadeEstrela, String telefone, String rua, Integer numeroHotel, String cidade, String estado, String pais, Collection<Acomodacao> acomodacao) {
        this.nome = nome;
        this.quantidadeEstrela = quantidadeEstrela;
        this.telefone = telefone;
        this.rua = rua;
        this.numeroHotel = numeroHotel;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
        this.acomodacao = acomodacao;
    }

    public Hotel(Integer idHotel, String nome, Integer quantidadeEstrela, String telefone, String rua, Integer numeroHotel, String cidade, String estado, String pais, Collection<Acomodacao> acomodacao) {
        this.idHotel = idHotel;
        this.nome = nome;
        this.quantidadeEstrela = quantidadeEstrela;
        this.telefone = telefone;
        this.rua = rua;
        this.numeroHotel = numeroHotel;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
        this.acomodacao = acomodacao;
    }

    public Integer getIdHotel() {
        return idHotel;
    }

    public void setIdHotel(Integer idHotel) {
        this.idHotel = idHotel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQuantidadeEstrela() {
        return quantidadeEstrela;
    }

    public void setQuantidadeEstrela(Integer quantidadeEstrela) {
        this.quantidadeEstrela = quantidadeEstrela;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public Integer getNumeroHotel() {
        return numeroHotel;
    }

    public void setNumeroHotel(Integer numeroHotel) {
        this.numeroHotel = numeroHotel;
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

    public Collection<Acomodacao> getAcomodacao() {
        return acomodacao;
    }

    public void setAcomodacao(Collection<Acomodacao> acomodacao) {
        this.acomodacao = acomodacao;
    }

}
