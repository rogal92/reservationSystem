package com.example.reservation.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "treatment_reservation")
public class TreatmentReservation {

    @ManyToOne
    @JoinColumn(name = "id_treatment")
    private Treatment treatment;

    @ManyToOne
    @JoinColumn(name = "id_reservation")
    private Reservation reservation;

    @Column(name = "treatment_price")
    private long treatmentPrice;

    public TreatmentReservation(Treatment treatment, Reservation reservation) {
        this.treatment = treatment;
        this.reservation = reservation;
    }

    public TreatmentReservation() {}

    public Treatment getTreatment() {
        return treatment;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public long getTreatmentPrice() {
        return treatmentPrice;
    }

    public void setTreatmentPrice(long treatmentPrice) {
        this.treatmentPrice = treatmentPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TreatmentReservation that = (TreatmentReservation) o;
        return Objects.equals(treatment, that.treatment) &&
                Objects.equals(reservation, that.reservation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(treatment, reservation);
    }
}
