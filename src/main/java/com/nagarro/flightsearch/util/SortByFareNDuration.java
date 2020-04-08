package com.nagarro.flightsearch.util;

import java.util.Comparator;

import com.nagarro.flightsearch.model.Flight;


public class SortByFareNDuration implements Comparator<Flight> {

	@Override
	public int compare(Flight o1, Flight o2) {
		if (o1.getFare() - o2.getFare() == 0) {
			if (o1.getFlightDurr() < o2.getFlightDurr()) return -1;
	        if (o1.getFlightDurr() > o2.getFlightDurr()) return 1;
	        return 0;
		} else {
			return (int) (o1.getFare() - o2.getFare());
		}
			
	}

}
