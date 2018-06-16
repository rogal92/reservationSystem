package com.example.reservation.entities;

import org.springframework.lang.NonNull;

import javax.persistence.*;

@Entity
@Table(name = "treatment")
public class Treatment {

    @Id
    @GeneratedValue
    @NonNull
    @Column(name = "id_treatment")
    private long id;

    @ManyToOne
    @JoinColumn(name = "id_treatment_type")
    private TreatmentType treatmentType;

    @Column(name = "treatment_name")
    private String treatmentName;

    @NonNull
    public long getId() {
        return id;
    }

    public TreatmentType getTreatmentType() {
        return treatmentType;
    }

    public String getTreatmentName() {
        return treatmentName;
    }

    @Override
    public String toString() {
        return treatmentName + " " +
                treatmentType;
    }
}
