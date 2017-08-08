package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.service.PeopleService;

@Controller
public class HomeController {
	@Autowired
	private PeopleService peopleService;
	
	@GetMapping("/gg")
	public @ResponseBody String aa() {
		peopleService.gg();
		return "aa";
	}

}
