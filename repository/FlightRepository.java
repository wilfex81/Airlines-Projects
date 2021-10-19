package com.codewithflex.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codewithflex.model.Flights;

@Repository
public interface FlightRepository extends JpaRepository<Flights, Long>{

}
