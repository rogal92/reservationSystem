package com.example.reservation.entities;

import org.springframework.lang.NonNull;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "reservation")
public class Reservation {

    @Id
    @GeneratedValue
    @NonNull
    @Column(name = "id_reservation")
    private long id;

    @ManyToOne
    @JoinColumn(name = "id_client")
    private Client client;

    @ManyToOne
    @JoinColumn(name = "id_payment")
    private Payment payment;

    @Column(name = "reservation_date")
    private Date reservationDate;

    @Column(name = "amount")
    private long amount;

    @NonNull
    public long getId() {
        return id;
    }

    public Client getClient() {
        return client;
    }

    public Payment getPayment() {
        return payment;
    }

    public Date getReservationDate() {
        return reservationDate;
    }

    public long getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return client.toString() + " " +
                reservationDate;
    }
}
