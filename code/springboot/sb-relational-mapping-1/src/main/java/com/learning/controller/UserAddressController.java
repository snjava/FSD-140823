package com.learning.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.learning.entity.UserAddress;
import com.learning.repository.UserAddressRepository;

@RestController
public class UserAddressController {
	@Autowired
	private UserAddressRepository repository;
	
	@PostMapping("/save-user-address")
	public String saveAddress(@RequestBody UserAddress address) {
		repository.save(address);
		return "User Address Save Successfully..";
	}
	
	@GetMapping("/get-address-by-id")
	public UserAddress getUserAddress(@RequestParam("id") int id) {
		return repository.findById(id).get();
	}
}
