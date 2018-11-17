package model.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "USUARIO", schema = "TaVagoDB")
public class Usuario extends Pessoa implements Serializable {

    @Column(nullable = false, length = 255)
    private String email;

    @Column(nullable = false, length = 255)
    private String senha;

    public Usuario() {
    }
  
    public Usuario(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }

    public Usuario(int id, String nome, long cpf, int telefone, String email, String senha) {
        super(id, nome, cpf, telefone);
        this.email = email;
        this.senha = senha;
    }

    public Usuario(String nome, long cpf, int telefone, String email, String senha) {
        super(nome, cpf, telefone);
        this.email = email;
        this.senha = senha;
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

}
