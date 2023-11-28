package com.learning.bean;

import org.springframework.stereotype.Component;

@Component
public class Address {
	public int x = 20;
	public Address() {
		System.out.println("Address Object created..");
	}
}
