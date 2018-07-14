package com.example.reservation.service;

import com.example.reservation.entities.Client;
import com.example.reservation.repository.AddressRepository;
import com.example.reservation.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public List<Client> findAll() {
        return clientRepository.findAll()
    }

    public void save(Client client) {
        clientRepository.save(client);
    }

    public void remove(Client client) {
        clientRepository.delete(client);
    }
}
