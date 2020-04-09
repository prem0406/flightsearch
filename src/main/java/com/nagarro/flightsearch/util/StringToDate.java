package com.nagarro.flightsearch.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;


public class StringToDate {
	public static Date getDate(String strDate) throws ParseException {

		SimpleDateFormat formatter=new SimpleDateFormat("yyyy-MM-dd"); 
		Date date = formatter.parse(strDate);
		System.out.println("Date "+date);
		return date;
	}
	
	public static LocalDate getDateShlash(String strDate) throws ParseException,DateTimeParseException {

		LocalDate ldate = LocalDate.parse(strDate , DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		
		return ldate;
	}
	
	public static LocalDate getLocalDate(String strDate) {
		
		LocalDate ldate = LocalDate.parse(strDate , DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		return ldate;
	}
}

