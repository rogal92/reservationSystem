package com.example.reservation.service;

import com.example.reservation.entities.TreatmentReservation;
import com.example.reservation.repository.AddressRepository;
import com.example.reservation.repository.TreatmentReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TreatmentReservationService {

    @Autowired
    private TreatmentReservationRepository reservationRepository;

    public TreatmentReservationService(TreatmentReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }

    public List<TreatmentReservation> findAll() {
        return reservationRepository.findAll()
    }

    public void save(TreatmentReservation treatmentReservation) {
        reservationRepository.save(treatmentReservation);
    }

    public void remove(TreatmentReservation treatmentReservation) {
        reservationRepository.delete(treatmentReservation);
    }
}
