package com.learning.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	// http://localhost:8080/welcome-api
	@GetMapping("/welcome-api")
	public String firstApi() {
		return "WELCOME TO FIRST REST API...";
	}
	
}
