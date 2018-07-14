package com.example.reservation.service;

import com.example.reservation.entities.Payment;
import com.example.reservation.repository.AddressRepository;
import com.example.reservation.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;

    public PaymentService(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    public List<Payment> findAll() {
        return paymentRepository.findAll()
    }

    public void save(Payment payment) {
        paymentRepository.save(payment);
    }

    public void remove(Payment payment) {
        paymentRepository.delete(payment);
    }
}
