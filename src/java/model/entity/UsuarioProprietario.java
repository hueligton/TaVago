package model.entity;

import java.util.Collection;

public class UsuarioProprietario extends Usuario {

    private Collection<Hotel> hotel;

    public UsuarioProprietario() {
    }

    public UsuarioProprietario(Collection<Hotel> hotel) {
        this.hotel = hotel;
    }

    public UsuarioProprietario(Collection<Hotel> hotel, String email, String senha) {
        super(email, senha);
        this.hotel = hotel;
    }

    public Collection<Hotel> getHotel() {
        return hotel;
    }

    public void setHotel(Collection<Hotel> hotel) {
        this.hotel = hotel;
    }
}
