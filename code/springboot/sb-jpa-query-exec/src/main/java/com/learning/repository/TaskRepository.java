package com.learning.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.learning.entity.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Integer>{
	
	// HQL: SELECT t FROM Task t WHERE status='Completed'
	// SQL: SELECT * FROM task_dtls WHERE tstat='Completed'
	@Query(value = "SELECT t FROM Task t WHERE status= :st")
	List<Task> getTaskByStatus_HQL(@Param("st") String status);
	
	@Query(value = "SELECT * FROM task_dtls WHERE tstat= :st", nativeQuery = true)
	List<Task> getTaskByStatus_SQL(@Param("st") String status);
	
	
	@Query(value = "SELECT count(t) FROM Task t WHERE status= :st")
	long getTaskCountByStatus_HQL(@Param("st") String status);
	
	@Query(value = "SELECT count(*) FROM task_dtls WHERE tstat= :st", nativeQuery = true)
	long getTaskCountByStatus_SQL(@Param("st") String status);
	
	// SQL: UPDATE task_dtls SET tstat=? WHERE tid=?
	@Modifying
	@Transactional
	@Query(value = "UPDATE Task SET status= :st WHERE id= :i")
	public void updateTaskStatus(@Param("st") String status,@Param("i") int id);
	
	
}













