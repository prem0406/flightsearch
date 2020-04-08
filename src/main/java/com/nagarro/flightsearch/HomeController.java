package com.nagarro.flightsearch;

import java.text.ParseException;
import java.time.format.DateTimeParseException;
import java.util.Collections;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.nagarro.flightsearch.model.Flight;
import com.nagarro.flightsearch.service.FlightSearchService;
import com.nagarro.flightsearch.service.ReadCSVService;
import com.nagarro.flightsearch.util.SortByFare;
import com.nagarro.flightsearch.util.SortByFareNDuration;

@Controller
public class HomeController {
	
	@Autowired
	FlightSearchService flightSearchService;
	
	@Autowired
	ReadCSVService readCSVService;
	
	@RequestMapping("/")
	public ModelAndView home() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("index");
		readCSVService.readCSV();
		return mv;

	}

	@RequestMapping("getFlight")
	public ModelAndView seachParam(@RequestParam String deploc, @RequestParam String arrloc, @RequestParam String fdate, @RequestParam String fclass, @RequestParam String outputpref) throws DateTimeParseException, ParseException {
		ModelAndView mv = new ModelAndView();
		List<Flight> resultList = flightSearchService.searchFlights(deploc,arrloc,fdate,fclass);
		
//		if (outputpref.equalsIgnoreCase("E")) {
//			System.out.println("in First" + outputpref);
//			SortByFare sortByFare = new SortByFare();
//			Collections.sort(resultList, sortByFare);
//		} else {
//			SortByFareNDuration sortByFareNDuration = new SortByFareNDuration();
//			Collections.sort(resultList, sortByFareNDuration);
//			System.out.println("in Second" + outputpref);
//		}
		
		mv.addObject("result", resultList);
		mv.setViewName("index");
		return mv;
	}
	
	
}
