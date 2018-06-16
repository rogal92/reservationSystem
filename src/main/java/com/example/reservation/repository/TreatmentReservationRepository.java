package com.example.reservation.repository;

import com.example.reservation.entities.TreatmentReservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TreatmentReservationRepository extends JpaRepository<TreatmentReservation, Long> {
}
