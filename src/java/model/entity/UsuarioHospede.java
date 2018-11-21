package model.entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "USUARIOHOSPEDE")
public class UsuarioHospede extends Usuario implements Serializable {

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idPessoa", referencedColumnName = "idPessoa", table = "USUARIO")
    private Pessoa pessoa;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name= "numeroCartao", referencedColumnName = "numeroCartao")
    private Cartao numeroCartao;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idReserva")
    private Collection<Reserva> reserva;

    public UsuarioHospede(model.entity.Pessoa pessoa, Cartao numeroCartao, Collection<Reserva> reserva) {
        this.pessoa = pessoa;
        this.numeroCartao = numeroCartao;
        this.reserva = reserva;
    }

    public UsuarioHospede(model.entity.Pessoa pessoa, Cartao numeroCartao, Collection<Reserva> reserva, String email, String senha) {
        super(email, senha);
        this.pessoa = pessoa;
        this.numeroCartao = numeroCartao;
        this.reserva = reserva;
    }

    public UsuarioHospede(model.entity.Pessoa pessoa, Cartao numeroCartao, Collection<Reserva> reserva, int id, String nome, long cpf, int telefone, String email, String senha) {
        super(id, nome, cpf, telefone, email, senha);
        this.pessoa = pessoa;
        this.numeroCartao = numeroCartao;
        this.reserva = reserva;
    }

    public UsuarioHospede(model.entity.Pessoa pessoa, Cartao numeroCartao, Collection<Reserva> reserva, String nome, long cpf, int telefone, String email, String senha) {
        super(nome, cpf, telefone, email, senha);
        this.pessoa = pessoa;
        this.numeroCartao = numeroCartao;
        this.reserva = reserva;
    }

    public UsuarioHospede() {
    }

    public UsuarioHospede(Cartao cartao, Collection<Reserva> reserva) {
        this.numeroCartao = cartao;
        this.reserva = reserva;
    }

    public UsuarioHospede(String email, String senha, Cartao cartao, Collection<Reserva> reserva) {
        super(email, senha);
        this.numeroCartao = cartao;
        this.reserva = reserva;
    }

    public UsuarioHospede(int id, String nome, long cpf, int telefone, String email, String senha, Cartao cartao, Collection<Reserva> reserva) {
        super(id, nome, cpf, telefone, email, senha);
        this.numeroCartao = cartao;
        this.reserva = reserva;
    }

    public UsuarioHospede(String nome, long cpf, int telefone, String email, String senha, Cartao cartao, Collection<Reserva> reserva) {
        super(nome, cpf, telefone, email, senha);
        this.numeroCartao = cartao;
        this.reserva = reserva;
    }

    public model.entity.Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(model.entity.Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Cartao getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(Cartao numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public Collection<Reserva> getReserva() {
        return reserva;
    }

    public void setReserva(Collection<Reserva> reserva) {
        this.reserva = reserva;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 31 * hash + Objects.hashCode(this.pessoa);
        hash = 31 * hash + Objects.hashCode(this.numeroCartao);
        hash = 31 * hash + Objects.hashCode(this.reserva);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final UsuarioHospede other = (UsuarioHospede) obj;
        if (!Objects.equals(this.pessoa, other.pessoa)) {
            return false;
        }
        if (!Objects.equals(this.numeroCartao, other.numeroCartao)) {
            return false;
        }
        if (!Objects.equals(this.reserva, other.reserva)) {
            return false;
        }
        return true;
    }
    
    
}
