package com.nagarro.flightsearch.service;

import java.text.ParseException;
import java.time.format.DateTimeParseException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.nagarro.flightsearch.dao.FlightDao;
import com.nagarro.flightsearch.model.Flight;

@Component
public class FlightSearchService {
	
	@Autowired
	private FlightDao flightDao;
	
	public void addFlight(Flight flight) {
		flightDao.addFlight(flight);
	}
	
	public List<Flight> searchFlights(String deploc, String arrloc, String fdate, String fclass) throws DateTimeParseException, ParseException {
		return flightDao.searchFlights(deploc, arrloc, fdate, fclass);
	}
}
