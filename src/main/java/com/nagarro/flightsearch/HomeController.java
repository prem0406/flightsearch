package com.nagarro.flightsearch;

import java.text.ParseException;
import java.time.format.DateTimeParseException;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.nagarro.flightsearch.model.Flight;
import com.nagarro.flightsearch.service.FlightSearchService;
import com.nagarro.flightsearch.service.ReadCSVService;
import com.nagarro.flightsearch.util.SortFlights;

@Controller
public class HomeController {

	@Autowired
	FlightSearchService flightSearchService;

	

	@RequestMapping("login")
	public String loginPage() {
		return "loginPage";
	}
	
	@RequestMapping("/") 
	public ModelAndView home() 
	{ 
		ModelAndView mv = new ModelAndView(); 
	  mv.setViewName("home"); 
	  return mv;
  
  }
	 

	@RequestMapping("getFlight")
	public ModelAndView seachParam(@RequestParam String deploc, @RequestParam String arrloc, @RequestParam String fdate,
			@RequestParam String fclass, @RequestParam String outputpref)
			throws DateTimeParseException, ParseException {
		ModelAndView mv = new ModelAndView();
		List<Flight> resultList = flightSearchService.searchFlights(deploc, arrloc, fdate, fclass);

		try {
			List<Flight> sortedResultList = Optional.of(outputpref).filter(f -> f.equals("fare")).map(e->SortFlights.sortByFare(resultList))
					.orElseGet(() -> SortFlights.sortByFareNDurr(resultList));
			
			mv.addObject("result", sortedResultList);
			
		} catch (NullPointerException e) {
			System.out.println("Output Prefrence is null ! "+e);
		}
		
		
		mv.setViewName("index");
		return mv;
	}

}
