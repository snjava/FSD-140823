package com.learning.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.learning.dto.Operation;
import com.learning.service.MathOpearationService;

@RestController
public class UserInputController {

	@Autowired
	MathOpearationService service;
	
	// accept 2 numbers and Math Operation (add/sub/mul/div) 
	// http://localhost:8080/get-by-request-param?n1=22&n2=33&option=add
	@GetMapping("/get-by-request-param")
	public String getByRequestParameter(@RequestParam("n1") double num1, 
			@RequestParam("n2")double num2, 
			@RequestParam("option") String operation) {
		return service.operation(num1, num2, operation);
	}
	
	// http://localhost:8080/get-by-path-variable/22/33/add
	@GetMapping("/get-by-path-variable/{n1}/{n2}/{opt}")
	public String getByPathVaraible(@PathVariable("n1") double n1,
			@PathVariable("n2") double n2, 
			@PathVariable("opt") String operation) {
		return service.operation(n1, n2, operation);
	}
	
	/*
	    {
	    	"num1":22,
	    	"num2":33,
	    	"opt":"Add"
	    }
	    // http://localhost:8080/get-by-json
	 */
	@GetMapping("/get-by-json")
	public String getByJson(@RequestBody Operation operation) {
		return service.operation(operation.getNum1(), operation.getNum2(), operation.getOpt());
	}
	
}


