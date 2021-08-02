package com.simple;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class siController {

	@RequestMapping(value = "/SIcalculator", method = RequestMethod.GET)
	public String showLoginPage() {
		return "simpleInterest";
	}

	@RequestMapping(value = "/SIcalculator", method = RequestMethod.POST)
	public String handleUserLogin(ModelMap model, 
			@RequestParam double principal,
			@RequestParam double rate,
			@RequestParam double time) {
			double SI = principal*rate*time;
			model.put("SI", SI);
		
			return "showSI";
		
	}
}
