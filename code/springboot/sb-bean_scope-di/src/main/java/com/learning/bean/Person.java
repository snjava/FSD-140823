package com.learning.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("singleton")
@Component
public class Person {
	
	@Autowired  // Object class Address class will be injected inside Person class (DI)
	Address address;   // HAS-A
	
	@Qualifier("oracle") // is use to specify the object to be injected if there are more than once object of same class
	@Autowired
	DbConnection dbConn;
	
	public Person() {
		System.out.println("Person Object created...");
	}
	
	public void printProperties() {
		System.out.println("Address class x value : " + address.x);
		System.out.println("Database used : " + dbConn.getDbName());
	}
}
