package model.entity;

import java.util.Collection;

public class Reserva {

    private int idReserva;

    private UsuarioHospede usuarioHospede;

    private Collection<ItemReserva> itemReserva;

    public Reserva() {
    }

    public Reserva(int idReserva, UsuarioHospede usuarioHospede, Collection<ItemReserva> itemReserva) {
        this.idReserva = idReserva;
        this.usuarioHospede = usuarioHospede;
        this.itemReserva = itemReserva;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public UsuarioHospede getUsuarioHospede() {
        return usuarioHospede;
    }

    public void setUsuarioHospede(UsuarioHospede usuarioHospede) {
        this.usuarioHospede = usuarioHospede;
    }

    public Collection<ItemReserva> getItemReserva() {
        return itemReserva;
    }

    public void setItemReserva(Collection<ItemReserva> itemReserva) {
        this.itemReserva = itemReserva;
    }

}
