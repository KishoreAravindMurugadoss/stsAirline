package com.airlines_app002.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.airlines_app002.entity.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {

}
