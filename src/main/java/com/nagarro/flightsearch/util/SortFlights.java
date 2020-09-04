package com.nagarro.flightsearch.util;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.nagarro.flightsearch.model.Flight;


public class SortFlights {

	/*
	 * Look at the previous approach of defining separate comparator. It was lengthy.
	 * But new approach (Comparator.comparing) comes with java 8, provide simple look.
	 */
	public static List<Flight> sortByFare(List<Flight> list) {
//		Collections.sort(list, new SortByFareComp());
		Collections.sort(list, Comparator.comparing(Flight::getFare));
		return list;
	}
	
	public static List<Flight> sortByFareNDurr(List<Flight> list) {
//		Collections.sort(list, new SortByFareNDurrComp());
		Collections.sort(list, Comparator.comparing(Flight::getFare)
				.thenComparing(Flight::getFlightDurr));
		return list;
	}

}

/*
 * class SortByFareNDurrComp implements Comparator<Flight> {
 * 
 * @Override public int compare(Flight o1, Flight o2) { int fareComparison =
 * (int) (o1.getFare() - o2.getFare());
 * 
 * return (int) (fareComparison == 0 ? o1.getFlightDurr() - o2.getFlightDurr() :
 * fareComparison);
 * 
 * 
 * }
 * 
 * }
 * 
 * class SortByFareComp implements Comparator<Flight> {
 * 
 * @Override public int compare(Flight o1, Flight o2) {
 * 
 * return (int) (o1.getFare() - o2.getFare()); }
 * 
 * }
 */
