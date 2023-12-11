package com.learning.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Task {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int id;
	private String title;
	private LocalDate scheduleddt;
	private String status;
	
	@JsonBackReference
	@JoinColumn(name = "eid")
	@ManyToOne
	private Employee employee;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public LocalDate getScheduleddt() {
		return scheduleddt;
	}
	public void setScheduleddt(LocalDate scheduleddt) {
		this.scheduleddt = scheduleddt;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
}
