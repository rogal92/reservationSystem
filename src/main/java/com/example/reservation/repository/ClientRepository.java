package com.example.reservation.repository;

import com.example.reservation.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.QueryHint;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
