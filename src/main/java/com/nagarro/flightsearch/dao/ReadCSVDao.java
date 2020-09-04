package com.nagarro.flightsearch.dao;

import org.springframework.stereotype.Component;

@Component
public interface ReadCSVDao {
	public void readCSV(String pathStr);
}
