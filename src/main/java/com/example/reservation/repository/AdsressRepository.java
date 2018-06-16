package com.example.reservation.repository;

import com.example.reservation.entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdsressRepository extends JpaRepository<Address,Long> {
}
