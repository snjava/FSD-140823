package com.learning.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.learning.dto.Employee;
import com.learning.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService service;
	
	@PostMapping("/save-emp")
	public String saveEmployee(@RequestBody Employee employee) {
		service.addEmployee(employee);
		return "Employee Save Successfully..";
	}
	
	@GetMapping("/get-emp-by-id")
	public Employee getEmpById(@RequestParam("eid") int id) {
		return service.getEmpById(id);
	}
	
	@PutMapping("/update-emp/{eid}/{email}")
	public String updateEmployee(@PathVariable("eid") int id,@PathVariable("email") String email) {
		service.updateEmpById(id, email);
		return "Employee Info updated successfully..";
	}
	
	@DeleteMapping("/delete-emp")
	public String deleteById(@RequestParam("eid") int id) {
		service.deleteEmpById(id);
		return "Employee Deleted Successfully...";
	}
	
}
