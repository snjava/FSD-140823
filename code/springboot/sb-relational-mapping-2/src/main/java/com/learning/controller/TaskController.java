package com.learning.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.learning.entity.Task;
import com.learning.repository.TaskRepository;

@RestController
public class TaskController {

	@Autowired
	private TaskRepository repository;
	
	@PostMapping("/save-task")
	private String saveTask(@RequestBody Task task) {
		repository.save(task);
		return "Task Save Successfully...";
	}
	
	@GetMapping("/get-task-by-id")
	public Task getTask(@RequestParam("id") int id) {
		return repository.findById(id).get();
	}
	
}
