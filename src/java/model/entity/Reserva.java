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
@Table(name = "RESERVA")
public class Reserva implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "reserva_sequence")
    @SequenceGenerator(name = "reserva_sequence", sequenceName = "reserva_seq", allocationSize = 1)
    @Column(nullable = false)
    private Integer idReserva;

    @OneToMany
    private Collection<ItemReserva> itemReserva;

    public Reserva() {
    }

    public Reserva(Integer idReserva, Collection<ItemReserva> itemReserva) {
        this.idReserva = idReserva;
        this.itemReserva = itemReserva;
    }

    public Integer getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(Integer idReserva) {
        this.idReserva = idReserva;
    }

    public Collection<ItemReserva> getItemReserva() {
        return itemReserva;
    }

    public void setItemReserva(Collection<ItemReserva> itemReserva) {
        this.itemReserva = itemReserva;
    }

}
