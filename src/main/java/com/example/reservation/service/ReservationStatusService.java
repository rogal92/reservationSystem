package com.example.reservation.service;

import com.example.reservation.entities.ReservationStatus;
import com.example.reservation.repository.ReservationStatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationStatusService {

    @Autowired
    private ReservationStatusRepository statusRepository;

    public List<ReservationStatus> findAll() {
        return statusRepository.findAll()
    }

    public void save(ReservationStatus reservationStatus) {
        statusRepository.save(reservationStatus);
    }

    public void remove(ReservationStatus reservationStatus) {
        statusRepository.delete(reservationStatus);
    }
}
