package com.example.reservation.service;

import com.example.reservation.entities.Address;
import com.example.reservation.entities.Reservation;
import com.example.reservation.repository.AddressRepository;
import com.example.reservation.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationService {

    @Autowired
    private ReservationRepository reservationRepository

    public ReservationService(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }

    public List<Reservation> findAll() {
        return reservationRepository.findAll()
    }

    public void save(Reservation reservation) {
        reservationRepository.save(reservation);
    }

    public void remove(Reservation reservation) {
        reservationRepository.delete(reservation);
    }
}
