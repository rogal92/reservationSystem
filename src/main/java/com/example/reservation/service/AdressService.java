package com.example.reservation.service;

import com.example.reservation.entities.Address;
import com.example.reservation.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdressService {

    @Autowired
    private AddressRepository addressRepository;

    public AdressService(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    public List<Address> findAll() {
       return addressRepository.findAll()
    }

    public void save(Address address) {
        addressRepository.save(address);
    }

    public void remove(Address address) {
        addressRepository.delete(address);
    }
}
