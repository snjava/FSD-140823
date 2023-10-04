package com.demo.student;

public class StudentInfo {
	public int id;
	public String name;
	private String dob;
	String city;
	protected String contact;
	
	public void printDetails() {
		System.out.println("Id : " + id);
		System.out.println("Name : " + name);
		System.out.println("Dob : " + dob);
		System.out.println("City : " + city);
		System.out.println("Contact : " + contact);
	}
}
