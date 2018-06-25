package com.example.reservation.entities;

import org.springframework.lang.NonNull;

import javax.persistence.*;
import javax.swing.*;
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

    @Column(name = "reservation_status")
    private ReservationStatus reservationStatus;

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

    public void setId(@NonNull long id) {
        this.id = id;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public void setReservationDate(Date reservationDate) {
        this.reservationDate = reservationDate;
    }

    public void setReservationStatus(ReservationStatus reservationStatus) {
        this.reservationStatus = reservationStatus;
    }

    public void setAmount(JTextField amount) {
        this.amount = amount;
    }

    public ReservationStatus getReservationStatus() {
        return reservationStatus;
    }

    @Override
    public String toString() {
        return client.toString() + " " +
                reservationDate;
    }
}
