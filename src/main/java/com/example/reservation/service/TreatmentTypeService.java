package com.example.reservation.service;

import com.example.reservation.repository.TreatmentTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TreatmentTypeService {

    @Autowired
    private TreatmentTypeRepository treatmentReservation;

    public TreatmentTypeService(TreatmentTypeRepository treatmentReservation) {
        this.treatmentReservation = treatmentReservation;
    }

    public List<com.example.reservation.entities.TreatmentType> findAll() {
        return treatmentReservation.findAll()
    }

    public void save(com.example.reservation.entities.TreatmentType treatmentType) {
        treatmentReservation.save(treatmentType);
    }

    public void remove(com.example.reservation.entities.TreatmentType treatmentType) {
        treatmentReservation.delete(treatmentType);
    }
}
