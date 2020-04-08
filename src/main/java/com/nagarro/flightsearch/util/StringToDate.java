package com.nagarro.flightsearch.util;

import java.text.ParseException;

import java.time.LocalDate;

import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;


public class StringToDate {
	public static LocalDate getDate(String strDate) throws ParseException,DateTimeParseException {

		LocalDate ldate = LocalDate.parse(strDate , DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		
		return ldate;
	}
	
	public static LocalDate getDateShlash(String strDate) throws ParseException,DateTimeParseException {

		LocalDate ldate = LocalDate.parse(strDate , DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		
		return ldate;
	}
}

