package com.example.reservation.service;

import com.example.reservation.entities.PaymentMethod;
import com.example.reservation.repository.AddressRepository;
import com.example.reservation.repository.PaymentMethodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentMethodService {

    @Autowired
    private PaymentMethodRepository methodRepository;

    public PaymentMethodService(PaymentMethodRepository methodRepository) {
        this.methodRepository = methodRepository;
    }

    public List<PaymentMethod> findAll() {
        return methodRepository.findAll()
    }

    public void save(PaymentMethod paymentMethod) {
        methodRepository.save(paymentMethod);
    }

    public void remove(PaymentMethod paymentMethod) {
        methodRepository.delete(paymentMethod);
    }
}
