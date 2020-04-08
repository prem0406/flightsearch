package com.nagarro.flightsearch.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.nagarro.flightsearch.model.Flight;

@Component
public interface FlightDao {
	
	public void addFlight(Flight flight);
	public List<Flight> searchFlights(String deploc, String arrloc, String fdate, String fclass);
}
