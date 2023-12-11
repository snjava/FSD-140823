package com.learning.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.learning.entity.Employee;
import com.learning.repository.EmployeeRepository;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeRepository repository;
	
	@PostMapping("/save-employee")
	public String saveEmployee(@RequestBody Employee emp) {
		repository.save(emp);
		return "Employee Save Successfully";
	}
	
	@GetMapping("/get-emp-by-id/{id}")
	public Employee getEmployee(@PathVariable("id") int id) {
		return repository.findById(id).get();
	}
	
}
