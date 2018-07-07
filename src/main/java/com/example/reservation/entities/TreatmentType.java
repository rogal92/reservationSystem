package com.example.reservation.entities;

import org.springframework.lang.NonNull;

import javax.persistence.*;

@Entity
@Table(name = "treatment_type")
public class TreatmentType {

    @Id
    @GeneratedValue
    @NonNull
    @Column(name = "id_treatment_type")
    private long id;

    @Column(name = "treatment_description")
    private String treatmentDescription;

    @NonNull
    public long getId() {
        return id;
    }

    public String getTreatmentDescription() {
        return treatmentDescription;
    }

    public void setTreatmentDescription(String treatmentDescription) {
        this.treatmentDescription = treatmentDescription;
    }

    @Override
    public String toString() {
        return treatmentDescription;
    }
}
