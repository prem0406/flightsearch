package com.nagarro.flightsearch.util;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.nagarro.flightsearch.model.Flight;


public class SortFlights {

	public static List<Flight> sortByFare(List<Flight> list) {
		Collections.sort(list, new SortByFareComp());
		return list;
	}
	
	public static List<Flight> sortByFareNDurr(List<Flight> list) {
		Collections.sort(list, new SortByFareNDurrComp());
		return list;
	}

}

class SortByFareNDurrComp implements Comparator<Flight> {

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

class SortByFareComp implements Comparator<Flight> {

	@Override
	public int compare(Flight o1, Flight o2) {

		return (int) (o1.getFare() - o2.getFare());
	}

}
