package com.risbo_app.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {
	
	@GetMapping("/home")
	public ModelAndView	home() {
		ModelAndView modelAndView = new ModelAndView("home");
		return modelAndView;
	}
	
	@GetMapping("/contact-us")
	public ModelAndView	contactUs() {
		ModelAndView modelAndView = new ModelAndView("contact-us");
		return modelAndView;
	}
	
	@GetMapping("/manage-students")
	@PreAuthorize("hasAuthority('PROFESSOR')") // Autorise seulement le rôle professeur à acceder à cet page
	public ModelAndView	manageStudents() {
		ModelAndView modelAndView = new ModelAndView("manage-students");
		return modelAndView;
	}
	
	@GetMapping("/access-denied")
	public ModelAndView	accessDenied() {
		ModelAndView modelAndView = new ModelAndView("access-denied");
		return modelAndView;
	}

}
