package model.entity;

import java.util.Collection;

public class UsuarioHospede extends Usuario {

    private Cartao cartao;

    private Collection<Reserva> reserva;

    public UsuarioHospede() {
    }

    public UsuarioHospede(Cartao cartao, Collection<Reserva> reserva) {
        this.cartao = cartao;
        this.reserva = reserva;
    }

    public UsuarioHospede(String email, String senha, Cartao cartao, Collection<Reserva> reserva) {
        super(email, senha);
        this.cartao = cartao;
        this.reserva = reserva;
    }

    public UsuarioHospede(int id, String nome, long cpf, int telefone, String email, String senha, Cartao cartao, Collection<Reserva> reserva) {
        super(id, nome, cpf, telefone, email, senha);
        this.cartao = cartao;
        this.reserva = reserva;
    }

    public UsuarioHospede(String nome, long cpf, int telefone, String email, String senha, Cartao cartao, Collection<Reserva> reserva) {
        super(nome, cpf, telefone, email, senha);
        this.cartao = cartao;
        this.reserva = reserva;
    }

    public Cartao getCartao() {
        return cartao;
    }

    public void setCartao(Cartao cartao) {
        this.cartao = cartao;
    }

    public Collection<Reserva> getReserva() {
        return reserva;
    }

    public void setReserva(Collection<Reserva> reserva) {
        this.reserva = reserva;
    }
}
