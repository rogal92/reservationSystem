package com.example.reservation.entities;

import org.springframework.lang.NonNull;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "payment")
public class Payment {

    @Id
    @GeneratedValue
    @NonNull
    @Column(name = "id")
    private long id;

    @ManyToOne
    @JoinColumn(name = "id_payment_method")
    private PaymentMethod paymentMethod;

    @Column(name = "value")
    private long value;

    @Column(name = "payment_date")
    private Date paymentsDate;

    @NonNull
    public long getId() {
        return id;
    }

    public PaymentMethod getPaymentMethod(PaymentMethod selectedItem) {
        return paymentMethod;
    }

    public long getValue(Long aLong) {
        return value;
    }

    public Date getPaymentsDate() {
        return paymentsDate;
    }

    @Override
    public String toString() {
        return paymentMethod + "";
    }
}
