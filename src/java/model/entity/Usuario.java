package model.entity;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "USUARIO")
public class Usuario extends Pessoa implements Serializable {

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idPessoa", referencedColumnName = "idPessoa", table = "USUARIO")
    private Pessoa Pessoa;

    @Column(unique = true, nullable = false, length = 255)
    private String email;

    @Column(nullable = false, length = 255)
    private String senha;

    public Usuario() {
    }

    public Usuario(Pessoa Pessoa, String email, String senha) {
        this.Pessoa = Pessoa;
        this.email = email;
        this.senha = senha;
    }

    public Usuario(Pessoa Pessoa, String email, String senha, Integer id, String nome, String cpf, String telefone) {
        super(id, nome, cpf, telefone);
        this.Pessoa = Pessoa;
        this.email = email;
        this.senha = senha;
    }

    public Usuario(Pessoa Pessoa, String email, String senha, String nome, String cpf, String telefone) {
        super(nome, cpf, telefone);
        this.Pessoa = Pessoa;
        this.email = email;
        this.senha = senha;
    }

    public Usuario(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }

    public Usuario(Integer id, String nome, String cpf, String telefone, String email, String senha) {
        super(id, nome, cpf, telefone);
        this.email = email;
        this.senha = senha;
    }

    public Usuario(String nome, String cpf, String telefone, String email, String senha) {
        super(nome, cpf, telefone);
        this.email = email;
        this.senha = senha;
    }

    public Pessoa getPessoa() {
        return Pessoa;
    }

    public void setPessoa(Pessoa Pessoa) {
        this.Pessoa = Pessoa;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.Pessoa);
        hash = 29 * hash + Objects.hashCode(this.email);
        hash = 29 * hash + Objects.hashCode(this.senha);
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
        final Usuario other = (Usuario) obj;
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.senha, other.senha)) {
            return false;
        }
        if (!Objects.equals(this.Pessoa, other.Pessoa)) {
            return false;
        }
        return true;
    }

}
