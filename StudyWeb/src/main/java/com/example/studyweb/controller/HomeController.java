package com.example.studyweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@GetMapping(value = "/")
	public ModelAndView getView() {
		ModelAndView view = new ModelAndView("home");
		
		return view;
	}
}