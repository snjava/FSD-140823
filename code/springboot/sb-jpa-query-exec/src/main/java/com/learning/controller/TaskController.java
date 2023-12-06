package com.learning.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	public String saveTaskDetails(@RequestBody Task task) {
		repository.save(task);
		return "Task Save Successfully...";
	}
	
	@GetMapping("/get-task-by-id/{id}")
	public Task getTaskById(@PathVariable("id") int id) {
		return repository.findById(id).get();
	}
	
	@GetMapping("/get-task-by-status")
	public List<Task> getTaskByStatus(@RequestParam("status") String status) {
		//return repository.getTaskByStatus_HQL(status);
		return repository.getTaskByStatus_SQL(status);
	}
	
	@GetMapping("/get-task-count-by-status")
	public long getTaskCountByStatus(@RequestParam("status") String status) {
		//return repository.getTaskByStatus_HQL(status);
		return repository.getTaskCountByStatus_SQL(status);
	}
	
	@PutMapping("/update-task-status")
	public String updateTaskStatus(@RequestParam("id") int id,@RequestParam("status") String status) {
		repository.updateTaskStatus(status, id);
		return "Task Updated Successfully...";
	}
}













