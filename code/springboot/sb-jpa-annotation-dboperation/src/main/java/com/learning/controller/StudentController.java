package com.learning.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.learning.entity.Student;
import com.learning.respository.StudentRepository;

// CURD Operation
@RestController
public class StudentController {

	@Autowired
	private StudentRepository repository;
	
	@PostMapping("/save-student")
	public String saveStudent(@RequestBody Student student) {
		repository.save(student); // Use For insert or update operation
		return "Student Save Successfully...";
	}
	
	@GetMapping("/get-all-student")
	public List<Student> getAllStudent() {
		return repository.findAll(); // Use for select all rows operation
	}
	
	@DeleteMapping("/delete-student-by-id")
	public String deleteStudent(@RequestParam("id") int id) {
		repository.deleteById(id); // Use For Delete the record by PK column
		return "Student Deleted Successfully...";
	}
	
	@PutMapping("/update-studet")
	public String updateStudent(@RequestBody Student student) {
		repository.save(student); // Use For insert or update operation
		return "Student Updated Successfully...";
	}
}















