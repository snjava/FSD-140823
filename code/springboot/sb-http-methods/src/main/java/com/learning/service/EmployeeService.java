package com.learning.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.learning.dto.Employee;

@Service
public class EmployeeService {
	private List<Employee> list = new ArrayList<Employee>();
	
	// add employee object into list
	public void addEmployee(Employee emp) {
		list.add(emp);
	}
	
	// to get the employee object from list by id
	public Employee getEmpById(int id) {
		return getEmpObj(id);
	}
	
	// delete the employee object from list by id
	public void deleteEmpById(int id) {
		list.remove(getEmpObj(id));
	}
	
	// to update employee email address by id
	public void updateEmpById(int id, String email) {
		Employee emp = getEmpObj(id);
		if(emp!=null) {
			emp.setEmail(email);
		}
	}
	
	private Employee getEmpObj(int id) {
		for(Employee emp : list) {
			if(emp.getId() == id) {
				return emp;
			}
		}
		return null;
	}
}




