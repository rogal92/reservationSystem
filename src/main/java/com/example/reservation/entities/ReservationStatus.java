package com.example.reservation.entities;

import org.springframework.lang.NonNull;

import javax.persistence.*;

@Entity
@Table(name = "reservation_status")
public class ReservationStatus {

    @Id
    @GeneratedValue
    @NonNull
    @Column(name = "id_reservation_status")
    private long id;

    @Column(name = "reservation_status")
    private String reservationStatus;

    @NonNull
    public long getId() {
        return id;
    }

    public String getReservationStatus() {
        return reservationStatus;
    }

    public void setReservationStatus(String reservationStatus) {
        this.reservationStatus = reservationStatus;
    }

    @Override
    public String toString() {
        return reservationStatus + "";
    }
}
