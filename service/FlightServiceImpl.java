package com.codewithflex.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codewithflex.model.Flights;
import com.codewithflex.repository.FlightRepository;

@Service
public class FlightServiceImpl implements FlightsService{

	@Autowired
	private FlightRepository flightrepository;
	@Override
	public List<Flights> getAllFlights() {
		
		return  flightrepository.findAll();
	}

	@Override
	public Flights getFlightListById(Long id) {
		
	Optional<Flights> optional =  flightrepository.findById(id);
	Flights flights = null;
	if (optional.isPresent()) {
		flights= optional.get();
	}
		return flights;
	}

}
