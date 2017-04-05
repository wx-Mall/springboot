package com.qi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeContoller {

	@RequestMapping("/")
	public ModelAndView welcome() {
		ModelAndView view = new ModelAndView("index.html");
		return view;
	}
	
}
