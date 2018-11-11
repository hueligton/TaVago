package model.entity;

import java.util.Collection;

public class Reserva {

    private int idReserva;

    private Collection<ItemReserva> itemReserva;

    public Reserva() {
    }

    public Reserva(int idReserva, Collection<ItemReserva> itemReserva) {
        this.idReserva = idReserva;
        this.itemReserva = itemReserva;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public Collection<ItemReserva> getItemReserva() {
        return itemReserva;
    }

    public void setItemReserva(Collection<ItemReserva> itemReserva) {
        this.itemReserva = itemReserva;
    }

}
