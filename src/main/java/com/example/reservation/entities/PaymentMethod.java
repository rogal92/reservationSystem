package com.example.reservation.entities;

import org.springframework.lang.NonNull;

import javax.persistence.*;

@Entity
@Table(name = "payment_method")
public class PaymentMethod {

    @Id
    @GeneratedValue
    @NonNull
    @Column(name = "id_payment_method")
    private long id;

    @Column(name = "methodName")
    private String methodName;

    @NonNull
    public long getId() {
        return id;
    }

    public String getMethodName() {
        return methodName;
    }

    @Override
    public String toString() {
        return methodName + "";
    }
}
