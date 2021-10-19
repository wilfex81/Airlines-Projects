package com.codewithflex.service;

import java.util.List;

import com.codewithflex.model.Flights;

public interface FlightsService {
    

	List<Flights> getAllFlights();
	Flights getFlightListById(Long id);
}
