package com.nagarro.flightsearch;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.nagarro.flightsearch.model.User;
import com.nagarro.flightsearch.service.AdminService;
import com.nagarro.flightsearch.service.UserService;

@Controller
public class AuthController {

	@Autowired
	UserService userService;
	
	@Autowired
	AdminService adminService;
	
	@PostMapping("/SignIn") 
	public ModelAndView signIn(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mv = new ModelAndView();
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		
		if (!userService.validateUser(userName, password)) {
			mv.setViewName("loginPage");
			return mv;
		}

		mv.setViewName("index");

		return mv;

	}
	
	
	@PostMapping("/adminSignIn") 
	public ModelAndView adminSignIn(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mv = new ModelAndView();
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		
		if (!adminService.validateAdmin(userName, password)) {
			mv.setViewName("admin-login");
			return mv;
		}

		mv.setViewName("admin-home");

		return mv;

	}
	
	@RequestMapping("register")
	public ModelAndView register() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("register");
		return mv;
	}
	
	@PostMapping("/register-user")
	public ModelAndView registerUser(HttpServletRequest request, HttpServletResponse response) {
		
		
		ModelAndView mv = new ModelAndView();
		String name = request.getParameter("name");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		User user = new User();
		user.setName(name);
		user.setUserName(username);
		user.setPassword(password);
		userService.add(user);
		
		mv.setViewName("loginPage");
		return mv;
	}
	
	
}
