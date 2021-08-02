package com.helloWorld;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloWorldController {

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String showLoginPage() {
		return "index";
	}
	
	@RequestMapping(value = "/index", method = RequestMethod.POST)
	public String showHelloWorld() {
		return "helloWorld";
	}
}
