package com.nagarro.flightsearch.util;

import java.util.Comparator;

import com.nagarro.flightsearch.model.Flight;

public class SortByFare implements Comparator<Flight> {

	@Override
	public int compare(Flight o1, Flight o2) {

		return (int) (o1.getFare() - o2.getFare());
	}

}
