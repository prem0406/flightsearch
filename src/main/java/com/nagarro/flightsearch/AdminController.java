package com.nagarro.flightsearch;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.nagarro.flightsearch.service.ReadCSVService;

@Controller
public class AdminController {
	
	@Autowired
	ReadCSVService readCSVService;
	
	@RequestMapping("/admin-login")
	public ModelAndView adminLogin() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("admin-login");
		return mv;
	}
	
	@RequestMapping("/admin-home")
	public ModelAndView register() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("admin-home");
		return mv;
	}
	
	@PostMapping("upload")
	public ModelAndView upload(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mv = new ModelAndView();
		String pathStr = request.getParameter("file");
		readCSVService.readCSV(pathStr);
		mv.addObject("msg", "Uploaded Succesfully!");
		mv.setViewName("admin-home");
		return mv;
	}
}
