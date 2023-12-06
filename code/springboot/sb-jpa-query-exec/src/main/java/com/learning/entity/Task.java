package com.learning.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "task_dtls")
@Entity
public class Task {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "tid")
	private int id;
	private String title;
	@Column(name = "tstat")
	private String status;
	private LocalDate scheduledon;
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public LocalDate getScheduledon() {
		return scheduledon;
	}
	public void setScheduledon(LocalDate scheduledon) {
		this.scheduledon = scheduledon;
	}
}
