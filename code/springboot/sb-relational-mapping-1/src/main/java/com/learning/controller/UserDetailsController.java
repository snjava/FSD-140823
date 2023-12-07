package com.learning.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.learning.entity.UserDetails;
import com.learning.repository.UserDetailsRepository;

@RestController
public class UserDetailsController {
	@Autowired
	private UserDetailsRepository repository;
	
	@PostMapping("/save-user-details")
	public String saveUserDetails(@RequestBody UserDetails details) {
		repository.save(details);
		return "User Save SUccessfully..";
	}
	
	@GetMapping("/get-user-by-id")
	public UserDetails getUserDetails(@RequestParam("id") int id) {
		return repository.findById(id).get();
	}
}
