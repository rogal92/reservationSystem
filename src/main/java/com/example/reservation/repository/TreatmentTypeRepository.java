package com.example.reservation.repository;

import com.example.reservation.entities.TreatmentType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TreatmentTypeRepository extends JpaRepository<TreatmentType, Long> {
}
