package com.ams.fare.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ams.fare.entity.Fare;

public interface FaresRepository extends JpaRepository<Fare, Long>
{
    Fare getFareByFlightNumberAndFlightDate(String flightNumber, String flightDate);
}
