package com.orsys.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		return new ModelAndView("welcome");
	}
	
	@RequestMapping (value ="/hello" ,method =RequestMethod.GET )
	public String printHello(ModelMap model )
	{
		model.addAttribute("message" ,"Hello Spring MVC Framework!" );
	return "hello" ;
	}
	
}
