package com.nagarro.flightsearch.util;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class StringToTime {
	public static LocalTime getTime(String strTime) throws Exception {
		
		LocalTime lt = LocalTime.parse(strTime, DateTimeFormatter.ofPattern("HHmm"));
		return lt;
		
	}
}
