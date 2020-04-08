package com.nagarro.flightsearch.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nagarro.flightsearch.dao.ReadCSVDao;

@Component
public class ReadCSVService {
	@Autowired
	ReadCSVDao readCSVDaoImpl;
	
	public void readCSV() {
		readCSVDaoImpl.readCSV();
	}
}
