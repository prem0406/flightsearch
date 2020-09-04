package com.nagarro.flightsearch.dao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.nagarro.flightsearch.model.Flight;
import com.nagarro.flightsearch.util.StringToDate;
import com.nagarro.flightsearch.util.StringToTime;

@Component
public  class ReadCSVDaoImpl implements ReadCSVDao{
	

	/* This class variable is to store number of csv files present in given directory*/
	static int size = 0;
	
	@Autowired
	FlightDao dao;
	
	@Override
	public void readCSV(String pathStr) {
		pathStr = pathStr.replace("\\", "\\\\");
		System.out.println(pathStr);
//		String pathStr = "C:\\Users\\premkumar\\Downloads\\Application Development";



				try (BufferedReader br = new BufferedReader(new FileReader(pathStr))) {
					String line = "";
					br.readLine();

					while ((line = br.readLine()) != null) {

						String[] data = line.split("\\|");

						Flight flight = new Flight();

						if (data.length > 0) {

							flight.setFlightNo(data[0]);
							flight.setDepLoc(data[1]);
							flight.setArrLoc(data[2]);

							flight.setValidTill(StringToDate.getLocalDate(data[3]));

							flight.setFlightTime(StringToTime.getTime(data[4]));

							flight.setFlightDurr(Double.parseDouble(data[5]));

							flight.setFare(Double.parseDouble(data[6]));
							flight.setSeatAvail(data[7]);
							flight.setCl(data[8]);

						}
						
						try {
							dao.addFlight(flight);
						} catch(Exception e) {
							System.out.println("Exception Caught while adding flight from CSV: " +e);
						}
					}
				} catch (Exception e) {
					System.out.println("Exception :" + e);
				}
			

		

	}


}
