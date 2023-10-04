package com.demo.student;

public class StudentProgress extends StudentInfo {

	public void printDetailsByObject() {
		StudentInfo info = new  StudentInfo();
		System.out.println("Id : " + info.id);
		System.out.println("Name : " + info.name);
		//System.out.println("Dob : " + info.dob);
		System.out.println("City : " + info.city);
		System.out.println("Contact : " + info.contact);
	}
	
	public void printDetailsByInheritance() {
		System.out.println("Id : " + id);
		System.out.println("Name : " + name);
		//System.out.println("Dob : " + dob);
		System.out.println("City : " + city);
		System.out.println("Contact : " + contact);
	}
}
